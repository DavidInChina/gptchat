package mb;

import jf.C3963m;
import ld.C4428a;
import nd.C4812a;
import nf.C4832l;
import v2.AbstractC5964c;
import v2.AbstractC5968g;
import v2.AbstractC5969h;
import x8.W;

/* renamed from: mb.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4607t implements AbstractC5968g {

    /* renamed from: a  reason: collision with root package name */
    public final nd.l f39099a;

    /* renamed from: b  reason: collision with root package name */
    public final Kc.b f39100b;

    /* renamed from: c  reason: collision with root package name */
    public final C4610w f39101c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f39102d = R4.b.D1(new d9.h(13, this));

    /* renamed from: e  reason: collision with root package name */
    public final Ng.L f39103e;

    public C4607t(C4428a c4428a, nd.l lVar, Kc.b bVar, C4610w c4610w, C4812a c4812a) {
        this.f39099a = lVar;
        this.f39100b = bVar;
        this.f39101c = c4610w;
        this.f39103e = Ad.l.L(c4428a, null, new C4606s(this, c4812a, null), 3);
    }

    @Override // v2.AbstractC5968g
    public final AbstractC5969h a() {
        AbstractC5969h abstractC5969h;
        w2.d dVar;
        long j6;
        v2.o oVar = (v2.o) Ad.l.a1(C4832l.f40334Y, new C4605r(this, null));
        w2.t tVar = (w2.t) this.f39102d.getValue();
        w2.t tVar2 = (w2.t) this.f39102d.getValue();
        if (oVar != null) {
            abstractC5969h = oVar.a();
        } else {
            abstractC5969h = null;
        }
        tVar.getClass();
        if (abstractC5969h == null) {
            dVar = null;
        } else {
            tVar2.getClass();
            dVar = new w2.d(tVar2);
        }
        w2.e eVar = new w2.e(tVar, abstractC5969h, new AbstractC5964c(false), dVar, 2);
        Pc.c a5 = Pc.e.a();
        w2.t tVar3 = (w2.t) eVar.f47663a;
        synchronized (tVar3) {
            j6 = tVar3.f47729h;
        }
        W.F(a5, android.gov.nist.core.a.f("createDataSource ", j6), null, 6);
        return new C4588a(eVar);
    }
}
