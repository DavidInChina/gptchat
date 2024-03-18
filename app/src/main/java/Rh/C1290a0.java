package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;

/* renamed from: Rh.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290a0 extends yh.H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15785Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15786h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15787i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15788j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f15789k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f15790l0;

    public C1290a0(p1 p1Var, AbstractC5641m abstractC5641m, Map map, Map map2, String str, List list) {
        this.f15785Z = p1Var;
        this.f15786h0 = abstractC5641m;
        this.f15787i0 = map;
        this.f15788j0 = map2;
        this.f15789k0 = str;
        this.f15790l0 = list;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f15789k0;
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f15786h0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15785Z, (List) this.f15787i0.get(""));
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new Z(this.f15785Z, this.f15786h0, this.f15788j0, this.f15790l0);
    }
}
