package Hh;

import Eh.AbstractC0511j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f7813Y;

    public j(n... nVarArr) {
        this(Arrays.asList(nVarArr));
    }

    @Override // Hh.n
    public final boolean b() {
        Iterator it = this.f7813Y.iterator();
        while (it.hasNext()) {
            if (!((n) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        l lVar2 = l.f7816c;
        Iterator it = this.f7813Y.iterator();
        while (it.hasNext()) {
            lVar2 = lVar2.a(((n) it.next()).e(lVar, abstractC0511j));
        }
        return lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass() && this.f7813Y.equals(((j) obj).f7813Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7813Y.hashCode() + (j.class.hashCode() * 31);
    }

    public j(List list) {
        this.f7813Y = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar instanceof j) {
                this.f7813Y.addAll(((j) nVar).f7813Y);
            } else if (!(nVar instanceof m)) {
                this.f7813Y.add(nVar);
            }
        }
    }
}
