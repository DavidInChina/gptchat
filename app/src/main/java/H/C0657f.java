package H;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: H.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0657f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6620Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6621Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f6622h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0657f(F f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6622h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0657f c0657f = new C0657f(this.f6622h0, abstractC4825e);
        c0657f.f6621Z = obj;
        return c0657f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0657f) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6620Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0656e c0656e = new C0656e((B0.A) this.f6621Z, this.f6622h0, null);
            this.f6620Y = 1;
            if (Ad.l.e0(c0656e, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
