package B;

import Ng.AbstractC1073l0;
import h.C3281g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class P extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1145Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1146Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ S f1147h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1073l0 f1148i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s10, AbstractC1073l0 abstractC1073l0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1147h0 = s10;
        this.f1148i0 = abstractC1073l0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        P p10 = new P(this.f1147h0, this.f1148i0, abstractC4825e);
        p10.f1146Z = obj;
        return p10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1145Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            S s10 = this.f1147h0;
            s10.f1165D0.f1281e = S.A0(s10);
            C3281g c3281g = new C3281g(s10, (AbstractC0130h1) this.f1146Z, this.f1148i0, 4);
            C0110b c0110b = new C0110b(1, s10);
            this.f1145Y = 1;
            if (s10.f1165D0.a(c3281g, c0110b, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
