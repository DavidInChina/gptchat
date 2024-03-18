package f4;

import Ng.F;
import Ng.L;
import Ng.Q;
import Sg.u;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import s4.AbstractC5575a;

/* loaded from: classes.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29613Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29614Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q4.j f29615h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ q f29616i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, q4.j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29615h0 = jVar;
        this.f29616i0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        m mVar = new m(this.f29616i0, this.f29615h0, abstractC4825e);
        mVar.f29614Z = obj;
        return mVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29613Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Tg.e eVar = Q.f12904a;
            Og.d dVar = ((Og.d) u.f16684a).f13759j0;
            q qVar = this.f29616i0;
            q4.j jVar = this.f29615h0;
            L L10 = Ad.l.L((F) this.f29614Z, dVar, new l(qVar, jVar, null), 2);
            AbstractC5575a abstractC5575a = jVar.f43844c;
            this.f29613Y = 1;
            obj = L10.z(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
