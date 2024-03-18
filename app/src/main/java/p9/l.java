package p9;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final l f42794Z = new l(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final l f42795h0 = new l(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42796Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10) {
        super(0);
        this.f42796Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f42796Y) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalActivity not present".toString());
            default:
                return Af.d.f840Y;
        }
    }
}
