package m;

import D1.Z;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class U extends AbstractC4828h {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f38694p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ W f38695q;

    public U(W w10, int i10) {
        this.f38694p = i10;
        this.f38695q = w10;
    }

    @Override // D1.AbstractC0360k0
    public final void d() {
        View view;
        int i10 = this.f38694p;
        W w10 = this.f38695q;
        switch (i10) {
            case 0:
                if (w10.f38726z && (view = w10.f38718r) != null) {
                    view.setTranslationY(0.0f);
                    w10.f38715o.setTranslationY(0.0f);
                }
                w10.f38715o.setVisibility(8);
                w10.f38715o.setTransitioning(false);
                w10.f38706D = null;
                androidx.appcompat.view.b bVar = w10.f38722v;
                if (bVar != null) {
                    bVar.d(w10.f38721u);
                    w10.f38721u = null;
                    w10.f38722v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = w10.f38714n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.L.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                w10.f38706D = null;
                w10.f38715o.requestLayout();
                return;
        }
    }
}
