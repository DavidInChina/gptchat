package F;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f4901Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(int i10, int i11) {
        super(0);
        this.f4900Y = i10;
        this.f4901Z = i11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new J(this.f4900Y, this.f4901Z);
    }
}
