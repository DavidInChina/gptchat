package ee;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29364Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2881B f29365Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(C2881B c2881b, int i10) {
        super(0);
        this.f29364Y = i10;
        this.f29365Z = c2881b;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        C2881B c2881b = this.f29365Z;
        int i10 = this.f29364Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return (Float) c2881b.a().e();
                    default:
                        return (Float) c2881b.b().e();
                }
            default:
                switch (i10) {
                    case 0:
                        return (Float) c2881b.a().e();
                    default:
                        return (Float) c2881b.b().e();
                }
        }
    }
}
