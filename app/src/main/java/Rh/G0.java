package Rh;

import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import yh.AbstractC6632q;
import yh.l1;

/* loaded from: classes.dex */
public final class G0 extends vh.c {

    /* renamed from: Z  reason: collision with root package name */
    public final String f15620Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f15621h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15622i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f15623j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1314m0 f15624k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Map f15625l0;

    /* renamed from: m0  reason: collision with root package name */
    public final List f15626m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ d1 f15627n0;

    public G0(d1 d1Var, String str, int i10, String str2, String str3, AbstractC1314m0 abstractC1314m0, Map map, List list) {
        this.f15627n0 = d1Var;
        this.f15621h0 = i10;
        this.f15620Z = str;
        this.f15622i0 = str2;
        this.f15623j0 = str3;
        this.f15624k0 = abstractC1314m0;
        this.f15625l0 = map;
        this.f15626m0 = list;
    }

    @Override // vh.AbstractC6048a, sh.AbstractC5637i.a
    public final String N0() {
        return this.f15623j0;
    }

    @Override // vh.c, vh.g, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f15627n0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.i(this.f15627n0.f15814i0, this.f15626m0);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f15620Z;
    }

    @Override // vh.g
    public final l1.a getType() {
        return this.f15624k0.g(this.f15622i0, this.f15627n0.f15814i0, this.f15625l0, this);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f15621h0;
    }

    @Override // vh.c, vh.g, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final yh.l1 mo118a() {
        return this.f15627n0;
    }
}
