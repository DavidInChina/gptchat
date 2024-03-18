package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1220x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14940Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14941Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14942h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220x(AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14942h0 = abstractC1206i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1220x c1220x = new C1220x(this.f14942h0, abstractC4825e);
        c1220x.f14941Z = obj;
        return c1220x;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1220x) create((Pg.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14940Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            r rVar = new r((Pg.A) this.f14941Z, 1);
            this.f14940Y = 1;
            if (this.f14942h0.b(rVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
