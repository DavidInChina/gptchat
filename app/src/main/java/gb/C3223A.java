package gb;

import Z.AbstractC1708e0;
import Z.U0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: gb.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3223A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ fa.n f31349Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ u9.b f31350Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f31351h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3223A(fa.n nVar, u9.b bVar, AbstractC1708e0 abstractC1708e0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31349Y = nVar;
        this.f31350Z = bVar;
        this.f31351h0 = abstractC1708e0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3223A(this.f31349Y, this.f31350Z, this.f31351h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C3223A) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        fa.n nVar = this.f31349Y;
        int length = nVar.f30070b.length();
        U0 u02 = (U0) this.f31351h0;
        if (length != u02.h()) {
            Af.d.f840Y.getClass();
            this.f31350Z.e(Af.d.f841Z.i().nextFloat());
            u02.i(nVar.f30070b.length());
        }
        return jf.y.f36177a;
    }
}
