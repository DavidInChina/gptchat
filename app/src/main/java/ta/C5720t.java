package ta;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6783B;

/* renamed from: ta.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5720t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46008Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F.J f46009Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6783B f46010h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5720t(F.J j6, C6783B c6783b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46009Z = j6;
        this.f46010h0 = c6783b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5720t(this.f46009Z, this.f46010h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5720t) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46008Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f46008Y = 1;
            if (F.J.j(this.f46009Z, this.f46010h0.f51762e.size() - 1, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
