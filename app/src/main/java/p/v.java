package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f41667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f41668b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f41668b = wVar;
        this.f41667a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f41667a.onMenuItemClick(this.f41668b.f(menuItem));
    }
}
