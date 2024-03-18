package Fh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yh.l1;

/* loaded from: classes2.dex */
public final class v implements w {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f5404Y = new ArrayList();

    public v(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof v) {
                this.f5404Y.addAll(((v) wVar).f5404Y);
            } else if (!(wVar instanceof A)) {
                this.f5404Y.add(wVar);
            }
        }
    }

    @Override // Fh.w
    public final B a(l1 l1Var) {
        ArrayList arrayList = this.f5404Y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w) it.next()).a(l1Var));
        }
        return new q(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass() && this.f5404Y.equals(((v) obj).f5404Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5404Y.hashCode() + (v.class.hashCode() * 31);
    }
}
