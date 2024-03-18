package r;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Object f44154f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final ExecutorService f44155g = Executors.newFixedThreadPool(4, new c(this));

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f44156h;

    public static Handler d0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
