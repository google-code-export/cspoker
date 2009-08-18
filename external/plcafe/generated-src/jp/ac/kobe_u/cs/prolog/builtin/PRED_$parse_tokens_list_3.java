package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
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
 <code>'$parse_tokens_list'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$parse_tokens_list_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("]");
    static IntegerTerm si3 = new IntegerTerm(999);
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$parse_tokens_list_3_var = new PRED_$parse_tokens_list_3_var();
    static Predicate _$parse_tokens_list_3_var_1 = new PRED_$parse_tokens_list_3_var_1();
    static Predicate _$parse_tokens_list_3_1 = new PRED_$parse_tokens_list_3_1();
    static Predicate _$parse_tokens_list_3_2 = new PRED_$parse_tokens_list_3_2();

    public Term arg1, arg2, arg3;

    public PRED_$parse_tokens_list_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$parse_tokens_list_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$parse_tokens_list(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$parse_tokens_list_3_var, _fail_0, _fail_0, _$parse_tokens_list_3_1, _fail_0, _$parse_tokens_list_3_2);
    }
}

class PRED_$parse_tokens_list_3_var extends PRED_$parse_tokens_list_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$parse_tokens_list_3_1, _$parse_tokens_list_3_var_1);
    }
}

class PRED_$parse_tokens_list_3_var_1 extends PRED_$parse_tokens_list_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$parse_tokens_list_3_2);
    }
}

class PRED_$parse_tokens_list_3_1 extends PRED_$parse_tokens_list_3 {
    public Predicate exec(Prolog engine) {
    // '$parse_tokens_list'([],A,B):-'C'(A,']',B),!
        Term a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$parse_tokens_list'([],A,B):-['$get_level'(C),'C'(A,']',B),'$cut'(C)]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s1))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_$cut_1(a4, cont);
        return new PRED_C_3(a2, s2, a3, p1);
    }
}

class PRED_$parse_tokens_list_3_2 extends PRED_$parse_tokens_list_3 {
    public Predicate exec(Prolog engine) {
    // '$parse_tokens_list'([A|B],C,D):-'$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list_rest'(B,F,D)
        Term a1, a2, a3, a4, a5, a6, a7;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$parse_tokens_list'([A|B],C,D):-['$parse_tokens'(A,999,C,E),'$parse_tokens_skip_spaces'(E,F),'$parse_tokens_list_rest'(B,F,D)]
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
        a6 = new VariableTerm(engine);
        a7 = new VariableTerm(engine);
        p1 = new PRED_$parse_tokens_list_rest_3(a5, a7, a3, cont);
        p2 = new PRED_$parse_tokens_skip_spaces_2(a6, a7, p1);
        return new PRED_$parse_tokens_4(a4, si3, a2, a6, p2);
    }
}
