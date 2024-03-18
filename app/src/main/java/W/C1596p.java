package W;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1596p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20269Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f20270Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20271h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f20272i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596p(wf.n nVar, Object obj, Ng.F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20270Z = nVar;
        this.f20271h0 = obj;
        this.f20272i0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1596p(this.f20270Z, this.f20271h0, this.f20272i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1596p) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20269Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f20269Y = 1;
            if (this.f20270Z.invoke(this.f20271h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        Ad.l.P(this.f20272i0, new CancellationException());
        return jf.y.f36177a;
    }
}
