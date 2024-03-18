package Qd;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qd.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1188g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14603Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ com.segment.analytics.kotlin.core.a f14604Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f14605h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188g(com.segment.analytics.kotlin.core.a aVar, i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14604Z = aVar;
        this.f14605h0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1188g(this.f14604Z, this.f14605h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1188g) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14603Y;
        com.segment.analytics.kotlin.core.a aVar = this.f14604Z;
        i iVar = this.f14605h0;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Li.q e10 = iVar.f14611Z.e();
            this.f14603Y = 1;
            if (aVar.a(e10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        r.f.M(iVar, "processing event on " + Thread.currentThread().getName());
        Rd.l i11 = iVar.i();
        i11.getClass();
        AbstractC3557B.c0("incomingEvent", aVar);
        com.segment.analytics.kotlin.core.a c10 = i11.c(Rd.h.f15444Z, i11.c(Rd.h.f15443Y, aVar));
        i11.c(Rd.h.f15445h0, c10);
        i11.c(Rd.h.f15446i0, c10);
        return jf.y.f36177a;
    }
}
