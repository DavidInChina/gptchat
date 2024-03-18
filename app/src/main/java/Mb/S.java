package Mb;

import Z8.AbstractC1805k0;
import Z8.l1;
import b9.AbstractC2133b;
import com.openai.chatgpt.R;
import f9.C2958j;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import t9.AbstractC5684a;

/* loaded from: classes.dex */
public final class S extends H {

    /* renamed from: j  reason: collision with root package name */
    public final Cb.G f11835j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC2133b f11836k;

    /* renamed from: l  reason: collision with root package name */
    public final p9.s f11837l;

    /* renamed from: m  reason: collision with root package name */
    public final Yg.b f11838m;

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC1805k0 f11839n;

    public S(Cb.G g10, AbstractC2133b abstractC2133b, p9.s sVar, Yg.b bVar, AbstractC1805k0 abstractC1805k0) {
        super(new G(null, null, null, null, null, null, kf.v.f37483Y, false, false, false, false, false));
        this.f11835j = g10;
        this.f11836k = abstractC2133b;
        this.f11837l = sVar;
        this.f11838m = bVar;
        this.f11839n = abstractC1805k0;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new I(this, null), 3);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new J(this, null), 3);
        L4.a.E0(L4.a.I0(new L(this, null), this.f808e), AbstractC4828h.Q(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(S s10, AbstractC4825e abstractC4825e) {
        M m10;
        Object obj;
        int i10;
        int i11;
        Cb.g0 g0Var;
        S s11;
        S s12;
        Object b10;
        S s13;
        G g10;
        int i12;
        S s14;
        Yg.r rVar;
        s10.getClass();
        if (abstractC4825e instanceof M) {
            m10 = (M) abstractC4825e;
            int i13 = m10.f11814l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                m10.f11814l0 = i13 - Integer.MIN_VALUE;
                obj = m10.f11812j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = m10.f11814l0;
                jf.y yVar = jf.y.f36177a;
                i11 = 1;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    g0Var = (Cb.g0) m10.f11809Z;
                                    s11 = m10.f11808Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    s11.f(new C0985w(L4.a.H0(g0Var, (Cb.F) obj)));
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s12 = m10.f11808Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            Cb.g0 g0Var2 = Cb.g0.f2944i0;
                            Cb.G g11 = s12.f11835j;
                            m10.f11808Y = s12;
                            m10.f11809Z = g0Var2;
                            m10.f11814l0 = 5;
                            b10 = ((Cb.S) g11).b(m10);
                            if (b10 == enumC5000a) {
                            }
                        } else {
                            i12 = m10.f11811i0;
                            g10 = (G) m10.f11809Z;
                            s14 = m10.f11808Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            i11 = i12;
                            s13 = s14;
                            if (g10.f11785h && i11 == 0) {
                                Cb.G g12 = s13.f11835j;
                                nb.d dVar = new nb.d(5, g10);
                                m10.f11808Y = s13;
                                m10.f11809Z = null;
                                m10.f11810h0 = null;
                                m10.f11814l0 = 4;
                                if (((Cb.S) g12).e(dVar, m10) != enumC5000a) {
                                    s12 = s13;
                                    Cb.g0 g0Var22 = Cb.g0.f2944i0;
                                    Cb.G g112 = s12.f11835j;
                                    m10.f11808Y = s12;
                                    m10.f11809Z = g0Var22;
                                    m10.f11814l0 = 5;
                                    b10 = ((Cb.S) g112).b(m10);
                                    if (b10 == enumC5000a) {
                                        s11 = s12;
                                        g0Var = g0Var22;
                                        obj = b10;
                                        s11.f(new C0985w(L4.a.H0(g0Var, (Cb.F) obj)));
                                        return yVar;
                                    }
                                    return enumC5000a;
                                }
                                return enumC5000a;
                            }
                            s13.f(new C0987x(((C2958j) s13.f11837l).a(R.string.onboarding_invalid_date_tos)));
                            return yVar;
                        }
                    } else {
                        rVar = m10.f11810h0;
                        g10 = (G) m10.f11809Z;
                        s13 = m10.f11808Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    G g13 = (G) s10.e();
                    if (g13.f()) {
                        s10.f11839n.b(l1.f23379n, kf.w.f37484Y);
                        Yg.r rVar2 = g13.f11780c;
                        if (rVar2 != null) {
                            if (AbstractC5684a.a(rVar2, ((Yg.a) s10.f11838m).a()) <= 1) {
                                s10.l(new K(s10, 1));
                            } else {
                                m10.f11808Y = s10;
                                m10.f11809Z = g13;
                                m10.f11810h0 = rVar2;
                                m10.f11814l0 = 1;
                                Object b11 = ((Cb.S) s10.f11835j).b(m10);
                                if (b11 != enumC5000a) {
                                    s13 = s10;
                                    rVar = rVar2;
                                    g10 = g13;
                                    obj = b11;
                                } else {
                                    return enumC5000a;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    return yVar;
                }
                if (rVar.compareTo(((Cb.F) obj).f2874e) <= 0) {
                    i11 = 0;
                }
                if (i11 != 0) {
                    s13.f11839n.b(l1.f23386u, kf.w.f37484Y);
                    boolean z10 = g10.f11786i;
                    Cb.G g14 = s13.f11835j;
                    if (z10) {
                        s13.l(C0942a.f11889r0);
                        K k10 = new K(s13, 2);
                        m10.f11808Y = s13;
                        m10.f11809Z = g10;
                        m10.f11810h0 = null;
                        m10.f11811i0 = i11;
                        m10.f11814l0 = 2;
                        if (((Cb.S) g14).e(k10, m10) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        s13.l(C0942a.f11890s0);
                        C0942a c0942a = C0942a.f11891t0;
                        m10.f11808Y = s13;
                        m10.f11809Z = g10;
                        m10.f11810h0 = null;
                        m10.f11811i0 = i11;
                        m10.f11814l0 = 3;
                        if (((Cb.S) g14).e(c0942a, m10) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    i12 = i11;
                    s14 = s13;
                    i11 = i12;
                    s13 = s14;
                }
                if (g10.f11785h) {
                }
                s13.f(new C0987x(((C2958j) s13.f11837l).a(R.string.onboarding_invalid_date_tos)));
                return yVar;
            }
        }
        m10 = new M(s10, abstractC4825e);
        obj = m10.f11812j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = m10.f11814l0;
        jf.y yVar2 = jf.y.f36177a;
        i11 = 1;
        if (i10 == 0) {
        }
        if (rVar.compareTo(((Cb.F) obj).f2874e) <= 0) {
        }
        if (i11 != 0) {
        }
        if (g10.f11785h) {
        }
        s13.f(new C0987x(((C2958j) s13.f11837l).a(R.string.onboarding_invalid_date_tos)));
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(S s10, AbstractC4825e abstractC4825e) {
        N n10;
        int i10;
        wd.v0 v0Var;
        s10.getClass();
        if (abstractC4825e instanceof N) {
            n10 = (N) abstractC4825e;
            int i11 = n10.f11819i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n10.f11819i0 = i11 - Integer.MIN_VALUE;
                Object obj = n10.f11817Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = n10.f11819i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        s10 = n10.f11816Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    n10.f11816Y = s10;
                    n10.f11819i0 = 1;
                    Cb.S s11 = (Cb.S) s10.f11835j;
                    s11.getClass();
                    obj = Ad.l.e0(new Cb.N(s11, null), n10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    s10.l(new Cb.K((Cb.F) ((wd.u0) v0Var).f48468a, 1));
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    s10.f(new C0987x(((C2958j) s10.f11837l).a(R.string.onboarding_fetch_error)));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        n10 = new N(s10, abstractC4825e);
        Object obj2 = n10.f11817Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = n10.f11819i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        F f6 = (F) iVar;
        AbstractC3557B.c0("intent", f6);
        if (f6 instanceof C) {
            l(new P(f6, 0));
        } else if (f6 instanceof D) {
            l(new P(f6, 1));
        } else if (f6 instanceof A) {
            l(new P(f6, 2));
        } else if (f6 instanceof E) {
            l(new P(f6, 3));
        } else if (f6 instanceof B) {
            l(new P(f6, 4));
        } else if (f6 instanceof C0991z) {
            h(new Q(this, null));
        }
    }
}
