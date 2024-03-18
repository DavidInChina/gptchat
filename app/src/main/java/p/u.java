package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class u implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f41665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f41666b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f41666b = wVar;
        this.f41665a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f41665a.onMenuItemActionCollapse(this.f41666b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f41665a.onMenuItemActionExpand(this.f41666b.f(menuItem));
    }
}
