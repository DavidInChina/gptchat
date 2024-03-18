package Qh;

import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class G extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final F f14965a;

    public G(F f6) {
        this.f14965a = f6;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return this.f14965a.a((AbstractC6250o) obj);
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        if (!this.f14965a.equals(((G) obj).f14965a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14965a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return this.f14965a.f14963Y;
    }
}
