package m;

import android.window.OnBackInvokedCallback;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f38798b;

    public /* synthetic */ z(int i10, Object obj) {
        this.f38797a = i10;
        this.f38798b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f38797a) {
            case 0:
                ((LayoutInflater$Factory2C4511H) this.f38798b).E();
                return;
            default:
                ((Runnable) this.f38798b).run();
                return;
        }
    }
}
