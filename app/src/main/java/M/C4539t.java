package m;

import android.view.Window;
import q.AbstractC5232r0;

/* renamed from: m.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4539t implements AbstractC5232r0, p.B {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38792Y;

    public /* synthetic */ C4539t(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H) {
        this.f38792Y = layoutInflater$Factory2C4511H;
    }

    @Override // p.B
    public final boolean A(p.o oVar) {
        Window.Callback callback;
        if (oVar == oVar.k()) {
            LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38792Y;
            if (layoutInflater$Factory2C4511H.f38627L0 && (callback = layoutInflater$Factory2C4511H.f38655q0.getCallback()) != null && !layoutInflater$Factory2C4511H.f38638W0) {
                callback.onMenuOpened(108, oVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // p.B
    public final void b(p.o oVar, boolean z10) {
        boolean z11;
        int i10;
        C4510G c4510g;
        p.o k10 = oVar.k();
        int i11 = 0;
        if (k10 != oVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            oVar = k10;
        }
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38792Y;
        C4510G[] c4510gArr = layoutInflater$Factory2C4511H.f38633R0;
        if (c4510gArr != null) {
            i10 = c4510gArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                c4510g = c4510gArr[i11];
                if (c4510g != null && c4510g.f38603h == oVar) {
                    break;
                }
                i11++;
            } else {
                c4510g = null;
                break;
            }
        }
        if (c4510g != null) {
            if (z11) {
                layoutInflater$Factory2C4511H.p(c4510g.f38596a, c4510g, k10);
                layoutInflater$Factory2C4511H.r(c4510g, true);
                return;
            }
            layoutInflater$Factory2C4511H.r(c4510g, z10);
        }
    }
}
