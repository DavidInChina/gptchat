package Rb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class U extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ O f15297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1272s f15298Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(O o10, C1272s c1272s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15297Y = o10;
        this.f15298Z = c1272s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new U(this.f15297Y, this.f15298Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((U) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f15297Y.j(new C1274u(this.f15298Z));
        return jf.y.f36177a;
    }
}
