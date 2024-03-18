package Rh;

import Bh.AbstractC0263p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zh.AbstractC6872F;

/* loaded from: classes.dex */
public final class l1 extends AbstractC1293c {

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15925j0;

    public l1(AbstractC1293c abstractC1293c, HashMap hashMap) {
        super(EnumC1295d.f15806Y, abstractC1293c);
        this.f15925j0 = hashMap;
    }

    public static l1 e(List list, AbstractC0263p abstractC0263p, AbstractC1293c abstractC1293c) {
        HashMap hashMap = new HashMap();
        hashMap.put(abstractC0263p.getName(), abstractC0263p);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (yh.l1 l1Var : ((AbstractC6872F) ((zh.G) it.next())).a().keySet()) {
                hashMap.put(l1Var.getName(), l1Var);
            }
        }
        return new l1(abstractC1293c, hashMap);
    }

    @Override // Rh.AbstractC1293c
    public final o1 b(String str) {
        yh.l1 l1Var = (yh.l1) this.f15925j0.get(str);
        if (l1Var == null) {
            return new m1(str);
        }
        return new n1(l1Var);
    }

    @Override // Rh.AbstractC1293c
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        if (!this.f15925j0.equals(((l1) obj).f15925j0)) {
            return false;
        }
        return true;
    }

    @Override // Rh.AbstractC1293c
    public final int hashCode() {
        return this.f15925j0.hashCode() + (super.hashCode() * 31);
    }
}
