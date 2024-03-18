package w3;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f47877a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f47878b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f47879c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f47880d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f47881e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f47882f;

    public g0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f47882f = staggeredGridLayoutManager;
        this.f47881e = i10;
    }

    public final void a() {
        ArrayList arrayList = this.f47877a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f47879c = this.f47882f.f25500r.b(view);
        ((d0) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.f47877a.clear();
        this.f47878b = Integer.MIN_VALUE;
        this.f47879c = Integer.MIN_VALUE;
        this.f47880d = 0;
    }

    public final int c() {
        boolean z10 = this.f47882f.f25505w;
        ArrayList arrayList = this.f47877a;
        if (z10) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z10 = this.f47882f.f25505w;
        ArrayList arrayList = this.f47877a;
        if (z10) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i10, int i11) {
        int i12;
        boolean z10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f47882f;
        int f6 = staggeredGridLayoutManager.f25500r.f();
        int e10 = staggeredGridLayoutManager.f25500r.e();
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View view = (View) this.f47877a.get(i10);
            int d10 = staggeredGridLayoutManager.f25500r.d(view);
            int b10 = staggeredGridLayoutManager.f25500r.b(view);
            boolean z11 = false;
            if (d10 <= e10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b10 >= f6) {
                z11 = true;
            }
            if (z10 && z11 && (d10 < f6 || b10 > e10)) {
                return K.F(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f47879c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f47877a.size() == 0) {
            return i10;
        }
        a();
        return this.f47879c;
    }

    public final View g(int i10, int i11) {
        ArrayList arrayList = this.f47877a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f47882f;
        View view = null;
        if (i11 == -1) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                View view2 = (View) arrayList.get(i12);
                if ((staggeredGridLayoutManager.f25505w && K.F(view2) <= i10) || ((!staggeredGridLayoutManager.f25505w && K.F(view2) >= i10) || !view2.hasFocusable())) {
                    break;
                }
                i12++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.f25505w && K.F(view3) >= i10) || ((!staggeredGridLayoutManager.f25505w && K.F(view3) <= i10) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i10) {
        int i11 = this.f47878b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f47877a.size() == 0) {
            return i10;
        }
        View view = (View) this.f47877a.get(0);
        this.f47878b = this.f47882f.f25500r.d(view);
        ((d0) view.getLayoutParams()).getClass();
        return this.f47878b;
    }
}
