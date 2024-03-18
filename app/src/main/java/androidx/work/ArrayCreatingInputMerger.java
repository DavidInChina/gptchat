package androidx.work;

import L3.g;
import L3.k;
import androidx.lifecycle.D;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "LL3/k;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ArrayCreatingInputMerger extends k {
    @Override // L3.k
    public final g a(ArrayList arrayList) {
        Class<?> cls;
        Object newInstance;
        D d10 = new D(2);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((g) it.next()).f10715a);
            AbstractC3557B.b0("input.keyValueMap", unmodifiableMap);
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(str);
                AbstractC3557B.b0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                if (obj == null) {
                    if (!cls.isArray()) {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                        AbstractC3557B.b0("newArray", newInstance);
                        value = newInstance;
                        AbstractC3557B.b0("if (existingValue == nul\u2026      }\n                }", value);
                        hashMap.put(str, value);
                    } else {
                        AbstractC3557B.b0("if (existingValue == nul\u2026      }\n                }", value);
                        hashMap.put(str, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (AbstractC3557B.K(cls2, cls)) {
                        AbstractC3557B.b0("value", value);
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC3557B.Z(componentType);
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        AbstractC3557B.b0("newArray", newInstance2);
                        value = newInstance2;
                        AbstractC3557B.b0("if (existingValue == nul\u2026      }\n                }", value);
                        hashMap.put(str, value);
                    } else if (AbstractC3557B.K(cls2.getComponentType(), cls)) {
                        int length3 = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        AbstractC3557B.b0("newArray", newInstance);
                        value = newInstance;
                        AbstractC3557B.b0("if (existingValue == nul\u2026      }\n                }", value);
                        hashMap.put(str, value);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
        d10.o(hashMap);
        g gVar = new g(d10.f25290b);
        g.b(gVar);
        return gVar;
    }
}
