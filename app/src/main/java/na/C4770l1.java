package na;

import cb.C2334C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.l1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4770l1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40046Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40047Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z f40048h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4770l1(B1 b1, Z z10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40047Z = b1;
        this.f40048h0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4770l1(this.f40047Z, this.f40048h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4770l1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40046Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C2334C c2334c = ((I) this.f40048h0).f39806a;
            this.f40046Y = 1;
            if (B1.p(this.f40047Z, c2334c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
