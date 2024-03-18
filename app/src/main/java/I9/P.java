package I9;

import Z8.AbstractC1809m0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class P extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I0 f8222Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C0758g0 c0758g0, I0 i02, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f8221Y = c0758g0;
        this.f8222Z = i02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new P(this.f8221Y, this.f8222Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((P) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        String str = ((C0783t0) this.f8222Z).f8452a;
        C0758g0 c0758g0 = this.f8221Y;
        c0758g0.getClass();
        AbstractC1809m0.a().b(Z8.D0.f23243c, kf.w.f37484Y);
        if (str != null) {
            c0758g0.f(new C0770m0(str));
        } else {
            x8.W.G(Pc.e.a(), "Conversation does not have a known remote ID", null, 6);
        }
        return jf.y.f36177a;
    }
}
