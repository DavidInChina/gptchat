package Rh;

import java.util.Map;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final String f15637a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f15638b;

    public K(String str, Map map) {
        this.f15637a = str;
        this.f15638b = map;
    }

    public static J a(K k10, p1 p1Var) {
        o1 a5 = p1Var.a(k10.b());
        if (a5.b()) {
            return new I(new B0(p1Var, a5.a(), k10.f15638b));
        }
        return new H(k10.b());
    }

    public final String b() {
        String str = this.f15637a;
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f15637a.equals(k10.f15637a) && this.f15638b.equals(k10.f15638b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15638b.hashCode() + E9.f.v(this.f15637a, K.class.hashCode() * 31, 31);
    }
}
