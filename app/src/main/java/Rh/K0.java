package Rh;

import java.util.List;
import yh.G1;
import yh.l1;
import yh.r1;

/* loaded from: classes2.dex */
public final class K0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final List f15639Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L0 f15640h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(L0 l02, G1 g1) {
        super(0);
        this.f15640h0 = l02;
        this.f15639Z = g1;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return new J0(this, (l1.a) this.f15639Z.get(i10), i10);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15639Z.size();
    }
}
