package Mb;

import Z8.AbstractC1805k0;
import Z8.l1;
import android.content.Intent;
import b9.AbstractC2133b;
import c9.C2308b;
import com.openai.chatgpt.R;
import e9.C2808a;
import f9.C2958j;
import id.AbstractC3557B;
import jf.C3963m;
import kf.AbstractC4273I;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.EnumC6206t;

/* loaded from: classes.dex */
public final class F0 extends Ad.g {

    /* renamed from: o  reason: collision with root package name */
    public static final C3963m f11772o = R4.b.D1(C0990y0.f12004Y);

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC1805k0 f11773j;

    /* renamed from: k  reason: collision with root package name */
    public final p9.s f11774k;

    /* renamed from: l  reason: collision with root package name */
    public final Cb.G f11775l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2133b f11776m;

    /* renamed from: n  reason: collision with root package name */
    public final EnumC6206t f11777n;

    public F0(androidx.lifecycle.P p10, AbstractC1805k0 abstractC1805k0, p9.s sVar, Cb.G g10, AbstractC2133b abstractC2133b, EnumC6206t enumC6206t) {
        super(new C0986w0(null, 15));
        this.f11773j = abstractC1805k0;
        this.f11774k = sVar;
        this.f11775l = g10;
        this.f11776m = abstractC2133b;
        this.f11777n = enumC6206t;
        l1 l1Var = l1.f23374i;
        kf.w wVar = kf.w.f37484Y;
        abstractC1805k0.b(l1Var, wVar);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0988x0(this, null), 3);
        if (!AbstractC4273I.u2(AbstractC4273I.u2(p10.f25308a.keySet(), p10.f25309b.keySet()), p10.f25310c.keySet()).isEmpty()) {
            abstractC1805k0.b(l1.f23376k, wVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(F0 f02, boolean z10, AbstractC4825e abstractC4825e) {
        z0 z0Var;
        int i10;
        Cb.g0 g0Var;
        wd.v0 v0Var;
        f02.getClass();
        if (abstractC4825e instanceof z0) {
            z0Var = (z0) abstractC4825e;
            int i11 = z0Var.f12011k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z0Var.f12011k0 = i11 - Integer.MIN_VALUE;
                Object obj = z0Var.f12009i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = z0Var.f12011k0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                f02 = z0Var.f12007Z;
                                g0Var = (Cb.g0) z0Var.f12006Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                f02.f(new C0973p0(L4.a.H0(g0Var, (Cb.F) obj)));
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f02 = (F0) z0Var.f12006Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        g0Var = Cb.g0.f2943h0;
                        Cb.G g10 = f02.f11775l;
                        z0Var.f12006Y = g0Var;
                        z0Var.f12007Z = f02;
                        z0Var.f12011k0 = 3;
                        obj = ((Cb.S) g10).b(z0Var);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        f02.f(new C0973p0(L4.a.H0(g0Var, (Cb.F) obj)));
                        return yVar;
                    }
                    z10 = z0Var.f12008h0;
                    f02 = (F0) z0Var.f12006Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!(((C0986w0) f02.e()).f11998d instanceof wd.m0)) {
                        if (z10) {
                            f02.f11773j.b(l1.f23375j, kf.w.f37484Y);
                        }
                        f02.l(C0942a.f11892u0);
                        z0Var.f12006Y = f02;
                        z0Var.f12008h0 = z10;
                        z0Var.f12011k0 = 1;
                        obj = ((C9.l) f02.f11776m).c(z0Var);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    C2308b c2308b = (C2308b) ((wd.u0) v0Var).f48468a;
                    f02.l(new A0(c2308b, 0));
                    if (AbstractC3557B.K(c2308b.f26370c, Boolean.TRUE)) {
                        A0 a02 = new A0(c2308b, 1);
                        z0Var.f12006Y = f02;
                        z0Var.f12011k0 = 2;
                        if (((Cb.S) f02.f11775l).e(a02, z0Var) == enumC5000a) {
                            return enumC5000a;
                        }
                        g0Var = Cb.g0.f2943h0;
                        Cb.G g102 = f02.f11775l;
                        z0Var.f12006Y = g0Var;
                        z0Var.f12007Z = f02;
                        z0Var.f12011k0 = 3;
                        obj = ((Cb.S) g102).b(z0Var);
                        if (obj == enumC5000a) {
                        }
                        f02.f(new C0973p0(L4.a.H0(g0Var, (Cb.F) obj)));
                    } else if (z10) {
                        f02.f(new C0975q0(((C2958j) f02.f11774k).a(R.string.onboarding_email_not_verified)));
                    }
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    f02.l(new C2808a(q0Var, 5));
                    f02.f(new C0975q0(K8.d.I0(q0Var, f02.f11774k, f02.f11777n, null)));
                } else if (v0Var instanceof wd.p0) {
                    f02.l(C0942a.f11893v0);
                } else {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        z0Var = new z0(f02, abstractC4825e);
        Object obj2 = z0Var.f12009i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = z0Var.f12011k0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(F0 f02, AbstractC4825e abstractC4825e) {
        E0 e02;
        int i10;
        wd.v0 v0Var;
        f02.getClass();
        if (abstractC4825e instanceof E0) {
            e02 = (E0) abstractC4825e;
            int i11 = e02.f11771i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e02.f11771i0 = i11 - Integer.MIN_VALUE;
                Object obj = e02.f11769Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = e02.f11771i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        f02 = e02.f11768Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!(((C0986w0) f02.e()).f11997c instanceof wd.m0)) {
                        f02.f11773j.b(l1.f23377l, kf.w.f37484Y);
                        f02.l(C0942a.f11894w0);
                        e02.f11768Y = f02;
                        e02.f11771i0 = 1;
                        obj = ((Cb.S) f02.f11775l).d(e02);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    jf.y yVar2 = (jf.y) ((wd.u0) v0Var).f48468a;
                    f02.l(C0942a.f11895x0);
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    f02.l(new C2808a(q0Var, 6));
                    f02.f(new C0975q0(K8.d.I0(q0Var, f02.f11774k, f02.f11777n, null)));
                } else if (v0Var instanceof wd.p0) {
                    f02.l(C0942a.f11896y0);
                } else {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        e02 = new E0(f02, abstractC4825e);
        Object obj2 = e02.f11769Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = e02.f11771i0;
        jf.y yVar3 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return yVar3;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC0984v0 abstractC0984v0 = (AbstractC0984v0) iVar;
        AbstractC3557B.c0("intent", abstractC0984v0);
        if (abstractC0984v0 instanceof C0982u0) {
            h(new C0(this, null));
        } else if (abstractC0984v0 instanceof C0980t0) {
            h(new D0(this, null));
        } else if (abstractC0984v0 instanceof C0978s0) {
            this.f11773j.b(l1.f23380o, kf.w.f37484Y);
            f(new C0971o0((Intent) f11772o.getValue()));
        }
    }
}
