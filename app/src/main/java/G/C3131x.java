package g;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: g.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3131x implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wf.k f31005a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wf.k f31006b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f31007c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f31008d;

    public C3131x(wf.k kVar, wf.k kVar2, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2) {
        this.f31005a = kVar;
        this.f31006b = kVar2;
        this.f31007c = abstractC6216a;
        this.f31008d = abstractC6216a2;
    }

    public final void onBackCancelled() {
        this.f31008d.mo122invoke();
    }

    public final void onBackInvoked() {
        this.f31007c.mo122invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        this.f31006b.invoke(new C3109b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC3557B.c0("backEvent", backEvent);
        this.f31005a.invoke(new C3109b(backEvent));
    }
}
