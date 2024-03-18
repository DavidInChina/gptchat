package Yf;

import Bg.k0;
import Bg.o0;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Pf.AbstractC1146d;
import Pf.AbstractC1165x;
import Pf.S;
import Pf.b0;
import Z.C1745x0;
import bg.AbstractC2198f;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import jf.C3959i;
import kg.C4294f;
import ug.C5925g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class B extends ug.o {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f22291m;

    /* renamed from: b  reason: collision with root package name */
    public final s3.z f22292b;

    /* renamed from: c  reason: collision with root package name */
    public final B f22293c;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.d f22294d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.l f22295e;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.n f22296f;

    /* renamed from: g  reason: collision with root package name */
    public final Ag.m f22297g;

    /* renamed from: h  reason: collision with root package name */
    public final Ag.n f22298h;

    /* renamed from: i  reason: collision with root package name */
    public final Ag.l f22299i;

    /* renamed from: j  reason: collision with root package name */
    public final Ag.l f22300j;

    /* renamed from: k  reason: collision with root package name */
    public final Ag.l f22301k;

    /* renamed from: l  reason: collision with root package name */
    public final Ag.n f22302l;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f22291m = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(B.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), d10.g(new kotlin.jvm.internal.u(d10.b(B.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), d10.g(new kotlin.jvm.internal.u(d10.b(B.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public B(s3.z zVar, B b10) {
        AbstractC3557B.c0("c", zVar);
        this.f22292b = zVar;
        this.f22293c = b10;
        Ag.u e10 = zVar.e();
        x xVar = new x(this, 0);
        Ag.q qVar = (Ag.q) e10;
        qVar.getClass();
        this.f22294d = new Ag.d(qVar, xVar);
        Ag.u e11 = zVar.e();
        x xVar2 = new x(this, 2);
        Ag.q qVar2 = (Ag.q) e11;
        qVar2.getClass();
        this.f22295e = new Ag.l(qVar2, xVar2);
        this.f22296f = ((Ag.q) zVar.e()).b(new y(this, 1));
        this.f22297g = ((Ag.q) zVar.e()).c(new y(this, 0));
        this.f22298h = ((Ag.q) zVar.e()).b(new y(this, 2));
        Ag.u e12 = zVar.e();
        x xVar3 = new x(this, 3);
        Ag.q qVar3 = (Ag.q) e12;
        qVar3.getClass();
        this.f22299i = new Ag.l(qVar3, xVar3);
        Ag.u e13 = zVar.e();
        x xVar4 = new x(this, 4);
        Ag.q qVar4 = (Ag.q) e13;
        qVar4.getClass();
        this.f22300j = new Ag.l(qVar4, xVar4);
        Ag.u e14 = zVar.e();
        x xVar5 = new x(this, 1);
        Ag.q qVar5 = (Ag.q) e14;
        qVar5.getClass();
        this.f22301k = new Ag.l(qVar5, xVar5);
        this.f22302l = ((Ag.q) zVar.e()).b(new y(this, 3));
    }

    public static Bg.A l(Sf.z zVar, s3.z zVar2) {
        AbstractC3557B.c0("method", zVar);
        Class<?> declaringClass = ((Method) zVar.a()).getDeclaringClass();
        AbstractC3557B.b0("getDeclaringClass(...)", declaringClass);
        Zf.a N1 = A7.b.N1(k0.f2132Z, declaringClass.isAnnotation(), false, null, 6);
        Type genericReturnType = zVar.f16629a.getGenericReturnType();
        AbstractC3557B.b0("getGenericReturnType(...)", genericReturnType);
        return ((U3.i) zVar2.f45398e).L(Cf.h.g(genericReturnType), N1);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Z.x0, java.lang.Object] */
    public static C1745x0 u(s3.z zVar, AbstractC1165x abstractC1165x, List list) {
        C3959i c3959i;
        C4294f c4294f;
        C4294f e10;
        AbstractC2198f abstractC2198f;
        kf.o R22 = kf.t.R2(list);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(R22, 10));
        Iterator it = R22.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            kf.y yVar = (kf.y) it.next();
            int i10 = yVar.f37486a;
            Sf.F f6 = (Sf.F) yVar.f37487b;
            Xf.d B12 = Bi.c.B1(zVar, f6);
            C4294f c4294f2 = null;
            Zf.a N1 = A7.b.N1(k0.f2132Z, z10, z10, null, 7);
            boolean z12 = f6.f16596d;
            Sf.D d10 = f6.f16593a;
            if (z12) {
                if (d10 instanceof AbstractC2198f) {
                    abstractC2198f = (AbstractC2198f) d10;
                } else {
                    abstractC2198f = null;
                }
                if (abstractC2198f != null) {
                    o0 K10 = ((U3.i) zVar.f45398e).K(abstractC2198f, N1, true);
                    c3959i = new C3959i(K10, zVar.d().j().f(K10));
                } else {
                    throw new AssertionError("Vararg parameter should be an array: " + f6);
                }
            } else {
                c3959i = new C3959i(((U3.i) zVar.f45398e).L(d10, N1), null);
            }
            Bg.A a5 = (Bg.A) c3959i.f36155Y;
            Bg.A a10 = (Bg.A) c3959i.f36156Z;
            if (AbstractC3557B.K(abstractC1165x.getName().b(), "equals") && list.size() == 1 && AbstractC3557B.K(zVar.d().j().o(), a5)) {
                e10 = C4294f.e("other");
            } else {
                String str = f6.f16595c;
                if (str != null) {
                    c4294f2 = C4294f.d(str);
                }
                if (c4294f2 == null) {
                    z11 = true;
                }
                if (c4294f2 == null) {
                    e10 = C4294f.e("p" + i10);
                } else {
                    c4294f = c4294f2;
                    arrayList.add(new b0(abstractC1165x, null, i10, B12, c4294f, a5, false, false, false, a10, ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(f6)));
                    z10 = false;
                }
            }
            c4294f = e10;
            arrayList.add(new b0(abstractC1165x, null, i10, B12, c4294f, a5, false, false, false, a10, ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(f6)));
            z10 = false;
        }
        List K22 = kf.t.K2(arrayList);
        ?? obj = new Object();
        obj.f22768b = K22;
        obj.f22767a = z11;
        return obj;
    }

    @Override // ug.o, ug.n
    public Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        if (!b().contains(c4294f)) {
            return kf.v.f37483Y;
        }
        return (Collection) this.f22298h.invoke(c4294f);
    }

    @Override // ug.o, ug.n
    public final Set b() {
        return (Set) A7.b.X0(this.f22299i, f22291m[0]);
    }

    @Override // ug.o, ug.n
    public final Set c() {
        return (Set) A7.b.X0(this.f22301k, f22291m[2]);
    }

    @Override // ug.o, ug.p
    public Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        return (Collection) this.f22294d.mo122invoke();
    }

    @Override // ug.o, ug.n
    public Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        if (!g().contains(c4294f)) {
            return kf.v.f37483Y;
        }
        return (Collection) this.f22302l.invoke(c4294f);
    }

    @Override // ug.o, ug.n
    public final Set g() {
        return (Set) A7.b.X0(this.f22300j, f22291m[1]);
    }

    public abstract Set h(C5925g c5925g, ug.k kVar);

    public abstract Set i(C5925g c5925g, ug.k kVar);

    public void j(ArrayList arrayList, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
    }

    public abstract AbstractC1691c k();

    public abstract void m(LinkedHashSet linkedHashSet, C4294f c4294f);

    public abstract void n(ArrayList arrayList, C4294f c4294f);

    public abstract Set o(C5925g c5925g);

    public abstract AbstractC1146d p();

    public abstract AbstractC1003l q();

    public boolean r(Wf.f fVar) {
        return true;
    }

    public abstract w s(Sf.z zVar, ArrayList arrayList, Bg.A a5, List list);

    public final Wf.f t(Sf.z zVar) {
        boolean z10;
        S s10;
        Map map;
        AbstractC3557B.c0("method", zVar);
        s3.z zVar2 = this.f22292b;
        Xf.d B12 = Bi.c.B1(zVar2, zVar);
        AbstractC1003l q10 = q();
        C4294f b10 = zVar.b();
        Rf.h a5 = ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(zVar);
        if (((AbstractC1691c) this.f22295e.mo122invoke()).f(zVar.b()) != null && ((ArrayList) zVar.e()).isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Wf.f L02 = Wf.f.L0(q10, B12, b10, a5, z10);
        AbstractC3557B.c0("<this>", zVar2);
        s3.z zVar3 = new s3.z((Xf.a) zVar2.f45394a, new Xf.g(zVar2, L02, zVar, 0), (AbstractC3957g) zVar2.f45396c);
        ArrayList typeParameters = zVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            Mf.b0 a10 = ((Xf.i) zVar3.f45395b).a((Sf.E) it.next());
            AbstractC3557B.Z(a10);
            arrayList.add(a10);
        }
        C1745x0 u10 = u(zVar3, L02, zVar.e());
        w s11 = s(zVar, arrayList, l(zVar, zVar3), (List) u10.f22768b);
        Bg.A a11 = s11.f22394b;
        if (a11 != null) {
            s10 = R4.b.h0(L02, a11, Nf.h.f12822a);
        } else {
            s10 = null;
        }
        S s12 = s10;
        AbstractC1146d p10 = p();
        kf.v vVar = kf.v.f37483Y;
        Mf.A.f12050Y.getClass();
        Mf.A d10 = Cf.k.d(false, Modifier.isAbstract(((Method) zVar.a()).getModifiers()), !Modifier.isFinal(((Method) zVar.a()).getModifiers()));
        AbstractC1007p h22 = R4.b.h2(zVar.d());
        if (a11 != null) {
            map = P4.a.o0(new C3959i(Wf.f.f21082L0, kf.t.f2((List) u10.f22768b)));
        } else {
            map = kf.w.f37484Y;
        }
        L02.K0(s12, p10, vVar, s11.f22396d, s11.f22395c, s11.f22393a, d10, h22, map);
        L02.M0(s11.f22397e, u10.f22767a);
        if (!(!s11.f22398f.isEmpty())) {
            return L02;
        }
        ((Cf.k) ((Xf.a) zVar3.f45394a).f21956e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
