package bb;

import cb.C2350T;
import e9.C2808a;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25915Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25916Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2350T f25917h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wd.q0 f25918i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(F0 f02, C2350T c2350t, wd.q0 q0Var, int i10) {
        super(1);
        this.f25915Y = i10;
        this.f25916Z = f02;
        this.f25917h0 = c2350t;
        this.f25918i0 = q0Var;
    }

    public final m0 a(m0 m0Var) {
        int i10 = this.f25915Y;
        F0 f02 = this.f25916Z;
        wd.q0 q0Var = this.f25918i0;
        C2350T c2350t = this.f25917h0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t.f26486a, new C2808a(q0Var, 1));
            default:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t.f26486a, new C2808a(q0Var, 2));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25915Y) {
            case 0:
                return a((m0) obj);
            default:
                return a((m0) obj);
        }
    }
}
