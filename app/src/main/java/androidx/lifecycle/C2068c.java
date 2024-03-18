package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2068c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f25355a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f25356b;

    public C2068c(HashMap hashMap) {
        this.f25356b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC2081p enumC2081p = (EnumC2081p) entry.getValue();
            List list = (List) this.f25355a.get(enumC2081p);
            if (list == null) {
                list = new ArrayList();
                this.f25355a.put(enumC2081p, list);
            }
            list.add((C2069d) entry.getKey());
        }
    }

    public static void a(List list, AbstractC2086v abstractC2086v, EnumC2081p enumC2081p, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2069d c2069d = (C2069d) list.get(size);
                c2069d.getClass();
                try {
                    int i10 = c2069d.f25357a;
                    Method method = c2069d.f25358b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                method.invoke(obj, abstractC2086v, enumC2081p);
                            }
                        } else {
                            method.invoke(obj, abstractC2086v);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
