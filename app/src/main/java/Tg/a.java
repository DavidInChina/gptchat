package Tg;

import Q1.u;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.B;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17220n0 = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: i0  reason: collision with root package name */
    public long f17224i0;
    private volatile int indexInArray;

    /* renamed from: j0  reason: collision with root package name */
    public long f17225j0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f17227l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ c f17228m0;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: Y  reason: collision with root package name */
    public final m f17221Y = new m();

    /* renamed from: Z  reason: collision with root package name */
    public final B f17222Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public b f17223h0 = b.f17232i0;
    private volatile Object nextParkedWorker = c.f17238p0;

    /* renamed from: k0  reason: collision with root package name */
    public int f17226k0 = Af.d.f841Z.d();

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public a(c cVar, int i10) {
        this.f17228m0 = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        Af.d.f840Y.getClass();
        f(i10);
    }

    public final i a(boolean z10) {
        i e10;
        i e11;
        c cVar;
        long j6;
        b bVar = this.f17223h0;
        b bVar2 = b.f17229Y;
        i iVar = null;
        m mVar = this.f17221Y;
        boolean z11 = true;
        c cVar2 = this.f17228m0;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f17236n0;
            do {
                cVar = this.f17228m0;
                j6 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f17263b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f17252Z.f36244Y == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = m.f17265d.get(mVar);
                    int i11 = m.f17264c.get(mVar);
                    while (true) {
                        if (i10 != i11 && m.f17266e.get(mVar) != 0) {
                            i11--;
                            i c10 = mVar.c(i11, true);
                            if (c10 != null) {
                                iVar = c10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar2.f17244k0.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f17236n0.compareAndSet(cVar, j6, j6 - 4398046511104L));
            this.f17223h0 = b.f17229Y;
        }
        if (z10) {
            if (d(cVar2.f17239Y * 2) != 0) {
                z11 = false;
            }
            if (!z11 || (e11 = e()) == null) {
                mVar.getClass();
                i iVar4 = (i) m.f17263b.getAndSet(mVar, null);
                if (iVar4 == null) {
                    iVar4 = mVar.b();
                }
                if (iVar4 == null) {
                    if (!z11 && (e10 = e()) != null) {
                        return e10;
                    }
                } else {
                    return iVar4;
                }
            } else {
                return e11;
            }
        } else {
            i e12 = e();
            if (e12 != null) {
                return e12;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f17226k0;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f17226k0 = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i e() {
        int d10 = d(2);
        c cVar = this.f17228m0;
        if (d10 == 0) {
            i iVar = (i) cVar.f17243j0.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f17244k0.d();
        }
        i iVar2 = (i) cVar.f17244k0.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f17243j0.d();
    }

    public final void f(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17228m0.f17242i0);
        sb2.append("-worker-");
        if (i10 == 0) {
            str = "TERMINATED";
        } else {
            str = String.valueOf(i10);
        }
        sb2.append(str);
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z10;
        b bVar2 = this.f17223h0;
        if (bVar2 == b.f17229Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f17236n0.addAndGet(this.f17228m0, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f17223h0 = bVar;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i i(int i10) {
        int i11;
        i iVar;
        int i12;
        long j6;
        boolean z10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f17236n0;
        c cVar = this.f17228m0;
        int i13 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i13 < 2) {
            return null;
        }
        int d10 = d(i13);
        int i14 = 0;
        long j10 = Long.MAX_VALUE;
        while (i14 < i13) {
            int i15 = d10 + 1;
            if (i15 > i13) {
                i15 = 1;
            }
            a aVar = (a) cVar.f17245l0.b(i15);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f17221Y;
                if (i10 == 3) {
                    iVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i16 = m.f17265d.get(mVar);
                    int i17 = m.f17264c.get(mVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (i16 != i17 && (!z10 || m.f17266e.get(mVar) != 0)) {
                        int i18 = i16 + 1;
                        iVar = mVar.c(i16, z10);
                        if (iVar != null) {
                            break;
                        }
                        i16 = i18;
                    }
                    iVar = iVar2;
                }
                B b10 = this.f17222Z;
                if (iVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f17263b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            break;
                        }
                        if (iVar3.f17252Z.f36244Y == 1) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        if ((i12 & i10) == 0) {
                            break;
                        }
                        k.f17259f.getClass();
                        i11 = i15;
                        long nanoTime = System.nanoTime() - iVar3.f17251Y;
                        long j11 = k.f17255b;
                        if (nanoTime < j11) {
                            j6 = j11 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                b10.f37622Y = iVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i15 = i11;
                        iVar2 = null;
                    }
                } else {
                    b10.f37622Y = iVar;
                    i11 = i15;
                }
                j6 = -1;
                if (j6 == -1) {
                    i iVar4 = (i) b10.f37622Y;
                    b10.f37622Y = iVar2;
                    return iVar4;
                } else if (j6 > 0) {
                    j10 = Math.min(j10, j6);
                }
            } else {
                i11 = i15;
            }
            i14++;
            d10 = i11;
            iVar2 = null;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        this.f17225j0 = j10;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        loop0: while (true) {
            boolean z14 = z13;
            while (true) {
                c cVar = this.f17228m0;
                cVar.getClass();
                if (c.f17237o0.get(cVar) == 0) {
                    b bVar = this.f17223h0;
                    b bVar2 = b.f17233j0;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a5 = a(this.f17227l0);
                    long j6 = -2097152;
                    if (a5 != null) {
                        this.f17225j0 = 0L;
                        int i10 = a5.f17252Z.f36244Y;
                        this.f17224i0 = 0L;
                        if (this.f17223h0 == b.f17231h0) {
                            this.f17223h0 = b.f17230Z;
                        }
                        c cVar2 = this.f17228m0;
                        if (i10 != 0 && h(b.f17230Z) && !cVar2.m() && !cVar2.k(c.f17236n0.get(cVar2))) {
                            cVar2.m();
                        }
                        cVar2.getClass();
                        try {
                            a5.run();
                        } catch (Throwable th2) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (i10 != 0) {
                            c.f17236n0.addAndGet(cVar2, -2097152L);
                            if (this.f17223h0 != bVar2) {
                                this.f17223h0 = b.f17232i0;
                            }
                        }
                    } else {
                        this.f17227l0 = z13;
                        if (this.f17225j0 != 0) {
                            if (!z14) {
                                z14 = true;
                            } else {
                                h(b.f17231h0);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f17225j0);
                                this.f17225j0 = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            u uVar = c.f17238p0;
                            if (obj != uVar) {
                                z10 = true;
                            } else {
                                z10 = z13;
                            }
                            if (!z10) {
                                c cVar3 = this.f17228m0;
                                cVar3.getClass();
                                if (this.nextParkedWorker == uVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f17235m0;
                                        long j10 = atomicLongFieldUpdater.get(cVar3);
                                        int i11 = this.indexInArray;
                                        this.nextParkedWorker = cVar3.f17245l0.b((int) (j10 & 2097151));
                                        if (atomicLongFieldUpdater.compareAndSet(cVar3, j10, ((2097152 + j10) & j6) | i11)) {
                                            break;
                                        }
                                        j6 = -2097152;
                                    }
                                }
                            } else {
                                f17220n0.set(this, -1);
                                while (this.nextParkedWorker != c.f17238p0) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f17220n0;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar4 = this.f17228m0;
                                    cVar4.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f17237o0;
                                    if (atomicIntegerFieldUpdater3.get(cVar4) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f17223h0;
                                    b bVar4 = b.f17233j0;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f17231h0);
                                    Thread.interrupted();
                                    if (this.f17224i0 == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f17224i0 = System.nanoTime() + this.f17228m0.f17241h0;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f17228m0.f17241h0);
                                    if (System.nanoTime() - this.f17224i0 >= 0) {
                                        this.f17224i0 = 0L;
                                        c cVar5 = this.f17228m0;
                                        synchronized (cVar5.f17245l0) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(cVar5) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (!z12) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f17236n0;
                                                    if (((int) (atomicLongFieldUpdater2.get(cVar5) & 2097151)) > cVar5.f17239Y) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i12 = this.indexInArray;
                                                            z11 = false;
                                                            f(0);
                                                            cVar5.j(this, i12, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar5) & 2097151);
                                                            if (andDecrement != i12) {
                                                                Object b10 = cVar5.f17245l0.b(andDecrement);
                                                                AbstractC3557B.Z(b10);
                                                                a aVar = (a) b10;
                                                                cVar5.f17245l0.c(i12, aVar);
                                                                aVar.f(i12);
                                                                cVar5.j(aVar, andDecrement, i12);
                                                            }
                                                            cVar5.f17245l0.c(andDecrement, null);
                                                            this.f17223h0 = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z13 = z11;
                                    }
                                    z11 = false;
                                    z13 = z11;
                                }
                            }
                            z13 = z13;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f17233j0);
    }
}
