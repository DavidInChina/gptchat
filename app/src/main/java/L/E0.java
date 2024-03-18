package L;

import E.AbstractC0429m;
import E.AbstractC0434s;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import ca.EnumC2323o;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.C3959i;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import l8.AbstractC4344b;
import p9.AbstractC5103e;
import ub.AbstractC5875D;
import ub.C5873B;
import v0.C5952e;
import v0.C5953f;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class E0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9904Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9905Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f9906h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f9907i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f9908j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f9909k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f9910l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f9911m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f9912n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f9913o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(P0 p02, N.t0 t0Var, T0.z zVar, boolean z10, boolean z11, T0.s sVar, R0 r02, G g10, int i10) {
        super(3);
        this.f9908j0 = p02;
        this.f9909k0 = t0Var;
        this.f9910l0 = zVar;
        this.f9905Z = z10;
        this.f9906h0 = z11;
        this.f9911m0 = sVar;
        this.f9912n0 = r02;
        this.f9913o0 = g10;
        this.f9907i0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bf, code lost:
        if (id.AbstractC3557B.K(r12.K(), java.lang.Integer.valueOf(r15)) == false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v4, types: [wf.k, kotlin.jvm.internal.j] */
    @Override // wf.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Yg.p pVar;
        C3959i c3959i;
        float f6;
        C3959i c3959i2;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i10 = this.f9904Y;
        Object obj4 = this.f9913o0;
        Object obj5 = this.f9912n0;
        Object obj6 = this.f9911m0;
        Object obj7 = this.f9910l0;
        Object obj8 = this.f9909k0;
        Object obj9 = this.f9908j0;
        switch (i10) {
            case 0:
                AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
                ((Number) obj3).intValue();
                Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
                Object i11 = AbstractC6463a.i(rVar, 2057323757, -492369756);
                if (i11 == iVar) {
                    i11 = new Object();
                    rVar.h0(i11);
                }
                rVar.t(false);
                N.x0 x0Var = (N.x0) i11;
                rVar.W(-492369756);
                Object K10 = rVar.K();
                if (K10 == iVar) {
                    K10 = new Object();
                    rVar.h0(K10);
                }
                rVar.t(false);
                wf.k kVar = (wf.k) obj4;
                boolean z10 = this.f9906h0;
                int i12 = this.f9907i0;
                boolean z11 = this.f9905Z;
                AbstractC4326r d10 = androidx.compose.ui.input.key.a.d(c4323o, new kotlin.jvm.internal.j(1, new C0((P0) obj9, (N.t0) obj8, (T0.z) obj7, z11, z10, x0Var, (T0.s) obj6, (R0) obj5, (V) K10, kVar, i12), C0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0));
                rVar.t(false);
                return d10;
            default:
                ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$AnimatedVisibility", (y.L) obj);
                L0.u uVar = io.sentry.compose.b.f34309a;
                Z.r rVar2 = (Z.r) ((AbstractC1725n) obj2);
                AbstractC4326r d11 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.e.d((AbstractC4326r) obj9, 1.0f), 0.0f, 10, 0.0f, 0.0f, 13), ((W.P0) rVar2.m(W.R0.f19593a)).f19532p, r0.G.f44171a);
                String str = (String) obj8;
                EnumC2323o enumC2323o = (EnumC2323o) obj7;
                z4.o oVar = (z4.o) obj6;
                Yg.p pVar2 = (Yg.p) obj5;
                Yg.p pVar3 = (Yg.p) obj4;
                rVar2.W(693286680);
                E0.N a5 = E.p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar2);
                rVar2.W(-1323940314);
                int i13 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i14 = androidx.compose.ui.layout.a.i(d11);
                boolean z12 = rVar2.f22696a instanceof AbstractC1707e;
                if (z12) {
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
                    if (!rVar2.f22695O) {
                        pVar = pVar3;
                        break;
                    } else {
                        pVar = pVar3;
                    }
                    AbstractC6463a.q(i13, rVar2, i13, c0581j3);
                    AbstractC6463a.t(rVar2, i14, rVar2, 0, 2058660585);
                    C4318j c4318j = C4310b.f37697j0;
                    rVar2.W(733328855);
                    E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                    rVar2.W(-1323940314);
                    int i15 = rVar2.P;
                    AbstractC1732q0 p11 = rVar2.p();
                    C3288a i16 = androidx.compose.ui.layout.a.i(c4323o);
                    if (z12) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, c10, c0581j);
                        U3.f.n0(rVar2, p11, c0581j2);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i15))) {
                            AbstractC6463a.q(i15, rVar2, i15, c0581j3);
                        }
                        AbstractC6463a.t(rVar2, i16, rVar2, 0, 2058660585);
                        AbstractC4326r a10 = io.sentry.compose.b.a("ToolStatusCardInternal");
                        int ordinal = enumC2323o.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        C5953f c5953f = AbstractC4344b.f37866j;
                                        if (c5953f == null) {
                                            float f10 = (float) 20.0d;
                                            C5952e c5952e = new C5952e("Failed", f10, f10, 20.0f, 20.0f, 0L, 0, false, 224);
                                            r0.N n10 = new r0.N(androidx.compose.ui.graphics.a.c(4292467171L));
                                            Wh.p pVar4 = new Wh.p(0);
                                            pVar4.p(10.0f, 0.0f);
                                            pVar4.n(10.0f, 0.0f);
                                            pVar4.c(10.0f, 10.0f, true, 20.0f, 10.0f);
                                            pVar4.n(20.0f, 10.0f);
                                            pVar4.c(10.0f, 10.0f, true, 10.0f, 20.0f);
                                            pVar4.n(10.0f, 20.0f);
                                            pVar4.c(10.0f, 10.0f, true, 0.0f, 10.0f);
                                            pVar4.n(0.0f, 10.0f);
                                            pVar4.c(10.0f, 10.0f, true, 10.0f, 0.0f);
                                            pVar4.f();
                                            C5952e.b(c5952e, pVar4.f21239a, 0, n10, null, 0.0f, 0, 0, 4.0f);
                                            r0.N n11 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                                            r0.N n12 = new r0.N(androidx.compose.ui.graphics.a.c(4294967295L));
                                            ArrayList arrayList = new ArrayList(32);
                                            arrayList.add(new v0.n(12.75f, 13.5f));
                                            arrayList.add(new v0.m(7.25f, 7.0f));
                                            C5952e.b(c5952e, arrayList, 0, n11, n12, 1.5f, 1, 1, 4.0f);
                                            r0.N n13 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                                            r0.N n14 = new r0.N(androidx.compose.ui.graphics.a.c(4294967295L));
                                            ArrayList arrayList2 = new ArrayList(32);
                                            arrayList2.add(new v0.n(7.25f, 13.5f));
                                            arrayList2.add(new v0.m(12.75f, 7.0f));
                                            C5952e.b(c5952e, arrayList2, 0, n13, n14, 1.5f, 1, 1, 4.0f);
                                            c5953f = c5952e.c();
                                            AbstractC4344b.f37866j = c5953f;
                                        }
                                        c3959i2 = new C3959i(c5953f, null);
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    C5953f c5953f2 = L4.a.f10743i;
                                    if (c5953f2 == null) {
                                        float f11 = (float) 20.0d;
                                        C5952e c5952e2 = new C5952e("Stopped", f11, f11, 20.0f, 20.0f, 0L, 0, false, 224);
                                        r0.N n15 = new r0.N(androidx.compose.ui.graphics.a.c(4292467171L));
                                        ArrayList arrayList3 = new ArrayList(32);
                                        arrayList3.add(new v0.n(10.0f, 10.0f));
                                        arrayList3.add(new v0.v(-10.0f, 0.0f));
                                        arrayList3.add(new v0.r(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f));
                                        arrayList3.add(new v0.r(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f));
                                        C5952e.b(c5952e2, arrayList3, 0, n15, null, 0.0f, 0, 0, 4.0f);
                                        r0.N n16 = new r0.N(androidx.compose.ui.graphics.a.c(4289506494L));
                                        Wh.p pVar5 = new Wh.p(0);
                                        pVar5.p(8.0f, 6.5f);
                                        pVar5.n(12.0f, 6.5f);
                                        pVar5.c(1.5f, 1.5f, true, 13.5f, 8.0f);
                                        pVar5.n(13.5f, 12.0f);
                                        pVar5.c(1.5f, 1.5f, true, 12.0f, 13.5f);
                                        pVar5.n(8.0f, 13.5f);
                                        pVar5.c(1.5f, 1.5f, true, 6.5f, 12.0f);
                                        pVar5.n(6.5f, 8.0f);
                                        pVar5.c(1.5f, 1.5f, true, 8.0f, 6.5f);
                                        pVar5.f();
                                        C5952e.b(c5952e2, pVar5.f21239a, 0, n16, null, 0.0f, 0, 0, 4.0f);
                                        c5953f2 = c5952e2.c();
                                        L4.a.f10743i = c5953f2;
                                    }
                                    c3959i2 = new C3959i(c5953f2, null);
                                }
                            } else {
                                C5953f c5953f3 = com.google.android.gms.internal.play_billing.N.f26872e;
                                if (c5953f3 == null) {
                                    float f12 = (float) 20.0d;
                                    C5952e c5952e3 = new C5952e("Done", f12, f12, 20.0f, 20.0f, 0L, 0, false, 224);
                                    r0.N n17 = new r0.N(AbstractC5103e.f42770a);
                                    Wh.p pVar6 = new Wh.p(0);
                                    pVar6.p(10.0f, 0.0f);
                                    pVar6.n(10.0f, 0.0f);
                                    pVar6.c(10.0f, 10.0f, true, 20.0f, 10.0f);
                                    pVar6.n(20.0f, 10.0f);
                                    pVar6.c(10.0f, 10.0f, true, 10.0f, 20.0f);
                                    pVar6.n(10.0f, 20.0f);
                                    pVar6.c(10.0f, 10.0f, true, 0.0f, 10.0f);
                                    pVar6.n(0.0f, 10.0f);
                                    pVar6.c(10.0f, 10.0f, true, 10.0f, 0.0f);
                                    pVar6.f();
                                    C5952e.b(c5952e3, pVar6.f21239a, 0, n17, null, 0.0f, 0, 0, 4.0f);
                                    r0.N n18 = new r0.N(androidx.compose.ui.graphics.a.b(0));
                                    r0.N n19 = new r0.N(androidx.compose.ui.graphics.a.c(4294967295L));
                                    ArrayList arrayList4 = new ArrayList(32);
                                    arrayList4.add(new v0.n(6.75f, 10.6111f));
                                    arrayList4.add(new v0.m(8.9167f, 13.5f));
                                    arrayList4.add(new v0.m(13.25f, 7.0f));
                                    C5952e.b(c5952e3, arrayList4, 0, n18, n19, 1.5f, 1, 1, 4.0f);
                                    c5953f3 = c5952e3.c();
                                    com.google.android.gms.internal.play_billing.N.f26872e = c5953f3;
                                }
                                c3959i2 = new C3959i(c5953f3, null);
                            }
                            c3959i = c3959i2;
                        } else {
                            c3959i = new C3959i(null, oVar);
                        }
                        ub.r rVar3 = ub.r.f46592l0;
                        boolean z13 = this.f9905Z;
                        U3.f.a(c3959i, a10, rVar3, null, "", null, R4.b.X(rVar2, 1955194764, new gb.C(1, z13)), rVar2, 1597824, 42);
                        rVar2.W(1471790255);
                        if (enumC2323o == EnumC2323o.f26406Y || (enumC2323o == EnumC2323o.f26407Z && pVar2 != null)) {
                            float f13 = AbstractC5875D.f46525a;
                            L0.u uVar2 = io.sentry.compose.b.f34309a;
                            rVar2.W(-29479688);
                            if (z13) {
                                rVar2.t(false);
                                f6 = 0.0f;
                            } else {
                                Yg.p.Companion.getClass();
                                Yg.p pVar7 = new Yg.p(AbstractC6463a.n("instant(...)"));
                                long e10 = Mg.b.e(pVar7.b(pVar));
                                if (e10 < 10000) {
                                    f6 = ((float) e10) / (((float) 10000) * 2.0f);
                                } else {
                                    f6 = (((float) (1 - Math.exp(((-(0.5f / ((float) 10000))) / 0.45f) * (e10 - 10000)))) * 0.45f) + 0.5f;
                                }
                                if (pVar2 != null) {
                                    f6 = AbstractC6463a.d(1, f6, Math.min(1.0f, Math.max(0.0f, ((float) Mg.b.e(pVar7.b(pVar2))) / 1200.0f)), f6);
                                }
                                rVar2.t(false);
                            }
                            AbstractC4326r a11 = AbstractC4194d.a((G0.X) a10, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b + AbstractC5875D.f46526b));
                            float f14 = AbstractC5875D.f46525a;
                            long j6 = AbstractC5103e.f42770a;
                            long b10 = r0.r.b(j6, 0.2f);
                            rVar2.W(-1264182106);
                            boolean d12 = rVar2.d(f6);
                            Object K11 = rVar2.K();
                            if (d12 || K11 == iVar) {
                                K11 = new S5.a(3, f6);
                                rVar2.h0(K11);
                            }
                            rVar2.t(false);
                            I2.a((AbstractC6216a) K11, a11, j6, f14, b10, 1, rVar2, 3072, 0);
                        }
                        AbstractC6463a.v(rVar2, false, false, true, false);
                        rVar2.t(false);
                        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), rVar2);
                        U3.f.a(str, c4323o, ub.r.f46595o0, null, "", null, R4.b.X(rVar2, 145820029, new C5873B(this.f9907i0, this.f9906h0)), rVar2, 1597824, 42);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        return jf.y.f36177a;
                    }
                    R4.b.r1();
                    throw null;
                }
                R4.b.r1();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC4326r abstractC4326r, String str, EnumC2323o enumC2323o, z4.o oVar, Yg.p pVar, Yg.p pVar2, boolean z10, boolean z11, int i10) {
        super(3);
        this.f9908j0 = abstractC4326r;
        this.f9909k0 = str;
        this.f9910l0 = enumC2323o;
        this.f9911m0 = oVar;
        this.f9912n0 = pVar;
        this.f9913o0 = pVar2;
        this.f9905Z = z10;
        this.f9906h0 = z11;
        this.f9907i0 = i10;
    }
}
