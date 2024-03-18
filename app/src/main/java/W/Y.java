package W;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f19843Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f19844Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f19845h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(float f6, float f10, float f11) {
        super(0);
        this.f19843Y = f6;
        this.f19844Z = f10;
        this.f19845h0 = f11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new o4(this.f19843Y, this.f19844Z, this.f19845h0);
    }
}
