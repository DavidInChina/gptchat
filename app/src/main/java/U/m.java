package U;

import A.B0;
import A.D0;
import A.F0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17362Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f17363Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f17364h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17363Z = nVar;
        this.f17364h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f17363Z, this.f17364h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17362Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            n nVar = this.f17363Z;
            F0 f02 = nVar.f17373i;
            l lVar = new l(nVar, this.f17364h0, null);
            this.f17362Y = 1;
            B0 b02 = B0.f14Y;
            f02.getClass();
            if (Ad.l.e0(new D0(b02, f02, lVar, null), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
