package Ab;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class n extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f769Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f770Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f770Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new n(this.f770Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((n) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f769Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            long j6 = r.f778a;
            this.f769Y = 1;
            if (R4.b.q0(j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f770Z.f(e.f760a);
        return y.f36177a;
    }
}
