package B;

import B0.C0194k;
import B0.EnumC0195l;
import G0.AbstractC0585n;
import G0.AbstractC0587p;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: B.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0137k extends AbstractC0587p implements G0.t0, AbstractC0585n {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f1373A0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f1377E0;

    /* renamed from: F0  reason: collision with root package name */
    public final B0.J f1378F0;

    /* renamed from: H0  reason: collision with root package name */
    public D.b f1380H0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.k f1381u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1382v0;

    /* renamed from: w0  reason: collision with root package name */
    public D.m f1383w0;

    /* renamed from: x0  reason: collision with root package name */
    public AbstractC6216a f1384x0;

    /* renamed from: y0  reason: collision with root package name */
    public wf.o f1385y0;

    /* renamed from: z0  reason: collision with root package name */
    public wf.o f1386z0;

    /* renamed from: B0  reason: collision with root package name */
    public final C0107a f1374B0 = new C0107a(this, 0);

    /* renamed from: C0  reason: collision with root package name */
    public final C0110b f1375C0 = new C0110b(0, this);

    /* renamed from: D0  reason: collision with root package name */
    public final C0.d f1376D0 = new C0.d();

    /* renamed from: G0  reason: collision with root package name */
    public final Pg.k f1379G0 = Bi.c.d(Integer.MAX_VALUE, null, 6);

    public AbstractC0137k(C0169v c0169v, boolean z10, D.m mVar, AbstractC6216a abstractC6216a, wf.o oVar, wf.o oVar2, boolean z11) {
        this.f1381u0 = c0169v;
        this.f1382v0 = z10;
        this.f1383w0 = mVar;
        this.f1384x0 = abstractC6216a;
        this.f1385y0 = oVar;
        this.f1386z0 = oVar2;
        this.f1373A0 = z11;
        C0119e c0119e = new C0119e(this, null);
        C0194k c0194k = B0.I.f1599a;
        B0.P p10 = new B0.P(c0119e);
        A0(p10);
        this.f1378F0 = p10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B0(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e, Ng.F f6) {
        C0122f c0122f;
        EnumC5000a enumC5000a;
        int i10;
        wf.o oVar;
        Z0.p pVar;
        abstractC0137k.getClass();
        if (abstractC4825e instanceof C0122f) {
            c0122f = (C0122f) abstractC4825e;
            int i11 = c0122f.f1312j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0122f.f1312j0 = i11 - Integer.MIN_VALUE;
                Object obj = c0122f.f1310h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c0122f.f1312j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f6 = c0122f.f1309Z;
                    abstractC0137k = c0122f.f1308Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    D.b bVar = abstractC0137k.f1380H0;
                    if (bVar != null) {
                        D.m mVar = abstractC0137k.f1383w0;
                        if (mVar != null) {
                            D.a aVar = new D.a(bVar);
                            c0122f.f1308Y = abstractC0137k;
                            c0122f.f1309Z = f6;
                            c0122f.f1312j0 = 1;
                            if (mVar.b(aVar, c0122f) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                    }
                    oVar = abstractC0137k.f1386z0;
                    pVar = new Z0.p(Z0.p.f22813b);
                    c0122f.f1308Y = null;
                    c0122f.f1309Z = null;
                    c0122f.f1312j0 = 2;
                    if (oVar.invoke(f6, pVar, c0122f) == enumC5000a) {
                        return enumC5000a;
                    }
                    return jf.y.f36177a;
                }
                abstractC0137k.f1380H0 = null;
                oVar = abstractC0137k.f1386z0;
                pVar = new Z0.p(Z0.p.f22813b);
                c0122f.f1308Y = null;
                c0122f.f1309Z = null;
                c0122f.f1312j0 = 2;
                if (oVar.invoke(f6, pVar, c0122f) == enumC5000a) {
                }
                return jf.y.f36177a;
            }
        }
        c0122f = new C0122f(abstractC0137k, abstractC4825e);
        Object obj2 = c0122f.f1310h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c0122f.f1312j0;
        if (i10 == 0) {
        }
        abstractC0137k.f1380H0 = null;
        oVar = abstractC0137k.f1386z0;
        pVar = new Z0.p(Z0.p.f22813b);
        c0122f.f1308Y = null;
        c0122f.f1309Z = null;
        c0122f.f1312j0 = 2;
        if (oVar.invoke(f6, pVar, c0122f) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v4, types: [D.k, D.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C0(AbstractC0137k abstractC0137k, Ng.F f6, C0117d0 c0117d0, AbstractC4825e abstractC4825e) {
        C0125g c0125g;
        EnumC5000a enumC5000a;
        int i10;
        D.b bVar;
        wf.o oVar;
        C5251c c5251c;
        Ng.F f10;
        C0117d0 c0117d02;
        D.b bVar2;
        AbstractC0137k abstractC0137k2;
        D.m mVar;
        D.m mVar2;
        abstractC0137k.getClass();
        if (abstractC4825e instanceof C0125g) {
            c0125g = (C0125g) abstractC4825e;
            int i11 = c0125g.f1323l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0125g.f1323l0 = i11 - Integer.MIN_VALUE;
                Object obj = c0125g.f1321j0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c0125g.f1323l0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = c0125g.f1320i0;
                        c0117d02 = c0125g.f1319h0;
                        f10 = c0125g.f1318Z;
                        abstractC0137k2 = c0125g.f1317Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        bVar = bVar2;
                        abstractC0137k = abstractC0137k2;
                        Ng.F f11 = f10;
                        c0117d0 = c0117d02;
                        f6 = f11;
                        abstractC0137k.f1380H0 = bVar;
                        oVar = abstractC0137k.f1385y0;
                        c5251c = new C5251c(c0117d0.f1297b);
                        c0125g.f1317Y = null;
                        c0125g.f1318Z = null;
                        c0125g.f1319h0 = null;
                        c0125g.f1320i0 = null;
                        c0125g.f1323l0 = 3;
                        if (oVar.invoke(f6, c5251c, c0125g) == enumC5000a) {
                            return enumC5000a;
                        }
                        return jf.y.f36177a;
                    }
                    c0117d0 = c0125g.f1319h0;
                    f6 = c0125g.f1318Z;
                    abstractC0137k = c0125g.f1317Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    D.b bVar3 = abstractC0137k.f1380H0;
                    if (bVar3 != null && (mVar2 = abstractC0137k.f1383w0) != null) {
                        D.a aVar = new D.a(bVar3);
                        c0125g.f1317Y = abstractC0137k;
                        c0125g.f1318Z = f6;
                        c0125g.f1319h0 = c0117d0;
                        c0125g.f1323l0 = 1;
                        if (mVar2.b(aVar, c0125g) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                }
                ?? obj2 = new Object();
                mVar = abstractC0137k.f1383w0;
                bVar = obj2;
                if (mVar != 0) {
                    c0125g.f1317Y = abstractC0137k;
                    c0125g.f1318Z = f6;
                    c0125g.f1319h0 = c0117d0;
                    c0125g.f1320i0 = obj2;
                    c0125g.f1323l0 = 2;
                    if (mVar.b(obj2, c0125g) != enumC5000a) {
                        abstractC0137k2 = abstractC0137k;
                        bVar2 = obj2;
                        C0117d0 c0117d03 = c0117d0;
                        f10 = f6;
                        c0117d02 = c0117d03;
                        bVar = bVar2;
                        abstractC0137k = abstractC0137k2;
                        Ng.F f112 = f10;
                        c0117d0 = c0117d02;
                        f6 = f112;
                    } else {
                        return enumC5000a;
                    }
                }
                abstractC0137k.f1380H0 = bVar;
                oVar = abstractC0137k.f1385y0;
                c5251c = new C5251c(c0117d0.f1297b);
                c0125g.f1317Y = null;
                c0125g.f1318Z = null;
                c0125g.f1319h0 = null;
                c0125g.f1320i0 = null;
                c0125g.f1323l0 = 3;
                if (oVar.invoke(f6, c5251c, c0125g) == enumC5000a) {
                }
                return jf.y.f36177a;
            }
        }
        c0125g = new C0125g(abstractC0137k, abstractC4825e);
        Object obj3 = c0125g.f1321j0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c0125g.f1323l0;
        if (i10 == 0) {
        }
        ?? obj22 = new Object();
        mVar = abstractC0137k.f1383w0;
        bVar = obj22;
        if (mVar != 0) {
        }
        abstractC0137k.f1380H0 = bVar;
        oVar = abstractC0137k.f1385y0;
        c5251c = new C5251c(c0117d0.f1297b);
        c0125g.f1317Y = null;
        c0125g.f1318Z = null;
        c0125g.f1319h0 = null;
        c0125g.f1320i0 = null;
        c0125g.f1323l0 = 3;
        if (oVar.invoke(f6, c5251c, c0125g) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(AbstractC0137k abstractC0137k, Ng.F f6, C0120e0 c0120e0, AbstractC4825e abstractC4825e) {
        C0128h c0128h;
        EnumC5000a enumC5000a;
        int i10;
        wf.o oVar;
        Z0.p pVar;
        abstractC0137k.getClass();
        if (abstractC4825e instanceof C0128h) {
            c0128h = (C0128h) abstractC4825e;
            int i11 = c0128h.f1338k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0128h.f1338k0 = i11 - Integer.MIN_VALUE;
                Object obj = c0128h.f1336i0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c0128h.f1338k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0120e0 = c0128h.f1335h0;
                    f6 = c0128h.f1334Z;
                    abstractC0137k = c0128h.f1333Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    D.b bVar = abstractC0137k.f1380H0;
                    if (bVar != null) {
                        D.m mVar = abstractC0137k.f1383w0;
                        if (mVar != null) {
                            D.c cVar = new D.c(bVar);
                            c0128h.f1333Y = abstractC0137k;
                            c0128h.f1334Z = f6;
                            c0128h.f1335h0 = c0120e0;
                            c0128h.f1338k0 = 1;
                            if (mVar.b(cVar, c0128h) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                    }
                    oVar = abstractC0137k.f1386z0;
                    pVar = new Z0.p(c0120e0.f1305b);
                    c0128h.f1333Y = null;
                    c0128h.f1334Z = null;
                    c0128h.f1335h0 = null;
                    c0128h.f1338k0 = 2;
                    if (oVar.invoke(f6, pVar, c0128h) == enumC5000a) {
                        return enumC5000a;
                    }
                    return jf.y.f36177a;
                }
                abstractC0137k.f1380H0 = null;
                oVar = abstractC0137k.f1386z0;
                pVar = new Z0.p(c0120e0.f1305b);
                c0128h.f1333Y = null;
                c0128h.f1334Z = null;
                c0128h.f1335h0 = null;
                c0128h.f1338k0 = 2;
                if (oVar.invoke(f6, pVar, c0128h) == enumC5000a) {
                }
                return jf.y.f36177a;
            }
        }
        c0128h = new C0128h(abstractC0137k, abstractC4825e);
        Object obj2 = c0128h.f1336i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c0128h.f1338k0;
        if (i10 == 0) {
        }
        abstractC0137k.f1380H0 = null;
        oVar = abstractC0137k.f1386z0;
        pVar = new Z0.p(c0120e0.f1305b);
        c0128h.f1333Y = null;
        c0128h.f1334Z = null;
        c0128h.f1335h0 = null;
        c0128h.f1338k0 = 2;
        if (oVar.invoke(f6, pVar, c0128h) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    @Override // G0.t0
    public final void A() {
        ((B0.P) this.f1378F0).A();
    }

    public final void E0() {
        D.b bVar = this.f1380H0;
        if (bVar != null) {
            D.m mVar = this.f1383w0;
            if (mVar != null) {
                mVar.c(new D.a(bVar));
            }
            this.f1380H0 = null;
        }
    }

    @Override // G0.t0
    public final void N() {
        A();
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // G0.t0
    public final void h0() {
        A();
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        ((B0.P) this.f1378F0).s(c0194k, enumC0195l, j6);
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        this.f1377E0 = false;
        E0();
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }
}
