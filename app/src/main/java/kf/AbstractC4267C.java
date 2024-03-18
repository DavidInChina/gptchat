package kf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import l8.AbstractC4344b;

/* renamed from: kf.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4267C extends AbstractC4268D {
    public static List n1(Map map) {
        AbstractC3557B.c0("<this>", map);
        int size = map.size();
        v vVar = v.f37483Y;
        if (size == 0) {
            return vVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return vVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC4344b.F0(new C3959i(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C3959i(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C3959i(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
