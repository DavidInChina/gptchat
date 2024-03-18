package I2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class j extends Handler implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f7996Y;

    /* renamed from: Z  reason: collision with root package name */
    public final k f7997Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f7998h0;

    /* renamed from: i0  reason: collision with root package name */
    public h f7999i0;

    /* renamed from: j0  reason: collision with root package name */
    public IOException f8000j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8001k0;

    /* renamed from: l0  reason: collision with root package name */
    public Thread f8002l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8003m0;

    /* renamed from: n0  reason: collision with root package name */
    public volatile boolean f8004n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ n f8005o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, h hVar, int i10, long j6) {
        super(looper);
        this.f8005o0 = nVar;
        this.f7997Z = kVar;
        this.f7999i0 = hVar;
        this.f7996Y = i10;
        this.f7998h0 = j6;
    }

    public final void a(boolean z10) {
        this.f8004n0 = z10;
        this.f8000j0 = null;
        if (hasMessages(0)) {
            this.f8003m0 = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f8003m0 = true;
                    this.f7997Z.b();
                    Thread thread = this.f8002l0;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f8005o0.f8009b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.f7999i0;
            hVar.getClass();
            hVar.a(this.f7997Z, elapsedRealtime, elapsedRealtime - this.f7998h0, true);
            this.f7999i0 = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8004n0) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f8000j0 = null;
            n nVar = this.f8005o0;
            ExecutorService executorService = nVar.f8008a;
            j jVar = nVar.f8009b;
            jVar.getClass();
            executorService.execute(jVar);
        } else if (i10 != 3) {
            this.f8005o0.f8009b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f7998h0;
            h hVar = this.f7999i0;
            hVar.getClass();
            if (this.f8003m0) {
                hVar.a(this.f7997Z, elapsedRealtime, j6, false);
                return;
            }
            int i11 = message.what;
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f8000j0 = iOException;
                    int i12 = this.f8001k0 + 1;
                    this.f8001k0 = i12;
                    i h10 = hVar.h(this.f7997Z, elapsedRealtime, j6, iOException, i12);
                    int i13 = h10.f7994a;
                    if (i13 == 3) {
                        this.f8005o0.f8010c = this.f8000j0;
                        return;
                    } else if (i13 != 2) {
                        if (i13 == 1) {
                            this.f8001k0 = 1;
                        }
                        long j10 = h10.f7995b;
                        if (j10 == -9223372036854775807L) {
                            j10 = Math.min((this.f8001k0 - 1) * 1000, 5000);
                        }
                        n nVar2 = this.f8005o0;
                        if (nVar2.f8009b != null) {
                            z10 = false;
                        }
                        Gi.e.n(z10);
                        nVar2.f8009b = this;
                        if (j10 > 0) {
                            sendEmptyMessageDelayed(0, j10);
                            return;
                        }
                        this.f8000j0 = null;
                        nVar2.f8008a.execute(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            try {
                hVar.g(this.f7997Z, elapsedRealtime, j6);
            } catch (RuntimeException e10) {
                s2.p.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.f8005o0.f8010c = new m(e10);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.f8003m0;
                this.f8002l0 = Thread.currentThread();
            }
            if (z10) {
                AbstractC5260f.g("load:".concat(this.f7997Z.getClass().getSimpleName()));
                try {
                    this.f7997Z.a();
                    AbstractC5260f.q();
                } catch (Throwable th2) {
                    AbstractC5260f.q();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f8002l0 = null;
                Thread.interrupted();
            }
            if (!this.f8004n0) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.f8004n0) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f8004n0) {
                s2.p.d("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new m(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f8004n0) {
                s2.p.d("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (!this.f8004n0) {
                s2.p.d("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new m(e13)).sendToTarget();
            }
        }
    }
}
