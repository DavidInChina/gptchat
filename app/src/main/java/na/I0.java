package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39807Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, na.I0, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f39807Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((D1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        return Boolean.valueOf(((D1) this.f39807Y).f39753H);
    }
}
