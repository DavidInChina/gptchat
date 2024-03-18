package com.revenuecat.purchases.common;

import Lg.i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/Anonymizer;", "", "valueToAnonymize", "anonymizedAny", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "textToAnonymize", "anonymizedString", "(Ljava/lang/String;)Ljava/lang/String;", "", "mapToAnonymize", "anonymizedMap", "(Ljava/util/Map;)Ljava/util/Map;", "anonymizedStringMap", "LLg/i;", "anonymizeRegex", "LLg/i;", "<init>", "()V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Anonymizer {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";
    @Deprecated
    public static final String IP_REGEX = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}";
    @Deprecated
    public static final String REDACTED = "*****";
    @Deprecated
    public static final String UUID_REGEX = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";
    private final i anonymizeRegex = new i("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+|[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}|((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/Anonymizer$Companion;", "", "()V", "EMAIL_REGEX", "", "IP_REGEX", "REDACTED", "UUID_REGEX", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Collection, java.util.ArrayList] */
    private final Object anonymizedAny(Object obj) {
        ?? linkedHashMap;
        Object obj2;
        Object obj3;
        if (obj instanceof String) {
            return anonymizedString((String) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(AbstractC6583a.H1(iterable, 10));
            for (Object obj4 : iterable) {
                if (obj4 == null) {
                    obj3 = null;
                } else {
                    obj3 = anonymizedAny(obj4);
                }
                linkedHashMap.add(obj3);
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    obj2 = null;
                } else {
                    obj2 = anonymizedAny(value);
                }
                linkedHashMap.put(key, obj2);
            }
        } else {
            return obj;
        }
        return linkedHashMap;
    }

    public final Map<String, Object> anonymizedMap(Map<String, ? extends Object> map) {
        AbstractC3557B.c0("mapToAnonymize", map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedAny(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final String anonymizedString(String str) {
        AbstractC3557B.c0("textToAnonymize", str);
        return this.anonymizeRegex.c(str, REDACTED);
    }

    public final Map<String, String> anonymizedStringMap(Map<String, String> map) {
        AbstractC3557B.c0("mapToAnonymize", map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedString((String) entry.getValue()));
        }
        return linkedHashMap;
    }
}
