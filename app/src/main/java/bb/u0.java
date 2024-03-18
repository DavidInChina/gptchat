package bb;

import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25906Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25907Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2350T f25908h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(F0 f02, C2350T c2350t, int i10) {
        super(1);
        this.f25906Y = i10;
        this.f25907Z = f02;
        this.f25908h0 = c2350t;
    }

    public final m0 a(m0 m0Var) {
        int i10 = this.f25906Y;
        F0 f02 = this.f25907Z;
        C2350T c2350t = this.f25908h0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t.f26486a, C2170j.f25847q0);
            default:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t.f26486a, C2170j.f25850t0);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25906Y) {
            case 0:
                return a((m0) obj);
            default:
                return a((m0) obj);
        }
    }
}
