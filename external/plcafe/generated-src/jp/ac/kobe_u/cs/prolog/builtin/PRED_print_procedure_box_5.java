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
 <code>print_procedure_box/5</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_print_procedure_box_5 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("/", 2);
    static SymbolTerm s2 = SymbolTerm.makeSymbol(":", 2);
    static SymbolTerm s3 = SymbolTerm.makeSymbol("jp.ac.kobe_u.cs.prolog.builtin");
    static SymbolTerm s4 = SymbolTerm.makeSymbol("$current_spypoint", 3);
    static SymbolTerm s5 = SymbolTerm.makeSymbol("+");
    static SymbolTerm s6 = SymbolTerm.makeSymbol(":");
    static SymbolTerm s7 = SymbolTerm.makeSymbol("[]");
    static SymbolTerm s8 = SymbolTerm.makeSymbol("print_procedure_box", 5);
    static SymbolTerm s9 = SymbolTerm.makeSymbol("$leap_flag", 1);
    static SymbolTerm s10 = SymbolTerm.makeSymbol("no");
    static Term[] s11 = {s10};
    static StructureTerm s12 = new StructureTerm(s9, s11);
    static Term[] s13 = {s3, s12};
    static StructureTerm s14 = new StructureTerm(s2, s13);
    static SymbolTerm s15 = SymbolTerm.makeSymbol(" ");
    static Predicate _print_procedure_box_5_sub_1 = new PRED_print_procedure_box_5_sub_1();
    static Predicate _print_procedure_box_5_sub_2 = new PRED_print_procedure_box_5_sub_2();
    static Predicate _print_procedure_box_5_1 = new PRED_print_procedure_box_5_1();
    static Predicate _print_procedure_box_5_2 = new PRED_print_procedure_box_5_2();
    static Predicate _print_procedure_box_5_3 = new PRED_print_procedure_box_5_3();

    public Term arg1, arg2, arg3, arg4, arg5;

    public PRED_print_procedure_box_5(Term a1, Term a2, Term a3, Term a4, Term a5, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        arg5 = a5;
        this.cont = cont;
    }

    public PRED_print_procedure_box_5(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        arg5 = args[4];
        this.cont = cont;
    }

    public int arity() { return 5; }

    public String toString() {
        return "print_procedure_box(" + arg1 + "," + arg2 + "," + arg3 + "," + arg4 + "," + arg5 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.aregs[4] = arg4;
        engine.aregs[5] = arg5;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_print_procedure_box_5_1, _print_procedure_box_5_sub_1);
    }
}

class PRED_print_procedure_box_5_sub_1 extends PRED_print_procedure_box_5 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_print_procedure_box_5_2, _print_procedure_box_5_sub_2);
    }
}

class PRED_print_procedure_box_5_sub_2 extends PRED_print_procedure_box_5 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_print_procedure_box_5_3);
    }
}

class PRED_print_procedure_box_5_1 extends PRED_print_procedure_box_5 {
    public Predicate exec(Prolog engine) {
    // print_procedure_box(A,B,C,D/E,F):-clause('$current_spypoint'(C,D,E),G),!,'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // print_procedure_box(A,B,C,D/E,F):-['$get_level'(G),clause('jp.ac.kobe_u.cs.prolog.builtin':'$current_spypoint'(C,D,E),H),'$cut'(G),'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))]
        a4 = a4.dereference();
        if (a4.isStructure()){
            if (! s1.equals(((StructureTerm)a4).functor()))
                return engine.fail();
            Term[] args = ((StructureTerm)a4).args();
            a6 = args[0];
            a7 = args[1];
        } else if (a4.isVariable()){
            a6 = new VariableTerm(engine);
            a7 = new VariableTerm(engine);
            Term[] args = {a6, a7};
            ((VariableTerm) a4).bind(new StructureTerm(s1, args), engine.trail);
        } else {
            return engine.fail();
        }
        a8 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(8))
        if (! a8.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        Term[] y1 = {a3, a6, a7};
        a9 = new StructureTerm(s4, y1);
        Term[] y2 = {s3, a9};
        a10 = new StructureTerm(s2, y2);
        Term[] y3 = {a3, a2};
        a11 = new StructureTerm(s2, y3);
        a12 = new ListTerm(a11, s7);
        a13 = new ListTerm(s6, a12);
        a14 = new ListTerm(a1, a13);
        a15 = new ListTerm(a5, a14);
        a16 = new ListTerm(s5, a15);
        Term[] y4 = {a6, a7};
        a17 = new StructureTerm(s1, y4);
        Term[] y5 = {a1, a2, a3, a17, a5};
        a18 = new StructureTerm(s8, y5);
        p1 = new PRED_$read_blocked_1(a18, cont);
        p2 = new PRED_$builtin_message_1(a16, p1);
        p3 = new PRED_$cut_1(a8, p2);
        return new PRED_clause_2(a10, new VariableTerm(engine), p3);
    }
}

class PRED_print_procedure_box_5_2 extends PRED_print_procedure_box_5 {
    public Predicate exec(Prolog engine) {
    // print_procedure_box(A,B,C,D,E):-clause('$leap_flag'(no),F),!,'$builtin_message'([' ',E,A,:,C:B]),'$dummy_27_builtins.pl'(B,E,C,G,A,D)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
        Predicate p1, p2, p3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // print_procedure_box(A,B,C,D,E):-['$get_level'(F),clause('jp.ac.kobe_u.cs.prolog.builtin':'$leap_flag'(no),G),'$cut'(F),'$builtin_message'([' ',E,A,:,C:B]),'$dummy_27_builtins.pl'(B,E,C,H,A,D)]
        a6 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(6))
        if (! a6.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        Term[] y1 = {a3, a2};
        a7 = new StructureTerm(s2, y1);
        a8 = new ListTerm(a7, s7);
        a9 = new ListTerm(s6, a8);
        a10 = new ListTerm(a1, a9);
        a11 = new ListTerm(a5, a10);
        a12 = new ListTerm(s15, a11);
        p1 = new PRED_$dummy_27_builtins$002Epl_6(a2, a5, a3, new VariableTerm(engine), a1, a4, cont);
        p2 = new PRED_$builtin_message_1(a12, p1);
        p3 = new PRED_$cut_1(a6, p2);
        return new PRED_clause_2(s14, new VariableTerm(engine), p3);
    }
}

class PRED_print_procedure_box_5_3 extends PRED_print_procedure_box_5 {
    public Predicate exec(Prolog engine) {
    // print_procedure_box(A,B,C,D,E):-true
        Term a1, a2, a3, a4, a5;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        cont = engine.cont;
    // print_procedure_box(A,B,C,D,E):-[]
        return cont;
    }
}
