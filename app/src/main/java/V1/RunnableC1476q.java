package V1;

import android.view.ViewGroup;

/* renamed from: V1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1476q implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18240Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1480v f18241Z;

    public /* synthetic */ RunnableC1476q(int i10, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        this.f18240Y = i10;
        this.f18241Z = abstractComponentCallbacksC1480v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        K k10;
        int i10 = this.f18240Y;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18241Z;
        switch (i10) {
            case 0:
                if (abstractComponentCallbacksC1480v.f18272M0 != null) {
                    abstractComponentCallbacksC1480v.j().getClass();
                    return;
                }
                return;
            default:
                if (abstractComponentCallbacksC1480v.f18269J0 != null && (viewGroup = abstractComponentCallbacksC1480v.f18268I0) != null && (k10 = abstractComponentCallbacksC1480v.f18302w0) != null) {
                    C1471l l10 = C1471l.l(viewGroup, k10);
                    l10.m();
                    l10.h();
                    return;
                }
                return;
        }
    }
}
