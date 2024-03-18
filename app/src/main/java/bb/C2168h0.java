package bb;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import cb.C2334C;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: bb.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2168h0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2334C f25828Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l0 f25829Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168h0(C2334C c2334c, l0 l0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25828Y = c2334c;
        this.f25829Z = l0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2168h0(this.f25828Y, this.f25829Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C2168h0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        AbstractC1805k0 a5 = AbstractC1809m0.a();
        Z8.L l10 = Z8.L.f23258c;
        C3959i c3959i = new C3959i("gizmo_id", this.f25828Y.f26438a);
        l0 l0Var = this.f25829Z;
        a5.b(l10, AbstractC4268D.a1(c3959i, new C3959i("search_term", l0Var.f25868a), new C3959i("search_id", l0Var.f25870c)));
        return jf.y.f36177a;
    }
}
