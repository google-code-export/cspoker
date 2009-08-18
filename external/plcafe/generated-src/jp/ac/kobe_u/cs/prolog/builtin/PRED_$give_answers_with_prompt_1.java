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
 <code>'$give_answers_with_prompt'/1</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$give_answers_with_prompt_1 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s2 = SymbolTerm.makeSymbol(" ? ");
    static IntegerTerm si3 = new IntegerTerm(59);
    static ListTerm s4 = new ListTerm(si3, s1);
    static Predicate _$give_answers_with_prompt_1_var = new PRED_$give_answers_with_prompt_1_var();
    static Predicate _$give_answers_with_prompt_1_var_1 = new PRED_$give_answers_with_prompt_1_var_1();
    static Predicate _$give_answers_with_prompt_1_1 = new PRED_$give_answers_with_prompt_1_1();
    static Predicate _$give_answers_with_prompt_1_2 = new PRED_$give_answers_with_prompt_1_2();

    public Term arg1;

    public PRED_$give_answers_with_prompt_1(Term a1, Predicate cont) {
        arg1 = a1;
        this.cont = cont;
    }

    public PRED_$give_answers_with_prompt_1(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        this.cont = cont;
    }

    public int arity() { return 1; }

    public String toString() {
        return "$give_answers_with_prompt(" + arg1 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$give_answers_with_prompt_1_var, _$give_answers_with_prompt_1_2, _$give_answers_with_prompt_1_2, _$give_answers_with_prompt_1_var, _$give_answers_with_prompt_1_2, _$give_answers_with_prompt_1_2);
    }
}

class PRED_$give_answers_with_prompt_1_var extends PRED_$give_answers_with_prompt_1 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$give_answers_with_prompt_1_1, _$give_answers_with_prompt_1_var_1);
    }
}

class PRED_$give_answers_with_prompt_1_var_1 extends PRED_$give_answers_with_prompt_1 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$give_answers_with_prompt_1_2);
    }
}

class PRED_$give_answers_with_prompt_1_1 extends PRED_$give_answers_with_prompt_1 {
    public Predicate exec(Prolog engine) {
    // '$give_answers_with_prompt'([]):-!
        Term a1;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$give_answers_with_prompt'([]):-['$neck_cut']
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

class PRED_$give_answers_with_prompt_1_2 extends PRED_$give_answers_with_prompt_1 {
    public Predicate exec(Prolog engine) {
    // '$give_answers_with_prompt'(A):-'$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),B\==[59],nl
        Term a1, a2;
        Predicate p1, p2, p3, p4, p5;
        Predicate cont;
        a1 = engine.aregs[1];
        cont = engine.cont;
    // '$give_answers_with_prompt'(A):-['$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),'$inequality_of_term'(B,[59]),nl]
        a2 = new VariableTerm(engine);
        p1 = new PRED_nl_0(cont);
        p2 = new PRED_$inequality_of_term_2(a2, s4, p1);
        p3 = new PRED_read_line_1(a2, p2);
        p4 = new PRED_flush_output_0(p3);
        p5 = new PRED_$fast_write_1(s2, p4);
        return new PRED_$give_an_answer_1(a1, p5);
    }
}
