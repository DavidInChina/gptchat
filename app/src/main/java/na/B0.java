package na;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class B0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39705Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f39706Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f39707h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f39708i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(int i10, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, boolean z10) {
        super(0);
        this.f39705Y = i10;
        this.f39706Z = abstractC6216a;
        this.f39707h0 = z10;
        this.f39708i0 = abstractC6216a2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        AbstractC6216a abstractC6216a = this.f39706Z;
        boolean z10 = this.f39707h0;
        AbstractC6216a abstractC6216a2 = this.f39708i0;
        int i10 = this.f39705Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        abstractC6216a.mo122invoke();
                        if (!z10) {
                            abstractC6216a2.mo122invoke();
                            break;
                        }
                        break;
                    default:
                        abstractC6216a.mo122invoke();
                        if (z10) {
                            abstractC6216a2.mo122invoke();
                            break;
                        }
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        abstractC6216a.mo122invoke();
                        if (!z10) {
                            abstractC6216a2.mo122invoke();
                            break;
                        }
                        break;
                    default:
                        abstractC6216a.mo122invoke();
                        if (z10) {
                            abstractC6216a2.mo122invoke();
                            break;
                        }
                        break;
                }
                return yVar;
        }
    }
}
