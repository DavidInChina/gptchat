package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39895Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39895Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Z0 z02 = new Z0(this.f39895Z, abstractC4825e);
        z02.f39894Y = obj;
        return z02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((Z0) create((wd.q0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39895Z.f(new C4788s((wd.q0) this.f39894Y));
        return jf.y.f36177a;
    }
}
