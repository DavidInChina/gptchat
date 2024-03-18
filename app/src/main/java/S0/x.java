package S0;

import Qd.C1183b;
import id.AbstractC3557B;
import nf.AbstractC4821a;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class x extends AbstractC4821a implements Ng.D {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16057Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(int i10) {
        super(r0);
        Ng.C c10 = Ng.C.f12863Y;
        this.f16057Y = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(c10);
                return;
            }
        }
        super(c10);
    }

    @Override // Ng.D
    public final void handleException(AbstractC4831k abstractC4831k, Throwable th2) {
        switch (this.f16057Y) {
            case 1:
                C1183b c1183b = Qd.i.Companion;
                AbstractC3557B.s2(c1183b, "Caught Exception in Analytics Scope: " + th2, 1);
                return;
            default:
                return;
        }
    }
}
