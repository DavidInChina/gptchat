package yh;

import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class F extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f50936Z;

    public F(Class cls) {
        this.f50936Z = cls;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        HashMap hashMap = C6641v.f51088m0;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        if (this.f50936Z.equals(((F) obj).f50936Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50936Z.hashCode() + (F.class.hashCode() * 31);
    }
}
