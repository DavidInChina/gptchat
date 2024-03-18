package Ah;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Z implements a0 {
    @Override // Ah.a0
    public final Map b(ClassLoader classLoader, LinkedHashMap linkedHashMap) {
        return new T(classLoader, null).Y(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z10 = (Z) obj;
        return true;
    }

    public final int hashCode() {
        return Z.class.hashCode() * 31;
    }
}
