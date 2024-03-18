package zc;

import Dd.C0382c;
import Dd.EnumC0401w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51953Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51954Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Q q10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51954Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new y(this.f51954Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51953Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Kd.I i11 = this.f51954Z.f51860l;
            this.f51953Y = 1;
            W.F(i11.f9691n, "Halting", null, 6);
            Object f6 = i11.f(new Dd.K(EnumC0401w.f3577Z, new C0382c(Dd.H.f3514i0)), this);
            if (f6 != enumC5000a) {
                f6 = yVar;
            }
            if (f6 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
