package o7;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: Y  reason: collision with root package name */
    public final WeakReference f40929Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f40930Z;

    /* renamed from: h0  reason: collision with root package name */
    public final CountDownLatch f40931h0 = new CountDownLatch(1);

    /* renamed from: i0  reason: collision with root package name */
    public boolean f40932i0 = false;

    public b(C4947a c4947a, long j6) {
        this.f40929Y = new WeakReference(c4947a);
        this.f40930Z = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4947a c4947a;
        WeakReference weakReference = this.f40929Y;
        try {
            if (!this.f40931h0.await(this.f40930Z, TimeUnit.MILLISECONDS) && (c4947a = (C4947a) weakReference.get()) != null) {
                c4947a.c();
                this.f40932i0 = true;
            }
        } catch (InterruptedException unused) {
            C4947a c4947a2 = (C4947a) weakReference.get();
            if (c4947a2 != null) {
                c4947a2.c();
                this.f40932i0 = true;
            }
        }
    }
}
