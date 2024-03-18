package kf;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: kf.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4273I extends R4.b {
    public static LinkedHashSet s2(Set set, Object obj) {
        AbstractC3557B.c0("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC3557B.K(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set t2(Set set, Iterable iterable) {
        AbstractC3557B.c0("<this>", set);
        AbstractC3557B.c0("elements", iterable);
        Collection<?> P12 = s.P1(iterable);
        if (P12.isEmpty()) {
            return t.P2(set);
        }
        if (P12 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!P12.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(P12);
        return linkedHashSet2;
    }

    public static LinkedHashSet u2(Set set, Iterable iterable) {
        Integer num;
        int i10;
        AbstractC3557B.c0("<this>", set);
        AbstractC3557B.c0("elements", iterable);
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            i10 = set.size() + num.intValue();
        } else {
            i10 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(i10));
        linkedHashSet.addAll(set);
        s.N1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet v2(Set set, Object obj) {
        AbstractC3557B.c0("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
