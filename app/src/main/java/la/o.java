package la;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37916Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f37917Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f37918h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f37919i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, AbstractActivityC4532l abstractActivityC4532l, Tc.f fVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37917Z = fVar;
        this.f37918h0 = abstractActivityC4532l;
        this.f37919i0 = fVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new o(this.f37917Z, this.f37918h0, this.f37919i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37916Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f37917Z.f812i;
            n nVar = new n(this.f37918h0, this.f37919i0, null);
            this.f37916Y = 1;
            if (L4.a.b0(c5426p, nVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
