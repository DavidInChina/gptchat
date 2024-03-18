package M;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f11260a = a(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11261b = 0;

    public static long a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }
}
