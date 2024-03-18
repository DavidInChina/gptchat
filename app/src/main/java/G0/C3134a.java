package g0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: g0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3134a {

    /* renamed from: a  reason: collision with root package name */
    public int f31014a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3134a) && this.f31014a == ((C3134a) obj).f31014a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31014a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("DeltaCounter(count="), this.f31014a, ')');
    }
}
