package R7;

import D1.H;
import D1.I;
import D1.Z;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.X;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends N {

    /* renamed from: g  reason: collision with root package name */
    public int f15127g;

    /* renamed from: h  reason: collision with root package name */
    public int f15128h = -1;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f15129i;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15129i = swipeDismissBehavior;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final boolean C0(View view, int i10) {
        int i11 = this.f15128h;
        if ((i11 == -1 || i11 == i10) && this.f15129i.r(view)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int b0(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void g0(View view, int i10) {
        this.f15128h = i10;
        this.f15127g = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f15129i;
            swipeDismissBehavior.f27013c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f27013c = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int h(View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        int width;
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f15129i.f27014d;
        if (i13 == 0) {
            if (z10) {
                i12 = this.f15127g - view.getWidth();
                i11 = this.f15127g;
            } else {
                i12 = this.f15127g;
                width = view.getWidth();
                i11 = width + i12;
            }
        } else if (i13 == 1) {
            if (z10) {
                i12 = this.f15127g;
                width = view.getWidth();
                i11 = width + i12;
            } else {
                i12 = this.f15127g - view.getWidth();
                i11 = this.f15127g;
            }
        } else {
            i12 = this.f15127g - view.getWidth();
            i11 = view.getWidth() + this.f15127g;
        }
        return Math.min(Math.max(i12, i10), i11);
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void h0(int i10) {
        this.f15129i.getClass();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int i(View view, int i10) {
        return view.getTop();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void i0(View view, int i10, int i11) {
        SwipeDismissBehavior swipeDismissBehavior = this.f15129i;
        float width = view.getWidth() * swipeDismissBehavior.f27016f;
        float width2 = view.getWidth() * swipeDismissBehavior.f27017g;
        float abs = Math.abs(i10 - this.f15127g);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.f15127g) >= java.lang.Math.round(r9.getWidth() * r3.f27015e)) goto L22;
     */
    @Override // com.google.android.gms.internal.play_billing.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(View view, float f6, float f10) {
        int i10;
        boolean z10;
        this.f15128h = -1;
        int width = view.getWidth();
        int i11 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        boolean z11 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f15129i;
        if (i11 != 0) {
            WeakHashMap weakHashMap = Z.f3247a;
            if (I.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = swipeDismissBehavior.f27014d;
            if (i12 != 2) {
                if (i12 == 0) {
                    i10 = this.f15127g;
                    z11 = false;
                } else {
                    i10 = this.f15127g;
                    z11 = false;
                }
            }
            if (f6 >= 0.0f) {
                int left = view.getLeft();
                int i13 = this.f15127g;
                if (left >= i13) {
                    i10 = i13 + width;
                }
            }
            i10 = this.f15127g - width;
        }
        if (swipeDismissBehavior.f27011a.o(i10, view.getTop())) {
            X x10 = new X(swipeDismissBehavior, view, z11);
            WeakHashMap weakHashMap2 = Z.f3247a;
            H.m(view, x10);
        }
    }
}
