package Sf;

import android.gov.nist.core.Separators;
import bg.AbstractC2193a;
import bg.AbstractC2196d;
import bg.AbstractC2199g;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C4291c;
import kg.C4294f;
import zc.C6821H;

/* loaded from: classes.dex */
public final class q extends u implements AbstractC2196d, AbstractC2199g {

    /* renamed from: a  reason: collision with root package name */
    public final Class f16621a;

    public q(Class cls) {
        AbstractC3557B.c0("klass", cls);
        this.f16621a = cls;
    }

    public final List a() {
        Field[] declaredFields = this.f16621a.getDeclaredFields();
        AbstractC3557B.b0("getDeclaredFields(...)", declaredFields);
        return Kg.m.p1(Kg.m.n1(Kg.m.i1(kf.q.R2(declaredFields), l.f16616Y), m.f16617Y));
    }

    public final C4291c b() {
        C4291c b10 = AbstractC1385d.a(this.f16621a).b();
        AbstractC3557B.b0("asSingleFqName(...)", b10);
        return b10;
    }

    public final List c() {
        Method[] declaredMethods = this.f16621a.getDeclaredMethods();
        AbstractC3557B.b0("getDeclaredMethods(...)", declaredMethods);
        return Kg.m.p1(Kg.m.n1(Kg.m.h1(kf.q.R2(declaredMethods), new C6821H(26, this)), p.f16620Y));
    }

    public final C4294f d() {
        Class cls = this.f16621a;
        if (cls.isAnonymousClass()) {
            String name = cls.getName();
            int p22 = Lg.n.p2(name, Separators.DOT, 6);
            if (p22 != -1) {
                name = name.substring(1 + p22, name.length());
                AbstractC3557B.b0("substring(...)", name);
            }
            return C4294f.e(name);
        }
        return C4294f.e(cls.getSimpleName());
    }

    public final ArrayList e() {
        Object[] objArr;
        Class cls = this.f16621a;
        AbstractC3557B.c0("clazz", cls);
        Method method = (Method) P4.a.e0().f17429i0;
        if (method == null) {
            objArr = null;
        } else {
            objArr = (Object[]) method.invoke(cls, new Object[0]);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (AbstractC3557B.K(this.f16621a, ((q) obj).f16621a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        Boolean bool;
        Class cls = this.f16621a;
        AbstractC3557B.c0("clazz", cls);
        Method method = (Method) P4.a.e0().f17428h0;
        if (method == null) {
            bool = null;
        } else {
            Object invoke = method.invoke(cls, new Object[0]);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Boolean", invoke);
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean g() {
        Boolean bool;
        Class cls = this.f16621a;
        AbstractC3557B.c0("clazz", cls);
        Method method = (Method) P4.a.e0().f17426Y;
        if (method == null) {
            bool = null;
        } else {
            Object invoke = method.invoke(cls, new Object[0]);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Boolean", invoke);
            bool = (Boolean) invoke;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f16621a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return AbstractC3557B.e1(declaredAnnotations);
        }
        return kf.v.f37483Y;
    }

    @Override // bg.AbstractC2208p
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f16621a.getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new E(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f16621a.hashCode();
    }

    @Override // bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        Annotation[] declaredAnnotations;
        AbstractC3557B.c0("fqName", c4291c);
        Class cls = this.f16621a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return AbstractC3557B.E0(declaredAnnotations, c4291c);
        }
        return null;
    }

    public final String toString() {
        return q.class.getName() + ": " + this.f16621a;
    }
}
