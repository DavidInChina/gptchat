package na;

import wf.AbstractC6216a;

/* renamed from: na.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4795u0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40122Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f40123Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4795u0(E0 e02, int i10) {
        super(0);
        this.f40122Y = i10;
        this.f40123Z = e02;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f40122Y;
        E0 e02 = this.f40123Z;
        switch (i10) {
            case 0:
                e02.j(C4798w.f40137a);
                return;
            case 1:
                e02.j(C4800x.f40143a);
                return;
            case 2:
                e02.j(C4804z.f40158a);
                return;
            default:
                e02.j(C4729B.f39704a);
                return;
        }
    }
}
