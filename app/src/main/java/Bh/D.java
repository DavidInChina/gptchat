package Bh;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public final String f2192a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2193b;

    public D(String str, int i10) {
        this.f2192a = str;
        this.f2193b = i10;
    }

    public abstract Set a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f2192a.equals(d10.f2192a) && this.f2193b == d10.f2193b && !Collections.disjoint(a(), d10.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2193b * 31) + this.f2192a.hashCode();
    }
}
