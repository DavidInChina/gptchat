package g9;

import M1.w;
import Ng.AbstractC1085t;
import Ng.C1079o0;
import Ng.Q;
import Ng.v0;
import Qg.F0;
import Qg.n0;
import Qg.s0;
import Rg.o;
import Vc.z;
import Yc.t;
import b9.AbstractC2133b;
import com.google.android.gms.internal.play_billing.N;
import f9.C2954f;
import f9.v;
import f9.x;
import hh.AbstractC3438f;
import hh.C3443k;
import id.AbstractC3557B;
import jf.y;
import ld.AbstractC4433f;
import ld.C4431d;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;
import of.EnumC5000a;
import x8.W;

/* renamed from: g9.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3220k implements z, AbstractC4991b {

    /* renamed from: a  reason: collision with root package name */
    public final v f31332a;

    /* renamed from: b  reason: collision with root package name */
    public final x f31333b;

    /* renamed from: c  reason: collision with root package name */
    public final t f31334c;

    /* renamed from: d  reason: collision with root package name */
    public final C4431d f31335d;

    /* renamed from: e  reason: collision with root package name */
    public final Pc.g f31336e = Bi.c.i1(Pc.b.f13935m0);

    /* renamed from: f  reason: collision with root package name */
    public final F0 f31337f;

    /* renamed from: g  reason: collision with root package name */
    public final n0 f31338g;

    /* renamed from: h  reason: collision with root package name */
    public final o f31339h;

    public C3220k(AbstractC2133b abstractC2133b, v vVar, x xVar, t tVar, C4431d c4431d) {
        AbstractC3557B.c0("auth", abstractC2133b);
        AbstractC3557B.c0("userComponentFactory", vVar);
        AbstractC3557B.c0("loggedOutComponentFactory", xVar);
        AbstractC3557B.c0("persistentCookieStorage", tVar);
        AbstractC3557B.c0("appCoroutineScope", c4431d);
        this.f31332a = vVar;
        this.f31333b = xVar;
        this.f31334c = tVar;
        this.f31335d = c4431d;
        F0 f02 = ((C9.l) abstractC2133b).f2800i;
        AbstractC3215f g10 = g((nd.k) f02.getValue());
        h(null, g10);
        F0 c10 = s0.c(g10);
        this.f31337f = c10;
        n0 n0Var = new n0(c10);
        this.f31338g = n0Var;
        this.f31339h = L4.a.V0(new w(n0Var, 3), new Q3.h(5, null));
        L4.a.E0(L4.a.I0(new C3216g(this, null), f02), c4431d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(C3220k c3220k, AbstractC3215f abstractC3215f, AbstractC4825e abstractC4825e) {
        C3217h c3217h;
        EnumC5000a enumC5000a;
        int i10;
        C3220k c3220k2;
        AbstractC3215f abstractC3215f2;
        Object F10;
        c3220k.getClass();
        if (abstractC4825e instanceof C3217h) {
            c3217h = (C3217h) abstractC4825e;
            int i11 = c3217h.f31326j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3217h.f31326j0 = i11 - Integer.MIN_VALUE;
                Object obj = c3217h.f31324h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c3217h.f31326j0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            abstractC3215f2 = c3217h.f31323Z;
                            c3220k2 = c3217h.f31322Y;
                            N.B0(obj);
                            Pc.g gVar = c3220k2.f31336e;
                            nd.k e10 = abstractC3215f2.e();
                            W.F(gVar, "Closed UserReleaseCompletable for " + e10, null, 6);
                            C3443k c3443k = AbstractC3438f.f32356c;
                            nd.k e11 = abstractC3215f2.e();
                            c3443k.a("UserComponentManager called close for " + e11, abstractC3215f2);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC3215f = c3217h.f31323Z;
                    c3220k = c3217h.f31322Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    nd.k e12 = abstractC3215f.e();
                    W.F(c3220k.f31336e, "Closing UserComponent for " + e12, null, 6);
                    AbstractC4433f b10 = abstractC3215f.b();
                    c3217h.f31322Y = c3220k;
                    c3217h.f31323Z = abstractC3215f;
                    c3217h.f31326j0 = 1;
                    Ad.l.P(b10.f38284Z, null);
                    Object F11 = b10.f38283Y.F(c3217h);
                    if (F11 != enumC5000a) {
                        F11 = yVar;
                    }
                    if (F11 == enumC5000a) {
                        return enumC5000a;
                    }
                }
                Pc.g gVar2 = c3220k.f31336e;
                nd.k e13 = abstractC3215f.e();
                W.F(gVar2, "Closed UserCoroutineScope for " + e13, null, 6);
                ld.o d10 = abstractC3215f.d();
                c3217h.f31322Y = c3220k;
                c3217h.f31323Z = abstractC3215f;
                c3217h.f31326j0 = 2;
                ((C1079o0) ((AbstractC1085t) d10.f38295b)).q0();
                F10 = ((v0) ((AbstractC1085t) d10.f38296c)).F(c3217h);
                if (F10 != enumC5000a) {
                    F10 = yVar;
                }
                if (F10 == enumC5000a) {
                    AbstractC3215f abstractC3215f3 = abstractC3215f;
                    c3220k2 = c3220k;
                    abstractC3215f2 = abstractC3215f3;
                    Pc.g gVar3 = c3220k2.f31336e;
                    nd.k e102 = abstractC3215f2.e();
                    W.F(gVar3, "Closed UserReleaseCompletable for " + e102, null, 6);
                    C3443k c3443k2 = AbstractC3438f.f32356c;
                    nd.k e112 = abstractC3215f2.e();
                    c3443k2.a("UserComponentManager called close for " + e112, abstractC3215f2);
                    return yVar;
                }
                return enumC5000a;
            }
        }
        c3217h = new C3217h(c3220k, abstractC4825e);
        Object obj2 = c3217h.f31324h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c3217h.f31326j0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        Pc.g gVar22 = c3220k.f31336e;
        nd.k e132 = abstractC3215f.e();
        W.F(gVar22, "Closed UserCoroutineScope for " + e132, null, 6);
        ld.o d102 = abstractC3215f.d();
        c3217h.f31322Y = c3220k;
        c3217h.f31323Z = abstractC3215f;
        c3217h.f31326j0 = 2;
        ((C1079o0) ((AbstractC1085t) d102.f38295b)).q0();
        F10 = ((v0) ((AbstractC1085t) d102.f38296c)).F(c3217h);
        if (F10 != enumC5000a) {
        }
        if (F10 == enumC5000a) {
        }
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final Tg.e c() {
        return Q.f12904a;
    }

    @Override // od.AbstractC4991b
    public final Object d(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ld.f, ld.p] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ld.f, ld.j] */
    public final AbstractC3215f g(nd.k kVar) {
        boolean z10 = kVar instanceof nd.h;
        Pc.g gVar = this.f31336e;
        C4431d c4431d = this.f31335d;
        if (z10) {
            W.F(gVar, "Creating new UserComponent for " + kVar, null, 6);
            nd.h hVar = (nd.h) kVar;
            AbstractC3557B.c0("parentScope", c4431d);
            ?? abstractC4433f = new AbstractC4433f(c4431d);
            v vVar = this.f31332a;
            vVar.getClass();
            hVar.getClass();
            f9.w wVar = new f9.w(vVar.f29969a, hVar, abstractC4433f);
            C2954f c2954f = (C2954f) wVar.f29979j.get();
            xd.b bVar = (xd.b) wVar.f29985p.get();
            return wVar;
        } else if (AbstractC3557B.K(kVar, nd.i.f40290a) || AbstractC3557B.K(kVar, nd.j.f40291a)) {
            W.F(gVar, "Creating new LoggedOutComponent for " + kVar, null, 6);
            AbstractC3557B.c0("parentScope", c4431d);
            ?? abstractC4433f2 = new AbstractC4433f(c4431d);
            x xVar = this.f31333b;
            xVar.getClass();
            kVar.getClass();
            return new f9.y(xVar.f29987a, kVar, abstractC4433f2);
        } else {
            throw new RuntimeException();
        }
    }

    public final void h(AbstractC3215f abstractC3215f, AbstractC3215f abstractC3215f2) {
        if ((abstractC3215f instanceof f9.w) && (abstractC3215f2 instanceof f9.y)) {
            Ad.l.O0(this.f31335d, null, null, new C3218i(this, null), 3);
        }
        ld.g.f38286a.a(abstractC3215f2);
    }

    @Override // od.AbstractC4991b
    public final void e() {
    }
}
