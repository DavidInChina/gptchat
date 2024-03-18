package Z0;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f22797b = kotlin.jvm.internal.m.c(0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f22798c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f22799a;

    public /* synthetic */ i(long j6) {
        this.f22799a = j6;
    }

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j6) {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append((int) (j6 >> 32));
        sb2.append(", ");
        return AbstractC2469q0.j(sb2, (int) (j6 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f22799a != ((i) obj).f22799a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22799a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return b(this.f22799a);
    }
}
