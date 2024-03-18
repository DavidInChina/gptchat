package V1;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final X f18113a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Z f18114b;

    /* JADX WARN: Type inference failed for: r0v0, types: [V1.X, java.lang.Object] */
    static {
        Z z10;
        try {
            z10 = (Z) G3.n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            z10 = null;
        }
        f18114b = z10;
    }

    public static final void a(int i10, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
