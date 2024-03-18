package kf;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import jf.C3959i;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import q1.AbstractC5260f;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class t extends s {
    public static Object A2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            return B2((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object B2(List list) {
        AbstractC3557B.c0("<this>", list);
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object C2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object D2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List E2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return K2(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            q.w3((Comparable[]) array);
            return q.Q2(array);
        }
        List N22 = N2(iterable);
        r.J1(N22);
        return N22;
    }

    public static List F2(Iterable iterable, Comparator comparator) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return K2(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            AbstractC3557B.c0("<this>", array);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return q.Q2(array);
        }
        List N22 = N2(iterable);
        r.K1(N22, comparator);
        return N22;
    }

    public static List G2(Iterable iterable, int i10) {
        AbstractC3557B.c0("<this>", iterable);
        if (i10 >= 0) {
            if (i10 == 0) {
                return v.f37483Y;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return K2(iterable);
                }
                if (i10 == 1) {
                    return AbstractC4344b.F0(e2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return AbstractC4344b.O0(arrayList);
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", i10, " is less than zero.").toString());
    }

    public static final void H2(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC3557B.c0("<this>", iterable);
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static float[] I2(List list) {
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static int[] J2(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List K2(Iterable iterable) {
        Object obj;
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return M2(collection);
                }
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                return AbstractC4344b.F0(obj);
            }
            return v.f37483Y;
        }
        return AbstractC4344b.O0(N2(iterable));
    }

    public static long[] L2(ArrayList arrayList) {
        AbstractC3557B.c0("<this>", arrayList);
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static ArrayList M2(Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        return new ArrayList(collection);
    }

    public static List N2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return M2((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        H2(iterable, arrayList);
        return arrayList;
    }

    public static Set O2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        H2(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set P2(Iterable iterable) {
        Object obj;
        AbstractC3557B.c0("<this>", iterable);
        boolean z10 = iterable instanceof Collection;
        x xVar = x.f37485Y;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(collection.size()));
                    H2(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                return R4.b.W1(obj);
            }
            return xVar;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        H2(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return R4.b.W1(linkedHashSet2.iterator().next());
        }
        return xVar;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [Kg.l, java.lang.Object, nf.e] */
    public static ArrayList Q2(List list, int i10, int i11) {
        u uVar;
        int i12;
        AbstractC3557B.c0("<this>", list);
        N.g(i10, i11);
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i13 = size / i11;
            if (size % i11 == 0) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ArrayList arrayList = new ArrayList(i13 + i12);
            int i14 = 0;
            while (i14 >= 0 && i14 < size) {
                int i15 = size - i14;
                if (i10 <= i15) {
                    i15 = i10;
                }
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    arrayList2.add(list.get(i16 + i14));
                }
                arrayList.add(arrayList2);
                i14 += i11;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        AbstractC3557B.c0("iterator", it);
        if (!it.hasNext()) {
            uVar = u.f37482Y;
        } else {
            C4274J c4274j = new C4274J(i10, i11, it, false, true, null);
            ?? obj = new Object();
            obj.f9840h0 = AbstractC5260f.n(obj, obj, c4274j);
            uVar = obj;
        }
        while (uVar.hasNext()) {
            arrayList3.add((List) uVar.next());
        }
        return arrayList3;
    }

    public static o R2(List list) {
        AbstractC3557B.c0("<this>", list);
        return new o(new zc.u(19, list));
    }

    public static ArrayList S2(Iterable iterable, Iterable iterable2) {
        AbstractC3557B.c0("<this>", iterable);
        AbstractC3557B.c0("other", iterable2);
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC6583a.H1(iterable, 10), AbstractC6583a.H1(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C3959i(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static p V1(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        return new p(1, iterable);
    }

    public static double W1(List list) {
        Iterator it = list.iterator();
        double d10 = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            d10 += ((Number) it.next()).longValue();
            i10++;
            if (i10 < 0) {
                AbstractC4344b.c1();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / i10;
    }

    public static boolean X1(Iterable iterable, Object obj) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (j2(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List Y1(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        return K2(O2(iterable));
    }

    public static List Z1(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC3557B.c0("<this>", iterable);
        if (i10 >= 0) {
            if (i10 == 0) {
                return K2(iterable);
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    return v.f37483Y;
                }
                if (size == 1) {
                    return AbstractC4344b.F0(n2(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i10 < size2) {
                            arrayList.add(((List) iterable).get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i11 = 0;
            for (Object obj : iterable) {
                if (i11 >= i10) {
                    arrayList.add(obj);
                } else {
                    i11++;
                }
            }
            return AbstractC4344b.O0(arrayList);
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", i10, " is less than zero.").toString());
    }

    public static List a2(List list) {
        AbstractC3557B.c0("<this>", list);
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return G2(list, size);
    }

    public static ArrayList b2(Iterable iterable, wf.k kVar) {
        AbstractC3557B.c0("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList c2(Iterable iterable, Class cls) {
        AbstractC3557B.c0("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList d2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object e2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            return f2((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object f2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object g2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object h2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object i2(int i10, List list) {
        AbstractC3557B.c0("<this>", list);
        if (i10 >= 0 && i10 <= AbstractC4344b.u0(list)) {
            return list.get(i10);
        }
        return null;
    }

    public static int j2(Iterable iterable, Object obj) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 >= 0) {
                if (AbstractC3557B.K(obj, obj2)) {
                    return i10;
                }
                i10++;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return -1;
    }

    public static final void k2(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, wf.k kVar) {
        AbstractC3557B.c0("<this>", iterable);
        AbstractC3557B.c0("buffer", appendable);
        AbstractC3557B.c0("separator", charSequence);
        AbstractC3557B.c0("prefix", charSequence2);
        AbstractC3557B.c0("postfix", charSequence3);
        AbstractC3557B.c0("truncated", charSequence4);
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Bi.c.R(appendable, obj, kVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void l2(Iterable iterable, Appendable appendable, String str, String str2, String str3, wf.k kVar, int i10) {
        String str4;
        String str5;
        wf.k kVar2;
        if ((i10 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 8) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 64) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        k2(iterable, appendable, str, str4, str5, -1, "...", kVar2);
    }

    public static String m2(Iterable iterable, String str, String str2, String str3, wf.k kVar, int i10) {
        String str4;
        String str5;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        AbstractC3557B.c0("<this>", iterable);
        AbstractC3557B.c0("separator", str6);
        AbstractC3557B.c0("prefix", str4);
        AbstractC3557B.c0("postfix", str5);
        StringBuilder sb2 = new StringBuilder();
        k2(iterable, sb2, str6, str4, str5, -1, "...", kVar);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static Object n2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof List) {
            return o2((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object o2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (!list.isEmpty()) {
            return list.get(AbstractC4344b.u0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object p2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable q2(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float r2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Float s2(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static ArrayList t2(List list, Object obj) {
        AbstractC3557B.c0("<this>", list);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        boolean z10 = false;
        for (Object obj2 : list) {
            boolean z11 = true;
            if (!z10 && AbstractC3557B.K(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList u2(Iterable iterable, Iterable iterable2) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return w2(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        s.N1(iterable, arrayList);
        s.N1(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList v2(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return x2(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        s.N1(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList w2(Iterable iterable, Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        AbstractC3557B.c0("elements", iterable);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        s.N1(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList x2(Object obj, Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List y2(List list) {
        AbstractC3557B.c0("<this>", list);
        if (list.size() <= 1) {
            return K2(list);
        }
        List N22 = N2(list);
        Collections.reverse(N22);
        return N22;
    }

    public static void z2(List list, Af.d dVar) {
        for (int u02 = AbstractC4344b.u0(list); u02 > 0; u02--) {
            int e10 = dVar.e(u02 + 1);
            list.set(e10, list.set(u02, list.get(e10)));
        }
    }
}
