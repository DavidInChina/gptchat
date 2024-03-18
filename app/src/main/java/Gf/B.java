package Gf;

import Df.AbstractC0405d;
import Mf.AbstractC0997f;
import Mf.EnumC0998g;
import Pf.C1156n;
import Sf.AbstractC1385d;
import android.gov.nist.core.Separators;
import hg.C3430i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import l8.AbstractC4344b;
import lg.C4470o;
import sg.EnumC5626c;
import ug.AbstractC5926h;
import zg.C6862i;

/* loaded from: classes2.dex */
public final class B extends H implements AbstractC0405d, C, t0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f6331i0 = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Class f6332Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC3957g f6333h0 = R4.b.C1(EnumC3958h.f36152Y, new C0646u(this, 7));

    public B(Class cls) {
        AbstractC3557B.c0("jClass", cls);
        this.f6332Z = cls;
    }

    public static C1156n y(C4290b c4290b, Rf.g gVar) {
        xg.m mVar = gVar.f15506a;
        Mf.B b10 = mVar.f50011b;
        C4291c g10 = c4290b.g();
        AbstractC3557B.b0("getPackageFqName(...)", g10);
        C1156n c1156n = new C1156n(new Lf.l(b10, g10, 1), c4290b.i(), Mf.A.f12051Z, EnumC0998g.f12084Y, AbstractC4344b.F0(mVar.f50011b.j().j("Any").n()), mVar.f50010a);
        c1156n.x0(new AbstractC5926h(mVar.f50010a, c1156n), kf.x.f37485Y, null);
        return c1156n;
    }

    /* renamed from: A */
    public final AbstractC0997f getDescriptor() {
        return ((C0649x) this.f6333h0.getValue()).a();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof B) && AbstractC3557B.K(R4.b.l1(this), R4.b.l1((AbstractC0405d) obj))) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC4306e
    public final Class f() {
        return this.f6332Z;
    }

    public final int hashCode() {
        return R4.b.l1(this).hashCode();
    }

    @Override // Df.AbstractC0405d
    public final List i() {
        C0649x c0649x = (C0649x) this.f6333h0.getValue();
        c0649x.getClass();
        Df.v vVar = C0649x.f6486n[8];
        Object mo122invoke = c0649x.f6491g.mo122invoke();
        AbstractC3557B.b0("getValue(...)", mo122invoke);
        return (List) mo122invoke;
    }

    @Override // Gf.H
    public final Collection j() {
        AbstractC0997f descriptor = getDescriptor();
        if (descriptor.e() != EnumC0998g.f12085Z && descriptor.e() != EnumC0998g.f12089k0) {
            Collection u10 = descriptor.u();
            AbstractC3557B.b0("getConstructors(...)", u10);
            return u10;
        }
        return kf.v.f37483Y;
    }

    @Override // Gf.H
    public final Collection k(C4294f c4294f) {
        ug.n R10 = getDescriptor().n().R();
        Tf.d dVar = Tf.d.f17212Z;
        Collection a5 = R10.a(c4294f, dVar);
        ug.n N10 = getDescriptor().N();
        AbstractC3557B.b0("getStaticScope(...)", N10);
        return kf.t.w2(N10.a(c4294f, dVar), a5);
    }

    @Override // Gf.H
    public final Mf.P l(int i10) {
        C6862i c6862i;
        Class<?> declaringClass;
        Class cls = this.f6332Z;
        if (AbstractC3557B.K(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((B) R4.b.n1(declaringClass)).l(i10);
        }
        AbstractC0997f descriptor = getDescriptor();
        if (descriptor instanceof C6862i) {
            c6862i = (C6862i) descriptor;
        } else {
            c6862i = null;
        }
        if (c6862i == null) {
            return null;
        }
        C4470o c4470o = ig.k.f33241j;
        AbstractC3557B.b0("classLocalVariable", c4470o);
        fg.G g10 = (fg.G) A7.b.Q0(c6862i.f52038j0, c4470o, i10);
        if (g10 == null) {
            return null;
        }
        M3.I i11 = c6862i.f52045q0;
        return (Mf.P) A0.f(this.f6332Z, g10, i11.f11537b, (C3430i) i11.f11539d, c6862i.f52039k0, A.f6329Y);
    }

    @Override // Df.AbstractC0405d
    public final String o() {
        C0649x c0649x = (C0649x) this.f6333h0.getValue();
        c0649x.getClass();
        Df.v vVar = C0649x.f6486n[2];
        return (String) c0649x.f6488d.mo122invoke();
    }

    @Override // Df.AbstractC0405d
    public final String p() {
        C0649x c0649x = (C0649x) this.f6333h0.getValue();
        c0649x.getClass();
        Df.v vVar = C0649x.f6486n[3];
        return (String) c0649x.f6489e.mo122invoke();
    }

    @Override // Df.AbstractC0405d
    public final Object q() {
        return ((C0649x) this.f6333h0.getValue()).f6490f.getValue();
    }

    @Override // Df.AbstractC0405d
    public final boolean r(Object obj) {
        List list = AbstractC1385d.f16603a;
        Class cls = this.f6332Z;
        AbstractC3557B.c0("<this>", cls);
        Integer num = (Integer) AbstractC1385d.f16606d.get(cls);
        if (num != null) {
            return Ad.l.J0(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC1385d.f16605c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // Gf.H
    public final Collection s(C4294f c4294f) {
        ug.n R10 = getDescriptor().n().R();
        Tf.d dVar = Tf.d.f17212Z;
        Collection f6 = R10.f(c4294f, dVar);
        ug.n N10 = getDescriptor().N();
        AbstractC3557B.b0("getStaticScope(...)", N10);
        return kf.t.w2(N10.f(c4294f, dVar), f6);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("class ");
        C4290b z10 = z();
        C4291c g10 = z10.g();
        AbstractC3557B.b0("getPackageFqName(...)", g10);
        if (g10.d()) {
            str = "";
        } else {
            str = g10.b().concat(Separators.DOT);
        }
        String z22 = Lg.n.z2(z10.h().b(), '.', '$');
        sb2.append(str + z22);
        return sb2.toString();
    }

    public final C4290b z() {
        C4290b c4290b = y0.f6500a;
        Class cls = this.f6332Z;
        AbstractC3557B.c0("klass", cls);
        Jf.n nVar = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC3557B.b0("getComponentType(...)", componentType);
            if (componentType.isPrimitive()) {
                nVar = EnumC5626c.b(componentType.getSimpleName()).d();
            }
            if (nVar != null) {
                return new C4290b(Jf.q.f9204k, nVar.f9135Z);
            }
            return C4290b.j(Jf.p.f9174g.g());
        } else if (AbstractC3557B.K(cls, Void.TYPE)) {
            return y0.f6500a;
        } else {
            if (cls.isPrimitive()) {
                nVar = EnumC5626c.b(cls.getSimpleName()).d();
            }
            if (nVar != null) {
                return new C4290b(Jf.q.f9204k, nVar.f9134Y);
            }
            C4290b a5 = AbstractC1385d.a(cls);
            if (!a5.f37495c) {
                String str = Lf.d.f11067a;
                C4291c b10 = a5.b();
                AbstractC3557B.b0("asSingleFqName(...)", b10);
                C4290b c4290b2 = (C4290b) Lf.d.f11074h.get(b10.i());
                if (c4290b2 != null) {
                    return c4290b2;
                }
                return a5;
            }
            return a5;
        }
    }
}
