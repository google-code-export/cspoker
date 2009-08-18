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
 <code>'$builtin_append'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$builtin_append_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static Predicate _$builtin_append_3_top = new PRED_$builtin_append_3_top();
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$builtin_append_3_var = new PRED_$builtin_append_3_var();
    static Predicate _$builtin_append_3_var_1 = new PRED_$builtin_append_3_var_1();
    static Predicate _$builtin_append_3_1 = new PRED_$builtin_append_3_1();
    static Predicate _$builtin_append_3_2 = new PRED_$builtin_append_3_2();

    public Term arg1, arg2, arg3;

    public PRED_$builtin_append_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$builtin_append_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$builtin_append(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        return _$builtin_append_3_top;
    }
}

class PRED_$builtin_append_3_top extends PRED_$builtin_append_3 {
    public Predicate exec(Prolog engine) {
        engine.setB0();
        return engine.switch_on_term(_$builtin_append_3_var, _fail_0, _fail_0, _$builtin_append_3_1, _fail_0, _$builtin_append_3_2);
    }
}

class PRED_$builtin_append_3_var extends PRED_$builtin_append_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$builtin_append_3_1, _$builtin_append_3_var_1);
    }
}

class PRED_$builtin_append_3_var_1 extends PRED_$builtin_append_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$builtin_append_3_2);
    }
}

class PRED_$builtin_append_3_1 extends PRED_$builtin_append_3 {
    public Predicate exec(Prolog engine) {
    // '$builtin_append'([],A,A):-true
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$builtin_append'([],A,A):-[]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s1))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        if (! a2.unify(a3, engine.trail))
            return engine.fail();
        return cont;
    }
}

class PRED_$builtin_append_3_2 extends PRED_$builtin_append_3 {
    public Predicate exec(Prolog engine) {
    // '$builtin_append'([A|B],C,[A|D]):-'$builtin_append'(B,C,D)
        Term a1, a2, a3, a4, a5, a6;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$builtin_append'([A|B],C,[A|D]):-['$builtin_append'(B,C,D)]
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
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            if (! a4.unify(args[0], engine.trail))
                return engine.fail();
            a6 = args[1];
        } else if (a3.isVariable()){
            a6 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a4, a6), engine.trail);
        } else {
            return engine.fail();
        }
        engine.aregs[1] = a5;
        engine.aregs[2] = a2;
        engine.aregs[3] = a6;
        engine.cont = cont;
        return _$builtin_append_3_top;
    }
}
