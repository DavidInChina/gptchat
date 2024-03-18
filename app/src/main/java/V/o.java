package V;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f17950Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f17951Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17951Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        o oVar = new o(this.f17951Z, abstractC4825e);
        oVar.f17950Y = obj;
        return oVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        return Ad.l.O0((F) this.f17950Y, null, null, new n(this.f17951Z, null), 3);
    }
}
