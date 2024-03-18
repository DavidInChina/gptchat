package r;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: g  reason: collision with root package name */
    public static volatile b f44148g;

    /* renamed from: h  reason: collision with root package name */
    public static final ExecutorC5333a f44149h = new ExecutorC5333a(1);

    /* renamed from: f  reason: collision with root package name */
    public final e f44150f = new e();

    public static b d0() {
        if (f44148g != null) {
            return f44148g;
        }
        synchronized (b.class) {
            try {
                if (f44148g == null) {
                    f44148g = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f44148g;
    }

    public final void e0(Runnable runnable) {
        e eVar = this.f44150f;
        if (eVar.f44156h == null) {
            synchronized (eVar.f44154f) {
                try {
                    if (eVar.f44156h == null) {
                        eVar.f44156h = e.d0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        eVar.f44156h.post(runnable);
    }
}
