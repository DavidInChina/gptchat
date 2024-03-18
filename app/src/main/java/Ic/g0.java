package ic;

import cb.C2334C;
import id.AbstractC3557B;
import java.util.List;
import jc.C3942j;
import kc.C4235c;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import rc.C5451O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import y.C6461B;

/* loaded from: classes.dex */
public final class g0 extends Q {

    /* renamed from: j  reason: collision with root package name */
    public final C4235c f33041j;

    /* renamed from: k  reason: collision with root package name */
    public final xd.g f33042k;

    /* renamed from: l  reason: collision with root package name */
    public final Va.e f33043l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(C4235c c4235c, xd.g gVar, Va.e eVar) {
        super(new P(null, true, false, r7, "", false, r7, null));
        kf.v vVar = kf.v.f37483Y;
        this.f33041j = c4235c;
        this.f33042k = gVar;
        this.f33043l = eVar;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new S(this, null), 3);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new T(this, null), 3);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new U(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(g0 g0Var, C3942j c3942j, AbstractC4825e abstractC4825e) {
        V v10;
        int i10;
        v0 v0Var;
        String str;
        g0Var.getClass();
        if (abstractC4825e instanceof V) {
            v10 = (V) abstractC4825e;
            int i11 = v10.f32980j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v10.f32980j0 = i11 - Integer.MIN_VALUE;
                Object obj = v10.f32978h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = v10.f32980j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c3942j = v10.f32977Z;
                        g0Var = v10.f32976Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C2334C c2334c = ((P) g0Var.f808e.getValue()).f32968h;
                    if (c2334c != null) {
                        str = c2334c.f26438a;
                    } else {
                        str = null;
                    }
                    v10.f32976Y = g0Var;
                    v10.f32977Z = c3942j;
                    v10.f32980j0 = 1;
                    obj = g0Var.f33041j.a(str, c3942j, v10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                    g0Var.l(new W(c3942j, 0));
                } else if (v0Var instanceof q0) {
                    g0Var.f(new C3529G((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        v10 = new V(g0Var, abstractC4825e);
        Object obj2 = v10.f32978h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = v10.f32980j0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(g0 g0Var, AbstractC4825e abstractC4825e) {
        X x10;
        int i10;
        v0 v0Var;
        String str;
        g0Var.getClass();
        if (abstractC4825e instanceof X) {
            x10 = (X) abstractC4825e;
            int i11 = x10.f32986i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x10.f32986i0 = i11 - Integer.MIN_VALUE;
                Object obj = x10.f32984Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = x10.f32986i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        g0Var = x10.f32983Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g0Var.l(C3537g.f33034k0);
                    C2334C c2334c = ((P) g0Var.f808e.getValue()).f32968h;
                    if (c2334c != null) {
                        str = c2334c.f26438a;
                    } else {
                        str = null;
                    }
                    x10.f32983Y = g0Var;
                    x10.f32986i0 = 1;
                    obj = ((C5451O) g0Var.f33042k).a(str, x10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                    g0Var.l(C3537g.f33035l0);
                    g0Var.f(C3528F.f32954a);
                } else if (v0Var instanceof q0) {
                    g0Var.f(new C3529G((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                g0Var.l(C3537g.f33036m0);
                return jf.y.f36177a;
            }
        }
        x10 = new X(g0Var, abstractC4825e);
        Object obj2 = x10.f32984Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = x10.f32986i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        g0Var.l(C3537g.f33036m0);
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(g0 g0Var, AbstractC4825e abstractC4825e) {
        e0 e0Var;
        int i10;
        v0 v0Var;
        String str;
        g0Var.getClass();
        if (abstractC4825e instanceof e0) {
            e0Var = (e0) abstractC4825e;
            int i11 = e0Var.f33022i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e0Var.f33022i0 = i11 - Integer.MIN_VALUE;
                Object obj = e0Var.f33020Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = e0Var.f33022i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        g0Var = e0Var.f33019Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g0Var.l(C3537g.f33037n0);
                    C2334C c2334c = ((P) g0Var.f808e.getValue()).f32968h;
                    if (c2334c != null) {
                        str = c2334c.f26438a;
                    } else {
                        str = null;
                    }
                    e0Var.f33019Y = g0Var;
                    e0Var.f33022i0 = 1;
                    obj = g0Var.f33041j.b(str, e0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    g0Var.l(new C6461B(13, (List) ((u0) v0Var).f48468a));
                } else if (v0Var instanceof q0) {
                    g0Var.f(new C3529G((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                g0Var.l(C3537g.f33038o0);
                return jf.y.f36177a;
            }
        }
        e0Var = new e0(g0Var, abstractC4825e);
        Object obj2 = e0Var.f33020Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = e0Var.f33022i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        g0Var.l(C3537g.f33038o0);
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(g0 g0Var, C2334C c2334c, AbstractC4825e abstractC4825e) {
        f0 f0Var;
        int i10;
        v0 v0Var;
        String str;
        g0Var.getClass();
        if (abstractC4825e instanceof f0) {
            f0Var = (f0) abstractC4825e;
            int i11 = f0Var.f33029i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f33029i0 = i11 - Integer.MIN_VALUE;
                Object obj = f0Var.f33027Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = f0Var.f33029i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        g0Var = f0Var.f33026Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g0Var.l(new Ya.b(c2334c, 3));
                    if (c2334c != null) {
                        str = c2334c.f26438a;
                    } else {
                        str = null;
                    }
                    f0Var.f33026Y = g0Var;
                    f0Var.f33029i0 = 1;
                    obj = g0Var.f33041j.b(str, f0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    g0Var.l(new C6461B(14, (List) ((u0) v0Var).f48468a));
                } else if (v0Var instanceof q0) {
                    g0Var.f(new C3529G((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                g0Var.l(C3537g.f33039p0);
                return jf.y.f36177a;
            }
        }
        f0Var = new f0(g0Var, abstractC4825e);
        Object obj2 = f0Var.f33027Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = f0Var.f33029i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        g0Var.l(C3537g.f33039p0);
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        O o10 = (O) iVar;
        AbstractC3557B.c0("intent", o10);
        if (o10 instanceof K) {
            h(new Y(this, null));
        } else if (o10 instanceof I) {
            h(new Z(this, o10, null));
        } else if (o10 instanceof J) {
            l(new a0(o10, 0));
        } else if (o10 instanceof N) {
            h(new b0(this, o10, null));
        } else if (o10 instanceof L) {
            h(new c0(this, null));
        } else if (o10 instanceof M) {
            h(new d0(this, o10, null));
        }
    }
}
