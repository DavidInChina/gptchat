package androidx.glance.appwidget.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class G extends I {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f25160c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j6, Object obj, int i10) {
        E e10;
        List list;
        List list2 = (List) m0.f25250c.i(j6, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof F) {
                list = new E(i10);
            } else {
                list = new ArrayList(i10);
            }
            m0.s(j6, obj, list);
            return list;
        }
        if (f25160c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            m0.s(j6, obj, arrayList);
            e10 = arrayList;
        } else if (list2 instanceof h0) {
            E e11 = new E(list2.size() + i10);
            e11.addAll((h0) list2);
            m0.s(j6, obj, e11);
            e10 = e11;
        } else {
            return list2;
        }
        return e10;
    }

    @Override // androidx.glance.appwidget.protobuf.I
    public final void a(long j6, Object obj) {
        Object obj2;
        List list = (List) m0.f25250c.i(j6, obj);
        if (list instanceof F) {
            obj2 = ((F) list).e();
        } else {
            if (f25160c.isAssignableFrom(list.getClass())) {
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        m0.s(j6, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.I
    public final void b(long j6, Object obj, Object obj2) {
        List list = (List) m0.f25250c.i(j6, obj2);
        List d10 = d(j6, obj, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        m0.s(j6, obj, list);
    }

    @Override // androidx.glance.appwidget.protobuf.I
    public final List c(long j6, Object obj) {
        return d(j6, obj, 10);
    }
}
