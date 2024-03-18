package Mb;

import Z8.AbstractC1809m0;
import Z8.C1834z0;
import b9.AbstractC2133b;
import c9.C2308b;
import com.openai.chatgpt.R;
import e9.C2808a;
import f9.C2958j;
import id.AbstractC3557B;
import jf.C3959i;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.EnumC6206t;

/* renamed from: Mb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981u extends AbstractC0974q {

    /* renamed from: j  reason: collision with root package name */
    public final Cb.G f11985j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC2133b f11986k;

    /* renamed from: l  reason: collision with root package name */
    public final p9.s f11987l;

    /* renamed from: m  reason: collision with root package name */
    public final EnumC6206t f11988m;

    public C0981u(Cb.G g10, AbstractC2133b abstractC2133b, p9.s sVar, EnumC6206t enumC6206t) {
        super(new C0972p(null));
        this.f11985j = g10;
        this.f11986k = abstractC2133b;
        this.f11987l = sVar;
        this.f11988m = enumC6206t;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new r(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(C0981u c0981u, AbstractC4825e abstractC4825e) {
        C0977s c0977s;
        int i10;
        wd.v0 v0Var;
        Fb.s sVar;
        String str;
        Fb.r rVar;
        c0981u.getClass();
        if (abstractC4825e instanceof C0977s) {
            c0977s = (C0977s) abstractC4825e;
            int i11 = c0977s.f11978i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0977s.f11978i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0977s.f11976Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0977s.f11978i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return jf.y.f36177a;
                    }
                    c0981u = c0977s.f11975Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0981u.l(C0942a.f11886o0);
                    c0977s.f11975Y = c0981u;
                    c0977s.f11978i0 = 1;
                    obj = ((Cb.S) c0981u.f11985j).a(c0977s);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    jf.y yVar = (jf.y) ((wd.u0) v0Var).f48468a;
                    c0977s.f11975Y = null;
                    c0977s.f11978i0 = 2;
                    if (c0981u.n(c0977s) == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    c0981u.l(new C2808a(q0Var, 3));
                    Throwable th2 = q0Var.f48450a;
                    if (th2 instanceof Fb.s) {
                        sVar = (Fb.s) th2;
                    } else {
                        sVar = null;
                    }
                    if (sVar != null && (rVar = sVar.f5172Y) != null) {
                        str = rVar.f5171d;
                    } else {
                        str = null;
                    }
                    if (AbstractC3557B.K(str, "user_already_exists")) {
                        c0977s.f11975Y = null;
                        c0977s.f11978i0 = 3;
                        if (c0981u.n(c0977s) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        p9.s sVar2 = c0981u.f11987l;
                        c0981u.f(new C0964l(K8.d.I0(q0Var, sVar2, c0981u.f11988m, ((C2958j) sVar2).a(R.string.onboarding_account_create_error))));
                    }
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        c0977s = new C0977s(c0981u, abstractC4825e);
        Object obj2 = c0977s.f11976Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0977s.f11978i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC0970o abstractC0970o = (AbstractC0970o) iVar;
        AbstractC3557B.c0("intent", abstractC0970o);
        if (abstractC0970o instanceof C0968n) {
            f(new C0962k(Uc.J.f17617k.o1()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(AbstractC4825e abstractC4825e) {
        C0979t c0979t;
        int i10;
        C0981u c0981u;
        wd.v0 v0Var;
        if (abstractC4825e instanceof C0979t) {
            c0979t = (C0979t) abstractC4825e;
            int i11 = c0979t.f11983i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0979t.f11983i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0979t.f11981Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0979t.f11983i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0981u = c0979t.f11980Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0979t.f11980Y = this;
                    c0979t.f11983i0 = 1;
                    obj = ((C9.l) this.f11986k).c(c0979t);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c0981u = this;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    if (((C2308b) ((wd.u0) v0Var).f48468a).f26368a != null) {
                        c0981u.l(C0942a.f11887p0);
                        AbstractC1809m0.a().b(C1834z0.f23423c, P4.a.o0(new C3959i("is_auto_created", Boolean.TRUE)));
                    } else {
                        c0981u.f(new C0964l(((C2958j) c0981u.f11987l).a(R.string.onboarding_error_account_exists)));
                    }
                } else if (v0Var instanceof wd.q0) {
                    c0981u.l(new C2808a((wd.q0) v0Var, 4));
                    c0981u.f(new C0964l(((C2958j) c0981u.f11987l).a(R.string.onboarding_error_account_exists)));
                } else if (v0Var instanceof wd.p0) {
                    c0981u.l(C0942a.f11888q0);
                } else {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        c0979t = new C0979t(this, abstractC4825e);
        Object obj2 = c0979t.f11981Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0979t.f11983i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return jf.y.f36177a;
    }
}
