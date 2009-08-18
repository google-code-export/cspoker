package jp.ac.kobe_u.cs.prolog.builtin;
import jp.ac.kobe_u.cs.prolog.lang.IllegalTypeException;
import jp.ac.kobe_u.cs.prolog.lang.IntegerTerm;
import jp.ac.kobe_u.cs.prolog.lang.ListTerm;
import jp.ac.kobe_u.cs.prolog.lang.Predicate;
import jp.ac.kobe_u.cs.prolog.lang.Prolog;
import jp.ac.kobe_u.cs.prolog.lang.Term;
import jp.ac.kobe_u.cs.prolog.lang.VariableTerm;
/*
 This file is generated by Prolog Cafe.
 PLEASE DO NOT EDIT!
*/
/**
 <code>'$variables_set'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$variables_set_3 extends Predicate {
    static Predicate _$variables_set_3_top = new PRED_$variables_set_3_top();
    static Predicate _$variables_set_3_var = new PRED_$variables_set_3_var();
    static Predicate _$variables_set_3_var_1 = new PRED_$variables_set_3_var_1();
    static Predicate _$variables_set_3_var_2 = new PRED_$variables_set_3_var_2();
    static Predicate _$variables_set_3_var_3 = new PRED_$variables_set_3_var_3();
    static Predicate _$variables_set_3_var_4 = new PRED_$variables_set_3_var_4();
    static Predicate _$variables_set_3_int = new PRED_$variables_set_3_int();
    static Predicate _$variables_set_3_int_1 = new PRED_$variables_set_3_int_1();
    static Predicate _$variables_set_3_int_2 = new PRED_$variables_set_3_int_2();
    static Predicate _$variables_set_3_int_3 = new PRED_$variables_set_3_int_3();
    static Predicate _$variables_set_3_1 = new PRED_$variables_set_3_1();
    static Predicate _$variables_set_3_2 = new PRED_$variables_set_3_2();
    static Predicate _$variables_set_3_3 = new PRED_$variables_set_3_3();
    static Predicate _$variables_set_3_4 = new PRED_$variables_set_3_4();
    static Predicate _$variables_set_3_5 = new PRED_$variables_set_3_5();

    public Term arg1, arg2, arg3;

    public PRED_$variables_set_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$variables_set_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$variables_set(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        return _$variables_set_3_top;
    }
}

class PRED_$variables_set_3_top extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        engine.setB0();
        return engine.switch_on_term(_$variables_set_3_var, _$variables_set_3_int, _$variables_set_3_int, _$variables_set_3_int, _$variables_set_3_int, _$variables_set_3_var);
    }
}

class PRED_$variables_set_3_var extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$variables_set_3_1, _$variables_set_3_var_1);
    }
}

class PRED_$variables_set_3_var_1 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$variables_set_3_2, _$variables_set_3_var_2);
    }
}

class PRED_$variables_set_3_var_2 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$variables_set_3_3, _$variables_set_3_var_3);
    }
}

class PRED_$variables_set_3_var_3 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$variables_set_3_4, _$variables_set_3_var_4);
    }
}

class PRED_$variables_set_3_var_4 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$variables_set_3_5);
    }
}

class PRED_$variables_set_3_int extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$variables_set_3_1, _$variables_set_3_int_1);
    }
}

class PRED_$variables_set_3_int_1 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$variables_set_3_2, _$variables_set_3_int_2);
    }
}

class PRED_$variables_set_3_int_2 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$variables_set_3_3, _$variables_set_3_int_3);
    }
}

class PRED_$variables_set_3_int_3 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$variables_set_3_5);
    }
}

class PRED_$variables_set_3_1 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
    // '$variables_set'(A,B,B):-var(A),'$builtin_memq'(A,B),!
        Term a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$variables_set'(A,B,B):-['$get_level'(C),var(A),'$builtin_memq'(A,B),'$cut'(C)]
        if (! a2.unify(a3, engine.trail))
            return engine.fail();
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dereference();
        if (! a1.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        p1 = new PRED_$cut_1(a4, cont);
        return new PRED_$builtin_memq_2(a1, a2, p1);
    }
}

class PRED_$variables_set_3_2 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
    // '$variables_set'(A,B,[A|B]):-var(A),!
        Term a1, a2, a3, a4;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$variables_set'(A,B,[A|B]):-['$get_level'(C),var(A),'$cut'(C)]
        a3 = a3.dereference();
        if (a3.isList()){
            Term[] args = {((ListTerm)a3).car(), ((ListTerm)a3).cdr()};
            if (! a1.unify(args[0], engine.trail))
                return engine.fail();
            if (! a2.unify(args[1], engine.trail))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(new ListTerm(a1, a2), engine.trail);
        } else {
            return engine.fail();
        }
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of var(a(1))
        a1 = a1.dereference();
        if (! a1.isVariable()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dereference();
        if (! a4.isInteger()) {
            throw new IllegalTypeException("integer", a4);
        } else {
            engine.cut(((IntegerTerm) a4).intValue());
        }
        //END inline expansion
        return cont;
    }
}

class PRED_$variables_set_3_3 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
    // '$variables_set'(A,B,B):-atomic(A),!
        Term a1, a2, a3, a4;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$variables_set'(A,B,B):-['$get_level'(C),atomic(A),'$cut'(C)]
        if (! a2.unify(a3, engine.trail))
            return engine.fail();
        a4 = new VariableTerm(engine);
        //START inline expansion of $get_level(a(4))
        if (! a4.unify(new IntegerTerm(engine.B0), engine.trail)) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of atomic(a(1))
        a1 = a1.dereference();
        if (! a1.isSymbol() && ! a1.isNumber()) {
            return engine.fail();
        }
        //END inline expansion
        //START inline expansion of $cut(a(4))
        a4 = a4.dereference();
        if (! a4.isInteger()) {
            throw new IllegalTypeException("integer", a4);
        } else {
            engine.cut(((IntegerTerm) a4).intValue());
        }
        //END inline expansion
        return cont;
    }
}

class PRED_$variables_set_3_4 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
    // '$variables_set'([A|B],C,D):-!,'$variables_set'(A,C,E),'$variables_set'(B,E,D)
        Term a1, a2, a3, a4, a5, a6;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$variables_set'([A|B],C,D):-['$neck_cut','$variables_set'(A,C,E),'$variables_set'(B,E,D)]
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
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        a6 = new VariableTerm(engine);
        p1 = new PRED_$variables_set_3(a5, a6, a3, cont);
        engine.aregs[1] = a4;
        engine.aregs[2] = a2;
        engine.aregs[3] = a6;
        engine.cont = p1;
        return _$variables_set_3_top;
    }
}

class PRED_$variables_set_3_5 extends PRED_$variables_set_3 {
    public Predicate exec(Prolog engine) {
    // '$variables_set'(A,B,C):-A=..D,'$variables_set'(D,B,C)
        Term a1, a2, a3, a4;
        Predicate p1;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$variables_set'(A,B,C):-['$univ'(A,D),'$variables_set'(D,B,C)]
        a4 = new VariableTerm(engine);
        p1 = new PRED_$variables_set_3(a4, a2, a3, cont);
        return new PRED_$univ_2(a1, a4, p1);
    }
}
