package hc;

import na.F0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class P extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32164Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32165Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32165Z = u10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        P p10 = new P(this.f32165Z, abstractC4825e);
        p10.f32164Y = obj;
        return p10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((P) create((zd.n) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f32165Z.l(new F0((zd.n) this.f32164Y, 2));
        return jf.y.f36177a;
    }
}
