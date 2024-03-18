package V;

import N.W;
import Ng.F;
import Qg.AbstractC1206i;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17925Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17926Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D.l f17927h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ u f17928i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D.l lVar, u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17927h0 = lVar;
        this.f17928i0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f17927h0, this.f17928i0, abstractC4825e);
        fVar.f17926Z = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17925Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC1206i a5 = this.f17927h0.a();
            W w10 = new W(this.f17928i0, 1, (F) this.f17926Z);
            this.f17925Y = 1;
            if (a5.b(w10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
