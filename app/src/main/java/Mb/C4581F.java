package mb;

import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mb.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4581F extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4586K f39024Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4581F(C4586K c4586k, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f39024Y = c4586k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4581F(this.f39024Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C4581F) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C4586K c4586k = this.f39024Y;
        C4603p n10 = c4586k.n();
        n10.getClass();
        Tg.e eVar = Q.f12904a;
        Ad.l.O0(n10.f39079a, Sg.u.f16684a, null, new C4602o(n10, null), 2);
        c4586k.l(C4612y.f39118k0);
        return jf.y.f36177a;
    }
}
