package z;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import l0.AbstractC4327s;
import l0.C4310b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5156c;
import y.AbstractC6463a;

/* renamed from: z.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6696f {

    /* renamed from: a  reason: collision with root package name */
    public static final C6718q f51247a = new C6718q(Float.POSITIVE_INFINITY);

    /* renamed from: b  reason: collision with root package name */
    public static final C6720r f51248b = new C6720r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c  reason: collision with root package name */
    public static final C6722s f51249c = new C6722s(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d  reason: collision with root package name */
    public static final C6724t f51250d = new C6724t(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e  reason: collision with root package name */
    public static final C6718q f51251e = new C6718q(Float.NEGATIVE_INFINITY);

    /* renamed from: f  reason: collision with root package name */
    public static final C6720r f51252f = new C6720r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g  reason: collision with root package name */
    public static final C6722s f51253g = new C6722s(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h  reason: collision with root package name */
    public static final C6724t f51254h = new C6724t(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C6694e a(float f6) {
        return new C6694e(Float.valueOf(f6), AbstractC6652A0.f51116a, Float.valueOf(0.01f), 8);
    }

    public static C6716p b(float f6, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return new C6716p(AbstractC6652A0.f51116a, Float.valueOf(f6), new C6718q(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f6, float f10, float f11, AbstractC6714o abstractC6714o, wf.n nVar, AbstractC4825e abstractC4825e) {
        C6737z0 c6737z0 = AbstractC6652A0.f51116a;
        Float f12 = new Float(f6);
        Float f13 = new Float(f10);
        AbstractC6726u abstractC6726u = (AbstractC6726u) C6703i0.f51286l0.invoke(new Float(f11));
        Object d10 = d(new C6716p(c6737z0, f12, abstractC6726u, 56), new C6711m0(abstractC6714o, c6737z0, f12, f13, abstractC6726u), Long.MIN_VALUE, new C6699g0(nVar, 0, c6737z0), abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (d10 != enumC5000a) {
            d10 = yVar;
        }
        if (d10 == enumC5000a) {
            return d10;
        }
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109 A[Catch: CancellationException -> 0x0040, TryCatch #1 {CancellationException -> 0x0040, blocks: (B:14:0x0038, B:21:0x0054, B:39:0x00f4, B:41:0x0109, B:43:0x0130, B:44:0x0135), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [z.h0, nf.e] */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [Z.a0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [Z.a0] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.B] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z.p] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C6716p c6716p, AbstractC6706k abstractC6706k, long j6, wf.k kVar, AbstractC4825e abstractC4825e) {
        C6701h0 c6701h0;
        EnumC5000a enumC5000a;
        ?? r22;
        kotlin.jvm.internal.B b10;
        CancellationException e10;
        C6712n c6712n;
        C6712n c6712n2;
        ?? r42;
        wf.k kVar2;
        Object obj;
        Object obj2;
        Object obj3;
        kotlin.jvm.internal.B b11;
        C6716p c6716p2 = c6716p;
        AbstractC6706k abstractC6706k2 = abstractC6706k;
        try {
            if (abstractC4825e instanceof C6701h0) {
                C6701h0 c6701h02 = (C6701h0) abstractC4825e;
                int i10 = c6701h02.f51273k0;
                r42 = -2147483648;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c6701h02.f51273k0 = i10 - Integer.MIN_VALUE;
                    c6701h0 = c6701h02;
                    ?? r10 = c6701h0;
                    Object obj4 = r10.f51272j0;
                    enumC5000a = EnumC5000a.f41328Y;
                    r22 = r10.f51273k0;
                    if (r22 == 0) {
                        if (r22 != 1) {
                            if (r22 == 2) {
                                kotlin.jvm.internal.B b12 = r10.f51271i0;
                                wf.k kVar3 = r10.f51270h0;
                                AbstractC6706k abstractC6706k3 = r10.f51269Z;
                                C6716p c6716p3 = r10.f51268Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj4);
                                kVar2 = kVar3;
                                abstractC6706k2 = abstractC6706k3;
                                r22 = b12;
                                r42 = c6716p3;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.jvm.internal.B b13 = r10.f51271i0;
                            wf.k kVar4 = r10.f51270h0;
                            AbstractC6706k abstractC6706k4 = r10.f51269Z;
                            C6716p c6716p4 = r10.f51268Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj4);
                            kVar2 = kVar4;
                            abstractC6706k2 = abstractC6706k4;
                            r22 = b13;
                            r42 = c6716p4;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj4);
                        Object f6 = abstractC6706k2.f(0L);
                        AbstractC6726u d10 = abstractC6706k2.d(0L);
                        ?? obj5 = new Object();
                        if (j6 == Long.MIN_VALUE) {
                            try {
                                C6707k0 c6707k0 = new C6707k0(obj5, f6, abstractC6706k, d10, c6716p, q(r10.getContext()), kVar);
                                r10.f51268Y = c6716p2;
                                r10.f51269Z = abstractC6706k2;
                                kVar2 = kVar;
                                r10.f51270h0 = kVar2;
                                r10.f51271i0 = obj5;
                                r10.f51273k0 = 1;
                                if (abstractC6706k.a()) {
                                    obj3 = z(c6707k0, r10);
                                } else {
                                    obj3 = kotlin.jvm.internal.m.v(r10.getContext()).S(new y.Y(8, c6707k0), r10);
                                }
                                if (obj3 == enumC5000a) {
                                    return enumC5000a;
                                }
                                r42 = c6716p2;
                                r22 = obj5;
                            } catch (CancellationException e11) {
                                e10 = e11;
                                b10 = obj5;
                                c6712n = (C6712n) b10.f37622Y;
                                if (c6712n != null) {
                                }
                                c6712n2 = (C6712n) b10.f37622Y;
                                if (c6712n2 != null) {
                                    c6716p2.f51350k0 = false;
                                }
                                throw e10;
                            }
                        } else {
                            kVar2 = kVar;
                            try {
                                b11 = obj5;
                            } catch (CancellationException e12) {
                                e10 = e12;
                                b11 = obj5;
                            }
                            try {
                                C6712n c6712n3 = new C6712n(f6, abstractC6706k.c(), d10, j6, abstractC6706k.g(), j6, new C6705j0(1, c6716p2));
                                o(c6712n3, j6, q(r10.getContext()), abstractC6706k, c6716p, kVar);
                                b11.f37622Y = c6712n3;
                                r42 = c6716p2;
                                r22 = b11;
                            } catch (CancellationException e13) {
                                e10 = e13;
                                b10 = b11;
                                c6712n = (C6712n) b10.f37622Y;
                                if (c6712n != null) {
                                    c6712n.f51337i.setValue(Boolean.FALSE);
                                }
                                c6712n2 = (C6712n) b10.f37622Y;
                                if (c6712n2 != null && c6712n2.f51335g == c6716p2.f51348i0) {
                                    c6716p2.f51350k0 = false;
                                }
                                throw e10;
                            }
                        }
                    }
                    do {
                        obj = r22.f37622Y;
                        AbstractC3557B.Z(obj);
                        if (!((Boolean) ((C6712n) obj).f51337i.getValue()).booleanValue()) {
                            C6709l0 c6709l0 = new C6709l0(r22, q(r10.getContext()), abstractC6706k2, r42, kVar2);
                            r10.f51268Y = r42;
                            r10.f51269Z = abstractC6706k2;
                            r10.f51270h0 = kVar2;
                            r10.f51271i0 = r22;
                            r10.f51273k0 = 2;
                            if (abstractC6706k2.a()) {
                                obj2 = z(c6709l0, r10);
                                continue;
                            } else {
                                obj2 = kotlin.jvm.internal.m.v(r10.getContext()).S(new y.Y(8, c6709l0), r10);
                                continue;
                            }
                        } else {
                            return jf.y.f36177a;
                        }
                    } while (obj2 != enumC5000a);
                    return enumC5000a;
                }
            }
            if (r22 == 0) {
            }
            do {
                obj = r22.f37622Y;
                AbstractC3557B.Z(obj);
                if (!((Boolean) ((C6712n) obj).f51337i.getValue()).booleanValue()) {
                }
            } while (obj2 != enumC5000a);
            return enumC5000a;
        } catch (CancellationException e14) {
            e10 = e14;
            c6716p2 = r42;
            b10 = r22;
        }
        c6701h0 = new AbstractC5156c(abstractC4825e);
        ?? r102 = c6701h0;
        Object obj42 = r102.f51272j0;
        enumC5000a = EnumC5000a.f41328Y;
        r22 = r102.f51273k0;
    }

    public static final Object e(C6716p c6716p, C6736z c6736z, boolean z10, wf.k kVar, AbstractC4825e abstractC4825e) {
        long j6;
        C6734y c6734y = new C6734y(c6736z, c6716p.f51345Y, c6716p.f51346Z.getValue(), c6716p.f51347h0);
        if (z10) {
            j6 = c6716p.f51348i0;
        } else {
            j6 = Long.MIN_VALUE;
        }
        Object d10 = d(c6716p, c6734y, j6, kVar, abstractC4825e);
        if (d10 == EnumC5000a.f41328Y) {
            return d10;
        }
        return jf.y.f36177a;
    }

    public static final C6671K f(C6676P c6676p, float f6, float f10, C6669J c6669j, String str, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-644770905);
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        C6671K i12 = i(c6676p, Float.valueOf(f6), Float.valueOf(f10), AbstractC6652A0.f51116a, c6669j, str, rVar, 0);
        rVar.t(false);
        return i12;
    }

    public static final Object g(C6716p c6716p, Float f6, AbstractC6714o abstractC6714o, boolean z10, wf.k kVar, AbstractC4825e abstractC4825e) {
        long j6;
        C6711m0 c6711m0 = new C6711m0(abstractC6714o, c6716p.f51345Y, c6716p.f51346Z.getValue(), f6, c6716p.f51347h0);
        if (z10) {
            j6 = c6716p.f51348i0;
        } else {
            j6 = Long.MIN_VALUE;
        }
        Object d10 = d(c6716p, c6711m0, j6, kVar, abstractC4825e);
        if (d10 == EnumC5000a.f41328Y) {
            return d10;
        }
        return jf.y.f36177a;
    }

    public static /* synthetic */ Object h(C6716p c6716p, Float f6, AbstractC6714o abstractC6714o, boolean z10, wf.k kVar, AbstractC4825e abstractC4825e, int i10) {
        if ((i10 & 2) != 0) {
            abstractC6714o = u(0.0f, 0.0f, null, 7);
        }
        AbstractC6714o abstractC6714o2 = abstractC6714o;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            kVar = C6703i0.f51281Z;
        }
        return g(c6716p, f6, abstractC6714o2, z11, kVar, abstractC4825e);
    }

    public static final C6671K i(C6676P c6676p, Number number, Number number2, C6737z0 c6737z0, C6669J c6669j, String str, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        Object i11 = AbstractC6463a.i(rVar, -1062847727, -492369756);
        if (i11 == C1723m.f22654Y) {
            i11 = new C6671K(c6676p, number, number2, c6737z0, c6669j);
            rVar.h0(i11);
        }
        rVar.t(false);
        C6671K c6671k = (C6671K) i11;
        AbstractC1734s.g(new C6677Q(number, c6671k, number2, c6669j), rVar);
        AbstractC1734s.b(c6671k, new C6699g0(c6676p, 1, c6671k), rVar);
        rVar.t(false);
        return c6671k;
    }

    public static final float j(C6736z c6736z, float f6) {
        float f10;
        C6737z0 c6737z0 = AbstractC6652A0.f51116a;
        AbstractC6663G abstractC6663G = c6736z.f51415a;
        abstractC6663G.getClass();
        C6718q c6718q = new C6718q(0.0f);
        int b10 = c6718q.b();
        for (int i10 = 0; i10 < b10; i10++) {
            if (i10 == 0) {
                f10 = f6;
            } else {
                f10 = 0.0f;
            }
            c6718q.e(i10, abstractC6663G.e(0.0f, f10));
        }
        return c6718q.f51351a;
    }

    public static final AbstractC6726u k(AbstractC6726u abstractC6726u) {
        AbstractC6726u c10 = abstractC6726u.c();
        int b10 = c10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            c10.e(i10, abstractC6726u.a(i10));
        }
        return c10;
    }

    public static C6716p l(C6716p c6716p, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = ((Number) c6716p.f51346Z.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f10 = ((C6718q) c6716p.f51347h0).f51351a;
        }
        return new C6716p(c6716p.f51345Y, Float.valueOf(f6), new C6718q(f10), c6716p.f51348i0, c6716p.f51349j0, c6716p.f51350k0);
    }

    public static final C6715o0 m(C6729v0 c6729v0, C6737z0 c6737z0, String str, AbstractC1725n abstractC1725n, int i10) {
        C6713n0 c6713n0;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1714122528);
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        rVar.W(1157296644);
        boolean g10 = rVar.g(c6729v0);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new C6715o0(c6729v0, c6737z0, str);
            rVar.h0(K10);
        }
        rVar.t(false);
        C6715o0 c6715o0 = (C6715o0) K10;
        AbstractC1734s.b(c6715o0, new C6699g0(c6729v0, 3, c6715o0), rVar);
        if (c6729v0.d() && (c6713n0 = (C6713n0) c6715o0.f51343b.getValue()) != null) {
            wf.k kVar = c6713n0.f51340h0;
            C6729v0 c6729v02 = c6715o0.f51344c;
            c6713n0.f51338Y.f(kVar.invoke(c6729v02.c().a()), c6713n0.f51340h0.invoke(c6729v02.c().c()), (AbstractC6659E) c6713n0.f51339Z.invoke(c6729v02.c()));
        }
        rVar.t(false);
        return c6715o0;
    }

    public static final C6721r0 n(C6729v0 c6729v0, Object obj, Object obj2, AbstractC6659E abstractC6659E, C6737z0 c6737z0, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-304821198);
        rVar.W(1157296644);
        boolean g10 = rVar.g(c6729v0);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (g10 || K10 == iVar) {
            AbstractC6726u abstractC6726u = (AbstractC6726u) c6737z0.f51416a.invoke(obj2);
            abstractC6726u.d();
            K10 = new C6721r0(c6729v0, obj, abstractC6726u, c6737z0);
            rVar.h0(K10);
        }
        rVar.t(false);
        C6721r0 c6721r0 = (C6721r0) K10;
        if (c6729v0.d()) {
            c6721r0.f(obj, obj2, abstractC6659E);
        } else {
            c6721r0.g(obj2, abstractC6659E);
        }
        rVar.W(-561010487);
        boolean g11 = rVar.g(c6729v0) | rVar.g(c6721r0);
        Object K11 = rVar.K();
        if (g11 || K11 == iVar) {
            K11 = new C6699g0(c6729v0, 4, c6721r0);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1734s.b(c6721r0, (wf.k) K11, rVar);
        rVar.t(false);
        return c6721r0;
    }

    public static final void o(C6712n c6712n, long j6, float f6, AbstractC6706k abstractC6706k, C6716p c6716p, wf.k kVar) {
        long j10;
        if (f6 == 0.0f) {
            j10 = abstractC6706k.b();
        } else {
            j10 = ((float) (j6 - c6712n.f51331c)) / f6;
        }
        c6712n.f51335g = j6;
        c6712n.f51333e.setValue(abstractC6706k.f(j10));
        c6712n.f51334f = abstractC6706k.d(j10);
        if (abstractC6706k.e(j10)) {
            c6712n.f51336h = c6712n.f51335g;
            c6712n.f51337i.setValue(Boolean.FALSE);
        }
        w(c6712n, c6716p);
        kVar.invoke(c6712n);
    }

    public static C6736z p() {
        return new C6736z(new y.h0(1.0f, 0.1f));
    }

    public static final float q(AbstractC4831k abstractC4831k) {
        float f6;
        AbstractC4327s abstractC4327s = (AbstractC4327s) abstractC4831k.get(C4310b.f37708u0);
        if (abstractC4327s != null) {
            f6 = abstractC4327s.a0();
        } else {
            f6 = 1.0f;
        }
        if (f6 >= 0.0f) {
            return f6;
        }
        throw new IllegalStateException("negative scale factor".toString());
    }

    public static C6669J r(AbstractC6651A abstractC6651A, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return new C6669J(abstractC6651A, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [z.V, z.X, java.lang.Object] */
    public static final C6682W s(wf.k kVar) {
        ?? abstractC6683X = new AbstractC6683X();
        kVar.invoke(abstractC6683X);
        return new C6682W(abstractC6683X);
    }

    public static final C6676P t(String str, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        Object i11 = AbstractC6463a.i(rVar, 1013651573, -492369756);
        if (i11 == C1723m.f22654Y) {
            i11 = new C6676P();
            rVar.h0(i11);
        }
        rVar.t(false);
        C6676P c6676p = (C6676P) i11;
        c6676p.a(rVar, 8);
        rVar.t(false);
        return c6676p;
    }

    public static C6697f0 u(float f6, float f10, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new C6697f0(f6, f10, obj);
    }

    public static C6735y0 v(int i10, int i11, AbstractC6653B abstractC6653B, int i12) {
        if ((i12 & 1) != 0) {
            i10 = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            abstractC6653B = AbstractC6657D.f51125a;
        }
        return new C6735y0(i10, i11, abstractC6653B);
    }

    public static final void w(C6712n c6712n, C6716p c6716p) {
        c6716p.f51346Z.setValue(c6712n.f51333e.getValue());
        AbstractC6726u abstractC6726u = c6716p.f51347h0;
        AbstractC6726u abstractC6726u2 = c6712n.f51334f;
        int b10 = abstractC6726u.b();
        for (int i10 = 0; i10 < b10; i10++) {
            abstractC6726u.e(i10, abstractC6726u2.a(i10));
        }
        c6716p.f51349j0 = c6712n.f51336h;
        c6716p.f51348i0 = c6712n.f51335g;
        c6716p.f51350k0 = ((Boolean) c6712n.f51337i.getValue()).booleanValue();
    }

    public static final C6729v0 x(Object obj, String str, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        rVar.W(-492369756);
        Object K10 = rVar.K();
        Object obj2 = C1723m.f22654Y;
        if (K10 == obj2) {
            K10 = new C6729v0(new C6684Y(obj), str);
            rVar.h0(K10);
        }
        rVar.t(false);
        C6729v0 c6729v0 = (C6729v0) K10;
        c6729v0.a(obj, rVar, (i10 & 14) | (i10 & 8) | 48);
        rVar.W(-561051652);
        boolean g10 = rVar.g(c6729v0);
        Object K11 = rVar.K();
        if (g10 || K11 == obj2) {
            K11 = new y.S(c6729v0, 2);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1734s.b(c6729v0, (wf.k) K11, rVar);
        rVar.t(false);
        return c6729v0;
    }

    public static final C6729v0 y(C6684Y c6684y, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(882913843);
        rVar.W(1643203617);
        rVar.W(1157296644);
        boolean g10 = rVar.g(c6684y);
        Object K10 = rVar.K();
        Object obj = C1723m.f22654Y;
        if (g10 || K10 == obj) {
            K10 = new C6729v0(c6684y, "DropDownMenu");
            rVar.h0(K10);
        }
        rVar.t(false);
        C6729v0 c6729v0 = (C6729v0) K10;
        c6729v0.a(c6684y.f51197c.getValue(), rVar, 0);
        rVar.W(-561041970);
        boolean g11 = rVar.g(c6729v0);
        Object K11 = rVar.K();
        if (g11 || K11 == obj) {
            K11 = new y.S(c6729v0, 1);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1734s.b(c6729v0, (wf.k) K11, rVar);
        rVar.t(false);
        rVar.t(false);
        return c6729v0;
    }

    public static final Object z(wf.k kVar, AbstractC4825e abstractC4825e) {
        AbstractC6708l.e(abstractC4825e.getContext().get(H0.B0.f6714Y));
        return kotlin.jvm.internal.m.v(abstractC4825e.getContext()).S(kVar, abstractC4825e);
    }
}
