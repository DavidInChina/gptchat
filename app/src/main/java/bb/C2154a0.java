package bb;

import E.AbstractC0429m;
import E.C0421f;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import cb.C2334C;
import h0.C3288a;
import id.AbstractC3557B;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: bb.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2154a0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f25775Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f25776Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f25777h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154a0(String str, C2334C c2334c, float f6) {
        super(2);
        this.f25775Y = str;
        this.f25776Z = c2334c;
        this.f25777h0 = f6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C4317i c4317i = C4310b.f37703p0;
        C0421f c0421f = AbstractC0429m.f3907a;
        C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(693286680);
        E0.N a5 = E.p0.a(g10, c4317i, rVar2);
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
            AbstractC6463a.r(0, i11, new L0(rVar2), rVar2, 2058660585);
            rVar2.W(-236023428);
            String str = this.f25775Y;
            if (str != null) {
                j4.b(str, androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42843g), 0L, 0L, null, null, null, 0L, null, new Y0.i(6), 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20307h, rVar2, 0, 0, 65020);
            }
            rVar2.t(false);
            K8.d.A(this.f25776Z, androidx.compose.foundation.layout.e.j(c4323o, this.f25777h0), rVar2, 0, 0);
            rVar2.W(702085870);
            if (str != null) {
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, (p9.q.f42834e - p9.q.f42833d) - p9.r.f42841e), rVar2);
            }
            AbstractC6463a.v(rVar2, false, false, true, false);
            rVar2.t(false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
