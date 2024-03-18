package Z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class J0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22502Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f22503Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22503Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new J0(this.f22503Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22502Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f22502Y = 1;
            if (R4.b.p0(16L, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return this.f22503Z.invoke(new Long(System.nanoTime()));
    }
}
