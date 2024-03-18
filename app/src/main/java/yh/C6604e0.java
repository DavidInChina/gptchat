package yh;

import yh.l1;

/* renamed from: yh.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6604e0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6621k0 f50996Z;

    /* renamed from: h0  reason: collision with root package name */
    public final G1 f50997h0;

    public C6604e0(AbstractC6621k0 abstractC6621k0, G1 g1) {
        super(0);
        this.f50996Z = abstractC6621k0;
        this.f50997h0 = g1;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return new C6607f0(this.f50996Z, i10, (l1.a) this.f50997h0.get(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50997h0.size();
    }
}
