package Mh;

import Eh.AbstractC0511j;
import java.util.ArrayList;
import java.util.Iterator;
import sh.AbstractC5634f;
import wh.AbstractC6226B;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes2.dex */
public final class m extends Hh.i {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6250o f12170Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l f12171Z;

    public m(AbstractC6250o abstractC6250o, l lVar) {
        this.f12170Y = abstractC6250o;
        this.f12171Z = lVar;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        ArrayList<Hh.n> arrayList = new ArrayList();
        for (AbstractC6226B abstractC6226B : this.f12170Y.getParameters()) {
            l1 l02 = abstractC6226B.getType().l0();
            arrayList.add(new n(o.a(l02), abstractC6226B.s()));
            arrayList.add(this.f12171Z.a(l02, abstractC6226B.getIndex()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hh.n nVar : arrayList) {
            if (nVar instanceof Hh.j) {
                arrayList2.addAll(((Hh.j) nVar).f7813Y);
            } else if (!(nVar instanceof Hh.m)) {
                arrayList2.add(nVar);
            }
        }
        Hh.l lVar2 = Hh.l.f7816c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            lVar2 = lVar2.a(((Hh.n) it.next()).e(lVar, abstractC0511j));
        }
        return lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12170Y.equals(mVar.f12170Y) && this.f12171Z.equals(mVar.f12171Z)) {
            return true;
        }
        return false;
    }

    public final Hh.n h() {
        n nVar;
        if (((AbstractC5634f) this.f12170Y).h1(8)) {
            return this;
        }
        n nVar2 = o.f12180n0;
        if (nVar2 != null) {
            nVar = null;
        } else {
            nVar = new n(o.REFERENCE, 0);
        }
        if (nVar != null) {
            o.f12180n0 = nVar;
            nVar2 = nVar;
        }
        return new Hh.j(nVar2, this);
    }

    public final int hashCode() {
        int hashCode = this.f12170Y.hashCode();
        return this.f12171Z.hashCode() + ((hashCode + (m.class.hashCode() * 31)) * 31);
    }
}
