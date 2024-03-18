package oh;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41470Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41471Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ x f41472h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41472h0 = xVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        w wVar = new w(this.f41472h0, abstractC4825e);
        wVar.f41471Z = obj;
        return wVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41470Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            v vVar = new v((B0.A) this.f41471Z, this.f41472h0, null);
            this.f41470Y = 1;
            if (Ad.l.e0(vVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
