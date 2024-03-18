package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f1548Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f1549Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1550h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ H f1551i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175x(H h10, AbstractC4825e abstractC4825e, wf.o oVar) {
        super(2, abstractC4825e);
        this.f1550h0 = oVar;
        this.f1551i0 = h10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0175x c0175x = new C0175x(this.f1551i0, abstractC4825e, this.f1550h0);
        c0175x.f1549Z = obj;
        return c0175x;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0175x) create((P0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1548Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C c10 = this.f1551i0.f1092l;
            this.f1548Y = 1;
            if (this.f1550h0.invoke(c10, (P0) this.f1549Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
