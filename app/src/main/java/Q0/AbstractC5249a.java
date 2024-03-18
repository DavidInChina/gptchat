package q0;

import Ng.H;

/* renamed from: q0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5249a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f43613a = H.b(0.0f, 0.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f43614b = 0;

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final float b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static String d(long j6) {
        if (b(j6) == c(j6)) {
            return "CornerRadius.circular(" + M3.H.A0(b(j6)) + ')';
        }
        return "CornerRadius.elliptical(" + M3.H.A0(b(j6)) + ", " + M3.H.A0(c(j6)) + ')';
    }
}
