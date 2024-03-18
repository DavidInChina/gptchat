package Yf;

import Mf.AbstractC0997f;
import Sf.AbstractC1385d;
import Sf.AbstractC1387f;
import Sf.C1386e;
import bg.AbstractC2193a;
import bg.AbstractC2194b;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.util.ArrayList;
import java.util.Iterator;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import pg.AbstractC5170g;
import wf.AbstractC6216a;

/* renamed from: Yf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1693e extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22327Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1694f f22328Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1693e(C1694f c1694f, int i10) {
        super(0);
        this.f22327Y = i10;
        this.f22328Z = c1694f;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        C3959i c3959i;
        int i10 = this.f22327Y;
        C1694f c1694f = this.f22328Z;
        switch (i10) {
            case 0:
                ArrayList a5 = ((C1386e) c1694f.f22331b).a();
                ArrayList arrayList = new ArrayList();
                Iterator it = a5.iterator();
                while (it.hasNext()) {
                    AbstractC2194b abstractC2194b = (AbstractC2194b) it.next();
                    C4294f c4294f = ((AbstractC1387f) abstractC2194b).f16608a;
                    if (c4294f == null) {
                        c4294f = Uf.D.f17727b;
                    }
                    AbstractC5170g c10 = c1694f.c(abstractC2194b);
                    if (c10 != null) {
                        c3959i = new C3959i(c4294f, c10);
                    } else {
                        c3959i = null;
                    }
                    if (c3959i != null) {
                        arrayList.add(c3959i);
                    }
                }
                return AbstractC4268D.k1(arrayList);
            case 1:
                return AbstractC1385d.a(R4.b.k1(R4.b.d1(((C1386e) c1694f.f22331b).f16607a))).b();
            default:
                C4291c a10 = c1694f.a();
                AbstractC2193a abstractC2193a = c1694f.f22331b;
                if (a10 == null) {
                    return Dg.m.c(Dg.l.f3686J0, abstractC2193a.toString());
                }
                Lf.e eVar = Lf.e.f11081Y;
                s3.z zVar = c1694f.f22330a;
                AbstractC0997f b10 = Lf.e.b(eVar, a10, zVar.d().j());
                if (b10 == null) {
                    Sf.q qVar = new Sf.q(R4.b.k1(R4.b.d1(((C1386e) abstractC2193a).f16607a)));
                    C3636c1 c3636c1 = ((Xf.a) zVar.f45394a).f21962k.f21991a;
                    if (c3636c1 != null) {
                        b10 = c3636c1.p(qVar);
                        if (b10 == null) {
                            b10 = R4.b.v0(zVar.d(), C4290b.j(a10), ((Xf.a) zVar.f45394a).f21955d.c().f50021l);
                        }
                    } else {
                        AbstractC3557B.C2("resolver");
                        throw null;
                    }
                }
                return b10.n();
        }
    }
}
