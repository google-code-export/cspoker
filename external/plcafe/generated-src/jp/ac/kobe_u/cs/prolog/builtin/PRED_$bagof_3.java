package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
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
 <code>'$bagof'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$bagof_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("$witness");
    static SymbolTerm s3 = SymbolTerm.makeSymbol("+", 2);
    static SymbolTerm s4 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static Predicate _$bagof_3_sub_1 = new PRED_$bagof_3_sub_1();
    static Predicate _$bagof_3_1 = new PRED_$bagof_3_1();
    static Predicate _$bagof_3_2 = new PRED_$bagof_3_2();

    public Term arg1, arg2, arg3;

    public PRED_$bagof_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$bagof_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$bagof(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$bagof_3_1, _$bagof_3_sub_1);
    }
}

class PRED_$bagof_3_sub_1 extends PRED_$bagof_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$bagof_3_2);
    }
}

class PRED_$bagof_3_1 extends PRED_$bagof_3 {
    public Predicate exec(Prolog engine) {
    // '$bagof'(A,B,C):-'$free_variables_set'(B,A,D),D\==[],!,E=..['$witness'|D],findall(E+A,B,F),'$bagof_instances'(F,E,G),C=G
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1, p2, p3, p4, p5, p6;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$bagof'(A,B,C):-['$get_level'(D),'$free_variables_set'(B,A,E),'$inequality_of_term'(E,[]),'$cut'(D),'$univ'(F,['$witness'|E]),findall(F+A,'jp.ac.kobe_u.cs.prolog.builtin':B,G),'$bagof_instances'(G,F,H),'$unify'(C,H)]
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        a5 = new VariableTerm(engine);
        a6 = new VariableTerm(engine);
        a7 = new ListTerm(s2, a5);
        Term[] y1 = {a6, a1};
        a8 = new StructureTerm(s3, y1);
        Term[] y2 = {s5, a2};
        a9 = new StructureTerm(s4, y2);
        a10 = new VariableTerm(engine);
        a11 = new VariableTerm(engine);
        p1 = new PRED_$unify_2(a3, a11, cont);
        p2 = new PRED_$bagof_instances_3(a10, a6, a11, p1);
        p3 = new PRED_findall_3(a8, a9, a10, p2);
        p4 = new PRED_$univ_2(a6, a7, p3);
        p5 = new PRED_$cut_1(a4, p4);
        p6 = new PRED_$inequality_of_term_2(a5, s1, p5);
        return new PRED_$free_variables_set_3(a2, a1, a5, p6);
    }
}

class PRED_$bagof_3_2 extends PRED_$bagof_3 {
    public Predicate exec(Prolog engine) {
    // '$bagof'(A,B,C):-findall(A,B,C),C\==[]
        Term a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$bagof'(A,B,C):-[findall(A,'jp.ac.kobe_u.cs.prolog.builtin':B,C),'$inequality_of_term'(C,[])]
        Term[] y1 = {s5, a2};
        a4 = new StructureTerm(s4, y1);
        p1 = new PRED_$inequality_of_term_2(a3, s1, cont);
        return new PRED_findall_3(a1, a4, a3, p1);
    }
}
