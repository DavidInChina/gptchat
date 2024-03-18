package ob;

import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import jf.y;
import kb.AbstractC4232q;
import kb.C4226k;
import lb.C4368e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class k extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f41229Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f41230Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4232q f41231h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, AbstractC4232q abstractC4232q, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f41230Z = lVar;
        this.f41231h0 = abstractC4232q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new k(this.f41230Z, this.f41231h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((k) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41229Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            l lVar = this.f41230Z;
            C4368e c4368e = lVar.f41234l;
            String str = ((C4226k) this.f41231h0).f37258a;
            boolean c10 = ((G) lVar.f41235m).c(ExperimentKey.C2PAEnabled.INSTANCE);
            h hVar = new h(lVar, null);
            i iVar = new i(lVar, null);
            j jVar = new j(lVar, null);
            this.f41229Y = 1;
            if (c4368e.a(str, c10, hVar, iVar, jVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
