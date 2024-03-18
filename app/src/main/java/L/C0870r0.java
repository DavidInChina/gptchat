package L;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: L.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0870r0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f10283Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f10284Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x0 f10285h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0870r0(B0.A a5, x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10284Z = a5;
        this.f10285h0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0870r0 c0870r0 = new C0870r0(this.f10284Z, this.f10285h0, abstractC4825e);
        c0870r0.f10283Y = obj;
        return c0870r0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0870r0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Ng.F f6 = (Ng.F) this.f10283Y;
        Ng.G g10 = Ng.G.f12870i0;
        B0.A a5 = this.f10284Z;
        x0 x0Var = this.f10285h0;
        Ad.l.O0(f6, null, g10, new C0867p0(a5, x0Var, null), 1);
        return Ad.l.O0(f6, null, g10, new C0869q0(a5, x0Var, null), 1);
    }
}
