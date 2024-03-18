package L;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class J0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9979Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N0 f9980Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(N0 n02, int i10) {
        super(0);
        this.f9979Y = i10;
        this.f9980Z = n02;
    }

    public final Boolean a() {
        int i10 = this.f9979Y;
        boolean z10 = false;
        N0 n02 = this.f9980Z;
        switch (i10) {
            case 0:
                if (n02.f10005a.h() > 0.0f) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                if (n02.f10005a.h() < n02.f10006b.h()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f9979Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
