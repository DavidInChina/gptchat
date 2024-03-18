package T0;

import N0.C1046e;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f16756a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16757b;

    public G(C1046e c1046e, s sVar) {
        this.f16756a = c1046e;
        this.f16757b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f16756a, g10.f16756a) && AbstractC3557B.K(this.f16757b, g10.f16757b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16757b.hashCode() + (this.f16756a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f16756a) + ", offsetMapping=" + this.f16757b + ')';
    }
}
