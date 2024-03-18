package Rh;

import java.util.List;
import th.AbstractC5806n;
import wh.AbstractC6250o;
import wh.AbstractC6258w;
import yh.l1;

/* loaded from: classes.dex */
public final class I0 extends AbstractC6258w {

    /* renamed from: h0  reason: collision with root package name */
    public final int f15632h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ M0 f15633i0;

    public I0(M0 m02, int i10) {
        this.f15633i0 = m02;
        this.f15632h0 = i10;
    }

    @Override // wh.AbstractC6226B
    public final AbstractC6250o B0() {
        return this.f15633i0;
    }

    @Override // wh.AbstractC6226B
    public final boolean L0() {
        if (this.f15633i0.f15671w0[this.f15632h0] != null) {
            return true;
        }
        return false;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        M0 m02 = this.f15633i0;
        return B0.i(m02.f15673y0.f15814i0, (List) m02.f15669u0.get(Integer.valueOf(this.f15632h0)));
    }

    @Override // wh.AbstractC6226B
    public final int getIndex() {
        return this.f15632h0;
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5637i.b
    public final String getName() {
        if (v0()) {
            return this.f15633i0.f15670v0[this.f15632h0];
        }
        return super.getName();
    }

    @Override // wh.AbstractC6226B
    public final l1.a getType() {
        M0 m02 = this.f15633i0;
        return (l1.a) m02.f15659k0.c(m02.f15660l0, m02.f15673y0.f15814i0, m02.f15665q0, m02).get(this.f15632h0);
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5636h
    public final int u0() {
        if (L0()) {
            return this.f15633i0.f15671w0[this.f15632h0].intValue();
        }
        return 0;
    }

    @Override // sh.AbstractC5638j
    public final boolean v0() {
        if (this.f15633i0.f15670v0[this.f15632h0] != null) {
            return true;
        }
        return false;
    }
}
