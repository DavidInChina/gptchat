package E0;

import Z.AbstractC1738u;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4078Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n0 f4079Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, int i10) {
        super(2);
        this.f4078Y = i10;
        this.f4079Z = n0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f4078Y;
        n0 n0Var = this.f4079Z;
        switch (i10) {
            case 0:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                n0Var.a().f4013Z = (AbstractC1738u) obj2;
                return yVar;
            case 1:
                J a5 = n0Var.a();
                ((androidx.compose.ui.node.a) obj).v0(new G(a5, (wf.n) obj2, a5.f4027u0));
                return yVar;
            default:
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj;
                n0 n0Var2 = (n0) obj2;
                J j6 = aVar2.f24832C0;
                if (j6 == null) {
                    j6 = new J(aVar2, n0Var.f4083a);
                    aVar2.f24832C0 = j6;
                }
                n0Var.f4084b = j6;
                n0Var.a().d();
                J a10 = n0Var.a();
                q0 q0Var = a10.f4014h0;
                q0 q0Var2 = n0Var.f4083a;
                if (q0Var != q0Var2) {
                    a10.f4014h0 = q0Var2;
                    a10.e(false);
                    androidx.compose.ui.node.a.p0(a10.f4012Y, false, 3);
                }
                return yVar;
        }
    }
}
