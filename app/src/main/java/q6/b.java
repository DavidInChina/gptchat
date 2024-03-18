package Q6;

import A.C0039q0;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements c, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final a f14441Y;

    /* renamed from: Z  reason: collision with root package name */
    public final M6.a f14442Z;

    /* renamed from: j0  reason: collision with root package name */
    public final AtomicInteger f14445j0;

    /* renamed from: k0  reason: collision with root package name */
    public final c f14446k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f14447l0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f14444i0 = false;

    /* renamed from: h0  reason: collision with root package name */
    public final O6.a f14443h0 = O6.a.f13399a;

    public b(a aVar, M6.a aVar2, O6.b bVar) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int i10 = 0;
        new AtomicBoolean(false);
        this.f14441Y = aVar;
        this.f14445j0 = atomicInteger;
        this.f14442Z = aVar2;
        bVar.getClass();
        ThreadLocal threadLocal = a.f14436e;
        c cVar = (c) threadLocal.get();
        this.f14446k0 = cVar;
        threadLocal.set(this);
        this.f14447l0 = cVar != null ? cVar.q0() + 1 : i10;
        Iterator it = aVar.f14438b.iterator();
        while (it.hasNext()) {
            ((C6.b) it.next()).a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14443h0.getClass();
        if (this.f14445j0.decrementAndGet() == 0 && this.f14444i0) {
            this.f14442Z.b();
        }
        Iterator it = this.f14441Y.f14438b.iterator();
        while (it.hasNext()) {
            C6.b bVar = (C6.b) it.next();
            bVar.getClass();
            bVar.f2700a.f2714v0.j("tracing", new C0039q0(Thread.currentThread().getName(), 6));
        }
        ThreadLocal threadLocal = a.f14436e;
        if (threadLocal.get() == this) {
            threadLocal.set(this.f14446k0);
            if (this.f14446k0 != null) {
                Iterator it2 = this.f14441Y.f14438b.iterator();
                while (it2.hasNext()) {
                    ((C6.b) it2.next()).a();
                }
            }
        }
    }

    @Override // Q6.c
    public final int q0() {
        return this.f14447l0;
    }

    @Override // Q6.c
    public final ff.c r0() {
        return this.f14442Z;
    }

    public final String toString() {
        return super.toString() + "->" + this.f14442Z;
    }
}
