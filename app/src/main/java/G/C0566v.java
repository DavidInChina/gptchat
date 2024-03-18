package G;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: G.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0566v {

    /* renamed from: a  reason: collision with root package name */
    public final int f5570a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5571b;

    public C0566v(int i10, int i11) {
        this.f5570a = i10;
        this.f5571b = i11;
        if (i10 >= 0) {
            if (i11 >= i10) {
                return;
            }
            throw new IllegalArgumentException("end index greater than start".toString());
        }
        throw new IllegalArgumentException("negative start index".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0566v)) {
            return false;
        }
        C0566v c0566v = (C0566v) obj;
        if (this.f5570a == c0566v.f5570a && this.f5571b == c0566v.f5571b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5570a * 31) + this.f5571b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f5570a);
        sb2.append(", end=");
        return AbstractC2469q0.j(sb2, this.f5571b, ')');
    }
}
