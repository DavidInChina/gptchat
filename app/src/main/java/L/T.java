package L;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class T extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f10070Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f10071Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x0 f10072h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f10073i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(B0.A a5, x0 x0Var, N.t0 t0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10071Z = a5;
        this.f10072h0 = x0Var;
        this.f10073i0 = t0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        T t10 = new T(this.f10071Z, this.f10072h0, this.f10073i0, abstractC4825e);
        t10.f10070Y = obj;
        return t10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((T) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Ng.F f6 = (Ng.F) this.f10070Y;
        Ng.G g10 = Ng.G.f12870i0;
        B0.A a5 = this.f10071Z;
        Ad.l.O0(f6, null, g10, new Q(a5, this.f10072h0, null), 1);
        Ad.l.O0(f6, null, g10, new S(a5, this.f10073i0, null), 1);
        return jf.y.f36177a;
    }
}
