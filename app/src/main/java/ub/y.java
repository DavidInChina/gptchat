package ub;

import Ng.F;
import Z.AbstractC1708e0;
import Z.U0;
import Z.l1;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f46613Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f46614Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ u9.b f46615h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AbstractC1708e0 abstractC1708e0, l1 l1Var, u9.b bVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46613Y = abstractC1708e0;
        this.f46614Z = l1Var;
        this.f46615h0 = bVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new y(this.f46613Y, this.f46614Z, this.f46615h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((y) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        float f6 = AbstractC5875D.f46525a;
        if (((U0) this.f46613Y).h() != 0) {
            boolean a5 = ((C5876E) this.f46614Z.getValue()).f46529c.a();
            u9.b bVar = this.f46615h0;
            if (a5) {
                bVar.b();
            } else {
                bVar.f();
            }
        }
        return jf.y.f36177a;
    }
}
