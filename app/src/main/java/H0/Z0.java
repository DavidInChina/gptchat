package H0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Z0 extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6893a;

    public /* synthetic */ Z0(int i10) {
        this.f6893a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f6893a) {
            case 0:
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", view);
                Outline b10 = ((c1) view).f6920l0.b();
                AbstractC3557B.Z(b10);
                outline.set(b10);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
