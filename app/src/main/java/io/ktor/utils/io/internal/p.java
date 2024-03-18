package io.ktor.utils.io.internal;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33472b = AtomicIntegerFieldUpdater.newUpdater(p.class, "_availableForRead$internal");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33473c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_availableForWrite$internal");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33474d = AtomicIntegerFieldUpdater.newUpdater(p.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a  reason: collision with root package name */
    public final int f33475a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public p(int i10) {
        this.f33475a = i10;
        this._availableForWrite$internal = i10;
    }

    public final void a(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.f33475a) {
                StringBuilder A10 = E9.f.A("Completed read overflow: ", i11, " + ", i10, " = ");
                A10.append(i12);
                A10.append(" > ");
                A10.append(this.f33475a);
                throw new IllegalArgumentException(A10.toString());
            }
        } while (!f33473c.compareAndSet(this, i11, i12));
    }

    public final void b(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.f33475a) {
                StringBuilder A10 = E9.f.A("Complete write overflow: ", i11, " + ", i10, " > ");
                A10.append(this.f33475a);
                throw new IllegalArgumentException(A10.toString());
            }
        } while (!f33474d.compareAndSet(this, i11, i12));
    }

    public final boolean c() {
        int andSet = f33474d.getAndSet(this, 0);
        if (andSet == 0) {
            if (this._availableForRead$internal <= 0) {
                return false;
            }
            return true;
        } else if (f33472b.addAndGet(this, andSet) <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean d() {
        if (this._availableForWrite$internal == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        this._availableForRead$internal = this.f33475a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f33475a;
    }

    public final boolean g() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.f33475a) {
                return false;
            }
        } while (!f33473c.compareAndSet(this, i10, 0));
        return true;
    }

    public final int h(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForRead$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f33472b.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public final int i(int i10) {
        int i11;
        int min;
        do {
            i11 = this._availableForWrite$internal;
            min = Math.min(i10, i11);
            if (min == 0) {
                return 0;
            }
        } while (!f33473c.compareAndSet(this, i11, i11 - min));
        return Math.min(i10, i11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RingBufferCapacity[read: ");
        sb2.append(this._availableForRead$internal);
        sb2.append(", write: ");
        sb2.append(this._availableForWrite$internal);
        sb2.append(", flush: ");
        sb2.append(this._pendingToFlush);
        sb2.append(", capacity: ");
        return AbstractC2469q0.j(sb2, this.f33475a, ']');
    }
}
