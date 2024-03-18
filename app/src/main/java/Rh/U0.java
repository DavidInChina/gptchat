package Rh;

import java.util.List;
import yh.H1;
import yh.r1;

/* loaded from: classes2.dex */
public final class U0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15737Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15738h0;

    public U0(p1 p1Var, List list) {
        super(0);
        this.f15737Z = p1Var;
        this.f15738h0 = list;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new Q0(this.f15737Z, this.f15738h0);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return new V0(this.f15737Z, (String) this.f15738h0.get(i10));
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15738h0.size();
    }
}
