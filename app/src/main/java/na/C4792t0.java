package na;

import a9.AbstractC1936a;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import ya.AbstractC6572t;

/* renamed from: na.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4792t0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f40114Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6572t f40115Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40116h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1936a f40117i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f40118j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4792t0(AbstractActivityC4532l abstractActivityC4532l, AbstractC1936a abstractC1936a, AbstractC6572t abstractC6572t, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40115Z = abstractC6572t;
        this.f40116h0 = fVar;
        this.f40117i0 = abstractC1936a;
        this.f40118j0 = abstractActivityC4532l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4792t0(this.f40118j0, this.f40117i0, this.f40115Z, this.f40116h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4792t0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40114Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC6572t abstractC6572t = this.f40115Z;
            C5426p c5426p = abstractC6572t.f812i;
            C4789s0 c4789s0 = new C4789s0(this.f40118j0, this.f40117i0, abstractC6572t, this.f40116h0, null);
            this.f40114Y = 1;
            if (L4.a.b0(c5426p, c4789s0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
