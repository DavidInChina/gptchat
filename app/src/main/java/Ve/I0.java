package Ve;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18668a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18669b;

    public I0(long j6, String str) {
        AbstractC3557B.c0("codec", str);
        this.f18668a = str;
        this.f18669b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        if (AbstractC3557B.K(this.f18668a, i02.f18668a) && this.f18669b == i02.f18669b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f18669b;
        return (this.f18668a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "TrackBitrateInfo(codec=" + this.f18668a + ", maxBitrate=" + this.f18669b + ')';
    }
}
