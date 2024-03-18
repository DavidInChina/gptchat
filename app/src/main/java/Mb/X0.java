package Mb;

import Z8.AbstractC1809m0;
import Z8.l1;
import android.app.Application;
import com.openai.chatgpt.R;
import e9.C2808a;
import f9.C2958j;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.EnumC6206t;

/* loaded from: classes2.dex */
public final class X0 extends Ad.g {

    /* renamed from: j  reason: collision with root package name */
    public final Cb.G f11869j;

    /* renamed from: k  reason: collision with root package name */
    public final p9.s f11870k;

    /* renamed from: l  reason: collision with root package name */
    public final EnumC6206t f11871l;

    public X0(Application application, Cb.G g10, p9.s sVar, EnumC6206t enumC6206t) {
        super(new Q0(null, "", null, false));
        this.f11869j = g10;
        this.f11870k = sVar;
        this.f11871l = enumC6206t;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new R0(this, null), 3);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new T0(application, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(X0 x02, AbstractC4825e abstractC4825e) {
        V0 v02;
        int i10;
        wd.v0 v0Var;
        x02.getClass();
        if (abstractC4825e instanceof V0) {
            v02 = (V0) abstractC4825e;
            int i11 = v02.f11861i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v02.f11861i0 = i11 - Integer.MIN_VALUE;
                Object obj = v02.f11859Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = v02.f11861i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        x02 = v02.f11858Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!(((Q0) x02.e()).f11831c instanceof wd.m0)) {
                        v02.f11858Y = x02;
                        v02.f11861i0 = 1;
                        obj = ((Cb.S) x02.f11869j).c(v02);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    jf.y yVar2 = (jf.y) ((wd.u0) v0Var).f48468a;
                    x02.f(I0.f11800a);
                } else if (v0Var instanceof wd.q0) {
                    AbstractC1809m0.a().b(l1.f23381p, kf.w.f37484Y);
                    x02.l(C0942a.f11897z0);
                    p9.s sVar = x02.f11870k;
                    x02.f(new J0(K8.d.I0((wd.q0) v0Var, sVar, x02.f11871l, ((C2958j) sVar).a(R.string.onboarding_verify_phone_error))));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        v02 = new V0(x02, abstractC4825e);
        Object obj2 = v02.f11859Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = v02.f11861i0;
        jf.y yVar3 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(X0 x02, AbstractC4825e abstractC4825e) {
        W0 w02;
        int i10;
        Cb.g0 g0Var;
        wd.v0 v0Var;
        x02.getClass();
        if (abstractC4825e instanceof W0) {
            w02 = (W0) abstractC4825e;
            int i11 = w02.f11867j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w02.f11867j0 = i11 - Integer.MIN_VALUE;
                Object obj = w02.f11865h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = w02.f11867j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            x02 = w02.f11864Z;
                            g0Var = (Cb.g0) w02.f11863Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            x02.f(new H0(L4.a.H0(g0Var, (Cb.F) obj), false));
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x02 = (X0) w02.f11863Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Q0 q02 = (Q0) x02.e();
                    if (!(q02.f11831c instanceof wd.m0)) {
                        AbstractC1809m0.a().b(l1.f23383r, kf.w.f37484Y);
                        x02.l(C0942a.f11877A0);
                        w02.f11863Y = x02;
                        w02.f11867j0 = 1;
                        obj = ((Cb.S) x02.f11869j).f(q02.f11830b, w02);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    jf.y yVar2 = (jf.y) ((wd.u0) v0Var).f48468a;
                    Cb.g0 g0Var2 = Cb.g0.f2946k0;
                    Cb.G g10 = x02.f11869j;
                    w02.f11863Y = g0Var2;
                    w02.f11864Z = x02;
                    w02.f11867j0 = 2;
                    Object b10 = ((Cb.S) g10).b(w02);
                    if (b10 != enumC5000a) {
                        g0Var = g0Var2;
                        obj = b10;
                        x02.f(new H0(L4.a.H0(g0Var, (Cb.F) obj), false));
                        return yVar;
                    }
                    return enumC5000a;
                }
                if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    x02.l(new C2808a(q0Var, 7));
                    x02.f(new J0(K8.d.I0(q0Var, x02.f11870k, x02.f11871l, null)));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        w02 = new W0(x02, abstractC4825e);
        Object obj2 = w02.f11865h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = w02.f11867j0;
        jf.y yVar3 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        P0 p02 = (P0) iVar;
        AbstractC3557B.c0("intent", p02);
        if (p02 instanceof O0) {
            l(new nb.d(9, p02));
        } else if (p02 instanceof N0) {
            h(new U0(this, null));
        } else if (p02 instanceof M0) {
            AbstractC1809m0.a().b(l1.f23384s, kf.w.f37484Y);
            f(new H0(Uc.K.f17618k.o1(), true));
        } else if (p02 instanceof L0) {
            f(new H0(Uc.J.f17617k.o1(), true));
        }
    }
}
