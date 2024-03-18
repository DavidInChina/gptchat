package Ec;

import Df.AbstractC0408g;
import E.AbstractC0434s;
import E.B0;
import E.D0;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.Z;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.L0;
import android.content.Context;
import com.openai.chatgpt.R;
import h.C3287m;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.WeakHashMap;
import k.C4145a;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f4644Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f4645Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f4646h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f4647i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z10, AbstractC0408g abstractC0408g, H h10, AbstractC6216a abstractC6216a) {
        super(2);
        this.f4644Y = z10;
        this.f4645Z = abstractC0408g;
        this.f4646h0 = h10;
        this.f4647i0 = abstractC6216a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        C0581j c0581j;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        int i10 = intValue & 11;
        jf.y yVar = jf.y.f36177a;
        if (i10 == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return yVar;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(1596175702);
        WeakHashMap weakHashMap = B0.f3736v;
        B0 c10 = E.G.c(rVar2);
        rVar2.t(false);
        AbstractC4326r a5 = D0.a(c4323o, c10.f3741e);
        rVar2.W(733328855);
        C4318j c4318j = C4310b.f37693Y;
        N c11 = AbstractC0434s.c(c4318j, true, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(a5);
        boolean z12 = rVar2.f22696a instanceof AbstractC1707e;
        if (z12) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j2 = C0583l.f5808f;
            U3.f.n0(rVar2, c11, c0581j2);
            C0581j c0581j3 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j3);
            C0581j c0581j4 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i11))) {
                AbstractC6463a.q(i11, rVar2, i11, c0581j4);
            }
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            AbstractC4326r a10 = io.sentry.compose.b.a("WhisperPanel");
            rVar2.W(-1073271083);
            if (this.f4644Y) {
                rVar2.W(923020361);
                a7.i iVar = a7.i.f23921Y;
                rVar2.W(1424240517);
                Context context = (Context) rVar2.m(Z.f6888b);
                rVar2.W(1157296644);
                boolean g10 = rVar2.g("android.permission.RECORD_AUDIO");
                Object K10 = rVar2.K();
                io.sentry.hints.i iVar2 = C1723m.f22654Y;
                if (!g10 && K10 != iVar2) {
                    c0581j = c0581j4;
                } else {
                    c0581j = c0581j4;
                    K10 = new a7.g("android.permission.RECORD_AUDIO", context, AbstractC4344b.h0(context));
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                a7.g gVar = (a7.g) K10;
                AbstractC4344b.I(gVar, null, rVar2, 0, 2);
                C4145a c4145a = new C4145a(1);
                rVar2.W(511388516);
                boolean g11 = rVar2.g(gVar) | rVar2.g(iVar);
                Object K11 = rVar2.K();
                if (g11 || K11 == iVar2) {
                    K11 = new s3.r(gVar, 10, iVar);
                    rVar2.h0(K11);
                }
                rVar2.t(false);
                C3287m G10 = kotlin.jvm.internal.m.G(c4145a, (wf.k) K11, rVar2);
                AbstractC1734s.a(gVar, G10, new a7.f(gVar, G10, 1), rVar2);
                rVar2.t(false);
                rVar2.t(false);
                a7.l b10 = gVar.b();
                AbstractC3557B.c0("<this>", b10);
                boolean K12 = AbstractC3557B.K(b10, a7.k.f23923a);
                AbstractC6216a abstractC6216a = this.f4647i0;
                if (K12) {
                    rVar2.W(-1301545030);
                    rVar2.W(-1301545009);
                    AbstractC0408g abstractC0408g = this.f4645Z;
                    boolean g12 = rVar2.g(abstractC0408g);
                    Object K13 = rVar2.K();
                    if (g12 || K13 == iVar2) {
                        K13 = new s(abstractC0408g, null);
                        rVar2.h0(K13);
                    }
                    rVar2.t(false);
                    AbstractC1734s.e(yVar, (wf.n) K13, rVar2);
                    rVar2.W(-1301544806);
                    boolean g13 = rVar2.g(abstractC0408g);
                    Object K14 = rVar2.K();
                    if (g13 || K14 == iVar2) {
                        K14 = AbstractC6463a.g(abstractC0408g, 23, rVar2);
                    }
                    AbstractC6216a abstractC6216a2 = K14;
                    rVar2.t(false);
                    rVar2.W(-1301544727);
                    boolean g14 = rVar2.g(abstractC0408g);
                    Object K15 = rVar2.K();
                    if (g14 || K15 == iVar2) {
                        K15 = AbstractC6463a.g(abstractC0408g, 24, rVar2);
                    }
                    AbstractC6216a abstractC6216a3 = K15;
                    rVar2.t(false);
                    rVar2.W(-1301544646);
                    boolean g15 = rVar2.g(abstractC0408g);
                    Object K16 = rVar2.K();
                    if (g15 || K16 == iVar2) {
                        K16 = AbstractC6463a.g(abstractC0408g, 25, rVar2);
                    }
                    rVar2.t(false);
                    z10 = true;
                    y.d(this.f4646h0, abstractC6216a2, abstractC6216a3, K16, abstractC6216a, a10, rVar2, 0, 32);
                    rVar2.t(false);
                } else {
                    z10 = true;
                    if (AbstractC4344b.w0(gVar.b())) {
                        rVar2.W(-1301544448);
                        String v10 = Ng.H.v(R.string.whisper_permission_rationale, rVar2);
                        String v11 = Ng.H.v(R.string.whisper_permission_request, rVar2);
                        rVar2.W(-1301544203);
                        boolean g16 = rVar2.g(gVar);
                        Object K17 = rVar2.K();
                        if (g16 || K17 == iVar2) {
                            K17 = new zc.u(1, gVar);
                            rVar2.h0(K17);
                        }
                        rVar2.t(false);
                        y.a(v10, v11, (AbstractC6216a) K17, abstractC6216a, a10, rVar2, 0, 16);
                        rVar2.t(false);
                    } else {
                        rVar2.W(-1301544041);
                        rVar2.W(-1301544020);
                        boolean g17 = rVar2.g(gVar);
                        Object K18 = rVar2.K();
                        if (g17 || K18 == iVar2) {
                            K18 = new t(gVar, null);
                            rVar2.h0(K18);
                        }
                        rVar2.t(false);
                        AbstractC1734s.e(yVar, (wf.n) K18, rVar2);
                        rVar2.W(733328855);
                        N c12 = AbstractC0434s.c(c4318j, false, rVar2);
                        rVar2.W(-1323940314);
                        int i13 = rVar2.P;
                        AbstractC1732q0 p11 = rVar2.p();
                        C3288a i14 = androidx.compose.ui.layout.a.i(c4323o);
                        if (z12) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, c12, c0581j2);
                            U3.f.n0(rVar2, p11, c0581j3);
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i13))) {
                                AbstractC6463a.q(i13, rVar2, i13, c0581j);
                            }
                            AbstractC6463a.r(0, i14, new L0(rVar2), rVar2, 2058660585);
                            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                            j4.b(Ng.H.v(R.string.whisper_permission_denied, rVar2), bVar.a(c4323o, C4310b.f37697j0), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131068);
                            R4.b.o(abstractC6216a, androidx.compose.foundation.layout.a.r(bVar.a(c4323o, C4310b.f37695h0), p9.r.f42840d), false, null, null, AbstractC0498e.f4618a, rVar2, 196608, 28);
                            z11 = false;
                            AbstractC6463a.v(rVar2, false, true, false, false);
                            rVar2.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                }
                z11 = false;
            } else {
                z11 = false;
                z10 = true;
            }
            AbstractC6463a.v(rVar2, z11, z11, z10, z11);
            rVar2.t(z11);
            return yVar;
        }
        R4.b.r1();
        throw null;
    }
}
