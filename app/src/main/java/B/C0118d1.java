package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118d1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1298Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1299Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0121e1 f1300h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f1301i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0118d1(C0121e1 c0121e1, wf.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1300h0 = c0121e1;
        this.f1301i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0118d1 c0118d1 = new C0118d1(this.f1300h0, this.f1301i0, abstractC4825e);
        c0118d1.f1299Z = obj;
        return c0118d1;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0118d1) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1298Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0121e1 c0121e1 = this.f1300h0;
            c0121e1.f1307b = (AbstractC0130h1) this.f1299Z;
            this.f1298Y = 1;
            if (this.f1301i0.invoke(c0121e1, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
