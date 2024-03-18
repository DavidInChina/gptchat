package m;

import D1.Z;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import nf.AbstractC4828h;

/* renamed from: m.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4540u extends AbstractC4828h {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f38793p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f38794q;

    public C4540u(int i10, Object obj) {
        this.f38793p = i10;
        this.f38794q = obj;
    }

    @Override // nf.AbstractC4828h, D1.AbstractC0360k0
    public final void c() {
        int i10 = this.f38793p;
        Object obj = this.f38794q;
        switch (i10) {
            case 0:
                ((r) obj).f38790Z.f38616A0.setVisibility(0);
                return;
            case 1:
                LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) obj;
                layoutInflater$Factory2C4511H.f38616A0.setVisibility(0);
                if (layoutInflater$Factory2C4511H.f38616A0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.L.c((View) layoutInflater$Factory2C4511H.f38616A0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // D1.AbstractC0360k0
    public final void d() {
        int i10 = this.f38793p;
        Object obj = this.f38794q;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                rVar.f38790Z.f38616A0.setAlpha(1.0f);
                LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = rVar.f38790Z;
                layoutInflater$Factory2C4511H.f38619D0.d(null);
                layoutInflater$Factory2C4511H.f38619D0 = null;
                return;
            case 1:
                LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H2 = (LayoutInflater$Factory2C4511H) obj;
                layoutInflater$Factory2C4511H2.f38616A0.setAlpha(1.0f);
                layoutInflater$Factory2C4511H2.f38619D0.d(null);
                layoutInflater$Factory2C4511H2.f38619D0 = null;
                return;
            default:
                C4541v c4541v = (C4541v) obj;
                c4541v.f38796Z.f38616A0.setVisibility(8);
                LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H3 = c4541v.f38796Z;
                PopupWindow popupWindow = layoutInflater$Factory2C4511H3.f38617B0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C4511H3.f38616A0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.L.c((View) layoutInflater$Factory2C4511H3.f38616A0.getParent());
                }
                layoutInflater$Factory2C4511H3.f38616A0.e();
                layoutInflater$Factory2C4511H3.f38619D0.d(null);
                layoutInflater$Factory2C4511H3.f38619D0 = null;
                ViewGroup viewGroup = layoutInflater$Factory2C4511H3.f38622G0;
                WeakHashMap weakHashMap2 = Z.f3247a;
                D1.L.c(viewGroup);
                return;
        }
    }
}
