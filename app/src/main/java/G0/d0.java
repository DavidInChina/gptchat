package G0;

import l0.AbstractC4325q;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g0 f5719Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4325q f5720Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ c0 f5721h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f5722i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0593w f5723j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f5724k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f5725l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, AbstractC4325q abstractC4325q, c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11) {
        super(0);
        this.f5719Y = g0Var;
        this.f5720Z = abstractC4325q;
        this.f5721h0 = c0Var;
        this.f5722i0 = j6;
        this.f5723j0 = c0593w;
        this.f5724k0 = z10;
        this.f5725l0 = z11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10;
        switch (((Cf.h) this.f5721h0).f3114Y) {
            case 0:
                i10 = 16;
                break;
            default:
                i10 = 8;
                break;
        }
        AbstractC4325q e10 = AbstractC0579h.e(this.f5720Z, i10);
        boolean z10 = this.f5724k0;
        boolean z11 = this.f5725l0;
        g0 g0Var = this.f5719Y;
        c0 c0Var = this.f5721h0;
        long j6 = this.f5722i0;
        C0593w c0593w = this.f5723j0;
        if (e10 == null) {
            g0Var.K0(c0Var, j6, c0593w, z10, z11);
        } else {
            g0Var.getClass();
            c0593w.s(e10, -1.0f, z11, new d0(g0Var, e10, c0Var, j6, c0593w, z10, z11));
        }
        return jf.y.f36177a;
    }
}
