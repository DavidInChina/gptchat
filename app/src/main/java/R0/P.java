package r0;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: b  reason: collision with root package name */
    public static final long f44225b = androidx.compose.ui.graphics.a.h(0.5f, 0.5f);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f44226c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f44227a;

    public static final float a(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float b(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static String c(long j6) {
        return "TransformOrigin(packedValue=" + j6 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        if (this.f44227a != ((P) obj).f44227a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f44227a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return c(this.f44227a);
    }
}
