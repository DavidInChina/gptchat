package z;

import id.AbstractC3557B;

/* renamed from: z.U  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6680U extends AbstractC6679T {
    public final boolean equals(Object obj) {
        if (obj instanceof C6680U) {
            C6680U c6680u = (C6680U) obj;
            if (AbstractC3557B.K(c6680u.f51191a, this.f51191a) && AbstractC3557B.K(c6680u.f51192b, this.f51192b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f51191a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return this.f51192b.hashCode() + (i10 * 31);
    }
}
