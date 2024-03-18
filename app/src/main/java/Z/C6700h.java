package z;

import Z.l1;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6700h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51263Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51264Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6694e f51265h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l1 f51266i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ l1 f51267j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6700h(Object obj, C6694e c6694e, l1 l1Var, l1 l1Var2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51264Z = obj;
        this.f51265h0 = c6694e;
        this.f51266i0 = l1Var;
        this.f51267j0 = l1Var2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6700h(this.f51264Z, this.f51265h0, this.f51266i0, this.f51267j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6700h) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51263Y;
        C6694e c6694e = this.f51265h0;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            if (!AbstractC3557B.K(this.f51264Z, c6694e.f51232e.getValue())) {
                C6697f0 c6697f0 = AbstractC6704j.f51301a;
                this.f51263Y = 1;
                if (C6694e.c(this.f51265h0, this.f51264Z, (AbstractC6714o) this.f51266i0.getValue(), null, this, 12) == enumC5000a) {
                    return enumC5000a;
                }
            }
            return jf.y.f36177a;
        }
        C6697f0 c6697f02 = AbstractC6704j.f51301a;
        wf.k kVar = (wf.k) this.f51267j0.getValue();
        if (kVar != null) {
            kVar.invoke(c6694e.e());
        }
        return jf.y.f36177a;
    }
}
