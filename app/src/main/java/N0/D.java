package N0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: b  reason: collision with root package name */
    public static final long f12483b = U3.f.e(0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12484c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f12485a;

    public /* synthetic */ D(long j6) {
        this.f12485a = j6;
    }

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final boolean b(long j6) {
        if (((int) (j6 >> 32)) == ((int) (j6 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int c(long j6) {
        return d(j6) - e(j6);
    }

    public static final int d(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (i10 <= i11) {
            return i11;
        }
        return i10;
    }

    public static final int e(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (i10 > i11) {
            return i11;
        }
        return i10;
    }

    public static final boolean f(long j6) {
        if (((int) (j6 >> 32)) > ((int) (j6 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String g(long j6) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j6 >> 32));
        sb2.append(", ");
        return AbstractC2469q0.j(sb2, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        if (this.f12485a != ((D) obj).f12485a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f12485a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return g(this.f12485a);
    }
}
