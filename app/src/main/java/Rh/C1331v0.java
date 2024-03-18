package Rh;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import yh.AbstractC6638t0;
import yh.l1;

/* renamed from: Rh.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1331v0 extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15952Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f15953h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Map f15954i0;

    /* renamed from: j0  reason: collision with root package name */
    public final yh.l1 f15955j0;

    public C1331v0(String str, Map map, yh.l1 l1Var, p1 p1Var) {
        this.f15952Z = p1Var;
        this.f15953h0 = str;
        this.f15954i0 = map;
        this.f15955j0 = l1Var;
    }

    public static C1331v0 i1(String str, Map map, p1 p1Var) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C1331v0("", map, Y0.k1(p1Var, str), p1Var);
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        yh.l1 mo119g = this.f15955j0.mo119g();
        if (mo119g == null) {
            return null;
        }
        return new C1331v0(android.gov.nist.core.a.n(new StringBuilder(), this.f15953h0, '['), this.f15954i0, mo119g, this.f15952Z);
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        StringBuilder sb2 = new StringBuilder(this.f15953h0);
        for (int i10 = 0; i10 < this.f15955j0.S(); i10++) {
            sb2.append('.');
        }
        return B0.i(this.f15952Z, (List) this.f15954i0.get(sb2.toString()));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        yh.l1 mo118a = this.f15955j0.mo118a();
        if (mo118a == null) {
            return null;
        }
        return new C1331v0(this.f15953h0, this.f15954i0, mo118a, this.f15952Z);
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15955j0;
    }
}
