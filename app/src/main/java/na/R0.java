package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;

/* loaded from: classes2.dex */
public final class R0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39859Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Nb.a f39860Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B1 f39861h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Nb.a aVar, B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39860Z = aVar;
        this.f39861h0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new R0(this.f39860Z, this.f39861h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((R0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39859Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f39859Y = 1;
            obj = ((Ob.b) this.f39860Z).a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.u0) {
            this.f39861h0.l(new C6383b(12, (Qb.f) ((wd.u0) v0Var).f48468a));
        }
        return jf.y.f36177a;
    }
}
