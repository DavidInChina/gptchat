package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: A.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0022i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f213Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f214Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0026k f215h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022i(C0026k c0026k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f215h0 = c0026k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0022i c0022i = new C0022i(this.f215h0, abstractC4825e);
        c0022i.f214Z = obj;
        return c0022i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0022i) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f213Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0020h c0020h = new C0020h(this.f215h0, null);
            this.f213Y = 1;
            if (Df.H.q((B0.A) this.f214Z, c0020h, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
