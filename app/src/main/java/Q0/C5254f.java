package q0;

import M3.H;
import nf.AbstractC4828h;

/* renamed from: q0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5254f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f43637b = AbstractC4828h.i(0.0f, 0.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final long f43638c = AbstractC4828h.i(Float.NaN, Float.NaN);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f43639d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f43640a;

    public /* synthetic */ C5254f(long j6) {
        this.f43640a = j6;
    }

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final float b(long j6) {
        if (j6 != f43638c) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j6) {
        return Math.min(Math.abs(d(j6)), Math.abs(b(j6)));
    }

    public static final float d(long j6) {
        if (j6 != f43638c) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int e(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static final boolean f(long j6) {
        if (d(j6) > 0.0f && b(j6) > 0.0f) {
            return false;
        }
        return true;
    }

    public static String g(long j6) {
        if (j6 != f43638c) {
            return "Size(" + H.A0(d(j6)) + ", " + H.A0(b(j6)) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5254f)) {
            return false;
        }
        if (this.f43640a != ((C5254f) obj).f43640a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return e(this.f43640a);
    }

    public final String toString() {
        return g(this.f43640a);
    }
}
