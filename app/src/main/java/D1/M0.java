package D1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class M0 extends L0 {
    @Override // P5.c
    public final void L(boolean z10) {
        if (z10) {
            Window window = this.f3233Z;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        Q(16);
    }
}
