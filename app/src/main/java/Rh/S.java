package Rh;

import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes2.dex */
public final class S extends yh.C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15703Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5641m f15704h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15705i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15706j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f15707k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f15708l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC1337y0 f15709m0;

    public S(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map, String str2, List list, AbstractC1337y0 abstractC1337y0) {
        this.f15703Z = p1Var;
        this.f15704h0 = abstractC5641m;
        this.f15705i0 = str;
        this.f15706j0 = map;
        this.f15707k0 = str2;
        this.f15708l0 = list;
        this.f15709m0 = abstractC1337y0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15703Z, (List) this.f15706j0.get(this.f15705i0 + this.f15709m0.c()));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return this.f15709m0.a(this.f15703Z, this.f15704h0, this.f15705i0, this.f15706j0);
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15703Z.a(this.f15707k0).a();
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new C1308j0(this.f15703Z, this.f15704h0, this.f15705i0 + this.f15709m0.c(), this.f15706j0, this.f15708l0);
    }
}
