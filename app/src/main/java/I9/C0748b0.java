package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: I9.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0748b0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8300Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8301Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748b0(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8301Z = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0748b0(this.f8301Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0748b0) create(bool, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8300Y;
        C0758g0 c0758g0 = this.f8301Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            c0758g0.l(K.f8200n0);
            this.f8300Y = 1;
            if (c0758g0.s(null, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        c0758g0.l(K.f8201o0);
        return jf.y.f36177a;
    }
}
