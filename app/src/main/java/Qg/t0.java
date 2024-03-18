package Qg;

import Ng.C1072l;
import Rg.AbstractC1281b;
import Rg.AbstractC1283d;
import nf.AbstractC4825e;

/* loaded from: classes2.dex */
public final class t0 extends AbstractC1283d {

    /* renamed from: a  reason: collision with root package name */
    public long f14923a;

    /* renamed from: b  reason: collision with root package name */
    public C1072l f14924b;

    @Override // Rg.AbstractC1283d
    public final boolean a(AbstractC1281b abstractC1281b) {
        r0 r0Var = (r0) abstractC1281b;
        if (this.f14923a >= 0) {
            return false;
        }
        long j6 = r0Var.f14910n0;
        if (j6 < r0Var.f14911o0) {
            r0Var.f14911o0 = j6;
        }
        this.f14923a = j6;
        return true;
    }

    @Override // Rg.AbstractC1283d
    public final AbstractC4825e[] b(AbstractC1281b abstractC1281b) {
        long j6 = this.f14923a;
        this.f14923a = -1L;
        this.f14924b = null;
        return ((r0) abstractC1281b).x(j6);
    }
}
