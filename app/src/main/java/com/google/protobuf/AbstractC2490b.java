package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2490b implements L0 {
    public static void a(Iterable iterable, List list) {
        Charset charset = AbstractC2536r0.f27584a;
        iterable.getClass();
        if (iterable instanceof AbstractC2546w0) {
            List d10 = ((AbstractC2546w0) iterable).d();
            AbstractC2546w0 abstractC2546w0 = (AbstractC2546w0) list;
            int size = list.size();
            for (Object obj : d10) {
                if (obj == null) {
                    String str = "Element at index " + (abstractC2546w0.size() - size) + " is null.";
                    for (int size2 = abstractC2546w0.size() - 1; size2 >= size; size2--) {
                        abstractC2546w0.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC2534q) {
                    abstractC2546w0.J((AbstractC2534q) obj);
                } else {
                    abstractC2546w0.add((String) obj);
                }
            }
        } else if (iterable instanceof AbstractC2492b1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }
}
