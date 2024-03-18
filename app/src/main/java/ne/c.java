package Ne;

import Oe.g;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends Me.a {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12795i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "nextRef");

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12796j = AtomicIntegerFieldUpdater.newUpdater(c.class, "refCount");

    /* renamed from: k  reason: collision with root package name */
    public static final a f12797k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f12798l;

    /* renamed from: g  reason: collision with root package name */
    public final g f12799g;

    /* renamed from: h  reason: collision with root package name */
    public c f12800h;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Oe.g, Ne.a] */
    static {
        ?? obj = new Object();
        f12797k = obj;
        f12798l = new c(Ke.c.f9786a, null, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ByteBuffer byteBuffer, c cVar, g gVar) {
        super(byteBuffer);
        AbstractC3557B.c0("memory", byteBuffer);
        this.f12799g = gVar;
        if (cVar != this) {
            this.nextRef = null;
            this.refCount = 1;
            this.f12800h = cVar;
            return;
        }
        throw new IllegalArgumentException("A chunk couldn't be a view of itself.".toString());
    }

    public final c g() {
        return (c) f12795i.getAndSet(this, null);
    }

    public final c h() {
        int i10;
        c cVar = this.f12800h;
        if (cVar == null) {
            cVar = this;
        }
        do {
            i10 = cVar.refCount;
            if (i10 > 0) {
            } else {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f12796j.compareAndSet(cVar, i10, i10 + 1));
        c cVar2 = new c(this.f12021a, cVar, this.f12799g);
        cVar2.f12025e = this.f12025e;
        cVar2.f12024d = this.f12024d;
        cVar2.f12022b = this.f12022b;
        cVar2.f12023c = this.f12023c;
        return cVar2;
    }

    public final c i() {
        return (c) this.nextRef;
    }

    public final int j() {
        return this.refCount;
    }

    public final void k(g gVar) {
        int i10;
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AbstractC3557B.c0("pool", gVar);
        do {
            i10 = this.refCount;
            if (i10 > 0) {
                i11 = i10 - 1;
                atomicIntegerFieldUpdater = f12796j;
            } else {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
        if (i11 == 0) {
            c cVar = this.f12800h;
            if (cVar != null) {
                if (atomicIntegerFieldUpdater.compareAndSet(this, 0, -1)) {
                    g();
                    this.f12800h = null;
                    cVar.k(gVar);
                    return;
                }
                throw new IllegalStateException("Unable to unlink: buffer is in use.");
            }
            g gVar2 = this.f12799g;
            if (gVar2 != null) {
                gVar = gVar2;
            }
            gVar.E0(this);
        }
    }

    public final void l() {
        if (this.f12800h == null) {
            d(0);
            int i10 = this.f12026f;
            this.f12025e = i10;
            f(i10 - this.f12024d);
            this.nextRef = null;
            return;
        }
        throw new IllegalArgumentException("Unable to reset buffer with origin".toString());
    }

    public final void m(c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (cVar == null) {
            g();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f12795i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void n() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 >= 0) {
                if (i10 > 0) {
                    throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
                }
            } else {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
        } while (!f12796j.compareAndSet(this, i10, 1));
    }
}
