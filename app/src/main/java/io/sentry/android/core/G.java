package io.sentry.android.core;

import io.sentry.EnumC3642e1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class G implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {

    /* renamed from: d  reason: collision with root package name */
    public final long f33975d;

    /* renamed from: e  reason: collision with root package name */
    public final io.sentry.H f33976e;

    /* renamed from: c  reason: collision with root package name */
    public CountDownLatch f33974c = new CountDownLatch(1);

    /* renamed from: a  reason: collision with root package name */
    public boolean f33972a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33973b = false;

    public G(long j6, io.sentry.H h10) {
        this.f33975d = j6;
        Ad.l.Z0("ILogger is required.", h10);
        this.f33976e = h10;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.f33972a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z10) {
        this.f33973b = z10;
        this.f33974c.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z10) {
        this.f33972a = z10;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f33974c.await(this.f33975d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f33976e.d(EnumC3642e1.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.f33973b;
    }
}
