package dc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import uc.C5900r;
import wd.q0;
import wd.v0;

/* loaded from: classes.dex */
public final class j extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f28208Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f28209Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2624e f28210h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, AbstractC2624e abstractC2624e, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f28209Z = kVar;
        this.f28210h0 = abstractC2624e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new j(this.f28209Z, this.f28210h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((j) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f28208Y;
        k kVar = this.f28209Z;
        AbstractC2624e abstractC2624e = this.f28210h0;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            com.openai.experiment.h hVar = kVar.f28211j;
            C2623d c2623d = (C2623d) abstractC2624e;
            c2623d.getClass();
            boolean z10 = c2623d.f28202a;
            this.f28208Y = 1;
            obj = ((C5900r) hVar).b(z10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var instanceof q0) {
            kVar.f(new C2621b((q0) v0Var));
        }
        C2623d c2623d2 = (C2623d) abstractC2624e;
        c2623d2.getClass();
        c2623d2.getClass();
        return y.f36177a;
    }
}
