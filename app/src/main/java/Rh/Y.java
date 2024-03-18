package Rh;

import java.util.List;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes2.dex */
public final class Y extends yh.H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15767Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f15768h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1.a f15769i0;

    public Y(p1 p1Var, List list, l1.a aVar) {
        this.f15767Z = p1Var;
        this.f15768h0 = list;
        this.f15769i0 = aVar;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f15769i0.A0();
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f15769i0.B();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15767Z, this.f15768h0);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return this.f15769i0.getUpperBounds();
    }
}
