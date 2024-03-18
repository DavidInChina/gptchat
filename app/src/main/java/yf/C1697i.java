package Yf;

import Bg.Y;
import Bg.k0;
import G0.C0588q;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.EnumC0998g;
import Mf.T;
import Mf.f0;
import Mf.n0;
import Mf.q0;
import Mf.t0;
import Pf.AbstractC1155m;
import bg.AbstractC2199g;
import bg.AbstractC2201i;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.C3963m;
import rg.AbstractC5493d;
import ug.C5927i;

/* renamed from: Yf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697i extends AbstractC1155m implements Wf.c {

    /* renamed from: A0  reason: collision with root package name */
    public final Xf.d f22342A0;

    /* renamed from: B0  reason: collision with root package name */
    public final Ag.l f22343B0;

    /* renamed from: m0  reason: collision with root package name */
    public final s3.z f22344m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AbstractC2199g f22345n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AbstractC0997f f22346o0;

    /* renamed from: p0  reason: collision with root package name */
    public final s3.z f22347p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C3963m f22348q0 = R4.b.D1(new C1695g(this, 2));

    /* renamed from: r0  reason: collision with root package name */
    public final EnumC0998g f22349r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Mf.A f22350s0;

    /* renamed from: t0  reason: collision with root package name */
    public final t0 f22351t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f22352u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C1696h f22353v0;

    /* renamed from: w0  reason: collision with root package name */
    public final o f22354w0;

    /* renamed from: x0  reason: collision with root package name */
    public final T f22355x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C5927i f22356y0;

    /* renamed from: z0  reason: collision with root package name */
    public final H f22357z0;

    static {
        R4.b.X1("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1697i(s3.z zVar, AbstractC1003l abstractC1003l, AbstractC2199g abstractC2199g, AbstractC0997f abstractC0997f) {
        super(zVar.e(), abstractC1003l, r1.d(), ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(abstractC2199g));
        EnumC0998g enumC0998g;
        Mf.A a5;
        t0 t0Var;
        Sf.q qVar;
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC3557B.c0("outerContext", zVar);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("jClass", abstractC2199g);
        Sf.q qVar2 = (Sf.q) abstractC2199g;
        this.f22344m0 = zVar;
        this.f22345n0 = abstractC2199g;
        this.f22346o0 = abstractC0997f;
        s3.z W6 = R4.b.W(zVar, this, abstractC2199g, 4);
        this.f22347p0 = W6;
        ((Cf.h) ((Xf.a) W6.f45394a).f21958g).getClass();
        Class cls = qVar2.f16621a;
        if (cls.isAnnotation()) {
            enumC0998g = EnumC0998g.f12088j0;
        } else if (cls.isInterface()) {
            enumC0998g = EnumC0998g.f12085Z;
        } else if (cls.isEnum()) {
            enumC0998g = EnumC0998g.f12086h0;
        } else {
            enumC0998g = EnumC0998g.f12084Y;
        }
        this.f22349r0 = enumC0998g;
        if (!cls.isAnnotation() && !cls.isEnum()) {
            Cf.k kVar = Mf.A.f12050Y;
            boolean g10 = qVar2.g();
            if (!qVar2.g() && !Modifier.isAbstract(cls.getModifiers()) && !cls.isInterface()) {
                z12 = false;
            } else {
                z12 = true;
            }
            kVar.getClass();
            a5 = Cf.k.d(g10, z12, !Modifier.isFinal(cls.getModifiers()));
        } else {
            a5 = Mf.A.f12051Z;
        }
        this.f22350s0 = a5;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            t0Var = q0.f12100c;
        } else if (Modifier.isPrivate(modifiers)) {
            t0Var = n0.f12095c;
        } else if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                t0Var = Qf.c.f14711c;
            } else {
                t0Var = Qf.b.f14710c;
            }
        } else {
            t0Var = Qf.a.f14709c;
        }
        this.f22351t0 = t0Var;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            qVar = new Sf.q(declaringClass);
        } else {
            qVar = null;
        }
        if (qVar != null && !Modifier.isStatic(cls.getModifiers())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22352u0 = z10;
        this.f22353v0 = new C1696h(this);
        if (abstractC0997f != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        o oVar = new o(W6, this, abstractC2199g, z11, null);
        this.f22354w0 = oVar;
        Cf.h hVar = T.f12069e;
        Ag.u e10 = W6.e();
        Cg.i iVar = ((Cg.o) ((Xf.a) W6.f45394a).f21972u).f3143c;
        Xf.f fVar = new Xf.f(2, this);
        hVar.getClass();
        AbstractC3557B.c0("storageManager", e10);
        AbstractC3557B.c0("kotlinTypeRefinerForOwnerModule", iVar);
        this.f22355x0 = new T(this, e10, fVar, iVar);
        this.f22356y0 = new C5927i(oVar);
        this.f22357z0 = new H(W6, abstractC2199g, this);
        this.f22342A0 = Bi.c.B1(W6, abstractC2199g);
        Ag.u e11 = W6.e();
        C1695g c1695g = new C1695g(this, 1);
        Ag.q qVar3 = (Ag.q) e11;
        qVar3.getClass();
        this.f22343B0 = new Ag.l(qVar3, c1695g);
    }

    @Override // Mf.AbstractC0997f
    public final boolean F() {
        return false;
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return false;
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return this.f22352u0;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final ug.n N() {
        return this.f22357z0;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0997f P() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        return this.f22349r0;
    }

    @Override // Mf.AbstractC1000i
    public final Y f() {
        return this.f22353v0;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return this.f22342A0;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        Sf.q qVar;
        C1008q c1008q = Mf.r.f12101a;
        t0 t0Var = this.f22351t0;
        if (AbstractC3557B.K(t0Var, c1008q)) {
            Class<?> declaringClass = ((Sf.q) this.f22345n0).f16621a.getDeclaringClass();
            if (declaringClass != null) {
                qVar = new Sf.q(declaringClass);
            } else {
                qVar = null;
            }
            if (qVar == null) {
                C1008q c1008q2 = Uf.t.f17834a;
                AbstractC3557B.Z(c1008q2);
                return c1008q2;
            }
        }
        return R4.b.h2(t0Var);
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final Mf.A h() {
        return this.f22350s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kf.v, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // Mf.AbstractC0997f
    public final Collection i() {
        Class[] clsArr;
        AbstractC0997f abstractC0997f;
        Mf.A a5 = Mf.A.f12052h0;
        ?? r12 = kf.v.f37483Y;
        if (this.f22350s0 == a5) {
            Zf.a N1 = A7.b.N1(k0.f2132Z, false, false, null, 7);
            Class cls = ((Sf.q) this.f22345n0).f16621a;
            AbstractC3557B.c0("clazz", cls);
            Method method = (Method) P4.a.e0().f17427Z;
            if (method == null) {
                clsArr = null;
            } else {
                Object invoke = method.invoke(cls, new Object[0]);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>", invoke);
                clsArr = (Class[]) invoke;
            }
            if (clsArr != null) {
                r12 = new ArrayList(clsArr.length);
                for (Class cls2 : clsArr) {
                    r12.add(new Sf.s(cls2));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (AbstractC2201i abstractC2201i : r12) {
                AbstractC1000i k10 = ((U3.i) this.f22347p0.f45398e).L(abstractC2201i, N1).y0().k();
                if (k10 instanceof AbstractC0997f) {
                    abstractC0997f = (AbstractC0997f) k10;
                } else {
                    abstractC0997f = null;
                }
                if (abstractC0997f != null) {
                    arrayList.add(abstractC0997f);
                }
            }
            return kf.t.F2(arrayList, new C0588q(23));
        }
        return r12;
    }

    @Override // Pf.AbstractC1144b, Mf.AbstractC0997f
    public final ug.n i0() {
        return this.f22356y0;
    }

    @Override // Mf.AbstractC0997f
    public final boolean isInline() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final f0 j0() {
        return null;
    }

    @Override // Pf.D
    public final ug.n k0(Cg.i iVar) {
        T t10 = this.f22355x0;
        t10.getClass();
        AbstractC5493d.j(t10.f12071a);
        return (o) ((ug.n) A7.b.X0(t10.f12074d, T.f12070f[0]));
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        return (List) this.f22343B0.mo122invoke();
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean q() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC5493d.h(this);
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        return (List) this.f22354w0.f22370q.mo122invoke();
    }

    /* renamed from: x0 */
    public final o n0() {
        ug.n n02 = super.n0();
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope", n02);
        return (o) n02;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
