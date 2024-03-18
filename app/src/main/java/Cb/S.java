package Cb;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.l1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.q0;
import wd.s0;
import wd.u0;

/* loaded from: classes.dex */
public final class S implements G {

    /* renamed from: a  reason: collision with root package name */
    public final Z f2908a;

    /* renamed from: b  reason: collision with root package name */
    public final U f2909b;

    /* renamed from: c  reason: collision with root package name */
    public final Ia.j f2910c;

    public S(ld.j jVar, Z z10, U u10) {
        this.f2908a = z10;
        this.f2909b = u10;
        this.f2910c = z10.f44961e;
        Ad.l.O0(jVar, null, null, new H(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        I i10;
        EnumC5000a enumC5000a;
        int i11;
        F f6;
        Vc.x xVar;
        Object obj;
        l1 l1Var;
        l1 l1Var2;
        S s10;
        F f10;
        C0293c c0293c;
        Object m02;
        if (abstractC4825e instanceof I) {
            i10 = (I) abstractC4825e;
            int i12 = i10.f2882j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                i10.f2882j0 = i12 - Integer.MIN_VALUE;
                Object obj2 = i10.f2880h0;
                enumC5000a = EnumC5000a.f41328Y;
                i11 = i10.f2882j0;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                f6 = (F) i10.f2878Y;
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                                xVar = (Vc.x) obj2;
                                if (!(xVar instanceof Vc.w)) {
                                    Vc.w wVar = (Vc.w) xVar;
                                    obj = new u0(jf.y.f36177a);
                                } else if (xVar instanceof Vc.q) {
                                    obj = p0.f48449a;
                                } else if (xVar instanceof Vc.r) {
                                    xVar.getClass();
                                    obj = Vc.x.a((Vc.r) xVar);
                                } else {
                                    throw new RuntimeException();
                                }
                                if (obj instanceof u0) {
                                    jf.y yVar = (jf.y) ((u0) obj).f48468a;
                                    AbstractC1805k0 a5 = AbstractC1809m0.a();
                                    if (f6.f2870a) {
                                        l1Var2 = l1.f23370e;
                                    } else {
                                        l1Var2 = l1.f23371f;
                                    }
                                    a5.b(l1Var2, kf.w.f37484Y);
                                }
                                if (obj instanceof q0) {
                                    q0 q0Var = (q0) obj;
                                    AbstractC1805k0 a10 = AbstractC1809m0.a();
                                    if (f6.f2870a) {
                                        l1Var = l1.f23372g;
                                    } else {
                                        l1Var = l1.f23373h;
                                    }
                                    a10.b(l1Var, kf.w.f37484Y);
                                }
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f10 = i10.f2879Z;
                        s10 = (S) i10.f2878Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        Y y10 = (Y) obj2;
                        c0293c = y10.f2921c;
                        if (c0293c != null) {
                            return new s0(0, new IllegalStateException("Account info is null"));
                        }
                        U u10 = s10.f2909b;
                        String str = y10.f2923e;
                        if (str == null) {
                            str = null;
                        }
                        String str2 = y10.f2922d;
                        if (str2 == null) {
                            str2 = null;
                        }
                        i10.f2878Y = f10;
                        i10.f2879Z = null;
                        i10.f2882j0 = 3;
                        u10.getClass();
                        obj2 = u10.f2914a.b(new Eb.c(c0293c.f2931a, c0293c.f2932b, str, str2), i10);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                        f6 = f10;
                        xVar = (Vc.x) obj2;
                        if (!(xVar instanceof Vc.w)) {
                        }
                        if (obj instanceof u0) {
                        }
                        if (obj instanceof q0) {
                        }
                        return obj;
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    s10 = (S) i10.f2878Y;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    i10.f2878Y = this;
                    i10.f2882j0 = 1;
                    obj2 = b(i10);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    s10 = this;
                }
                F f11 = (F) obj2;
                Z z10 = s10.f2908a;
                i10.f2878Y = s10;
                i10.f2879Z = f11;
                i10.f2882j0 = 2;
                m02 = L4.a.m0(z10.f44961e, i10);
                if (m02 != enumC5000a) {
                    return enumC5000a;
                }
                f10 = f11;
                obj2 = m02;
                Y y102 = (Y) obj2;
                c0293c = y102.f2921c;
                if (c0293c != null) {
                }
            }
        }
        i10 = new I(this, abstractC4825e);
        Object obj22 = i10.f2880h0;
        enumC5000a = EnumC5000a.f41328Y;
        i11 = i10.f2882j0;
        if (i11 == 0) {
        }
        F f112 = (F) obj22;
        Z z102 = s10.f2908a;
        i10.f2878Y = s10;
        i10.f2879Z = f112;
        i10.f2882j0 = 2;
        m02 = L4.a.m0(z102.f44961e, i10);
        if (m02 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        J j6;
        int i10;
        F f6;
        if (abstractC4825e instanceof J) {
            j6 = (J) abstractC4825e;
            int i11 = j6.f2885h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j6.f2885h0 = i11 - Integer.MIN_VALUE;
                Object obj = j6.f2883Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = j6.f2885h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ia.j jVar = this.f2908a.f44961e;
                    j6.f2885h0 = 1;
                    obj = L4.a.m0(jVar, j6);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                f6 = ((Y) obj).f2925g;
                if (f6 != null) {
                    F.Companion.getClass();
                    return F.f2869h;
                }
                return f6;
            }
        }
        j6 = new J(this, abstractC4825e);
        Object obj2 = j6.f2883Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = j6.f2885h0;
        if (i10 == 0) {
        }
        f6 = ((Y) obj2).f2925g;
        if (f6 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        O o10;
        EnumC5000a enumC5000a;
        int i10;
        S s10;
        Vc.x xVar;
        S s11;
        F f6;
        C0293c c0293c;
        S s12;
        Object m02;
        if (abstractC4825e instanceof O) {
            o10 = (O) abstractC4825e;
            int i11 = o10.f2899j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o10.f2899j0 = i11 - Integer.MIN_VALUE;
                Object obj = o10.f2897h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = o10.f2899j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    return new u0(jf.y.f36177a);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s10 = o10.f2895Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            xVar = (Vc.x) obj;
                            if (!(xVar instanceof Vc.w)) {
                                nb.d dVar = new nb.d(1, (Vc.w) xVar);
                                o10.f2895Y = null;
                                o10.f2899j0 = 4;
                                if (s10.e(dVar, o10) == enumC5000a) {
                                    return enumC5000a;
                                }
                                return new u0(jf.y.f36177a);
                            } else if (xVar instanceof Vc.q) {
                                return p0.f48449a;
                            } else {
                                if (xVar instanceof Vc.r) {
                                    xVar.getClass();
                                    return Vc.x.a((Vc.r) xVar);
                                }
                                throw new RuntimeException();
                            }
                        }
                        f6 = o10.f2896Z;
                        s11 = o10.f2895Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        Y y10 = (Y) obj;
                        c0293c = y10.f2921c;
                        if (c0293c != null) {
                            return new s0(0, new IllegalStateException("Account info is null"));
                        }
                        boolean z10 = f6.f2871b;
                        String str = y10.f2922d;
                        if (z10 && str == null) {
                            return new s0(0, new IllegalStateException("Arkose token is null"));
                        }
                        U u10 = s11.f2909b;
                        String str2 = c0293c.f2933c;
                        if (str2 != null) {
                            String str3 = c0293c.f2934d.f5145a;
                            if (str == null) {
                                str = null;
                            }
                            o10.f2895Y = s11;
                            o10.f2896Z = null;
                            o10.f2899j0 = 3;
                            u10.getClass();
                            obj = u10.f2914a.e(new Eb.i(str2, str3, str), o10);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            s10 = s11;
                            xVar = (Vc.x) obj;
                            if (!(xVar instanceof Vc.w)) {
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        s12 = o10.f2895Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    o10.f2895Y = this;
                    o10.f2899j0 = 1;
                    obj = b(o10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    s12 = this;
                }
                F f10 = (F) obj;
                Z z11 = s12.f2908a;
                o10.f2895Y = s12;
                o10.f2896Z = f10;
                o10.f2899j0 = 2;
                m02 = L4.a.m0(z11.f44961e, o10);
                if (m02 != enumC5000a) {
                    return enumC5000a;
                }
                S s13 = s12;
                f6 = f10;
                obj = m02;
                s11 = s13;
                Y y102 = (Y) obj;
                c0293c = y102.f2921c;
                if (c0293c != null) {
                }
            }
        }
        o10 = new O(this, abstractC4825e);
        Object obj2 = o10.f2897h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = o10.f2899j0;
        if (i10 == 0) {
        }
        F f102 = (F) obj2;
        Z z112 = s12.f2908a;
        o10.f2895Y = s12;
        o10.f2896Z = f102;
        o10.f2899j0 = 2;
        m02 = L4.a.m0(z112.f44961e, o10);
        if (m02 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC4825e abstractC4825e) {
        P p10;
        int i10;
        if (abstractC4825e instanceof P) {
            p10 = (P) abstractC4825e;
            int i11 = p10.f2902h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p10.f2902h0 = i11 - Integer.MIN_VALUE;
                Object obj = p10.f2900Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = p10.f2902h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    p10.f2902h0 = 1;
                    obj = this.f2909b.f2914a.f(p10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return ((Vc.x) obj).b();
            }
        }
        p10 = new P(this, abstractC4825e);
        Object obj2 = p10.f2900Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = p10.f2902h0;
        if (i10 == 0) {
        }
        return ((Vc.x) obj2).b();
    }

    public final Object e(wf.k kVar, AbstractC4825e abstractC4825e) {
        Object b10 = this.f2908a.b(kVar, abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, AbstractC4825e abstractC4825e) {
        Q q10;
        int i10;
        Vc.x xVar;
        Object obj;
        S s10;
        String str2;
        if (abstractC4825e instanceof Q) {
            q10 = (Q) abstractC4825e;
            int i11 = q10.f2907j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q10.f2907j0 = i11 - Integer.MIN_VALUE;
                Object obj2 = q10.f2905h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = q10.f2907j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            xVar = (Vc.x) obj2;
                            if (!(xVar instanceof Vc.w)) {
                                Vc.w wVar = (Vc.w) xVar;
                                obj = new u0(jf.y.f36177a);
                            } else if (xVar instanceof Vc.q) {
                                obj = p0.f48449a;
                            } else if (xVar instanceof Vc.r) {
                                xVar.getClass();
                                obj = Vc.x.a((Vc.r) xVar);
                            } else {
                                throw new RuntimeException();
                            }
                            if (obj instanceof q0) {
                                q0 q0Var = (q0) obj;
                                AbstractC1809m0.a().b(l1.f23382q, kf.w.f37484Y);
                            }
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = q10.f2904Z;
                    s10 = q10.f2903Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    q10.f2903Y = this;
                    q10.f2904Z = str;
                    q10.f2907j0 = 1;
                    obj2 = L4.a.m0(this.f2908a.f44961e, q10);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    s10 = this;
                }
                str2 = ((Y) obj2).f2923e;
                if (str2 != null) {
                    return new s0(0, new IllegalStateException("Phone verification id is null"));
                }
                U u10 = s10.f2909b;
                q10.f2903Y = null;
                q10.f2904Z = null;
                q10.f2907j0 = 2;
                u10.getClass();
                obj2 = u10.f2914a.d(new Eb.f(str2, str), q10);
                if (obj2 == enumC5000a) {
                    return enumC5000a;
                }
                xVar = (Vc.x) obj2;
                if (!(xVar instanceof Vc.w)) {
                }
                if (obj instanceof q0) {
                }
                return obj;
            }
        }
        q10 = new Q(this, abstractC4825e);
        Object obj22 = q10.f2905h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = q10.f2907j0;
        if (i10 == 0) {
        }
        str2 = ((Y) obj22).f2923e;
        if (str2 != null) {
        }
    }
}
