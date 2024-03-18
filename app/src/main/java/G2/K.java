package g2;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class K extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31048Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ L f31049Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f31050h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31051i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f31052j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l10, H h10, Ng.F f6, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31049Z = l10;
        this.f31050h0 = h10;
        this.f31051i0 = f6;
        this.f31052j0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new K(this.f31049Z, this.f31050h0, this.f31051i0, this.f31052j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        long a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31048Y;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        do {
            L l10 = this.f31049Z;
            Object obj2 = l10.f31054Z.get();
            AbstractC3557B.Z(obj2);
            long longValue = ((Number) obj2).longValue();
            ((C3142G) this.f31050h0).getClass();
            if (longValue > System.currentTimeMillis()) {
                a5 = l10.a();
                this.f31048Y = 1;
            } else {
                Ad.l.P(this.f31051i0, new I("Timed out of executing block.", this.f31052j0.hashCode()));
                return jf.y.f36177a;
            }
        } while (R4.b.q0(a5, this) != enumC5000a);
        return enumC5000a;
    }
}
