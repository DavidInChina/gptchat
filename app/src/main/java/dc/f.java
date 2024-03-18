package dc;

import K4.J;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Wh.p;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* loaded from: classes.dex */
public final class f extends o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28203Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2620a f28204Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(C2620a c2620a, int i10) {
        super(2);
        this.f28203Y = i10;
        this.f28204Z = c2620a;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28203Y;
        C2620a c2620a = this.f28204Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("BetaSettingsScreen");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                c2620a.getClass();
                j4.b(H.v(R.string.settings_beta_placeholder_title, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("BetaSettingsScreen");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                c2620a.getClass();
                C5953f c5953f = J.f9382i0;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.Science", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    p pVar = new p(0);
                    pVar.p(19.8f, 18.4f);
                    pVar.n(14.0f, 10.67f);
                    pVar.w(6.5f);
                    pVar.o(1.35f, -1.69f);
                    pVar.g(15.61f, 4.48f, 15.38f, 4.0f, 14.96f, 4.0f);
                    pVar.l(9.04f);
                    pVar.g(8.62f, 4.0f, 8.39f, 4.48f, 8.65f, 4.81f);
                    pVar.n(10.0f, 6.5f);
                    pVar.x(4.17f);
                    pVar.n(4.2f, 18.4f);
                    pVar.g(3.71f, 19.06f, 4.18f, 20.0f, 5.0f, 20.0f);
                    pVar.m(14.0f);
                    pVar.g(19.82f, 20.0f, 20.29f, 19.06f, 19.8f, 18.4f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    J.f9382i0 = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a10, 0L, abstractC1725n, 48, 12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28203Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
