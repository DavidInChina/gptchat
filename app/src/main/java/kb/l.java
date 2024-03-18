package Kb;

import F.J;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9611Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f9612Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(J j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9612Z = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new l(this.f9612Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9611Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f9611Y = 1;
            if (J.j(this.f9612Z, 0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
