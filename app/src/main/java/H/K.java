package H;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class K extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6578Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f6579Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6580h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i10, float f6, H h10) {
        super(0);
        this.f6578Y = i10;
        this.f6579Z = f6;
        this.f6580h0 = h10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new I(this.f6578Y, this.f6579Z, this.f6580h0);
    }
}
