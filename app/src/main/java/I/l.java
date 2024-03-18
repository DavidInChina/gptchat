package I;

import E0.AbstractC0461u;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f7934Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ m f7935Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0461u f7936h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7937i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7938j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC0461u abstractC0461u, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7935Z = mVar;
        this.f7936h0 = abstractC0461u;
        this.f7937i0 = abstractC6216a;
        this.f7938j0 = abstractC6216a2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        l lVar = new l(this.f7935Z, this.f7936h0, this.f7937i0, this.f7938j0, abstractC4825e);
        lVar.f7934Y = obj;
        return lVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        F f6 = (F) this.f7934Y;
        m mVar = this.f7935Z;
        Ad.l.O0(f6, null, null, new j(mVar, this.f7936h0, this.f7937i0, null), 3);
        return Ad.l.O0(f6, null, null, new k(mVar, this.f7938j0, null), 3);
    }
}
