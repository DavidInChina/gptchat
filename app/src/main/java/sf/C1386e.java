package Sf;

import bg.AbstractC2193a;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kg.C4294f;

/* renamed from: Sf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386e extends u implements AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public final Annotation f16607a;

    public C1386e(Annotation annotation) {
        AbstractC3557B.c0("annotation", annotation);
        this.f16607a = annotation;
    }

    public final ArrayList a() {
        Annotation annotation = this.f16607a;
        Method[] declaredMethods = R4.b.k1(R4.b.d1(annotation)).getDeclaredMethods();
        AbstractC3557B.b0("getDeclaredMethods(...)", declaredMethods);
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, new Object[0]);
            AbstractC3557B.b0("invoke(...)", invoke);
            arrayList.add(Cf.k.g(invoke, C4294f.e(method.getName())));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1386e) {
            if (this.f16607a == ((C1386e) obj).f16607a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16607a);
    }

    public final String toString() {
        return C1386e.class.getName() + ": " + this.f16607a;
    }
}
