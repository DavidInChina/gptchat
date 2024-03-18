package g;

import android.window.OnBackInvokedCallback;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: g.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3129v implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31002a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f31003b;

    public /* synthetic */ C3129v(AbstractC6216a abstractC6216a, int i10) {
        this.f31002a = i10;
        this.f31003b = abstractC6216a;
    }

    public final void onBackInvoked() {
        switch (this.f31002a) {
            case 0:
                AbstractC6216a abstractC6216a = this.f31003b;
                AbstractC3557B.c0("$onBackInvoked", abstractC6216a);
                abstractC6216a.mo122invoke();
                return;
            default:
                this.f31003b.mo122invoke();
                return;
        }
    }
}
