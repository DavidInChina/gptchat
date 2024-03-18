package ta;

import Z8.AbstractC1809m0;
import Z8.S0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ta.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5702a extends AbstractC5163j implements wf.n {
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new AbstractC5163j(2, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C5702a) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC1809m0.a().c(S0.f23272c, "camera");
        return jf.y.f36177a;
    }
}
