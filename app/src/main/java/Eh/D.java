package Eh;

import wh.AbstractC6250o;

/* loaded from: classes.dex */
public final class D implements E {

    /* renamed from: a  reason: collision with root package name */
    public final int f4747a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6250o f4748b;

    public D(int i10, AbstractC6250o abstractC6250o) {
        this.f4747a = i10;
        this.f4748b = abstractC6250o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f4747a == d10.f4747a && this.f4748b.equals(d10.f4748b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4748b.hashCode() + (((D.class.hashCode() * 31) + this.f4747a) * 31);
    }
}
