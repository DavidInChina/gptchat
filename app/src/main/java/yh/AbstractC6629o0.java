package yh;

import Qh.AbstractC1239q;
import java.util.Iterator;
import sh.AbstractC5641m;
import wh.AbstractC6256u;
import yh.l1;

/* renamed from: yh.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6629o0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f51065Y;

    @Override // yh.l1.a
    public final String A0() {
        throw new IllegalStateException("A generic array type does not imply a symbol: " + this);
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        throw new IllegalStateException("A generic array type does not imply a type variable source: " + this);
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        throw new IllegalStateException("A generic array type does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        return C6633q0.i1(Object.class);
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return true;
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final EnumC6628o c() {
        if (mo119g().c().b()) {
            return EnumC6628o.f51057Y;
        }
        return EnumC6628o.f51058Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().b()) {
            return l0().equals(obj);
        }
        if (!(obj instanceof l1.a)) {
            return false;
        }
        l1.a aVar = (l1.a) obj;
        EnumC6628o c10 = aVar.c();
        c10.getClass();
        if (c10 == EnumC6628o.f51058Z && mo119g().equals(aVar.mo119g())) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        if (c().b()) {
            return l0().f1();
        }
        return toString();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        throw new IllegalStateException("A generic array type does not imply lower type bounds: " + this);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return null;
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        if (c().b()) {
            return l0().getTypeName();
        }
        return toString();
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        throw new IllegalStateException("A generic array type does not imply upper type bounds: " + this);
    }

    public final int hashCode() {
        int i10;
        if (this.f51065Y != 0) {
            i10 = 0;
        } else if (c().b()) {
            i10 = l0().hashCode();
        } else {
            i10 = mo119g().hashCode();
        }
        if (i10 == 0) {
            return this.f51065Y;
        }
        this.f51065Y = i10;
        return i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Qh.q, wh.u] */
    @Override // yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new AbstractC1239q(1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6630p(this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        if (c().b()) {
            return k1Var.b(this);
        }
        return k1Var.a(this);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6637t.l1(mo119g().l0(), 1);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return l1.f51044g0;
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    public final String toString() {
        if (c().b()) {
            return l0().toString();
        }
        return mo119g().getTypeName() + "[]";
    }

    @Override // yh.l1.a
    public final G1 y0() {
        throw new IllegalStateException("A generic array type does not imply type arguments: " + this);
    }
}
