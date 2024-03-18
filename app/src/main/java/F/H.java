package F;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6697f0;
import z.C6716p;

/* loaded from: classes.dex */
public final class H extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f4866Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f4867Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4867Z = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new H(this.f4867Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f4866Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C6716p c6716p = this.f4867Z.f4896z;
            Float f6 = new Float(0.0f);
            C6697f0 u10 = AbstractC6696f.u(0.0f, 400.0f, new Float(0.5f), 1);
            this.f4866Y = 1;
            if (AbstractC6696f.h(c6716p, f6, u10, true, null, this, 8) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
