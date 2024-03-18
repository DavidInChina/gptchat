package Ec;

import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f4648Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f4649Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f4650h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C c10, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f4649Z = c10;
        this.f4650h0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w(this.f4649Z, this.f4650h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((w) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        long x02;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f4648Y;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        do {
            Yg.p.Companion.getClass();
            long b10 = new Yg.p(AbstractC6463a.n("instant(...)")).b(this.f4649Z.f4601a);
            float f6 = y.f4652a;
            this.f4650h0.setValue(new Mg.b(b10));
            x02 = Df.H.x0(1, Mg.d.f12134i0);
            this.f4648Y = 1;
        } while (R4.b.q0(x02, this) != enumC5000a);
        return enumC5000a;
    }
}
