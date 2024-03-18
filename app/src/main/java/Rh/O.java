package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.C6633q0;
import yh.G1;
import yh.t1;

/* loaded from: classes2.dex */
public final class O extends yh.M0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15678Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15679h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15680i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15681j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1337y0 f15682k0;

    public O(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        this.f15678Z = p1Var;
        this.f15679h0 = abstractC5641m;
        this.f15680i0 = str;
        this.f15681j0 = map;
        this.f15682k0 = abstractC1337y0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15678Z, (List) this.f15681j0.get(this.f15680i0));
    }

    @Override // yh.l1.a
    public final G1 getLowerBounds() {
        return new C1306i0(this.f15680i0, this.f15681j0, this.f15679h0, this.f15682k0, this.f15678Z);
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return new t1(C6633q0.i1(Object.class));
    }
}
