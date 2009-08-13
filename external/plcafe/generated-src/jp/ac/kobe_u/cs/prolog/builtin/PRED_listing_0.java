package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.*;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>listing/0</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
public class PRED_listing_0 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("user");

    public PRED_listing_0(Predicate cont) {
        this.cont = cont;
    }

    public PRED_listing_0(){}

    public void setArgument(Term[] args, Predicate cont) {
        this.cont = cont;
    }

    public int arity() { return 0; }

    public String toString() {
        return "listing";
    }

    public Predicate exec(Prolog engine) {
    // listing:-'$listing'(A,user)
        engine.setB0();
    // listing:-['$listing'(A,user)]
        return new PRED_$listing_2(new VariableTerm(engine), s1, cont);
    }
}