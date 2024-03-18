package G0;

import H0.C0714y;
import androidx.compose.ui.node.Owner;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class K extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ O f5598Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Owner f5599Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f5600h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o10, Owner owner, long j6) {
        super(0);
        this.f5598Y = o10;
        this.f5599Z = owner;
        this.f5600h0 = j6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        T E02;
        O o10 = this.f5598Y;
        E0.c0 c0Var = null;
        if (AbstractC0579h.x(o10.f5647a)) {
            g0 g0Var = o10.a().f5772p0;
            if (g0Var != null) {
                c0Var = g0Var.f5672m0;
            }
        } else {
            g0 g0Var2 = o10.a().f5772p0;
            if (g0Var2 != null && (E02 = g0Var2.E0()) != null) {
                c0Var = E02.f5672m0;
            }
        }
        if (c0Var == null) {
            c0Var = ((C0714y) this.f5599Z).getPlacementScope();
        }
        T E03 = o10.a().E0();
        AbstractC3557B.Z(E03);
        E0.c0.f(c0Var, E03, this.f5600h0);
        return jf.y.f36177a;
    }
}
