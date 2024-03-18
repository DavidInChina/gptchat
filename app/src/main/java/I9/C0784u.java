package I9;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: I9.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.k f8453Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0775p f8454Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0784u(wf.k kVar, AbstractC0775p abstractC0775p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8453Y = kVar;
        this.f8454Z = abstractC0775p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0784u(this.f8453Y, this.f8454Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0784u) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f8453Y.invoke(new C0793y0(((J0) this.f8454Z).f8187a));
        return jf.y.f36177a;
    }
}
