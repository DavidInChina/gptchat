package io.sentry.android.core;

import android.os.SystemClock;

/* renamed from: io.sentry.android.core.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3624o implements io.sentry.android.core.internal.util.j {

    /* renamed from: a  reason: collision with root package name */
    public float f34199a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3626q f34200b;

    public C3624o(C3626q c3626q) {
        this.f34200b = c3626q;
    }

    @Override // io.sentry.android.core.internal.util.j
    public final void b(long j6, long j10, long j11, long j12, boolean z10, boolean z11, float f6) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j10 - System.nanoTime());
        C3626q c3626q = this.f34200b;
        long j13 = elapsedRealtimeNanos - c3626q.f34220a;
        if (j13 < 0) {
            return;
        }
        if (z11) {
            c3626q.f34230k.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j13), Long.valueOf(j11)));
        } else if (z10) {
            c3626q.f34229j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j13), Long.valueOf(j11)));
        }
        if (f6 != this.f34199a) {
            this.f34199a = f6;
            c3626q.f34228i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j13), Float.valueOf(f6)));
        }
    }
}
