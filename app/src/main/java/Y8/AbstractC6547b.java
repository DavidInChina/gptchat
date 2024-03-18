package y8;

/* renamed from: y8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6547b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f50835a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        boolean z10;
        long j6;
        if (Math.getExponent(d10) > 1023) {
            return false;
        }
        if (d10 != 0.0d) {
            if (Math.getExponent(d10) <= 1023) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int exponent = Math.getExponent(d10);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
                if (exponent == -1023) {
                    j6 = doubleToRawLongBits << 1;
                } else {
                    j6 = doubleToRawLongBits | 4503599627370496L;
                }
                if (52 - Long.numberOfTrailingZeros(j6) > Math.getExponent(d10)) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("not a normal value");
            }
        }
        return true;
    }
}
