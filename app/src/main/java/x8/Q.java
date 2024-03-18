package x8;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Q extends H {
    @Override // r.f
    public final /* bridge */ /* synthetic */ r.f d(Object obj) {
        i0(obj);
        return this;
    }

    public final void i0(Object obj) {
        obj.getClass();
        d0(obj);
    }

    public final S j0() {
        int i10 = this.f49514g;
        if (i10 != 0) {
            if (i10 != 1) {
                S U10 = S.U(i10, this.f49513f);
                this.f49514g = U10.size();
                this.f49515h = true;
                return U10;
            }
            Object obj = this.f49513f[0];
            Objects.requireNonNull(obj);
            int i11 = S.f49530h0;
            return new x0(obj);
        }
        int i12 = S.f49530h0;
        return q0.f49601o0;
    }
}
