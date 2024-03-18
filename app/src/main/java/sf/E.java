package Sf;

import bg.AbstractC2193a;
import bg.AbstractC2196d;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kg.C4291c;

/* loaded from: classes.dex */
public final class E extends u implements AbstractC2196d {

    /* renamed from: a  reason: collision with root package name */
    public final TypeVariable f16592a;

    public E(TypeVariable typeVariable) {
        AbstractC3557B.c0("typeVariable", typeVariable);
        this.f16592a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            if (AbstractC3557B.K(this.f16592a, ((E) obj).f16592a)) {
                return true;
            }
        }
        return false;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f16592a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            return AbstractC3557B.e1(declaredAnnotations);
        }
        return kf.v.f37483Y;
    }

    public final int hashCode() {
        return this.f16592a.hashCode();
    }

    @Override // bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        AbstractC3557B.c0("fqName", c4291c);
        TypeVariable typeVariable = this.f16592a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC3557B.E0(declaredAnnotations, c4291c);
    }

    public final String toString() {
        return E.class.getName() + ": " + this.f16592a;
    }
}
