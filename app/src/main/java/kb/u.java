package kb;

import Df.AbstractC0408g;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC0408g f37272Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H.F f37273Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AbstractC0408g abstractC0408g, H.F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37272Y = abstractC0408g;
        this.f37273Z = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f37272Y, this.f37273Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ((wf.k) this.f37272Y).invoke(new C4229n(this.f37273Z.f6549d.a()));
        return jf.y.f36177a;
    }
}
