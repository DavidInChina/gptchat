package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class P1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1150Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1150Y = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new P1(this.f1150Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((P1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C0115c1 c0115c1 = this.f1150Y;
        c0115c1.f1290Z = true;
        c0115c1.f1292i0.g(null);
        return jf.y.f36177a;
    }
}
