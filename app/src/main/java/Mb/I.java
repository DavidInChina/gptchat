package Mb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class I extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11798Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f11799Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(S s10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11799Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new I(this.f11799Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11798Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f11798Y = 1;
            if (S.n(this.f11799Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}