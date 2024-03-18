package Bg;

import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f2082a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f2083b = new AtomicInteger(0);

    public static Q a(List list) {
        if (list.isEmpty()) {
            return Q.f2085h0;
        }
        return new Q(list);
    }

    public final int b(String str) {
        int intValue;
        ConcurrentHashMap concurrentHashMap = this.f2082a;
        Xf.f fVar = new Xf.f(14, this);
        AbstractC3557B.c0("<this>", concurrentHashMap);
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num == null) {
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object invoke = fVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    AbstractC3557B.Z(num2);
                    intValue = num2.intValue();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return intValue;
        }
        return num.intValue();
    }
}
