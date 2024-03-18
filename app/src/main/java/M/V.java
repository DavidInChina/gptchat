package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q.C5222m;

/* loaded from: classes2.dex */
public final class V extends androidx.appcompat.view.c implements p.m {

    /* renamed from: h0  reason: collision with root package name */
    public final Context f38696h0;

    /* renamed from: i0  reason: collision with root package name */
    public final p.o f38697i0;

    /* renamed from: j0  reason: collision with root package name */
    public androidx.appcompat.view.b f38698j0;

    /* renamed from: k0  reason: collision with root package name */
    public WeakReference f38699k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ W f38700l0;

    public V(W w10, Context context, C4541v c4541v) {
        this.f38700l0 = w10;
        this.f38696h0 = context;
        this.f38698j0 = c4541v;
        p.o oVar = new p.o(context);
        oVar.f41616l = 1;
        this.f38697i0 = oVar;
        oVar.f41609e = this;
    }

    @Override // androidx.appcompat.view.c
    public final void a() {
        W w10 = this.f38700l0;
        if (w10.f38720t != this) {
            return;
        }
        if (w10.f38703A) {
            w10.f38721u = this;
            w10.f38722v = this.f38698j0;
        } else {
            this.f38698j0.d(this);
        }
        this.f38698j0 = null;
        w10.o1(false);
        ActionBarContextView actionBarContextView = w10.f38717q;
        if (actionBarContextView.f24468r0 == null) {
            actionBarContextView.e();
        }
        w10.f38714n.setHideOnContentScrollEnabled(w10.f38708F);
        w10.f38720t = null;
    }

    @Override // androidx.appcompat.view.c
    public final View b() {
        WeakReference weakReference = this.f38699k0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.c
    public final p.o c() {
        return this.f38697i0;
    }

    @Override // androidx.appcompat.view.c
    public final MenuInflater d() {
        return new androidx.appcompat.view.k(this.f38696h0);
    }

    @Override // androidx.appcompat.view.c
    public final CharSequence e() {
        return this.f38700l0.f38717q.getSubtitle();
    }

    @Override // androidx.appcompat.view.c
    public final CharSequence f() {
        return this.f38700l0.f38717q.getTitle();
    }

    @Override // androidx.appcompat.view.c
    public final void g() {
        if (this.f38700l0.f38720t != this) {
            return;
        }
        p.o oVar = this.f38697i0;
        oVar.w();
        try {
            this.f38698j0.l(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // androidx.appcompat.view.c
    public final boolean h() {
        return this.f38700l0.f38717q.f24476z0;
    }

    @Override // p.m
    public final boolean i(p.o oVar, MenuItem menuItem) {
        androidx.appcompat.view.b bVar = this.f38698j0;
        if (bVar != null) {
            return bVar.m(this, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.c
    public final void j(View view) {
        this.f38700l0.f38717q.setCustomView(view);
        this.f38699k0 = new WeakReference(view);
    }

    @Override // androidx.appcompat.view.c
    public final void k(int i10) {
        l(this.f38700l0.f38712l.getResources().getString(i10));
    }

    @Override // androidx.appcompat.view.c
    public final void l(CharSequence charSequence) {
        this.f38700l0.f38717q.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.c
    public final void m(int i10) {
        n(this.f38700l0.f38712l.getResources().getString(i10));
    }

    @Override // androidx.appcompat.view.c
    public final void n(CharSequence charSequence) {
        this.f38700l0.f38717q.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.c
    public final void o(boolean z10) {
        this.f24353Z = z10;
        this.f38700l0.f38717q.setTitleOptional(z10);
    }

    @Override // p.m
    public final void w(p.o oVar) {
        if (this.f38698j0 == null) {
            return;
        }
        g();
        C5222m c5222m = this.f38700l0.f38717q.f24461k0;
        if (c5222m != null) {
            c5222m.l();
        }
    }
}
