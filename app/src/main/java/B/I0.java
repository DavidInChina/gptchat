package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1096Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1097Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J0 f1098h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1099i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(J0 j02, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1098h0 = j02;
        this.f1099i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        I0 i02 = new I0(this.f1098h0, this.f1099i0, abstractC4825e);
        i02.f1097Z = obj;
        return i02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((AbstractC0173w0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1096Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            J0 j02 = this.f1098h0;
            j02.f1111K0 = (AbstractC0173w0) this.f1097Z;
            H0 h02 = j02.f1112L0;
            this.f1096Y = 1;
            if (this.f1099i0.invoke(h02, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
