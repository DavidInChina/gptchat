package yh;

import java.lang.reflect.Type;
import java.util.Iterator;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import th.AbstractC5808p;
import wh.AbstractC6256u;
import yh.l1;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public final String f50937Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5808p f50938Z;

    public F0(String str, AbstractC5808p abstractC5808p) {
        this.f50937Y = str;
        this.f50938Z = abstractC5808p;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f50937Y;
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        throw new IllegalStateException("A symbolic type variable does not imply a variable source: " + this);
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public final boolean H(Type type) {
        type.getClass();
        return false;
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        throw new IllegalStateException("A symbolic type variable does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
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
        return EnumC6628o.f51062k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1.a)) {
            return false;
        }
        l1.a aVar = (l1.a) obj;
        if (aVar.c().c()) {
            if (this.f50937Y.equals(aVar.A0())) {
                return true;
            }
        }
        return false;
    }

    @Override // sh.AbstractC5634f, sh.AbstractC5637i
    public final String f1() {
        return this.f50937Y;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f50938Z.getDeclaredAnnotations();
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        throw new IllegalStateException("A symbolic type variable does not imply lower bounds: " + this);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        throw new IllegalStateException("A symbolic type variable does not imply an owner type: " + this);
    }

    @Override // sh.AbstractC5634f, yh.AbstractC6632q
    public final String getTypeName() {
        return this.f50937Y;
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        throw new IllegalStateException("A symbolic type variable does not imply an upper type bound: " + this);
    }

    public final int hashCode() {
        return this.f50937Y.hashCode();
    }

    @Override // yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        throw new IllegalStateException("A symbolic type variable does not imply method definitions: " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return k1Var.e(this);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        throw new IllegalStateException("A symbolic type variable does not imply an erasure: " + this);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        throw new IllegalStateException("A symbolic type variable does not imply an interface type definition: " + this);
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    public final String toString() {
        return this.f50937Y;
    }

    @Override // yh.l1.a
    public final G1 y0() {
        throw new IllegalStateException("A symbolic type variable does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        throw new IllegalStateException("A symbolic type variable does not imply a component type: " + this);
    }
}
