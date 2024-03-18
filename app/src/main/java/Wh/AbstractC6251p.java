package wh;

import Qh.AbstractC1230h;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.C5629a;
import th.AbstractC5806n;
import th.h0;
import yh.G1;
import yh.Y0;
import yh.l1;

/* renamed from: wh.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6251p extends AbstractC1239q implements AbstractC6256u {
    @Override // wh.AbstractC6256u
    public final C5629a b(AbstractC1230h abstractC1230h) {
        l1.a aVar;
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC6236a abstractC6236a = (AbstractC6236a) ((AbstractC6250o) it.next());
            l1.a T = abstractC6236a.T();
            String D02 = abstractC6236a.D0();
            int u02 = abstractC6236a.u0();
            C5629a b10 = abstractC6236a.r0().b(abstractC1230h);
            l1.a aVar2 = (l1.a) abstractC6236a.getReturnType().k(new Y0(abstractC1230h));
            C5629a b11 = abstractC6236a.getParameters().b(abstractC1230h);
            G1 k10 = abstractC6236a.V().k(new Y0(abstractC1230h));
            AbstractC5806n declaredAnnotations = abstractC6236a.getDeclaredAnnotations();
            h0 f6 = abstractC6236a.f();
            if (T == null) {
                l1.a aVar3 = l1.a.f51045N;
                aVar = null;
            } else {
                aVar = (l1.a) T.k(new Y0(abstractC1230h));
            }
            arrayList.add(new C6247l(D02, u02, b10, aVar2, b11, k10, declaredAnnotations, f6, aVar));
        }
        return new C5629a(arrayList);
    }

    @Override // Qh.AbstractC1239q
    public final Qh.r y(List list) {
        return new C6253r(list);
    }
}
