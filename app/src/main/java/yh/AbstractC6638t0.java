package yh;

import java.lang.reflect.Type;
import java.util.Iterator;
import sh.AbstractC5641m;
import th.EnumC5807o;
import wh.AbstractC6256u;
import wh.C6255t;
import yh.l1;

/* renamed from: yh.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6638t0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f51082Y;

    @Override // yh.l1.a
    public final String A0() {
        throw new IllegalStateException("A non-generic type does not imply a symbol: " + this);
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        throw new IllegalStateException("A non-generic type does not imply a type variable source: " + this);
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public boolean H(Type type) {
        return l0().H(type);
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        throw new IllegalStateException("A non-generic type does not imply type arguments: " + this);
    }

    public l1.a L() {
        l1 l02 = l0();
        l1.a L10 = l02.L();
        if (AbstractC6635s.f51074Z) {
            return L10;
        }
        if (L10 == null) {
            return null;
        }
        return new C6619j0(L10, new P0(l02), EnumC5807o.f46228Y);
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return l0().T0();
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        return l0().Y();
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return l0().a1();
    }

    @Override // yh.AbstractC6632q
    public final EnumC6628o c() {
        return EnumC6628o.f51057Y;
    }

    public final boolean equals(Object obj) {
        if (this != obj && !l0().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        return l0().f1();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        throw new IllegalStateException("A non-generic type does not imply lower type bounds: " + this);
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        return l0().getTypeName();
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        throw new IllegalStateException("A non-generic type does not imply upper type bounds: " + this);
    }

    public final int hashCode() {
        int i10;
        if (this.f51082Y != 0) {
            i10 = 0;
        } else {
            i10 = l0().hashCode();
        }
        if (i10 == 0) {
            return this.f51082Y;
        }
        this.f51082Y = i10;
        return i10;
    }

    public AbstractC6256u i() {
        k1 k1Var;
        l1 l02 = l0();
        AbstractC6256u i10 = l02.i();
        if (AbstractC6635s.f51074Z) {
            k1Var = S0.f50968Y;
        } else {
            k1Var = new P0(l02);
        }
        return new C6255t(this, i10, k1Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6630p(this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return k1Var.b(this);
    }

    public G1 o0() {
        l1 l02 = l0();
        if (AbstractC6635s.f51074Z) {
            return l02.o0();
        }
        return new w1(l02.o0(), new P0(l02));
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return l0().p();
    }

    public final String toString() {
        return l0().toString();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        throw new IllegalStateException("A non-generic type does not imply type arguments: " + this);
    }
}
