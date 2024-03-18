package Rd;

import Qd.C1183b;
import Qd.m;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Map f15455a = AbstractC4268D.a1(new C3959i(h.f15443Y, new g()), new C3959i(h.f15444Z, new g()), new C3959i(h.f15445h0, new g()), new C3959i(h.f15446i0, new g()), new C3959i(h.f15447j0, new g()));

    /* renamed from: b  reason: collision with root package name */
    public Qd.i f15456b;

    public final void a(j jVar) {
        Qd.i iVar;
        try {
            iVar = this.f15456b;
        } catch (Throwable th2) {
            Qd.i iVar2 = this.f15456b;
            if (iVar2 != null) {
                AbstractC4344b.W0(iVar2, th2);
                C1183b c1183b = Qd.i.Companion;
                AbstractC3557B.s2(c1183b, "Caught Exception while setting up plugin " + jVar + ": " + th2, 1);
            } else {
                AbstractC3557B.C2("analytics");
                throw null;
            }
        }
        if (iVar != null) {
            jVar.d(iVar);
            g gVar = (g) this.f15455a.get(jVar.getType());
            if (gVar != null) {
                gVar.f15442a.add(jVar);
            }
            Qd.i iVar3 = this.f15456b;
            if (iVar3 != null) {
                m mVar = iVar3.f14611Z;
                Ad.l.O0(mVar.b(), mVar.d(), null, new k(iVar3, jVar, null), 2);
                return;
            }
            AbstractC3557B.C2("analytics");
            throw null;
        }
        AbstractC3557B.C2("analytics");
        throw null;
    }

    public final void b(wf.k kVar) {
        for (Map.Entry entry : this.f15455a.entrySet()) {
            g gVar = (g) entry.getValue();
            gVar.getClass();
            for (j jVar : gVar.f15442a) {
                try {
                    AbstractC3557B.b0("it", jVar);
                    kVar.invoke(jVar);
                } catch (Throwable th2) {
                    C1183b c1183b = Qd.i.Companion;
                    AbstractC4344b.V0(c1183b, th2);
                    AbstractC3557B.s2(c1183b, "Caught Exception applying closure to plugin: " + jVar + ": " + th2, 1);
                }
            }
        }
    }

    public final com.segment.analytics.kotlin.core.a c(h hVar, com.segment.analytics.kotlin.core.a aVar) {
        g gVar = (g) this.f15455a.get(hVar);
        if (aVar != null) {
            if (gVar != null) {
                for (j jVar : gVar.f15442a) {
                    if (aVar != null) {
                        com.segment.analytics.kotlin.core.a b10 = aVar.b();
                        try {
                            if (jVar instanceof a) {
                                jVar.a(b10);
                            } else {
                                aVar = jVar.a(b10);
                            }
                        } catch (Throwable th2) {
                            C1183b c1183b = Qd.i.Companion;
                            String str = "Caught Exception in plugin: " + th2;
                            AbstractC3557B.c0("<this>", c1183b);
                            AbstractC3557B.c0("error", str);
                            AbstractC3557B.s2(c1183b, str, 1);
                            AbstractC3557B.s2(c1183b, "Skipping plugin due to Exception: " + jVar, 2);
                        }
                    }
                }
                return aVar;
            }
            return null;
        }
        return aVar;
    }
}
