package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: q.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5242w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f43579a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f43580b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f43581c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f43582d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f43579a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f43580b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f43581c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f43582d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
