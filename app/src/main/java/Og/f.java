package Og;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.C3960j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13760a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new d(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            obj = N.w(th2);
        }
        if (obj instanceof C3960j) {
            obj = null;
        }
        e eVar = (e) obj;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC3557B.a0("null cannot be cast to non-null type android.os.Handler", invoke);
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
