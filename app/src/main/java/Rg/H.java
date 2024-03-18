package Rg;

import Qg.D0;
import Qg.r0;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H extends r0 implements D0 {
    @Override // Qg.D0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f14909m0;
            AbstractC3557B.Z(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f14910n0 + ((int) ((r() + this.f14912p0) - this.f14910n0))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f14909m0;
            AbstractC3557B.Z(objArr);
            g(Integer.valueOf(((Number) objArr[((int) ((this.f14910n0 + ((int) ((r() + this.f14912p0) - this.f14910n0))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
