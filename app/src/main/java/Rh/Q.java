package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes2.dex */
public final class Q extends yh.C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15693Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15694h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15695i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15696j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f15697k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f15698l0;

    public Q(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map, String str2, List list) {
        this.f15693Z = p1Var;
        this.f15694h0 = abstractC5641m;
        this.f15695i0 = str;
        this.f15696j0 = map;
        this.f15697k0 = str2;
        this.f15698l0 = list;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15693Z, (List) this.f15696j0.get(this.f15695i0));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        yh.l1 W6 = this.f15693Z.a(this.f15697k0).a().W();
        if (W6 == null) {
            return null;
        }
        return W6.w0();
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15693Z.a(this.f15697k0).a();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new C1308j0(this.f15693Z, this.f15694h0, this.f15695i0, this.f15696j0, this.f15698l0);
    }
}
