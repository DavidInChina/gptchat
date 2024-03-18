package E0;

/* loaded from: classes2.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f4069a = androidx.compose.ui.layout.a.a(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4070b = 0;

    public static final float a(long j6) {
        if (j6 != f4069a) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float b(long j6) {
        if (j6 != f4069a) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static String c(long j6) {
        StringBuilder sb2 = new StringBuilder("ScaleFactor(");
        float f6 = 10;
        float a5 = a(j6) * f6;
        int i10 = (int) a5;
        if (a5 - i10 >= 0.5f) {
            i10++;
        }
        sb2.append(i10 / f6);
        sb2.append(", ");
        float b10 = b(j6) * f6;
        int i11 = (int) b10;
        if (b10 - i11 >= 0.5f) {
            i11++;
        }
        sb2.append(i11 / f6);
        sb2.append(')');
        return sb2.toString();
    }
}
