package yh;

import java.util.ArrayList;
import yh.l1;

/* renamed from: yh.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6602d1 implements k1 {
    /* renamed from: f */
    public final l1.a c(l1.a aVar) {
        l1.a aVar2;
        l1.a ownerType = aVar.getOwnerType();
        ArrayList arrayList = new ArrayList(aVar.y0().size());
        for (l1.a aVar3 : aVar.y0()) {
            arrayList.add(aVar3.k(this));
        }
        l1 l02 = ((l1.a) aVar.p0().k(this)).l0();
        if (ownerType == null) {
            l1.a aVar4 = l1.a.f51045N;
            aVar2 = null;
        } else {
            aVar2 = (l1.a) ownerType.k(this);
        }
        return new C6648y0(l02, aVar2, arrayList, aVar);
    }

    /* renamed from: g */
    public final l1.a d(l1.a aVar) {
        return new L0(aVar.getUpperBounds().k(this), aVar.getLowerBounds().k(this), aVar);
    }
}
