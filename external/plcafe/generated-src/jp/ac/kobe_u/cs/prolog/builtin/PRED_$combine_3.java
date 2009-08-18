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
 <code>'$combine'/3</code> defined in builtins.pl<br>
 @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 @version 1.0
*/
class PRED_$combine_3 extends Predicate {
    static SymbolTerm s1 = SymbolTerm.makeSymbol("<");
    static SymbolTerm s2 = SymbolTerm.makeSymbol("=<");
    static SymbolTerm s3 = SymbolTerm.makeSymbol(">");
    static SymbolTerm s4 = SymbolTerm.makeSymbol(">=");
    static SymbolTerm s5 = SymbolTerm.makeSymbol("=");
    static Predicate _fail_0 = new PRED_fail_0();
    static Predicate _$combine_3_var = new PRED_$combine_3_var();
    static Predicate _$combine_3_var_1 = new PRED_$combine_3_var_1();
    static Predicate _$combine_3_var_2 = new PRED_$combine_3_var_2();
    static Predicate _$combine_3_var_3 = new PRED_$combine_3_var_3();
    static Predicate _$combine_3_var_4 = new PRED_$combine_3_var_4();
    static Predicate _$combine_3_var_5 = new PRED_$combine_3_var_5();
    static Predicate _$combine_3_var_6 = new PRED_$combine_3_var_6();
    static Predicate _$combine_3_var_7 = new PRED_$combine_3_var_7();
    static Predicate _$combine_3_con = new PRED_$combine_3_con();
    static Predicate _$combine_3_con_0 = new PRED_$combine_3_con_0();
    static Predicate _$combine_3_con_0_1 = new PRED_$combine_3_con_0_1();
    static Predicate _$combine_3_con_1 = new PRED_$combine_3_con_1();
    static Predicate _$combine_3_con_1_1 = new PRED_$combine_3_con_1_1();
    static Predicate _$combine_3_con_2 = new PRED_$combine_3_con_2();
    static Predicate _$combine_3_con_2_1 = new PRED_$combine_3_con_2_1();
    static Predicate _$combine_3_con_2_2 = new PRED_$combine_3_con_2_2();
    static Predicate _$combine_3_1 = new PRED_$combine_3_1();
    static Predicate _$combine_3_2 = new PRED_$combine_3_2();
    static Predicate _$combine_3_3 = new PRED_$combine_3_3();
    static Predicate _$combine_3_4 = new PRED_$combine_3_4();
    static Predicate _$combine_3_5 = new PRED_$combine_3_5();
    static Predicate _$combine_3_6 = new PRED_$combine_3_6();
    static Predicate _$combine_3_7 = new PRED_$combine_3_7();
    static Predicate _$combine_3_8 = new PRED_$combine_3_8();
    static java.util.Hashtable<Term, Predicate> con = new java.util.Hashtable<Term, Predicate>(4);
    static {
        con.put(s1, _$combine_3_1);
        con.put(s2, _$combine_3_con_0);
        con.put(s4, _$combine_3_con_1);
        con.put(s3, _$combine_3_con_2);
    }

    public Term arg1, arg2, arg3;

    public PRED_$combine_3(Term a1, Term a2, Term a3, Predicate cont) {
        arg1 = a1;
        arg2 = a2;
        arg3 = a3;
        this.cont = cont;
    }

    public PRED_$combine_3(){}

    public void setArgument(Term[] args, Predicate cont) {
        arg1 = args[0];
        arg2 = args[1];
        arg3 = args[2];
        this.cont = cont;
    }

    public int arity() { return 3; }

    public String toString() {
        return "$combine(" + arg1 + "," + arg2 + "," + arg3 + ")";
    }

    public Predicate exec(Prolog engine) {
        engine.aregs[1] = arg1;
        engine.aregs[2] = arg2;
        engine.aregs[3] = arg3;
        engine.cont = cont;
        engine.setB0();
        return engine.switch_on_term(_$combine_3_var, _fail_0, _fail_0, _$combine_3_con, _fail_0, _fail_0);
    }
}

class PRED_$combine_3_var extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$combine_3_1, _$combine_3_var_1);
    }
}

class PRED_$combine_3_var_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_2, _$combine_3_var_2);
    }
}

class PRED_$combine_3_var_2 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_3, _$combine_3_var_3);
    }
}

class PRED_$combine_3_var_3 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_4, _$combine_3_var_4);
    }
}

class PRED_$combine_3_var_4 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_5, _$combine_3_var_5);
    }
}

class PRED_$combine_3_var_5 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_6, _$combine_3_var_6);
    }
}

class PRED_$combine_3_var_6 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_7, _$combine_3_var_7);
    }
}

class PRED_$combine_3_var_7 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$combine_3_8);
    }
}

class PRED_$combine_3_con extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.switch_on_hash(con, _fail_0);
    }
}

class PRED_$combine_3_con_0 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$combine_3_2, _$combine_3_con_0_1);
    }
}

class PRED_$combine_3_con_0_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$combine_3_3);
    }
}

class PRED_$combine_3_con_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$combine_3_4, _$combine_3_con_1_1);
    }
}

class PRED_$combine_3_con_1_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$combine_3_5);
    }
}

class PRED_$combine_3_con_2 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.jtry(_$combine_3_6, _$combine_3_con_2_1);
    }
}

class PRED_$combine_3_con_2_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.retry(_$combine_3_7, _$combine_3_con_2_2);
    }
}

class PRED_$combine_3_con_2_2 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
        return engine.trust(_$combine_3_8);
    }
}

class PRED_$combine_3_1 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(<,A,A):-true
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(<,A,A):-[]
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

class PRED_$combine_3_2 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(=<,>,>):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(=<,>,>):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s2))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s2, engine.trail);
        } else {
            return engine.fail();
        }
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s3))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isSymbol()){
            if (! a3.equals(s3))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$combine_3_3 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(=<,A,<):-true
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(=<,A,<):-[]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s2))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s2, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isSymbol()){
            if (! a3.equals(s1))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        return cont;
    }
}

class PRED_$combine_3_4 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(>=,<,>):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(>=,<,>):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s4))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s4, engine.trail);
        } else {
            return engine.fail();
        }
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
        if (a3.isSymbol()){
            if (! a3.equals(s3))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$combine_3_5 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(>=,A,<):-true
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(>=,A,<):-[]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s4))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s4, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isSymbol()){
            if (! a3.equals(s1))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        return cont;
    }
}

class PRED_$combine_3_6 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(>,<,>):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(>,<,>):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s3))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
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
        if (a3.isSymbol()){
            if (! a3.equals(s3))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$combine_3_7 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(>,>,<):-!
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(>,>,<):-['$neck_cut']
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s3))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        a2 = a2.dereference();
        if (a2.isSymbol()){
            if (! a2.equals(s3))
                return engine.fail();
        } else if (a2.isVariable()){
            ((VariableTerm) a2).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
        a3 = a3.dereference();
        if (a3.isSymbol()){
            if (! a3.equals(s1))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s1, engine.trail);
        } else {
            return engine.fail();
        }
        //START inline expansion of $neck_cut
        engine.neckCut();
        //END inline expansion
        return cont;
    }
}

class PRED_$combine_3_8 extends PRED_$combine_3 {
    public Predicate exec(Prolog engine) {
    // '$combine'(>,=,=):-true
        Term a1, a2, a3;
        Predicate cont;
        a1 = engine.aregs[1];
        a2 = engine.aregs[2];
        a3 = engine.aregs[3];
        cont = engine.cont;
    // '$combine'(>,=,=):-[]
        a1 = a1.dereference();
        if (a1.isSymbol()){
            if (! a1.equals(s3))
                return engine.fail();
        } else if (a1.isVariable()){
            ((VariableTerm) a1).bind(s3, engine.trail);
        } else {
            return engine.fail();
        }
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
        if (a3.isSymbol()){
            if (! a3.equals(s5))
                return engine.fail();
        } else if (a3.isVariable()){
            ((VariableTerm) a3).bind(s5, engine.trail);
        } else {
            return engine.fail();
        }
        return cont;
    }
}
