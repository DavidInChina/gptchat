package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2548x0 extends AbstractC2552z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f27640c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j6, Object obj, int i10) {
        C2544v0 c2544v0;
        List list;
        List list2 = (List) C1.f27385c.k(j6, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof AbstractC2546w0) {
                list = new C2544v0(i10);
            } else if ((list2 instanceof AbstractC2492b1) && (list2 instanceof AbstractC2535q0)) {
                list = ((AbstractC2535q0) list2).h(i10);
            } else {
                list = new ArrayList(i10);
            }
            C1.v(j6, obj, list);
            return list;
        }
        if (f27640c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            C1.v(j6, obj, arrayList);
            c2544v0 = arrayList;
        } else if (list2 instanceof x1) {
            C2544v0 c2544v02 = new C2544v0(list2.size() + i10);
            c2544v02.addAll((x1) list2);
            C1.v(j6, obj, c2544v02);
            c2544v0 = c2544v02;
        } else if ((list2 instanceof AbstractC2492b1) && (list2 instanceof AbstractC2535q0)) {
            AbstractC2535q0 abstractC2535q0 = (AbstractC2535q0) list2;
            if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
                AbstractC2535q0 h10 = abstractC2535q0.h(list2.size() + i10);
                C1.v(j6, obj, h10);
                return h10;
            }
            return list2;
        } else {
            return list2;
        }
        return c2544v0;
    }

    @Override // com.google.protobuf.AbstractC2552z0
    public final void a(long j6, Object obj) {
        Object obj2;
        List list = (List) C1.f27385c.k(j6, obj);
        if (list instanceof AbstractC2546w0) {
            obj2 = ((AbstractC2546w0) list).e();
        } else {
            if (f27640c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof AbstractC2492b1) && (list instanceof AbstractC2535q0)) {
                AbstractC2496d abstractC2496d = (AbstractC2496d) ((AbstractC2535q0) list);
                if (abstractC2496d.f27534Y) {
                    abstractC2496d.f27534Y = false;
                    return;
                }
                return;
            }
            obj2 = Collections.unmodifiableList(list);
        }
        C1.v(j6, obj, obj2);
    }

    @Override // com.google.protobuf.AbstractC2552z0
    public final void b(long j6, Object obj, Object obj2) {
        List list = (List) C1.f27385c.k(j6, obj2);
        List d10 = d(j6, obj, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        C1.v(j6, obj, list);
    }

    @Override // com.google.protobuf.AbstractC2552z0
    public final List c(long j6, Object obj) {
        return d(j6, obj, 10);
    }
}
