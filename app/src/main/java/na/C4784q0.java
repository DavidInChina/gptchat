package na;

import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* renamed from: na.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4784q0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f40092Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f40093Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40094h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f40095i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4784q0(E0 e02, Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40093Z = e02;
        this.f40094h0 = fVar;
        this.f40095i0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4784q0(this.f40093Z, this.f40094h0, this.f40095i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4784q0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40092Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5426p c5426p = this.f40093Z.f812i;
            C4781p0 c4781p0 = new C4781p0(this.f40095i0, this.f40094h0, null);
            this.f40092Y = 1;
            if (L4.a.b0(c5426p, c4781p0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
