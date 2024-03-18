package S0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class D implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public static final D f15968Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final D f15969h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final D f15970i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final D f15971j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final D f15972k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final D f15973l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final D f15974m0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f15975Y;

    static {
        D d10 = new D(100);
        D d11 = new D(RCHTTPStatusCodes.SUCCESS);
        D d12 = new D(RCHTTPStatusCodes.UNSUCCESSFUL);
        D d13 = new D(RCHTTPStatusCodes.BAD_REQUEST);
        f15968Z = d13;
        D d14 = new D(500);
        f15969h0 = d14;
        D d15 = new D(600);
        f15970i0 = d15;
        D d16 = new D(700);
        D d17 = new D(800);
        D d18 = new D(900);
        f15971j0 = d13;
        f15972k0 = d14;
        f15973l0 = d15;
        f15974m0 = d16;
        AbstractC4344b.G0(d10, d11, d12, d13, d14, d15, d16, d17, d18);
    }

    public D(int i10) {
        this.f15975Y = i10;
        if (1 <= i10 && i10 < 1001) {
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
    }

    /* renamed from: a */
    public final int compareTo(D d10) {
        return AbstractC3557B.e0(this.f15975Y, d10.f15975Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        if (this.f15975Y == ((D) obj).f15975Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15975Y;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("FontWeight(weight="), this.f15975Y, ')');
    }
}
