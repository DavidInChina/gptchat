package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final Map f34970a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f34971b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f34970a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i10 = C.f34975d;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C.f34973b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((H) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C.f34973b;
        Collections.sort(arrayList, comparator);
        this.f34971b = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j6, H h10) {
        Map map = (Map) this.f34970a.get(h10);
        if (map != null) {
            return (String) map.get(Long.valueOf(j6));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator b(H h10) {
        List list = (List) this.f34971b.get(h10);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
