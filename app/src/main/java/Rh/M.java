package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.AbstractC6629o0;
import yh.l1;

/* loaded from: classes2.dex */
public final class M extends AbstractC6629o0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15650Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15651h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15652i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15653j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1337y0 f15654k0;

    public M(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        this.f15650Z = p1Var;
        this.f15651h0 = abstractC5641m;
        this.f15652i0 = str;
        this.f15653j0 = map;
        this.f15654k0 = abstractC1337y0;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        String n10 = android.gov.nist.core.a.n(new StringBuilder(), this.f15652i0, '[');
        return this.f15654k0.a(this.f15650Z, this.f15651h0, n10, this.f15653j0);
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15650Z, (List) this.f15653j0.get(this.f15652i0));
    }
}
