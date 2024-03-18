package Q7;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m1.AbstractC4544a;

/* loaded from: classes2.dex */
public abstract class d extends AbstractC4544a {

    /* renamed from: a  reason: collision with root package name */
    public e f14465a;

    /* renamed from: b  reason: collision with root package name */
    public int f14466b = 0;

    public d() {
    }

    @Override // m1.AbstractC4544a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        r(coordinatorLayout, view, i10);
        if (this.f14465a == null) {
            this.f14465a = new e(view);
        }
        e eVar = this.f14465a;
        View view2 = eVar.f14467a;
        eVar.f14468b = view2.getTop();
        eVar.f14469c = view2.getLeft();
        this.f14465a.a();
        int i11 = this.f14466b;
        if (i11 != 0) {
            e eVar2 = this.f14465a;
            if (eVar2.f14470d != i11) {
                eVar2.f14470d = i11;
                eVar2.a();
            }
            this.f14466b = 0;
            return true;
        }
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }

    public d(int i10) {
    }
}
