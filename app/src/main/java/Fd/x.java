package Fd;

import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import r0.G;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final x f5289Z = new x(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final x f5290h0 = new x(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final x f5291i0 = new x(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5292Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10) {
        super(2);
        this.f5292Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C5953f c5953f;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f5292Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.assistant_notification_description, abstractC1725n), a5, 0L, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20310k.f12487a.f12629b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131062);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.ic_quick_tile, abstractC1725n), H.v(R.string.quick_tile_open_in_app, abstractC1725n), AbstractC4194d.a((X) a10, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42830a)), r0.r.f44258f, abstractC1725n, 3080, 0);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                C5953f c5953f2 = M3.H.f11529c;
                if (c5953f2 != null) {
                    c5953f = c5953f2;
                } else {
                    C5952e c5952e = new C5952e("Filled.CloseFullscreen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(22.0f, 3.41f);
                    pVar.o(-5.29f, 5.29f);
                    pVar.n(20.0f, 12.0f);
                    pVar.m(-8.0f);
                    pVar.w(4.0f);
                    pVar.o(3.29f, 3.29f);
                    E9.f.C(pVar, 20.59f, 2.0f, 22.0f, 3.41f);
                    pVar.p(3.41f, 22.0f);
                    pVar.o(5.29f, -5.29f);
                    pVar.n(12.0f, 20.0f);
                    pVar.x(-8.0f);
                    pVar.l(4.0f);
                    pVar.o(3.29f, 3.29f);
                    E9.f.C(pVar, 2.0f, 20.59f, 3.41f, 22.0f);
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    M3.H.f11529c = c5953f;
                }
                String v10 = H.v(R.string.quick_tile_minimize, abstractC1725n);
                long j6 = r0.r.f44258f;
                AbstractC1607r1.b(c5953f, v10, AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42830a)), j6, abstractC1725n, 3072, 0);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC4326r d10 = androidx.compose.foundation.a.d(c4323o, r0.r.f44254b, G.f44171a);
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar5);
                rVar5.W(-1323940314);
                int i12 = rVar5.P;
                AbstractC1732q0 p10 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(d10);
                if (rVar5.f22696a instanceof AbstractC1707e) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(c0582k);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, c10, C0583l.f5808f);
                    U3.f.n0(rVar5, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar5, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar5), rVar5, 2058660585);
                    r.f.c(Ad.l.W0(null, rVar5, 31), c.f5242j0, io.sentry.compose.b.a("<anonymous>"), null, null, null, rVar5, 56, 60);
                    AbstractC6463a.v(rVar5, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f5292Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
