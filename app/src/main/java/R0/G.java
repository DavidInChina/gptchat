package r0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public static final F f44171a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f44172b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static Method f44173c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f44174d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f44175e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f44176f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f44177g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f44178h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f44179i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f44180j = 0;

    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C5353q.f44253a.a(canvas, z10);
            return;
        }
        if (!f44175e) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f44173c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f44174d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f44173c = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f44174d = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f44173c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f44174d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f44175e = true;
        }
        if (z10) {
            try {
                Method method4 = f44173c;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f44174d) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }

    public static final boolean b(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean d(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static final boolean h(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String i(int i10) {
        if (e(i10, 0)) {
            return "Argb8888";
        }
        if (e(i10, 1)) {
            return "Alpha8";
        }
        if (e(i10, 2)) {
            return "Rgb565";
        }
        if (e(i10, 3)) {
            return "F16";
        }
        if (e(i10, 4)) {
            return "Gpu";
        }
        return "Unknown";
    }
}
