package l6;

import android.os.Handler;
import i6.f;
import id.AbstractC3557B;
import kf.w;
import p5.AbstractC5092d;
import r5.d;

/* renamed from: l6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4338b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5092d f37842Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Handler f37843Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f37844h0 = 5000;

    /* renamed from: i0  reason: collision with root package name */
    public final long f37845i0 = 500;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f37846j0;

    public RunnableC4338b(d dVar, Handler handler) {
        AbstractC3557B.c0("sdkCore", dVar);
        this.f37842Y = dVar;
        this.f37843Z = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l6.a, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted() && !this.f37846j0) {
            try {
                ?? obj = new Object();
                synchronized (obj) {
                    if (!this.f37843Z.post(obj)) {
                        return;
                    }
                    obj.wait(this.f37844h0);
                    if (!obj.f37841Y) {
                        f a5 = i6.b.a(this.f37842Y);
                        Thread thread = this.f37843Z.getLooper().getThread();
                        AbstractC3557B.b0("handler.looper.thread", thread);
                        Exception exc = new Exception();
                        exc.setStackTrace(thread.getStackTrace());
                        a5.q("Application Not Responding", 2, exc, w.f37484Y);
                        obj.wait();
                    }
                }
                long j6 = this.f37845i0;
                if (j6 > 0) {
                    Thread.sleep(j6);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
