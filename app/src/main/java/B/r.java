package B;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1468Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f1469Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f1470h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f1471i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wf.n nVar, Object obj, Ng.F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1469Z = nVar;
        this.f1470h0 = obj;
        this.f1471i0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r(this.f1469Z, this.f1470h0, this.f1471i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1468Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f1468Y = 1;
            if (this.f1469Z.invoke(this.f1470h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        Ad.l.P(this.f1471i0, new CancellationException());
        return jf.y.f36177a;
    }
}
