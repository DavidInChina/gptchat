package bb;

import Z8.AbstractC1809m0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: bb.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2160d0 extends AbstractC5163j implements wf.n {
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new AbstractC5163j(2, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C2160d0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC1809m0.a().b(Z8.M.f23260c, kf.w.f37484Y);
        return jf.y.f36177a;
    }
}
