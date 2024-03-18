package na;

import Df.AbstractC0408g;
import wf.AbstractC6216a;

/* renamed from: na.y0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4803y0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40151Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f40152Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f40153h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4803y0(AbstractC6216a abstractC6216a, AbstractC0408g abstractC0408g, int i10) {
        super(0);
        this.f40151Y = i10;
        this.f40152Z = abstractC6216a;
        this.f40153h0 = abstractC0408g;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f40151Y;
        AbstractC0408g abstractC0408g = this.f40153h0;
        AbstractC6216a abstractC6216a = this.f40152Z;
        switch (i10) {
            case 0:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(new C4734G(true));
                return;
            case 1:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(Q.f39856a);
                return;
            case 2:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(new M(true));
                return;
            default:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(C4794u.f40121a);
                return;
        }
    }
}
