package ci;

import id.AbstractC3557B;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class g extends AbstractC2433b {

    /* renamed from: i0  reason: collision with root package name */
    public boolean f26680i0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26665Z) {
            return;
        }
        if (!this.f26680i0) {
            a();
        }
        this.f26665Z = true;
    }

    @Override // ci.AbstractC2433b, ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (j6 >= 0) {
            if (!this.f26665Z) {
                if (this.f26680i0) {
                    return -1L;
                }
                long g02 = super.g0(c4135j, j6);
                if (g02 == -1) {
                    this.f26680i0 = true;
                    a();
                    return -1L;
                }
                return g02;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }
}
