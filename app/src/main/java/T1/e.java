package T1;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f16848a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16849b;

    public e(long j6, long j10) {
        if (j10 == 0) {
            this.f16848a = 0L;
            this.f16849b = 1L;
            return;
        }
        this.f16848a = j6;
        this.f16849b = j10;
    }

    public final String toString() {
        return this.f16848a + Separators.SLASH + this.f16849b;
    }
}
