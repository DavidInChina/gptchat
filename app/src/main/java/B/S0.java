package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class S0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1174Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A1 f1175Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f1176h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(A1 a12, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1175Z = a12;
        this.f1176h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new S0(this.f1175Z, this.f1176h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1174Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            A1 a12 = this.f1175Z;
            AbstractC0168u1 abstractC0168u1 = a12.f1022a;
            A.B0 b02 = A.B0.f15Z;
            R0 r02 = new R0(a12, this.f1176h0, null);
            this.f1174Y = 1;
            if (abstractC0168u1.c(b02, r02, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
