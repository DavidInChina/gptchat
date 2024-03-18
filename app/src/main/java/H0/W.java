package H0;

import B0.C0184a;
import android.view.PointerIcon;
import android.view.View;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public static final W f6883a = new Object();

    public final void a(View view, B0.q qVar) {
        PointerIcon pointerIcon;
        PointerIcon pointerIcon2;
        if (qVar instanceof C0184a) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((C0184a) qVar).f1624b);
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        pointerIcon2 = view.getPointerIcon();
        if (!AbstractC3557B.K(pointerIcon2, pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
