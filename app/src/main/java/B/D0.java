package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public int f1049Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Ng.F f1050Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ long f1051h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1052i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ W0 f1053j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(wf.o oVar, W0 w02, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f1052i0 = oVar;
        this.f1053j0 = w02;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6 = ((Z0.p) obj2).f22815a;
        D0 d02 = new D0(this.f1052i0, this.f1053j0, (AbstractC4825e) obj3);
        d02.f1050Z = (Ng.F) obj;
        d02.f1051h0 = j6;
        return d02.invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1049Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f10 = this.f1050Z;
            long j6 = this.f1051h0;
            if (this.f1053j0 == W0.f1213Y) {
                f6 = Z0.p.c(j6);
            } else {
                f6 = Z0.p.b(j6);
            }
            Float f11 = new Float(f6);
            this.f1049Y = 1;
            if (this.f1052i0.invoke(f10, f11, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
