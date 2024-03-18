package zc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6819F extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51828Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51829Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6819F(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51829Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6819F c6819f = new C6819F(this.f51829Z, abstractC4825e);
        c6819f.f51828Y = obj;
        return c6819f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6819F) create((Dd.K) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f51829Z.l(new nb.d(28, (Dd.K) this.f51828Y));
        return jf.y.f36177a;
    }
}
