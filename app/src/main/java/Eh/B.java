package Eh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import wh.AbstractC6226B;
import wh.AbstractC6235K;
import wh.AbstractC6236a;
import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class B implements Hh.b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0522v f4739Y;

    /* renamed from: Z  reason: collision with root package name */
    public final K f4740Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f4741h0;

    /* renamed from: i0  reason: collision with root package name */
    public final J f4742i0;

    /* renamed from: j0  reason: collision with root package name */
    public final T f4743j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Z f4744k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ b0 f4745l0;

    public B(b0 b0Var, Dh.n nVar, Y y10) {
        this.f4745l0 = b0Var;
        this.f4739Y = nVar;
        K k10 = b0Var.f4767Y;
        k10.getClass();
        this.f4740Z = k10;
        List<C> list = b0Var.f4769h0;
        this.f4741h0 = new ArrayList(list.size());
        for (C c10 : list) {
            ArrayList arrayList = this.f4741h0;
            c10.getClass();
            arrayList.add(c10);
        }
        this.f4742i0 = b0Var.f4770i0.a(nVar.f4810a);
        this.f4743j0 = b0Var.f4768Z.b(nVar);
        this.f4744k0 = y10;
    }

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        Hh.a aVar;
        S a5 = this.f4743j0.a(abstractC6250o);
        Hh.n[] nVarArr = new Hh.n[2];
        Z z10 = this.f4744k0;
        z10.getClass();
        nVarArr[0] = Hh.m.f7819Y;
        a5.a();
        AbstractC6250o abstractC6250o2 = this.f4740Z.f4754a;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4741h0.iterator();
        while (it.hasNext()) {
            C c10 = (C) it.next();
            c10.getClass();
            int size = abstractC6250o.getParameters().size();
            int i10 = c10.f4746Y;
            if (i10 < size) {
                arrayList.addAll(Collections.singletonList(new D(i10, abstractC6250o)));
            } else {
                throw new IllegalStateException(abstractC6250o + " does not have a parameter with index " + i10 + ", " + abstractC6250o.getParameters().size() + " defined");
            }
        }
        AbstractC6235K parameters = abstractC6250o2.getParameters();
        if (parameters.size() == arrayList.size()) {
            Iterator it2 = parameters.iterator();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                b0 b0Var = this.f4745l0;
                if (hasNext) {
                    AbstractC6226B abstractC6226B = (AbstractC6226B) it2.next();
                    Ih.a aVar2 = b0Var.f4772k0;
                    D d10 = (D) ((E) it3.next());
                    AbstractC6250o abstractC6250o3 = d10.f4748b;
                    AbstractC6226B abstractC6226B2 = (AbstractC6226B) abstractC6250o3.getParameters().get(d10.f4747a);
                    Iterator it4 = it3;
                    Iterator it5 = it2;
                    Hh.a aVar3 = aVar;
                    Hh.j jVar = new Hh.j(new Mh.n(Mh.o.a(abstractC6226B2.getType()), abstractC6226B2.s()), aVar2.a(abstractC6226B2.getType(), abstractC6226B.getType(), b0Var.f4773l0));
                    if (jVar.b()) {
                        arrayList2.add(jVar);
                        it2 = it5;
                        it3 = it4;
                        aVar = aVar3;
                    } else {
                        throw new IllegalStateException("Cannot assign " + abstractC6226B2 + " to " + abstractC6226B + " for " + abstractC6250o3);
                    }
                } else {
                    Ih.a aVar4 = b0Var.f4772k0;
                    int i11 = b0Var.f4773l0;
                    nVarArr[1] = new Hh.j(a5.b(abstractC6250o2, aVar4, i11), new Hh.j(arrayList2), this.f4742i0.b(abstractC6250o2, this.f4739Y), z10.a(abstractC6250o2, abstractC6250o, b0Var.f4772k0, i11));
                    List<Hh.n> asList = Arrays.asList(nVarArr);
                    ArrayList arrayList3 = new ArrayList();
                    for (Hh.n nVar : asList) {
                        if (nVar instanceof Hh.j) {
                            arrayList3.addAll(((Hh.j) nVar).f7813Y);
                        } else if (!(nVar instanceof Hh.m)) {
                            arrayList3.add(nVar);
                        }
                    }
                    Hh.l lVar2 = Hh.l.f7816c;
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        lVar2 = lVar2.a(((Hh.n) it6.next()).e(lVar, abstractC0511j));
                    }
                    return new Hh.a(lVar2.f7818b, ((AbstractC6236a) abstractC6250o).p());
                }
            }
        } else {
            throw new IllegalStateException(abstractC6250o2 + " does not accept " + arrayList.size() + " arguments");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b10 = (B) obj;
        if (this.f4739Y.equals(b10.f4739Y) && this.f4740Z.equals(b10.f4740Z) && this.f4741h0.equals(b10.f4741h0) && this.f4742i0.equals(b10.f4742i0) && this.f4743j0.equals(b10.f4743j0) && this.f4744k0.equals(b10.f4744k0) && this.f4745l0.equals(b10.f4745l0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4739Y.hashCode();
        int hashCode2 = this.f4740Z.hashCode();
        int hashCode3 = this.f4741h0.hashCode();
        int hashCode4 = this.f4742i0.hashCode();
        int hashCode5 = this.f4743j0.hashCode();
        int hashCode6 = this.f4744k0.hashCode();
        return this.f4745l0.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (B.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
