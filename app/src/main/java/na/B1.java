package na;

import Uc.C1422g;
import Uc.EnumC1421f;
import Z8.AbstractC1809m0;
import Z8.C1784a;
import Z8.C1797g0;
import Z8.C1815p0;
import Z8.C1834z0;
import android.app.Application;
import android.content.Intent;
import cb.C2334C;
import com.openai.experiment.ExperimentKey;
import e9.C2814g;
import id.AbstractC3557B;
import jf.C3959i;
import ka.C4206b;
import ld.C4428a;
import nd.AbstractC4816e;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import o9.C4959g;
import oa.C4970A;
import oa.C4972C;
import of.EnumC5000a;
import rb.C5436z;
import rc.C5451O;
import rc.C5472v;
import sa.C5599e;
import uc.C5900r;
import vb.AbstractC6005a;
import wa.C6151c;
import wb.C6158c;
import wd.C6168C;
import wd.EnumC6181c;
import yb.AbstractC6574a;
import za.C6808y;

/* loaded from: classes.dex */
public final class B1 extends E0 {

    /* renamed from: j  reason: collision with root package name */
    public final com.openai.experiment.t f39709j;

    /* renamed from: k  reason: collision with root package name */
    public final T9.a f39710k;

    /* renamed from: l  reason: collision with root package name */
    public final xd.i f39711l;

    /* renamed from: m  reason: collision with root package name */
    public final C4428a f39712m;

    /* renamed from: n  reason: collision with root package name */
    public final xd.f f39713n;

    /* renamed from: o  reason: collision with root package name */
    public final xd.h f39714o;

    /* renamed from: p  reason: collision with root package name */
    public final C6808y f39715p;

    /* renamed from: q  reason: collision with root package name */
    public final Va.e f39716q;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.LinkedHashMap, nf.k, Ng.G, nf.e] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B1(xd.b bVar, AbstractC4816e abstractC4816e, androidx.lifecycle.P p10, com.openai.experiment.t tVar, com.openai.experiment.r rVar, com.openai.experiment.h hVar, H1 h12, Ba.j jVar, Nb.a aVar, Pa.h hVar2, J9.c cVar, J9.a aVar2, AbstractC6574a abstractC6574a, T9.a aVar3, Qc.b bVar2, xd.g gVar, xd.i iVar, C4428a c4428a, xd.f fVar, xd.h hVar3, C6808y c6808y, Va.e eVar, Dd.Q q10, AbstractC6005a abstractC6005a, T9.d dVar) {
        super(new D1(r12, null, null, r15, r1, r14, r18, null, null, r5, new T0.z("", 0L, 6), kf.w.f37484Y, null, r5, false, r27, r28, false, null, false, false, false, EnumC4797v0.f40130Z, new C4780p(false, null, null, true, false), r2, r37, r38, r39, false, false, r42, null, r44, false, null, r47, false, null));
        boolean z10;
        kf.v vVar;
        ExperimentKey.MemoryExperienceEnabled memoryExperienceEnabled;
        C4959g c4959g;
        com.openai.experiment.G g10;
        Qg.n0 n0Var;
        ?? r10;
        C4959g c4959g2 = ((C4206b) dVar).f37210c;
        String str = ((C6168C) c4959g2.getValue()).f48321a;
        C1422g c1422g = C1422g.f17674i;
        boolean z11 = !p10.f25308a.containsKey("remoteId");
        Qg.n0 n0Var2 = ((C6158c) bVar2).f48286c;
        Sc.c cVar2 = (Sc.c) n0Var2.f14881Y.getValue();
        com.openai.experiment.G g11 = (com.openai.experiment.G) tVar;
        boolean c10 = g11.c(ExperimentKey.WhisperDisabled.INSTANCE);
        boolean c11 = g11.c(ExperimentKey.ShareButtonEnabled.INSTANCE);
        boolean c12 = g11.c(ExperimentKey.ConversationUpsell.INSTANCE);
        Wc.d dVar2 = EnumC6181c.f48384Z;
        xc.e eVar2 = (xc.e) abstractC4816e;
        T1 t12 = new T1(eVar2.b(ExperimentKey.BreezeEnabled.INSTANCE), 30);
        C5900r c5900r = (C5900r) hVar;
        boolean booleanValue = ((Boolean) c5900r.a().getValue()).booleanValue();
        String b10 = ((com.openai.experiment.G) rVar).b(com.openai.experiment.m.f27691c);
        ExperimentKey.MemoryExperienceEnabled memoryExperienceEnabled2 = ExperimentKey.MemoryExperienceEnabled.INSTANCE;
        boolean c13 = g11.c(memoryExperienceEnabled2);
        boolean c14 = g11.c(ExperimentKey.ConversationsAreReportable.INSTANCE);
        boolean c15 = g11.c(ExperimentKey.GizmoReviewsEnabled.INSTANCE);
        J9.d dVar3 = new J9.d(null, null, null);
        J9.b bVar3 = new J9.b();
        kf.v vVar2 = kf.v.f37483Y;
        this.f39709j = tVar;
        this.f39710k = aVar3;
        this.f39711l = iVar;
        this.f39712m = c4428a;
        this.f39713n = fVar;
        this.f39714o = hVar3;
        this.f39715p = c6808y;
        this.f39716q = eVar;
        x8.W.M(Pc.e.a(), "Starting new ConversationViewModel", null, 6);
        boolean z12 = C1422g.o1(p10) == EnumC1421f.f17668Y;
        if (!((D1) this.f808e.getValue()).f39762a) {
            n0Var = n0Var2;
            g10 = g11;
            z10 = z12;
            memoryExperienceEnabled = memoryExperienceEnabled2;
            vVar = vVar2;
            c4959g = c4959g2;
            r10 = 0;
            Ad.l.O0(AbstractC4828h.Q(this), null, null, new P0(p10, abstractC6574a, z12, this, null), 3);
        } else {
            n0Var = n0Var2;
            g10 = g11;
            vVar = vVar2;
            c4959g = c4959g2;
            Object obj = null;
            z10 = z12;
            memoryExperienceEnabled = memoryExperienceEnabled2;
            r10 = obj;
            if (g10.c(ExperimentKey.StarterPrompts.INSTANCE)) {
                Ad.l.O0(AbstractC4828h.Q(this), null, null, new R0(aVar, this, null), 3);
                r10 = obj;
            }
        }
        L4.a.E0(L4.a.I0(new S0(this, r10), c6808y.f51810b), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new T0(this, r10), ((C5472v) bVar).f44936f), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new U0(this, r10), n0Var), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new W0(this, r10), ((C5451O) gVar).f44814c), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new X0(this, r10), ((C6151c) cVar).f48261b), AbstractC4828h.Q(this));
        C5599e c5599e = (C5599e) aVar2;
        L4.a.E0(L4.a.I0(new Y0(this, r10), c5599e.f45484c), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new Z0(this, r10), c5599e.f45486e), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new G0(this, r10), ((rc.Q) hVar3).f44819b), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new H0(this, r10), c5900r.a()), AbstractC4828h.Q(this));
        k(C4765k.f40005k0, eVar2.a(EnumC6181c.f48389l0, memoryExperienceEnabled));
        Ad.l.O0(AbstractC4828h.Q(this), r10, r10, new J0(this, r10), 3);
        C4972C c4972c = (C4972C) aVar3;
        K0 k02 = new K0(this, r10);
        C2814g c2814g = c4972c.f41060o;
        L4.a.E0(L4.a.I0(k02, c2814g), AbstractC4828h.Q(this));
        Ng.F Q = AbstractC4828h.Q(this);
        J1 j12 = ((K1) h12).f39819a;
        j12.getClass();
        Object obj2 = j12.f39813a.get();
        AbstractC3557B.b0("get(...)", obj2);
        Object obj3 = j12.f39814b.get();
        AbstractC3557B.b0("get(...)", obj3);
        new I1(aVar3, Q, (u9.b) obj2, (Application) obj3);
        k(C4765k.f40006l0, c4959g);
        L4.a.E0(L4.a.q0(c4972c.f41058m, jVar.f2031c, new L0(this, (AbstractC4825e) r10, 0)), AbstractC4828h.Q(this));
        if (g10.c(ExperimentKey.SuggestedReplies.INSTANCE)) {
            Ng.F Q10 = AbstractC4828h.Q(this);
            Qg.F0 c16 = Qg.s0.c(new Pa.b(vVar));
            L4.a.E0(L4.a.F0(new Pa.g(hVar2, c16, r10), new M1.w(L4.a.I0(new Pa.f(c16, r10), L4.a.i0(new M1.w(new M1.w(c2814g, 21), 23))), 22)), Q10);
            L4.a.E0(L4.a.I0(new M0(this, r10), c16), AbstractC4828h.Q(this));
        }
        if (g10.c(ExperimentKey.ClientActionsEnabled.INSTANCE)) {
            N0 n02 = new N0(this, 0);
            C5436z c5436z = (C5436z) abstractC6005a;
            x8.W.M(c5436z.f44773f, "Binding interceptClientSideCommands", r10, 6);
            L4.a.E0(L4.a.I0(new O0(this, r10), new C2814g(c5436z.c(), c5436z, n02, 1)), AbstractC4828h.Q(this));
        }
        if (z10) {
            s();
        }
        L4.a.E0(L4.a.I0(new Q0(this, r10), new M1.w(new M1.w(q10.f3533b, 10), 9)), AbstractC4828h.Q(this));
        if (C1422g.o1(p10) == EnumC1421f.f17671i0) {
            AbstractC1809m0.a().b(Z8.c1.f23337c, kf.w.f37484Y);
            l(C4745d0.f39946i0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(B1 b1, AbstractC4825e abstractC4825e) {
        C4743c1 c4743c1;
        int i10;
        b1.getClass();
        if (abstractC4825e instanceof C4743c1) {
            c4743c1 = (C4743c1) abstractC4825e;
            int i11 = c4743c1.f39942i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4743c1.f39942i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4743c1.f39940Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4743c1.f39942i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = c4743c1.f39939Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C4745d0 c4745d0 = C4745d0.f39948k0;
                    c4743c1.f39939Y = b1;
                    c4743c1.f39942i0 = 1;
                    if (((rc.Q) b1.f39714o).a(c4745d0, c4743c1) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                AbstractC1809m0.a().b(Z8.Y0.f23308u, kf.w.f37484Y);
                AbstractC1809m0.a().b(Z8.Y0.f23284A, kf.w.f37484Y);
                b1.l(C4745d0.f39949l0);
                b1.s();
                return jf.y.f36177a;
            }
        }
        c4743c1 = new C4743c1(b1, abstractC4825e);
        Object obj2 = c4743c1.f39940Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4743c1.f39942i0;
        if (i10 == 0) {
        }
        AbstractC1809m0.a().b(Z8.Y0.f23308u, kf.w.f37484Y);
        AbstractC1809m0.a().b(Z8.Y0.f23284A, kf.w.f37484Y);
        b1.l(C4745d0.f39949l0);
        b1.s();
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(B1 b1, AbstractC4825e abstractC4825e) {
        C4746d1 c4746d1;
        int i10;
        b1.getClass();
        if (abstractC4825e instanceof C4746d1) {
            c4746d1 = (C4746d1) abstractC4825e;
            int i11 = c4746d1.f39968i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4746d1.f39968i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4746d1.f39966Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4746d1.f39968i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = c4746d1.f39965Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C4745d0 c4745d0 = C4745d0.f39951n0;
                    c4746d1.f39965Y = b1;
                    c4746d1.f39968i0 = 1;
                    if (((rc.Q) b1.f39714o).a(c4745d0, c4746d1) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                b1.l(C4745d0.f39952o0);
                b1.s();
                return jf.y.f36177a;
            }
        }
        c4746d1 = new C4746d1(b1, abstractC4825e);
        Object obj2 = c4746d1.f39966Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4746d1.f39968i0;
        if (i10 == 0) {
        }
        b1.l(C4745d0.f39952o0);
        b1.s();
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(B1 b1, AbstractC4825e abstractC4825e) {
        C4749e1 c4749e1;
        int i10;
        b1.getClass();
        if (abstractC4825e instanceof C4749e1) {
            c4749e1 = (C4749e1) abstractC4825e;
            int i11 = c4749e1.f39974i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4749e1.f39974i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4749e1.f39972Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4749e1.f39974i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = c4749e1.f39971Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(C1784a.f23331l, kf.w.f37484Y);
                    C4745d0 c4745d0 = C4745d0.f39953p0;
                    c4749e1.f39971Y = b1;
                    c4749e1.f39974i0 = 1;
                    if (((rc.Q) b1.f39714o).a(c4745d0, c4749e1) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                t(b1, false, null, true, 2);
                return jf.y.f36177a;
            }
        }
        c4749e1 = new C4749e1(b1, abstractC4825e);
        Object obj2 = c4749e1.f39972Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4749e1.f39974i0;
        if (i10 == 0) {
        }
        t(b1, false, null, true, 2);
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(B1 b1, C2334C c2334c, AbstractC4825e abstractC4825e) {
        u1 u1Var;
        int i10;
        wd.v0 v0Var;
        b1.getClass();
        if (abstractC4825e instanceof u1) {
            u1Var = (u1) abstractC4825e;
            int i11 = u1Var.f40127i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u1Var.f40127i0 = i11 - Integer.MIN_VALUE;
                Object obj = u1Var.f40125Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = u1Var.f40127i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = u1Var.f40124Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(Z8.F.f23246c, P4.a.o0(new C3959i("gizmo_id", c2334c.f26438a)));
                    u1Var.f40124Y = b1;
                    u1Var.f40127i0 = 1;
                    obj = ((Ya.r) b1.f39716q).k(c2334c, u1Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    b1.f(new C4788s((wd.q0) v0Var));
                }
                return jf.y.f36177a;
            }
        }
        u1Var = new u1(b1, abstractC4825e);
        Object obj2 = u1Var.f40125Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = u1Var.f40127i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(B1 b1, String str, AbstractC4825e abstractC4825e) {
        v1 v1Var;
        int i10;
        wd.v0 v0Var;
        b1.getClass();
        if (abstractC4825e instanceof v1) {
            v1Var = (v1) abstractC4825e;
            int i11 = v1Var.f40136i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v1Var.f40136i0 = i11 - Integer.MIN_VALUE;
                Object obj = v1Var.f40134Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = v1Var.f40136i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = v1Var.f40133Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    b1.l(C4745d0.f39961x0);
                    v1Var.f40133Y = b1;
                    v1Var.f40136i0 = 1;
                    C4972C c4972c = (C4972C) b1.f39710k;
                    c4972c.getClass();
                    obj = c4972c.q(new C4970A(c4972c, str, null), v1Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (v0Var instanceof wd.q0) {
                    b1.f(new C4788s((wd.q0) v0Var));
                }
                b1.l(C4745d0.f39962y0);
                return jf.y.f36177a;
            }
        }
        v1Var = new v1(b1, abstractC4825e);
        Object obj2 = v1Var.f40134Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = v1Var.f40136i0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (v0Var instanceof wd.q0) {
        }
        b1.l(C4745d0.f39962y0);
        return jf.y.f36177a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r5 == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(B1 b1, AbstractC4825e abstractC4825e) {
        y1 y1Var;
        int i10;
        String str;
        b1.getClass();
        if (abstractC4825e instanceof y1) {
            y1Var = (y1) abstractC4825e;
            int i11 = y1Var.f40157i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y1Var.f40157i0 = i11 - Integer.MIN_VALUE;
                Object obj = y1Var.f40155Z;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = y1Var.f40157i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        b1 = y1Var.f40154Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(C1797g0.f23348c, kf.w.f37484Y);
                    C2814g c2814g = ((C4972C) b1.f39710k).f41060o;
                    y1Var.f40154Y = b1;
                    y1Var.f40157i0 = 1;
                    obj = L4.a.m0(c2814g, y1Var);
                }
                str = ((T9.c) obj).f16966a;
                obj2 = jf.y.f36177a;
                if (str != null) {
                    Uc.O o10 = Uc.O.f17622i;
                    String concat = "share-conversation/".concat(str);
                    AbstractC3557B.c0("internalRoute", concat);
                    b1.f(new r(concat, false));
                }
                return obj2;
            }
        }
        y1Var = new y1(b1, abstractC4825e);
        Object obj3 = y1Var.f40155Z;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = y1Var.f40157i0;
        if (i10 == 0) {
        }
        str = ((T9.c) obj3).f16966a;
        obj22 = jf.y.f36177a;
        if (str != null) {
        }
        return obj22;
    }

    public static void t(B1 b1, boolean z10, Sc.n nVar, boolean z11, int i10) {
        String str;
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if (z10) {
            b1.getClass();
            AbstractC1809m0.a().b(Z8.M0.f23261c, kf.w.f37484Y);
        }
        D1 d12 = (D1) b1.f808e.getValue();
        AbstractC1809m0.a().b(C1834z0.f23423c, P4.a.o0(new C3959i("is_auto_created", Boolean.valueOf(!z10))));
        if (nVar != null) {
            C1422g c1422g = C1422g.f17674i;
            String str2 = nVar.f16534b;
            AbstractC3557B.c0("model", str2);
            str = "conversation?model=".concat(str2);
            AbstractC3557B.c0("internalRoute", str);
        } else {
            C2334C c2334c = d12.f39759N;
            if (c2334c != null) {
                C1422g c1422g2 = C1422g.f17674i;
                str = C1422g.q1(c2334c.f26438a, null);
            } else {
                C1422g c1422g3 = C1422g.f17674i;
                str = C1422g.r1(EnumC1421f.f17672j0);
            }
        }
        b1.f(new r(str, z11));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        Z z10 = (Z) iVar;
        AbstractC3557B.c0("intent", z10);
        boolean z11 = z10 instanceof H;
        Sc.n nVar = null;
        Qg.F0 f02 = this.f808e;
        if (z11) {
            boolean z12 = ((H) z10).f39803a;
            if (z12) {
                nVar = ((D1) f02.getValue()).f39767f.f8898b;
            } else if (z12) {
                throw new RuntimeException();
            }
            t(this, true, nVar, false, 4);
        } else if (z10 instanceof U) {
            l(new C4761i1(z10, 3));
        } else if (z10 instanceof P) {
            Ad.l.O0(AbstractC4828h.Q(this), null, null, new x1(this, ((D1) f02.getValue()).f39772k.f16830a.f12512Y, N1.f39840Y, null), 3);
        } else if (z10 instanceof C4733F) {
            l(new C4761i1(z10, 4));
        } else if (z10 instanceof W) {
            AbstractC1809m0.a().b(Z8.c1.f23337c, kf.w.f37484Y);
            l(C4745d0.f39946i0);
        } else if (z10 instanceof X) {
            l(C4745d0.f39959v0);
        } else if (z10 instanceof Y) {
            h(new C4779o1(this, z10, null));
        } else if (z10 instanceof L) {
            h(new C4782p1(this, z10, null));
        } else if (z10 instanceof C4794u) {
            h(new C4785q1(this, null));
        } else if (z10 instanceof C4796v) {
            h(new C4787r1(this, null));
        } else if (z10 instanceof O) {
            h(new C4790s1(this, z10, null));
        } else if (z10 instanceof C4798w) {
            h(new C4793t1(this, null));
        } else if (z10 instanceof C4800x) {
            h(new C4752f1(this, null));
        } else if (z10 instanceof Q) {
            h(new C4755g1(this, null));
        } else if (z10 instanceof C4730C) {
            h(new C4758h1(this, null));
        } else if (z10 instanceof V) {
            l(new C4761i1(z10, 0));
        } else if (z10 instanceof K) {
            Ad.l.O0(AbstractC4828h.Q(this), null, null, new x1(this, ((K) z10).f39815a, N1.f39841Z, null), 3);
        } else if (z10 instanceof T) {
            f(new r(Uc.N.f17621k.o1(), false));
        } else if (z10 instanceof C4731D) {
            s();
        } else if (z10 instanceof C4804z) {
            h(new C4764j1(this, null));
        } else if (z10 instanceof C4728A) {
            l(C4745d0.f39950m0);
        } else if (z10 instanceof C4729B) {
            h(new C4767k1(this, null));
        } else if (z10 instanceof C4732E) {
            l(C4745d0.f39958u0);
        } else if (z10 instanceof J) {
            AbstractC1809m0.a().b(C1815p0.f23399c, P4.a.o0(new C3959i("location", ((J) z10).f39810a)));
            f(new r(Uc.Q.f17626i.o1(false), false));
        } else if (z10 instanceof S) {
            S s10 = (S) z10;
            AbstractC1809m0.a().b(Z8.B0.f23239c, P4.a.o0(new C3959i("gizmo_id", s10.f39863a.f26438a)));
            String str = s10.f39864b.f26531c;
            Intent intent = new Intent();
            A7.b.G0(intent, str);
            f(new C4783q(intent));
        } else if (z10 instanceof M) {
            l(new C4761i1(z10, 1));
        } else if (z10 instanceof I) {
            h(new C4770l1(this, z10, null));
        } else if (z10 instanceof C4734G) {
            l(new C4761i1(z10, 2));
        } else if (z10 instanceof C4802y) {
            h(new C4773m1(this, null));
        } else if (z10 instanceof N) {
            f(new r(Uc.z.f17704l.p1(((N) z10).f39837a.f26438a), false));
        }
    }

    public final void s() {
        boolean z10;
        D1 d12 = (D1) this.f808e.getValue();
        zd.n nVar = d12.f39780s;
        if ((nVar != null && nVar.f51982a) || d12.f39756K) {
            l(C4745d0.f39954q0);
            return;
        }
        if (nVar != null) {
            z10 = nVar.f51990i;
        } else {
            z10 = true;
        }
        if (true ^ z10) {
            AbstractC1809m0.a().b(Z8.Y0.f23309v, kf.w.f37484Y);
            l(C4745d0.f39955r0);
        } else if (nVar != null && !nVar.f51991j && d12.f39761R) {
            l(C4745d0.f39956s0);
        } else {
            l(C4745d0.f39957t0);
        }
    }
}
