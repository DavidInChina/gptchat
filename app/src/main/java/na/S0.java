package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x9.C6383b;
import za.C6807x;

/* loaded from: classes2.dex */
public final class S0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39865Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39866Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39866Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        S0 s02 = new S0(this.f39866Z, abstractC4825e);
        s02.f39865Y = obj;
        return s02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((S0) create((C6807x) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39866Z.l(new C6383b(13, (C6807x) this.f39865Y));
        return jf.y.f36177a;
    }
}
