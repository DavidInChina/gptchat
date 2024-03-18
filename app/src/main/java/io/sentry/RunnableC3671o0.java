package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.sentry.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3671o0 implements I, Runnable, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final H f34448Y;

    /* renamed from: Z  reason: collision with root package name */
    public final P0 f34449Z;

    /* renamed from: h0  reason: collision with root package name */
    public final S0 f34450h0;

    /* renamed from: i0  reason: collision with root package name */
    public volatile P f34451i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile boolean f34452j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public final ConcurrentSkipListMap f34453k0 = new ConcurrentSkipListMap();

    /* renamed from: l0  reason: collision with root package name */
    public final AtomicInteger f34454l0 = new AtomicInteger();

    /* renamed from: m0  reason: collision with root package name */
    public final int f34455m0 = 100000;

    static {
        Charset.forName("UTF-8");
    }

    public RunnableC3671o0(r1 r1Var, P0 p02) {
        H logger = r1Var.getLogger();
        S0 dateProvider = r1Var.getDateProvider();
        C3680q0 c3680q0 = C3680q0.f34685b;
        this.f34449Z = p02;
        this.f34448Y = logger;
        this.f34450h0 = dateProvider;
        this.f34451i0 = c3680q0;
    }

    public final void a(boolean z10) {
        Set<Long> set;
        if (!z10) {
            if (this.f34454l0.get() + this.f34453k0.size() >= this.f34455m0) {
                this.f34448Y.f(EnumC3642e1.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
                z10 = true;
            }
        }
        ConcurrentSkipListMap concurrentSkipListMap = this.f34453k0;
        if (z10) {
            set = concurrentSkipListMap.keySet();
        } else {
            long millis = (TimeUnit.NANOSECONDS.toMillis(this.f34450h0.e().d()) - 10000) - io.sentry.metrics.b.f34431a;
            long j6 = ((millis / 1000) / 10) * 10;
            if (millis < 0) {
                j6--;
            }
            set = concurrentSkipListMap.headMap((Object) Long.valueOf(j6), true).keySet();
        }
        if (set.isEmpty()) {
            this.f34448Y.f(EnumC3642e1.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.f34448Y.f(EnumC3642e1.DEBUG, "Metrics: flushing " + set.size() + " buckets", new Object[0]);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (Long l10 : set) {
            l10.getClass();
            Map map = (Map) this.f34453k0.remove(l10);
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = map.values().iterator();
                        if (!it.hasNext()) {
                            this.f34454l0.addAndGet(0);
                            i10 += map.size();
                            hashMap.put(l10, map);
                        } else {
                            AbstractC2469q0.p(it.next());
                            throw null;
                        }
                    } finally {
                    }
                }
            }
        }
        if (i10 == 0) {
            this.f34448Y.f(EnumC3642e1.DEBUG, "Metrics: only empty buckets found", new Object[0]);
            return;
        }
        this.f34448Y.f(EnumC3642e1.DEBUG, "Metrics: capturing metrics", new Object[0]);
        P0 p02 = this.f34449Z;
        io.sentry.metrics.a aVar = new io.sentry.metrics.a(hashMap);
        p02.getClass();
        Charset charset = X0.f33883d;
        C3636c1 c3636c1 = new C3636c1((Callable) new V3.g(2, aVar));
        p02.c(new T0(new U0(new io.sentry.protocol.s((UUID) null), p02.f33851a.getSdkVersion(), null), Collections.singleton(new X0(new Y0(EnumC3639d1.Statsd, new V0(c3636c1, 2), "application/octet-stream", (String) null, (String) null), new V0(c3636c1, 3)))), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f34452j0 = true;
            this.f34451i0.c(0L);
        }
        a(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(false);
        synchronized (this) {
            try {
                if (!this.f34452j0) {
                    this.f34451i0.l(this, 5000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
