package yh;

import Qh.AbstractC1230h;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.C5629a;
import yh.l1;

/* renamed from: yh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6615i extends AbstractC1239q implements AbstractC6624m {
    @Override // yh.AbstractC6624m
    public final C5629a b(AbstractC1230h abstractC1230h) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC6600d abstractC6600d = (AbstractC6600d) ((AbstractC6612h) it.next());
            arrayList.add(new C6609g(abstractC6600d.f1(), (l1.a) abstractC6600d.getType().k(new Y0(abstractC1230h)), abstractC6600d.getDeclaredAnnotations()));
        }
        return new C5629a(arrayList);
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new C6620k(0, list);
    }
}
