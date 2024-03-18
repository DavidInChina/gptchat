package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3692x {

    /* renamed from: g  reason: collision with root package name */
    public static final long f34820g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h  reason: collision with root package name */
    public static final long f34821h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i  reason: collision with root package name */
    public static C3692x f34822i;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f34824b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f34825c;

    /* renamed from: e  reason: collision with root package name */
    public final Callable f34827e;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f34826d = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f34828f = Executors.newSingleThreadExecutor(new ThreadFactoryC3690w());

    /* renamed from: a  reason: collision with root package name */
    public final long f34823a = f34820g;

    public C3692x() {
        CallableC3688v callableC3688v = new CallableC3688v(0);
        this.f34827e = callableC3688v;
        a();
    }

    public final void a() {
        try {
            this.f34828f.submit(new V3.g(1, this)).get(f34821h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f34825c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f34825c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
