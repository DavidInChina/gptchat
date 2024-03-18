package Z8;

import Qd.C1185d;
import Qd.C1187f;
import android.app.Application;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import eh.AbstractC2904d;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import jf.C3959i;
import jh.L1;
import kf.AbstractC4268D;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class n1 implements AbstractC1805k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Qd.i f23394a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [Rd.j, java.lang.Object] */
    public n1(Application application, Vc.y yVar) {
        Qd.i iVar = new Qd.i(new Qd.k(application, yVar.f18576k, yVar.f18577l));
        Sd.e eVar = new Sd.e();
        iVar.f(new Object());
        iVar.f(new Od.u());
        iVar.f(new k1(0));
        iVar.f(eVar);
        Qd.m mVar = iVar.f14611Z;
        Ad.l.O0(mVar.b(), mVar.d(), null, new Qd.v(iVar, eVar, null), 2);
        Qd.i.Companion.getClass();
        Qd.i.f14608l0 = true;
        iVar.f14615k0 = true;
        Ad.l.O0(mVar.b(), mVar.d(), null, new C1185d(iVar, true, null), 2);
        Qd.i.f14609m0 = new L1(0);
        this.f23394a = iVar;
    }

    @Override // Z8.AbstractC1805k0
    public final void a(String str, String str2, String str3, boolean z10, boolean z11, String str4) {
        x8.W.F(Pc.e.a(), android.gov.nist.core.a.k("SegmentAnalytics update session: ", str, ", ", str3), null, 6);
        if (str == null) {
            str = "";
        }
        C3959i[] c3959iArr = new C3959i[5];
        if (str3 == null) {
            str3 = "";
        }
        c3959iArr[0] = new C3959i("email", str3);
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        c3959iArr[1] = new C3959i("workspace_id", str2);
        c3959iArr[2] = new C3959i("account_has_plus", Boolean.valueOf(z10));
        c3959iArr[3] = new C3959i("has_active_subscription", Boolean.valueOf(z11));
        if (str4 == null) {
            str4 = "";
        }
        c3959iArr[4] = new C3959i("plan_type", str4);
        Map a12 = AbstractC4268D.a1(c3959iArr);
        gh.d dVar = Vd.c.f18588a.f29417b;
        Df.z zVar = Df.z.f3648c;
        Df.z h10 = Cf.h.h(kotlin.jvm.internal.C.a(String.class));
        Df.z h11 = Cf.h.h(kotlin.jvm.internal.C.a(Object.class));
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        KSerializer F12 = Bi.c.F1(dVar, d10.k(d10.b(Map.class), Arrays.asList(h10, h11)));
        Qd.i iVar = this.f23394a;
        iVar.getClass();
        kotlinx.serialization.json.c g10 = AbstractC2911k.g(AbstractC2904d.f29415d.c(F12, a12));
        Qd.m mVar = iVar.f14611Z;
        Ad.l.O0(mVar.b(), mVar.d(), null, new C1187f(iVar, str, g10, null), 2);
        iVar.j(new IdentifyEvent(str, g10));
    }

    @Override // Z8.AbstractC1805k0
    public final void b(AbstractC1831y abstractC1831y, Map map) {
        AbstractC3557B.c0("event", abstractC1831y);
        AbstractC3557B.c0(DiagnosticsEntry.Event.PROPERTIES_KEY, map);
        Pc.c a5 = Pc.e.a();
        x8.W.F(a5, "SegmentAnalytics track event: " + abstractC1831y + ", properties: " + map, null, 6);
        gh.d dVar = Vd.c.f18588a.f29417b;
        Df.z zVar = Df.z.f3648c;
        Df.z h10 = Cf.h.h(kotlin.jvm.internal.C.a(String.class));
        Df.z h11 = Cf.h.h(kotlin.jvm.internal.C.a(Object.class));
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        KSerializer F12 = Bi.c.F1(dVar, d10.k(d10.b(Map.class), Arrays.asList(h10, h11)));
        Qd.i iVar = this.f23394a;
        iVar.getClass();
        String str = abstractC1831y.f23420a;
        AbstractC3557B.c0("name", str);
        iVar.k(str, AbstractC2911k.g(AbstractC2904d.f29415d.c(F12, map)));
    }

    @Override // Z8.AbstractC1805k0
    public final void c(AbstractC1802j abstractC1802j, Object obj) {
        r9.y.b1(this, abstractC1802j, obj);
    }
}
