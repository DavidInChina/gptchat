package Mb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Q extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f11827Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f11828Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f11828Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new Q(this.f11828Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((Q) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11827Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f11827Y = 1;
            if (S.m(this.f11828Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
