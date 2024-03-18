package fc;

import Z.AbstractC1708e0;
import Z.U0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30230Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f30231Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Vc.A f30232h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f30233i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10, wf.k kVar, Vc.A a5, AbstractC1708e0 abstractC1708e0) {
        super(0);
        this.f30230Y = i10;
        this.f30231Z = kVar;
        this.f30232h0 = a5;
        this.f30233i0 = abstractC1708e0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        ((U0) this.f30233i0).i(this.f30230Y);
        this.f30231Z.invoke(new C3016k(this.f30232h0));
        return jf.y.f36177a;
    }
}
