package K3;

import android.database.CursorWindow;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ CursorWindow d(long j6) {
        return new CursorWindow(null, j6);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout g(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean l(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
