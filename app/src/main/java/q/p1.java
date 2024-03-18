package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import io.sentry.android.core.AbstractC3612c;
import l.AbstractC4308a;
import p1.AbstractC5042g;
import s1.AbstractC5521c;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f43521a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f43522b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f43523c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f43524d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f43525e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f43526f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f43527g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC4308a.f37673j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                AbstractC3612c.c("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f43522b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f43521a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f6 = typedValue.getFloat();
        int c10 = c(context, i10);
        return AbstractC5521c.d(c10, Math.round(Color.alpha(c10) * f6));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f43527g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f43527g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC5042g.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
