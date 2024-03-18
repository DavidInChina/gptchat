package D1;

import android.view.View;
import android.view.Window;

/* renamed from: D1.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0362l0 {
    public static void a(Window window, boolean z10) {
        int i10;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility & (-1793);
        } else {
            i10 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i10);
    }
}
