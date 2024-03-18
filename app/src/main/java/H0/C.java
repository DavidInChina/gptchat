package H0;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class C {
    public static final void a(E1.p pVar, L0.o oVar) {
        if (Q.j(oVar)) {
            L0.u uVar = L0.i.f10405v;
            L0.j jVar = oVar.f10421d;
            L0.a aVar = (L0.a) U3.f.T(jVar, uVar);
            if (aVar != null) {
                pVar.b(new E1.h(16908358, aVar.f10368a));
            }
            L0.u uVar2 = L0.i.f10407x;
            LinkedHashMap linkedHashMap = jVar.f10409Y;
            Object obj = linkedHashMap.get(uVar2);
            L0.a aVar2 = null;
            if (obj == null) {
                obj = null;
            }
            L0.a aVar3 = (L0.a) obj;
            if (aVar3 != null) {
                pVar.b(new E1.h(16908359, aVar3.f10368a));
            }
            Object obj2 = linkedHashMap.get(L0.i.f10406w);
            if (obj2 == null) {
                obj2 = null;
            }
            L0.a aVar4 = (L0.a) obj2;
            if (aVar4 != null) {
                pVar.b(new E1.h(16908360, aVar4.f10368a));
            }
            Object obj3 = linkedHashMap.get(L0.i.f10408y);
            if (obj3 != null) {
                aVar2 = obj3;
            }
            L0.a aVar5 = aVar2;
            if (aVar5 != null) {
                pVar.b(new E1.h(16908361, aVar5.f10368a));
            }
        }
    }
}
