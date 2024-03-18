package Jb;

import Mb.L0;
import Mb.M0;
import Mb.N0;
import Mb.X0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9035Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X0 f9036Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(X0 x02, int i10) {
        super(0);
        this.f9035Y = i10;
        this.f9036Z = x02;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f9035Y;
        X0 x02 = this.f9036Z;
        switch (i10) {
            case 0:
                x02.j(N0.f11820a);
                return;
            case 1:
                x02.j(M0.f11815a);
                return;
            default:
                x02.j(L0.f11807a);
                return;
        }
    }
}
