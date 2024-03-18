package bb;

import cb.C2350T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class z0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25927Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25928Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T f25929h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(F0 f02, T t10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25928Z = f02;
        this.f25929h0 = t10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new z0(this.f25928Z, this.f25929h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((z0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25927Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2350T c2350t = ((O) this.f25929h0).f25737a;
            this.f25927Y = 1;
            if (F0.n(this.f25928Z, c2350t, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
