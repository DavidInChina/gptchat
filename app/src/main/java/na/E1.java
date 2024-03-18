package na;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import u9.EnumC5869a;

/* loaded from: classes.dex */
public final class E1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39789Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I1 f39790Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(I1 i12, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39790Z = i12;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        E1 e12 = new E1(this.f39790Z, abstractC4825e);
        e12.f39789Y = obj;
        return e12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((E1) create((T9.k) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        T9.k kVar = (T9.k) this.f39789Y;
        I1 i12 = this.f39790Z;
        i12.getClass();
        boolean z10 = kVar instanceof T9.f;
        u9.b bVar = i12.f39808a;
        if (z10) {
            bVar.h(EnumC5869a.f46502Z);
        } else if ((kVar instanceof T9.i) && AbstractC3557B.K(i12.f39809b, T9.j.f16977a)) {
            bVar.h(EnumC5869a.f46501Y);
        }
        i12.f39809b = kVar;
        return jf.y.f36177a;
    }
}
