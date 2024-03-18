package yh;

import Qh.AbstractC1230h;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.C5629a;
import yh.l1;

/* loaded from: classes.dex */
public abstract class r1 extends AbstractC1239q implements G1 {
    public G1 C() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.add(((l1.a) it.next()).p0());
        }
        return new t1(arrayList);
    }

    public H1 Q() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.add(((l1.a) it.next()).l0());
        }
        return new q1(0, arrayList);
    }

    @Override // yh.G1
    public final C5629a b(AbstractC1230h abstractC1230h) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            l1.a aVar = (l1.a) it.next();
            arrayList.add(new I1(aVar.A0(), aVar.getUpperBounds().k(new Y0(abstractC1230h)), aVar.getDeclaredAnnotations()));
        }
        return new C5629a(arrayList);
    }

    @Override // yh.G1
    public final G1 k(k1 k1Var) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            arrayList.add(((l1.a) it.next()).k(k1Var));
        }
        return new t1(arrayList);
    }

    public int p() {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((l1.a) it.next()).p().f7825Y;
        }
        return i10;
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new t1(list);
    }
}
