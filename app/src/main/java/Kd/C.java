package Kd;

import Dd.C0398t;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9649Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I f9650Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Double f9651h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0398t f9652i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(I i10, Double d10, C0398t c0398t, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9650Z = i10;
        this.f9651h0 = d10;
        this.f9652i0 = c0398t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C(this.f9650Z, this.f9651h0, this.f9652i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9649Y;
        I i11 = this.f9650Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Pc.g gVar = i11.f9691n;
            StringBuilder sb2 = new StringBuilder("Delaying thinking state by ");
            Double d10 = this.f9651h0;
            sb2.append(d10);
            sb2.append(" seconds");
            W.F(gVar, sb2.toString(), null, 6);
            i11.j(new C0398t(Dd.N.f3527i0, d10));
            Mg.a aVar = Mg.b.f12127Z;
            long e10 = Mg.b.e(Df.H.w0(d10.doubleValue(), Mg.d.f12134i0));
            this.f9649Y = 1;
            if (R4.b.p0(e10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        boolean z10 = I.f9668I;
        i11.j(this.f9652i0);
        return jf.y.f36177a;
    }
}
