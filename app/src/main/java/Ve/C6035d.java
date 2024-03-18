package ve;

import id.AbstractC3557B;

/* renamed from: ve.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6035d {

    /* renamed from: a  reason: collision with root package name */
    public final Je.a f47491a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f47492b;

    public C6035d(Je.a aVar, Object obj) {
        AbstractC3557B.c0("expectedType", aVar);
        AbstractC3557B.c0("response", obj);
        this.f47491a = aVar;
        this.f47492b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6035d)) {
            return false;
        }
        C6035d c6035d = (C6035d) obj;
        if (AbstractC3557B.K(this.f47491a, c6035d.f47491a) && AbstractC3557B.K(this.f47492b, c6035d.f47492b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47492b.hashCode() + (this.f47491a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f47491a + ", response=" + this.f47492b + ')';
    }
}
