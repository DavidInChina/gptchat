package Rh;

import java.util.List;
import th.AbstractC5806n;
import yh.AbstractC6638t0;
import yh.l1;

/* loaded from: classes.dex */
public final class H0 extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final yh.l1 f15629Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M0 f15630h0;

    public H0(M0 m02, yh.l1 l1Var) {
        this.f15630h0 = m02;
        this.f15629Z = l1Var;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f15629Z.S(); i10++) {
            sb2.append('.');
        }
        M0 m02 = this.f15630h0;
        return B0.i(m02.f15673y0.f15814i0, (List) m02.f15667s0.get(sb2.toString()));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        yh.l1 mo118a = this.f15629Z.mo118a();
        if (mo118a == null) {
            return null;
        }
        return new H0(this.f15630h0, mo118a);
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15629Z;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        return null;
    }
}
