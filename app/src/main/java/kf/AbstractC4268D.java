package kf;

import id.AbstractC3557B;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import jf.C3959i;

/* renamed from: kf.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4268D extends P4.a {
    public static Object Z0(Object obj, Map map) {
        AbstractC3557B.c0("<this>", map);
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static Map a1(C3959i... c3959iArr) {
        if (c3959iArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(c3959iArr.length));
            h1(linkedHashMap, c3959iArr);
            return linkedHashMap;
        }
        return w.f37484Y;
    }

    public static Map b1(Iterable iterable, Map map) {
        AbstractC3557B.c0("<this>", map);
        AbstractC3557B.c0("keys", iterable);
        LinkedHashMap m12 = m1(map);
        Set keySet = m12.keySet();
        AbstractC3557B.c0("<this>", keySet);
        keySet.removeAll(s.P1(iterable));
        return d1(m12);
    }

    public static LinkedHashMap c1(C3959i... c3959iArr) {
        AbstractC3557B.c0("pairs", c3959iArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(c3959iArr.length));
        h1(linkedHashMap, c3959iArr);
        return linkedHashMap;
    }

    public static final Map d1(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size == 1) {
                return P4.a.N0(linkedHashMap);
            }
            return linkedHashMap;
        }
        return w.f37484Y;
    }

    public static LinkedHashMap e1(Map map, Map map2) {
        AbstractC3557B.c0("<this>", map);
        AbstractC3557B.c0("map", map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map f1(ArrayList arrayList, Map map) {
        if (map.isEmpty()) {
            return k1(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        i1(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static Map g1(Map map, C3959i c3959i) {
        AbstractC3557B.c0("<this>", map);
        if (map.isEmpty()) {
            return P4.a.o0(c3959i);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c3959i.f36155Y, c3959i.f36156Z);
        return linkedHashMap;
    }

    public static final void h1(HashMap hashMap, C3959i[] c3959iArr) {
        AbstractC3557B.c0("pairs", c3959iArr);
        for (C3959i c3959i : c3959iArr) {
            hashMap.put(c3959i.f36155Y, c3959i.f36156Z);
        }
    }

    public static void i1(List list, Map map) {
        AbstractC3557B.c0("<this>", map);
        AbstractC3557B.c0("pairs", list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3959i c3959i = (C3959i) it.next();
            map.put(c3959i.f36155Y, c3959i.f36156Z);
        }
    }

    public static Map j1(Kg.k kVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            C3959i c3959i = (C3959i) it.next();
            linkedHashMap.put(c3959i.f36155Y, c3959i.f36156Z);
        }
        return d1(linkedHashMap);
    }

    public static Map k1(AbstractList abstractList) {
        AbstractC3557B.c0("<this>", abstractList);
        int size = abstractList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(abstractList.size()));
                i1(abstractList, linkedHashMap);
                return linkedHashMap;
            }
            return P4.a.o0((C3959i) abstractList.get(0));
        }
        return w.f37484Y;
    }

    public static Map l1(Map map) {
        AbstractC3557B.c0("<this>", map);
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return m1(map);
            }
            return P4.a.N0(map);
        }
        return w.f37484Y;
    }

    public static LinkedHashMap m1(Map map) {
        AbstractC3557B.c0("<this>", map);
        return new LinkedHashMap(map);
    }
}
