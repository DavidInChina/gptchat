package d8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: d8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2605a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f28124a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f28125b = AbstractC2605a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f28124a, 0)) != 0) {
                AbstractC3612c.r(f28125b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
