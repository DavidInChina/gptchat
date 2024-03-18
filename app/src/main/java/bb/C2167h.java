package bb;

import Z8.AbstractC1809m0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: bb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2167h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2152D f25827Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2167h(C2152D c2152d, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25827Y = c2152d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2167h(this.f25827Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C2167h) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC1809m0.a().c(Z8.K.f23256c, new wd.O(this.f25827Y.f25693a));
        return jf.y.f36177a;
    }
}
