package U3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17408a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17410c;

    public g(String str, int i10, int i11) {
        AbstractC3557B.c0("workSpecId", str);
        this.f17408a = str;
        this.f17409b = i10;
        this.f17410c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f17408a, gVar.f17408a) && this.f17409b == gVar.f17409b && this.f17410c == gVar.f17410c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f17408a.hashCode() * 31) + this.f17409b) * 31) + this.f17410c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f17408a);
        sb2.append(", generation=");
        sb2.append(this.f17409b);
        sb2.append(", systemId=");
        return AbstractC2469q0.j(sb2, this.f17410c, ')');
    }
}
