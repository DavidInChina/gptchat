package yh;

import java.lang.reflect.Type;
import java.util.Iterator;
import wh.AbstractC6256u;
import yh.l1;

/* loaded from: classes2.dex */
public abstract class H0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f50944Y;

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public boolean H(Type type) {
        return equals(EnumC6628o.a(type, X.f50977Y));
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        throw new IllegalStateException("A type variable does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return false;
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
        return EnumC6628o.f51061j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1.a)) {
            return false;
        }
        l1.a aVar = (l1.a) obj;
        if (aVar.c().c() && A0().equals(aVar.A0()) && B().equals(aVar.B())) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        return A0();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        throw new IllegalStateException("A type variable does not imply lower bounds: " + this);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        throw new IllegalStateException("A type variable does not imply an owner type: " + this);
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        return A0();
    }

    public final int hashCode() {
        int i10;
        if (this.f50944Y != 0) {
            i10 = 0;
        } else {
            i10 = B().hashCode() ^ A0().hashCode();
        }
        if (i10 == 0) {
            return this.f50944Y;
        }
        this.f50944Y = i10;
        return i10;
    }

    @Override // yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        throw new IllegalStateException("A type variable does not imply method definitions: " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return k1Var.e(this);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        G1 upperBounds = getUpperBounds();
        if (upperBounds.isEmpty()) {
            return C6641v.l1(Object.class);
        }
        return ((l1.a) upperBounds.get(0)).l0();
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        throw new IllegalStateException("A type variable does not imply an interface type definition: " + this);
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    public final String toString() {
        return A0();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        throw new IllegalStateException("A type variable does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        throw new IllegalStateException("A type variable does not imply a component type: " + this);
    }
}
