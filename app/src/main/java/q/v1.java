package q;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v1 implements p.C {

    /* renamed from: Y  reason: collision with root package name */
    public p.o f43570Y;

    /* renamed from: Z  reason: collision with root package name */
    public p.q f43571Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Toolbar f43572h0;

    public v1(Toolbar toolbar) {
        this.f43572h0 = toolbar;
    }

    @Override // p.C
    public final void c(Context context, p.o oVar) {
        p.q qVar;
        p.o oVar2 = this.f43570Y;
        if (oVar2 != null && (qVar = this.f43571Z) != null) {
            oVar2.d(qVar);
        }
        this.f43570Y = oVar;
    }

    @Override // p.C
    public final boolean d() {
        return false;
    }

    @Override // p.C
    public final void g() {
        if (this.f43571Z != null) {
            p.o oVar = this.f43570Y;
            if (oVar != null) {
                int size = oVar.f41610f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f43570Y.getItem(i10) == this.f43571Z) {
                        return;
                    }
                }
            }
            k(this.f43571Z);
        }
    }

    @Override // p.C
    public final boolean i(p.I i10) {
        return false;
    }

    @Override // p.C
    public final boolean j(p.q qVar) {
        Toolbar toolbar = this.f43572h0;
        toolbar.c();
        ViewParent parent = toolbar.f24605o0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f24605o0);
            }
            toolbar.addView(toolbar.f24605o0);
        }
        View actionView = qVar.getActionView();
        toolbar.f24606p0 = actionView;
        this.f43571Z = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f24606p0);
            }
            w1 h10 = Toolbar.h();
            h10.f38727a = (toolbar.f24611u0 & 112) | 8388611;
            h10.f43583b = 2;
            toolbar.f24606p0.setLayoutParams(h10);
            toolbar.addView(toolbar.f24606p0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((w1) childAt.getLayoutParams()).f43583b != 2 && childAt != toolbar.f24598h0) {
                toolbar.removeViewAt(childCount);
                toolbar.f24585L0.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.f41634C = true;
        qVar.f41648n.p(false);
        View view = toolbar.f24606p0;
        if (view instanceof androidx.appcompat.view.d) {
            ((androidx.appcompat.view.d) view).c();
        }
        toolbar.v();
        return true;
    }

    @Override // p.C
    public final boolean k(p.q qVar) {
        Toolbar toolbar = this.f43572h0;
        View view = toolbar.f24606p0;
        if (view instanceof androidx.appcompat.view.d) {
            ((androidx.appcompat.view.d) view).e();
        }
        toolbar.removeView(toolbar.f24606p0);
        toolbar.removeView(toolbar.f24605o0);
        toolbar.f24606p0 = null;
        ArrayList arrayList = toolbar.f24585L0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f43571Z = null;
        toolbar.requestLayout();
        qVar.f41634C = false;
        qVar.f41648n.p(false);
        toolbar.v();
        return true;
    }

    @Override // p.C
    public final void b(p.o oVar, boolean z10) {
    }
}
