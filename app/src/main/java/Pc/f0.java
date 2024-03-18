package pc;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f42985Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(K k10, int i10) {
        super(1);
        this.f42984Y = i10;
        this.f42985Z = k10;
    }

    public final m0 a(m0 m0Var) {
        int i10 = this.f42984Y;
        K k10 = this.f42985Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", m0Var);
                if (m0Var instanceof l0) {
                    l0 l0Var = (l0) m0Var;
                    if (l0Var.f43009b != null) {
                        return l0.e(l0Var, null, Integer.valueOf(k10.f42907Y), 11);
                    }
                }
                return new j0(k10.f42907Y);
            default:
                AbstractC3557B.c0("$this$setState", m0Var);
                return new j0(k10.f42907Y);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f42984Y) {
            case 0:
                return a((m0) obj);
            default:
                return a((m0) obj);
        }
    }
}
