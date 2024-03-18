package W;

import Z.AbstractC1725n;

/* renamed from: W.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1577l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final E.i0 f20203a;

    /* renamed from: b  reason: collision with root package name */
    public static final E.i0 f20204b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20205c = 58;

    /* renamed from: d  reason: collision with root package name */
    public static final float f20206d = 40;

    static {
        float f6 = 24;
        float f10 = 8;
        f20203a = new E.i0(f6, f10, f6, f10);
        float f11 = 12;
        f20204b = new E.i0(f11, f10, f11, f10);
        float f12 = X.m.f21590a;
    }

    public static C1572k0 a(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1449248637);
        C1572k0 c10 = c((P0) rVar.m(R0.f19593a));
        rVar.t(false);
        return c10;
    }

    public static C1572k0 b(long j6, long j10, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-339300779);
        if ((i10 & 2) != 0) {
            j10 = r0.r.f44263k;
        }
        long j11 = r0.r.f44263k;
        C1572k0 a5 = c((P0) rVar.m(R0.f19593a)).a(j6, j10, j11, j11);
        rVar.t(false);
        return a5;
    }

    public static C1572k0 c(P0 p02) {
        C1572k0 c1572k0 = p02.f19503K;
        if (c1572k0 == null) {
            float f6 = X.m.f21590a;
            C1572k0 c1572k02 = new C1572k0(R0.d(p02, 26), R0.d(p02, X.m.f21597h), r0.r.b(R0.d(p02, X.m.f21592c), 0.12f), r0.r.b(R0.d(p02, X.m.f21594e), 0.38f));
            p02.f19503K = c1572k02;
            return c1572k02;
        }
        return c1572k0;
    }

    public static C1572k0 d(P0 p02) {
        C1572k0 c1572k0 = p02.f19505M;
        if (c1572k0 == null) {
            long j6 = r0.r.f44262j;
            float f6 = X.w.f21665a;
            C1572k0 c1572k02 = new C1572k0(j6, R0.d(p02, 26), j6, r0.r.b(R0.d(p02, 18), 0.38f));
            p02.f19505M = c1572k02;
            return c1572k02;
        }
        return c1572k0;
    }

    public static C1572k0 e(P0 p02) {
        C1572k0 c1572k0 = p02.f19506N;
        if (c1572k0 == null) {
            long j6 = r0.r.f44262j;
            C1572k0 c1572k02 = new C1572k0(j6, R0.d(p02, 26), j6, r0.r.b(R0.d(p02, 18), 0.38f));
            p02.f19506N = c1572k02;
            return c1572k02;
        }
        return c1572k0;
    }

    public static r0.L f(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1234923021);
        r0.L a5 = AbstractC1530b3.a(X.m.f21591b, rVar);
        rVar.t(false);
        return a5;
    }

    public static C1572k0 g(AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1344886725);
        C1572k0 d10 = d((P0) rVar.m(R0.f19593a));
        rVar.t(false);
        return d10;
    }

    public static C1572k0 h(long j6, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1778526249);
        long j10 = r0.r.f44263k;
        C1572k0 a5 = d((P0) rVar.m(R0.f19593a)).a(j10, j6, j10, j10);
        rVar.t(false);
        return a5;
    }

    public static C1572k0 i(long j6, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-1402274782);
        long j10 = r0.r.f44263k;
        C1572k0 a5 = e((P0) rVar.m(R0.f19593a)).a(j10, j6, j10, j10);
        rVar.t(false);
        return a5;
    }
}
