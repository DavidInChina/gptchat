package N;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12230Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12231Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f12232h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12232h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        N n10 = new N(this.f12232h0, abstractC4825e);
        n10.f12231Z = obj;
        return n10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12230Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            M m10 = new M(this.f12232h0, null);
            this.f12230Y = 1;
            if (((B0.P) ((B0.A) this.f12231Z)).A0(m10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
