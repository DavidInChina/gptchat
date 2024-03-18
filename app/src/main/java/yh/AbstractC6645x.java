package yh;

import java.lang.reflect.AnnotatedElement;

/* renamed from: yh.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6645x extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Y f51103Z;

    public AbstractC6645x(Y y10) {
        this.f51103Z = y10;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        this.f51103Z.a();
        k();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f51103Z.equals(((AbstractC6645x) obj).f51103Z)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f51103Z.hashCode() + (getClass().hashCode() * 31);
    }

    public abstract AnnotatedElement k();
}
