package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3667n implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f34434a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34435b = false;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f34436c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public final long f34437d;

    /* renamed from: e  reason: collision with root package name */
    public final H f34438e;

    /* renamed from: f  reason: collision with root package name */
    public final String f34439f;

    /* renamed from: g  reason: collision with root package name */
    public final Queue f34440g;

    public C3667n(long j6, H h10, String str, E1 e12) {
        this.f34437d = j6;
        this.f34439f = str;
        this.f34440g = e12;
        this.f34438e = h10;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.f34434a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z10) {
        this.f34435b = z10;
        this.f34436c.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z10) {
        this.f34434a = z10;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f34436c.await(this.f34437d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f34438e.d(EnumC3642e1.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.f34435b;
    }
}
