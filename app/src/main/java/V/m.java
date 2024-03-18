package V;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f17946Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f17947Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17947Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        m mVar = new m(this.f17947Z, abstractC4825e);
        mVar.f17946Y = obj;
        return mVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        F f6 = (F) this.f17946Y;
        p pVar = this.f17947Z;
        Ad.l.O0(f6, null, null, new j(pVar, null), 3);
        Ad.l.O0(f6, null, null, new k(pVar, null), 3);
        return Ad.l.O0(f6, null, null, new l(pVar, null), 3);
    }
}
