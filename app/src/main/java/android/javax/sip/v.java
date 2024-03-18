package android.javax.sip;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class v implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final v[] f24339Z = new v[6];

    /* renamed from: h0  reason: collision with root package name */
    public static final v f24340h0 = new v(0);

    /* renamed from: i0  reason: collision with root package name */
    public static final v f24341i0 = new v(1);

    /* renamed from: j0  reason: collision with root package name */
    public static final v f24342j0 = new v(2);

    /* renamed from: k0  reason: collision with root package name */
    public static final v f24343k0 = new v(3);

    /* renamed from: l0  reason: collision with root package name */
    public static final v f24344l0 = new v(4);

    /* renamed from: m0  reason: collision with root package name */
    public static final v f24345m0 = new v(5);

    /* renamed from: Y  reason: collision with root package name */
    public final int f24346Y;

    public v(int i10) {
        this.f24346Y = i10;
        f24339Z[i10] = this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && ((v) obj).f24346Y == this.f24346Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24346Y;
    }

    public final String toString() {
        int i10 = this.f24346Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return "Error while printing Transaction State";
                            }
                            return "Terminated Transaction";
                        }
                        return "Confirmed Transaction";
                    }
                    return "Completed Transaction";
                }
                return "Proceeding Transaction";
            }
            return "Trying Transaction";
        }
        return "Calling Transaction";
    }
}
