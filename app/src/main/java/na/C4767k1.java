package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4767k1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40015Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40016Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4767k1(B1 b1, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40016Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4767k1(this.f40016Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4767k1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40015Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f40015Y = 1;
            if (B1.n(this.f40016Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
