package Ad;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f801Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f802Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f803h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f802Z = gVar;
        this.f803h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        e eVar = new e(this.f802Z, this.f803h0, abstractC4825e);
        eVar.f801Y = obj;
        return eVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((e) create(obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f802Z.l(new Oc.c(this.f803h0, 2, this.f801Y));
        return jf.y.f36177a;
    }
}
