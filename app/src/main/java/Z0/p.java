package Z0;

import android.gov.nist.core.Separators;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final long f22813b = AbstractC4828h.l(0.0f, 0.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f22814c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f22815a;

    public static long a(long j6, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = b(j6);
        }
        if ((i10 & 2) != 0) {
            f10 = c(j6);
        }
        return AbstractC4828h.l(f6, f10);
    }

    public static final float b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static final long d(long j6, long j10) {
        return AbstractC4828h.l(b(j6) - b(j10), c(j6) - c(j10));
    }

    public static final long e(long j6, long j10) {
        return AbstractC4828h.l(b(j10) + b(j6), c(j10) + c(j6));
    }

    public static String f(long j6) {
        return Separators.LPAREN + b(j6) + ", " + c(j6) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (this.f22815a != ((p) obj).f22815a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22815a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return f(this.f22815a);
    }
}
