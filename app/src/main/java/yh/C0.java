package yh;

import java.lang.reflect.Type;
import java.util.Iterator;
import sh.AbstractC5641m;
import wh.AbstractC6256u;
import wh.C6255t;
import yh.l1;

/* loaded from: classes2.dex */
public abstract class C0 extends AbstractC6643w {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f50921Y;

    @Override // yh.l1.a
    public final String A0() {
        throw new IllegalStateException("A parameterized type does not imply a symbol: " + this);
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        throw new IllegalStateException("A parameterized type does not imply a type variable source: " + this);
    }

    @Override // yh.AbstractC6643w, yh.AbstractC6632q
    public boolean H(Type type) {
        return equals(EnumC6628o.a(type, X.f50977Y));
    }

    @Override // yh.l1.a
    public final l1.a J0(l1.a aVar) {
        EnumC6628o c10;
        l1.a aVar2 = this;
        do {
            G1 y02 = aVar2.y0();
            G1 r02 = aVar2.l0().r0();
            for (int i10 = 0; i10 < Math.min(y02.size(), r02.size()); i10++) {
                if (aVar.equals(r02.get(i10))) {
                    return (l1.a) y02.get(i10);
                }
            }
            aVar2 = aVar2.getOwnerType();
            if (aVar2 != null) {
                c10 = aVar2.c();
                c10.getClass();
            } else {
                return null;
            }
        } while (c10 == EnumC6628o.f51059h0);
        return null;
    }

    @Override // yh.AbstractC6632q
    public l1.a L() {
        l1.a L10 = l0().L();
        if (L10 == null) {
            return null;
        }
        return new C6619j0(L10, new C6596b1(this), L10);
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        return l0().Y();
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final EnumC6628o c() {
        return EnumC6628o.f51059h0;
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
        if (c10 != EnumC6628o.f51059h0) {
            return false;
        }
        l1.a ownerType = getOwnerType();
        l1.a ownerType2 = aVar.getOwnerType();
        if (l0().equals(aVar.l0()) && ((ownerType != null || ownerType2 == null) && ((ownerType == null || ownerType.equals(ownerType2)) && y0().equals(aVar.y0())))) {
            return true;
        }
        return false;
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        throw new IllegalStateException("A parameterized type does not imply lower bounds: " + this);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        throw new IllegalStateException("A parameterized type does not imply upper bounds: " + this);
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f50921Y != 0) {
            i10 = 0;
        } else {
            int i12 = 1;
            for (l1.a aVar : y0()) {
                i12 = (i12 * 31) + aVar.hashCode();
            }
            l1.a ownerType = getOwnerType();
            if (ownerType == null) {
                i11 = l0().hashCode();
            } else {
                i11 = ownerType.hashCode();
            }
            i10 = i11 ^ i12;
        }
        if (i10 == 0) {
            return this.f50921Y;
        }
        this.f50921Y = i10;
        return i10;
    }

    @Override // yh.l1.a, yh.AbstractC6632q
    public AbstractC6256u i() {
        return new C6255t(this, l0().i(), new C6596b1(this));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6630p(this);
    }

    @Override // yh.l1.a
    public final Object k(k1 k1Var) {
        return k1Var.c(this);
    }

    @Override // yh.AbstractC6632q
    public G1 o0() {
        return new w1(l0().o0(), new C6596b1(this));
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        B0.f50916Y.a(sb2, l0(), getOwnerType());
        G1<l1.a> y02 = y0();
        if (!y02.isEmpty()) {
            sb2.append('<');
            boolean z10 = false;
            for (l1.a aVar : y02) {
                if (z10) {
                    sb2.append(", ");
                }
                sb2.append(aVar.getTypeName());
                z10 = true;
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        throw new IllegalStateException("A parameterized type does not imply a component type: " + this);
    }
}
