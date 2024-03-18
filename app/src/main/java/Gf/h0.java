package Gf;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6415Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i0 f6416Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i10) {
        super(0);
        this.f6415Y = i10;
        this.f6416Z = i0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6415Y;
        i0 i0Var = this.f6416Z;
        switch (i10) {
            case 0:
                return new g0(i0Var);
            default:
                return i0Var.w();
        }
    }
}
