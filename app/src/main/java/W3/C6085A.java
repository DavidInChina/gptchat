package w3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: w3.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6085A extends M {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f47734a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f47735b = new b0(this);

    /* renamed from: c  reason: collision with root package name */
    public C6116x f47736c;

    /* renamed from: d  reason: collision with root package name */
    public C6116x f47737d;

    public static int b(View view, AbstractC6117y abstractC6117y) {
        return ((abstractC6117y.c(view) / 2) + abstractC6117y.d(view)) - ((abstractC6117y.g() / 2) + abstractC6117y.f());
    }

    public static View c(K k10, AbstractC6117y abstractC6117y) {
        int v10 = k10.v();
        View view = null;
        if (v10 == 0) {
            return null;
        }
        int g10 = (abstractC6117y.g() / 2) + abstractC6117y.f();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < v10; i11++) {
            View u10 = k10.u(i11);
            int abs = Math.abs(((abstractC6117y.c(u10) / 2) + abstractC6117y.d(u10)) - g10);
            if (abs < i10) {
                view = u10;
                i10 = abs;
            }
        }
        return view;
    }

    public final int[] a(K k10, View view) {
        int[] iArr = new int[2];
        if (k10.d()) {
            iArr[0] = b(view, d(k10));
        } else {
            iArr[0] = 0;
        }
        if (k10.e()) {
            iArr[1] = b(view, e(k10));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final AbstractC6117y d(K k10) {
        C6116x c6116x = this.f47737d;
        if (c6116x == null || c6116x.f48009a != k10) {
            this.f47737d = new C6116x(k10, 0);
        }
        return this.f47737d;
    }

    public final AbstractC6117y e(K k10) {
        C6116x c6116x = this.f47736c;
        if (c6116x == null || c6116x.f48009a != k10) {
            this.f47736c = new C6116x(k10, 1);
        }
        return this.f47736c;
    }

    public final void f() {
        K layoutManager;
        View view;
        RecyclerView recyclerView = this.f47734a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a5 = a(layoutManager, view);
                int i10 = a5[0];
                if (i10 != 0 || a5[1] != 0) {
                    this.f47734a.b0(i10, a5[1], false);
                }
            }
        }
    }
}
