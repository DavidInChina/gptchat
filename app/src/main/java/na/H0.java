package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class H0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f39804Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39805Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39805Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        H0 h02 = new H0(this.f39805Z, abstractC4825e);
        h02.f39804Y = ((Boolean) obj).booleanValue();
        return h02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jf.y yVar = jf.y.f36177a;
        ((H0) create(bool, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f39805Z.l(new J.c(4, this.f39804Y));
        return jf.y.f36177a;
    }
}
