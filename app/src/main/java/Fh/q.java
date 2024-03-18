package Fh;

import java.util.ArrayList;
import java.util.Iterator;
import wh.AbstractC6250o;

/* loaded from: classes2.dex */
public final class q implements B {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f5398Y = new ArrayList();

    public q(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B b10 = (B) it.next();
            if (b10 instanceof q) {
                this.f5398Y.addAll(((q) b10).f5398Y);
            } else if (!(b10 instanceof A)) {
                this.f5398Y.add(b10);
            }
        }
    }

    @Override // Fh.B
    public final void b(Nh.l lVar, AbstractC6250o abstractC6250o, o oVar) {
        Iterator it = this.f5398Y.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(lVar, abstractC6250o, oVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass() && this.f5398Y.equals(((q) obj).f5398Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5398Y.hashCode() + (q.class.hashCode() * 31);
    }
}
