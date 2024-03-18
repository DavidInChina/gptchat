package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39892Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39893Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39893Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Y0 y02 = new Y0(this.f39893Z, abstractC4825e);
        y02.f39892Y = obj;
        return y02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((Y0) create((J9.b) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39893Z.l(new C6383b(16, (J9.b) this.f39892Y));
        return jf.y.f36177a;
    }
}
