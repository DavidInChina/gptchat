package L;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.C6669J;
import z.C6694e;

/* loaded from: classes2.dex */
public final class y0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10357Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f10358Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(C6694e c6694e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10358Z = c6694e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new y0(this.f10358Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10357Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Float f6 = new Float(1.0f);
            this.f10357Y = 1;
            if (this.f10358Z.f(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        Float f10 = new Float(0.0f);
        C6669J c6669j = A0.f9856a;
        this.f10357Y = 2;
        if (C6694e.c(this.f10358Z, f10, c6669j, null, this, 12) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
