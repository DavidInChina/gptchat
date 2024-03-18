package D1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import s1.C5523e;

/* loaded from: classes.dex */
public abstract class N {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static J0 b(View view, J0 j02, Rect rect) {
        WindowInsets f6 = j02.f();
        if (f6 != null) {
            return J0.g(view, view.computeSystemWindowInsets(f6, rect));
        }
        rect.setEmpty();
        return j02;
    }

    public static boolean c(View view, float f6, float f10, boolean z10) {
        return view.dispatchNestedFling(f6, f10, z10);
    }

    public static boolean d(View view, float f6, float f10) {
        return view.dispatchNestedPreFling(f6, f10);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static J0 j(View view) {
        A0 a02;
        if (!w0.f3313d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = w0.f3310a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) w0.f3311b.get(obj);
            Rect rect2 = (Rect) w0.f3312c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                a02 = new z0();
            } else if (i10 >= 29) {
                a02 = new y0();
            } else {
                a02 = new x0();
            }
            a02.e(C5523e.b(rect.left, rect.top, rect.right, rect.bottom));
            a02.g(C5523e.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            J0 b10 = a02.b();
            b10.f3232a.r(b10);
            b10.f3232a.d(view.getRootView());
            return b10;
        } catch (IllegalAccessException e10) {
            AbstractC3612c.s("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void u(View view, AbstractC0374u abstractC0374u) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, abstractC0374u);
        }
        if (abstractC0374u == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new M(view, abstractC0374u));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
