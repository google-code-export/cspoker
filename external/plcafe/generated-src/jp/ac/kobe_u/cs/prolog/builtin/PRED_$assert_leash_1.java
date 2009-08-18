package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.ListTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.StructureTerm;
import jp.ac.kobe_u.cs.prolog.lang.SymbolTerm;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$assert_leash'/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$assert_leash_1 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s2 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s3 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s4 = SymbolTerm.makeSymbol("$current_leash", 1);
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$assert_leash_1_var = new PRED_$assert_leash_1_var();
    static Predicate _$assert_leash_1_var_1 = new PRED_$assert_leash_1_var_1();
    static Predicate _$assert_leash_1_1 = new PRED_$assert_leash_1_1();
    static Predicate _$assert_leash_1_2 = new PRED_$assert_leash_1_2();

    public Term arg1;

    public PRED_$assert_leash_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_$assert_leash_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "$assert_leash(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$assert_leash_1_var, _fail_0, _fail_0, _$assert_leash_1_1, _fail_0, _$assert_leash_1_2);
    }
}

class PRED_$assert_leash_1_var extends PRED_$assert_leash_1 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$assert_leash_1_1, _$assert_leash_1_var_1);
    }
}

class PRED_$assert_leash_1_var_1 extends PRED_$assert_leash_1 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$assert_leash_1_2);
    }
}

class PRED_$assert_leash_1_1 extends PRED_$assert_leash_1 {
    public Predicate exec(Prolog engine) {
    // '$assert_leash'([]):-!
        Term a1;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$assert_leash'([]):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s1))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$assert_leash_1_2 extends PRED_$assert_leash_1 {
    public Predicate exec(Prolog engine) {
    // '$assert_leash'([A|B]):-'$leash_specifier'(A),assertz('$current_leash'(A)),'$assert_leash'(B)
        Term a1, a2, a3, a4, a5;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$assert_leash'([A|B]):-['$leash_specifier'(A),assertz('jp.ac.kobe_u.cs.prolog.builtin':'$current_leash'(A)),'$assert_leash'(B)]
        a1 = a1.dereference();
        if (a1.isList()){
            Term[] args = {((ListTerm)a1).car(), ((ListTerm)a1).cdr()};
            a2 = args[0];
            a3 = args[1];
        } else if (a1.isVariable()){
            a2 = new VariableTerm(engine);
            a3 = new VariableTerm(engine);
            ((VariableTerm) a1).bind(new ListTerm(a2, a3), engine.trail);
        } else {
            return engine.fail();
        }
        Term[] y1 = {a2};
        a4 = new StructureTerm(s4, y1);
        Term[] y2 = {s3, a4};
        a5 = new StructureTerm(s2, y2);
        p1 = new PRED_$assert_leash_1(a3, cont);
        p2 = new PRED_assertz_1(a5, p1);
        return new PRED_$leash_specifier_1(a2, p2);
    }
}
