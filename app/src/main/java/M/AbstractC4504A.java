package m;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.revenuecat.purchases.common.UtilsKt;
import j$.util.Objects;

/* renamed from: m.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4504A {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H) {
        Objects.requireNonNull(layoutInflater$Factory2C4511H);
        z zVar = new z(0, layoutInflater$Factory2C4511H);
        E1.g.s(obj).registerOnBackInvokedCallback((int) UtilsKt.MICROS_MULTIPLIER, zVar);
        return zVar;
    }

    public static void c(Object obj, Object obj2) {
        E1.g.s(obj).unregisterOnBackInvokedCallback(E1.g.p(obj2));
    }
}
