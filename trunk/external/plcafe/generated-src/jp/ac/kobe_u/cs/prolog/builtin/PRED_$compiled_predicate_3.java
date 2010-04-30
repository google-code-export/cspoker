package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.SymbolTerm;
import jp.ac.kobe_u.cs.prolog.lang.Term;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$compiled_predicate'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$compiled_predicate_3 extends Predicate {

    public Term arg1, arg2, arg3;

    public PRED_$compiled_predicate_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$compiled_predicate_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$compiled_predicate(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
    // '$compiled_predicate'(A,B,C):-'$INSERT_AM'([deref(a(1),a(1)),deref(a(2),a(2)),deref(a(3),a(3))]),'$INSERT'(['\tif(! engine.pcl.definedPredicate(((SymbolTerm)a1).name(), ((SymbolTerm)a2).name(), ((IntegerTerm)a3).intValue()))','\t\treturn engine.fail();'])
        engine.setB0();
        Term a1, a2, a3;
        a1 = arg1;
        a2 = arg2;
        a3 = arg3;
    // '$compiled_predicate'(A,B,C):-['$INSERT_AM'([deref(a(1),a(1)),deref(a(2),a(2)),deref(a(3),a(3))]),'$INSERT'(['\tif(! engine.pcl.definedPredicate(((SymbolTerm)a1).name(), ((SymbolTerm)a2).name(), ((IntegerTerm)a3).intValue()))','\t\treturn engine.fail();'])]
        a1 = a1.dereference();
        a2 = a2.dereference();
        a3 = a3.dereference();
	if(! engine.pcl.definedPredicate(((SymbolTerm)a1).name(), ((SymbolTerm)a2).name(), ((IntegerTerm)a3).intValue()))
		return engine.fail();
        return cont;
    }
}