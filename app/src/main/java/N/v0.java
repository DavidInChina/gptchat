package N;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class v0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12442Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12443Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L.x0 f12444h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(L.x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12444h0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        v0 v0Var = new v0(this.f12444h0, abstractC4825e);
        v0Var.f12443Z = obj;
        return v0Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12442Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f12442Y = 1;
            if (U3.f.v((B0.A) this.f12443Z, this.f12444h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
