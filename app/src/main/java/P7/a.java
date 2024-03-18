package P7;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import k2.C4155a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f13838a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final k2.b f13839b = new k2.b();

    /* renamed from: c  reason: collision with root package name */
    public static final C4155a f13840c = new C4155a();

    /* renamed from: d  reason: collision with root package name */
    public static final k2.c f13841d = new k2.c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f10, float f11) {
        return AbstractC6463a.d(f10, f6, f11, f6);
    }

    public static float b(float f6, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f6;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f6, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f6, int i10, int i11) {
        return Math.round(f6 * (i11 - i10)) + i10;
    }
}
