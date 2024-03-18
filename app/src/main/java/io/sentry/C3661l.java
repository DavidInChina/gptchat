package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import u5.RunnableC5841a;

/* renamed from: io.sentry.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3661l implements K1 {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34414f;

    /* renamed from: g  reason: collision with root package name */
    public final r1 f34415g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f34409a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile Timer f34410b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f34411c = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f34416h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public long f34417i = 0;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f34412d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f34413e = new ArrayList();

    public C3661l(r1 r1Var) {
        boolean z10 = false;
        Ad.l.Z0("The options object is required.", r1Var);
        this.f34415g = r1Var;
        for (K k10 : r1Var.getPerformanceCollectors()) {
            if (k10 instanceof M) {
                this.f34412d.add((M) k10);
            }
            if (k10 instanceof L) {
                this.f34413e.add((L) k10);
            }
        }
        if (this.f34412d.isEmpty() && this.f34413e.isEmpty()) {
            z10 = true;
        }
        this.f34414f = z10;
    }

    @Override // io.sentry.K1
    public final void a(S s10) {
        Iterator it = this.f34413e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.V) ((L) it.next())).f(s10);
        }
    }

    @Override // io.sentry.K1
    public final void close() {
        this.f34415g.getLogger().f(EnumC3642e1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f34411c.clear();
        Iterator it = this.f34413e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.V) ((L) it.next())).e();
        }
        if (this.f34416h.getAndSet(false)) {
            synchronized (this.f34409a) {
                try {
                    if (this.f34410b != null) {
                        this.f34410b.cancel();
                        this.f34410b = null;
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.sentry.K1
    public final void d(z1 z1Var) {
        Iterator it = this.f34413e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.V) ((L) it.next())).g(z1Var);
        }
    }

    @Override // io.sentry.K1
    public final List g(T t10) {
        this.f34415g.getLogger().f(EnumC3642e1.DEBUG, "stop collecting performance info for transactions %s (%s)", t10.getName(), t10.s().f33714Y.toString());
        ConcurrentHashMap concurrentHashMap = this.f34411c;
        List list = (List) concurrentHashMap.remove(t10.n().toString());
        Iterator it = this.f34413e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.V) ((L) it.next())).f(t10);
        }
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }

    @Override // io.sentry.K1
    public final void i(T t10) {
        if (this.f34414f) {
            this.f34415g.getLogger().f(EnumC3642e1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f34413e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.V) ((L) it.next())).g(t10);
        }
        if (!this.f34411c.containsKey(t10.n().toString())) {
            this.f34411c.put(t10.n().toString(), new ArrayList());
            try {
                this.f34415g.getExecutorService().l(new RunnableC5841a(this, 12, t10), 30000L);
            } catch (RejectedExecutionException e10) {
                this.f34415g.getLogger().d(EnumC3642e1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e10);
            }
        }
        if (!this.f34416h.getAndSet(true)) {
            synchronized (this.f34409a) {
                try {
                    if (this.f34410b == null) {
                        this.f34410b = new Timer(true);
                    }
                    this.f34410b.schedule(new C3658k(0, this), 0L);
                    this.f34410b.scheduleAtFixedRate(new C3658k(1, this), 100L, 100L);
                } finally {
                }
            }
        }
    }
}
