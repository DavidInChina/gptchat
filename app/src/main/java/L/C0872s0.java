package L;

import q0.C5251c;

/* renamed from: L.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0872s0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10289Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x0 f10290Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0872s0(x0 x0Var, int i10) {
        super(1);
        this.f10289Y = i10;
        this.f10290Z = x0Var;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10289Y;
        x0 x0Var = this.f10290Z;
        switch (i10) {
            case 0:
                x0Var.d(((C5251c) obj).f43623a);
                return yVar;
            default:
                B0.u uVar = (B0.u) obj;
                x0Var.g(r9.y.Q0(uVar, false));
                uVar.a();
                return yVar;
        }
    }
}
