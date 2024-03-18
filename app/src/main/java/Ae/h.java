package Ae;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.s;

/* loaded from: classes2.dex */
public final class h extends c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f837a;

    public h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof h) {
                s.N1(((b) cVar).a(), arrayList);
            } else {
                arrayList.add(cVar);
            }
        }
        this.f837a = arrayList;
    }

    @Override // Ae.b
    public final List a() {
        return this.f837a;
    }
}
