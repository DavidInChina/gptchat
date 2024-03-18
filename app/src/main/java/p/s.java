package p;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: c  reason: collision with root package name */
    public F4.a f41663c;

    @Override // p.r
    public final boolean a() {
        return this.f41661a.isVisible();
    }

    @Override // p.r
    public final View b(MenuItem menuItem) {
        return this.f41661a.onCreateActionView(menuItem);
    }

    @Override // p.r
    public final boolean c() {
        return this.f41661a.overridesItemVisibility();
    }

    @Override // p.r
    public final void d(F4.a aVar) {
        this.f41663c = aVar;
        this.f41661a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        F4.a aVar = this.f41663c;
        if (aVar != null) {
            o oVar = ((q) aVar.f5033Z).f41648n;
            oVar.f41612h = true;
            oVar.p(true);
        }
    }
}
