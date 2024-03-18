package W;

import X.AbstractC1668b;
import Z.AbstractC1706d0;
import l8.AbstractC4344b;

/* renamed from: W.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537d0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19989Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0.P f19990Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19991h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f19992i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f19993j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f19994k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1706d0 f19995l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537d0(E0.d0 d0Var, E0.P p10, E0.d0 d0Var2, AbstractC1706d0 abstractC1706d0, AbstractC1706d0 abstractC1706d02, AbstractC1706d0 abstractC1706d03, AbstractC1706d0 abstractC1706d04) {
        super(1);
        this.f19989Y = d0Var;
        this.f19990Z = p10;
        this.f19991h0 = d0Var2;
        this.f19992i0 = abstractC1706d0;
        this.f19993j0 = abstractC1706d02;
        this.f19994k0 = abstractC1706d03;
        this.f19995l0 = abstractC1706d04;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        float f6;
        float f10;
        E0.c0 c0Var = (E0.c0) obj;
        E0.d0 d0Var = this.f19989Y;
        int i10 = d0Var.f4053Y;
        float f11 = AbstractC1668b.f21486b;
        E0.P p10 = this.f19990Z;
        if (i10 > p10.a0(f11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f6 = AbstractC1547f0.f20041b;
        } else {
            f6 = AbstractC1547f0.f20043d;
        }
        if (z10) {
            f10 = AbstractC1547f0.f20042c;
        } else {
            f10 = AbstractC1547f0.f20043d;
        }
        E0.d0 d0Var2 = this.f19991h0;
        E0.c0.g(c0Var, d0Var2, 0, 0);
        int a02 = p10.a0(f6) + d0Var2.f4053Y;
        int a03 = p10.a0(f10) + ((-d0Var.f4054Z) / 2);
        float h10 = ((Z.S0) this.f19992i0).h() + a03;
        float h11 = ((Z.S0) this.f19994k0).h() - ((((Z.S0) this.f19993j0).h() + a02) + d0Var.f4053Y);
        float h12 = h10 - ((Z.S0) this.f19995l0).h();
        if (h11 < 0.0f) {
            a02 += AbstractC4344b.Y0(h11);
        }
        if (h12 < 0.0f) {
            a03 -= AbstractC4344b.Y0(h12);
        }
        E0.c0.g(c0Var, d0Var, a02, a03);
        return jf.y.f36177a;
    }
}
