package oa;

import com.google.android.gms.internal.play_billing.N;
import fa.AbstractC2965B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC2965B f41138Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC2965B abstractC2965B, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41138Y = abstractC2965B;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f41138Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((m) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        ((fa.n) this.f41138Y).a();
        return jf.y.f36177a;
    }
}
