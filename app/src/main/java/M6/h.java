package M6;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h extends LinkedList {

    /* renamed from: p0  reason: collision with root package name */
    public static final AtomicReference f11697p0 = new AtomicReference();

    /* renamed from: Y  reason: collision with root package name */
    public final d f11698Y;

    /* renamed from: Z  reason: collision with root package name */
    public final BigInteger f11699Z;

    /* renamed from: j0  reason: collision with root package name */
    public final ReferenceQueue f11702j0 = new ReferenceQueue();

    /* renamed from: k0  reason: collision with root package name */
    public final Set f11703k0 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: l0  reason: collision with root package name */
    public final AtomicInteger f11704l0 = new AtomicInteger(0);

    /* renamed from: m0  reason: collision with root package name */
    public final AtomicInteger f11705m0 = new AtomicInteger(0);

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicReference f11706n0 = new AtomicReference();

    /* renamed from: o0  reason: collision with root package name */
    public final AtomicBoolean f11707o0 = new AtomicBoolean(false);

    /* renamed from: h0  reason: collision with root package name */
    public final long f11700h0 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());

    /* renamed from: i0  reason: collision with root package name */
    public final long f11701i0 = System.nanoTime();

    public h(d dVar, BigInteger bigInteger) {
        this.f11698Y = dVar;
        this.f11699Z = bigInteger;
        f fVar = (f) f11697p0.get();
        if (fVar != null) {
            fVar.f11695Y.add(this);
        }
    }

    public final synchronized void I() {
        if (this.f11707o0.compareAndSet(false, true)) {
            f fVar = (f) f11697p0.get();
            if (fVar != null) {
                fVar.f11695Y.remove(this);
            }
            if (!isEmpty()) {
                this.f11698Y.h(this);
            }
        }
    }

    /* renamed from: f */
    public final void addFirst(a aVar) {
        synchronized (this) {
            super.addFirst(aVar);
        }
        this.f11705m0.incrementAndGet();
    }

    public final void r() {
        if (this.f11704l0.decrementAndGet() == 0) {
            I();
        } else if (this.f11698Y.f11688m0 > 0 && this.f11705m0.get() > this.f11698Y.f11688m0) {
            synchronized (this) {
                try {
                    if (this.f11705m0.get() > this.f11698Y.f11688m0) {
                        a y10 = y();
                        ArrayList arrayList = new ArrayList(this.f11705m0.get());
                        Iterator<E> it = iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            if (aVar != y10) {
                                arrayList.add(aVar);
                                this.f11705m0.decrementAndGet();
                                it.remove();
                            }
                        }
                        this.f11698Y.h(arrayList);
                    }
                } finally {
                }
            }
        }
    }

    public final void s(a aVar, boolean z10) {
        b bVar;
        BigInteger bigInteger = this.f11699Z;
        if (bigInteger == null || (bVar = aVar.f11651b) == null || !bigInteger.equals(bVar.f11660d)) {
            return;
        }
        synchronized (aVar) {
            try {
                if (aVar.f11655f == null) {
                    return;
                }
                this.f11703k0.remove(aVar.f11655f);
                aVar.f11655f.clear();
                aVar.f11655f = null;
                if (z10) {
                    r();
                } else {
                    this.f11704l0.decrementAndGet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        return this.f11705m0.get();
    }

    public final a y() {
        WeakReference weakReference = (WeakReference) this.f11706n0.get();
        if (weakReference == null) {
            return null;
        }
        return (a) weakReference.get();
    }
}
