package m1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: m1.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4550g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f38869a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f38870b = new ThreadLocal();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
