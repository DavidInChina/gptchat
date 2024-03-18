package Ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.s;

/* loaded from: classes2.dex */
public final class d extends c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f831a;

    public d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof d) {
                s.N1(((b) cVar).a(), arrayList);
            } else {
                arrayList.add(cVar);
            }
        }
        this.f831a = arrayList;
    }

    @Override // Ae.b
    public final List a() {
        return this.f831a;
    }
}
