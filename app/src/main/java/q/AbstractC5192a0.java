package q;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: q.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5192a0 {
    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void c(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}
