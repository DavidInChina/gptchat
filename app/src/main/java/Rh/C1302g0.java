package Rh;

import Qh.AbstractC1239q;
import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;

/* renamed from: Rh.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302g0 extends yh.M0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15850Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15851h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15852i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15853j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1337y0 f15854k0;

    public C1302g0(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        this.f15850Z = p1Var;
        this.f15851h0 = abstractC5641m;
        this.f15852i0 = str;
        this.f15853j0 = map;
        this.f15854k0 = abstractC1337y0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15850Z, (List) this.f15853j0.get(this.f15852i0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.G1, Qh.q] */
    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new C1306i0(this.f15852i0, this.f15853j0, this.f15851h0, this.f15854k0, this.f15850Z);
    }
}
