package I;

import E0.AbstractC0461u;
import G0.AbstractC0579h;
import G0.AbstractC0585n;
import H0.Z;
import android.graphics.Rect;
import android.view.View;
import jf.y;
import nf.AbstractC4825e;
import q0.C5252d;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class n implements d {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC0585n f7941Y;

    public n(AbstractC0585n abstractC0585n) {
        this.f7941Y = abstractC0585n;
    }

    @Override // I.d
    public final Object Q(AbstractC0461u abstractC0461u, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        C5252d c5252d;
        View view = (View) AbstractC0579h.p(this.f7941Y, Z.f6892f);
        long l10 = androidx.compose.ui.layout.a.l(abstractC0461u);
        C5252d c5252d2 = (C5252d) abstractC6216a.mo122invoke();
        if (c5252d2 != null) {
            c5252d = c5252d2.i(l10);
        } else {
            c5252d = null;
        }
        if (c5252d != null) {
            view.requestRectangleOnScreen(new Rect((int) c5252d.f43625a, (int) c5252d.f43626b, (int) c5252d.f43627c, (int) c5252d.f43628d), false);
        }
        return y.f36177a;
    }
}
