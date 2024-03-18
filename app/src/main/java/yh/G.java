package yh;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
public final class G extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final TypeVariable f50940Z;

    public G(TypeVariable typeVariable) {
        this.f50940Z = typeVariable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.TypeVariable, java.lang.reflect.AnnotatedElement] */
    @Override // yh.Y
    public final AnnotatedElement a() {
        ?? r02 = this.f50940Z;
        if (!(r02 instanceof AnnotatedElement)) {
            return X.f50977Y;
        }
        return r02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        if (this.f50940Z.equals(((G) obj).f50940Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50940Z.hashCode() + (G.class.hashCode() * 31);
    }

    @Override // yh.H, yh.Y
    public final Y i(int i10) {
        return new Q(this.f50940Z, i10);
    }
}
