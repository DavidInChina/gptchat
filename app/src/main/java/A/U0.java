package A;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;

/* loaded from: classes2.dex */
public final class U0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f116Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f117Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z0 f118h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f119i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f120j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(boolean z10, Z0 z02, float f6, float f10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f117Z = z10;
        this.f118h0 = z02;
        this.f119i0 = f6;
        this.f120j0 = f10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new U0(this.f117Z, this.f118h0, this.f119i0, this.f120j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object k10;
        Object k11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f116Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            boolean z10 = this.f117Z;
            Z0 z02 = this.f118h0;
            if (z10) {
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState", z02);
                this.f116Y = 1;
                k11 = Ng.H.k(z02, this.f119i0, AbstractC6696f.u(0.0f, 0.0f, null, 7), this);
                if (k11 == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState", z02);
                this.f116Y = 2;
                k10 = Ng.H.k(z02, this.f120j0, AbstractC6696f.u(0.0f, 0.0f, null, 7), this);
                if (k10 == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
