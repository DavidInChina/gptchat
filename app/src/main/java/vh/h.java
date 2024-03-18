package vh;

import Qh.AbstractC1230h;
import Qh.AbstractC1239q;
import Qh.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sh.C5629a;
import yh.Y0;
import yh.l1;

/* loaded from: classes.dex */
public abstract class h extends AbstractC1239q implements l {
    @Override // vh.l
    public final C5629a b(AbstractC1230h abstractC1230h) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            AbstractC6048a abstractC6048a = (AbstractC6048a) ((g) it.next());
            arrayList.add(new f(abstractC6048a.getName(), abstractC6048a.u0(), (l1.a) abstractC6048a.getType().k(new Y0(abstractC1230h)), abstractC6048a.getDeclaredAnnotations()));
        }
        return new C5629a(arrayList);
    }

    @Override // Qh.AbstractC1239q
    public final r y(List list) {
        return new j(0, list);
    }
}
