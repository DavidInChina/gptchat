package G6;

import A.AbstractC0044t0;
import I8.p;
import I8.u;
import I8.w;
import K4.C0813a;
import K6.d;
import K6.f;
import K6.g;
import K6.h;
import K6.i;
import K6.j;
import K6.k;
import K6.l;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import id.AbstractC3557B;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import kf.q;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import r9.y;
import w5.AbstractC6120a;
import w5.C6122c;
import w5.e;

/* loaded from: classes.dex */
public final class c implements J6.a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f6066a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6120a f6067b;

    public c(AbstractC5091c abstractC5091c) {
        e eVar = new e(abstractC5091c);
        this.f6066a = abstractC5091c;
        this.f6067b = eVar;
    }

    public final String a(C5271a c5271a, l lVar) {
        AbstractC3557B.c0("datadogContext", c5271a);
        d dVar = lVar.f9527k;
        j jVar = dVar.f9500e;
        LinkedHashMap f12 = y.f1(this.f6067b, jVar.f9515d, "meta.usr", null, null, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(f12.size()));
        for (Map.Entry entry : f12.entrySet()) {
            Object key = entry.getKey();
            String str = null;
            try {
                Object value = entry.getValue();
                if (!AbstractC3557B.K(value, Q5.b.f14432a) && value != null) {
                    str = value instanceof Date ? String.valueOf(((Date) value).getTime()) : value instanceof w ? ((w) value).T() : value.toString();
                }
            } catch (Exception e10) {
                P4.a.l0(this.f6066a, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new C6122c(entry, 3), e10, 48);
            }
            linkedHashMap.put(key, str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap2);
        K6.e eVar = lVar.f9526j;
        LinkedHashMap f13 = y.f1(this.f6067b, eVar.f9505b, "metrics", null, null, 12);
        String str2 = dVar.f9496a;
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        K6.c cVar = dVar.f9497b;
        AbstractC3557B.c0("dd", cVar);
        C0813a c0813a = dVar.f9498c;
        AbstractC3557B.c0("span", c0813a);
        i iVar = dVar.f9499d;
        AbstractC3557B.c0("tracer", iVar);
        Map map = dVar.f9502g;
        AbstractC3557B.c0("additionalProperties", map);
        String str3 = lVar.f9517a;
        AbstractC3557B.c0("traceId", str3);
        String str4 = lVar.f9518b;
        AbstractC3557B.c0("spanId", str4);
        String str5 = lVar.f9519c;
        AbstractC3557B.c0("parentId", str5);
        String str6 = lVar.f9520d;
        AbstractC3557B.c0("resource", str6);
        String str7 = lVar.f9521e;
        AbstractC3557B.c0("name", str7);
        String str8 = lVar.f9522f;
        AbstractC3557B.c0(ReferencesHeader.SERVICE, str8);
        u uVar = new u();
        uVar.m0("trace_id", str3);
        uVar.m0("span_id", str4);
        uVar.m0("parent_id", str5);
        uVar.m0("resource", str6);
        uVar.m0("name", str7);
        uVar.m0(ReferencesHeader.SERVICE, str8);
        uVar.V(Long.valueOf(lVar.f9523g), "duration");
        uVar.V(Long.valueOf(lVar.f9524h), "start");
        uVar.V(Long.valueOf(lVar.f9525i), "error");
        uVar.m0("type", "custom");
        u uVar2 = new u();
        Long l10 = eVar.f9504a;
        if (l10 != null) {
            AbstractC0044t0.C(l10, uVar2, "_top_level");
        }
        for (Map.Entry entry3 : f13.entrySet()) {
            String str9 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (!q.S2(str9, K6.e.f9503c)) {
                uVar2.V(number, str9);
            }
        }
        uVar.U("metrics", uVar2);
        u uVar3 = new u();
        uVar3.m0(ParameterNames.VERSION, str2);
        u uVar4 = new u();
        String str10 = cVar.f9491a;
        if (str10 != null) {
            uVar4.m0("source", str10);
        }
        K6.a aVar = cVar.f9492b;
        if (aVar != null) {
            u uVar5 = new u();
            String str11 = aVar.f9485a;
            if (str11 != null) {
                uVar5.m0(ParameterNames.ID, str11);
            }
            uVar4.U(SIPServerTransaction.CONTENT_TYPE_APPLICATION, uVar5);
        }
        g gVar = cVar.f9493c;
        if (gVar != null) {
            u uVar6 = new u();
            String str12 = gVar.f9507a;
            if (str12 != null) {
                uVar6.m0(ParameterNames.ID, str12);
            }
            uVar4.U(ParameterNames.SESSION, uVar6);
        }
        k kVar = cVar.f9494d;
        if (kVar != null) {
            u uVar7 = new u();
            String str13 = kVar.f9516a;
            if (str13 != null) {
                uVar7.m0(ParameterNames.ID, str13);
            }
            uVar4.U("view", uVar7);
        }
        uVar3.U("_dd", uVar4);
        u uVar8 = new u();
        uVar8.m0("kind", c0813a.f9398Z);
        uVar3.U("span", uVar8);
        u uVar9 = new u();
        uVar9.m0(ParameterNames.VERSION, iVar.f9510a);
        uVar3.U("tracer", uVar9);
        u uVar10 = new u();
        String str14 = jVar.f9512a;
        if (str14 != null) {
            uVar10.m0(ParameterNames.ID, str14);
        }
        String str15 = jVar.f9513b;
        if (str15 != null) {
            uVar10.m0("name", str15);
        }
        String str16 = jVar.f9514c;
        if (str16 != null) {
            uVar10.m0("email", str16);
        }
        for (Map.Entry entry4 : m12.entrySet()) {
            String str17 = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (!q.S2(str17, j.f9511e)) {
                uVar10.U(str17, Gi.e.T(value2));
            }
        }
        uVar3.U("usr", uVar10);
        f fVar = dVar.f9501f;
        if (fVar != null) {
            u uVar11 = new u();
            K6.b bVar = fVar.f9506a;
            if (bVar != null) {
                u uVar12 = new u();
                h hVar = bVar.f9486a;
                if (hVar != null) {
                    u uVar13 = new u();
                    String str18 = hVar.f9508a;
                    if (str18 != null) {
                        uVar13.m0(ParameterNames.ID, str18);
                    }
                    String str19 = hVar.f9509b;
                    if (str19 != null) {
                        uVar13.m0("name", str19);
                    }
                    uVar12.U("sim_carrier", uVar13);
                }
                String str20 = bVar.f9487b;
                if (str20 != null) {
                    uVar12.m0("signal_strength", str20);
                }
                String str21 = bVar.f9488c;
                if (str21 != null) {
                    uVar12.m0("downlink_kbps", str21);
                }
                String str22 = bVar.f9489d;
                if (str22 != null) {
                    uVar12.m0("uplink_kbps", str22);
                }
                String str23 = bVar.f9490e;
                if (str23 != null) {
                    uVar12.m0("connectivity", str23);
                }
                uVar11.U("client", uVar12);
            }
            uVar3.U("network", uVar11);
        }
        for (Map.Entry entry5 : map.entrySet()) {
            String str24 = (String) entry5.getKey();
            String str25 = (String) entry5.getValue();
            if (!q.S2(str24, d.f9495h)) {
                uVar3.m0(str24, str25);
            }
        }
        uVar.U("meta", uVar3);
        p pVar = new p(1);
        pVar.U(uVar);
        u uVar14 = new u();
        uVar14.U("spans", pVar);
        uVar14.m0("env", c5271a.f43898d);
        String rVar = uVar14.toString();
        AbstractC3557B.b0("jsonObject.toString()", rVar);
        return rVar;
    }
}
