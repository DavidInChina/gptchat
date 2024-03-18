package N0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final t f12567a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12568b;

    public u(t tVar, s sVar) {
        this.f12567a = tVar;
        this.f12568b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f12568b, uVar.f12568b) && AbstractC3557B.K(this.f12567a, uVar.f12567a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        t tVar = this.f12567a;
        if (tVar != null) {
            i10 = tVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        s sVar = this.f12568b;
        if (sVar != null) {
            i11 = sVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f12567a + ", paragraphSyle=" + this.f12568b + ')';
    }
}
