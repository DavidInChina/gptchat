package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q.C5222m;

/* loaded from: classes.dex */
public final class g extends c implements p.m {

    /* renamed from: h0  reason: collision with root package name */
    public Context f24360h0;

    /* renamed from: i0  reason: collision with root package name */
    public ActionBarContextView f24361i0;

    /* renamed from: j0  reason: collision with root package name */
    public b f24362j0;

    /* renamed from: k0  reason: collision with root package name */
    public WeakReference f24363k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f24364l0;

    /* renamed from: m0  reason: collision with root package name */
    public p.o f24365m0;

    @Override // androidx.appcompat.view.c
    public final void a() {
        if (this.f24364l0) {
            return;
        }
        this.f24364l0 = true;
        this.f24362j0.d(this);
    }

    @Override // androidx.appcompat.view.c
    public final View b() {
        WeakReference weakReference = this.f24363k0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.c
    public final p.o c() {
        return this.f24365m0;
    }

    @Override // androidx.appcompat.view.c
    public final MenuInflater d() {
        return new k(this.f24361i0.getContext());
    }

    @Override // androidx.appcompat.view.c
    public final CharSequence e() {
        return this.f24361i0.getSubtitle();
    }

    @Override // androidx.appcompat.view.c
    public final CharSequence f() {
        return this.f24361i0.getTitle();
    }

    @Override // androidx.appcompat.view.c
    public final void g() {
        this.f24362j0.l(this, this.f24365m0);
    }

    @Override // androidx.appcompat.view.c
    public final boolean h() {
        return this.f24361i0.f24476z0;
    }

    @Override // p.m
    public final boolean i(p.o oVar, MenuItem menuItem) {
        return this.f24362j0.m(this, menuItem);
    }

    @Override // androidx.appcompat.view.c
    public final void j(View view) {
        WeakReference weakReference;
        this.f24361i0.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f24363k0 = weakReference;
    }

    @Override // androidx.appcompat.view.c
    public final void k(int i10) {
        l(this.f24360h0.getString(i10));
    }

    @Override // androidx.appcompat.view.c
    public final void l(CharSequence charSequence) {
        this.f24361i0.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.c
    public final void m(int i10) {
        n(this.f24360h0.getString(i10));
    }

    @Override // androidx.appcompat.view.c
    public final void n(CharSequence charSequence) {
        this.f24361i0.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.c
    public final void o(boolean z10) {
        this.f24353Z = z10;
        this.f24361i0.setTitleOptional(z10);
    }

    @Override // p.m
    public final void w(p.o oVar) {
        g();
        C5222m c5222m = this.f24361i0.f24461k0;
        if (c5222m != null) {
            c5222m.l();
        }
    }
}
