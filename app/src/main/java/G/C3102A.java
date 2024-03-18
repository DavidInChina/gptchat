package g;

import id.AbstractC3557B;
import kf.C4288m;
import wf.AbstractC6216a;

/* renamed from: g.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3102A implements AbstractC3110c {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC3126s f30925Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3104C f30926Z;

    public C3102A(C3104C c3104c, AbstractC3126s abstractC3126s) {
        AbstractC3557B.c0("onBackPressedCallback", abstractC3126s);
        this.f30926Z = c3104c;
        this.f30925Y = abstractC3126s;
    }

    @Override // g.AbstractC3110c
    public final void cancel() {
        C3104C c3104c = this.f30926Z;
        C4288m c4288m = c3104c.f30929b;
        AbstractC3126s abstractC3126s = this.f30925Y;
        c4288m.remove(abstractC3126s);
        if (AbstractC3557B.K(c3104c.f30930c, abstractC3126s)) {
            abstractC3126s.getClass();
            c3104c.f30930c = null;
        }
        abstractC3126s.getClass();
        abstractC3126s.f30996b.remove(this);
        AbstractC6216a abstractC6216a = abstractC3126s.f30997c;
        if (abstractC6216a != null) {
            abstractC6216a.mo122invoke();
        }
        abstractC3126s.f30997c = null;
    }
}
