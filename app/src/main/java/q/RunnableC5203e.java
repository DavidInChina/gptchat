package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: q.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5203e implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43411Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f43412Z;

    public /* synthetic */ RunnableC5203e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f43411Y = i10;
        this.f43412Z = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43411Y;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f43412Z;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f24481D0 = actionBarOverlayLayout.f24489k0.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f24482E0);
                return;
            default:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f24481D0 = actionBarOverlayLayout.f24489k0.animate().translationY(-actionBarOverlayLayout.f24489k0.getHeight()).setListener(actionBarOverlayLayout.f24482E0);
                return;
        }
    }
}
