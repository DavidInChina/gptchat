package jg;

import Lg.n;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36180a = t.m2(AbstractC4344b.G0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f36181b;

    static {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List G02 = AbstractC4344b.G0("Boolean", "Z", "Char", TokenNames.f24310C, "Byte", "B", "Short", TokenNames.S, "Int", TokenNames.f24313I, "Float", TokenNames.f24312F, "Long", "J", "Double", "D");
        int J10 = r.f.J(0, G02.size() - 1, 2);
        if (J10 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f36180a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) G02.get(i11));
                linkedHashMap.put(sb2.toString(), G02.get(i11 + 1));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(R.a.t(sb3, (String) G02.get(i11), "Array"), "[" + ((String) G02.get(i10)));
                if (i11 == J10) {
                    break;
                }
                i11 += 2;
            }
        }
        linkedHashMap.put(f36180a + "/Unit", TokenNames.f24320V);
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : AbstractC4344b.G0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : AbstractC4344b.G0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(R.a.r("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i12 = 0; i12 < 23; i12++) {
            String e10 = android.gov.nist.core.a.e("Function", i12);
            StringBuilder sb4 = new StringBuilder();
            String str4 = f36180a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            a(e10, sb4.toString(), linkedHashMap);
            a("reflect/KFunction" + i12, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : AbstractC4344b.G0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(android.gov.nist.core.a.g(str5, ".Companion"), f36180a + "/jvm/internal/" + str5 + "CompanionObject", linkedHashMap);
        }
        f36181b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f36180a + '/' + str, TokenNames.f24315L + str2 + ';');
    }

    public static final String b(String str) {
        AbstractC3557B.c0("classId", str);
        String str2 = (String) f36181b.get(str);
        if (str2 == null) {
            return TokenNames.f24315L + n.z2(str, '.', '$') + ';';
        }
        return str2;
    }
}
