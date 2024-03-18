package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445e0 extends AbstractC2449g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f26917c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.play_billing.AbstractC2449g0
    public final void a(long j6, Object obj) {
        Object obj2;
        List list = (List) J0.i(j6, obj);
        if (list instanceof AbstractC2443d0) {
            obj2 = ((AbstractC2443d0) list).q();
        } else {
            if (!f26917c.isAssignableFrom(list.getClass())) {
                if ((list instanceof AbstractC2478v0) && (list instanceof X)) {
                    AbstractC2483y abstractC2483y = (AbstractC2483y) ((X) list);
                    boolean z10 = abstractC2483y.f26991Y;
                    if (z10 && z10) {
                        abstractC2483y.f26991Y = false;
                        return;
                    }
                    return;
                }
                obj2 = Collections.unmodifiableList(list);
            } else {
                return;
            }
        }
        J0.p(j6, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2449g0
    public final void b(long j6, Object obj, Object obj2) {
        C2441c0 c2441c0;
        List list = (List) J0.i(j6, obj2);
        int size = list.size();
        List list2 = (List) J0.i(j6, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof AbstractC2443d0) {
                list2 = new C2441c0(size);
            } else if ((list2 instanceof AbstractC2478v0) && (list2 instanceof X)) {
                list2 = ((X) list2).u(size);
            } else {
                list2 = new ArrayList(size);
            }
            J0.p(j6, obj, list2);
        } else {
            if (f26917c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                J0.p(j6, obj, arrayList);
                c2441c0 = arrayList;
            } else if (list2 instanceof E0) {
                C2441c0 c2441c02 = new C2441c0(list2.size() + size);
                c2441c02.addAll(c2441c02.f26912Z.size(), (E0) list2);
                J0.p(j6, obj, c2441c02);
                c2441c0 = c2441c02;
            } else if ((list2 instanceof AbstractC2478v0) && (list2 instanceof X)) {
                X x10 = (X) list2;
                if (!((AbstractC2483y) x10).f26991Y) {
                    list2 = x10.u(list2.size() + size);
                    J0.p(j6, obj, list2);
                }
            }
            list2 = c2441c0;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        J0.p(j6, obj, list);
    }
}
