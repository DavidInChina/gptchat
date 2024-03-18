package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class U0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1192Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1193Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ V0 f1194h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(V0 v02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1194h0 = v02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        U0 u02 = new U0(this.f1194h0, abstractC4825e);
        u02.f1193Z = obj;
        return u02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1192Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            T0 t02 = new T0(this.f1194h0, null);
            this.f1192Y = 1;
            if (((B0.P) ((B0.A) this.f1193Z)).A0(t02, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
