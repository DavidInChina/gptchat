package B0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* renamed from: B0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0184a implements q {

    /* renamed from: b  reason: collision with root package name */
    public final int f1624b;

    public C0184a(int i10) {
        this.f1624b = i10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C0184a.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType", obj);
        if (this.f1624b == ((C0184a) obj).f1624b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1624b;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("AndroidPointerIcon(type="), this.f1624b, ')');
    }
}
