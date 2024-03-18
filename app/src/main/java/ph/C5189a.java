package ph;

import Bh.AbstractC0241e;
import Bh.AbstractC0257m;
import Bh.AbstractC0263p;
import Bh.C0244f0;
import Bh.C0247h;
import Bh.C0249i;
import Bh.EnumC0237c;
import Bh.EnumC0250i0;
import Bh.EnumC0255l;
import Bh.H;
import Bh.W;
import Eh.AbstractC0512k;
import Eh.C0507f;
import Eh.EnumC0508g;
import Eh.EnumC0526z;
import Fh.D;
import Fh.E;
import Fh.F;
import Fh.n;
import K4.C0813a;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.AbstractC1243v;
import Qh.C1226d;
import Qh.C1237o;
import Qh.C1242u;
import Qh.C1246y;
import Qh.C1247z;
import Sh.EnumC1400f;
import Sh.J;
import java.lang.reflect.AccessibleObject;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import rh.EnumC5495b;
import yh.C6633q0;
import yh.C6641v;
import yh.Y0;
import yh.l1;
import yh.t1;
import z.AbstractC6708l;
import zh.C6874b;
import zh.P;
import zh.Q;

/* renamed from: ph.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5189a {

    /* renamed from: m  reason: collision with root package name */
    public static final k f43160m;

    /* renamed from: n  reason: collision with root package name */
    public static final C0813a f43161n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0507f f43162o;

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f43163p;

    /* renamed from: a  reason: collision with root package name */
    public final f f43164a;

    /* renamed from: b  reason: collision with root package name */
    public final m f43165b;

    /* renamed from: c  reason: collision with root package name */
    public final Gh.b f43166c;

    /* renamed from: d  reason: collision with root package name */
    public final n f43167d;

    /* renamed from: e  reason: collision with root package name */
    public final int f43168e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC0512k f43169f;

    /* renamed from: g  reason: collision with root package name */
    public final H f43170g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC0257m f43171h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC1243v f43172i;

    /* renamed from: j  reason: collision with root package name */
    public final int f43173j;

    /* renamed from: k  reason: collision with root package name */
    public final Q f43174k;

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC0241e f43175l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [ph.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ph.j, java.lang.Object] */
    static {
        Object obj;
        C0813a c0813a;
        C0507f c0507f;
        k kVar = null;
        try {
            Class.forName("java.security.AccessController", false, null);
            f43163p = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f43163p = false;
        } catch (SecurityException unused2) {
            f43163p = true;
        }
        Uh.b bVar = new Uh.b("net.bytebuddy.naming");
        if (f43163p) {
            obj = AccessController.doPrivileged(bVar);
        } else {
            obj = System.getProperty("net.bytebuddy.naming");
        }
        String str = (String) obj;
        h hVar = h.f43206Y;
        if (str == null) {
            if (EnumC1400f.a().f16726Y) {
                kVar = new k(new Object());
                c0813a = new C0813a("auxiliary", 9, 0);
                c0507f = new Object();
            } else {
                c0507f = null;
                c0813a = null;
            }
        } else if (str.equalsIgnoreCase("fixed")) {
            kVar = new k(hVar);
            c0813a = new C0813a("auxiliary", 9, 0);
            c0507f = new Object();
        } else if (str.equalsIgnoreCase("caller")) {
            kVar = new k(new Object());
            c0813a = new C0813a("auxiliary", 9, 0);
            c0507f = new Object();
        } else {
            try {
                l lVar = new l(new J(new Random(Long.parseLong(str))));
                c0813a = new C0813a("auxiliary", 9, 0);
                kVar = lVar;
                c0507f = new Object();
            } catch (Exception unused3) {
                throw new IllegalStateException("'net.bytebuddy.naming' is set to an unknown, non-numeric value: ".concat(str));
            }
        }
        f43160m = kVar;
        f43161n = c0813a;
        f43162o = c0507f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5189a() {
        this(r2, r3, r4, r5, 1, r0 == null ? EnumC0508g.f4783Y : r0, H.f2210d, EnumC0255l.f2359Y, 1, P.f52115Y, EnumC0237c.f2319Y, new C1242u(Qh.H.SYNTHETIC.f14972h0.c(AbstractC1235m.c("finalize").b(new C1246y(new C1226d())).b(new C1247z(new C1237o(AbstractC1235m.a(C6641v.l1(Void.TYPE))))).b(AbstractC1235m.b(C6641v.l1(Object.class))))));
        f i10 = f.i(f.f43189k0);
        m mVar = f43160m;
        m lVar = mVar == null ? new l(new J(0)) : mVar;
        Gh.b bVar = f43161n;
        Gh.b aVar = bVar == null ? new Gh.a() : bVar;
        Fh.l lVar2 = Fh.m.f5394Y;
        AbstractC0512k abstractC0512k = f43162o;
    }

    public final Ch.d a() {
        F f6;
        ClassLoader classLoader = AccessibleObject.class.getClassLoader();
        if (classLoader == null) {
            classLoader = C6874b.f52119Z;
        }
        C6874b c6874b = new C6874b(classLoader);
        l1 l12 = C6641v.l1(AccessibleObject.class);
        if (!l12.T0() && !l12.a1()) {
            AbstractC0263p a5 = this.f43171h.a(l12);
            C0247h c0247h = new C0247h();
            W w10 = new W();
            C0244f0 c0244f0 = new C0244f0();
            int i10 = this.f43168e;
            if (E9.f.m(i10)) {
                f6 = new D(l12);
            } else {
                f6 = E.f5380Y;
            }
            F f10 = f6;
            EnumC5495b enumC5495b = EnumC5495b.f44987Y;
            List emptyList = Collections.emptyList();
            return new Ch.d(a5, c0247h, w10, c0244f0, f10, enumC5495b, this.f43164a, this.f43166c, this.f43167d, i10, this.f43169f, this.f43170g, this.f43173j, this.f43174k, this.f43175l, this.f43172i, emptyList, l12, c6874b);
        }
        throw new IllegalArgumentException("Cannot redefine array or primitive type: " + l12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [yh.G1] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final Dh.i b(l1 l1Var, Dh.f fVar) {
        l1.a w02;
        t1 t1Var;
        if (!l1Var.a1() && !l1Var.T0() && !l1Var.isFinal()) {
            if (l1Var.E0()) {
                w02 = C6633q0.i1(Object.class);
                t1Var = new t1(l1Var);
            } else {
                w02 = l1Var.w0();
                t1Var = new AbstractC1239q(1);
            }
            l1.a aVar = w02;
            l1.a w03 = l1Var.w0();
            g gVar = (g) this.f43165b;
            gVar.getClass();
            String a5 = gVar.a(w03.l0());
            List<xh.c> asList = Arrays.asList(xh.e.PUBLIC, xh.d.PLAIN);
            int u02 = l1Var.u0();
            int i10 = u02;
            for (xh.c cVar : asList) {
                i10 = ((~cVar.b()) & i10) | cVar.a();
            }
            ((EnumC0255l) this.f43171h).getClass();
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            List emptyList3 = Collections.emptyList();
            Map emptyMap = Collections.emptyMap();
            List emptyList4 = Collections.emptyList();
            List emptyList5 = Collections.emptyList();
            List emptyList6 = Collections.emptyList();
            EnumC0250i0 enumC0250i0 = EnumC0250i0.f2355Y;
            EnumC0526z enumC0526z = EnumC0526z.f4818Y;
            l1 l1Var2 = l1.f51039b0;
            C0249i c0249i = new C0249i(a5, i10, aVar, emptyList, emptyList2, emptyList3, emptyMap, emptyList4, emptyList5, emptyList6, enumC0250i0, enumC0526z, null, null, null, Collections.emptyList(), null, false, false, false, zh.H.f52110a, Collections.emptyList());
            return new Dh.i(new C0249i(c0249i.f2337i0, c0249i.f2338j0, c0249i.f2339k0, c0249i.f2340l0, A7.b.l1(c0249i.f2341m0, t1Var.k(new Y0(AbstractC1235m.a(c0249i)))), c0249i.f2342n0, c0249i.f2343o0, c0249i.f2344p0, c0249i.f2345q0, c0249i.f2346r0, c0249i.f2347s0, c0249i.f2348t0, c0249i.f2349u0, c0249i.f2350v0, c0249i.f2351w0, c0249i.f2352x0, c0249i.f2353y0, c0249i.f2354z0, c0249i.f2333A0, c0249i.f2334B0, c0249i.f2335C0, c0249i.f2336D0), new C0247h(), new W(), new C0244f0(), E.f5380Y, EnumC5495b.f44987Y, this.f43164a, this.f43166c, this.f43167d, this.f43168e, this.f43169f, this.f43170g, this.f43173j, this.f43174k, this.f43175l, this.f43172i, Collections.emptyList(), fVar);
        }
        throw new IllegalArgumentException("Cannot subclass primitive, array or final types: " + l1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5189a.class != obj.getClass()) {
            return false;
        }
        C5189a c5189a = (C5189a) obj;
        if (AbstractC6708l.c(this.f43168e, c5189a.f43168e) && AbstractC6708l.c(this.f43173j, c5189a.f43173j) && this.f43164a.equals(c5189a.f43164a) && this.f43165b.equals(c5189a.f43165b) && this.f43166c.equals(c5189a.f43166c) && this.f43167d.equals(c5189a.f43167d) && this.f43169f.equals(c5189a.f43169f) && this.f43170g.equals(c5189a.f43170g) && this.f43171h.equals(c5189a.f43171h) && this.f43172i.equals(c5189a.f43172i) && this.f43174k.equals(c5189a.f43174k) && this.f43175l.equals(c5189a.f43175l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f43165b.hashCode();
        int hashCode2 = this.f43166c.hashCode();
        int hashCode3 = this.f43167d.hashCode();
        int d10 = AbstractC6708l.d(this.f43168e, (hashCode3 + ((hashCode2 + ((hashCode + (((C5189a.class.hashCode() * 31) + this.f43164a.f43205Y) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode4 = this.f43170g.hashCode();
        int hashCode5 = this.f43171h.hashCode();
        int hashCode6 = this.f43172i.hashCode();
        int d11 = AbstractC6708l.d(this.f43173j, (hashCode6 + ((hashCode5 + ((hashCode4 + ((this.f43169f.hashCode() + d10) * 31)) * 31)) * 31)) * 31, 31);
        return this.f43175l.hashCode() + ((this.f43174k.hashCode() + d11) * 31);
    }

    public C5189a(f fVar, m mVar, Gh.b bVar, n nVar, int i10, AbstractC0512k abstractC0512k, H h10, AbstractC0257m abstractC0257m, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v) {
        this.f43164a = fVar;
        this.f43165b = mVar;
        this.f43166c = bVar;
        this.f43167d = nVar;
        this.f43168e = i10;
        this.f43169f = abstractC0512k;
        this.f43170g = h10;
        this.f43171h = abstractC0257m;
        this.f43173j = i11;
        this.f43174k = q10;
        this.f43175l = abstractC0241e;
        this.f43172i = abstractC1243v;
    }
}
