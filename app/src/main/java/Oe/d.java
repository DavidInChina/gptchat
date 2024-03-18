package Oe;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public abstract class d implements g {

    /* renamed from: j0  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f13742j0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f13743Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13744Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicReferenceArray f13745h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f13746i0;
    private volatile long top;

    static {
        AtomicLongFieldUpdater newUpdater = AtomicLongFieldUpdater.newUpdater(d.class, c.f13741Z.getName());
        AbstractC3557B.b0("newUpdater(Owner::class.java, p.name)", newUpdater);
        f13742j0 = newUpdater;
    }

    public d(int i10) {
        if (i10 > 0) {
            if (i10 <= 536870911) {
                int highestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
                this.f13743Y = highestOneBit;
                this.f13744Z = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                int i11 = highestOneBit + 1;
                this.f13745h0 = new AtomicReferenceArray(i11);
                this.f13746i0 = new int[i11];
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("capacity should be less or equal to 536870911 but it is ", i10).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("capacity should be positive but it is ", i10).toString());
    }

    @Override // Oe.g
    public final Object C() {
        Object m10 = m();
        if (m10 != null) {
            return h(m10);
        }
        return k();
    }

    @Override // Oe.g
    public final void E0(Object obj) {
        long j6;
        long j10;
        AbstractC3557B.c0("instance", obj);
        p(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f13744Z) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            AtomicReferenceArray atomicReferenceArray = this.f13745h0;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.f13743Y;
                    }
                }
            }
            if (identityHashCode > 0) {
                do {
                    j6 = this.top;
                    j10 = ((((j6 >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                    this.f13746i0[identityHashCode] = (int) (4294967295L & j6);
                } while (!f13742j0.compareAndSet(this, j6, j10));
                return;
            }
            throw new IllegalArgumentException("index should be positive".toString());
        }
        j(obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i();
    }

    public final void i() {
        while (true) {
            Object m10 = m();
            if (m10 == null) {
                return;
            }
            j(m10);
        }
    }

    public void j(Object obj) {
        AbstractC3557B.c0("instance", obj);
    }

    public abstract Object k();

    public final Object m() {
        int i10;
        while (true) {
            long j6 = this.top;
            i10 = 0;
            if (j6 != 0) {
                long j10 = ((j6 >> 32) & 4294967295L) + 1;
                int i11 = (int) (4294967295L & j6);
                if (i11 != 0) {
                    if (f13742j0.compareAndSet(this, j6, (j10 << 32) | this.f13746i0[i11])) {
                        i10 = i11;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return this.f13745h0.getAndSet(i10, null);
    }

    public void p(Object obj) {
        AbstractC3557B.c0("instance", obj);
    }

    public Object h(Object obj) {
        return obj;
    }
}
