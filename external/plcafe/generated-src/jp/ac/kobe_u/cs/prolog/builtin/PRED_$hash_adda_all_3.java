package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.ListTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.SymbolTerm;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$hash_adda_all'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$hash_adda_all_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$hash_adda_all_3_var = new PRED_$hash_adda_all_3_var();
    static Predicate _$hash_adda_all_3_var_1 = new PRED_$hash_adda_all_3_var_1();
    static Predicate _$hash_adda_all_3_1 = new PRED_$hash_adda_all_3_1();
    static Predicate _$hash_adda_all_3_2 = new PRED_$hash_adda_all_3_2();

    public Term arg1, arg2, arg3;

    public PRED_$hash_adda_all_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$hash_adda_all_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$hash_adda_all(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$hash_adda_all_3_var, _fail_0, _fail_0, _$hash_adda_all_3_1, _fail_0, _$hash_adda_all_3_2);
    }
}

class PRED_$hash_adda_all_3_var extends PRED_$hash_adda_all_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$hash_adda_all_3_1, _$hash_adda_all_3_var_1);
    }
}

class PRED_$hash_adda_all_3_var_1 extends PRED_$hash_adda_all_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$hash_adda_all_3_2);
    }
}

class PRED_$hash_adda_all_3_1 extends PRED_$hash_adda_all_3 {
    public Predicate exec(Prolog engine) {
    // '$hash_adda_all'([],A,B):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$hash_adda_all'([],A,B):-['$neck_cut']
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

class PRED_$hash_adda_all_3_2 extends PRED_$hash_adda_all_3 {
    public Predicate exec(Prolog engine) {
    // '$hash_adda_all'([A|B],C,D):-'$hash_adda'(C,A,D),'$hash_adda_all'(B,C,D)
        Term a1, a2, a3, a4, a5;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$hash_adda_all'([A|B],C,D):-['$hash_adda'(C,A,D),'$hash_adda_all'(B,C,D)]
        a1 = a1.dereference();
        if (a1.isList()){
            Term[] args = {((ListTerm)a1).car(), ((ListTerm)a1).cdr()};
            a4 = args[0];
            a5 = args[1];
        } else if (a1.isVariable()){
            a4 = new VariableTerm(engine);
            a5 = new VariableTerm(engine);
            ((VariableTerm) a1).bind(new ListTerm(a4, a5), engine.trail);
        } else {
            return engine.fail();
        }
        p1 = new PRED_$hash_adda_all_3(a5, a2, a3, cont);
        return new PRED_$hash_adda_3(a2, a4, a3, p1);
    }
}
