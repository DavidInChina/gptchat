package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146n extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Ng.F f1419Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ float f1420Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f1421h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146n(H h10, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f1421h0 = h10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C0146n c0146n = new C0146n(this.f1421h0, (AbstractC4825e) obj3);
        c0146n.f1419Y = (Ng.F) obj;
        c0146n.f1420Z = floatValue;
        jf.y yVar = jf.y.f36177a;
        c0146n.invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Ad.l.O0(this.f1419Y, null, null, new C0143m(this.f1421h0, this.f1420Z, null), 3);
        return jf.y.f36177a;
    }
}
