package L;

import B.C0115c1;
import B.J1;
import B.Z1;
import Z.AbstractC1710f0;
import Z.l1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class I0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9967Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f9968Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f9969h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f9970i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.m f9971j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l1 f9972k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(Ng.F f6, AbstractC1710f0 abstractC1710f0, D.m mVar, l1 l1Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9969h0 = f6;
        this.f9970i0 = abstractC1710f0;
        this.f9971j0 = mVar;
        this.f9972k0 = l1Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        I0 i02 = new I0(this.f9969h0, this.f9970i0, this.f9971j0, this.f9972k0, abstractC4825e);
        i02.f9968Z = obj;
        return i02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9967Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            B0.A a5 = (B0.A) this.f9968Z;
            H0 h02 = new H0(this.f9969h0, this.f9970i0, this.f9971j0, null);
            y.T t10 = new y.T(this.f9972k0, 1);
            this.f9967Y = 1;
            B.B0 b02 = Z1.f1251a;
            Object e02 = Ad.l.e0(new J1(a5, h02, t10, new C0115c1(a5), null), this);
            if (e02 != enumC5000a) {
                e02 = yVar;
            }
            if (e02 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
