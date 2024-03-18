package na;

import ec.C2873y;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class F0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39792Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ zd.n f39793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(zd.n nVar, int i10) {
        super(1);
        this.f39792Y = i10;
        this.f39793Z = nVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f39792Y) {
            case 0:
                D1 d12 = (D1) obj;
                AbstractC3557B.c0("$this$setState", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, this.f39793Z, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -262145, 63);
            case 1:
                C2873y c2873y = (C2873y) obj;
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, this.f39793Z, null, null, null, null, null, null, null, 1022);
            default:
                hc.L l10 = (hc.L) obj;
                AbstractC3557B.c0("$this$setState", l10);
                return hc.L.e(l10, this.f39793Z.f51986e, false, null, 14);
        }
    }
}
