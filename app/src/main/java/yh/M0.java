package yh;

import Qh.AbstractC1239q;
import android.gov.nist.core.Separators;
import java.lang.reflect.Type;
import java.util.Iterator;
import sh.AbstractC5641m;
import wh.AbstractC6256u;
import yh.l1;

/* loaded from: classes.dex */
public abstract class M0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f50958Y;

    @Override // yh.l1.a
    public final String A0() {
        throw new IllegalStateException("A wildcard does not imply a symbol: " + this);
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        throw new IllegalStateException("A wildcard does not imply a type variable source: " + this);
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public boolean H(Type type) {
        return equals(EnumC6628o.a(type, X.f50977Y));
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        throw new IllegalStateException("A wildcard does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        throw new IllegalStateException("A wildcard does not imply a super type definition: " + this);
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
        return EnumC6628o.f51060i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1.a)) {
            return false;
        }
        l1.a aVar = (l1.a) obj;
        EnumC6628o c10 = aVar.c();
        c10.getClass();
        if (c10 == EnumC6628o.f51060i0 && getUpperBounds().equals(aVar.getUpperBounds()) && getLowerBounds().equals(aVar.getLowerBounds())) {
            return true;
        }
        return false;
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        throw new IllegalStateException("A wildcard does not imply an owner type: " + this);
    }

    public final int hashCode() {
        int i10;
        if (this.f50958Y != 0) {
            i10 = 0;
        } else {
            int i11 = 1;
            int i12 = 1;
            for (l1.a aVar : getLowerBounds()) {
                i12 = (i12 * 31) + aVar.hashCode();
            }
            for (l1.a aVar2 : getUpperBounds()) {
                i11 = (i11 * 31) + aVar2.hashCode();
            }
            i10 = i12 ^ i11;
        }
        if (i10 == 0) {
            return this.f50958Y;
        }
        this.f50958Y = i10;
        return i10;
    }

    @Override // yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        throw new IllegalStateException("A wildcard does not imply method definitions: " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw new IllegalStateException("A wildcard does not imply a super type definition: " + this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return k1Var.d(this);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        throw new IllegalStateException("A wildcard does not represent an erasable type: " + this);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        throw new IllegalStateException("A wildcard does not imply an interface type definition: " + this);
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        throw new IllegalStateException("A wildcard does not imply an operand stack size: " + this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.QUESTION);
        G1 lowerBounds = getLowerBounds();
        if (!lowerBounds.isEmpty()) {
            sb2.append(" super ");
        } else {
            lowerBounds = getUpperBounds();
            if (((l1.a) ((AbstractC1239q) lowerBounds).r()).equals(C6633q0.i1(Object.class))) {
                return Separators.QUESTION;
            }
            sb2.append(" extends ");
        }
        sb2.append(((l1.a) ((AbstractC1239q) lowerBounds).r()).getTypeName());
        return sb2.toString();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        throw new IllegalStateException("A wildcard does not imply type arguments: " + this);
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        throw new IllegalStateException("A wildcard does not imply a component type: " + this);
    }
}
