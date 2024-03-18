package Qd;

import Df.AbstractC0405d;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14664Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f14665Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Rd.a f14666h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i iVar, Rd.a aVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14665Z = iVar;
        this.f14666h0 = aVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f14665Z, this.f14666h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Rd.j jVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14664Y;
        Rd.a aVar = this.f14666h0;
        i iVar = this.f14665Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Li.q e10 = iVar.f14611Z.e();
            C c10 = new C(((Sd.e) aVar).f16571k0);
            AbstractC0405d b10 = kotlin.jvm.internal.C.f37623a.b(E.class);
            this.f14664Y = 1;
            if (e10.b(c10, b10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC0405d b11 = kotlin.jvm.internal.C.f37623a.b(aVar.getClass());
        iVar.getClass();
        Rd.l i11 = iVar.i();
        i11.getClass();
        Iterator it = i11.f15455a.entrySet().iterator();
        do {
            jVar = null;
            if (!it.hasNext()) {
                break;
            }
            Rd.g gVar = (Rd.g) ((Map.Entry) it.next()).getValue();
            gVar.getClass();
            Iterator it2 = gVar.f15442a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Rd.j jVar2 = (Rd.j) it2.next();
                    if (b11.r(jVar2)) {
                        AbstractC3557B.a0("null cannot be cast to non-null type T of com.segment.analytics.kotlin.core.platform.Mediator.find$lambda$3", jVar2);
                        jVar = jVar2;
                        continue;
                        break;
                    }
                }
            }
        } while (jVar == null);
        Rd.a aVar2 = jVar;
        if (aVar2 != null) {
            aVar2.f15420h0 = true;
        }
        return jf.y.f36177a;
    }
}
