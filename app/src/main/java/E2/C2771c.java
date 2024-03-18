package e2;

import a1.C1915c;
import id.AbstractC3557B;

/* renamed from: e2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2771c {

    /* renamed from: d  reason: collision with root package name */
    public static final C2771c f28747d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f28748e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f28749f;

    /* renamed from: a  reason: collision with root package name */
    public final int f28751a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28752b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1915c f28746c = new C1915c(18, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final int f28750g = 1;

    static {
        P5.c cVar = C2769a.f28742b;
        C1915c c1915c = C2770b.f28744b;
        f28747d = new C2771c(0, c1915c.n());
        c1915c.n();
        c1915c.n();
        c1915c.k();
        c1915c.k();
        c1915c.k();
        f28748e = c1915c.n();
        f28749f = c1915c.k();
    }

    public C2771c(int i10, int i11) {
        this.f28751a = i10;
        this.f28752b = i11;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C2771c.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.layout.Alignment", obj);
        C2771c c2771c = (C2771c) obj;
        if (C2769a.b(this.f28751a, c2771c.f28751a) && C2770b.b(this.f28752b, c2771c.f28752b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        P5.c cVar = C2769a.f28742b;
        C1915c c1915c = C2770b.f28744b;
        return (this.f28751a * 31) + this.f28752b;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C2769a.c(this.f28751a)) + ", vertical=" + ((Object) C2770b.c(this.f28752b)) + ')';
    }
}
