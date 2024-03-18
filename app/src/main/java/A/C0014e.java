package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: A.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0014e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f189Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f190Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0016f f191h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014e(AbstractC0016f abstractC0016f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f191h0 = abstractC0016f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0014e c0014e = new C0014e(this.f191h0, abstractC4825e);
        c0014e.f190Z = obj;
        return c0014e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0014e) create((B0.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f189Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f189Y = 1;
            if (this.f191h0.C0((B0.A) this.f190Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
