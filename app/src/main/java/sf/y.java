package Sf;

import Mf.n0;
import Mf.q0;
import Mf.t0;
import bg.AbstractC2193a;
import bg.AbstractC2196d;
import bg.AbstractC2205m;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kg.AbstractC4296h;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class y extends u implements AbstractC2196d, AbstractC2205m {
    public abstract Member a();

    public final C4294f b() {
        C4294f c4294f;
        String name = a().getName();
        if (name != null) {
            c4294f = C4294f.e(name);
        } else {
            c4294f = null;
        }
        if (c4294f == null) {
            return AbstractC4296h.f37511a;
        }
        return c4294f;
    }

    public final ArrayList c(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        ArrayList arrayList;
        int i10;
        String str;
        boolean z11;
        Method method;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C1382a c1382a = C1382a.f16599a;
        Member a5 = a();
        AbstractC3557B.c0("member", a5);
        U3.c cVar = C1382a.f16600b;
        if (cVar == null) {
            synchronized (c1382a) {
                cVar = C1382a.f16600b;
                if (cVar == null) {
                    cVar = C1382a.a(a5);
                    C1382a.f16600b = cVar;
                }
            }
        }
        Method method2 = (Method) cVar.f17396Z;
        if (method2 == null || (method = (Method) cVar.f17397h0) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(a5, new Object[0]);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<*>", invoke);
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, new Object[0]);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", invoke2);
                arrayList.add((String) invoke2);
            }
        }
        if (arrayList != null) {
            i10 = arrayList.size() - typeArr.length;
        } else {
            i10 = 0;
        }
        int length = typeArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            D g10 = Cf.h.g(typeArr[i11]);
            if (arrayList != null) {
                str = (String) kf.t.i2(i11 + i10, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i11 + '+' + i10 + " (name=" + b() + " type=" + g10 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z10 && i11 == kf.q.l3(typeArr)) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList2.add(new F(g10, annotationArr[i11], str, z11));
        }
        return arrayList2;
    }

    public final t0 d() {
        int modifiers = a().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return q0.f12100c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return n0.f12095c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return Qf.c.f14711c;
            }
            return Qf.b.f14710c;
        }
        return Qf.a.f14709c;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y) && AbstractC3557B.K(a(), ((y) obj).a())) {
            return true;
        }
        return false;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        Member a5 = a();
        AbstractC3557B.a0("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", a5);
        Annotation[] declaredAnnotations = ((AnnotatedElement) a5).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC3557B.e1(declaredAnnotations);
        }
        return kf.v.f37483Y;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        Member a5 = a();
        AbstractC3557B.a0("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", a5);
        Annotation[] declaredAnnotations = ((AnnotatedElement) a5).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC3557B.E0(declaredAnnotations, c4291c);
        }
        return null;
    }

    public final String toString() {
        return getClass().getName() + ": " + a();
    }
}
