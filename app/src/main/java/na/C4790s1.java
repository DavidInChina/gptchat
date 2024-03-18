package na;

import Z8.AbstractC1809m0;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4790s1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ B1 f40112Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z f40113Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4790s1(B1 b1, Z z10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40112Y = b1;
        this.f40113Z = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4790s1(this.f40112Y, this.f40113Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        ((C4790s1) create((AbstractC4825e) obj)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Sc.n nVar = ((O) this.f40113Z).f39844a;
        B1 b1 = this.f40112Y;
        b1.getClass();
        AbstractC1809m0.a().b(Z8.N0.f23263c, AbstractC4268D.a1(new C3959i("model", nVar), new C3959i("category", nVar.f16533a)));
        B1.t(b1, true, nVar, false, 4);
        return jf.y.f36177a;
    }
}
