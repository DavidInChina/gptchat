package C0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f2481a;

    /* renamed from: b  reason: collision with root package name */
    public float f2482b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2481a == aVar.f2481a && Float.compare(this.f2482b, aVar.f2482b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f2481a;
        return Float.floatToIntBits(this.f2482b) + (((int) (j6 ^ (j6 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f2481a);
        sb2.append(", dataPoint=");
        return AbstractC6463a.k(sb2, this.f2482b, ')');
    }
}
