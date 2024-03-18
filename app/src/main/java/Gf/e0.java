package Gf;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6409Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f0 f6410Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i10) {
        super(0);
        this.f6409Y = i10;
        this.f6410Z = f0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6409Y;
        f0 f0Var = this.f6410Z;
        switch (i10) {
            case 0:
                return new d0(f0Var);
            default:
                return f0Var.w();
        }
    }
}
