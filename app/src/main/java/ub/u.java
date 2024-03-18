package ub;

import Ng.F;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.U0;
import ca.EnumC2323o;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ EnumC2323o f46599Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f46600Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46601h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(EnumC2323o enumC2323o, AbstractC1708e0 abstractC1708e0, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46599Y = enumC2323o;
        this.f46600Z = abstractC1708e0;
        this.f46601h0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new u(this.f46599Y, this.f46600Z, this.f46601h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((u) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        if (this.f46599Y.a() && ((U0) this.f46600Z).h() != 0) {
            Yg.p.Companion.getClass();
            this.f46601h0.setValue(new Yg.p(AbstractC6463a.n("instant(...)")));
        }
        return jf.y.f36177a;
    }
}
