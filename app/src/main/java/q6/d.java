package Q6;

import A.C0039q0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: Y  reason: collision with root package name */
    public final a f14448Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ff.c f14449Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f14450h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public final c f14451i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f14452j0;

    public d(a aVar, ff.c cVar) {
        this.f14448Y = aVar;
        this.f14449Z = cVar;
        int i10 = 0;
        ThreadLocal threadLocal = a.f14436e;
        c cVar2 = (c) threadLocal.get();
        this.f14451i0 = cVar2;
        threadLocal.set(this);
        this.f14452j0 = cVar2 != null ? cVar2.q0() + 1 : i10;
        Iterator it = aVar.f14438b.iterator();
        while (it.hasNext()) {
            ((C6.b) it.next()).a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14450h0) {
            this.f14449Z.b();
        }
        a aVar = this.f14448Y;
        Iterator it = aVar.f14438b.iterator();
        while (it.hasNext()) {
            C6.b bVar = (C6.b) it.next();
            bVar.getClass();
            bVar.f2700a.f2714v0.j("tracing", new C0039q0(Thread.currentThread().getName(), 6));
        }
        ThreadLocal threadLocal = a.f14436e;
        if (threadLocal.get() == this) {
            c cVar = this.f14451i0;
            threadLocal.set(cVar);
            if (cVar != null) {
                Iterator it2 = aVar.f14438b.iterator();
                while (it2.hasNext()) {
                    ((C6.b) it2.next()).a();
                }
            }
        }
    }

    @Override // Q6.c
    public final int q0() {
        return this.f14452j0;
    }

    @Override // Q6.c
    public final ff.c r0() {
        return this.f14449Z;
    }
}
