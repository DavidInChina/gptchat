package A;

import Z.AbstractC1710f0;
import Z.l1;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5644c;

/* loaded from: classes2.dex */
public final class Q implements AbstractC0042s0 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f103Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f104Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1 f105h0;

    public Q(AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02, AbstractC1710f0 abstractC1710f03) {
        this.f103Y = abstractC1710f0;
        this.f104Z = abstractC1710f02;
        this.f105h0 = abstractC1710f03;
    }

    @Override // A.AbstractC0042s0
    public final void b(AbstractC5646e abstractC5646e) {
        G0.J j6 = (G0.J) abstractC5646e;
        j6.a();
        boolean booleanValue = ((Boolean) this.f103Y.getValue()).booleanValue();
        C5644c c5644c = j6.f5596Y;
        if (booleanValue) {
            AbstractC5648g.k(j6, r0.r.b(r0.r.f44254b, 0.3f), 0L, c5644c.g(), 0.0f, 122);
        } else if (((Boolean) this.f104Z.getValue()).booleanValue() || ((Boolean) this.f105h0.getValue()).booleanValue()) {
            AbstractC5648g.k(j6, r0.r.b(r0.r.f44254b, 0.1f), 0L, c5644c.g(), 0.0f, 122);
        }
    }
}
