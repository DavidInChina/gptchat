package T6;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger f16922c = new BigInteger("1111111111111111111");

    /* renamed from: d  reason: collision with root package name */
    public static final BigDecimal f16923d = new BigDecimal(M6.d.f11679t0);

    /* renamed from: e  reason: collision with root package name */
    public static final BigInteger f16924e = new BigInteger("2").pow(64);

    /* renamed from: a  reason: collision with root package name */
    public final BigInteger f16925a;

    /* renamed from: b  reason: collision with root package name */
    public final double f16926b;

    public a(double d10) {
        this.f16926b = d10;
        this.f16925a = new BigDecimal(d10).multiply(f16923d).toBigInteger();
    }

    @Override // T6.d
    public final boolean a(M6.a aVar) {
        double d10 = this.f16926b;
        if (d10 == 1.0d) {
            return true;
        }
        if (d10 != 0.0d && aVar.f11651b.f11660d.multiply(f16922c).mod(f16924e).compareTo(this.f16925a) < 0) {
            return true;
        }
        return false;
    }
}
