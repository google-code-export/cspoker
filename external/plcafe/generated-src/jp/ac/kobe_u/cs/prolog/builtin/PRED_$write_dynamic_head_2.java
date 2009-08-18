package jp.ac.kobe_u.cs.prolog.builtin;
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
 <code>'$write_dynamic_head'/2</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$write_dynamic_head_2 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("user");
    static SymbolTerm s2 = SymbolTerm.makeSymbol(":");
    static Predicate _$write_dynamic_head_2_var = new PRED_$write_dynamic_head_2_var();
    static Predicate _$write_dynamic_head_2_var_1 = new PRED_$write_dynamic_head_2_var_1();
    static Predicate _$write_dynamic_head_2_1 = new PRED_$write_dynamic_head_2_1();
    static Predicate _$write_dynamic_head_2_2 = new PRED_$write_dynamic_head_2_2();

    public Term arg1, arg2;

    public PRED_$write_dynamic_head_2(Term a1, Term a2, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        this.cont = cont;
    }

    public PRED_$write_dynamic_head_2(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        this.cont = cont;
    }

    public int arity() { return 2; }

    public String toString() {
        return "$write_dynamic_head(" + arg1 + "," + arg2 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$write_dynamic_head_2_var, _$write_dynamic_head_2_2, _$write_dynamic_head_2_2, _$write_dynamic_head_2_var, _$write_dynamic_head_2_2, _$write_dynamic_head_2_2);
    }
}

class PRED_$write_dynamic_head_2_var extends PRED_$write_dynamic_head_2 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$write_dynamic_head_2_1, _$write_dynamic_head_2_var_1);
    }
}

class PRED_$write_dynamic_head_2_var_1 extends PRED_$write_dynamic_head_2 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$write_dynamic_head_2_2);
    }
}

class PRED_$write_dynamic_head_2_1 extends PRED_$write_dynamic_head_2 {
    public Predicate exec(Prolog engine) {
    // '$write_dynamic_head'(user,A):-!,writeq(A)
        Term a1, a2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$write_dynamic_head'(user,A):-['$neck_cut',writeq(A)]
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
        return new PRED_writeq_1(a2, cont);
    }
}

class PRED_$write_dynamic_head_2_2 extends PRED_$write_dynamic_head_2 {
    public Predicate exec(Prolog engine) {
    // '$write_dynamic_head'(A,B):-write(A),write(:),writeq(B)
        Term a1, a2;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        cont = engine.cont;
    // '$write_dynamic_head'(A,B):-[write(A),write(:),writeq(B)]
        p1 = new PRED_writeq_1(a2, cont);
        p2 = new PRED_write_1(s2, p1);
        return new PRED_write_1(a1, p2);
    }
}
