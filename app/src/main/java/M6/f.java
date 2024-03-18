package M6;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Runnable, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Set f11695Y = Collections.newSetFromMap(new ConcurrentHashMap());

    public f() {
        L6.c cVar = L6.c.f10748Z;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.getClass();
        if (!cVar.f10749Y.isShutdown()) {
            try {
                new WeakReference(this);
                cVar.f10749Y.scheduleAtFixedRate(new L6.a(this), 0L, 1L, timeUnit);
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (h hVar : this.f11695Y) {
            synchronized (hVar) {
                while (true) {
                    try {
                        Reference poll = hVar.f11702j0.poll();
                        if (poll != null) {
                            hVar.f11703k0.remove(poll);
                            if (hVar.f11707o0.compareAndSet(false, true)) {
                                f fVar = (f) h.f11697p0.get();
                                if (fVar != null) {
                                    fVar.f11695Y.remove(hVar);
                                }
                                hVar.f11698Y.f11682Z.getClass();
                            }
                            hVar.r();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
