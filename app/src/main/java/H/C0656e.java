package H;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: H.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0656e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6617Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B0.A f6618Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f6619h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656e(B0.A a5, F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6618Z = a5;
        this.f6619h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0656e(this.f6618Z, this.f6619h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0656e) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6617Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0655d c0655d = new C0655d(this.f6619h0, null);
            this.f6617Y = 1;
            if (Df.H.q(this.f6618Z, c0655d, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
