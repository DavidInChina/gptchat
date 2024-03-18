package Wb;

import E.AbstractC0441z;
import E.g0;
import E.q0;
import G0.X;
import H0.AbstractC0701r0;
import H0.W0;
import Ng.H;
import W.j4;
import Wh.p;
import Z.AbstractC1725n;
import Z.r;
import androidx.compose.foundation.layout.e;
import id.AbstractC3557B;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* loaded from: classes.dex */
public final class a extends o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f20882Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f20883h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f20884i0 = new a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20885Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f20885Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        switch (this.f20885Y) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Button", (q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                j4.b("Download internal app", a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 6, 0, 131070);
                return yVar;
            case 1:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$HeroContent", (AbstractC0441z) obj);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue2 & 81) == 16) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                r rVar3 = (r) abstractC1725n2;
                H.a(new b((W0) rVar3.m(AbstractC0701r0.f7012o), 0), AbstractC4194d.a((X) a10, e.d(c4323o, 1.0f)), false, null, null, null, null, null, null, c.f20888a, rVar3, 805306416, 508);
                return yVar;
            default:
                g0 g0Var = (g0) obj;
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3557B.c0("paddings", g0Var);
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue3 & 14) == 0) {
                    if (((r) abstractC1725n3).g(g0Var)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue3 |= i10;
                }
                if ((intValue3 & 91) == 18) {
                    r rVar4 = (r) abstractC1725n3;
                    if (rVar4.B()) {
                        rVar4.P();
                        return yVar;
                    }
                }
                C5953f c5953f = AbstractC3557B.f33078a;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    p p10 = R.a.p(0, 12.0f, 2.0f);
                    p10.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    p10.u(4.48f, 10.0f, 10.0f, 10.0f);
                    p10.u(10.0f, -4.48f, 10.0f, -10.0f);
                    p10.t(17.52f, 2.0f, 12.0f, 2.0f);
                    p10.f();
                    p10.p(13.0f, 17.0f);
                    p10.m(-2.0f);
                    p10.x(-6.0f);
                    p10.m(2.0f);
                    p10.x(6.0f);
                    p10.f();
                    p10.p(13.0f, 9.0f);
                    p10.m(-2.0f);
                    p10.n(11.0f, 7.0f);
                    p10.m(2.0f);
                    p10.x(2.0f);
                    p10.f();
                    C5952e.b(c5952e, p10.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    AbstractC3557B.f33078a = c5953f;
                }
                r9.y.l(AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.a.q(e.f24739c, g0Var)), c5953f, "OpenAI internal testing", "OpenAI employees are required to use the internal app version to access ChatGPT.", c.f20889b, abstractC1725n3, 28032, 0);
                return yVar;
        }
    }
}
