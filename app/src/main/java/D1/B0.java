package D1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import io.sentry.android.core.AbstractC3612c;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s1.C5523e;

/* loaded from: classes2.dex */
public abstract class B0 extends H0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3208h;

    /* renamed from: i  reason: collision with root package name */
    public static Method f3209i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f3210j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f3211k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f3212l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f3213c;

    /* renamed from: d  reason: collision with root package name */
    public C5523e[] f3214d;

    /* renamed from: e  reason: collision with root package name */
    public C5523e f3215e = null;

    /* renamed from: f  reason: collision with root package name */
    public J0 f3216f;

    /* renamed from: g  reason: collision with root package name */
    public C5523e f3217g;

    public B0(J0 j02, WindowInsets windowInsets) {
        super(j02);
        this.f3213c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private C5523e t(int i10, boolean z10) {
        C5523e c5523e = C5523e.f45105e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                c5523e = C5523e.a(c5523e, u(i11, z10));
            }
        }
        return c5523e;
    }

    private C5523e v() {
        J0 j02 = this.f3216f;
        if (j02 != null) {
            return j02.f3232a.i();
        }
        return C5523e.f45105e;
    }

    private C5523e w(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f3208h) {
                y();
            }
            Method method = f3209i;
            if (method != null && f3210j != null && f3211k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        AbstractC3612c.s("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3211k.get(f3212l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return C5523e.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e10) {
                    AbstractC3612c.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void y() {
        try {
            f3209i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3210j = cls;
            f3211k = cls.getDeclaredField("mVisibleInsets");
            f3212l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3211k.setAccessible(true);
            f3212l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            AbstractC3612c.d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f3208h = true;
    }

    @Override // D1.H0
    public void d(View view) {
        C5523e w10 = w(view);
        if (w10 == null) {
            w10 = C5523e.f45105e;
        }
        z(w10);
    }

    @Override // D1.H0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f3217g, ((B0) obj).f3217g);
    }

    @Override // D1.H0
    public C5523e f(int i10) {
        return t(i10, false);
    }

    @Override // D1.H0
    public C5523e g(int i10) {
        return t(i10, true);
    }

    @Override // D1.H0
    public final C5523e k() {
        if (this.f3215e == null) {
            WindowInsets windowInsets = this.f3213c;
            this.f3215e = C5523e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3215e;
    }

    @Override // D1.H0
    public J0 m(int i10, int i11, int i12, int i13) {
        A0 a02;
        J0 g10 = J0.g(null, this.f3213c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            a02 = new z0(g10);
        } else if (i14 >= 29) {
            a02 = new y0(g10);
        } else {
            a02 = new x0(g10);
        }
        a02.g(J0.e(k(), i10, i11, i12, i13));
        a02.e(J0.e(i(), i10, i11, i12, i13));
        return a02.b();
    }

    @Override // D1.H0
    public boolean o() {
        return this.f3213c.isRound();
    }

    @Override // D1.H0
    @SuppressLint({"WrongConstant"})
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0 && !x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // D1.H0
    public void q(C5523e[] c5523eArr) {
        this.f3214d = c5523eArr;
    }

    @Override // D1.H0
    public void r(J0 j02) {
        this.f3216f = j02;
    }

    public C5523e u(int i10, boolean z10) {
        int i11;
        C0359k c0359k;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (i10 != 1) {
            C5523e c5523e = null;
            if (i10 != 2) {
                C5523e c5523e2 = C5523e.f45105e;
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 != 128) {
                                    return c5523e2;
                                }
                                J0 j02 = this.f3216f;
                                if (j02 != null) {
                                    c0359k = j02.f3232a.e();
                                } else {
                                    c0359k = e();
                                }
                                if (c0359k != null) {
                                    int i16 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = c0359k.f3274a;
                                    if (i16 >= 28) {
                                        i12 = AbstractC0355i.d(displayCutout);
                                    } else {
                                        i12 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i13 = AbstractC0355i.f(displayCutout);
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i14 = AbstractC0355i.e(displayCutout);
                                    } else {
                                        i14 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i15 = AbstractC0355i.c(displayCutout);
                                    }
                                    return C5523e.b(i12, i13, i14, i15);
                                }
                                return c5523e2;
                            }
                            return l();
                        }
                        return h();
                    }
                    return j();
                }
                C5523e[] c5523eArr = this.f3214d;
                if (c5523eArr != null) {
                    c5523e = c5523eArr[r9.y.B0(8)];
                }
                if (c5523e != null) {
                    return c5523e;
                }
                C5523e k10 = k();
                C5523e v10 = v();
                int i17 = k10.f45109d;
                if (i17 > v10.f45109d) {
                    return C5523e.b(0, 0, 0, i17);
                }
                C5523e c5523e3 = this.f3217g;
                if (c5523e3 != null && !c5523e3.equals(c5523e2) && (i11 = this.f3217g.f45109d) > v10.f45109d) {
                    return C5523e.b(0, 0, 0, i11);
                }
                return c5523e2;
            } else if (z10) {
                C5523e v11 = v();
                C5523e i18 = i();
                return C5523e.b(Math.max(v11.f45106a, i18.f45106a), 0, Math.max(v11.f45108c, i18.f45108c), Math.max(v11.f45109d, i18.f45109d));
            } else {
                C5523e k11 = k();
                J0 j03 = this.f3216f;
                if (j03 != null) {
                    c5523e = j03.f3232a.i();
                }
                int i19 = k11.f45109d;
                if (c5523e != null) {
                    i19 = Math.min(i19, c5523e.f45109d);
                }
                return C5523e.b(k11.f45106a, 0, k11.f45108c, i19);
            }
        } else if (z10) {
            return C5523e.b(0, Math.max(v().f45107b, k().f45107b), 0, 0);
        } else {
            return C5523e.b(0, k().f45107b, 0, 0);
        }
    }

    public boolean x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !u(i10, false).equals(C5523e.f45105e);
    }

    public void z(C5523e c5523e) {
        this.f3217g = c5523e;
    }
}
