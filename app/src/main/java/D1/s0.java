package D1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0366n0 f3298a;

    /* renamed from: b  reason: collision with root package name */
    public List f3299b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f3300c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f3301d = new HashMap();

    public s0(AbstractC0366n0 abstractC0366n0) {
        super(abstractC0366n0.f3276Z);
        this.f3298a = abstractC0366n0;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.f3301d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f3309a = new t0(windowInsetsAnimation);
            }
            this.f3301d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3298a.a(a(windowInsetsAnimation));
        this.f3301d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC0366n0 abstractC0366n0 = this.f3298a;
        a(windowInsetsAnimation);
        abstractC0366n0.b();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f3300c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f3300c = arrayList2;
            this.f3299b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation i10 = AbstractC0379z.i(list.get(size));
            v0 a5 = a(i10);
            fraction = i10.getFraction();
            a5.f3309a.d(fraction);
            this.f3300c.add(a5);
        }
        return this.f3298a.c(J0.g(null, windowInsets), this.f3299b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AbstractC0366n0 abstractC0366n0 = this.f3298a;
        a(windowInsetsAnimation);
        U3.l d10 = abstractC0366n0.d(new U3.l(bounds));
        d10.getClass();
        return t0.e(d10);
    }
}
