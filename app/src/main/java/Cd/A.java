package Cd;

import a7.AbstractC1932a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1932a f2985Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractC1932a abstractC1932a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2985Y = abstractC1932a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new A(this.f2985Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((A) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        ((a7.d) this.f2985Y).a();
        return jf.y.f36177a;
    }
}
