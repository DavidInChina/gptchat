package Qg;

import Ng.C1072l;
import id.AbstractC3557B;
import nf.AbstractC4825e;

/* loaded from: classes2.dex */
public final class p0 implements Ng.T {

    /* renamed from: Y  reason: collision with root package name */
    public final r0 f14890Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f14891Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f14892h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC4825e f14893i0;

    public p0(r0 r0Var, long j6, Object obj, C1072l c1072l) {
        this.f14890Y = r0Var;
        this.f14891Z = j6;
        this.f14892h0 = obj;
        this.f14893i0 = c1072l;
    }

    @Override // Ng.T
    public final void dispose() {
        r0 r0Var = this.f14890Y;
        synchronized (r0Var) {
            if (this.f14891Z >= r0Var.r()) {
                Object[] objArr = r0Var.f14909m0;
                AbstractC3557B.Z(objArr);
                long j6 = this.f14891Z;
                if (objArr[((int) j6) & (objArr.length - 1)] == this) {
                    s0.d(objArr, j6, s0.f14917a);
                    r0Var.m();
                }
            }
        }
    }
}
