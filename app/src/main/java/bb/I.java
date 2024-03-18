package bb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class I extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f25723Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ L f25724Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f25724Z = l10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new I(this.f25724Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((I) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f25723Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f25723Y = 1;
            if (L.m(this.f25724Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
