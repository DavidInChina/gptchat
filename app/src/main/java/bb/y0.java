package bb;

import cb.C2350T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class y0 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25923Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f25924Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ T f25925h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(F0 f02, T t10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25924Z = f02;
        this.f25925h0 = t10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new y0(this.f25924Z, this.f25925h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((y0) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25923Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2350T c2350t = ((S) this.f25925h0).f25741a;
            this.f25923Y = 1;
            if (F0.p(this.f25924Z, c2350t, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
