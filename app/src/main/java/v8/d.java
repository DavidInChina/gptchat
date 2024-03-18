package V8;

import B0.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import wf.n;

/* loaded from: classes2.dex */
public final class d extends AbstractC5161h implements n {

    /* renamed from: Z  reason: collision with root package name */
    public int f18449Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18450h0;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.h, nf.e, V8.d] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5161h = new AbstractC5161h(2, abstractC4825e);
        abstractC5161h.f18450h0 = obj;
        return abstractC5161h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18449Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f18449Z = 1;
            obj = j.b((N) this.f18450h0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
