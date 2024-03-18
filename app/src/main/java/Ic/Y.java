package ic;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f32987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g0 f32988Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f32988Z = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new Y(this.f32988Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((Y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32987Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f32987Y = 1;
            if (g0.o(this.f32988Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
