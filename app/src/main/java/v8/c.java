package V8;

import B0.u;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import wf.n;
import wf.o;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18445Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f18446Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f18447h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ u f18448i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, m mVar, u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18446Z = oVar;
        this.f18447h0 = mVar;
        this.f18448i0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new c(this.f18446Z, this.f18447h0, this.f18448i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18445Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5251c c5251c = new C5251c(this.f18448i0.f1672c);
            this.f18445Y = 1;
            if (this.f18446Z.invoke(this.f18447h0, c5251c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
