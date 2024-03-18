package bb;

import cb.C2350T;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class U extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f25742Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2350T f25743Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C2350T c2350t, AbstractC4825e abstractC4825e, wf.k kVar) {
        super(2, abstractC4825e);
        this.f25742Y = kVar;
        this.f25743Z = c2350t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new U(this.f25743Z, abstractC4825e, this.f25742Y);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((U) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f25742Y.invoke(new O(this.f25743Z));
        return jf.y.f36177a;
    }
}
