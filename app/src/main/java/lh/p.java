package lh;

import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f38495Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f38496Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f38497h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f38498i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j6, AbstractC4825e abstractC4825e, AbstractC1206i abstractC1206i) {
        super(2, abstractC4825e);
        this.f38497h0 = abstractC1206i;
        this.f38498i0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        p pVar = new p(this.f38498i0, abstractC4825e, this.f38497h0);
        pVar.f38496Z = obj;
        return pVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38495Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C4496o c4496o = new C4496o((AbstractC1207j) this.f38496Z, this.f38498i0);
            this.f38495Y = 1;
            if (this.f38497h0.b(c4496o, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
