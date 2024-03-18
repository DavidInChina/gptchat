package W;

import E.AbstractC0425i;
import E.AbstractC0429m;
import E.C0424h;
import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import h0.C3288a;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class N extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19378Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k4 f19379Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19380h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19381i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f19382j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19383k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19384l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ n4 f19385m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(E.A0 a02, k4 k4Var, wf.n nVar, N0.E e10, boolean z10, wf.n nVar2, C3288a c3288a, n4 n4Var) {
        super(2);
        this.f19378Y = a02;
        this.f19379Z = k4Var;
        this.f19380h0 = nVar;
        this.f19381i0 = e10;
        this.f19382j0 = z10;
        this.f19383k0 = nVar2;
        this.f19384l0 = c3288a;
        this.f19385m0 = n4Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        float f6;
        AbstractC0425i abstractC0425i;
        o4 o4Var;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        float R10 = ((Z0.b) rVar2.m(AbstractC0701r0.f7002e)).R(X.G.f21372a);
        n4 n4Var = this.f19385m0;
        if (n4Var != null && (o4Var = ((C1568j1) n4Var).f20169b) != null) {
            f6 = o4Var.f20268c.h();
        } else {
            f6 = 0.0f;
        }
        float f10 = R10 + f6;
        AbstractC4326r c10 = androidx.compose.ui.draw.a.c(E.D0.a(C4323o.f37719b, this.f19378Y));
        k4 k4Var = this.f19379Z;
        long j6 = k4Var.f20199c;
        C0424h c0424h = AbstractC0429m.f3911e;
        if (this.f19382j0) {
            abstractC0425i = c0424h;
        } else {
            abstractC0425i = AbstractC0429m.f3907a;
        }
        AbstractC1522a0.f(c10, f10, j6, k4Var.f20200d, k4Var.f20201e, this.f19380h0, this.f19381i0, 1.0f, c0424h, abstractC0425i, 0, false, this.f19383k0, this.f19384l0, rVar2, 113246208, 3126);
        return jf.y.f36177a;
    }
}
