package g;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: g.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3130w {

    /* renamed from: a  reason: collision with root package name */
    public static final C3130w f31004a = new Object();

    public final OnBackInvokedCallback a(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("onBackInvoked", abstractC6216a);
        return new C3129v(abstractC6216a, 0);
    }

    public final void b(Object obj, int i10, Object obj2) {
        AbstractC3557B.c0("dispatcher", obj);
        AbstractC3557B.c0("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC3557B.c0("dispatcher", obj);
        AbstractC3557B.c0("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
