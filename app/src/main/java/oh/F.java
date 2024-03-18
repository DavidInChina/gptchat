package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class F extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41376Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41377Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B0.A f41378h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ I f41379i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(B0.A a5, I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41378h0 = a5;
        this.f41379i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        F f6 = new F(this.f41378h0, this.f41379i0, abstractC4825e);
        f6.f41377Z = obj;
        return f6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41376Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Ng.F f6 = (Ng.F) this.f41377Z;
            Ng.G g10 = Ng.G.f12870i0;
            I i11 = this.f41379i0;
            Ad.l.O0(f6, null, g10, new C5012D(i11, null), 1);
            C5013E c5013e = new C5013E(i11, f6, null);
            this.f41376Y = 1;
            if (Df.H.q(this.f41378h0, c5013e, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
