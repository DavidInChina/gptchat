package L3;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f10725Y;

    /* renamed from: Z  reason: collision with root package name */
    public final WorkerParameters f10726Z;

    /* renamed from: h0  reason: collision with root package name */
    public volatile int f10727h0 = -256;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10728i0;

    public r(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f10725Y = context;
                this.f10726Z = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A8.a, java.lang.Object, W3.i] */
    public A8.a a() {
        ?? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public abstract W3.i c();

    public final void d(int i10) {
        this.f10727h0 = i10;
        b();
    }

    public void b() {
    }
}
