package Ng;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kf.C4288m;
import nf.AbstractC4831k;

/* renamed from: Ng.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1051a0 extends AbstractC1053b0 implements M {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12920k0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1051a0.class, Object.class, "_queue$volatile");

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12921l0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC1051a0.class, Object.class, "_delayed$volatile");

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12922m0 = AtomicIntegerFieldUpdater.newUpdater(AbstractC1051a0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0088 A[EDGE_INSN: B:79:0x0088->B:45:0x0088 ?: BREAK  , SYNTHETIC] */
    @Override // Ng.AbstractC1053b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long S0() {
        Object obj;
        long j6;
        Y b10;
        Y y10;
        Y y11;
        if (T0()) {
            return 0L;
        }
        Z z10 = (Z) f12921l0.get(this);
        Runnable runnable = null;
        if (z10 != null && Sg.D.f16636b.get(z10) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (z10) {
                    Y[] yArr = z10.f16637a;
                    if (yArr != null) {
                        y10 = yArr[0];
                    } else {
                        y10 = null;
                    }
                    if (y10 == null) {
                        y11 = null;
                        continue;
                    } else {
                        if (nanoTime - y10.f12916Y >= 0 && W0(y10)) {
                            y11 = z10.d(0);
                        } else {
                            y11 = null;
                        }
                        continue;
                    }
                }
            } while (y11 != null);
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12920k0;
                obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                }
            }
            if (runnable == null) {
            }
        } else {
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12920k0;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    break;
                } else if (obj instanceof Sg.s) {
                    Sg.s sVar = (Sg.s) obj;
                    Object d10 = sVar.d();
                    if (d10 != Sg.s.f16679g) {
                        runnable = (Runnable) d10;
                        break;
                    }
                    Sg.s c10 = sVar.c();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (obj != H.f12875c) {
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop1;
                } else {
                    break;
                }
            }
            if (runnable == null) {
                runnable.run();
                return 0L;
            }
            C4288m c4288m = this.f12927i0;
            if (c4288m == null || c4288m.isEmpty()) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = 0;
            }
            if (j6 == 0) {
                return 0L;
            }
            Object obj2 = f12920k0.get(this);
            if (obj2 != null) {
                if (obj2 instanceof Sg.s) {
                    long j10 = Sg.s.f16678f.get((Sg.s) obj2);
                    if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else {
                    if (obj2 != H.f12875c) {
                        return 0L;
                    }
                    return Long.MAX_VALUE;
                }
            }
            Z z11 = (Z) f12921l0.get(this);
            if (z11 != null && (b10 = z11.b()) != null) {
                return com.google.android.gms.internal.play_billing.N.k(b10.f12916Y - System.nanoTime(), 0L);
            }
            return Long.MAX_VALUE;
        }
    }

    public void V0(Runnable runnable) {
        if (W0(runnable)) {
            Thread H02 = H0();
            if (Thread.currentThread() != H02) {
                LockSupport.unpark(H02);
                return;
            }
            return;
        }
        I.f12886n0.V0(runnable);
    }

    public final boolean W0(Runnable runnable) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12920k0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f12922m0.get(this) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            } else if (obj instanceof Sg.s) {
                Sg.s sVar = (Sg.s) obj;
                int a5 = sVar.a(runnable);
                if (a5 == 0) {
                    return true;
                }
                if (a5 != 1) {
                    if (a5 == 2) {
                        return false;
                    }
                } else {
                    Sg.s c10 = sVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else if (obj == H.f12875c) {
                return false;
            } else {
                Sg.s sVar2 = new Sg.s(8, true);
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    public final boolean X0() {
        boolean z10;
        C4288m c4288m = this.f12927i0;
        if (c4288m != null) {
            z10 = c4288m.isEmpty();
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        Z z11 = (Z) f12921l0.get(this);
        if (z11 != null && Sg.D.f16636b.get(z11) != 0) {
            return false;
        }
        Object obj = f12920k0.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof Sg.s) {
            long j6 = Sg.s.f16678f.get((Sg.s) obj);
            if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == H.f12875c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Ng.Z, java.lang.Object] */
    public final void Y0(long j6, Y y10) {
        boolean z10;
        int i10;
        Thread H02;
        if (f12922m0.get(this) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Y y11 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12921l0;
        if (z10) {
            i10 = 1;
        } else {
            Z z11 = (Z) atomicReferenceFieldUpdater.get(this);
            if (z11 == null) {
                ?? obj = new Object();
                obj.f12918c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                AbstractC3557B.Z(obj2);
                z11 = (Z) obj2;
            }
            i10 = y10.b(j6, z11, this);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            U0(j6, y10);
            return;
        }
        Z z12 = (Z) atomicReferenceFieldUpdater.get(this);
        if (z12 != null) {
            y11 = z12.b();
        }
        if (y11 == y10 && Thread.currentThread() != (H02 = H0())) {
            LockSupport.unpark(H02);
        }
    }

    @Override // Ng.M
    public final void h(long j6, C1072l c1072l) {
        long j10 = 0;
        if (j6 > 0) {
            if (j6 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j6;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            W w10 = new W(this, j10 + nanoTime, c1072l);
            Y0(nanoTime, w10);
            c1072l.w(new C1066i(1, w10));
        }
    }

    public T i(long j6, Runnable runnable, AbstractC4831k abstractC4831k) {
        return J.f12891a.i(j6, runnable, abstractC4831k);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        V0(runnable);
    }

    @Override // Ng.AbstractC1053b0
    public void shutdown() {
        Y y10;
        ThreadLocal threadLocal = G0.f12872a;
        G0.f12872a.set(null);
        f12922m0.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12920k0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Q1.u uVar = H.f12875c;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof Sg.s) {
                ((Sg.s) obj).b();
                break;
            } else if (obj != uVar) {
                Sg.s sVar = new Sg.s(8, true);
                sVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (S0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            Z z10 = (Z) f12921l0.get(this);
            if (z10 != null) {
                synchronized (z10) {
                    if (Sg.D.f16636b.get(z10) > 0) {
                        y10 = z10.d(0);
                    } else {
                        y10 = null;
                    }
                }
                if (y10 != null) {
                    U0(nanoTime, y10);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
