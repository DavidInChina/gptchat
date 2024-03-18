package Z0;

import android.gov.nist.core.Separators;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f22789b = AbstractC4828h.f(Float.NaN, Float.NaN);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f22790c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f22791a;

    static {
        float f6 = 0;
        AbstractC4828h.f(f6, f6);
    }

    public static final float a(long j6) {
        if (j6 != f22789b) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j6) {
        if (j6 != f22789b) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static String c(long j6) {
        if (j6 != f22789b) {
            return Separators.LPAREN + ((Object) e.b(a(j6))) + ", " + ((Object) e.b(b(j6))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f22791a != ((f) obj).f22791a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22791a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return c(this.f22791a);
    }
}
