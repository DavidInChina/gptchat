package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class T extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1181Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f1182Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A.B0 f1183h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1184i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u10, A.B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1182Z = u10;
        this.f1183h0 = b02;
        this.f1184i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new T(this.f1182Z, this.f1183h0, this.f1184i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1181Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            U u10 = this.f1182Z;
            A.F0 f02 = u10.f1191c;
            this.f1181Y = 1;
            f02.getClass();
            if (Ad.l.e0(new A.E0(this.f1183h0, f02, this.f1184i0, u10.f1190b, null), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
