package Ng;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class Y implements Runnable, Comparable, T {

    /* renamed from: Y  reason: collision with root package name */
    public long f12916Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f12917Z = -1;
    private volatile Object _heap;

    public Y(long j6) {
        this.f12916Y = j6;
    }

    public final Sg.D a() {
        Object obj = this._heap;
        if (obj instanceof Sg.D) {
            return (Sg.D) obj;
        }
        return null;
    }

    public final int b(long j6, Z z10, AbstractC1051a0 abstractC1051a0) {
        Y y10;
        synchronized (this) {
            if (this._heap == H.f12874b) {
                return 2;
            }
            synchronized (z10) {
                Y[] yArr = z10.f16637a;
                if (yArr != null) {
                    y10 = yArr[0];
                } else {
                    y10 = null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1051a0.f12920k0;
                abstractC1051a0.getClass();
                if (AbstractC1051a0.f12922m0.get(abstractC1051a0) != 0) {
                    return 1;
                }
                if (y10 == null) {
                    z10.f12918c = j6;
                } else {
                    long j10 = y10.f12916Y;
                    if (j10 - j6 < 0) {
                        j6 = j10;
                    }
                    if (j6 - z10.f12918c > 0) {
                        z10.f12918c = j6;
                    }
                }
                long j11 = this.f12916Y;
                long j12 = z10.f12918c;
                if (j11 - j12 < 0) {
                    this.f12916Y = j12;
                }
                z10.a(this);
                return 0;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10 = ((this.f12916Y - ((Y) obj).f12916Y) > 0L ? 1 : ((this.f12916Y - ((Y) obj).f12916Y) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(Z z10) {
        if (this._heap != H.f12874b) {
            this._heap = z10;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // Ng.T
    public final void dispose() {
        Z z10;
        synchronized (this) {
            try {
                Object obj = this._heap;
                Q1.u uVar = H.f12874b;
                if (obj == uVar) {
                    return;
                }
                if (obj instanceof Z) {
                    z10 = (Z) obj;
                } else {
                    z10 = null;
                }
                if (z10 != null) {
                    z10.c(this);
                }
                this._heap = uVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f12916Y + ']';
    }
}
