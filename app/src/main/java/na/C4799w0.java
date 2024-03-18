package na;

import Df.AbstractC0408g;
import wf.AbstractC6216a;

/* renamed from: na.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4799w0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f40139Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f40140h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ D1 f40141i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4799w0(AbstractC6216a abstractC6216a, AbstractC0408g abstractC0408g, D1 d12, int i10) {
        super(0);
        this.f40138Y = i10;
        this.f40139Z = abstractC6216a;
        this.f40140h0 = abstractC0408g;
        this.f40141i0 = d12;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f40138Y;
        D1 d12 = this.f40141i0;
        AbstractC0408g abstractC0408g = this.f40140h0;
        AbstractC6216a abstractC6216a = this.f40139Z;
        switch (i10) {
            case 0:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(new U(!d12.f39756K));
                return;
            case 1:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(new N(d12.f39759N));
                return;
            default:
                abstractC6216a.mo122invoke();
                ((wf.k) abstractC0408g).invoke(new I(d12.f39759N));
                return;
        }
    }
}
