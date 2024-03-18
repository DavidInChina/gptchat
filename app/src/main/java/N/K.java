package N;

import G0.AbstractC0579h;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class K extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12218Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12219Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1028l f12220h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ L.x0 f12221i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC1028l abstractC1028l, L.x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12220h0 = abstractC1028l;
        this.f12221i0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        K k10 = new K(this.f12220h0, this.f12221i0, abstractC4825e);
        k10.f12219Z = obj;
        return k10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12218Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.A a5 = (B0.A) this.f12219Z;
            B0.P p10 = (B0.P) a5;
            p10.getClass();
            J j6 = new J(this.f12220h0, new C1025i(AbstractC0579h.A(p10).f24861y0), this.f12221i0, null);
            this.f12218Y = 1;
            if (Df.H.q(a5, j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
