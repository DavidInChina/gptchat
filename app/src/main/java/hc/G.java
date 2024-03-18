package hc;

import h9.C3338c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;

/* loaded from: classes.dex */
public final class G extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32145Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f32146Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f32146Z = h10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        G g10 = new G(this.f32146Z, abstractC4825e);
        g10.f32145Y = obj;
        return g10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((G) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f32146Z.l(new C3338c((C6205s) this.f32145Y, 3));
        return jf.y.f36177a;
    }
}
