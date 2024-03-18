package L;

import B.Y0;
import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* loaded from: classes.dex */
public final class H0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public int f9951Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Y0 f9952Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ long f9953h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f9954i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f9955j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D.m f9956k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(Ng.F f6, AbstractC1710f0 abstractC1710f0, D.m mVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f9954i0 = f6;
        this.f9955j0 = abstractC1710f0;
        this.f9956k0 = mVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6 = ((C5251c) obj2).f43623a;
        H0 h02 = new H0(this.f9954i0, this.f9955j0, this.f9956k0, (AbstractC4825e) obj3);
        h02.f9952Z = (Y0) obj;
        h02.f9953h0 = j6;
        return h02.invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9951Y;
        Ng.F f6 = this.f9954i0;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Y0 y02 = this.f9952Z;
            Ad.l.O0(f6, null, null, new F0(this.f9955j0, this.f9953h0, this.f9956k0, null), 3);
            this.f9951Y = 1;
            obj = y02.k0(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Ad.l.O0(f6, null, null, new G0(this.f9955j0, ((Boolean) obj).booleanValue(), this.f9956k0, null), 3);
        return jf.y.f36177a;
    }
}
