package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

/* renamed from: yh.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6590B extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final Field f50915Z;

    static {
        AbstractC2469q0.p(H.j(Th.y.a(AbstractC6589A.class)));
    }

    public C6590B(Field field) {
        this.f50915Z = field;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6590B.class != obj.getClass()) {
            return false;
        }
        if (this.f50915Z.equals(((C6590B) obj).f50915Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50915Z.hashCode() + (C6590B.class.hashCode() * 31);
    }
}
