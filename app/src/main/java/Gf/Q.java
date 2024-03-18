package Gf;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6358Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ W f6359Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(W w10, int i10) {
        super(0);
        this.f6358Y = i10;
        this.f6359Z = w10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6358Y;
        W w10 = this.f6359Z;
        switch (i10) {
            case 0:
                return Cf.k.f(w10.f6371Z);
            default:
                return new U(w10);
        }
    }
}
