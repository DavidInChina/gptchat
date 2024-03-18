package D1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import s1.C5523e;

/* loaded from: classes2.dex */
public final class x0 extends A0 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f3317e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3318f;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f3319g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f3320h;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f3321c;

    /* renamed from: d  reason: collision with root package name */
    public C5523e f3322d;

    public x0() {
        this.f3321c = i();
    }

    private static WindowInsets i() {
        if (!f3318f) {
            try {
                f3317e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f3318f = true;
        }
        Field field = f3317e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f3320h) {
            try {
                f3319g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f3320h = true;
        }
        Constructor constructor = f3319g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // D1.A0
    public J0 b() {
        a();
        J0 g10 = J0.g(null, this.f3321c);
        C5523e[] c5523eArr = this.f3205b;
        H0 h02 = g10.f3232a;
        h02.q(c5523eArr);
        h02.s(this.f3322d);
        return g10;
    }

    @Override // D1.A0
    public void e(C5523e c5523e) {
        this.f3322d = c5523e;
    }

    @Override // D1.A0
    public void g(C5523e c5523e) {
        WindowInsets windowInsets = this.f3321c;
        if (windowInsets != null) {
            this.f3321c = windowInsets.replaceSystemWindowInsets(c5523e.f45106a, c5523e.f45107b, c5523e.f45108c, c5523e.f45109d);
        }
    }

    public x0(J0 j02) {
        super(j02);
        this.f3321c = j02.f();
    }
}
