package zc;

import Cd.C0329n;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ boolean f51928Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f51929Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51930h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q q10, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f51930h0 = q10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        r rVar = new r(this.f51930h0, (AbstractC4825e) obj3);
        rVar.f51928Y = booleanValue;
        rVar.f51929Z = booleanValue2;
        jf.y yVar = jf.y.f36177a;
        rVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Yg.p pVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        boolean z10 = this.f51928Y;
        boolean z11 = this.f51929Z;
        if (z10 && !z11) {
            Q q10 = this.f51930h0;
            Kd.K k10 = (Kd.K) q10.f51860l.f9686i.getValue();
            if (k10 == null || (pVar = k10.f9718f) == null) {
                Yg.p.Companion.getClass();
                pVar = new Yg.p(AbstractC6463a.n("instant(...)"));
            }
            q10.f(new C0329n(pVar));
        }
        return jf.y.f36177a;
    }
}
