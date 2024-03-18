package s2;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public long f45202a;

    /* renamed from: b  reason: collision with root package name */
    public long f45203b;

    /* renamed from: c  reason: collision with root package name */
    public long f45204c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal f45205d = new ThreadLocal();

    public z(long j6) {
        g(j6);
    }

    public final synchronized long a(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j10 = this.f45202a;
                if (j10 == 9223372036854775806L) {
                    Long l10 = (Long) this.f45205d.get();
                    l10.getClass();
                    j10 = l10.longValue();
                }
                this.f45203b = j10 - j6;
                notifyAll();
            }
            this.f45204c = j6;
            return j6 + this.f45203b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j6) {
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f45204c;
            if (j10 != -9223372036854775807L) {
                long j11 = (j10 * 90000) / 1000000;
                long j12 = (4294967296L + j11) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j6;
                long j14 = (j12 * 8589934592L) + j6;
                if (Math.abs(j13 - j11) < Math.abs(j14 - j11)) {
                    j6 = j13;
                } else {
                    j6 = j14;
                }
            }
            return a((j6 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j6) {
        long j10;
        if (j6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f45204c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = j12 / 8589934592L;
            Long.signum(j13);
            long j14 = (j13 * 8589934592L) + j6;
            j10 = ((j13 + 1) * 8589934592L) + j6;
            if (j14 >= j12) {
                j10 = j14;
            }
        } else {
            j10 = j6;
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j6;
        j6 = this.f45202a;
        if (j6 == Long.MAX_VALUE || j6 == 9223372036854775806L) {
            j6 = -9223372036854775807L;
        }
        return j6;
    }

    public final synchronized long e() {
        return this.f45203b;
    }

    public final synchronized boolean f() {
        boolean z10;
        if (this.f45203b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void g(long j6) {
        long j10;
        this.f45202a = j6;
        if (j6 == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f45203b = j10;
        this.f45204c = -9223372036854775807L;
    }
}
