package yh;

import java.util.List;

/* renamed from: yh.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6622l extends AbstractC6615i {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51036Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f51037h0;

    public C6622l(l1 l1Var, List list) {
        super(0);
        this.f51036Z = l1Var;
        this.f51037h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return new C6606f(this.f51036Z, (C6609g) this.f51037h0.get(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51037h0.size();
    }
}
