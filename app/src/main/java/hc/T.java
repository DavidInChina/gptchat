package hc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class T extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f32171Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U f32172Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f32172Z = u10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new T(this.f32172Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((T) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f32171Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            xd.h hVar = this.f32172Z.f32174k;
            C3406v c3406v = C3406v.f32229m0;
            this.f32171Y = 1;
            if (((rc.Q) hVar).a(c3406v, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
