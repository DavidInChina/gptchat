package I9;

import A.C0039q0;
import Uc.C1422g;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1824u0;
import ca.C2311c;
import cb.C2334C;
import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import jf.C3959i;
import nd.AbstractC4816e;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.C6168C;
import wd.EnumC6181c;

/* renamed from: I9.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0758g0 extends F {

    /* renamed from: j  reason: collision with root package name */
    public final Ea.b f8346j;

    /* renamed from: k  reason: collision with root package name */
    public final Ea.a f8347k;

    /* renamed from: l  reason: collision with root package name */
    public final xd.h f8348l;

    /* renamed from: m  reason: collision with root package name */
    public final Va.e f8349m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8350n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0758g0(Ea.b bVar, Ea.a aVar, xd.h hVar, Va.e eVar, androidx.lifecycle.P p10, com.openai.experiment.t tVar, AbstractC4816e abstractC4816e) {
        super(new j1(true, false, false, r10, r11, r12, r13, null, true, "", false, r18, null, r22, r22, r22, false));
        boolean z10;
        String str;
        String str2;
        wd.O o10;
        C6168C c6168c;
        Boolean bool;
        Uc.B b10 = Uc.B.f17607i;
        if (p10 != null && (bool = (Boolean) p10.b("search-selected")) != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        if (p10 != null) {
            C1422g c1422g = C1422g.f17674i;
            String str3 = (String) p10.b("remoteId");
            str3 = str3 == null ? null : str3;
            if (str3 != null) {
                c6168c = new C6168C(str3);
            } else {
                c6168c = null;
            }
            if (c6168c != null) {
                str = c6168c.f48321a;
                if (p10 != null) {
                    C1422g c1422g2 = C1422g.f17674i;
                    String str4 = (String) p10.b("gizmoId");
                    str4 = str4 == null ? null : str4;
                    if (str4 != null) {
                        o10 = new wd.O(str4);
                    } else {
                        o10 = null;
                    }
                    if (o10 != null) {
                        str2 = o10.f48362a;
                        boolean c10 = ((com.openai.experiment.G) tVar).c(ExperimentKey.GizmoStoreEnabled.INSTANCE);
                        kf.v vVar = kf.v.f37483Y;
                        kf.x xVar = kf.x.f37485Y;
                        this.f8346j = bVar;
                        this.f8347k = aVar;
                        this.f8348l = hVar;
                        this.f8349m = eVar;
                        this.f8350n = true;
                        k(C0745a.f8268C0, ((xa.s) bVar).f49769d);
                        k(C0745a.f8269D0, ((Ya.r) eVar).f22204c);
                        k(G.f8169Z, ((rc.Q) hVar).f44819b);
                        k(G.f8170h0, ((xc.e) abstractC4816e).a(EnumC6181c.f48389l0, ExperimentKey.MemoryExperienceEnabled.INSTANCE));
                    }
                }
                str2 = null;
                boolean c102 = ((com.openai.experiment.G) tVar).c(ExperimentKey.GizmoStoreEnabled.INSTANCE);
                kf.v vVar2 = kf.v.f37483Y;
                kf.x xVar2 = kf.x.f37485Y;
                this.f8346j = bVar;
                this.f8347k = aVar;
                this.f8348l = hVar;
                this.f8349m = eVar;
                this.f8350n = true;
                k(C0745a.f8268C0, ((xa.s) bVar).f49769d);
                k(C0745a.f8269D0, ((Ya.r) eVar).f22204c);
                k(G.f8169Z, ((rc.Q) hVar).f44819b);
                k(G.f8170h0, ((xc.e) abstractC4816e).a(EnumC6181c.f48389l0, ExperimentKey.MemoryExperienceEnabled.INSTANCE));
            }
        }
        str = null;
        if (p10 != null) {
        }
        str2 = null;
        boolean c1022 = ((com.openai.experiment.G) tVar).c(ExperimentKey.GizmoStoreEnabled.INSTANCE);
        kf.v vVar22 = kf.v.f37483Y;
        kf.x xVar22 = kf.x.f37485Y;
        this.f8346j = bVar;
        this.f8347k = aVar;
        this.f8348l = hVar;
        this.f8349m = eVar;
        this.f8350n = true;
        k(C0745a.f8268C0, ((xa.s) bVar).f49769d);
        k(C0745a.f8269D0, ((Ya.r) eVar).f22204c);
        k(G.f8169Z, ((rc.Q) hVar).f44819b);
        k(G.f8170h0, ((xc.e) abstractC4816e).a(EnumC6181c.f48389l0, ExperimentKey.MemoryExperienceEnabled.INSTANCE));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(C0758g0 c0758g0, C2311c c2311c, AbstractC4825e abstractC4825e) {
        H h10;
        int i10;
        wd.v0 v0Var;
        c0758g0.getClass();
        if (abstractC4825e instanceof H) {
            h10 = (H) abstractC4825e;
            int i11 = h10.f8178j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h10.f8178j0 = i11 - Integer.MIN_VALUE;
                Object obj = h10.f8176h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = h10.f8178j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2311c = h10.f8175Z;
                        c0758g0 = h10.f8174Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0758g0.l(new I(c2311c, 0));
                    h10.f8174Y = c0758g0;
                    h10.f8175Z = c2311c;
                    h10.f8178j0 = 1;
                    obj = ((xa.f) c0758g0.f8347k).a(c2311c, true, h10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                }
                c0758g0.l(new I(c2311c, 1));
                return jf.y.f36177a;
            }
        }
        h10 = new H(c0758g0, abstractC4825e);
        Object obj2 = h10.f8176h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = h10.f8178j0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        c0758g0.l(new I(c2311c, 1));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C0758g0 c0758g0, C2311c c2311c, AbstractC4825e abstractC4825e) {
        J j6;
        int i10;
        wd.v0 v0Var;
        c0758g0.getClass();
        if (abstractC4825e instanceof J) {
            j6 = (J) abstractC4825e;
            int i11 = j6.f8186j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j6.f8186j0 = i11 - Integer.MIN_VALUE;
                Object obj = j6.f8184h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = j6.f8186j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2311c = j6.f8183Z;
                        c0758g0 = j6.f8182Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0758g0.l(new I(c2311c, 2));
                    j6.f8182Y = c0758g0;
                    j6.f8183Z = c2311c;
                    j6.f8186j0 = 1;
                    obj = ((xa.f) c0758g0.f8347k).b(c2311c, j6);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                }
                c0758g0.l(new I(c2311c, 3));
                return jf.y.f36177a;
            }
        }
        j6 = new J(c0758g0, abstractC4825e);
        Object obj2 = j6.f8184h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = j6.f8186j0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        c0758g0.l(new I(c2311c, 3));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(C0758g0 c0758g0, C2334C c2334c, AbstractC4825e abstractC4825e) {
        W w10;
        int i10;
        wd.v0 v0Var;
        c0758g0.getClass();
        if (abstractC4825e instanceof W) {
            w10 = (W) abstractC4825e;
            int i11 = w10.f8247i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w10.f8247i0 = i11 - Integer.MIN_VALUE;
                Object obj = w10.f8245Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = w10.f8247i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0758g0 = w10.f8244Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().c(Z8.F.f23246c, c2334c.f26438a);
                    w10.f8244Y = c0758g0;
                    w10.f8247i0 = 1;
                    obj = ((Ya.r) c0758g0.f8349m).k(c2334c, w10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                }
                return jf.y.f36177a;
            }
        }
        w10 = new W(c0758g0, abstractC4825e);
        Object obj2 = w10.f8245Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = w10.f8247i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        X x10;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        wd.v0 v0Var;
        wd.v0 v0Var2;
        c0758g0.getClass();
        if (abstractC4825e instanceof X) {
            x10 = (X) abstractC4825e;
            int i11 = x10.f8252i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x10.f8252i0 = i11 - Integer.MIN_VALUE;
                obj = x10.f8250Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = x10.f8252i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c0758g0 = x10.f8249Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            v0Var = (wd.v0) obj;
                            if (v0Var instanceof wd.q0) {
                                c0758g0.f(new C0776p0((wd.q0) v0Var));
                            }
                            c0758g0.l(K.f8199m0);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0758g0 = x10.f8249Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0758g0.l(K.f8198l0);
                    x10.f8249Y = c0758g0;
                    x10.f8252i0 = 1;
                    obj = ((xa.s) c0758g0.f8346j).d(x10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var2 = (wd.v0) obj;
                if (v0Var2 instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var2));
                }
                Va.e eVar = c0758g0.f8349m;
                x10.f8249Y = c0758g0;
                x10.f8252i0 = 2;
                obj = ((Ya.r) eVar).c(x10);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                }
                c0758g0.l(K.f8199m0);
                return jf.y.f36177a;
            }
        }
        x10 = new X(c0758g0, abstractC4825e);
        obj = x10.f8250Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = x10.f8252i0;
        if (i10 == 0) {
        }
        v0Var2 = (wd.v0) obj;
        if (v0Var2 instanceof wd.q0) {
        }
        Va.e eVar2 = c0758g0.f8349m;
        x10.f8249Y = c0758g0;
        x10.f8252i0 = 2;
        obj = ((Ya.r) eVar2).c(x10);
        if (obj == enumC5000a) {
        }
        v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.q0) {
        }
        c0758g0.l(K.f8199m0);
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(C0758g0 c0758g0, C2311c c2311c, String str, AbstractC4825e abstractC4825e) {
        Y y10;
        int i10;
        wd.v0 v0Var;
        c0758g0.getClass();
        if (abstractC4825e instanceof Y) {
            y10 = (Y) abstractC4825e;
            int i11 = y10.f8257j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y10.f8257j0 = i11 - Integer.MIN_VALUE;
                Object obj = y10.f8255h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = y10.f8257j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2311c = y10.f8254Z;
                        c0758g0 = y10.f8253Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0758g0.l(new I(c2311c, 4));
                    y10.f8253Y = c0758g0;
                    y10.f8254Z = c2311c;
                    y10.f8257j0 = 1;
                    obj = ((xa.f) c0758g0.f8347k).e(c2311c, str, y10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                }
                c0758g0.l(new I(c2311c, 5));
                return jf.y.f36177a;
            }
        }
        y10 = new Y(c0758g0, abstractC4825e);
        Object obj2 = y10.f8255h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = y10.f8257j0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        c0758g0.l(new I(c2311c, 5));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(C0758g0 c0758g0, C2334C c2334c, AbstractC4825e abstractC4825e) {
        C0756f0 c0756f0;
        int i10;
        wd.v0 v0Var;
        c0758g0.getClass();
        if (abstractC4825e instanceof C0756f0) {
            c0756f0 = (C0756f0) abstractC4825e;
            int i11 = c0756f0.f8342i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0756f0.f8342i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0756f0.f8340Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0756f0.f8342i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0758g0 = c0756f0.f8339Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().c(Z8.Q.f23268c, c2334c.f26438a);
                    c0756f0.f8339Y = c0758g0;
                    c0756f0.f8342i0 = 1;
                    obj = ((Ya.r) c0758g0.f8349m).n(c2334c, c0756f0);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                }
                return jf.y.f36177a;
            }
        }
        c0756f0 = new C0756f0(c0758g0, abstractC4825e);
        Object obj2 = c0756f0.f8340Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0756f0.f8342i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        I0 i02 = (I0) iVar;
        AbstractC3557B.c0("intent", i02);
        if (i02 instanceof A0) {
            h(new M(this, null));
        } else if (i02 instanceof D0) {
            h(new N(this, null));
        } else if (i02 instanceof C0793y0) {
            h(new O(this, i02, null));
        } else if (i02 instanceof C0783t0) {
            h(new P(this, i02, null));
        } else if (i02 instanceof E0) {
            h(new Q(this, i02, null));
        } else if (i02 instanceof C0779r0) {
            h(new S(this, i02, null));
        } else if (i02 instanceof C0795z0) {
            h(new T(this, i02, null));
        } else {
            boolean z10 = i02 instanceof F0;
            Qg.F0 f02 = this.f808e;
            if (z10) {
                int length = ((j1) f02.getValue()).f8392j.length();
                String str = ((F0) i02).f8168a;
                if (length == 0 && str.length() == 1) {
                    AbstractC1809m0.a().b(C1824u0.f23413c, kf.w.f37484Y);
                }
                l(new C0039q0(str, 10));
            } else if (i02 instanceof C0787v0) {
                AbstractC1805k0 a5 = AbstractC1809m0.a();
                Z8.H0 h02 = Z8.H0.f23251c;
                C2334C c2334c = ((C0787v0) i02).f8459a;
                a5.b(h02, P4.a.o0(new C3959i("gizmo_id", c2334c.f26438a)));
                f(new C0772n0(c2334c.f26438a));
            } else if (i02 instanceof C0781s0) {
                AbstractC1809m0.a().b(Z8.H0.f23251c, P4.a.o0(new C3959i("gizmo_id", "default")));
                f(C0774o0.f8426a);
            } else if (i02 instanceof C0791x0) {
                AbstractC1809m0.a().b(Z8.I0.f23253c, kf.w.f37484Y);
                l(K.f8197k0);
            } else if (i02 instanceof C0789w0) {
                AbstractC1809m0.a().b(Z8.J0.f23255c, kf.w.f37484Y);
                l(K.f8202p0);
            } else if (i02 instanceof C0785u0) {
                f(new C0768l0(Uc.A.f17606k.o1()));
            } else if (i02 instanceof B0) {
                if (((B0) i02).f8144a && this.f8350n) {
                    this.f8350n = false;
                    x8.W.M(Pc.e.a(), "First load of history screen", null, 6);
                    L4.a.E0(L4.a.I0(new C0748b0(this, null), new M1.w(L4.a.i0(new M1.w(f02, 8)), 7)), AbstractC4828h.Q(this));
                    Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0750c0(this, null), 3);
                    Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0754e0(this, null), 3);
                }
            } else if (i02 instanceof C0) {
                h(new U(this, i02, null));
            } else if (i02 instanceof H0) {
                h(new V(this, i02, null));
            } else if (i02 instanceof G0) {
                f(new C0768l0(Uc.N.f17621k.o1()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(C2311c c2311c, AbstractC4825e abstractC4825e) {
        L l10;
        int i10;
        C0758g0 c0758g0;
        wd.v0 v0Var;
        Yg.p pVar;
        if (abstractC4825e instanceof L) {
            l10 = (L) abstractC4825e;
            int i11 = l10.f8209i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l10.f8209i0 = i11 - Integer.MIN_VALUE;
                Object obj = l10.f8207Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = l10.f8209i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0758g0 = l10.f8206Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!this.f8350n) {
                        j1 j1Var = (j1) this.f808e.getValue();
                        if (!j1Var.f8385c && j1Var.f8391i) {
                            l(K.f8194h0);
                            if (c2311c != null) {
                                pVar = c2311c.f26377d;
                            } else {
                                pVar = null;
                            }
                            l10.f8206Y = this;
                            l10.f8209i0 = 1;
                            obj = ((xa.s) this.f8346j).f(pVar, l10);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            c0758g0 = this;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    c0758g0.l(new J.c(3, ((Boolean) ((wd.u0) v0Var).f48468a).booleanValue()));
                } else if (v0Var instanceof wd.q0) {
                    c0758g0.f(new C0776p0((wd.q0) v0Var));
                    c0758g0.l(K.f8195i0);
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                c0758g0.l(K.f8196j0);
                return yVar;
            }
        }
        l10 = new L(this, abstractC4825e);
        Object obj2 = l10.f8207Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = l10.f8209i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        c0758g0.l(K.f8196j0);
        return yVar2;
    }
}
