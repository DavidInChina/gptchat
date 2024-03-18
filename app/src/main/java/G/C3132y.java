package g;

import android.window.OnBackInvokedCallback;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: g.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3132y {

    /* renamed from: a  reason: collision with root package name */
    public static final C3132y f31009a = new Object();

    public final OnBackInvokedCallback a(wf.k kVar, wf.k kVar2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2) {
        AbstractC3557B.c0("onBackStarted", kVar);
        AbstractC3557B.c0("onBackProgressed", kVar2);
        AbstractC3557B.c0("onBackInvoked", abstractC6216a);
        AbstractC3557B.c0("onBackCancelled", abstractC6216a2);
        return new C3131x(kVar, kVar2, abstractC6216a, abstractC6216a2);
    }
}
