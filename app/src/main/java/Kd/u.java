package Kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9768Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I f9769Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9769Z = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f9769Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((jf.y) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9768Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f9768Y = 1;
            if (this.f9769Z.d(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
