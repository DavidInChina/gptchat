package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes.dex */
public final class X0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39889Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39890Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39890Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        X0 x02 = new X0(this.f39890Z, abstractC4825e);
        x02.f39889Y = obj;
        return x02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((X0) create((J9.d) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39890Z.l(new C6383b(15, (J9.d) this.f39889Y));
        return jf.y.f36177a;
    }
}
