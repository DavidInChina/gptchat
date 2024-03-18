package L;

import A.AbstractC0044t0;
import E0.AbstractC0445d;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.util.List;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class C implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ P0 f9859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wf.k f9860b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ T0.z f9861c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ T0.s f9862d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Z0.b f9863e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f9864f;

    public C(P0 p02, wf.k kVar, T0.z zVar, T0.s sVar, Z0.b bVar, int i10) {
        this.f9859a = p02;
        this.f9860b = kVar;
        this.f9861c = zVar;
        this.f9862d = sVar;
        this.f9863e = bVar;
        this.f9864f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024d  */
    @Override // E0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E0.O a(E0.P p10, List list, long j6) {
        Throwable th2;
        N0.C c10;
        N0.C c11;
        P0 p02;
        N0.C c12;
        C c13;
        P0 p03;
        int i10;
        long j10;
        int j11;
        int i11;
        int i12;
        N0.k kVar;
        int i13 = AbstractC3893i.f35891e;
        P0 p04 = this.f9859a;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j12 = d10.j();
            try {
                Q0 d11 = p04.d();
                if (d11 != null) {
                    c10 = d11.f10054a;
                } else {
                    c10 = null;
                }
                N0.C c14 = c10;
                AbstractC3893i.p(j12);
                d10.c();
                w0 w0Var = p04.f10029a;
                Z0.l layoutDirection = p10.getLayoutDirection();
                int i14 = w0Var.f10344f;
                boolean z10 = w0Var.f10343e;
                int i15 = w0Var.f10341c;
                if (c14 != null) {
                    N0.i iVar = c14.f12478b;
                    if (!iVar.f12524a.a()) {
                        N0.B b10 = c14.f12477a;
                        if (AbstractC3557B.K(b10.f12467a, w0Var.f10339a) && b10.f12468b.d(w0Var.f10340b) && AbstractC3557B.K(b10.f12469c, w0Var.f10347i) && b10.f12470d == i15 && b10.f12471e == z10 && AbstractC3557B.D0(b10.f12472f, i14) && AbstractC3557B.K(b10.f12473g, w0Var.f10345g) && b10.f12474h == layoutDirection && AbstractC3557B.K(b10.f12475i, w0Var.f10346h)) {
                            int j13 = Z0.a.j(j6);
                            long j14 = b10.f12476j;
                            if (j13 == Z0.a.j(j14) && ((!z10 && !AbstractC3557B.D0(i14, 2)) || (Z0.a.h(j6) == Z0.a.h(j14) && Z0.a.g(j6) == Z0.a.g(j14)))) {
                                p02 = p04;
                                c11 = c14;
                                c12 = new N0.C(new N0.B(b10.f12467a, w0Var.f10340b, b10.f12469c, b10.f12470d, b10.f12471e, b10.f12472f, b10.f12473g, b10.f12474h, b10.f12475i, j6), iVar, A7.b.q0(j6, Ng.H.c(AbstractC4828h.t(iVar.f12527d), AbstractC4828h.t(iVar.f12528e))));
                                long j15 = c12.f12479c;
                                Integer valueOf = Integer.valueOf((int) (j15 >> 32));
                                Integer valueOf2 = Integer.valueOf((int) (j15 & 4294967295L));
                                int intValue = valueOf.intValue();
                                int intValue2 = valueOf2.intValue();
                                if (AbstractC3557B.K(c11, c12)) {
                                    p03 = p02;
                                    p03.f10037i.setValue(new Q0(c12));
                                    p03.f10044p = false;
                                    c13 = this;
                                    c13.f9860b.invoke(c12);
                                    kotlin.jvm.internal.m.E(p03, c13.f9861c, c13.f9862d);
                                } else {
                                    c13 = this;
                                    p03 = p02;
                                }
                                if (c13.f9864f != 1) {
                                    i10 = AbstractC4828h.t(c12.e(0));
                                } else {
                                    i10 = 0;
                                }
                                p03.f10035g.setValue(new Z0.e(c13.f9863e.J(i10)));
                                return p10.j0(intValue, intValue2, AbstractC4268D.a1(new C3959i(AbstractC0445d.f4051a, Integer.valueOf(AbstractC4344b.Y0(c12.f12480d))), new C3959i(AbstractC0445d.f4052b, Integer.valueOf(AbstractC4344b.Y0(c12.f12481e)))), C0868q.f10265h0);
                            }
                            j10 = j6;
                            c11 = c14;
                            p02 = p04;
                            w0Var.a(layoutDirection);
                            j11 = Z0.a.j(j6);
                            if ((!z10 || AbstractC3557B.D0(i14, 2)) && Z0.a.d(j6)) {
                                i11 = Z0.a.h(j6);
                            } else {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (z10 && AbstractC3557B.D0(i14, 2)) {
                                i12 = 1;
                            } else {
                                i12 = i15;
                            }
                            if (j11 != i11) {
                                N0.k kVar2 = w0Var.f10348j;
                                if (kVar2 != null) {
                                    i11 = com.google.android.gms.internal.play_billing.N.p(AbstractC4828h.t(kVar2.c()), j11, i11);
                                } else {
                                    throw new IllegalStateException("layoutIntrinsics must be called first");
                                }
                            }
                            kVar = w0Var.f10348j;
                            if (kVar == null) {
                                N0.i iVar2 = new N0.i(kVar, A7.b.n(0, i11, 0, Z0.a.g(j6), 5), i12, AbstractC3557B.D0(i14, 2));
                                c12 = new N0.C(new N0.B(w0Var.f10339a, w0Var.f10340b, w0Var.f10347i, w0Var.f10341c, w0Var.f10343e, w0Var.f10344f, w0Var.f10345g, layoutDirection, w0Var.f10346h, j6), iVar2, A7.b.q0(j10, Ng.H.c(AbstractC4828h.t(iVar2.f12527d), AbstractC4828h.t(iVar2.f12528e))));
                                long j152 = c12.f12479c;
                                Integer valueOf3 = Integer.valueOf((int) (j152 >> 32));
                                Integer valueOf22 = Integer.valueOf((int) (j152 & 4294967295L));
                                int intValue3 = valueOf3.intValue();
                                int intValue22 = valueOf22.intValue();
                                if (AbstractC3557B.K(c11, c12)) {
                                }
                                if (c13.f9864f != 1) {
                                }
                                p03.f10035g.setValue(new Z0.e(c13.f9863e.J(i10)));
                                return p10.j0(intValue3, intValue22, AbstractC4268D.a1(new C3959i(AbstractC0445d.f4051a, Integer.valueOf(AbstractC4344b.Y0(c12.f12480d))), new C3959i(AbstractC0445d.f4052b, Integer.valueOf(AbstractC4344b.Y0(c12.f12481e)))), C0868q.f10265h0);
                            }
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                    }
                }
                c11 = c14;
                p02 = p04;
                j10 = j6;
                w0Var.a(layoutDirection);
                j11 = Z0.a.j(j6);
                if (!z10) {
                }
                i11 = Z0.a.h(j6);
                if (z10) {
                }
                i12 = i15;
                if (j11 != i11) {
                }
                kVar = w0Var.f10348j;
                if (kVar == null) {
                }
            } catch (Throwable th3) {
                try {
                    AbstractC3893i.p(j12);
                    throw th3;
                } catch (Throwable th4) {
                    th2 = th4;
                    d10.c();
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    @Override // E0.N
    public final int b(G0.g0 g0Var, List list, int i10) {
        P0 p02 = this.f9859a;
        p02.f10029a.a(g0Var.f5770n0.f24860x0);
        N0.k kVar = p02.f10029a.f10348j;
        if (kVar != null) {
            return AbstractC4828h.t(kVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
