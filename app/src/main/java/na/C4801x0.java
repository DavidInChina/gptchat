package na;

import E.AbstractC0429m;
import E.C0421f;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import y.AbstractC6463a;

/* renamed from: na.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4801x0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40144Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D1 f40145Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4801x0(D1 d12, int i10) {
        super(2);
        this.f40144Y = i10;
        this.f40145Z = d12;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        String str;
        C5953f c5953f;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f40144Y;
        D1 d12 = this.f40145Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationMenu");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                if (d12.f39756K) {
                    AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.check, abstractC1725n), null, a5, 0L, abstractC1725n, 56, 12);
                    return;
                }
                return;
            case 1:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(693286680);
                E0.N a10 = E.p0.a(g10, C4310b.f37702o0, rVar3);
                rVar3.W(-1323940314);
                int i12 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(c4323o);
                String str2 = null;
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, a10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar3, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new Z.L0(rVar3), rVar3, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("ConversationMenu");
                    j4.b(Ng.H.v(R.string.conversations_menu_model, rVar3), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131070);
                    Sc.n a12 = d12.f39767f.a();
                    if (a12 != null) {
                        str2 = a12.f16536d;
                    }
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    j4.b(str, a11, ((W.P0) rVar3.m(W.R0.f19593a)).f19529m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131066);
                    AbstractC6463a.v(rVar3, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC4326r a13 = io.sentry.compose.b.a("InputFieldIcon");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                if (d12.f39779r) {
                    c5953f = Gi.e.f6520e;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Outlined.MicOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = AbstractC5944H.f46870a;
                        r0.N n10 = new r0.N(r0.r.f44254b);
                        Wh.p p11 = R.a.p(0, 10.8f, 4.9f);
                        p11.h(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
                        p11.u(1.2f, 0.54f, 1.2f, 1.2f);
                        p11.o(-0.01f, 3.91f);
                        p11.n(15.0f, 10.6f);
                        p11.w(5.0f);
                        p11.h(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                        p11.h(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f);
                        p11.o(1.76f, 1.76f);
                        p11.w(4.9f);
                        p11.f();
                        p11.p(19.0f, 11.0f);
                        p11.m(-1.7f);
                        p11.h(0.0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f);
                        p11.o(1.27f, 1.27f);
                        p11.h(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f);
                        p11.f();
                        p11.p(4.41f, 2.86f);
                        p11.n(3.0f, 4.27f);
                        p11.o(6.0f, 6.0f);
                        p11.w(11.0f);
                        p11.h(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                        p11.h(0.23f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
                        p11.o(1.66f, 1.66f);
                        p11.h(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
                        p11.h(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
                        p11.l(5.0f);
                        p11.h(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
                        p11.w(21.0f);
                        p11.m(2.0f);
                        p11.x(-3.28f);
                        p11.h(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f);
                        p11.o(4.2f, 4.2f);
                        p11.o(1.41f, -1.41f);
                        p11.n(4.41f, 2.86f);
                        p11.f();
                        C5952e.b(c5952e, p11.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        Gi.e.f6520e = c5953f;
                    }
                } else {
                    c5953f = Df.H.Q();
                }
                AbstractC1607r1.b(c5953f, Ng.H.v(R.string.conversations_conversation_whisper_button, abstractC1725n), a13, 0L, abstractC1725n, 0, 12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40144Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
