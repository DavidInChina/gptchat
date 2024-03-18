package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Q {
    public static int a(Object obj, int i10, Object obj2) {
        P p10 = (P) obj;
        O o10 = (O) obj2;
        int i11 = 0;
        if (!p10.isEmpty()) {
            for (Map.Entry entry : p10.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                o10.getClass();
                int C10 = AbstractC2031p.C(i10);
                int a5 = O.a(o10.f24999a, key, value);
                i11 = android.gov.nist.core.a.d(a5, a5, C10, i11);
            }
        }
        return i11;
    }

    public static P b(Object obj, Object obj2) {
        P p10 = (P) obj;
        P p11 = (P) obj2;
        if (!p11.isEmpty()) {
            if (!p10.f25003Y) {
                p10 = p10.b();
            }
            p10.a();
            if (!p11.isEmpty()) {
                p10.putAll(p11);
            }
        }
        return p10;
    }
}
