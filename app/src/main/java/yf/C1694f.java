package Yf;

import Bg.d0;
import Bg.k0;
import Bg.p0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.V;
import Mf.b0;
import Mf.h0;
import Pf.c0;
import Sf.AbstractC1385d;
import Sf.AbstractC1387f;
import Sf.C1386e;
import Sf.C1388g;
import bg.AbstractC2193a;
import bg.AbstractC2194b;
import bg.AbstractC2195c;
import bg.AbstractC2197e;
import bg.AbstractC2200h;
import bg.AbstractC2203k;
import bg.AbstractC2204l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import pg.AbstractC5170g;
import pg.C5164a;
import pg.C5171h;
import pg.C5172i;
import pg.C5179p;
import pg.C5182s;
import pg.C5187x;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* renamed from: Yf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1694f implements Nf.c, Wf.h {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f22329h;

    /* renamed from: a  reason: collision with root package name */
    public final s3.z f22330a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2193a f22331b;

    /* renamed from: c  reason: collision with root package name */
    public final Ag.j f22332c;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.l f22333d;

    /* renamed from: e  reason: collision with root package name */
    public final Rf.h f22334e;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.l f22335f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f22336g;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f22329h = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(C1694f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), d10.g(new kotlin.jvm.internal.u(d10.b(C1694f.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), d10.g(new kotlin.jvm.internal.u(d10.b(C1694f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C1694f(s3.z zVar, AbstractC2193a abstractC2193a, boolean z10) {
        AbstractC3557B.c0("c", zVar);
        AbstractC3557B.c0("javaAnnotation", abstractC2193a);
        this.f22330a = zVar;
        this.f22331b = abstractC2193a;
        Ag.u e10 = zVar.e();
        C1693e c1693e = new C1693e(this, 1);
        Ag.q qVar = (Ag.q) e10;
        qVar.getClass();
        this.f22332c = new Ag.j(qVar, c1693e);
        Ag.u e11 = zVar.e();
        C1693e c1693e2 = new C1693e(this, 2);
        Ag.q qVar2 = (Ag.q) e11;
        qVar2.getClass();
        this.f22333d = new Ag.l(qVar2, c1693e2);
        this.f22334e = ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(abstractC2193a);
        Ag.u e12 = zVar.e();
        C1693e c1693e3 = new C1693e(this, 0);
        Ag.q qVar3 = (Ag.q) e12;
        qVar3.getClass();
        this.f22335f = new Ag.l(qVar3, c1693e3);
        this.f22336g = z10;
    }

    @Override // Nf.c
    public final C4291c a() {
        Ag.j jVar = this.f22332c;
        Df.v vVar = f22329h[0];
        AbstractC3557B.c0("<this>", jVar);
        AbstractC3557B.c0("p", vVar);
        return (C4291c) jVar.mo122invoke();
    }

    @Override // Nf.c
    public final Map b() {
        return (Map) A7.b.X0(this.f22335f, f22329h[2]);
    }

    public final AbstractC5170g c(AbstractC2194b abstractC2194b) {
        Bg.A a5;
        if (abstractC2194b instanceof AbstractC2204l) {
            return C5171h.f43145a.b(((Sf.x) ((AbstractC2204l) abstractC2194b)).f16628b, null);
        }
        if (abstractC2194b instanceof AbstractC2203k) {
            Sf.v vVar = (Sf.v) ((AbstractC2203k) abstractC2194b);
            Class<?> cls = vVar.f16626b.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            AbstractC3557B.Z(cls);
            return new C5172i(AbstractC1385d.a(cls), C4294f.e(vVar.f16626b.name()));
        }
        boolean z10 = abstractC2194b instanceof AbstractC2197e;
        s3.z zVar = this.f22330a;
        if (z10) {
            AbstractC2197e abstractC2197e = (AbstractC2197e) abstractC2194b;
            C4294f c4294f = ((AbstractC1387f) abstractC2197e).f16608a;
            if (c4294f == null) {
                c4294f = Uf.D.f17727b;
            }
            AbstractC3557B.Z(c4294f);
            ArrayList a10 = ((Sf.h) abstractC2197e).a();
            Bg.D d10 = (Bg.D) A7.b.X0(this.f22333d, f22329h[1]);
            AbstractC3557B.b0("<get-type>(...)", d10);
            if (Bi.c.g1(d10)) {
                return null;
            }
            AbstractC0997f d11 = AbstractC5493d.d(this);
            AbstractC3557B.Z(d11);
            h0 W6 = N.W(c4294f, d11);
            if (W6 == null || (a5 = ((c0) W6).getType()) == null) {
                Jf.l j6 = ((Xf.a) zVar.f45394a).f21966o.j();
                p0 p0Var = p0.f2146h0;
                a5 = j6.g(Dg.m.c(Dg.l.f3685I0, new String[0]));
            }
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(a10, 10));
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                AbstractC5170g c10 = c((AbstractC2194b) it.next());
                if (c10 == null) {
                    c10 = new AbstractC5170g(null);
                }
                arrayList.add(c10);
            }
            return new C5187x(arrayList, a5);
        } else if (abstractC2194b instanceof AbstractC2195c) {
            return new C5164a(new C1694f(zVar, new C1386e(((C1388g) ((AbstractC2195c) abstractC2194b)).f16609b), false));
        } else {
            if (!(abstractC2194b instanceof AbstractC2200h)) {
                return null;
            }
            Sf.r rVar = (Sf.r) ((AbstractC2200h) abstractC2194b);
            rVar.getClass();
            Bg.A L10 = ((U3.i) zVar.f45398e).L(Cf.h.g(rVar.f16622b), A7.b.N1(k0.f2132Z, false, false, null, 7));
            if (Bi.c.g1(L10)) {
                return null;
            }
            Bg.A a11 = L10;
            int i10 = 0;
            while (Jf.l.y(a11)) {
                a11 = ((d0) kf.t.B2(a11.w0())).getType();
                AbstractC3557B.b0("getType(...)", a11);
                i10++;
            }
            AbstractC1000i k10 = a11.y0().k();
            if (k10 instanceof AbstractC0997f) {
                C4290b f6 = AbstractC5493d.f(k10);
                if (f6 == null) {
                    return new AbstractC5170g(new C5179p(L10));
                }
                return new C5182s(f6, i10);
            } else if (!(k10 instanceof b0)) {
                return null;
            } else {
                return new C5182s(C4290b.j(Jf.p.f9165a.g()), 0);
            }
        }
    }

    @Override // Nf.c
    public final V g() {
        return this.f22334e;
    }

    @Override // Nf.c
    public final Bg.A getType() {
        return (Bg.D) A7.b.X0(this.f22333d, f22329h[1]);
    }

    public final String toString() {
        return mg.m.f39296c.w(this, null);
    }
}
