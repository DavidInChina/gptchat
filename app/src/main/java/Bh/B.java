package Bh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import wh.C6246k;
import wh.C6249n;

/* loaded from: classes2.dex */
public final class B implements O {

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedHashMap f2173Y;

    public B(LinkedHashMap linkedHashMap) {
        this.f2173Y = linkedHashMap;
    }

    @Override // Bh.O
    public final N b() {
        return new N(new ArrayList(this.f2173Y.values()));
    }

    @Override // Bh.O
    public final M d(C6246k c6246k) {
        List list = c6246k.f48548c;
        M m10 = (M) this.f2173Y.get(new C0272u(list.size(), 0, Collections.singleton(new C6249n(c6246k.f48547b, list)), c6246k.f48546a));
        if (m10 == null) {
            return L.f2229Y;
        }
        return m10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        if (this.f2173Y.equals(((B) obj).f2173Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2173Y.hashCode() + (B.class.hashCode() * 31);
    }
}
