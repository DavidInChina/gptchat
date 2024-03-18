package N0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final o f12546a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12547b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12548c;

    public n(V0.c cVar, int i10, int i11) {
        this.f12546a = cVar;
        this.f12547b = i10;
        this.f12548c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3557B.K(this.f12546a, nVar.f12546a) && this.f12547b == nVar.f12547b && this.f12548c == nVar.f12548c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12546a.hashCode() * 31) + this.f12547b) * 31) + this.f12548c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f12546a);
        sb2.append(", startIndex=");
        sb2.append(this.f12547b);
        sb2.append(", endIndex=");
        return AbstractC2469q0.j(sb2, this.f12548c, ')');
    }
}
