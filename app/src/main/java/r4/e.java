package r4;

import id.AbstractC3557B;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b  reason: collision with root package name */
    public final h f44436b = h.f44440c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (AbstractC3557B.K(this.f44436b, ((e) obj).f44436b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44436b.hashCode();
    }

    @Override // r4.i
    public final Object j(AbstractC4825e abstractC4825e) {
        return this.f44436b;
    }
}
