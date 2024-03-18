package Z1;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: Z1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1781x {

    /* renamed from: a  reason: collision with root package name */
    public final int f23122a;

    public C1781x(int i10) {
        this.f23122a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1781x) && this.f23122a == ((C1781x) obj).f23122a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23122a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("ContainerInfo(layoutId="), this.f23122a, ')');
    }
}
