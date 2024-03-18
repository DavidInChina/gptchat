package Cd;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0423g;
import E.C0424h;
import E.g0;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Qg.D0;
import W.AbstractC1523a1;
import W.C1588n1;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import Z.o1;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l0.C4323o;
import nf.AbstractC4828h;
import p9.AbstractC5102d;
import p9.AbstractC5103e;
import sb.C5605e;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f3004Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f3005Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Y.b f3006h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D0 f3007i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Ld.c f3008j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Ld.c f3009k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ X f3010l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f3011m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(wf.k kVar, g0 g0Var, Y.b bVar, D0 d02, Ld.c cVar, Ld.c cVar2, X x10, AbstractC6216a abstractC6216a) {
        super(2);
        this.f3004Y = kVar;
        this.f3005Z = g0Var;
        this.f3006h0 = bVar;
        this.f3007i0 = d02;
        this.f3008j0 = cVar;
        this.f3009k0 = cVar2;
        this.f3010l0 = x10;
        this.f3011m0 = abstractC6216a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0457, code lost:
        if (r6 == r5) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0101, code lost:
        if (id.AbstractC3557B.K(r1.K(), java.lang.Integer.valueOf(r4)) == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        C0423g c0423g;
        boolean z10;
        AbstractC4326r abstractC4326r;
        boolean z11;
        boolean z12;
        wf.k kVar;
        jf.y yVar;
        boolean z13;
        Throwable th2;
        C0581j c0581j;
        C0423g c0423g2;
        C0581j c0581j2;
        boolean z14;
        AbstractC4326r abstractC4326r2;
        C0581j c0581j3;
        float f6;
        Ld.c cVar;
        boolean z15;
        C0581j c0581j4;
        float f10;
        io.sentry.hints.i iVar;
        wf.k kVar2;
        boolean z16;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("VoiceModeScreenContent");
        int i10 = intValue & 11;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return yVar2;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(1022554053);
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (K10 == iVar2) {
            K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar2.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar2.t(false);
        C4316h c4316h = C4310b.f37706s0;
        rVar2.W(1022554243);
        wf.k kVar3 = this.f3004Y;
        boolean g10 = rVar2.g(kVar3);
        Object K11 = rVar2.K();
        if (g10 || K11 == iVar2) {
            K11 = AbstractC0044t0.z(14, kVar3, rVar2);
        }
        rVar2.t(false);
        AbstractC4326r h10 = androidx.compose.foundation.a.h(c4323o, (AbstractC6216a) K11);
        rVar2.W(1022554323);
        boolean g11 = rVar2.g(kVar3);
        Object K12 = rVar2.K();
        if (g11 || K12 == iVar2) {
            K12 = new G(abstractC1710f0, kVar3, null);
            rVar2.h0(K12);
        }
        rVar2.t(false);
        AbstractC4326r a10 = AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.layout.a.q(B0.I.a(h10, yVar2, (wf.n) K12).g(androidx.compose.foundation.layout.e.f24739c), this.f3005Z));
        rVar2.W(-483455358);
        C0423g c0423g3 = AbstractC0429m.f3909c;
        E0.N a11 = AbstractC0440y.a(c0423g3, c4316h, rVar2);
        rVar2.W(-1323940314);
        int i11 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i12 = androidx.compose.ui.layout.a.i(a10);
        boolean z17 = rVar2.f22696a instanceof AbstractC1707e;
        if (z17) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j5 = C0583l.f5808f;
            U3.f.n0(rVar2, a11, c0581j5);
            C0581j c0581j6 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j6);
            C0581j c0581j7 = C0583l.f5809g;
            if (!rVar2.f22695O) {
                c0423g = c0423g3;
            } else {
                c0423g = c0423g3;
            }
            AbstractC6463a.q(i11, rVar2, i11, c0581j7);
            AbstractC6463a.r(0, i12, new L0(rVar2), rVar2, 2058660585);
            E.A a12 = E.A.f3733a;
            AbstractC4326r a13 = io.sentry.compose.b.a("VoiceModeScreenContent");
            Y.b bVar = this.f3006h0;
            int i13 = bVar.f22009b;
            f8.e eVar = Y.a.f22003Z;
            if (Float.compare(f8.e.k(i13), f8.e.k(1)) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                abstractC4326r = AbstractC0044t0.P(a12, c4323o);
            } else {
                abstractC4326r = c4323o;
            }
            androidx.compose.foundation.layout.a.d(abstractC4326r, rVar2);
            f8.e eVar2 = Y.c.f22010Z;
            if (Float.compare(f8.e.j(bVar.f22008a), f8.e.j(1)) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (Float.compare(f8.e.k(bVar.f22009b), f8.e.k(1)) < 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                abstractC4326r2 = AbstractC0044t0.P(a12, c4323o);
                c0581j = c0581j7;
                z13 = z17;
                yVar = yVar2;
                c0581j2 = c0581j6;
                c0423g2 = c0423g;
                kVar = kVar3;
                z14 = false;
                th2 = null;
            } else {
                c0581j2 = c0581j6;
                z14 = false;
                c0423g2 = c0423g;
                c0581j = c0581j7;
                z13 = z17;
                th2 = null;
                yVar = yVar2;
                kVar = kVar3;
                abstractC4326r2 = androidx.compose.foundation.layout.e.l(c4323o, 0.0f, 0.0f, 0.0f, (float) RCHTTPStatusCodes.BAD_REQUEST, 7);
            }
            G0.X x10 = (G0.X) a13;
            AbstractC4326r a14 = AbstractC4194d.a(x10, abstractC4326r2);
            D0 d02 = this.f3007i0;
            Ld.c cVar2 = this.f3008j0;
            Ld.c cVar3 = this.f3009k0;
            boolean z18 = z14;
            Ad.l.z(d02, cVar2, cVar3, a14, 0, rVar2, 584, 16);
            AbstractC4326r d10 = androidx.compose.foundation.layout.e.d(c4323o, 1.0f);
            float f11 = p9.r.f42843g;
            AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(d10, f11, 0.0f, 2);
            if (z10) {
                t10 = AbstractC0044t0.P(a12, t10);
            }
            rVar2.W(733328855);
            E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, z18, rVar2);
            rVar2.W(-1323940314);
            int i14 = rVar2.P;
            AbstractC1732q0 p11 = rVar2.p();
            C3288a i15 = androidx.compose.ui.layout.a.i(t10);
            if (z13) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, c10, c0581j5);
                C0581j c0581j8 = c0581j2;
                U3.f.n0(rVar2, p11, c0581j8);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                    c0581j3 = c0581j;
                    AbstractC6463a.q(i14, rVar2, i14, c0581j3);
                } else {
                    c0581j3 = c0581j;
                }
                AbstractC6463a.r(0, i15, new L0(rVar2), rVar2, 2058660585);
                androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f24731a;
                rVar2.W(22103628);
                X x11 = this.f3010l0;
                if (!x11.f3036k.isEmpty()) {
                    cVar = cVar3;
                    f6 = f11;
                    AbstractC4326r j6 = androidx.compose.foundation.layout.e.j(androidx.compose.foundation.layout.a.t(bVar2.a(c4323o, C4310b.f37699l0), p9.r.f42839c, 0.0f, 2), p9.q.f42833d);
                    rVar2.W(22103991);
                    AbstractC6216a abstractC6216a = this.f3011m0;
                    boolean g12 = rVar2.g(abstractC6216a);
                    Object K13 = rVar2.K();
                    if (g12 || K13 == iVar2) {
                        K13 = new C5605e(abstractC6216a, 15);
                        rVar2.h0(K13);
                    }
                    z15 = false;
                    rVar2.t(false);
                    Bi.c.D(64, 0, rVar2, androidx.compose.foundation.a.h(j6, (AbstractC6216a) K13), x11.f3036k);
                } else {
                    cVar = cVar3;
                    f6 = f11;
                    z15 = false;
                }
                rVar2.t(z15);
                AbstractC4326r a15 = bVar2.a(c4323o, C4310b.f37697j0);
                rVar2.W(-483455358);
                E0.N a16 = AbstractC0440y.a(c0423g2, c4316h, rVar2);
                rVar2.W(-1323940314);
                int i16 = rVar2.P;
                AbstractC1732q0 p12 = rVar2.p();
                C3288a i17 = androidx.compose.ui.layout.a.i(a15);
                if (z13) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, a16, c0581j5);
                    U3.f.n0(rVar2, p12, c0581j8);
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar2, i16, c0581j3);
                    }
                    AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a17 = io.sentry.compose.b.a("VoiceModeScreenContent");
                    Ld.c cVar4 = cVar;
                    P4.a.h(x11, AbstractC4194d.a((G0.X) a17, androidx.compose.foundation.layout.a.v(c4323o, 0.0f, p9.r.f42839c, 0.0f, 0.0f, 13)), rVar2, 0, 0);
                    rVar2.W(22104535);
                    if (x11.f3029d) {
                        f10 = f6;
                        c0581j4 = c0581j3;
                        j4.b(Ng.H.v(R.string.voice_mode_poor_connection_quality, rVar2), a17, ((P0) rVar2.m(R0.f19593a)).f19539w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20310k, rVar2, 0, 0, 65530);
                    } else {
                        c0581j4 = c0581j3;
                        f10 = f6;
                    }
                    AbstractC6463a.v(rVar2, false, false, true, false);
                    AbstractC6463a.v(rVar2, false, false, true, false);
                    rVar2.t(false);
                    C4317i c4317i = C4310b.f37702o0;
                    C0424h c0424h = AbstractC0429m.f3912f;
                    AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(AbstractC4194d.a(x10, androidx.compose.foundation.layout.e.d(c4323o, 1.0f)), f10, p9.r.f42841e);
                    rVar2.W(693286680);
                    E0.N a18 = p0.a(c0424h, c4317i, rVar2);
                    rVar2.W(-1323940314);
                    int i18 = rVar2.P;
                    AbstractC1732q0 p13 = rVar2.p();
                    C3288a i19 = androidx.compose.ui.layout.a.i(s10);
                    if (z13) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, a18, c0581j5);
                        U3.f.n0(rVar2, p13, c0581j8);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i18))) {
                            AbstractC6463a.q(i18, rVar2, i18, c0581j4);
                        }
                        AbstractC6463a.r(0, i19, new L0(rVar2), rVar2, 2058660585);
                        AbstractC4326r a19 = io.sentry.compose.b.a("VoiceModeScreenContent");
                        EnumC0322g enumC0322g = x11.f3039n;
                        int ordinal = enumC0322g.ordinal();
                        if (ordinal != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                rVar2.W(22107220);
                                rVar2.t(false);
                                kVar2 = kVar;
                                iVar = iVar2;
                            } else {
                                rVar2.W(22106493);
                                AbstractC4326r a20 = AbstractC4194d.a((G0.X) a19, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42834e));
                                C1588n1 g13 = AbstractC1523a1.g(AbstractC5102d.f42767d, 0L, 0L, rVar2, 0, 14);
                                rVar2.W(22106557);
                                kVar2 = kVar;
                                boolean g14 = rVar2.g(kVar2);
                                Object K14 = rVar2.K();
                                if (!g14) {
                                    iVar = iVar2;
                                } else {
                                    iVar = iVar2;
                                }
                                K14 = AbstractC0044t0.z(16, kVar2, rVar2);
                                rVar2.t(false);
                                R4.b.o(K14, a20, false, g13, null, AbstractC0321f.f3050a, rVar2, 196608, 20);
                                rVar2.t(false);
                            }
                        } else {
                            kVar2 = kVar;
                            iVar = iVar2;
                            rVar2.W(22105505);
                            AbstractC4326r a21 = AbstractC4194d.a((G0.X) a19, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42834e));
                            if (enumC0322g != EnumC0322g.f3052Y) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C1588n1 g15 = AbstractC1523a1.g(r0.r.f44255c, 0L, AbstractC5103e.f42773d, rVar2, 6, 10);
                            rVar2.W(22105662);
                            boolean g16 = rVar2.g(kVar2);
                            Object K15 = rVar2.K();
                            if (g16 || K15 == iVar) {
                                K15 = AbstractC0044t0.z(15, kVar2, rVar2);
                            }
                            rVar2.t(false);
                            R4.b.o(K15, a21, z16, g15, null, R4.b.X(rVar2, -244347185, new Jb.c(12, x11)), rVar2, 196608, 16);
                            rVar2.t(false);
                        }
                        AbstractC3557B.G(d02, cVar2, cVar4, a19, rVar2, 584, 8);
                        AbstractC4326r a22 = AbstractC4194d.a((G0.X) a19, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42834e));
                        C1588n1 g17 = AbstractC1523a1.g(r0.r.f44259g, 0L, 0L, rVar2, 6, 14);
                        rVar2.W(22107606);
                        boolean g18 = rVar2.g(kVar2);
                        Object K16 = rVar2.K();
                        if (g18 || K16 == iVar) {
                            K16 = AbstractC0044t0.z(17, kVar2, rVar2);
                        }
                        rVar2.t(false);
                        R4.b.o(K16, a22, false, g17, null, AbstractC0321f.f3051b, rVar2, 196608, 20);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        return yVar;
                    }
                    R4.b.r1();
                    throw th2;
                }
                R4.b.r1();
                throw th2;
            }
            R4.b.r1();
            throw th2;
        }
        R4.b.r1();
        throw null;
    }
}
