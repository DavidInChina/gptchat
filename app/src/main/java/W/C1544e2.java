package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.e2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544e2 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20034Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f20035Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544e2(C1550f3 c1550f3, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20035Z = c1550f3;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1544e2(this.f20035Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1544e2) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20034Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f20034Y = 1;
            if (this.f20035Z.b(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
