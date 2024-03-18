package Z1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22997a;

    public k0(int i10) {
        this.f22997a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k0) && this.f22997a == ((k0) obj).f22997a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22997a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("LayoutInfo(layoutId="), this.f22997a, ')');
    }
}
