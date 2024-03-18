package N;

import Qg.C1209l;
import Z.l1;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6694e;

/* loaded from: classes.dex */
public final class X extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12265Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12266Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l1 f12267h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6694e f12268i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(l1 l1Var, C6694e c6694e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12267h0 = l1Var;
        this.f12268i0 = c6694e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        X x10 = new X(this.f12267h0, this.f12268i0, abstractC4825e);
        x10.f12266Z = obj;
        return x10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12265Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1209l o02 = AbstractC4828h.o0(new F.r(this.f12267h0, 4));
            W w10 = new W(this.f12268i0, 0, (Ng.F) this.f12266Z);
            this.f12265Y = 1;
            if (o02.b(w10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
