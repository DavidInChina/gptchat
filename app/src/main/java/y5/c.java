package Y5;

import A.S0;
import I8.p;
import I8.u;
import I8.w;
import Lg.n;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import c6.C2296a;
import c6.C2297b;
import c6.C2298c;
import c6.C2299d;
import c6.C2300e;
import c6.C2301f;
import c6.C2302g;
import c6.h;
import c6.i;
import c6.j;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import r9.y;
import u5.C5843c;
import v5.C5976c;
import w5.AbstractC6120a;
import w5.e;
import wf.k;

/* loaded from: classes2.dex */
public final class c implements R5.b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5091c f22106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6120a f22107Z;

    public c(AbstractC5091c abstractC5091c) {
        e eVar = new e(abstractC5091c);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f22106Y = abstractC5091c;
        this.f22107Z = eVar;
    }

    @Override // R5.b
    public final String e(Object obj) {
        EnumC5090b enumC5090b;
        i iVar;
        j jVar = (j) obj;
        AbstractC3557B.c0("model", jVar);
        List G22 = n.G2(jVar.f26325j, new String[]{Separators.COMMA});
        e eVar = (e) this.f22107Z;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = G22.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC5090b = EnumC5090b.f42738Y;
            iVar = null;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            String str2 = str;
            for (k kVar : eVar.f48027b) {
                if (str2 == null) {
                    str2 = null;
                } else {
                    str2 = (String) kVar.invoke(str2);
                }
            }
            if (str2 == null) {
                P4.a.m0(eVar.f48026a, 5, enumC5090b, new C5843c(str, 3), null, false, 56);
            } else if (!AbstractC3557B.K(str2, str)) {
                P4.a.m0(eVar.f48026a, 4, enumC5090b, new C5976c(2, str, str2), null, false, 56);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size() - 100;
        if (size > 0) {
            P4.a.m0(eVar.f48026a, 4, enumC5090b, new S0(size, 1), null, false, 56);
        }
        String m22 = t.m2(t.G2(arrayList, 100), Separators.COMMA, null, null, null, 62);
        LinkedHashMap f12 = y.f1(this.f22107Z, jVar.f26326k, null, null, null, 14);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f12.entrySet()) {
            if (!n.n2((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        AbstractC5091c abstractC5091c = this.f22106Y;
        i iVar2 = jVar.f26322g;
        if (iVar2 != null) {
            iVar = new i(iVar2.f26311a, iVar2.f26312b, iVar2.f26313c, AbstractC4268D.m1(Gi.e.R(y.f1(this.f22107Z, iVar2.f26314d, "usr", "user extra information", null, 8), abstractC5091c)));
        }
        LinkedHashMap m12 = AbstractC4268D.m1(Gi.e.R(linkedHashMap, abstractC5091c));
        int i10 = jVar.f26316a;
        AbstractC2469q0.q("status", i10);
        String str3 = jVar.f26317b;
        AbstractC3557B.c0(ReferencesHeader.SERVICE, str3);
        String str4 = jVar.f26318c;
        AbstractC3557B.c0("message", str4);
        String str5 = jVar.f26319d;
        AbstractC3557B.c0("date", str5);
        C2300e c2300e = jVar.f26320e;
        AbstractC3557B.c0("logger", c2300e);
        C2297b c2297b = jVar.f26321f;
        AbstractC3557B.c0("dd", c2297b);
        u uVar = new u();
        uVar.U("status", new w(android.gov.nist.core.a.a(i10)));
        uVar.m0(ReferencesHeader.SERVICE, str3);
        uVar.m0("message", str4);
        uVar.m0("date", str5);
        u uVar2 = new u();
        uVar2.m0("name", c2300e.f26300a);
        String str6 = c2300e.f26301b;
        if (str6 != null) {
            uVar2.m0("thread_name", str6);
        }
        uVar2.m0(ParameterNames.VERSION, c2300e.f26302c);
        uVar.U("logger", uVar2);
        u uVar3 = new u();
        C2298c c2298c = c2297b.f26294a;
        c2298c.getClass();
        u uVar4 = new u();
        uVar4.m0("architecture", c2298c.f26295a);
        uVar3.U("device", uVar4);
        uVar.U("_dd", uVar3);
        if (iVar != null) {
            u uVar5 = new u();
            String str7 = iVar.f26311a;
            if (str7 != null) {
                uVar5.m0(ParameterNames.ID, str7);
            }
            String str8 = iVar.f26312b;
            if (str8 != null) {
                uVar5.m0("name", str8);
            }
            String str9 = iVar.f26313c;
            if (str9 != null) {
                uVar5.m0("email", str9);
            }
            for (Map.Entry entry2 : iVar.f26314d.entrySet()) {
                String str10 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!q.S2(str10, i.f26310e)) {
                    uVar5.U(str10, Gi.e.T(value));
                }
            }
            uVar.U("usr", uVar5);
        }
        C2301f c2301f = jVar.f26323h;
        if (c2301f != null) {
            u uVar6 = new u();
            C2296a c2296a = c2301f.f26303a;
            c2296a.getClass();
            u uVar7 = new u();
            C2302g c2302g = c2296a.f26289a;
            if (c2302g != null) {
                u uVar8 = new u();
                String str11 = c2302g.f26304a;
                if (str11 != null) {
                    uVar8.m0(ParameterNames.ID, str11);
                }
                String str12 = c2302g.f26305b;
                if (str12 != null) {
                    uVar8.m0("name", str12);
                }
                uVar7.U("sim_carrier", uVar8);
            }
            String str13 = c2296a.f26290b;
            if (str13 != null) {
                uVar7.m0("signal_strength", str13);
            }
            String str14 = c2296a.f26291c;
            if (str14 != null) {
                uVar7.m0("downlink_kbps", str14);
            }
            String str15 = c2296a.f26292d;
            if (str15 != null) {
                uVar7.m0("uplink_kbps", str15);
            }
            uVar7.m0("connectivity", c2296a.f26293e);
            uVar6.U("client", uVar7);
            uVar.U("network", uVar6);
        }
        C2299d c2299d = jVar.f26324i;
        if (c2299d != null) {
            u uVar9 = new u();
            String str16 = c2299d.f26296a;
            if (str16 != null) {
                uVar9.m0("kind", str16);
            }
            String str17 = c2299d.f26297b;
            if (str17 != null) {
                uVar9.m0("message", str17);
            }
            String str18 = c2299d.f26298c;
            if (str18 != null) {
                uVar9.m0("stack", str18);
            }
            List<h> list = c2299d.f26299d;
            if (list != null) {
                p pVar = new p(list.size());
                for (h hVar : list) {
                    hVar.getClass();
                    u uVar10 = new u();
                    uVar10.m0("name", hVar.f26306a);
                    uVar10.i0("crashed", Boolean.valueOf(hVar.f26307b));
                    uVar10.m0("stack", hVar.f26308c);
                    String str19 = hVar.f26309d;
                    if (str19 != null) {
                        uVar10.m0("state", str19);
                    }
                    pVar.U(uVar10);
                }
                uVar9.U("threads", pVar);
            }
            uVar.U("error", uVar9);
        }
        uVar.m0("ddtags", m22);
        for (Map.Entry entry3 : m12.entrySet()) {
            String str20 = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (!q.S2(str20, j.f26315l)) {
                uVar.U(str20, Gi.e.T(value2));
            }
        }
        String rVar = uVar.toString();
        AbstractC3557B.b0("sanitizeTagsAndAttribute\u2026odel).toJson().toString()", rVar);
        return rVar;
    }
}
