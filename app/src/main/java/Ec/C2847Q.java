package ec;

import Z8.AbstractC1809m0;
import Z8.C1784a;
import b9.AbstractC2133b;
import com.openai.experiment.ExperimentKey;
import e9.C2808a;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import rc.C5451O;
import rc.C5463l;
import rc.C5472v;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import y.C6472j;

/* renamed from: ec.Q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2847Q extends AbstractC2874z {

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC2133b f29172j;

    /* renamed from: k  reason: collision with root package name */
    public final xd.h f29173k;

    /* renamed from: l  reason: collision with root package name */
    public final Ea.b f29174l;

    /* renamed from: m  reason: collision with root package name */
    public final xd.g f29175m;

    /* renamed from: n  reason: collision with root package name */
    public final xd.a f29176n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2847Q(AbstractC2133b abstractC2133b, xd.h hVar, Ea.b bVar, xd.g gVar, xd.b bVar2, xd.a aVar, com.openai.experiment.t tVar) {
        super(new C2873y(null, null, null, null, null, null, r4.c(ExperimentKey.MemoryExperienceEnabled.INSTANCE), null, r4.c(ExperimentKey.VoiceTrainingSettingEnabled.INSTANCE), null));
        com.openai.experiment.G g10 = (com.openai.experiment.G) tVar;
        this.f29172j = abstractC2133b;
        this.f29173k = hVar;
        this.f29174l = bVar;
        this.f29175m = gVar;
        this.f29176n = aVar;
        L4.a.E0(L4.a.I0(new C2831A(this, null), ((rc.Q) hVar).f44819b), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new C2832B(this, null), ((C5472v) bVar2).f44936f), AbstractC4828h.Q(this));
        k(C2849a.f29201x0, ((C5451O) gVar).f44814c);
        h(new C2833C(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        C2834D c2834d;
        int i10;
        boolean z10;
        c2847q.getClass();
        if (abstractC4825e instanceof C2834D) {
            c2834d = (C2834D) abstractC4825e;
            int i11 = c2834d.f29131i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2834d.f29131i0 = i11 - Integer.MIN_VALUE;
                Object obj = c2834d.f29129Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2834d.f29131i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2847q = c2834d.f29128Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c2847q.l(C2835E.f29132Z);
                    c2834d.f29128Y = c2847q;
                    c2834d.f29131i0 = 1;
                    obj = ((xa.s) c2847q.f29174l).b(c2834d);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0 v0Var = (v0) obj;
                z10 = v0Var instanceof u0;
                C2835E c2835e = C2835E.f29133h0;
                if (!z10) {
                    jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                } else if (v0Var instanceof q0) {
                    c2847q.l(new C2808a((q0) v0Var, 8));
                    c2847q.f(new C2855g(v0Var));
                    return jf.y.f36177a;
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                c2847q.l(c2835e);
                c2847q.f(new C2855g(v0Var));
                return jf.y.f36177a;
            }
        }
        c2834d = new C2834D(c2847q, abstractC4825e);
        Object obj2 = c2834d.f29129Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2834d.f29131i0;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj2;
        z10 = v0Var2 instanceof u0;
        C2835E c2835e2 = C2835E.f29133h0;
        if (!z10) {
        }
        c2847q.l(c2835e2);
        c2847q.f(new C2855g(v0Var2));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        C2836F c2836f;
        int i10;
        boolean z10;
        c2847q.getClass();
        if (abstractC4825e instanceof C2836F) {
            c2836f = (C2836F) abstractC4825e;
            int i11 = c2836f.f29143i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2836f.f29143i0 = i11 - Integer.MIN_VALUE;
                Object obj = c2836f.f29141Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2836f.f29143i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2847q = c2836f.f29140Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(C1784a.f23325f, kf.w.f37484Y);
                    c2847q.l(C2835E.f29134i0);
                    c2836f.f29140Y = c2847q;
                    c2836f.f29143i0 = 1;
                    obj = ((xa.s) c2847q.f29174l).e(c2836f);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0 v0Var = (v0) obj;
                z10 = v0Var instanceof u0;
                C2835E c2835e = C2835E.f29135j0;
                C1784a c1784a = C1784a.f23326g;
                if (!z10) {
                    jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                } else if (v0Var instanceof q0) {
                    AbstractC1809m0.a().b(C1784a.f23324e, kf.w.f37484Y);
                    c2847q.l(new C2808a((q0) v0Var, 9));
                    c2847q.f(new C2856h(v0Var));
                    return jf.y.f36177a;
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                AbstractC1809m0.a().b(c1784a, kf.w.f37484Y);
                c2847q.l(c2835e);
                c2847q.f(new C2856h(v0Var));
                return jf.y.f36177a;
            }
        }
        c2836f = new C2836F(c2847q, abstractC4825e);
        Object obj2 = c2836f.f29141Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2836f.f29143i0;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj2;
        z10 = v0Var2 instanceof u0;
        C2835E c2835e2 = C2835E.f29135j0;
        C1784a c1784a2 = C1784a.f23326g;
        if (!z10) {
        }
        AbstractC1809m0.a().b(c1784a2, kf.w.f37484Y);
        c2847q.l(c2835e2);
        c2847q.f(new C2856h(v0Var2));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        C2837G c2837g;
        int i10;
        boolean z10;
        c2847q.getClass();
        if (abstractC4825e instanceof C2837G) {
            c2837g = (C2837G) abstractC4825e;
            int i11 = c2837g.f29147i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2837g.f29147i0 = i11 - Integer.MIN_VALUE;
                Object obj = c2837g.f29145Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2837g.f29147i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2847q = c2837g.f29144Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(C1784a.f23322c, kf.w.f37484Y);
                    c2847q.l(C2835E.f29136k0);
                    c2837g.f29144Y = c2847q;
                    c2837g.f29147i0 = 1;
                    obj = ((C5463l) c2847q.f29176n).b(c2837g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0 v0Var = (v0) obj;
                z10 = v0Var instanceof u0;
                C2835E c2835e = C2835E.f29137l0;
                C1784a c1784a = C1784a.f23323d;
                if (!z10) {
                    jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
                } else if (v0Var instanceof q0) {
                    AbstractC1809m0.a().b(C1784a.f23321b, kf.w.f37484Y);
                    c2847q.l(new C2808a((q0) v0Var, 10));
                    c2847q.f(new C2858j(v0Var));
                    return jf.y.f36177a;
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                AbstractC1809m0.a().b(c1784a, kf.w.f37484Y);
                c2847q.l(c2835e);
                c2847q.f(new C2858j(v0Var));
                return jf.y.f36177a;
            }
        }
        c2837g = new C2837G(c2847q, abstractC4825e);
        Object obj2 = c2837g.f29145Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2837g.f29147i0;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj2;
        z10 = v0Var2 instanceof u0;
        C2835E c2835e2 = C2835E.f29137l0;
        C1784a c1784a2 = C1784a.f23323d;
        if (!z10) {
        }
        AbstractC1809m0.a().b(c1784a2, kf.w.f37484Y);
        c2847q.l(c2835e2);
        c2847q.f(new C2858j(v0Var2));
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(C2847Q c2847q, AbstractC4825e abstractC4825e) {
        C2838H c2838h;
        int i10;
        boolean z10;
        C6472j c6472j;
        c2847q.getClass();
        if (abstractC4825e instanceof C2838H) {
            c2838h = (C2838H) abstractC4825e;
            int i11 = c2838h.f29151i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2838h.f29151i0 = i11 - Integer.MIN_VALUE;
                Object obj = c2838h.f29149Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2838h.f29151i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2847q = c2838h.f29148Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1809m0.a().b(C1784a.f23328i, kf.w.f37484Y);
                    c2847q.l(C2835E.f29138m0);
                    c2838h.f29148Y = c2847q;
                    c2838h.f29151i0 = 1;
                    obj = ((C5463l) c2847q.f29176n).c(c2838h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0 v0Var = (v0) obj;
                z10 = v0Var instanceof u0;
                C1784a c1784a = C1784a.f23329j;
                jf.y yVar = jf.y.f36177a;
                if (!z10) {
                    jf.y yVar2 = (jf.y) ((u0) v0Var).f48468a;
                    AbstractC1809m0.a().b(c1784a, kf.w.f37484Y);
                    c6472j = new C6472j(3, yVar);
                } else if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    AbstractC1809m0.a().b(C1784a.f23327h, kf.w.f37484Y);
                    AbstractC3557B.c0("error", q0Var);
                    c2847q.l(new C2808a(q0Var, 11));
                    c2847q.f(new C2857i(v0Var));
                    return yVar;
                } else if (v0Var instanceof p0) {
                    AbstractC1809m0.a().b(c1784a, kf.w.f37484Y);
                    c6472j = new C6472j(3, yVar);
                } else {
                    throw new RuntimeException();
                }
                c2847q.l(c6472j);
                c2847q.f(new C2857i(v0Var));
                return yVar;
            }
        }
        c2838h = new C2838H(c2847q, abstractC4825e);
        Object obj2 = c2838h.f29149Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2838h.f29151i0;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj2;
        z10 = v0Var2 instanceof u0;
        C1784a c1784a2 = C1784a.f23329j;
        jf.y yVar3 = jf.y.f36177a;
        if (!z10) {
        }
        c2847q.l(c6472j);
        c2847q.f(new C2857i(v0Var2));
        return yVar3;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2868t abstractC2868t = (AbstractC2868t) iVar;
        AbstractC3557B.c0("intent", abstractC2868t);
        if (abstractC2868t instanceof C2866r) {
            h(new C2840J(abstractC2868t, this, null));
        } else if (AbstractC3557B.K(abstractC2868t, C2864p.f29242a)) {
            h(new C2841K(this, null));
        } else if (AbstractC3557B.K(abstractC2868t, C2863o.f29241a)) {
            h(new C2842L(this, null));
        } else if (AbstractC3557B.K(abstractC2868t, C2867s.f29245a)) {
            h(new C2843M(this, null));
        } else if (AbstractC3557B.K(abstractC2868t, C2865q.f29243a)) {
            h(new C2844N(this, null));
        } else if (abstractC2868t instanceof C2861m) {
            h(new C2845O(abstractC2868t, this, null));
        } else if (abstractC2868t instanceof C2862n) {
            h(new C2846P(abstractC2868t, this, null));
        }
    }
}
