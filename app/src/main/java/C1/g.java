package c1;

import A.AbstractC0044t0;
import E0.N;
import E0.O;
import E0.P;
import G0.g0;
import android.view.View;
import android.view.ViewGroup;
import d1.C2567b;
import d1.C2584s;
import id.AbstractC3557B;
import java.util.List;
import kf.w;

/* loaded from: classes2.dex */
public final class g implements N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f26053b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f26054c;

    public /* synthetic */ g(ViewGroup viewGroup, Object obj, int i10) {
        this.f26052a = i10;
        this.f26053b = viewGroup;
        this.f26054c = obj;
    }

    @Override // E0.N
    public final O a(P p10, List list, long j6) {
        w wVar = w.f37484Y;
        int i10 = this.f26052a;
        Object obj = this.f26054c;
        ViewGroup viewGroup = this.f26053b;
        switch (i10) {
            case 0:
                l lVar = (l) viewGroup;
                if (lVar.getChildCount() == 0) {
                    return p10.j0(Z0.a.j(j6), Z0.a.i(j6), wVar, e.f26045h0);
                }
                if (Z0.a.j(j6) != 0) {
                    lVar.getChildAt(0).setMinimumWidth(Z0.a.j(j6));
                }
                if (Z0.a.i(j6) != 0) {
                    lVar.getChildAt(0).setMinimumHeight(Z0.a.i(j6));
                }
                int j10 = Z0.a.j(j6);
                int h10 = Z0.a.h(j6);
                ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
                AbstractC3557B.Z(layoutParams);
                int k10 = l.k(lVar, j10, h10, layoutParams.width);
                int i11 = Z0.a.i(j6);
                int g10 = Z0.a.g(j6);
                ViewGroup.LayoutParams layoutParams2 = lVar.getLayoutParams();
                AbstractC3557B.Z(layoutParams2);
                lVar.measure(k10, l.k(lVar, i11, g10, layoutParams2.height));
                return p10.j0(lVar.getMeasuredWidth(), lVar.getMeasuredHeight(), wVar, new f(lVar, (androidx.compose.ui.node.a) obj, 1));
            default:
                ((C2584s) viewGroup).setParentLayoutDirection((Z0.l) obj);
                return p10.j0(0, 0, wVar, C2567b.f27849i0);
        }
    }

    @Override // E0.N
    public final int b(g0 g0Var, List list, int i10) {
        switch (this.f26052a) {
            case 0:
                return g(i10);
            default:
                return AbstractC0044t0.d(this, g0Var, list, i10);
        }
    }

    @Override // E0.N
    public final int c(g0 g0Var, List list, int i10) {
        switch (this.f26052a) {
            case 0:
                return f(i10);
            default:
                return AbstractC0044t0.f(this, g0Var, list, i10);
        }
    }

    @Override // E0.N
    public final int d(g0 g0Var, List list, int i10) {
        switch (this.f26052a) {
            case 0:
                return g(i10);
            default:
                return AbstractC0044t0.h(this, g0Var, list, i10);
        }
    }

    @Override // E0.N
    public final int e(g0 g0Var, List list, int i10) {
        switch (this.f26052a) {
            case 0:
                return f(i10);
            default:
                return AbstractC0044t0.b(this, g0Var, list, i10);
        }
    }

    public final int f(int i10) {
        ViewGroup viewGroup = this.f26053b;
        ViewGroup.LayoutParams layoutParams = ((l) viewGroup).getLayoutParams();
        AbstractC3557B.Z(layoutParams);
        ((l) viewGroup).measure(l.k((l) viewGroup, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ((l) viewGroup).getMeasuredHeight();
    }

    public final int g(int i10) {
        ViewGroup viewGroup = this.f26053b;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup.LayoutParams layoutParams = ((l) viewGroup).getLayoutParams();
        AbstractC3557B.Z(layoutParams);
        ((l) viewGroup).measure(makeMeasureSpec, l.k((l) viewGroup, 0, i10, layoutParams.height));
        return ((l) viewGroup).getMeasuredWidth();
    }
}
