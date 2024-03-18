package N;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class d0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12303Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12304Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f0 f12305h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f12306i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12305h0 = f0Var;
        this.f12306i0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        d0 d0Var = new d0(this.f12305h0, this.f12306i0, abstractC4825e);
        d0Var.f12304Z = obj;
        return d0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12303Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            G.X x10 = new G.X(this.f12306i0, 1);
            this.f12303Y = 1;
            this.f12305h0.getClass();
            Object q10 = Df.H.q((B0.A) this.f12304Z, new a0(x10, null), this);
            if (q10 != enumC5000a) {
                q10 = yVar;
            }
            if (q10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
