package H0;

import android.view.ViewTreeObserver;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: H0.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC0691m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f6974Z;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC0691m(int i10, Object obj) {
        this.f6973Y = i10;
        this.f6974Z = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f6973Y;
        Object obj = this.f6974Z;
        switch (i10) {
            case 0:
                ((C0714y) obj).A();
                return;
            default:
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj;
                AbstractC3557B.c0("$callback", abstractC6216a);
                abstractC6216a.mo122invoke();
                return;
        }
    }
}
