package Kg;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k6.AbstractC4194d;
import kf.v;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public abstract class m extends p {
    public static int f1(k kVar) {
        Iterator it = kVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC4344b.c1();
                throw null;
            }
        }
        return i10;
    }

    public static k g1(k kVar, int i10) {
        if (i10 >= 0) {
            if (i10 != 0) {
                if (kVar instanceof c) {
                    return ((c) kVar).b(i10);
                }
                return new b(kVar, i10, 0);
            }
            return kVar;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested element count ", i10, " is less than zero.").toString());
    }

    public static f h1(k kVar, wf.k kVar2) {
        AbstractC3557B.c0("predicate", kVar2);
        return new f(kVar, true, kVar2);
    }

    public static f i1(k kVar, wf.k kVar2) {
        return new f(kVar, false, kVar2);
    }

    public static Object j1(f fVar) {
        e eVar = new e(fVar);
        if (!eVar.hasNext()) {
            return null;
        }
        return eVar.next();
    }

    public static h k1(k kVar, wf.k kVar2) {
        return new h(kVar, kVar2, q.f9846Y);
    }

    public static String l1(k kVar, String str) {
        AbstractC3557B.c0("<this>", kVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : kVar) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            Bi.c.R(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static Object m1(k kVar) {
        Iterator it = kVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static s n1(k kVar, wf.k kVar2) {
        AbstractC3557B.c0("<this>", kVar);
        AbstractC3557B.c0("transform", kVar2);
        return new s(kVar, kVar2);
    }

    public static f o1(k kVar, wf.k kVar2) {
        return i1(new s(kVar, kVar2), o.f9844i0);
    }

    public static List p1(k kVar) {
        Iterator it = kVar.iterator();
        if (!it.hasNext()) {
            return v.f37483Y;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC4344b.F0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
