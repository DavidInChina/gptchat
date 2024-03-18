package sb;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes.dex */
public final class j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f45511Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f45512Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f45513h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x xVar, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45512Z = xVar;
        this.f45513h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new j(this.f45512Z, this.f45513h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45511Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f45512Z.f812i;
            C5609i c5609i = new C5609i(this.f45513h0, null);
            this.f45511Y = 1;
            if (L4.a.b0(c5426p, c5609i, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
