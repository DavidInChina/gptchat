package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class G0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39798Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39799Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39799Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        G0 g02 = new G0(this.f39799Z, abstractC4825e);
        g02.f39798Y = obj;
        return g02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((G0) create((zd.n) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39799Z.l(new F0((zd.n) this.f39798Y, 0));
        return jf.y.f36177a;
    }
}
