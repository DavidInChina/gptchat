package w7;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import z7.C6778a;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f48095h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static I f48096i;

    /* renamed from: j  reason: collision with root package name */
    public static HandlerThread f48097j;

    /* renamed from: b  reason: collision with root package name */
    public final Context f48099b;

    /* renamed from: c  reason: collision with root package name */
    public volatile H7.d f48100c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f48098a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final C6778a f48101d = C6778a.a();

    /* renamed from: e  reason: collision with root package name */
    public final long f48102e = 5000;

    /* renamed from: f  reason: collision with root package name */
    public final long f48103f = 300000;

    /* renamed from: g  reason: collision with root package name */
    public volatile Executor f48104g = null;

    public I(Context context, Looper looper) {
        H h10 = new H(this);
        this.f48099b = context.getApplicationContext();
        this.f48100c = new H7.d(looper, h10, 1);
    }

    public static HandlerThread a() {
        synchronized (f48095h) {
            try {
                HandlerThread handlerThread = f48097j;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f48097j = handlerThread2;
                handlerThread2.start();
                return f48097j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str, String str2, ServiceConnectionC6124B serviceConnectionC6124B, boolean z10) {
        C6128F c6128f = new C6128F(str, str2, z10);
        synchronized (this.f48098a) {
            try {
                G g10 = (G) this.f48098a.get(c6128f);
                if (g10 != null) {
                    if (g10.f48087a.containsKey(serviceConnectionC6124B)) {
                        g10.f48087a.remove(serviceConnectionC6124B);
                        if (g10.f48087a.isEmpty()) {
                            this.f48100c.sendMessageDelayed(this.f48100c.obtainMessage(0, c6128f), this.f48102e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c6128f.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c6128f.toString()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(C6128F c6128f, ServiceConnectionC6124B serviceConnectionC6124B, String str) {
        boolean z10;
        synchronized (this.f48098a) {
            try {
                G g10 = (G) this.f48098a.get(c6128f);
                Executor executor = this.f48104g;
                if (g10 == null) {
                    g10 = new G(this, c6128f);
                    g10.f48087a.put(serviceConnectionC6124B, serviceConnectionC6124B);
                    g10.a(str, executor);
                    this.f48098a.put(c6128f, g10);
                } else {
                    this.f48100c.removeMessages(0, c6128f);
                    if (!g10.f48087a.containsKey(serviceConnectionC6124B)) {
                        g10.f48087a.put(serviceConnectionC6124B, serviceConnectionC6124B);
                        int i10 = g10.f48088b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                g10.a(str, executor);
                            }
                        } else {
                            serviceConnectionC6124B.onServiceConnected(g10.f48092f, g10.f48090d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c6128f.toString()));
                    }
                }
                z10 = g10.f48089c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
