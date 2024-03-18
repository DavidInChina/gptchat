package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: q.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5243x {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f43584b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C5243x f43585c;

    /* renamed from: a  reason: collision with root package name */
    public X0 f43586a;

    public static synchronized C5243x a() {
        C5243x c5243x;
        synchronized (C5243x.class) {
            try {
                if (f43585c == null) {
                    d();
                }
                c5243x = f43585c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5243x;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (C5243x.class) {
            h10 = X0.h(i10, mode);
        }
        return h10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, q.x] */
    public static synchronized void d() {
        synchronized (C5243x.class) {
            if (f43585c == null) {
                ?? obj = new Object();
                f43585c = obj;
                obj.f43586a = X0.d();
                f43585c.f43586a.l(new C5241w(0));
            }
        }
    }

    public static void e(Drawable drawable, r1 r1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = X0.f43372h;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC5238u0.f43561a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = r1Var.f43545c;
            if (!z10 && !r1Var.f43544b) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z10) {
                    colorStateList = (ColorStateList) r1Var.f43546d;
                } else {
                    colorStateList = null;
                }
                if (r1Var.f43544b) {
                    mode = (PorterDuff.Mode) r1Var.f43547e;
                } else {
                    mode = X0.f43372h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = X0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f43586a.f(context, i10);
    }
}
