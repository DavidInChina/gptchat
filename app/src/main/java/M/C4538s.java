package m;

import android.view.Window;
import q.B0;

/* renamed from: m.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4538s implements B0, p.B {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38791Y;

    public /* synthetic */ C4538s(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H) {
        this.f38791Y = layoutInflater$Factory2C4511H;
    }

    @Override // p.B
    public final boolean A(p.o oVar) {
        Window.Callback callback = this.f38791Y.f38655q0.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, oVar);
            return true;
        }
        return true;
    }

    @Override // p.B
    public final void b(p.o oVar, boolean z10) {
        this.f38791Y.q(oVar);
    }
}
