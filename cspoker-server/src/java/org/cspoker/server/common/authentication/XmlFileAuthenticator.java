package org.cspoker.server.common.authentication;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class XmlFileAuthenticator {

    private static Logger logger = Logger.getLogger(XmlFileAuthenticator.class);

    private volatile HashMap<String, String> passwords;

    public XmlFileAuthenticator() {

	XMLReader xr;
	try {
	    xr = XMLReaderFactory.createXMLReader();
	} catch (SAXException e) {
	    logger.error(e.getMessage(), e);
	    throw new IllegalStateException("Error creating XML parser.");
	}
	DefaultHandler handler = getHandler();
	xr.setContentHandler(handler);
	xr.setErrorHandler(handler);

	InputStream is = getClass().getClassLoader().getResourceAsStream(
		"org/cspoker/server/common/authentication/authentication.xml");
	InputSource source = new InputSource(is);

	try {
	    xr.parse(source);
	} catch (IOException e) {
	    logger.error(e.getMessage(), e);
	    throw new IllegalStateException(
		    "Error reading authentication file: " + e.getMessage());
	} catch (SAXException e) {
	    logger.error(e.getMessage(), e);
	    throw new IllegalStateException("Error parsing XML: "
		    + e.getMessage());
	}
    }

    private DefaultHandler getHandler() {
	return new DefaultHandler() {

	    private StringBuilder sb = new StringBuilder();

	    @Override
	    public void startDocument() throws SAXException {
		passwords = new HashMap<String, String>();
	    }

	    @Override
	    public void characters(char[] ch, int start, int length)
		    throws SAXException {
		sb.append(ch, start, length);
	    }

	    @Override
	    public void startElement(String uri, String localName, String name,
		    Attributes attributes) throws SAXException {
		sb.setLength(0);
	    }

	    private String lastname;

	    @Override
	    public void endElement(String uri, String localName, String name)
		    throws SAXException {
		if (name.equalsIgnoreCase("name")) {
		    lastname = sb.toString();
		} else if (name.equalsIgnoreCase("password")) {
		    passwords.put(lastname, sb.toString());
		    logger.info("Added credentials for " + lastname);
		}
		sb.setLength(0);
	    }
	};
    }

    public boolean hasPassword(String user, String pass) {
	return pass.equals(passwords.get(user));
    }
}