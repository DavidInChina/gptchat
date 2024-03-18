package na;

import fa.C2969F;
import fa.EnumC2971H;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4739b0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ D1 f39906Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f39907Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4739b0(D1 d12, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39906Y = d12;
        this.f39907Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4739b0(this.f39906Y, this.f39907Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4739b0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC2971H enumC2971H;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C2969F c2969f = this.f39906Y.f39758M;
        if (c2969f != null) {
            enumC2971H = c2969f.f30011d;
        } else {
            enumC2971H = null;
        }
        if (enumC2971H != EnumC2971H.f30046Y) {
            this.f39907Z.invoke(new V(EnumC4797v0.f40130Z));
        }
        return jf.y.f36177a;
    }
}
