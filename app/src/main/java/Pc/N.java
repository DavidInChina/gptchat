package pc;

import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f42922Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ b0 f42923Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f42924h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f42925i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f42926j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f42927k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(b0 b0Var, Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, AbstractC1708e0 abstractC1708e0, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42923Z = b0Var;
        this.f42924h0 = fVar;
        this.f42925i0 = abstractActivityC4532l;
        this.f42926j0 = abstractC1708e0;
        this.f42927k0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new N(this.f42923Z, this.f42924h0, this.f42925i0, this.f42926j0, this.f42927k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f42922Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5426p c5426p = this.f42923Z.f812i;
            M m10 = new M(this.f42924h0, this.f42925i0, this.f42926j0, this.f42927k0, null);
            this.f42922Y = 1;
            if (L4.a.b0(c5426p, m10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
