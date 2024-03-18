package f9;

import Ng.AbstractC1085t;
import Ng.C1079o0;
import Ng.v0;
import Qg.F0;
import Qg.n0;
import Qg.s0;
import com.google.android.gms.internal.play_billing.N;
import hh.AbstractC3438f;
import hh.C3443k;
import id.AbstractC3557B;
import ld.C4428a;
import ld.C4429b;
import nd.AbstractC4813b;
import nd.C4812a;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import rc.C5453b;
import x8.W;

/* renamed from: f9.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2954f {

    /* renamed from: a  reason: collision with root package name */
    public final C2960l f29783a;

    /* renamed from: b  reason: collision with root package name */
    public final Pc.g f29784b = Bi.c.i1(Pc.b.f13935m0);

    /* renamed from: c  reason: collision with root package name */
    public final F0 f29785c;

    /* renamed from: d  reason: collision with root package name */
    public final n0 f29786d;

    /* JADX WARN: Type inference failed for: r5v0, types: [k5.F, java.lang.Object] */
    public C2954f(AbstractC4813b abstractC4813b, ld.p pVar, ld.q qVar, C2960l c2960l) {
        C2962n c2962n;
        AbstractC3557B.c0("accountSessionProvider", abstractC4813b);
        AbstractC3557B.c0("userCoroutineScope", pVar);
        AbstractC3557B.c0("userReleaseCompletable", qVar);
        AbstractC3557B.c0("accountUserComponentFactory", c2960l);
        this.f29783a = c2960l;
        C4812a c4812a = (C4812a) Ad.l.a1(C4832l.f40334Y, new C2952d(abstractC4813b, null));
        if (c4812a != null) {
            c2962n = new C2962n(c2960l.f29797a, c2960l.f29798b, new Object(), new Ii.q(4), c4812a, new C4428a(pVar));
            Bi.c.P(null, c2962n);
        } else {
            c2962n = null;
        }
        F0 c10 = s0.c(c2962n);
        this.f29785c = c10;
        this.f29786d = new n0(c10);
        L4.a.E0(L4.a.I0(new C2950b(this, pVar, null), L4.a.l0(((C5453b) abstractC4813b).f44843a)), pVar);
        qVar.a(new C2951c(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C2954f c2954f, AbstractC2949a abstractC2949a, AbstractC4825e abstractC4825e) {
        C2953e c2953e;
        EnumC5000a enumC5000a;
        int i10;
        C2954f c2954f2;
        AbstractC2949a abstractC2949a2;
        Object F10;
        c2954f.getClass();
        if (abstractC4825e instanceof C2953e) {
            c2953e = (C2953e) abstractC4825e;
            int i11 = c2953e.f29782j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2953e.f29782j0 = i11 - Integer.MIN_VALUE;
                Object obj = c2953e.f29780h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c2953e.f29782j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            abstractC2949a2 = c2953e.f29779Z;
                            c2954f2 = c2953e.f29778Y;
                            N.B0(obj);
                            Pc.g gVar = c2954f2.f29784b;
                            C2962n c2962n = (C2962n) abstractC2949a2;
                            C4812a c4812a = c2962n.f29823a;
                            W.F(gVar, "Closed AccountUserReleaseCompletable for " + c4812a, null, 6);
                            C3443k c3443k = AbstractC3438f.f32356c;
                            c3443k.a("AccountUserComponentManager called close for " + c2962n.f29823a, abstractC2949a2);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC2949a = c2953e.f29779Z;
                    c2954f = c2953e.f29778Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    C2962n c2962n2 = (C2962n) abstractC2949a;
                    C4812a c4812a2 = c2962n2.f29823a;
                    W.M(c2954f.f29784b, "Closing AccountUserComponent for " + c4812a2, null, 6);
                    c2953e.f29778Y = c2954f;
                    c2953e.f29779Z = abstractC2949a;
                    c2953e.f29782j0 = 1;
                    C4428a c4428a = c2962n2.f29825b;
                    Ad.l.P(c4428a.f38284Z, null);
                    Object F11 = c4428a.f38283Y.F(c2953e);
                    if (F11 != enumC5000a) {
                        F11 = yVar;
                    }
                    if (F11 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                Pc.g gVar2 = c2954f.f29784b;
                C2962n c2962n3 = (C2962n) abstractC2949a;
                C4812a c4812a3 = c2962n3.f29823a;
                W.F(gVar2, "Closed AccountUserCoroutineScope for " + c4812a3, null, 6);
                C4429b c4429b = (C4429b) c2962n3.f29849n.get();
                c2953e.f29778Y = c2954f;
                c2953e.f29779Z = abstractC2949a;
                c2953e.f29782j0 = 2;
                ((C1079o0) ((AbstractC1085t) c4429b.f38295b)).q0();
                F10 = ((v0) ((AbstractC1085t) c4429b.f38296c)).F(c2953e);
                if (F10 != enumC5000a) {
                    F10 = yVar;
                }
                if (F10 == enumC5000a) {
                    AbstractC2949a abstractC2949a3 = abstractC2949a;
                    c2954f2 = c2954f;
                    abstractC2949a2 = abstractC2949a3;
                    Pc.g gVar3 = c2954f2.f29784b;
                    C2962n c2962n4 = (C2962n) abstractC2949a2;
                    C4812a c4812a4 = c2962n4.f29823a;
                    W.F(gVar3, "Closed AccountUserReleaseCompletable for " + c4812a4, null, 6);
                    C3443k c3443k2 = AbstractC3438f.f32356c;
                    c3443k2.a("AccountUserComponentManager called close for " + c2962n4.f29823a, abstractC2949a2);
                    return yVar;
                }
                return enumC5000a;
            }
        }
        c2953e = new C2953e(c2954f, abstractC4825e);
        Object obj2 = c2953e.f29780h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c2953e.f29782j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        Pc.g gVar22 = c2954f.f29784b;
        C2962n c2962n32 = (C2962n) abstractC2949a;
        C4812a c4812a32 = c2962n32.f29823a;
        W.F(gVar22, "Closed AccountUserCoroutineScope for " + c4812a32, null, 6);
        C4429b c4429b2 = (C4429b) c2962n32.f29849n.get();
        c2953e.f29778Y = c2954f;
        c2953e.f29779Z = abstractC2949a;
        c2953e.f29782j0 = 2;
        ((C1079o0) ((AbstractC1085t) c4429b2.f38295b)).q0();
        F10 = ((v0) ((AbstractC1085t) c4429b2.f38296c)).F(c2953e);
        if (F10 != enumC5000a) {
        }
        if (F10 == enumC5000a) {
        }
    }
}
