package Q3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f14403a;

    public b(int i10) {
        this.f14403a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f14403a == ((b) obj).f14403a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14403a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("ConstraintsNotMet(reason="), this.f14403a, ')');
    }
}
