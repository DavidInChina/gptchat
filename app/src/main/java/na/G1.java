package na;

import Qg.AbstractC1206i;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class G1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39800Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T9.a f39801Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ I1 f39802h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(T9.a aVar, I1 i12, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39801Z = aVar;
        this.f39802h0 = i12;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new G1(this.f39801Z, this.f39802h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39800Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1206i i02 = L4.a.i0(new M1.w(((C4972C) this.f39801Z).f41060o, 11));
            E1 e12 = new E1(this.f39802h0, null);
            this.f39800Y = 1;
            if (L4.a.b0(i02, e12, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
