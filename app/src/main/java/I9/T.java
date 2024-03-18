package I9;

import ca.C2311c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class T extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f8233Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8234Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ I0 f8235h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C0758g0 c0758g0, I0 i02, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f8234Z = c0758g0;
        this.f8235h0 = i02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new T(this.f8234Z, this.f8235h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((T) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8233Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2311c c2311c = ((C0795z0) this.f8235h0).f8480a;
            this.f8233Y = 1;
            if (C0758g0.n(this.f8234Z, c2311c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
