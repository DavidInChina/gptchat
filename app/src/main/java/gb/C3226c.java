package gb;

import wf.AbstractC6216a;

/* renamed from: gb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3226c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31389Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f31390Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o0 f31391h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3226c(wf.k kVar, o0 o0Var, int i10) {
        super(0);
        this.f31389Y = i10;
        this.f31390Z = kVar;
        this.f31391h0 = o0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f31389Y;
        wf.k kVar = this.f31390Z;
        o0 o0Var = this.f31391h0;
        switch (i10) {
            case 0:
                kVar.invoke(new c0(o0Var.f31495a, o0Var.f31496b));
                return;
            default:
                kVar.invoke(new T(o0Var.f31495a, o0Var.f31496b));
                return;
        }
    }
}
