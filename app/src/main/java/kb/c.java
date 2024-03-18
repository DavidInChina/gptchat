package Kb;

import L0.u;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f9591Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f9592h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f9593i0 = new c(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9594Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(2);
        this.f9594Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f9594Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.onboarding_birthday, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C5953f c5953f = P4.a.f13811b;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.Today", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(19.0f, 3.0f);
                    pVar.m(-1.0f);
                    pVar.n(18.0f, 1.0f);
                    pVar.m(-2.0f);
                    pVar.x(2.0f);
                    pVar.n(8.0f, 3.0f);
                    pVar.n(8.0f, 1.0f);
                    pVar.n(6.0f, 1.0f);
                    pVar.x(2.0f);
                    pVar.n(5.0f, 3.0f);
                    pVar.h(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                    pVar.n(3.0f, 19.0f);
                    pVar.h(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    pVar.m(14.0f);
                    pVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    pVar.n(21.0f, 5.0f);
                    pVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    pVar.f();
                    pVar.p(19.0f, 19.0f);
                    pVar.n(5.0f, 19.0f);
                    pVar.n(5.0f, 8.0f);
                    pVar.m(14.0f);
                    pVar.x(11.0f);
                    pVar.f();
                    pVar.p(7.0f, 10.0f);
                    pVar.m(5.0f);
                    pVar.x(5.0f);
                    pVar.n(7.0f, 15.0f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    P4.a.f13811b = c5953f;
                }
                AbstractC1607r1.a(R4.b.R1(c5953f, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                b.a(a11, null, "Invalid", e.f9596Z, abstractC1725n, 3456, 3);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                b.b(e.f9597h0, f.f9600Y, new Yg.r(2023, 1, 1), a12, abstractC1725n, 566, 8);
                return;
            case 4:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.onboarding_phone_number, abstractC1725n), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar6 = (r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                Fb.f fVar = new Fb.f();
                q.a(fVar, "", AbstractC4344b.F0(fVar), c4323o, null, null, abstractC1725n, 3120, 48);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f9594Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
