package ib;

import Ng.F;
import Z8.AbstractC1809m0;
import Z8.C1793e0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kf.w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements n {
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new AbstractC5163j(2, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC1809m0.a().b(C1793e0.f23342c, w.f37484Y);
        return y.f36177a;
    }
}
