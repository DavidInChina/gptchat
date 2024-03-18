package I9;

import h0.C3288a;
import id.AbstractC3557B;
import r9.C5389f;
import x9.C6383b;

/* renamed from: I9.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ j1 f8466Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8467Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8468h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f8469i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f8470j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0792y(j1 j1Var, wf.k kVar, boolean z10, Tc.f fVar, float f6) {
        super(1);
        this.f8466Y = j1Var;
        this.f8467Z = kVar;
        this.f8468h0 = z10;
        this.f8469i0 = fVar;
        this.f8470j0 = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        F.B b10 = (F.B) obj;
        AbstractC3557B.c0("$this$LazyColumn", b10);
        E9.f.t(b10, null, AbstractC0751d.f8316a, 3);
        j1 j1Var = this.f8466Y;
        int size = j1Var.f8404v.size();
        C6383b c6383b = new C6383b(6, j1Var);
        wf.k kVar = this.f8467Z;
        boolean z10 = this.f8468h0;
        E9.f.u(b10, size, c6383b, new C3288a(new C0788w(j1Var, kVar, z10), true, 799139312), 4);
        E9.f.t(b10, null, AbstractC0751d.f8317b, 3);
        if (!j1Var.f8400r) {
            E9.f.t(b10, null, AbstractC0751d.f8318c, 3);
            E9.f.t(b10, null, new C3288a(new C5389f(z10, kVar, 1), true, 599912650), 3);
        } else {
            boolean z11 = j1Var.f8402t;
            if (z11 && j1Var.f8383a) {
                E9.f.t(b10, null, AbstractC0751d.f8319d, 3);
            } else if (z11 && !j1Var.f8384b) {
                E9.f.t(b10, null, AbstractC0751d.f8320e, 3);
                E9.f.t(b10, null, new C3288a(new C5389f(z10, this.f8469i0, 2), true, 788029826), 3);
            }
        }
        E9.f.t(b10, null, new C3288a(new C0790x(this.f8470j0), true, 1194873633), 3);
        return jf.y.f36177a;
    }
}
