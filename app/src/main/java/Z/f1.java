package Z;

import Qg.AbstractC1206i;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class f1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22617Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22618Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4831k f22619h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f22620i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(AbstractC4831k abstractC4831k, AbstractC1206i abstractC1206i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22619h0 = abstractC4831k;
        this.f22620i0 = abstractC1206i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f1 f1Var = new f1(this.f22619h0, this.f22620i0, abstractC4825e);
        f1Var.f22618Z = obj;
        return f1Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((C1733r0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22617Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1733r0 c1733r0 = (C1733r0) this.f22618Z;
            C4832l c4832l = C4832l.f40334Y;
            AbstractC4831k abstractC4831k = this.f22619h0;
            boolean K10 = AbstractC3557B.K(abstractC4831k, c4832l);
            AbstractC1206i abstractC1206i = this.f22620i0;
            if (K10) {
                d1 d1Var = new d1(c1733r0, 0);
                this.f22617Y = 1;
                if (abstractC1206i.b(d1Var, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                e1 e1Var = new e1(abstractC1206i, c1733r0, null);
                this.f22617Y = 2;
                if (Ad.l.n1(this, abstractC4831k, e1Var) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
