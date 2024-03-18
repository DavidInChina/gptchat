package I9;

import Z8.AbstractC1809m0;
import Z8.C1784a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class M extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f8211Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8212Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f8212Z = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new M(this.f8212Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((M) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8211Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f8211Y = 1;
            C0758g0 c0758g0 = this.f8212Z;
            c0758g0.getClass();
            AbstractC1809m0.a().b(C1784a.f23331l, kf.w.f37484Y);
            Object a5 = ((rc.Q) c0758g0.f8348l).a(K.f8193Z, this);
            if (a5 != enumC5000a) {
                a5 = yVar;
            }
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
