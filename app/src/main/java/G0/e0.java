package G0;

import l0.AbstractC4325q;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5729Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f5730Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4325q f5731h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ c0 f5732i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f5733j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0593w f5734k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f5735l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ boolean f5736m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ float f5737n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(g0 g0Var, AbstractC4325q abstractC4325q, c0 c0Var, long j6, C0593w c0593w, boolean z10, boolean z11, float f6, int i10) {
        super(0);
        this.f5729Y = i10;
        this.f5730Z = g0Var;
        this.f5731h0 = abstractC4325q;
        this.f5732i0 = c0Var;
        this.f5733j0 = j6;
        this.f5734k0 = c0593w;
        this.f5735l0 = z10;
        this.f5736m0 = z11;
        this.f5737n0 = f6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = 16;
        int i11 = this.f5729Y;
        AbstractC4325q abstractC4325q = this.f5731h0;
        c0 c0Var = this.f5732i0;
        switch (i11) {
            case 0:
                switch (((Cf.h) c0Var).f3114Y) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                AbstractC4325q e10 = AbstractC0579h.e(abstractC4325q, i10);
                boolean z10 = this.f5736m0;
                g0 g0Var = this.f5730Z;
                c0 c0Var2 = this.f5732i0;
                long j6 = this.f5733j0;
                C0593w c0593w = this.f5734k0;
                boolean z11 = this.f5735l0;
                if (e10 == null) {
                    g0Var.K0(c0Var2, j6, c0593w, z11, z10);
                    return;
                }
                g0Var.getClass();
                float f6 = this.f5737n0;
                c0593w.s(e10, f6, z10, new e0(g0Var, e10, c0Var2, j6, c0593w, z11, z10, f6, 0));
                return;
            default:
                switch (((Cf.h) c0Var).f3114Y) {
                    case 0:
                        break;
                    default:
                        i10 = 8;
                        break;
                }
                this.f5730Z.U0(AbstractC0579h.e(abstractC4325q, i10), this.f5732i0, this.f5733j0, this.f5734k0, this.f5735l0, this.f5736m0, this.f5737n0);
                return;
        }
    }
}
