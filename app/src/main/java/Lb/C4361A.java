package lb;

import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import fa.C2969F;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5436z;
import wd.v0;

/* renamed from: lb.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4361A extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f37921Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f37922Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4361A(K k10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f37922Z = k10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4361A(this.f37922Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4361A) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37921Y;
        K k10 = this.f37922Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    v0 v0Var = (v0) obj;
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            if (((com.openai.experiment.G) k10.f37959o).c(ExperimentKey.ClientActionsEnabled.INSTANCE)) {
                w wVar = new w(k10, 3);
                this.f37921Y = 1;
                obj = ((C5436z) k10.f37960p).l(wVar, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            return jf.y.f36177a;
        }
        C2969F c2969f = (C2969F) obj;
        if (c2969f != null) {
            T9.a aVar = k10.f37954j;
            this.f37921Y = 2;
            obj = ((C4972C) aVar).m(c2969f, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            v0 v0Var2 = (v0) obj;
        }
        return jf.y.f36177a;
    }
}
