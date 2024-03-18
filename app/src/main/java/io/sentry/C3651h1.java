package io.sentry;

import java.util.Date;

/* renamed from: io.sentry.h1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3651h1 extends R0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Date f34351Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f34352Z;

    public C3651h1(Date date, long j6) {
        this.f34351Y = date;
        this.f34352Z = j6;
    }

    @Override // io.sentry.R0
    /* renamed from: a */
    public final int compareTo(R0 r02) {
        if (r02 instanceof C3651h1) {
            C3651h1 c3651h1 = (C3651h1) r02;
            long time = this.f34351Y.getTime();
            long time2 = c3651h1.f34351Y.getTime();
            if (time == time2) {
                return Long.valueOf(this.f34352Z).compareTo(Long.valueOf(c3651h1.f34352Z));
            }
            return Long.valueOf(time).compareTo(Long.valueOf(time2));
        }
        return super.compareTo(r02);
    }

    @Override // io.sentry.R0
    public final long b(R0 r02) {
        if (r02 instanceof C3651h1) {
            return this.f34352Z - ((C3651h1) r02).f34352Z;
        }
        return super.b(r02);
    }

    @Override // io.sentry.R0
    public final long c(R0 r02) {
        if (r02 != null && (r02 instanceof C3651h1)) {
            C3651h1 c3651h1 = (C3651h1) r02;
            int compareTo = compareTo(r02);
            long j6 = this.f34352Z;
            long j10 = c3651h1.f34352Z;
            if (compareTo < 0) {
                return d() + (j10 - j6);
            }
            return c3651h1.d() + (j6 - j10);
        }
        return super.c(r02);
    }

    @Override // io.sentry.R0
    public final long d() {
        return this.f34351Y.getTime() * 1000000;
    }

    public C3651h1() {
        this(r.f.A(), System.nanoTime());
    }
}
