package yh;

import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class C extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Class f50919Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f50920h0;

    public C(Class cls, int i10) {
        this.f50919Z = cls;
        this.f50920h0 = i10;
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
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f50920h0 == c10.f50920h0 && this.f50919Z.equals(c10.f50919Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50919Z.hashCode() + (C.class.hashCode() * 31)) * 31) + this.f50920h0;
    }
}
