package io.sentry;

/* loaded from: classes2.dex */
public abstract class R0 implements Comparable {
    /* renamed from: a */
    public int compareTo(R0 r02) {
        return Long.valueOf(d()).compareTo(Long.valueOf(r02.d()));
    }

    public long b(R0 r02) {
        return d() - r02.d();
    }

    public long c(R0 r02) {
        if (r02 != null && compareTo(r02) < 0) {
            return r02.d();
        }
        return d();
    }

    public abstract long d();
}
