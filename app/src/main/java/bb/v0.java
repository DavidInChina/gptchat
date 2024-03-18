package bb;

import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25910Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25911Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2350T f25912h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2350T f25913i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(F0 f02, C2350T c2350t, C2350T c2350t2, int i10) {
        super(1);
        this.f25910Y = i10;
        this.f25911Z = f02;
        this.f25912h0 = c2350t;
        this.f25913i0 = c2350t2;
    }

    public final m0 a(m0 m0Var) {
        int i10 = this.f25910Y;
        F0 f02 = this.f25911Z;
        C2350T c2350t = this.f25913i0;
        C2350T c2350t2 = this.f25912h0;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t2.f26486a, new p0(c2350t, 1));
            default:
                AbstractC3557B.c0("$this$setState", m0Var);
                return F0.m(f02, m0Var, c2350t2.f26486a, new p0(c2350t, 2));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25910Y) {
            case 0:
                return a((m0) obj);
            default:
                return a((m0) obj);
        }
    }
}
