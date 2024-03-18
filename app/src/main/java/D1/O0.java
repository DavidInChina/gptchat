package D1;

import a1.C1915c;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class O0 extends P5.c {

    /* renamed from: Z  reason: collision with root package name */
    public final WindowInsetsController f3238Z;

    /* renamed from: h0  reason: collision with root package name */
    public final F4.a f3239h0;

    /* renamed from: i0  reason: collision with root package name */
    public Window f3240i0;

    public O0(WindowInsetsController windowInsetsController, F4.a aVar) {
        super(3);
        this.f3238Z = windowInsetsController;
        this.f3239h0 = aVar;
    }

    @Override // P5.c
    public final void L(boolean z10) {
        Window window = this.f3240i0;
        WindowInsetsController windowInsetsController = this.f3238Z;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // P5.c
    public final void M(boolean z10) {
        Window window = this.f3240i0;
        WindowInsetsController windowInsetsController = this.f3238Z;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // P5.c
    public final void P() {
        ((C1915c) this.f3239h0.f5033Z).w();
        this.f3238Z.show(0);
    }
}
