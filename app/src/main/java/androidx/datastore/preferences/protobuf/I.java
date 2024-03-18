package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class I extends K {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f24993c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j6, Object obj, int i10) {
        G g10;
        List list;
        List list2 = (List) x0.f25132d.i(j6, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof H) {
                list = new G(i10);
            } else {
                list = new ArrayList(i10);
            }
            x0.r(j6, obj, list);
            return list;
        }
        if (f24993c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            x0.r(j6, obj, arrayList);
            g10 = arrayList;
        } else if (list2 instanceof s0) {
            G g11 = new G(list2.size() + i10);
            g11.addAll((s0) list2);
            x0.r(j6, obj, g11);
            g10 = g11;
        } else {
            return list2;
        }
        return g10;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final void a(long j6, Object obj) {
        Object obj2;
        List list = (List) x0.f25132d.i(j6, obj);
        if (list instanceof H) {
            obj2 = ((H) list).e();
        } else {
            if (f24993c.isAssignableFrom(list.getClass())) {
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        x0.r(j6, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final void b(long j6, Object obj, Object obj2) {
        List list = (List) x0.f25132d.i(j6, obj2);
        List d10 = d(j6, obj, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        x0.r(j6, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final List c(long j6, Object obj) {
        return d(j6, obj, 10);
    }
}
