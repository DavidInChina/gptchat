package W;

import wf.AbstractC6216a;
import z.C6694e;

/* loaded from: classes2.dex */
public final class M extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19356Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f19357Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f19358h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(float f6, int i10, Object obj) {
        super(0);
        this.f19356Y = i10;
        this.f19358h0 = obj;
        this.f19357Z = f6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        o4 o4Var;
        int i10 = this.f19356Y;
        float f6 = this.f19357Z;
        Object obj = this.f19358h0;
        switch (i10) {
            case 0:
                n4 n4Var = (n4) obj;
                o4 o4Var2 = null;
                Float valueOf = (n4Var == null || (o4Var = ((C1568j1) n4Var).f20169b) == null) ? null : Float.valueOf(o4Var.f20266a.h());
                if (valueOf != null && valueOf.floatValue() == f6) {
                    return;
                }
                if (n4Var != null) {
                    o4Var2 = ((C1568j1) n4Var).f20169b;
                }
                if (o4Var2 == null) {
                    return;
                }
                o4Var2.f20266a.i(f6);
                return;
            default:
                C6694e c6694e = (C6694e) obj;
                c6694e.g(Float.valueOf(f6), c6694e.f51234g);
                return;
        }
    }
}
