package zc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class z extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51955Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51956Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Q q10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51956Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new z(this.f51956Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((z) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51955Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Kd.I i11 = this.f51956Z.f51860l;
            this.f51955Y = 1;
            if (i11.h(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
