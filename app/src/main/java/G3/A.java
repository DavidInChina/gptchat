package G3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final E f5879a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0599c f5880b;

    /* JADX WARN: Type inference failed for: r0v3, types: [G3.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [G3.E, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f5879a = new Object();
        } else {
            f5879a = new Object();
        }
        f5880b = new C0599c(5, Float.class, "translationAlpha");
        new C0599c(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f5879a.F(view, i10, i11, i12, i13);
    }
}
