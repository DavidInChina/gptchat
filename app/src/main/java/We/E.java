package We;

import M3.H;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class E extends H {

    /* renamed from: j  reason: collision with root package name */
    public final Xe.F f20965j = null;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f20966k = true;

    /* renamed from: l  reason: collision with root package name */
    public final String f20967l = "vp8";

    /* renamed from: m  reason: collision with root package name */
    public final String f20968m = null;

    /* renamed from: n  reason: collision with root package name */
    public final C1652c f20969n = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (AbstractC3557B.K(this.f20965j, e10.f20965j) && this.f20966k == e10.f20966k && AbstractC3557B.K(this.f20967l, e10.f20967l) && AbstractC3557B.K(this.f20968m, e10.f20968m) && AbstractC3557B.K(this.f20969n, e10.f20969n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Xe.F f6 = this.f20965j;
        if (f6 == null) {
            i10 = 0;
        } else {
            i10 = f6.hashCode();
        }
        int i13 = i10 * 31;
        boolean z10 = this.f20966k;
        if (z10) {
            z10 = true;
        }
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        int v10 = E9.f.v(this.f20967l, (i13 + i14) * 31, 31);
        String str = this.f20968m;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = (v10 + i11) * 31;
        C1652c c1652c = this.f20969n;
        if (c1652c != null) {
            i12 = c1652c.hashCode();
        }
        return i16 + i12;
    }

    public final String toString() {
        return "VideoTrackPublishDefaults(videoEncoding=" + this.f20965j + ", simulcast=" + this.f20966k + ", videoCodec=" + this.f20967l + ", scalabilityMode=" + this.f20968m + ", backupCodec=" + this.f20969n + ')';
    }
}
