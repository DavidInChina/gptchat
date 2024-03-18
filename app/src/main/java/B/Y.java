package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class Y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1239Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0108a0 f1240Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A.B0 f1241h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1242i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0108a0 c0108a0, A.B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1240Z = c0108a0;
        this.f1241h0 = b02;
        this.f1242i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Y(this.f1240Z, this.f1241h0, this.f1242i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1239Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0108a0 c0108a0 = this.f1240Z;
            A.F0 f02 = c0108a0.f1256c;
            X x10 = new X(c0108a0, this.f1242i0, null);
            this.f1239Y = 1;
            f02.getClass();
            if (Ad.l.e0(new A.E0(this.f1241h0, f02, x10, c0108a0.f1255b, null), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
