package D1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.openai.chatgpt.R;
import java.util.List;
import k2.C4155a;

/* loaded from: classes.dex */
public final class r0 extends u0 {

    /* renamed from: e  reason: collision with root package name */
    public static final PathInterpolator f3295e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final C4155a f3296f = new C4155a();

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f3297g = new DecelerateInterpolator();

    public static void e(View view, v0 v0Var) {
        AbstractC0366n0 j6 = j(view);
        if (j6 != null) {
            j6.a(v0Var);
            if (j6.f3276Z == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void f(View view, v0 v0Var, WindowInsets windowInsets, boolean z10) {
        AbstractC0366n0 j6 = j(view);
        if (j6 != null) {
            j6.f3275Y = windowInsets;
            if (!z10) {
                j6.b();
                if (j6.f3276Z == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), v0Var, windowInsets, z10);
            }
        }
    }

    public static void g(View view, J0 j02, List list) {
        AbstractC0366n0 j6 = j(view);
        if (j6 != null) {
            j02 = j6.c(j02, list);
            if (j6.f3276Z == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), j02, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, U3.l lVar) {
        AbstractC0366n0 j6 = j(view);
        if (j6 != null) {
            j6.d(lVar);
            if (j6.f3276Z == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), v0Var, lVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0366n0 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof q0) {
            return ((q0) tag).f3293a;
        }
        return null;
    }
}
