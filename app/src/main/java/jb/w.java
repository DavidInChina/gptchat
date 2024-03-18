package Jb;

import Mb.C0978s0;
import Mb.C0980t0;
import Mb.C0982u0;
import Mb.F0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9024Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f9025Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(F0 f02, int i10) {
        super(0);
        this.f9024Y = i10;
        this.f9025Z = f02;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f9024Y;
        F0 f02 = this.f9025Z;
        switch (i10) {
            case 0:
                f02.j(C0982u0.f11989a);
                return;
            case 1:
                f02.j(C0978s0.f11979a);
                return;
            default:
                f02.j(C0980t0.f11984a);
                return;
        }
    }
}
