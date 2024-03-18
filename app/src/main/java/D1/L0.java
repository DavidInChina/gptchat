package D1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class L0 extends K0 {
    @Override // P5.c
    public final void M(boolean z10) {
        if (z10) {
            Window window = this.f3233Z;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        Q(8192);
    }
}
