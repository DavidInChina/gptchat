package W;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import h0.C3288a;
import l0.C4323o;
import nf.AbstractC4828h;
import q0.C5254f;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class V3 extends kotlin.jvm.internal.o implements wf.s {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f19758Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N3 f19759Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f19760h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f19761i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.l f19762j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19763k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ String f19764l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19765m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19766n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19767o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19768p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19769q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ f4 f19770r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19771s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ boolean f19772t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ E.g0 f19773u0;

    /* renamed from: v0  reason: collision with root package name */
    public final /* synthetic */ boolean f19774v0;

    /* renamed from: w0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19775w0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ N0.E f19776x0;

    /* renamed from: y0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19777y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(wf.n nVar, N3 n32, boolean z10, boolean z11, D.l lVar, wf.n nVar2, String str, wf.n nVar3, wf.n nVar4, wf.n nVar5, wf.n nVar6, wf.n nVar7, f4 f4Var, wf.n nVar8, boolean z12, E.g0 g0Var, boolean z13, N0.E e10, N0.E e11, wf.n nVar9) {
        super(7);
        this.f19758Y = nVar;
        this.f19759Z = n32;
        this.f19760h0 = z10;
        this.f19761i0 = z11;
        this.f19762j0 = lVar;
        this.f19763k0 = nVar2;
        this.f19764l0 = str;
        this.f19765m0 = nVar3;
        this.f19766n0 = nVar4;
        this.f19767o0 = nVar5;
        this.f19768p0 = nVar6;
        this.f19769q0 = nVar7;
        this.f19770r0 = f4Var;
        this.f19771s0 = nVar8;
        this.f19772t0 = z12;
        this.f19773u0 = g0Var;
        this.f19774v0 = z13;
        this.f19775w0 = e10;
        this.f19776x0 = e11;
        this.f19777y0 = nVar9;
    }

    @Override // wf.s
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        int i10;
        C3288a c3288a;
        int i11;
        long j6;
        C3288a c3288a2;
        long j10;
        C3288a c3288a3;
        long j11;
        C3288a c3288a4;
        C3288a c3288a5;
        long j12;
        C3288a c3288a6;
        C3288a c3288a7;
        C3288a c3288a8;
        long j13;
        C3288a c3288a9;
        long j14;
        C3288a c3288a10;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float floatValue = ((Number) obj).floatValue();
        long j15 = ((r0.r) obj2).f44265a;
        long j16 = ((r0.r) obj3).f44265a;
        float floatValue2 = ((Number) obj4).floatValue();
        float floatValue3 = ((Number) obj5).floatValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj6;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            if (((Z.r) abstractC1725n).d(floatValue)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((Z.r) abstractC1725n).f(j15)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((intValue & 384) == 0) {
            if (((Z.r) abstractC1725n).f(j16)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((intValue & 3072) == 0) {
            if (((Z.r) abstractC1725n).d(floatValue2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((intValue & 24576) == 0) {
            if (((Z.r) abstractC1725n).d(floatValue3)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        int i17 = i10;
        if ((74899 & i17) == 74898) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        wf.n nVar = this.f19758Y;
        if (nVar != null) {
            c3288a = R4.b.X(abstractC1725n, -382297919, new R3(floatValue, j16, nVar, this.f19774v0, j15));
        } else {
            c3288a = null;
        }
        N3 n32 = this.f19759Z;
        n32.getClass();
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(653850713);
        D.l lVar = this.f19762j0;
        AbstractC1710f0 a02 = r9.y.a0(lVar, rVar2, 0);
        boolean z11 = this.f19761i0;
        boolean z12 = this.f19760h0;
        if (!z12) {
            i11 = i17;
            j6 = n32.f19418D;
        } else {
            i11 = i17;
            if (z11) {
                j6 = n32.f19419E;
            } else if (((Boolean) a02.getValue()).booleanValue()) {
                j6 = n32.f19416B;
            } else {
                j6 = n32.f19417C;
            }
        }
        AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(j6), rVar2);
        rVar2.t(false);
        long j17 = ((r0.r) g02.getValue()).f44265a;
        wf.n nVar2 = this.f19763k0;
        if (nVar2 != null && this.f19764l0.length() == 0 && floatValue2 > 0.0f) {
            c3288a2 = R4.b.X(abstractC1725n, -524658155, new T3(floatValue2, j17, nVar2));
        } else {
            c3288a2 = null;
        }
        rVar2.W(129569364);
        AbstractC1710f0 a03 = r9.y.a0(lVar, rVar2, 0);
        if (!z12) {
            j10 = n32.f19426L;
        } else if (z11) {
            j10 = n32.f19427M;
        } else if (((Boolean) a03.getValue()).booleanValue()) {
            j10 = n32.f19424J;
        } else {
            j10 = n32.f19425K;
        }
        AbstractC1710f0 g03 = AbstractC4828h.g0(new r0.r(j10), rVar2);
        rVar2.t(false);
        long j18 = ((r0.r) g03.getValue()).f44265a;
        wf.n nVar3 = this.f19765m0;
        if (nVar3 != null && floatValue3 > 0.0f) {
            c3288a3 = R4.b.X(abstractC1725n, 1824482619, new U3(floatValue3, j18, this.f19775w0, nVar3, 0));
        } else {
            c3288a3 = null;
        }
        rVar2.W(1575329427);
        AbstractC1710f0 a04 = r9.y.a0(lVar, rVar2, 0);
        if (!z12) {
            j11 = n32.P;
        } else if (z11) {
            j11 = n32.Q;
        } else if (((Boolean) a04.getValue()).booleanValue()) {
            j11 = n32.f19428N;
        } else {
            j11 = n32.f19429O;
        }
        AbstractC1710f0 g04 = AbstractC4828h.g0(new r0.r(j11), rVar2);
        rVar2.t(false);
        long j19 = ((r0.r) g04.getValue()).f44265a;
        wf.n nVar4 = this.f19766n0;
        if (nVar4 != null && floatValue3 > 0.0f) {
            c3288a4 = c3288a3;
            c3288a5 = R4.b.X(abstractC1725n, 907456412, new U3(floatValue3, j19, this.f19775w0, nVar4, 1));
        } else {
            c3288a4 = c3288a3;
            c3288a5 = null;
        }
        rVar2.W(925127045);
        AbstractC1710f0 a05 = r9.y.a0(lVar, rVar2, 0);
        if (!z12) {
            j12 = n32.f19447r;
        } else if (z11) {
            j12 = n32.f19448s;
        } else if (((Boolean) a05.getValue()).booleanValue()) {
            j12 = n32.f19445p;
        } else {
            j12 = n32.f19446q;
        }
        AbstractC1710f0 g05 = AbstractC4828h.g0(new r0.r(j12), rVar2);
        rVar2.t(false);
        long j20 = ((r0.r) g05.getValue()).f44265a;
        wf.n nVar5 = this.f19767o0;
        if (nVar5 != null) {
            c3288a6 = R4.b.X(abstractC1725n, 90769583, new S3(j20, nVar5, 0));
        } else {
            c3288a6 = null;
        }
        rVar2.W(-109504137);
        AbstractC1710f0 a06 = r9.y.a0(lVar, rVar2, 0);
        if (!z12) {
            c3288a8 = c3288a5;
            c3288a7 = c3288a6;
            j13 = n32.f19451v;
        } else {
            c3288a8 = c3288a5;
            c3288a7 = c3288a6;
            if (z11) {
                j13 = n32.f19452w;
            } else if (((Boolean) a06.getValue()).booleanValue()) {
                j13 = n32.f19449t;
            } else {
                j13 = n32.f19450u;
            }
        }
        AbstractC1710f0 g06 = AbstractC4828h.g0(new r0.r(j13), rVar2);
        rVar2.t(false);
        long j21 = ((r0.r) g06.getValue()).f44265a;
        wf.n nVar6 = this.f19768p0;
        if (nVar6 != null) {
            c3288a9 = R4.b.X(abstractC1725n, 2077796155, new S3(j21, nVar6, 1));
        } else {
            c3288a9 = null;
        }
        rVar2.W(1464709698);
        AbstractC1710f0 a07 = r9.y.a0(lVar, rVar2, 0);
        if (!z12) {
            j14 = n32.f19422H;
        } else if (z11) {
            j14 = n32.f19423I;
        } else if (((Boolean) a07.getValue()).booleanValue()) {
            j14 = n32.f19420F;
        } else {
            j14 = n32.f19421G;
        }
        AbstractC1710f0 g07 = AbstractC4828h.g0(new r0.r(j14), rVar2);
        rVar2.t(false);
        long j22 = ((r0.r) g07.getValue()).f44265a;
        wf.n nVar7 = this.f19769q0;
        if (nVar7 != null) {
            c3288a10 = R4.b.X(abstractC1725n, -1531019900, new C1602q0(j22, this.f19776x0, nVar7, 2));
        } else {
            c3288a10 = null;
        }
        int ordinal = this.f19770r0.ordinal();
        C4323o c4323o = C4323o.f37719b;
        wf.n nVar8 = this.f19777y0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                rVar2.W(404045277);
                rVar2.t(false);
            } else {
                Object i18 = AbstractC6463a.i(rVar2, 404043576, 404043645);
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (i18 == iVar) {
                    i18 = AbstractC4828h.Z(new C5254f(C5254f.f43637b), Z.o1.f22665a);
                    rVar2.h0(i18);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) i18;
                rVar2.t(false);
                C3288a X10 = R4.b.X(rVar2, 1902535592, new N.D(abstractC1710f0, this.f19773u0, nVar8, 3));
                rVar2.W(404044653);
                if ((i11 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object K10 = rVar2.K();
                if (z10 || K10 == iVar) {
                    K10 = new C1584m2(floatValue, 1, abstractC1710f0);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC1643y2.c(c4323o, this.f19771s0, c3288a2, c3288a, c3288a7, c3288a9, c3288a4, c3288a8, this.f19772t0, floatValue, (wf.k) K10, X10, c3288a10, this.f19773u0, rVar2, ((i11 << 27) & 1879048192) | 6, 48);
                rVar2.t(false);
            }
        } else {
            rVar2.W(404042583);
            Z3.b(c4323o, this.f19771s0, c3288a, c3288a2, c3288a7, c3288a9, c3288a4, c3288a8, this.f19772t0, floatValue, R4.b.X(rVar2, -2124779163, new C1593o1(nVar8, 4)), c3288a10, this.f19773u0, rVar2, ((i11 << 27) & 1879048192) | 6, 6);
            rVar2.t(false);
        }
        return jf.y.f36177a;
    }
}
