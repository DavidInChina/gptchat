package Ng;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class I extends AbstractC1051a0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n0  reason: collision with root package name */
    public static final I f12886n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final long f12887o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ng.I, Ng.b0, Ng.a0] */
    static {
        Long l10;
        ?? abstractC1051a0 = new AbstractC1051a0();
        f12886n0 = abstractC1051a0;
        abstractC1051a0.P0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f12887o0 = timeUnit.toNanos(l10.longValue());
    }

    @Override // Ng.AbstractC1053b0
    public final Thread H0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(I.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // Ng.AbstractC1053b0
    public final void U0(long j6, Y y10) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Ng.AbstractC1051a0
    public final void V0(Runnable runnable) {
        if (debugStatus != 4) {
            super.V0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void Z0() {
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            return;
        }
        debugStatus = 3;
        AbstractC1051a0.f12920k0.set(this, null);
        AbstractC1051a0.f12921l0.set(this, null);
        notifyAll();
    }

    @Override // Ng.AbstractC1051a0, Ng.M
    public final T i(long j6, Runnable runnable, AbstractC4831k abstractC4831k) {
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
            X x10 = new X(runnable, j10 + nanoTime);
            Y0(nanoTime, x10);
            return x10;
        }
        return A0.f12861Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        Ng.I._thread = null;
        Z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        if (X0() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean X02;
        G0.f12872a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j6 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long S02 = S0();
                        if (S02 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j6 == Long.MAX_VALUE) {
                                j6 = f12887o0 + nanoTime;
                            }
                            long j10 = j6 - nanoTime;
                            if (j10 <= 0) {
                                if (!X02) {
                                    return;
                                }
                                return;
                            }
                            S02 = com.google.android.gms.internal.play_billing.N.m(S02, j10);
                        } else {
                            j6 = Long.MAX_VALUE;
                        }
                        if (S02 > 0) {
                            int i11 = debugStatus;
                            if (i11 == 2 || i11 == 3) {
                                break;
                            }
                            LockSupport.parkNanos(this, S02);
                        }
                    }
                }
                _thread = null;
                Z0();
                if (!X0()) {
                    H0();
                }
            }
        } finally {
            _thread = null;
            Z0();
            if (!X0()) {
                H0();
            }
        }
    }

    @Override // Ng.AbstractC1051a0, Ng.AbstractC1053b0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
