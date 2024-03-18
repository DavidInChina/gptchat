package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4736a0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ F.J f39900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D1 f39901Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f39902h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4736a0(F.J j6, D1 d12, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39900Y = j6;
        this.f39901Z = d12;
        this.f39902h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4736a0(this.f39900Y, this.f39901Z, this.f39902h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4736a0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        F.J j6 = this.f39900Y;
        if (!j6.d() && j6.b() && this.f39901Z.f39784w == EnumC4797v0.f40131h0) {
            this.f39902h0.invoke(new V(EnumC4797v0.f40129Y));
        }
        return jf.y.f36177a;
    }
}
