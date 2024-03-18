package m;

import D1.C0358j0;
import D1.Z;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: m.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4541v implements androidx.appcompat.view.b {

    /* renamed from: Y  reason: collision with root package name */
    public final androidx.appcompat.view.b f38795Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38796Z;

    public C4541v(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, U3.i iVar) {
        this.f38796Z = layoutInflater$Factory2C4511H;
        this.f38795Y = iVar;
    }

    @Override // androidx.appcompat.view.b
    public final void d(androidx.appcompat.view.c cVar) {
        this.f38795Y.d(cVar);
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38796Z;
        if (layoutInflater$Factory2C4511H.f38617B0 != null) {
            layoutInflater$Factory2C4511H.f38655q0.getDecorView().removeCallbacks(layoutInflater$Factory2C4511H.f38618C0);
        }
        if (layoutInflater$Factory2C4511H.f38616A0 != null) {
            C0358j0 c0358j0 = layoutInflater$Factory2C4511H.f38619D0;
            if (c0358j0 != null) {
                c0358j0.b();
            }
            C0358j0 a5 = Z.a(layoutInflater$Factory2C4511H.f38616A0);
            a5.a(0.0f);
            layoutInflater$Factory2C4511H.f38619D0 = a5;
            a5.d(new C4540u(2, this));
        }
        layoutInflater$Factory2C4511H.f38664z0 = null;
        ViewGroup viewGroup = layoutInflater$Factory2C4511H.f38622G0;
        WeakHashMap weakHashMap = Z.f3247a;
        D1.L.c(viewGroup);
        layoutInflater$Factory2C4511H.J();
    }

    @Override // androidx.appcompat.view.b
    public final boolean j(androidx.appcompat.view.c cVar, p.o oVar) {
        return this.f38795Y.j(cVar, oVar);
    }

    @Override // androidx.appcompat.view.b
    public final boolean l(androidx.appcompat.view.c cVar, p.o oVar) {
        ViewGroup viewGroup = this.f38796Z.f38622G0;
        WeakHashMap weakHashMap = Z.f3247a;
        D1.L.c(viewGroup);
        return this.f38795Y.l(cVar, oVar);
    }

    @Override // androidx.appcompat.view.b
    public final boolean m(androidx.appcompat.view.c cVar, MenuItem menuItem) {
        return this.f38795Y.m(cVar, menuItem);
    }
}
