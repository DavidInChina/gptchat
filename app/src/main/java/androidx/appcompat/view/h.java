package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p.F;

/* loaded from: classes.dex */
public final class h extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24366a;

    /* renamed from: b  reason: collision with root package name */
    public final c f24367b;

    public h(Context context, c cVar) {
        this.f24366a = context;
        this.f24367b = cVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f24367b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f24367b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new F(this.f24366a, this.f24367b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f24367b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f24367b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f24367b.f24352Y;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f24367b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f24367b.f24353Z;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f24367b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f24367b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f24367b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f24367b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f24367b.f24352Y = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f24367b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f24367b.o(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f24367b.k(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f24367b.m(i10);
    }
}
