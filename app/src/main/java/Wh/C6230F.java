package wh;

import Rh.I0;
import Rh.M0;
import java.util.List;
import yh.G1;

/* renamed from: wh.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6230F extends AbstractC6227C {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f48522Z = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f48523h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6230F(M0 m02) {
        super(0);
        this.f48523h0 = m02;
    }

    @Override // wh.AbstractC6227C, wh.AbstractC6235K
    public final G1 I0() {
        switch (this.f48522Z) {
            case 1:
                M0 m02 = (M0) this.f48523h0;
                return m02.f15659k0.c(m02.f15660l0, m02.f15673y0.f15814i0, m02.f15665q0, m02);
            default:
                return super.I0();
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f48522Z;
        Object obj = this.f48523h0;
        switch (i11) {
            case 0:
                return (AbstractC6226B) ((List) obj).get(i10);
            default:
                return new I0((M0) obj, i10);
        }
    }

    @Override // wh.AbstractC6227C, wh.AbstractC6235K
    public final boolean k0() {
        switch (this.f48522Z) {
            case 1:
                for (int i10 = 0; i10 < size(); i10++) {
                    M0 m02 = (M0) this.f48523h0;
                    if (m02.f15670v0[i10] == null || m02.f15671w0[i10] == null) {
                        return false;
                    }
                }
                return true;
            default:
                return super.k0();
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f48522Z;
        Object obj = this.f48523h0;
        switch (i10) {
            case 0:
                return ((List) obj).size();
            default:
                return ((M0) obj).f15660l0.size();
        }
    }

    public /* synthetic */ C6230F(M0 m02, int i10) {
        this(m02);
    }

    public C6230F(List list) {
        super(0);
        this.f48523h0 = list;
    }
}
