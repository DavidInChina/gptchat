package Rh;

import java.util.List;
import java.util.Map;
import yh.G1;
import yh.H1;
import yh.r1;

/* renamed from: Rh.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1329u0 extends r1 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15948Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Map f15949h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f15950i0;

    public C1329u0(p1 p1Var, Map map, List list) {
        super(0);
        this.f15948Z = p1Var;
        this.f15949h0 = map;
        this.f15950i0 = list;
    }

    @Override // yh.r1, yh.G1
    public final H1 Q() {
        return new Q0(this.f15948Z, this.f15950i0);
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        return C1331v0.i1((String) this.f15950i0.get(i10), (Map) this.f15949h0.get(valueOf), this.f15948Z);
    }

    @Override // yh.r1, yh.G1
    public final int p() {
        int i10 = 0;
        for (String str : this.f15950i0) {
            i10 += Nh.r.u(str).r();
        }
        return i10;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15950i0.size();
    }

    @Override // yh.r1, yh.G1
    public final G1 C() {
        return this;
    }
}
