package We;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: We.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1650a extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final Integer f20978j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f20979k = true;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f20980l = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650a)) {
            return false;
        }
        C1650a c1650a = (C1650a) obj;
        if (AbstractC3557B.K(this.f20978j, c1650a.f20978j) && this.f20979k == c1650a.f20979k && this.f20980l == c1650a.f20980l) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Integer num = this.f20978j;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i11 = i10 * 31;
        int i12 = 1;
        boolean z10 = this.f20979k;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (i11 + i13) * 31;
        boolean z11 = this.f20980l;
        if (!z11) {
            i12 = z11 ? 1 : 0;
        }
        return i15 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioTrackPublishDefaults(audioBitrate=");
        sb2.append(this.f20978j);
        sb2.append(", dtx=");
        sb2.append(this.f20979k);
        sb2.append(", red=");
        return AbstractC6463a.l(sb2, this.f20980l, ')');
    }
}
