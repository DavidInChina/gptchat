package nc;

import A.AbstractC0044t0;
import A.V0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.AbstractC0441z;
import E0.N;
import F.AbstractC0539m;
import F.J;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.E1;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import androidx.compose.foundation.layout.FillElement;
import h0.C3288a;
import id.AbstractC3557B;
import ja.C3931c;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f40232Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f40233Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f40234h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3931c f40235i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C3931c f40236j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f40237k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f40238l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Yg.p f40239m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, J j6, wf.n nVar, C3931c c3931c, C3931c c3931c2, String str, boolean z10, Yg.p pVar) {
        super(3);
        this.f40232Y = list;
        this.f40233Z = j6;
        this.f40234h0 = nVar;
        this.f40235i0 = c3931c;
        this.f40236j0 = c3931c2;
        this.f40237k0 = str;
        this.f40238l0 = z10;
        this.f40239m0 = pVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3931c c3931c;
        boolean z10;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$ElevatedCard", (AbstractC0441z) obj);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 81) == 16) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-483455358);
        N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(fillElement);
        boolean z11 = rVar2.f22696a instanceof AbstractC1707e;
        if (z11) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar2, a5, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j3);
            }
            AbstractC6463a.r(0, i11, new L0(rVar2), rVar2, 2058660585);
            E.A a10 = E.A.f3733a;
            AbstractC4326r a11 = io.sentry.compose.b.a("ConversationPreviewCard");
            List list = this.f40232Y;
            boolean isEmpty = list.isEmpty();
            C3931c c3931c2 = this.f40236j0;
            if (isEmpty) {
                rVar2.W(-1710932590);
                AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(AbstractC0044t0.P(a10, c4323o), 1.0f);
                rVar2.W(733328855);
                N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p11 = rVar2.p();
                C3288a i13 = androidx.compose.ui.layout.a.i(d10);
                if (z11) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, c0581j);
                    U3.f.n0(rVar2, p11, c0581j2);
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j3);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar2), rVar2, 2058660585);
                    I2.b(androidx.compose.foundation.layout.b.f24731a.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar2, 0, 30);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    rVar2.t(false);
                    c3931c = c3931c2;
                    z10 = false;
                } else {
                    R4.b.r1();
                    throw null;
                }
            } else {
                rVar2.W(-1710932226);
                c3931c = c3931c2;
                z10 = false;
                AbstractC0539m.a(AbstractC0044t0.P(a10, c4323o), this.f40233Z, null, false, null, null, null, false, new C6.a(list, this.f40235i0, c3931c2, 17), rVar2, 0, 252);
                rVar2.t(false);
            }
            U3.f.c(a11, 0.0f, 0L, rVar2, 0, 7);
            E1.a(R4.b.X(rVar2, -1499845270, new r9.r(this.f40237k0, 11)), a11, null, R4.b.X(rVar2, -763742585, new V0(this.f40238l0, c3931c, this.f40239m0, 6)), null, this.f40234h0, null, 0.0f, 0.0f, rVar2, 3078, 470);
            AbstractC6463a.v(rVar2, z10, true, z10, z10);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
