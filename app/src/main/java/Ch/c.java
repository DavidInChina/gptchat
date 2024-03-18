package Ch;

import wh.AbstractC6242g;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6242g f3160a;

    public c(AbstractC6242g abstractC6242g) {
        this.f3160a = abstractC6242g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        if (this.f3160a.equals(((c) obj).f3160a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3160a.hashCode() + (c.class.hashCode() * 31);
    }
}
