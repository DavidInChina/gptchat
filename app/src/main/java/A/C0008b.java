package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: A.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0008b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f169Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0012d f170Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D.p f171h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008b(AbstractC0012d abstractC0012d, D.p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f170Z = abstractC0012d;
        this.f171h0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0008b(this.f170Z, this.f171h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0008b) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f169Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            D.m mVar = this.f170Z.f181u0;
            this.f169Y = 1;
            if (mVar.b(this.f171h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
