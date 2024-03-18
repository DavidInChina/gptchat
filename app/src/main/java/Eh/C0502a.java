package Eh;

import Bh.AbstractC0265q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import wh.AbstractC6226B;
import wh.AbstractC6236a;
import wh.AbstractC6250o;

/* renamed from: Eh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502a extends AbstractC0506e implements Hh.b {

    /* renamed from: h0  reason: collision with root package name */
    public final int f4764h0 = 0;

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        int size = abstractC6250o.getParameters().size();
        int i10 = this.f4764h0;
        if (size > i10) {
            AbstractC6226B abstractC6226B = (AbstractC6226B) abstractC6250o.getParameters().get(i10);
            List<Hh.n> asList = Arrays.asList(new Mh.n(Mh.o.a(abstractC6226B.getType()), abstractC6226B.s()), this.f4778Y.a(abstractC6226B.getType(), abstractC6250o.getReturnType(), this.f4779Z), Mh.i.h(abstractC6250o.getReturnType()));
            ArrayList arrayList = new ArrayList();
            for (Hh.n nVar : asList) {
                if (nVar instanceof Hh.j) {
                    arrayList.addAll(((Hh.j) nVar).f7813Y);
                } else if (!(nVar instanceof Hh.m)) {
                    arrayList.add(nVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Hh.n) it.next()).b()) {
                    throw new IllegalStateException("Cannot assign " + abstractC6250o.getReturnType() + " to " + abstractC6226B);
                }
            }
            Hh.l lVar2 = Hh.l.f7816c;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                lVar2 = lVar2.a(((Hh.n) it2.next()).e(lVar, abstractC0511j));
            }
            return new Hh.a(lVar2.f7818b, ((AbstractC6236a) abstractC6250o).p());
        }
        throw new IllegalStateException(abstractC6250o + " does not define a parameter with index " + i10);
    }

    @Override // Eh.AbstractC0506e
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C0502a.class != obj.getClass()) {
            return false;
        }
        if (this.f4764h0 != ((C0502a) obj).f4764h0) {
            return false;
        }
        return true;
    }

    @Override // Eh.AbstractC0506e
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f4764h0;
    }

    @Override // Eh.AbstractC0523w
    public final Hh.b c(Dh.n nVar) {
        return this;
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}
