package Uf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4297i;

/* renamed from: Uf.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1453o {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f17828a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f17829b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f17828a = linkedHashMap;
        b(C4297i.f37534q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(C4297i.f37535r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(C4297i.f37536s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(C4290b.j(new C4291c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(C4290b.j(new C4291c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C3959i(((C4290b) entry.getKey()).b(), ((C4290b) entry.getValue()).b()));
        }
        f17829b = AbstractC4268D.k1(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4290b.j(new C4291c(str)));
        }
        return arrayList;
    }

    public static void b(C4290b c4290b, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C4290b c4290b2 = (C4290b) next;
            f17828a.put(next, c4290b);
        }
    }
}
