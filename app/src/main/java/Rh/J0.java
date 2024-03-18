package Rh;

import java.util.List;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes.dex */
public final class J0 extends yh.H0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f15634Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f15635h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ K0 f15636i0;

    public J0(K0 k02, l1.a aVar, int i10) {
        this.f15636i0 = k02;
        this.f15634Z = aVar;
        this.f15635h0 = i10;
    }

    @Override // yh.l1.a
    public final String A0() {
        return this.f15634Z.A0();
    }

    @Override // yh.l1.a
    public final AbstractC5641m B() {
        return this.f15634Z.B();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        K0 k02 = this.f15636i0;
        M0 m02 = k02.f15640h0.f15649h0;
        p1 p1Var = m02.f15673y0.f15814i0;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < k02.f15640h0.f15648Z.S(); i10++) {
            sb3.append('.');
        }
        sb2.append(sb3.toString());
        sb2.append(this.f15635h0);
        sb2.append(';');
        return B0.i(p1Var, (List) m02.f15667s0.get(sb2.toString()));
    }

    @Override // yh.l1.a
    public final G1 getUpperBounds() {
        return this.f15634Z.getUpperBounds();
    }
}
