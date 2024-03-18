package kb;

import com.google.android.gms.internal.play_billing.N;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37268Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4210D f37269Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f37270h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f37271i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AbstractC4210D abstractC4210D, Tc.f fVar, AbstractActivityC4532l abstractActivityC4532l, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37269Z = abstractC4210D;
        this.f37270h0 = fVar;
        this.f37271i0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new s(this.f37269Z, this.f37270h0, this.f37271i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37268Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f37269Z.f812i;
            r rVar = new r(this.f37271i0, this.f37270h0, null);
            this.f37268Y = 1;
            if (L4.a.b0(c5426p, rVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
