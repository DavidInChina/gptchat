package android.javax.sip;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final d[] f24326Z = new d[4];

    /* renamed from: h0  reason: collision with root package name */
    public static final d f24327h0 = new d(0);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f24328i0 = new d(1);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f24329j0 = new d(3);

    /* renamed from: Y  reason: collision with root package name */
    public final int f24330Y;

    static {
        new d(2);
    }

    public d(int i10) {
        this.f24330Y = i10;
        f24326Z[i10] = this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d) && ((d) obj).f24330Y == this.f24330Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24330Y;
    }

    public final String toString() {
        int i10 = this.f24330Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return "Error while printing Dialog State";
                    }
                    return "Terminated Dialog";
                }
                return "Completed Dialog";
            }
            return "Confirmed Dialog";
        }
        return "Early Dialog";
    }
}
