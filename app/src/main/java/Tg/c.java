package Tg;

import Ng.H;
import Q1.u;
import Sg.q;
import Sg.x;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jh.H1;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: m0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f17235m0 = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: n0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f17236n0 = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: o0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17237o0 = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: p0 */
    public static final u f17238p0 = new u("NOT_IN_STACK", 9, 0);

    /* renamed from: Y */
    public final int f17239Y;

    /* renamed from: Z */
    public final int f17240Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: h0 */
    public final long f17241h0;

    /* renamed from: i0 */
    public final String f17242i0;

    /* renamed from: j0 */
    public final f f17243j0;

    /* renamed from: k0 */
    public final f f17244k0;

    /* renamed from: l0 */
    public final x f17245l0;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r3v13, types: [Sg.q, Tg.f] */
    /* JADX WARN: Type inference failed for: r3v14, types: [Sg.q, Tg.f] */
    public c(long j6, String str, int i10, int i11) {
        this.f17239Y = i10;
        this.f17240Z = i11;
        this.f17241h0 = j6;
        this.f17242i0 = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j6 > 0) {
                        this.f17243j0 = new q();
                        this.f17244k0 = new q();
                        this.f17245l0 = new x((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
                }
                throw new IllegalArgumentException(AbstractC4194d.v("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Core pool size ", i10, " should be at least 1").toString());
    }

    public static /* synthetic */ void i(c cVar, Runnable runnable, boolean z10, int i10) {
        H1 h12 = k.f17260g;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        cVar.h(runnable, h12, z10);
    }

    public final int a() {
        synchronized (this.f17245l0) {
            try {
                if (f17237o0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f17236n0;
                long j6 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j6 & 2097151);
                int i11 = i10 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f17239Y) {
                    return 0;
                }
                if (i10 >= this.f17240Z) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 > 0 && this.f17245l0.b(i12) == null) {
                    a aVar = new a(this, i12);
                    this.f17245l0.c(i12, aVar);
                    if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i13 = i11 + 1;
                        aVar.start();
                        return i13;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r1 == null) goto L36;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        a aVar;
        int i10;
        i iVar;
        if (f17237o0.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof a) {
                aVar = (a) currentThread;
            } else {
                aVar = null;
            }
            if (aVar == null || !AbstractC3557B.K(aVar.f17228m0, this)) {
                aVar = null;
            }
            synchronized (this.f17245l0) {
                i10 = (int) (f17236n0.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b10 = this.f17245l0.b(i11);
                    AbstractC3557B.Z(b10);
                    a aVar2 = (a) b10;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f17221Y;
                        f fVar = this.f17244k0;
                        mVar.getClass();
                        i iVar2 = (i) m.f17263b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b11 = mVar.b();
                            if (b11 == null) {
                                break;
                            }
                            fVar.a(b11);
                        }
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f17244k0.b();
            this.f17243j0.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f17243j0.d();
                if (iVar == null && (iVar = (i) this.f17244k0.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th2) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                }
            }
            if (aVar != null) {
                aVar.h(b.f17233j0);
            }
            f17235m0.set(this, 0L);
            f17236n0.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, false, 6);
    }

    public final void h(Runnable runnable, H1 h12, boolean z10) {
        i iVar;
        boolean z11;
        long j6;
        a aVar;
        boolean z12;
        b bVar;
        k.f17259f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            iVar = (i) runnable;
            iVar.f17251Y = nanoTime;
            iVar.f17252Z = h12;
        } else {
            iVar = new j(runnable, nanoTime, h12);
        }
        boolean z13 = false;
        if (iVar.f17252Z.f36244Y == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17236n0;
        if (z11) {
            j6 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j6 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !AbstractC3557B.K(aVar.f17228m0, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f17223h0) != b.f17233j0 && (iVar.f17252Z.f36244Y != 0 || bVar != b.f17230Z)) {
            aVar.f17227l0 = true;
            m mVar = aVar.f17221Y;
            if (z10) {
                iVar = mVar.a(iVar);
            } else {
                mVar.getClass();
                i iVar2 = (i) m.f17263b.getAndSet(mVar, iVar);
                if (iVar2 == null) {
                    iVar = null;
                } else {
                    iVar = mVar.a(iVar2);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f17252Z.f36244Y == 1) {
                z12 = this.f17244k0.a(iVar);
            } else {
                z12 = this.f17243j0.a(iVar);
            }
            if (!z12) {
                throw new RejectedExecutionException(R.a.t(new StringBuilder(), this.f17242i0, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z13 = true;
        }
        if (z11) {
            if (!z13 && !m() && !k(j6)) {
                m();
            }
        } else if (!z13 && !m() && !k(atomicLongFieldUpdater.get(this))) {
            m();
        }
    }

    public final void j(a aVar, int i10, int i11) {
        while (true) {
            long j6 = f17235m0.get(this);
            int i12 = (int) (2097151 & j6);
            long j10 = (2097152 + j6) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == f17238p0) {
                            i12 = -1;
                            break;
                        } else if (c10 == null) {
                            i12 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c10;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i12 = b10;
                                break;
                            }
                            c10 = aVar2.c();
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f17235m0.compareAndSet(this, j6, i12 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j6) {
        int i10 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f17239Y;
        if (i10 < i11) {
            int a5 = a();
            if (a5 == 1 && i11 > 1) {
                a();
            }
            if (a5 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        u uVar;
        int i10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17235m0;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f17245l0.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j6) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    uVar = f17238p0;
                    if (c10 == uVar) {
                        i10 = -1;
                        break;
                    } else if (c10 == null) {
                        i10 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c10;
                        i10 = aVar2.b();
                        if (i10 != 0) {
                            break;
                        }
                        c10 = aVar2.c();
                    }
                }
                if (i10 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j6, j10 | i10)) {
                    aVar.g(uVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f17220n0.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        x xVar = this.f17245l0;
        int a5 = xVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a5; i16++) {
            a aVar = (a) xVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f17221Y;
                mVar.getClass();
                if (m.f17263b.get(mVar) != null) {
                    i10 = (m.f17264c.get(mVar) - m.f17265d.get(mVar)) + 1;
                } else {
                    i10 = m.f17264c.get(mVar) - m.f17265d.get(mVar);
                }
                int ordinal = aVar.f17223h0.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i10);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j6 = f17236n0.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f17242i0);
        sb5.append('@');
        sb5.append(H.q(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f17239Y;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.f17240Z);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i11);
        sb5.append(", blocking = ");
        sb5.append(i12);
        sb5.append(", parked = ");
        sb5.append(i13);
        sb5.append(", dormant = ");
        sb5.append(i14);
        sb5.append(", terminated = ");
        sb5.append(i15);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f17243j0.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f17244k0.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j6));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j6) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
