package W;

import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1635x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20583Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f20584Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.p f20585h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C f20586i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1635x(wf.p pVar, C c10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20585h0 = pVar;
        this.f20586i0 = c10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1635x c1635x = new C1635x(this.f20585h0, this.f20586i0, abstractC4825e);
        c1635x.f20584Z = obj;
        return c1635x;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1635x) create((C3959i) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20583Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C3959i c3959i = (C3959i) this.f20584Z;
            C1645z c1645z = this.f20586i0.f19004m;
            this.f20583Y = 1;
            if (this.f20585h0.h(c1645z, (F1) c3959i.f36155Y, c3959i.f36156Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
