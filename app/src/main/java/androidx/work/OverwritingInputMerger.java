package androidx.work;

import L3.g;
import L3.k;
import androidx.lifecycle.D;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "LL3/k;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends k {
    @Override // L3.k
    public final g a(ArrayList arrayList) {
        D d10 = new D(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f10715a);
            AbstractC3557B.b0("input.keyValueMap", unmodifiableMap);
            linkedHashMap.putAll(unmodifiableMap);
        }
        d10.o(linkedHashMap);
        g gVar = new g(d10.f25290b);
        g.b(gVar);
        return gVar;
    }
}
