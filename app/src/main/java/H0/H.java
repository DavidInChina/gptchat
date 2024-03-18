package H0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final L0.o f6737a;

    /* renamed from: b  reason: collision with root package name */
    public final L0.j f6738b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f6739c = new LinkedHashSet();

    public H(L0.o oVar, Map map) {
        this.f6737a = oVar;
        this.f6738b = oVar.f10421d;
        List g10 = oVar.g(false, true);
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            L0.o oVar2 = (L0.o) g10.get(i10);
            if (map.containsKey(Integer.valueOf(oVar2.f10424g))) {
                this.f6739c.add(Integer.valueOf(oVar2.f10424g));
            }
        }
    }
}
