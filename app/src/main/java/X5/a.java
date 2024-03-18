package X5;

import android.gov.nist.core.Separators;
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
import id.AbstractC3557B;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.t;
import q5.C5271a;
import q5.C5274d;
import q5.g;
import x5.c;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f21790a;

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDateFormat f21791b;

    public a(String str) {
        this.f21790a = str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.f21791b = simpleDateFormat;
    }

    public final j a(int i10, String str, Throwable th2, Map map, Set set, long j6, String str2, C5271a c5271a, boolean z10, String str3, boolean z11, boolean z12, g gVar, C5274d c5274d, List list) {
        C2299d c2299d;
        String format;
        String str4;
        String str5;
        String str6;
        g gVar2;
        C2301f c2301f;
        int i11;
        C5274d c5274d2;
        C2302g c2302g;
        String str7;
        String str8;
        String str9;
        String str10;
        Map map2;
        Map map3;
        Map map4;
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("attributes", map);
        AbstractC3557B.c0("tags", set);
        AbstractC3557B.c0("threadName", str2);
        AbstractC3557B.c0("datadogContext", c5271a);
        AbstractC3557B.c0("loggerName", str3);
        AbstractC3557B.c0("threads", list);
        if (th2 != null) {
            String canonicalName = th2.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = th2.getClass().getSimpleName();
            }
            String I02 = P4.a.I0(th2);
            String message = th2.getMessage();
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                c cVar = (c) it.next();
                arrayList.add(new h(cVar.f48903a, cVar.f48905c, cVar.f48906d, cVar.f48904b));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            c2299d = new C2299d(canonicalName, message, I02, arrayList);
        } else {
            c2299d = null;
        }
        long j10 = j6 + c5271a.f43903i.f43935d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (z11 && (map3 = (Map) c5271a.f43909o.get("tracing")) != null) {
            Object obj = map3.get("context@".concat(str2));
            if (obj instanceof Map) {
                map4 = (Map) obj;
            } else {
                map4 = null;
            }
            if (map4 != null) {
                linkedHashMap.put("dd.trace_id", map4.get("trace_id"));
                linkedHashMap.put("dd.span_id", map4.get("span_id"));
            }
        }
        if (z12 && (map2 = (Map) c5271a.f43909o.get("rum")) != null) {
            linkedHashMap.put("application_id", map2.get("application_id"));
            linkedHashMap.put("session_id", map2.get("session_id"));
            linkedHashMap.put("view.id", map2.get("view_id"));
            linkedHashMap.put("user_action.id", map2.get("action_id"));
        }
        synchronized (this.f21791b) {
            format = this.f21791b.format(new Date(j10));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        String str11 = c5271a.f43898d;
        if (str11.length() > 0) {
            str4 = "env:".concat(str11);
        } else {
            str4 = null;
        }
        if (str4 != null) {
            linkedHashSet.add(str4);
        }
        String str12 = c5271a.f43899e;
        if (str12.length() > 0) {
            str5 = "version:".concat(str12);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            linkedHashSet.add(str5);
        }
        String str13 = c5271a.f43900f;
        if (str13.length() > 0) {
            str6 = "variant:".concat(str13);
        } else {
            str6 = null;
        }
        if (str6 != null) {
            linkedHashSet.add(str6);
        }
        if (gVar == null) {
            gVar2 = c5271a.f43907m;
        } else {
            gVar2 = gVar;
        }
        i iVar = new i(gVar2.f43937a, gVar2.f43938b, gVar2.f43939c, AbstractC4268D.m1(gVar2.f43940d));
        if (c5274d == null && !z10) {
            c2301f = null;
        } else {
            if (c5274d == null) {
                c5274d2 = c5271a.f43905k;
            } else {
                c5274d2 = c5274d;
            }
            Long l10 = c5274d2.f43926c;
            String str14 = c5274d2.f43925b;
            if (l10 == null && str14 == null) {
                c2302g = null;
            } else {
                if (l10 != null) {
                    str10 = l10.toString();
                } else {
                    str10 = null;
                }
                c2302g = new C2302g(str10, str14);
            }
            Long l11 = c5274d2.f43929f;
            if (l11 != null) {
                str7 = l11.toString();
            } else {
                str7 = null;
            }
            Long l12 = c5274d2.f43928e;
            if (l12 != null) {
                str8 = l12.toString();
            } else {
                str8 = null;
            }
            Long l13 = c5274d2.f43927d;
            if (l13 != null) {
                str9 = l13.toString();
            } else {
                str9 = null;
            }
            c2301f = new C2301f(new C2296a(c2302g, str7, str8, str9, AbstractC4194d.D(c5274d2.f43924a)));
        }
        C2300e c2300e = new C2300e(str3, str2, c5271a.f43902h);
        String str15 = this.f21790a;
        if (str15 == null) {
            str15 = c5271a.f43897c;
        }
        if (i10 != 2) {
            if (i10 != 9) {
                int i12 = 4;
                if (i10 != 4) {
                    i12 = 5;
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 == 7) {
                                i11 = 1;
                            }
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 3;
                    }
                }
                i11 = i12;
            } else {
                i11 = 7;
            }
        } else {
            i11 = 6;
        }
        C2297b c2297b = new C2297b(new C2298c(c5271a.f43906l.f43918i));
        String m22 = t.m2(linkedHashSet, Separators.COMMA, null, null, null, 62);
        AbstractC3557B.b0("formattedDate", format);
        return new j(i11, str15, str, format, c2300e, c2297b, iVar, c2301f, c2299d, m22, linkedHashMap);
    }
}
