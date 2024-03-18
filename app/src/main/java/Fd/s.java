package Fd;

import B.Z1;
import B0.A;
import Cd.F;
import Cd.J;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import na.L0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5276Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f5277Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ J f5278h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f5279i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(J j6, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5278h0 = j6;
        this.f5279i0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        s sVar = new s(this.f5278h0, this.f5279i0, abstractC4825e);
        sVar.f5277Z = obj;
        return sVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5276Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A a5 = (A) this.f5277Z;
            J j6 = this.f5278h0;
            AbstractC1710f0 abstractC1710f0 = this.f5279i0;
            Oc.c cVar = new Oc.c(j6, abstractC1710f0);
            L0 l02 = new L0(j6, abstractC1710f0, null, 5);
            F f6 = new F(j6, 1);
            this.f5276Y = 1;
            if (Z1.d(a5, cVar, l02, f6, this, 1) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
