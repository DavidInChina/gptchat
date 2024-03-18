package M1;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f11460Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f11461Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(K k10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11461Z = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        t tVar = new t(this.f11461Z, abstractC4825e);
        tVar.f11460Y = obj;
        return tVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((K) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        K k10 = (K) this.f11460Y;
        K k11 = this.f11461Z;
        boolean z10 = false;
        if (!(k11 instanceof C0922c) && !(k11 instanceof C0929j) && k10 == k11) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
