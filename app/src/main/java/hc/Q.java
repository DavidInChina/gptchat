package hc;

import h9.C3338c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;

/* loaded from: classes.dex */
public final class Q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32166Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32167Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32167Z = u10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Q q10 = new Q(this.f32167Z, abstractC4825e);
        q10.f32166Y = obj;
        return q10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((Q) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f32167Z.l(new C3338c((C6205s) this.f32166Y, 4));
        return jf.y.f36177a;
    }
}
