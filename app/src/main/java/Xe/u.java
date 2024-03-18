package Xe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f21935a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21936b;

    public u(int i10, int i11) {
        this.f21935a = i10;
        this.f21936b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f21935a == uVar.f21935a && this.f21936b == uVar.f21936b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21935a * 31) + this.f21936b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dimensions(width=");
        sb2.append(this.f21935a);
        sb2.append(", height=");
        return AbstractC2469q0.j(sb2, this.f21936b, ')');
    }
}
