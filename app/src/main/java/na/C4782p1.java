package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4782p1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40088Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40089Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z f40090h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4782p1(B1 b1, Z z10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40089Z = b1;
        this.f40090h0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4782p1(this.f40089Z, this.f40090h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4782p1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40088Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            String str = ((L) this.f40090h0).f39820a;
            this.f40088Y = 1;
            if (B1.q(this.f40089Z, str, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
