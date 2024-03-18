package P6;

import android.gov.nist.core.Separators;
import hf.C3421a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13821a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13822b;

    public a(Map map, int i10) {
        this.f13821a = i10;
        if (i10 == 1) {
            this.f13822b = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                ((Map) this.f13822b).put(((String) entry.getKey()).trim().toLowerCase(Locale.US), (String) entry.getValue());
            }
        } else if (i10 == 2) {
            this.f13822b = new HashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                ((Map) this.f13822b).put(((String) entry2.getKey()).trim().toLowerCase(Locale.US), (String) entry2.getValue());
            }
        } else if (i10 == 3) {
            this.f13822b = new HashMap();
            for (Map.Entry entry3 : map.entrySet()) {
                ((Map) this.f13822b).put(((String) entry3.getKey()).trim().toLowerCase(Locale.US), (String) entry3.getValue());
            }
        } else if (i10 != 4) {
            this.f13822b = new HashMap();
            for (Map.Entry entry4 : map.entrySet()) {
                ((Map) this.f13822b).put(((String) entry4.getKey()).trim().toLowerCase(Locale.US), (String) entry4.getValue());
            }
        } else {
            this.f13822b = new HashMap();
            for (Map.Entry entry5 : map.entrySet()) {
                ((Map) this.f13822b).put(((String) entry5.getKey()).trim().toLowerCase(Locale.US), (String) entry5.getValue());
            }
        }
    }

    public static HashMap b(String str) {
        String[] split = str.split(Separators.COMMA);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            if (str2.startsWith("dd=")) {
                for (String str3 : str2.substring(3).split(Separators.SEMICOLON)) {
                    String[] split2 = str3.split(":");
                    if (split2.length == 2) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        }
        return hashMap;
    }

    public final ff.d a(C3421a c3421a) {
        e eVar;
        Map emptyMap;
        BigInteger bigInteger;
        M6.i iVar;
        int i10;
        String str;
        int i11;
        Map emptyMap2;
        BigInteger bigInteger2;
        M6.i iVar2;
        int i12;
        int i13;
        String str2;
        Map emptyMap3;
        BigInteger bigInteger3;
        Map map;
        M6.i iVar3;
        int i14;
        String str3;
        e eVar2;
        Map emptyMap4;
        BigInteger bigInteger4;
        Map map2;
        M6.i iVar4;
        e eVar3;
        Map emptyMap5;
        BigInteger bigInteger5;
        M6.i iVar5;
        int i15;
        String str4;
        String str5;
        int i16;
        int i17 = this.f13821a;
        int i18 = 4;
        int i19 = 32;
        Object obj = this.f13822b;
        switch (i17) {
            case 0:
                try {
                    emptyMap = Collections.emptyMap();
                    bigInteger = BigInteger.ZERO;
                    Iterator it = c3421a.iterator();
                    iVar = bigInteger;
                    i10 = Integer.MIN_VALUE;
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.US);
                        String str6 = (String) entry.getValue();
                        if (str6 != null) {
                            if ("b3".equalsIgnoreCase(lowerCase)) {
                                String[] split = str6.split("-");
                                if (split.length >= 2) {
                                    if (split.length <= 4) {
                                        int length = split[0].length();
                                        if (length > i19) {
                                            bigInteger = BigInteger.ZERO;
                                        } else {
                                            if (length > 16) {
                                                str = split[0].substring(length - 16);
                                            } else {
                                                str = split[0];
                                            }
                                            bigInteger = AbstractC4344b.s1(16, str);
                                            M6.i s12 = AbstractC4344b.s1(16, split[1]);
                                            if (split.length >= 3) {
                                                if (Integer.parseInt(split[2]) == 1) {
                                                    i11 = 1;
                                                } else {
                                                    i11 = 0;
                                                }
                                                i10 = i11;
                                            }
                                            iVar = s12;
                                        }
                                    }
                                } else {
                                    i19 = 32;
                                }
                            } else {
                                iVar = iVar;
                            }
                            if (((Map) obj).containsKey(lowerCase)) {
                                if (emptyMap.isEmpty()) {
                                    emptyMap = new HashMap();
                                }
                                emptyMap.put((String) ((Map) obj).get(lowerCase), AbstractC4344b.Z(str6));
                            }
                            i19 = 32;
                        }
                        i19 = 32;
                    }
                } catch (RuntimeException unused) {
                }
                if (!BigInteger.ZERO.equals(bigInteger)) {
                    eVar = new e(bigInteger, iVar, i10, null, Collections.emptyMap(), emptyMap);
                    eVar.f13832g.set(true);
                } else {
                    if (!emptyMap.isEmpty()) {
                        eVar = null;
                        try {
                            return new i(null, emptyMap);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    eVar = null;
                }
                return eVar;
            case 1:
                try {
                    emptyMap2 = Collections.emptyMap();
                    bigInteger2 = BigInteger.ZERO;
                    Iterator it2 = c3421a.iterator();
                    iVar2 = bigInteger2;
                    i12 = Integer.MIN_VALUE;
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        String lowerCase2 = ((String) entry2.getKey()).toLowerCase(Locale.US);
                        String str7 = (String) entry2.getValue();
                        if (str7 != null) {
                            if ("X-B3-TraceId".equalsIgnoreCase(lowerCase2)) {
                                int length2 = str7.length();
                                if (length2 > 32) {
                                    bigInteger2 = BigInteger.ZERO;
                                } else {
                                    if (length2 > 16) {
                                        str2 = str7.substring(length2 - 16);
                                    } else {
                                        str2 = str7;
                                    }
                                    bigInteger2 = AbstractC4344b.s1(16, str2);
                                    iVar2 = iVar2;
                                }
                            } else if ("X-B3-SpanId".equalsIgnoreCase(lowerCase2)) {
                                iVar2 = AbstractC4344b.s1(16, str7);
                            } else {
                                iVar2 = iVar2;
                                if ("X-B3-Sampled".equalsIgnoreCase(lowerCase2)) {
                                    if (Integer.parseInt(str7) == 1) {
                                        i13 = 1;
                                    } else {
                                        i13 = 0;
                                    }
                                    i12 = i13;
                                    iVar2 = iVar2;
                                }
                            }
                            if (((Map) obj).containsKey(lowerCase2)) {
                                if (emptyMap2.isEmpty()) {
                                    emptyMap2 = new HashMap();
                                }
                                emptyMap2.put((String) ((Map) obj).get(lowerCase2), AbstractC4344b.Z(str7));
                            }
                        }
                    }
                } catch (RuntimeException unused3) {
                }
                if (!BigInteger.ZERO.equals(bigInteger2)) {
                    e eVar4 = new e(bigInteger2, iVar2, i12, null, Collections.emptyMap(), emptyMap2);
                    eVar4.f13832g.set(true);
                    return eVar4;
                }
                if (!emptyMap2.isEmpty()) {
                    return new i(null, emptyMap2);
                }
                return null;
            case 2:
                try {
                    Map emptyMap6 = Collections.emptyMap();
                    emptyMap3 = Collections.emptyMap();
                    bigInteger3 = BigInteger.ZERO;
                    Iterator it3 = c3421a.iterator();
                    map = emptyMap6;
                    iVar3 = bigInteger3;
                    i14 = Integer.MIN_VALUE;
                    str3 = null;
                    while (it3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it3.next();
                        String lowerCase3 = ((String) entry3.getKey()).toLowerCase(Locale.US);
                        String str8 = (String) entry3.getValue();
                        if (str8 != null) {
                            if ("x-datadog-trace-id".equalsIgnoreCase(lowerCase3)) {
                                bigInteger3 = AbstractC4344b.s1(10, str8);
                                iVar3 = iVar3;
                            } else if ("x-datadog-parent-id".equalsIgnoreCase(lowerCase3)) {
                                iVar3 = AbstractC4344b.s1(10, str8);
                            } else if ("x-datadog-sampling-priority".equalsIgnoreCase(lowerCase3)) {
                                i14 = Integer.parseInt(str8);
                                iVar3 = iVar3;
                            } else if ("x-datadog-origin".equalsIgnoreCase(lowerCase3)) {
                                str3 = str8;
                                iVar3 = iVar3;
                            } else {
                                iVar3 = iVar3;
                                if (lowerCase3.startsWith("ot-baggage-")) {
                                    if (map.isEmpty()) {
                                        map = new HashMap();
                                    }
                                    Map map3 = map;
                                    map3.put(lowerCase3.replace("ot-baggage-", ""), AbstractC4344b.Z(str8));
                                    map = map3;
                                    iVar3 = iVar3;
                                }
                            }
                            if (((Map) obj).containsKey(lowerCase3)) {
                                if (emptyMap3.isEmpty()) {
                                    emptyMap3 = new HashMap();
                                }
                                emptyMap3.put((String) ((Map) obj).get(lowerCase3), AbstractC4344b.Z(str8));
                            }
                        }
                    }
                } catch (RuntimeException unused4) {
                }
                if (!BigInteger.ZERO.equals(bigInteger3)) {
                    e eVar5 = new e(bigInteger3, iVar3, i14, str3, map, emptyMap3);
                    eVar5.f13832g.set(true);
                    eVar2 = eVar5;
                } else {
                    if (str3 != null || !emptyMap3.isEmpty()) {
                        eVar2 = new i(str3, emptyMap3);
                    }
                    return null;
                }
                return eVar2;
            case 3:
                try {
                    Map emptyMap7 = Collections.emptyMap();
                    emptyMap4 = Collections.emptyMap();
                    bigInteger4 = BigInteger.ZERO;
                    Iterator it4 = c3421a.iterator();
                    map2 = emptyMap7;
                    iVar4 = bigInteger4;
                    while (it4.hasNext()) {
                        Map.Entry entry4 = (Map.Entry) it4.next();
                        Locale locale = Locale.US;
                        String lowerCase4 = ((String) entry4.getKey()).toLowerCase(locale);
                        String str9 = (String) entry4.getValue();
                        if (str9 != null) {
                            if ("Trace-ID".equalsIgnoreCase(lowerCase4)) {
                                bigInteger4 = AbstractC4344b.s1(10, str9);
                                iVar4 = iVar4;
                            } else if ("Span-ID".equalsIgnoreCase(lowerCase4)) {
                                iVar4 = AbstractC4344b.s1(10, str9);
                            } else {
                                iVar4 = iVar4;
                                if (lowerCase4.startsWith("Baggage-".toLowerCase(locale))) {
                                    if (map2.isEmpty()) {
                                        map2 = new HashMap();
                                    }
                                    Map map4 = map2;
                                    map4.put(lowerCase4.replace("Baggage-".toLowerCase(locale), ""), AbstractC4344b.Z(str9));
                                    map2 = map4;
                                    iVar4 = iVar4;
                                }
                            }
                            if (((Map) obj).containsKey(lowerCase4)) {
                                if (emptyMap4.isEmpty()) {
                                    emptyMap4 = new HashMap();
                                }
                                emptyMap4.put((String) ((Map) obj).get(lowerCase4), AbstractC4344b.Z(str9));
                            }
                        }
                    }
                } catch (RuntimeException unused5) {
                }
                if (!BigInteger.ZERO.equals(bigInteger4)) {
                    e eVar6 = new e(bigInteger4, iVar4, 1, null, map2, emptyMap4);
                    eVar6.f13832g.set(true);
                    eVar3 = eVar6;
                } else {
                    if (!emptyMap4.isEmpty()) {
                        eVar3 = new i(null, emptyMap4);
                    }
                    return null;
                }
                return eVar3;
            case 4:
                try {
                    emptyMap5 = Collections.emptyMap();
                    bigInteger5 = BigInteger.ZERO;
                    Iterator it5 = c3421a.iterator();
                    iVar5 = bigInteger5;
                    i15 = Integer.MIN_VALUE;
                    str4 = null;
                    while (it5.hasNext()) {
                        Map.Entry entry5 = (Map.Entry) it5.next();
                        String lowerCase5 = ((String) entry5.getKey()).toLowerCase(Locale.US);
                        String str10 = (String) entry5.getValue();
                        if (str10 != null) {
                            if ("traceparent".equalsIgnoreCase(lowerCase5)) {
                                String[] split2 = str10.split("-");
                                if (split2.length == i18 && !"ff".equalsIgnoreCase(split2[0])) {
                                    int length3 = split2[1].length();
                                    if (length3 > 32) {
                                        bigInteger5 = BigInteger.ZERO;
                                    } else {
                                        if (length3 > 16) {
                                            str5 = split2[1].substring(length3 - 16);
                                        } else {
                                            str5 = split2[1];
                                        }
                                        bigInteger5 = AbstractC4344b.s1(16, str5);
                                        M6.i s13 = AbstractC4344b.s1(16, split2[2]);
                                        if (Integer.parseInt(split2[3]) == 1) {
                                            i16 = 1;
                                        } else {
                                            i16 = 0;
                                        }
                                        iVar5 = s13;
                                        i15 = i16;
                                    }
                                }
                            } else {
                                iVar5 = iVar5;
                                if ("tracestate".equalsIgnoreCase(lowerCase5)) {
                                    str4 = (String) b(str10).get("o");
                                    iVar5 = iVar5;
                                }
                            }
                            if (((Map) obj).containsKey(lowerCase5)) {
                                if (emptyMap5.isEmpty()) {
                                    emptyMap5 = new HashMap();
                                }
                                emptyMap5.put((String) ((Map) obj).get(lowerCase5), AbstractC4344b.Z(str10));
                            }
                        }
                        i18 = 4;
                    }
                } catch (RuntimeException unused6) {
                }
                if (!BigInteger.ZERO.equals(bigInteger5)) {
                    e eVar7 = new e(bigInteger5, iVar5, i15, str4, Collections.emptyMap(), emptyMap5);
                    eVar7.f13832g.set(true);
                    return eVar7;
                }
                if (!emptyMap5.isEmpty()) {
                    return new i(str4, emptyMap5);
                }
                return null;
            default:
                Iterator it6 = ((List) obj).iterator();
                ff.d dVar = null;
                while (it6.hasNext() && ((dVar = ((a) ((g) it6.next())).a(c3421a)) == null || !(dVar instanceof e))) {
                }
                return dVar;
        }
    }

    public a(ArrayList arrayList) {
        this.f13821a = 5;
        this.f13822b = arrayList;
    }
}
