package Eh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import yh.l1;
import z.AbstractC6708l;

/* renamed from: Eh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0506e implements AbstractC0523w {

    /* renamed from: Y  reason: collision with root package name */
    public final Ih.a f4778Y = Ih.a.f8608k;

    /* renamed from: Z  reason: collision with root package name */
    public final int f4779Z = 1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0506e abstractC0506e = (AbstractC0506e) obj;
        if (AbstractC6708l.c(this.f4779Z, abstractC0506e.f4779Z) && this.f4778Y.equals(abstractC0506e.f4778Y)) {
            return true;
        }
        return false;
    }

    public final Hh.a f(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o, l1.a aVar, Hh.n nVar) {
        Hh.n a5 = this.f4778Y.a(aVar, abstractC6250o.getReturnType(), this.f4779Z);
        if (a5.b()) {
            List<Hh.n> asList = Arrays.asList(nVar, a5, Mh.i.h(abstractC6250o.getReturnType()));
            ArrayList arrayList = new ArrayList();
            for (Hh.n nVar2 : asList) {
                if (nVar2 instanceof Hh.j) {
                    arrayList.addAll(((Hh.j) nVar2).f7813Y);
                } else if (!(nVar2 instanceof Hh.m)) {
                    arrayList.add(nVar2);
                }
            }
            Hh.l lVar2 = Hh.l.f7816c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lVar2 = lVar2.a(((Hh.n) it.next()).e(lVar, abstractC0511j));
            }
            return new Hh.a(lVar2.f7818b, ((AbstractC6236a) abstractC6250o).p());
        }
        throw new IllegalArgumentException("Cannot return value of type " + aVar + " for " + abstractC6250o);
    }

    public int hashCode() {
        int hashCode = this.f4778Y.hashCode();
        return AbstractC6708l.f(this.f4779Z) + ((hashCode + (getClass().hashCode() * 31)) * 31);
    }
}
