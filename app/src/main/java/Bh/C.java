package Bh;

import java.util.LinkedHashMap;
import wh.AbstractC6236a;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2189a;

    public C() {
        this(new LinkedHashMap());
    }

    public final B a(F f6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (A a5 : this.f2189a.values()) {
            M c10 = a5.c(f6);
            linkedHashMap.put(a5.getKey().c(((AbstractC6236a) c10.e()).k1()), c10);
        }
        return new B(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        if (this.f2189a.equals(((C) obj).f2189a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2189a.hashCode() + (C.class.hashCode() * 31);
    }

    public C(LinkedHashMap linkedHashMap) {
        this.f2189a = linkedHashMap;
    }
}
