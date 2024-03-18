package hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32160Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32161Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(U u10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32161Z = u10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        N n10 = new N(this.f32161Z, abstractC4825e);
        n10.f32160Y = obj;
        return n10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((N) create((Ba.c) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f32161Z.l(new Ba.g((Ba.c) this.f32160Y, 3));
        return jf.y.f36177a;
    }
}
