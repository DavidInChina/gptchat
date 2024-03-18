package ic;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ic.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3550u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC3552w f33065Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3550u(AbstractC3552w abstractC3552w, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33065Y = abstractC3552w;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3550u(this.f33065Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C3550u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f33065Y.j(C3547q.f33062a);
        return jf.y.f36177a;
    }
}
