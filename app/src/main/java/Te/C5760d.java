package te;

import Df.H;
import Fe.l;
import Ng.AbstractC1073l0;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import kf.t;
import we.C6215c;
import wf.n;
import xe.AbstractC6437z;
import xe.C6396A;
import xe.C6405J;
import xe.C6433v;

/* renamed from: te.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5760d implements AbstractC6437z {

    /* renamed from: a  reason: collision with root package name */
    public final C6405J f46125a = new C6405J();

    /* renamed from: b  reason: collision with root package name */
    public C6396A f46126b = C6396A.f49811b;

    /* renamed from: c  reason: collision with root package name */
    public final C6433v f46127c = new C6433v();

    /* renamed from: d  reason: collision with root package name */
    public Object f46128d = C6215c.f48500a;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC1073l0 f46129e = Bi.c.z();

    /* renamed from: f  reason: collision with root package name */
    public final l f46130f = H.d();

    @Override // xe.AbstractC6437z
    public final C6433v a() {
        return this.f46127c;
    }

    public final void b(Je.a aVar) {
        l lVar = this.f46130f;
        if (aVar != null) {
            lVar.e(AbstractC5766j.f46160a, aVar);
            return;
        }
        Fe.a aVar2 = AbstractC5766j.f46160a;
        lVar.getClass();
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar2);
        lVar.c().remove(aVar2);
    }

    public final void c(C6396A c6396a) {
        AbstractC3557B.c0("<set-?>", c6396a);
        this.f46126b = c6396a;
    }

    public final void d(C5760d c5760d) {
        AbstractC3557B.c0("builder", c5760d);
        this.f46129e = c5760d.f46129e;
        this.f46126b = c5760d.f46126b;
        this.f46128d = c5760d.f46128d;
        Fe.a aVar = AbstractC5766j.f46160a;
        l lVar = c5760d.f46130f;
        b((Je.a) lVar.d(aVar));
        C6405J c6405j = c5760d.f46125a;
        C6405J c6405j2 = this.f46125a;
        N.A0(c6405j2, c6405j);
        c6405j2.c(c6405j2.f49846h);
        H.n(this.f46127c, c5760d.f46127c);
        l lVar2 = this.f46130f;
        AbstractC3557B.c0("<this>", lVar2);
        AbstractC3557B.c0("other", lVar);
        for (Fe.a aVar2 : t.K2(lVar.c().keySet())) {
            AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>", aVar2);
            lVar2.e(aVar2, lVar.b(aVar2));
        }
    }

    public final void e(n nVar) {
        C6405J c6405j = this.f46125a;
        nVar.invoke(c6405j, c6405j);
    }
}
