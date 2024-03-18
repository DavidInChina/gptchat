package yh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;

/* renamed from: yh.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6649z extends H {

    /* renamed from: Z  reason: collision with root package name */
    public final AccessibleObject f51113Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f51114h0;

    static {
        AbstractC2469q0.p(H.j(Th.y.a(AbstractC6647y.class)));
    }

    public C6649z(AccessibleObject accessibleObject, int i10) {
        this.f51113Z = accessibleObject;
        this.f51114h0 = i10;
    }

    @Override // yh.Y
    public final AnnotatedElement a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6649z.class != obj.getClass()) {
            return false;
        }
        C6649z c6649z = (C6649z) obj;
        if (this.f51114h0 == c6649z.f51114h0 && this.f51113Z.equals(c6649z.f51113Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51113Z.hashCode() + (C6649z.class.hashCode() * 31)) * 31) + this.f51114h0;
    }
}
