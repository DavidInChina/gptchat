package W;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0412a0;
import E.C0421f;
import E.C0424h;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class W extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E.A0 f19778Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f19779Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k4 f19780h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19781i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19782j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f19783k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f19784l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19785m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19786n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f19787o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ n4 f19788p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19789q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19790r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ float f19791s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f19792t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ boolean f19793u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(E.A0 a02, kotlin.jvm.internal.y yVar, k4 k4Var, wf.n nVar, N0.E e10, float f6, boolean z10, wf.n nVar2, C3288a c3288a, kotlin.jvm.internal.y yVar2, n4 n4Var, wf.n nVar3, N0.E e11, float f10, kotlin.jvm.internal.z zVar, boolean z11) {
        super(2);
        this.f19778Y = a02;
        this.f19779Z = yVar;
        this.f19780h0 = k4Var;
        this.f19781i0 = nVar;
        this.f19782j0 = e10;
        this.f19783k0 = f6;
        this.f19784l0 = z10;
        this.f19785m0 = nVar2;
        this.f19786n0 = c3288a;
        this.f19787o0 = yVar2;
        this.f19788p0 = n4Var;
        this.f19789q0 = nVar3;
        this.f19790r0 = e11;
        this.f19791s0 = f10;
        this.f19792t0 = zVar;
        this.f19793u0 = z11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        float f6;
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
        rVar2.W(-483455358);
        C4323o c4323o = C4323o.f37719b;
        E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(c4323o);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, a5, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j);
            }
            AbstractC6463a.r(0, i11, new Z.L0(rVar2), rVar2, 2058660585);
            E.A0 a02 = this.f19778Y;
            AbstractC4326r c10 = androidx.compose.ui.draw.a.c(E.D0.a(c4323o, a02));
            kotlin.jvm.internal.y yVar = this.f19779Z;
            float f10 = yVar.f37646Y;
            k4 k4Var = this.f19780h0;
            long j6 = k4Var.f20199c;
            C0424h c0424h = AbstractC0429m.f3911e;
            C0421f c0421f = AbstractC0429m.f3907a;
            AbstractC1522a0.f(c10, f10, j6, k4Var.f20200d, k4Var.f20201e, this.f19781i0, this.f19782j0, this.f19783k0, c0424h, c0421f, 0, this.f19784l0, this.f19785m0, this.f19786n0, rVar2, 905969664, 3078);
            AbstractC4326r c11 = androidx.compose.ui.draw.a.c(E.D0.a(c4323o, new C0412a0(a02, r9.y.f44625e)));
            float f11 = this.f19787o0.f37646Y - yVar.f37646Y;
            n4 n4Var = this.f19788p0;
            if (n4Var != null && (o4Var = ((C1568j1) n4Var).f20169b) != null) {
                f6 = o4Var.f20268c.h();
            } else {
                f6 = 0.0f;
            }
            AbstractC1522a0.f(c11, f11 + f6, k4Var.f20199c, k4Var.f20200d, k4Var.f20201e, this.f19789q0, this.f19790r0, this.f19791s0, AbstractC0429m.f3910d, c0421f, this.f19792t0.f37647Y, this.f19793u0, T0.f19694g, T0.f19695h, rVar2, 905969664, 3456);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
