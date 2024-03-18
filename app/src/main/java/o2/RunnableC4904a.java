package o2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import q.RunnableC5216j;

/* renamed from: o2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4904a implements Runnable {

    /* renamed from: k0  reason: collision with root package name */
    public static Handler f40506k0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ b f40511j0;

    /* renamed from: Z  reason: collision with root package name */
    public volatile int f40508Z = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicBoolean f40509h0 = new AtomicBoolean();

    /* renamed from: i0  reason: collision with root package name */
    public final AtomicBoolean f40510i0 = new AtomicBoolean();

    /* renamed from: Y  reason: collision with root package name */
    public final e f40507Y = new e(this, new d(0, this));

    public RunnableC4904a(b bVar) {
        this.f40511j0 = bVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC4904a.class) {
            try {
                if (f40506k0 == null) {
                    f40506k0 = new Handler(Looper.getMainLooper());
                }
                handler = f40506k0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new RunnableC5216j(this, 6, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40511j0.b();
    }
}
