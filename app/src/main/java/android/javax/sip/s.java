package android.javax.sip;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final s[] f24335Z = new s[2];

    /* renamed from: Y  reason: collision with root package name */
    public final int f24336Y;

    static {
        new s(0);
        new s(1);
    }

    public s(int i10) {
        this.f24336Y = i10;
        f24335Z[i10] = this;
    }

    public final String toString() {
        int i10 = this.f24336Y;
        if (i10 != 0) {
            if (i10 != 1) {
                return "Error while printing Timeout";
            }
            return "Transaction Timeout";
        }
        return "Retransmission Timeout";
    }
}
