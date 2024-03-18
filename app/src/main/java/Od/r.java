package Od;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f13720Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f13721Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13721Z = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r(this.f13721Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13720Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f13720Y = 1;
            if (this.f13721Z.invoke(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
