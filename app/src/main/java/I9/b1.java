package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class b1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ F f8302Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8303Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(F f6, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8302Y = f6;
        this.f8303Z = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b1(this.f8302Y, this.f8303Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((b1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f8302Y.j(new B0(this.f8303Z));
        return jf.y.f36177a;
    }
}
