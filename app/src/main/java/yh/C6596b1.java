package yh;

import yh.l1;

/* renamed from: yh.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6596b1 extends AbstractC6599c1 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1.a f50994Y;

    public C6596b1(l1.a aVar) {
        this.f50994Y = aVar;
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return (l1.a) aVar.B().S0(new C6593a1(this, aVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6596b1.class != obj.getClass()) {
            return false;
        }
        if (this.f50994Y.equals(((C6596b1) obj).f50994Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50994Y.hashCode() + (C6596b1.class.hashCode() * 31);
    }
}
