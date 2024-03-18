package Z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class A0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22431Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22432Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f22433h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1700a0 f22434i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(wf.o oVar, AbstractC1700a0 abstractC1700a0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22433h0 = oVar;
        this.f22434i0 = abstractC1700a0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        A0 a02 = new A0(this.f22433h0, this.f22434i0, abstractC4825e);
        a02.f22432Z = obj;
        return a02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22431Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f22431Y = 1;
            if (this.f22433h0.invoke((Ng.F) this.f22432Z, this.f22434i0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
