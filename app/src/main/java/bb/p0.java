package bb;

import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25886Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2350T f25887Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(C2350T c2350t, int i10) {
        super(1);
        this.f25886Y = i10;
        this.f25887Z = c2350t;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C2350T c2350t = this.f25887Z;
        int i10 = this.f25886Y;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0.e(m0Var, null, null, Bi.c.K1(c2350t), null, 11);
            case 1:
                H0 h02 = (H0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", h02);
                        return h02.a(c2350t);
                    default:
                        AbstractC3557B.c0("it", h02);
                        return h02.a(c2350t);
                }
            default:
                H0 h03 = (H0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", h03);
                        return h03.a(c2350t);
                    default:
                        AbstractC3557B.c0("it", h03);
                        return h03.a(c2350t);
                }
        }
    }
}
