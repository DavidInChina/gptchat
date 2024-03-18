package g;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import java.lang.reflect.Field;

/* renamed from: g.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3125r implements AbstractC2084t {

    /* renamed from: Z  reason: collision with root package name */
    public static int f30990Z;

    /* renamed from: h0  reason: collision with root package name */
    public static Field f30991h0;

    /* renamed from: i0  reason: collision with root package name */
    public static Field f30992i0;

    /* renamed from: j0  reason: collision with root package name */
    public static Field f30993j0;

    /* renamed from: Y  reason: collision with root package name */
    public Activity f30994Y;

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        if (enumC2081p != EnumC2081p.ON_DESTROY) {
            return;
        }
        if (f30990Z == 0) {
            try {
                f30990Z = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f30992i0 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f30993j0 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f30991h0 = declaredField3;
                declaredField3.setAccessible(true);
                f30990Z = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f30990Z == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f30994Y.getSystemService("input_method");
            try {
                Object obj = f30991h0.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f30992i0.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f30993j0.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
