package yh;

import Qh.AbstractC1239q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import th.AbstractC5806n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class X extends Enum implements Y, AnnotatedElement {

    /* renamed from: Y  reason: collision with root package name */
    public static final X f50977Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ X[] f50978Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [yh.X, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f50977Y = r12;
        f50978Z = new X[]{r12};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f50978Z.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // yh.Y
    public final AbstractC5806n f() {
        return new AbstractC1239q(1);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getAnnotation(Class cls) {
        throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class cls) {
        throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        return this;
    }

    @Override // yh.Y
    public final Y b() {
        return this;
    }

    @Override // yh.Y
    public final Y d() {
        return this;
    }

    @Override // yh.Y
    public final Y e() {
        return this;
    }

    @Override // yh.Y
    public final Y c(int i10) {
        return this;
    }

    @Override // yh.Y
    public final Y g(int i10) {
        return this;
    }

    @Override // yh.Y
    public final Y h(int i10) {
        return this;
    }

    @Override // yh.Y
    public final Y i(int i10) {
        return this;
    }
}
