package B;

import B0.EnumC0195l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes2.dex */
public final class N1 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f1140Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1141h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [B.N1, pf.h, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5161h = new AbstractC5161h(2, abstractC4825e);
        abstractC5161h.f1141h0 = obj;
        return abstractC5161h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N1) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1140Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f1140Z = 1;
            obj = Z1.e((B0.N) this.f1141h0, EnumC0195l.f1657Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
