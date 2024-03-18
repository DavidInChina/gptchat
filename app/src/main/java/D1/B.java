package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class B extends C0378y {

    /* renamed from: h0  reason: collision with root package name */
    public View f3206h0;

    /* renamed from: i0  reason: collision with root package name */
    public WindowInsetsController f3207i0;

    /* JADX WARN: Type inference failed for: r4v0, types: [D1.A] */
    @Override // D1.C0378y, a1.C1915c
    public final void o() {
        int ime;
        View view = this.f3206h0;
        WindowInsetsController windowInsetsController = this.f3207i0;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: D1.A
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    boolean z10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i10 & 8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    atomicBoolean2.set(z10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.o();
    }

    @Override // D1.C0378y, a1.C1915c
    public final void w() {
        int ime;
        View view = this.f3206h0;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f3207i0;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
            return;
        }
        super.w();
    }
}
