package Hd;

import Cd.X;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import E.p0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L0.u;
import Ng.F;
import Ng.H;
import W.AbstractC1607r1;
import W.C1550f3;
import W.j4;
import Wh.p;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import q1.AbstractC5260f;
import sb.C5605e;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wf.AbstractC6216a;
import wf.n;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class f extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f7640Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7641Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X f7642h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f7643i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ F f7644j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f7645k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f7646l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(float f6, AbstractC6216a abstractC6216a, X x10, String str, F f10, C1550f3 c1550f3, C1550f3 c1550f32) {
        super(2);
        this.f7640Y = f6;
        this.f7641Z = abstractC6216a;
        this.f7642h0 = x10;
        this.f7643i0 = str;
        this.f7644j0 = f10;
        this.f7645k0 = c1550f3;
        this.f7646l0 = c1550f32;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        float f6 = this.f7640Y;
        AbstractC4326r a5 = androidx.compose.animation.a.a(androidx.compose.foundation.a.n(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.m(c4323o, f6), f6), p9.r.f42841e), androidx.compose.foundation.a.l(abstractC1725n)));
        r rVar2 = (r) abstractC1725n;
        rVar2.W(-219192449);
        AbstractC6216a abstractC6216a = this.f7641Z;
        boolean g10 = rVar2.g(abstractC6216a);
        Object K10 = rVar2.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new C5605e(abstractC6216a, 18);
            rVar2.h0(K10);
        }
        rVar2.t(false);
        AbstractC4326r h10 = androidx.compose.foundation.a.h(a5, (AbstractC6216a) K10);
        C0421f c0421f = AbstractC0429m.f3907a;
        C0426j g11 = AbstractC0429m.g(p9.r.f42840d);
        rVar2.W(-483455358);
        N a10 = AbstractC0440y.a(g11, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(h10);
        boolean z10 = rVar2.f22696a instanceof AbstractC1707e;
        if (z10) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar2, a10, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j3);
            }
            AbstractC6463a.r(0, i11, new L0(rVar2), rVar2, 2058660585);
            AbstractC4326r a11 = io.sentry.compose.b.a("DebugVoiceContent");
            AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
            C4317i c4317i = C4310b.f37703p0;
            rVar2.W(693286680);
            N a12 = p0.a(AbstractC0429m.f3907a, c4317i, rVar2);
            rVar2.W(-1323940314);
            int i12 = rVar2.P;
            AbstractC1732q0 p11 = rVar2.p();
            C3288a i13 = androidx.compose.ui.layout.a.i(d10);
            if (z10) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a12, c0581j);
                U3.f.n0(rVar2, p11, c0581j2);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                    AbstractC6463a.q(i12, rVar2, i12, c0581j3);
                }
                AbstractC6463a.r(0, i13, new L0(rVar2), rVar2, 2058660585);
                AbstractC4326r a13 = io.sentry.compose.b.a("DebugVoiceContent");
                String v10 = H.v(R.string.voice_debug_title, rVar2);
                if (1.0f > 0.0d) {
                    AbstractC4326r a14 = AbstractC4194d.a((G0.X) a13, new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), true));
                    long j6 = r0.r.f44258f;
                    j4.b(v10, a14, j6, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, null, rVar2, 384, 0, 130552);
                    C5953f c5953f = Ad.l.f817c;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Filled.PictureInPicture", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = AbstractC5944H.f46870a;
                        r0.N n10 = new r0.N(r0.r.f44254b);
                        p pVar = new p(0);
                        pVar.p(19.0f, 7.0f);
                        pVar.m(-8.0f);
                        pVar.x(6.0f);
                        pVar.m(8.0f);
                        pVar.n(19.0f, 7.0f);
                        pVar.f();
                        pVar.p(21.0f, 3.0f);
                        pVar.n(3.0f, 3.0f);
                        pVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        pVar.x(14.0f);
                        pVar.h(0.0f, 1.1f, 0.9f, 1.98f, 2.0f, 1.98f);
                        pVar.m(18.0f);
                        pVar.h(1.1f, 0.0f, 2.0f, -0.88f, 2.0f, -1.98f);
                        pVar.n(23.0f, 5.0f);
                        pVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        pVar.f();
                        pVar.p(21.0f, 19.01f);
                        pVar.n(3.0f, 19.01f);
                        pVar.n(3.0f, 4.98f);
                        pVar.m(18.0f);
                        pVar.x(14.03f);
                        pVar.f();
                        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        Ad.l.f817c = c5953f;
                    }
                    AbstractC1607r1.b(c5953f, this.f7643i0, a13, j6, rVar2, 3072, 4);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    String v11 = H.v(R.string.voice_debug_room_id, rVar2);
                    X x10 = this.f7642h0;
                    AbstractC5260f.c(v11, x10.f3038m.f7610a, a11, null, false, false, rVar2, 0, 60);
                    String v12 = H.v(R.string.voice_debug_sessions_id, rVar2);
                    b bVar = x10.f3038m;
                    AbstractC5260f.c(v12, bVar.f7612c, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_conversation_id, rVar2), bVar.f7611b, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_parent_message_id, rVar2), bVar.f7613d, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_model_slug, rVar2), bVar.f7614e, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_language_code, rVar2), bVar.f7615f, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_gizmo_id, rVar2), bVar.f7616g, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_connection_quality, rVar2), bVar.f7623n, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_remote_state, rVar2), bVar.f7618i.toString(), a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_connection_state, rVar2), bVar.f7617h.toString(), a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_remote_participant, rVar2), bVar.f7625p, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_local_participant, rVar2), bVar.f7624o, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_connection_latency, rVar2), String.valueOf(bVar.f7619j), a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_listening_latency, rVar2), String.valueOf(bVar.f7620k), a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_use_api_staging, rVar2), bVar.f7626q, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_use_auth_staging, rVar2), bVar.f7627r, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_voice_api_host, rVar2), bVar.f7628s, a11, null, false, false, rVar2, 0, 60);
                    AbstractC5260f.c(H.v(R.string.voice_debug_token_request, rVar2), String.valueOf(bVar.f7632w), a11, null, false, true, rVar2, 196608, 28);
                    String v13 = H.v(R.string.voice_debug_voice_message_received, rVar2);
                    String valueOf = String.valueOf(bVar.f7630u.size());
                    F f10 = this.f7644j0;
                    AbstractC5260f.c(v13, valueOf, a11, new d(f10, this.f7645k0, 0), true, false, rVar2, 24576, 36);
                    AbstractC5260f.c(H.v(R.string.voice_debug_voice_message_sent, rVar2), String.valueOf(bVar.f7631v.size()), a11, new d(f10, this.f7646l0, 1), true, false, rVar2, 24576, 36);
                    AbstractC6463a.v(rVar2, false, true, false, false);
                    return y.f36177a;
                }
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            R4.b.r1();
            throw null;
        }
        R4.b.r1();
        throw null;
    }
}
