package K0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import v0.C5953f;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C5953f f9319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9320b;

    public b(C5953f c5953f, int i10) {
        this.f9319a = c5953f;
        this.f9320b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3557B.K(this.f9319a, bVar.f9319a) && this.f9320b == bVar.f9320b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9319a.hashCode() * 31) + this.f9320b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f9319a);
        sb2.append(", configFlags=");
        return AbstractC2469q0.j(sb2, this.f9320b, ')');
    }
}
