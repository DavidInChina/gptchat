package Mb;

import Pg.EnumC1170c;
import Qg.C1194c;
import android.app.Application;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q7.AbstractC5280a;
import t7.C5682d;
import u7.AbstractC5846b;
import u7.C5850f;

/* loaded from: classes2.dex */
public final class T0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11848Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Application f11849Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X0 f11850h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(Application application, X0 x02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11849Z = application;
        this.f11850h0 = x02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new T0(this.f11849Z, this.f11850h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((T0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11848Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Lg.i iVar = Lb.c.f10979a;
            Application application = this.f11849Z;
            AbstractC3557B.c0("<this>", application);
            u7.g gVar = new u7.g(application, AbstractC5280a.f43971k, AbstractC5846b.f46450G, C5850f.f46453c);
            v7.l lVar = new v7.l();
            lVar.f47319e = new y7.b(1, gVar);
            lVar.f47316b = new C5682d[]{G7.b.f6068a};
            lVar.f47318d = 1567;
            N7.m b10 = gVar.b(1, lVar.a());
            A9.b bVar = new A9.b(2, Lb.a.f10975Y);
            b10.getClass();
            N7.l lVar2 = N7.g.f12724a;
            b10.b(lVar2, bVar);
            b10.f12736b.i(new N7.i(lVar2, new A9.a(2)));
            b10.i();
            C1194c c1194c = new C1194c(new Lb.b(application, null), C4832l.f40334Y, -2, EnumC1170c.f14192Y);
            S0 s02 = new S0(this.f11850h0, null);
            this.f11848Y = 1;
            if (L4.a.b0(c1194c, s02, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
