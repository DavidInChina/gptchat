package q;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class T0 extends N0 implements O0 {

    /* renamed from: J0  reason: collision with root package name */
    public static final Method f43359J0;

    /* renamed from: I0  reason: collision with root package name */
    public O0 f43360I0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f43359J0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // q.O0
    public final void g(p.o oVar, MenuItem menuItem) {
        O0 o02 = this.f43360I0;
        if (o02 != null) {
            o02.g(oVar, menuItem);
        }
    }

    @Override // q.N0
    public final A0 p(Context context, boolean z10) {
        S0 s02 = new S0(context, z10);
        s02.setHoverListener(this);
        return s02;
    }

    @Override // q.O0
    public final void z(p.o oVar, p.q qVar) {
        O0 o02 = this.f43360I0;
        if (o02 != null) {
            o02.z(oVar, qVar);
        }
    }
}
