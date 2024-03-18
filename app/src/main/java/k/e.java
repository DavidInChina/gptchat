package K;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e extends a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC3557B.K(this.f9311Y, eVar.f9311Y)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f9312Z, eVar.f9312Z)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f9313h0, eVar.f9313h0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f9314i0, eVar.f9314i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9312Z.hashCode();
        int hashCode2 = this.f9313h0.hashCode();
        return this.f9314i0.hashCode() + ((hashCode2 + ((hashCode + (this.f9311Y.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f9311Y + ", topEnd = " + this.f9312Z + ", bottomEnd = " + this.f9313h0 + ", bottomStart = " + this.f9314i0 + ')';
    }
}
