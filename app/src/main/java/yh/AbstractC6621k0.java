package yh;

import java.lang.reflect.Type;
import sh.AbstractC5641m;
import wh.AbstractC6256u;
import yh.l1;

/* renamed from: yh.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6621k0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f51035Y;

    @Override // yh.l1.a
    public final String A0() {
        return i1().A0();
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return i1().B();
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        return i1().H(type);
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        return i1().J0(aVar);
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
        return i1().c();
    }

    public final boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof AbstractC6632q) || !i1().equals(obj))) {
            return false;
        }
        return true;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        return i1().f1();
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        return i1().mo119g();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return i1().getLowerBounds();
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return i1().getOwnerType();
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        return i1().getTypeName();
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return i1().getUpperBounds();
    }

    public final int hashCode() {
        int i10;
        if (this.f51035Y != 0) {
            i10 = 0;
        } else {
            i10 = i1().hashCode();
        }
        if (i10 == 0) {
            return this.f51035Y;
        }
        this.f51035Y = i10;
        return i10;
    }

    @Override // yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return i1().i();
    }

    public abstract l1.a i1();

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return i1().k(k1Var);
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return l0().p();
    }

    public final String toString() {
        return i1().toString();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return i1().y0();
    }
}
