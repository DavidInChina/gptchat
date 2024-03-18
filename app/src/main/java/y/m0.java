package y;

import id.AbstractC3557B;
import z.C6694e;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6694e f50240a;

    /* renamed from: b  reason: collision with root package name */
    public long f50241b;

    public m0(C6694e c6694e, long j6) {
        this.f50240a = c6694e;
        this.f50241b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (AbstractC3557B.K(this.f50240a, m0Var.f50240a) && Z0.k.a(this.f50241b, m0Var.f50241b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f50241b;
        return ((int) (j6 ^ (j6 >>> 32))) + (this.f50240a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f50240a + ", startSize=" + ((Object) Z0.k.b(this.f50241b)) + ')';
    }
}
