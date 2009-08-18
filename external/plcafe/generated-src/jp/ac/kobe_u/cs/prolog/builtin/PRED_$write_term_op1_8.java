package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.Arithmetic;
import jp.ac.kobe_u.cs.prolog.lang.BuiltinException;
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
 <code>'$write_term_op1'/8</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$write_term_op1_8 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("fx");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("[]");
    static IntegerTerm si3 = new IntegerTerm(1);
    static SymbolTerm s4 = SymbolTerm.makeSymbol("fy");
    static SymbolTerm s5 = SymbolTerm.makeSymbol("xf");
    static SymbolTerm s6 = SymbolTerm.makeSymbol("yf");
    static SymbolTerm s7 = SymbolTerm.makeSymbol("xfx");
    static SymbolTerm s8 = SymbolTerm.makeSymbol("xfy");
    static SymbolTerm s9 = SymbolTerm.makeSymbol("yfx");
    static Predicate _$write_term_op1_8_sub_1 = new PRED_$write_term_op1_8_sub_1();
    static Predicate _$write_term_op1_8_sub_2 = new PRED_$write_term_op1_8_sub_2();
    static Predicate _$write_term_op1_8_sub_3 = new PRED_$write_term_op1_8_sub_3();
    static Predicate _$write_term_op1_8_sub_4 = new PRED_$write_term_op1_8_sub_4();
    static Predicate _$write_term_op1_8_sub_5 = new PRED_$write_term_op1_8_sub_5();
    static Predicate _$write_term_op1_8_sub_6 = new PRED_$write_term_op1_8_sub_6();
    static Predicate _$write_term_op1_8_1 = new PRED_$write_term_op1_8_1();
    static Predicate _$write_term_op1_8_2 = new PRED_$write_term_op1_8_2();
    static Predicate _$write_term_op1_8_3 = new PRED_$write_term_op1_8_3();
    static Predicate _$write_term_op1_8_4 = new PRED_$write_term_op1_8_4();
    static Predicate _$write_term_op1_8_5 = new PRED_$write_term_op1_8_5();
    static Predicate _$write_term_op1_8_6 = new PRED_$write_term_op1_8_6();
    static Predicate _$write_term_op1_8_7 = new PRED_$write_term_op1_8_7();

    public Term arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8;

    public PRED_$write_term_op1_8(Term a1, Term a2, Term a3, Term a4, Term a5, Term a6, Term a7, Term a8, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        arg4 = a4;
        arg5 = a5;
        arg6 = a6;
        arg7 = a7;
        arg8 = a8;
        this.cont = cont;
    }

    public PRED_$write_term_op1_8(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        arg4 = args[3];
        arg5 = args[4];
        arg6 = args[5];
        arg7 = args[6];
        arg8 = args[7];
        this.cont = cont;
    }

    public int arity() { return 8; }

    public String toString() {
        return "$write_term_op1(" + arg1 + "," + arg2 + "," + arg3 + "," + arg4 + "," + arg5 + "," + arg6 + "," + arg7 + "," + arg8 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.aregs[4] = arg4;
        engine.aregs[5] = arg5;
        engine.aregs[6] = arg6;
        engine.aregs[7] = arg7;
        engine.aregs[8] = arg8;
        engine.cont = cont;
        engine.setB0();
        return engine.jtry(_$write_term_op1_8_1, _$write_term_op1_8_sub_1);
    }
}

class PRED_$write_term_op1_8_sub_1 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$write_term_op1_8_2, _$write_term_op1_8_sub_2);
    }
}

class PRED_$write_term_op1_8_sub_2 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$write_term_op1_8_3, _$write_term_op1_8_sub_3);
    }
}

class PRED_$write_term_op1_8_sub_3 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$write_term_op1_8_4, _$write_term_op1_8_sub_4);
    }
}

class PRED_$write_term_op1_8_sub_4 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$write_term_op1_8_5, _$write_term_op1_8_sub_5);
    }
}

class PRED_$write_term_op1_8_sub_5 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$write_term_op1_8_6, _$write_term_op1_8_sub_6);
    }
}

class PRED_$write_term_op1_8_sub_6 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$write_term_op1_8_7);
    }
}

class PRED_$write_term_op1_8_1 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,fx,[B],C,D,E,F,G):-!,'$write_atom'(A,D,H,F,G),I is C-1,'$write_term0'(B,I,H,E,F,G)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,fx,[B],C,D,E,F,G):-['$neck_cut','$write_atom'(A,D,H,F,G),'$minus'(C,1,I),'$write_term0'(B,I,H,E,F,G)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s1))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a10 = new VariableTerm(engine);
        a11 = new VariableTerm(engine);
        p1 = new PRED_$write_term0_6(a9, a11, a10, a6, a7, a8, cont);
        p2 = new PRED_$minus_3(a4, si3, a11, p1);
        return new PRED_$write_atom_5(a1, a5, a10, a7, a8, p2);
    }
}

class PRED_$write_term_op1_8_2 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,fy,[B],C,D,E,F,G):-!,'$write_atom'(A,D,H,F,G),I is C,'$write_term0'(B,I,H,E,F,G)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,fy,[B],C,D,E,F,G):-['$neck_cut','$write_atom'(A,D,H,F,G),I is C,'$write_term0'(B,I,H,E,F,G)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s4))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s4, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a10 = new VariableTerm(engine);
        a11 = new VariableTerm(engine);
        p1 = new PRED_$write_term0_6(a9, a11, a10, a6, a7, a8, cont);
        p2 = new PRED_is_2(a11, a4, p1);
        return new PRED_$write_atom_5(a1, a5, a10, a7, a8, p2);
    }
}

class PRED_$write_term_op1_8_3 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,xf,[B],C,D,E,F,G):-!,H is C-1,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,xf,[B],C,D,E,F,G):-['$neck_cut','$minus'(C,1,H),'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s5))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s5, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a10 = new VariableTerm(engine);
        //START inline expansion of $minus(a(4),si(3),a(10))
        try {
            if (! a10.unify(Arithmetic.evaluate(a4).subtract(si3), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a11 = new VariableTerm(engine);
        p1 = new PRED_$write_atom_5(a1, a11, a6, a7, a8, cont);
        return new PRED_$write_term0_6(a9, a10, a5, a11, a7, a8, p1);
    }
}

class PRED_$write_term_op1_8_4 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,yf,[B],C,D,E,F,G):-!,H is C,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,yf,[B],C,D,E,F,G):-['$neck_cut',H is C,'$write_term0'(B,H,D,I,F,G),'$write_atom'(A,I,E,F,G)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s6))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s6, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a10 = new VariableTerm(engine);
        //START inline expansion of a(10)is a(4)
        try {
            if (! a10.unify(Arithmetic.evaluate(a4), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a11 = new VariableTerm(engine);
        p1 = new PRED_$write_atom_5(a1, a11, a6, a7, a8, cont);
        return new PRED_$write_term0_6(a9, a10, a5, a11, a7, a8, p1);
    }
}

class PRED_$write_term_op1_8_5 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,xfx,[B,C],D,E,F,G,H):-!,I is D-1,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,xfx,[B,C],D,E,F,G,H):-['$neck_cut','$minus'(D,1,I),'$minus'(D,1,J),'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s7))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s7, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            a10 = args[1];
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            a10 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, a10), engine.trail);
        } else {
            return engine.fail();
        }
        a10 = a10.dereference();
        if (a10.isList()){
            Term[] args = {((ListTerm)a10).car(), ((ListTerm)a10).cdr()};
            a11 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a10.isVariable()){
            a11 = new VariableTerm(engine);
            ((VariableTerm) a10).bind(new ListTerm(a11, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a12 = new VariableTerm(engine);
        //START inline expansion of $minus(a(4),si(3),a(12))
        try {
            if (! a12.unify(Arithmetic.evaluate(a4).subtract(si3), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a13 = new VariableTerm(engine);
        //START inline expansion of $minus(a(4),si(3),a(13))
        try {
            if (! a13.unify(Arithmetic.evaluate(a4).subtract(si3), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a14 = new VariableTerm(engine);
        a15 = new VariableTerm(engine);
        p1 = new PRED_$write_term0_6(a11, a13, a15, a6, a7, a8, cont);
        p2 = new PRED_$write_term_infix_op_5(a1, a14, a15, a7, a8, p1);
        return new PRED_$write_term0_6(a9, a12, a5, a14, a7, a8, p2);
    }
}

class PRED_$write_term_op1_8_6 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,xfy,[B,C],D,E,F,G,H):-!,I is D-1,J is D,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,xfy,[B,C],D,E,F,G,H):-['$neck_cut','$minus'(D,1,I),J is D,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s8))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s8, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            a10 = args[1];
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            a10 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, a10), engine.trail);
        } else {
            return engine.fail();
        }
        a10 = a10.dereference();
        if (a10.isList()){
            Term[] args = {((ListTerm)a10).car(), ((ListTerm)a10).cdr()};
            a11 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a10.isVariable()){
            a11 = new VariableTerm(engine);
            ((VariableTerm) a10).bind(new ListTerm(a11, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a12 = new VariableTerm(engine);
        //START inline expansion of $minus(a(4),si(3),a(12))
        try {
            if (! a12.unify(Arithmetic.evaluate(a4).subtract(si3), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a13 = new VariableTerm(engine);
        //START inline expansion of a(13)is a(4)
        try {
            if (! a13.unify(Arithmetic.evaluate(a4), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a14 = new VariableTerm(engine);
        a15 = new VariableTerm(engine);
        p1 = new PRED_$write_term0_6(a11, a13, a15, a6, a7, a8, cont);
        p2 = new PRED_$write_term_infix_op_5(a1, a14, a15, a7, a8, p1);
        return new PRED_$write_term0_6(a9, a12, a5, a14, a7, a8, p2);
    }
}

class PRED_$write_term_op1_8_7 extends PRED_$write_term_op1_8 {
    public Predicate exec(Prolog engine) {
    // '$write_term_op1'(A,yfx,[B,C],D,E,F,G,H):-!,I is D,J is D-1,'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)
        Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
        Predicate p1, p2;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        a4 = engine.aregs[4];
        a5 = engine.aregs[5];
        a6 = engine.aregs[6];
        a7 = engine.aregs[7];
        a8 = engine.aregs[8];
        cont = engine.cont;
    // '$write_term_op1'(A,yfx,[B,C],D,E,F,G,H):-['$neck_cut',I is D,'$minus'(D,1,J),'$write_term0'(B,I,E,K,G,H),'$write_term_infix_op'(A,K,L,G,H),'$write_term0'(C,J,L,F,G,H)]
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s9))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s9, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            a9 = args[0];
            a10 = args[1];
        } else if (a3.isVariable()){
            a9 = new VariableTerm(engine);
            a10 = new VariableTerm(engine);
            ((VariableTerm) a3).bind(new ListTerm(a9, a10), engine.trail);
        } else {
            return engine.fail();
        }
        a10 = a10.dereference();
        if (a10.isList()){
            Term[] args = {((ListTerm)a10).car(), ((ListTerm)a10).cdr()};
            a11 = args[0];
            if (! s2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a10.isVariable()){
            a11 = new VariableTerm(engine);
            ((VariableTerm) a10).bind(new ListTerm(a11, s2), engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a12 = new VariableTerm(engine);
        //START inline expansion of a(12)is a(4)
        try {
            if (! a12.unify(Arithmetic.evaluate(a4), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a13 = new VariableTerm(engine);
        //START inline expansion of $minus(a(4),si(3),a(13))
        try {
            if (! a13.unify(Arithmetic.evaluate(a4).subtract(si3), engine.trail)) {
                return engine.fail();
            }
        } catch (BuiltinException e) {
            e.goal = this;
            throw e;
        }
        //END inline expansion
        a14 = new VariableTerm(engine);
        a15 = new VariableTerm(engine);
        p1 = new PRED_$write_term0_6(a11, a13, a15, a6, a7, a8, cont);
        p2 = new PRED_$write_term_infix_op_5(a1, a14, a15, a7, a8, p1);
        return new PRED_$write_term0_6(a9, a12, a5, a14, a7, a8, p2);
    }
}
