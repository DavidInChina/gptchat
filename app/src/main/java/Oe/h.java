package Oe;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class h implements g {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13748Y = AtomicIntegerFieldUpdater.newUpdater(h.class, "borrowed");

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13749Z = AtomicIntegerFieldUpdater.newUpdater(h.class, "disposed");
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ Object instance = null;

    @Override // Oe.g
    public final Object C() {
        int i10;
        do {
            i10 = this.borrowed;
            if (i10 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f13748Y.compareAndSet(this, i10, 1));
        Object i11 = i();
        this.instance = i11;
        return i11;
    }

    @Override // Oe.g
    public final void E0(Object obj) {
        AbstractC3557B.c0("instance", obj);
        if (this.instance != obj) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (f13749Z.compareAndSet(this, 0, 1)) {
            h(obj);
            return;
        }
        throw new IllegalStateException("An instance is already disposed");
    }

    public final void a() {
        Object obj;
        if (!f13749Z.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        h(obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    public abstract void h(Object obj);

    public abstract Object i();
}
