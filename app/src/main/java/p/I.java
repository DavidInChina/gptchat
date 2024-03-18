package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class I extends o implements SubMenu {

    /* renamed from: A  reason: collision with root package name */
    public final q f41530A;

    /* renamed from: z  reason: collision with root package name */
    public final o f41531z;

    public I(Context context, o oVar, q qVar) {
        super(context);
        this.f41531z = oVar;
        this.f41530A = qVar;
    }

    @Override // p.o
    public final boolean d(q qVar) {
        return this.f41531z.d(qVar);
    }

    @Override // p.o
    public final boolean e(o oVar, MenuItem menuItem) {
        if (!super.e(oVar, menuItem) && !this.f41531z.e(oVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // p.o
    public final boolean f(q qVar) {
        return this.f41531z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f41530A;
    }

    @Override // p.o
    public final String j() {
        int i10;
        q qVar = this.f41530A;
        if (qVar != null) {
            i10 = qVar.f41635a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return android.gov.nist.core.a.e("android:menu:actionviewstates:", i10);
    }

    @Override // p.o
    public final o k() {
        return this.f41531z.k();
    }

    @Override // p.o
    public final boolean m() {
        return this.f41531z.m();
    }

    @Override // p.o
    public final boolean n() {
        return this.f41531z.n();
    }

    @Override // p.o
    public final boolean o() {
        return this.f41531z.o();
    }

    @Override // p.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f41531z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f41530A.setIcon(drawable);
        return this;
    }

    @Override // p.o, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f41531z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f41530A.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}
