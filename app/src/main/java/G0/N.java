package G0;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class N extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ O f5645Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f5646Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, long j6) {
        super(0);
        this.f5645Y = o10;
        this.f5646Z = j6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        T E02 = this.f5645Y.a().E0();
        AbstractC3557B.Z(E02);
        ((C0594x) E02).o(this.f5646Z);
        return jf.y.f36177a;
    }
}
