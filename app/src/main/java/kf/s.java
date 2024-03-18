package kf;

import id.AbstractC3557B;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import l8.AbstractC4344b;
import xf.AbstractC6438a;
import xf.AbstractC6439b;

/* loaded from: classes.dex */
public abstract class s extends r {
    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.g, Cf.e] */
    public static final int L1(int i10, List list) {
        if (new Cf.e(0, AbstractC4344b.u0(list), 1).s(i10)) {
            return AbstractC4344b.u0(list) - i10;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Element index ", i10, " must be in range [");
        q10.append(new Cf.e(0, AbstractC4344b.u0(list), 1));
        q10.append("].");
        throw new IndexOutOfBoundsException(q10.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.g, Cf.e] */
    public static final int M1(int i10, List list) {
        if (new Cf.e(0, list.size(), 1).s(i10)) {
            return list.size() - i10;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Position index ", i10, " must be in range [");
        q10.append(new Cf.e(0, list.size(), 1));
        q10.append("].");
        throw new IndexOutOfBoundsException(q10.toString());
    }

    public static void N1(Iterable iterable, Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        AbstractC3557B.c0("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    public static void O1(AbstractList abstractList, Object[] objArr) {
        AbstractC3557B.c0("<this>", abstractList);
        AbstractC3557B.c0("elements", objArr);
        abstractList.addAll(q.Q2(objArr));
    }

    public static final Collection P1(Iterable iterable) {
        AbstractC3557B.c0("<this>", iterable);
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return t.K2(iterable);
    }

    public static final boolean Q1(Iterable iterable, wf.k kVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) kVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static void R1(wf.k kVar, List list) {
        int u02;
        AbstractC3557B.c0("<this>", list);
        AbstractC3557B.c0("predicate", kVar);
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof AbstractC6438a) && !(list instanceof AbstractC6439b)) {
                Ad.l.g1("kotlin.collections.MutableIterable", list);
                throw null;
            } else {
                Q1(list, kVar, true);
                return;
            }
        }
        int i10 = 0;
        Cf.f it = new Cf.e(0, AbstractC4344b.u0(list), 1).iterator();
        while (it.f3111h0) {
            int a5 = it.a();
            Object obj = list.get(a5);
            if (!((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (i10 != a5) {
                    list.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 >= list.size() || i10 > (u02 = AbstractC4344b.u0(list))) {
            return;
        }
        while (true) {
            list.remove(u02);
            if (u02 != i10) {
                u02--;
            } else {
                return;
            }
        }
    }

    public static boolean S1(Iterable iterable, wf.k kVar) {
        AbstractC3557B.c0("<this>", iterable);
        return Q1(iterable, kVar, true);
    }

    public static Object T1(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object U1(List list) {
        AbstractC3557B.c0("<this>", list);
        if (!list.isEmpty()) {
            return list.remove(AbstractC4344b.u0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
