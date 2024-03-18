package E1;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ PackageInfo b(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags e(long j6) {
        return PackageManager.PackageInfoFlags.of(j6);
    }

    public static /* synthetic */ LineBreakConfig.Builder f() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout j(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f6, float f10, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f6, f10, metrics, z10, truncateAt, i11, z11);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder m() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback p(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher s(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
