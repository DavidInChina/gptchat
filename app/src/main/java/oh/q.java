package oh;

import B.Z1;
import B0.EnumC0195l;
import B0.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes.dex */
public final class q extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f41442Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f41443h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.h, oh.q, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5161h = new AbstractC5161h(2, abstractC4825e);
        abstractC5161h.f41443h0 = obj;
        return abstractC5161h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41442Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f41442Z = 1;
            obj = Z1.e((N) this.f41443h0, EnumC0195l.f1657Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
