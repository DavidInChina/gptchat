package Xe;

import y.AbstractC6463a;

/* renamed from: Xe.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21888a = true;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21889b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21890c = true;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21891d = true;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21892e = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683e)) {
            return false;
        }
        C1683e c1683e = (C1683e) obj;
        if (this.f21888a == c1683e.f21888a && this.f21889b == c1683e.f21889b && this.f21890c == c1683e.f21890c && this.f21891d == c1683e.f21891d && this.f21892e == c1683e.f21892e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f21888a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = i11 * 31;
        boolean z11 = this.f21889b;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f21890c;
        if (z12) {
            z12 = true;
        }
        int i17 = z12 ? 1 : 0;
        int i18 = z12 ? 1 : 0;
        int i19 = (i16 + i17) * 31;
        boolean z13 = this.f21891d;
        if (z13) {
            z13 = true;
        }
        int i20 = z13 ? 1 : 0;
        int i21 = z13 ? 1 : 0;
        int i22 = (i19 + i20) * 31;
        boolean z14 = this.f21892e;
        if (!z14) {
            i10 = z14 ? 1 : 0;
        }
        return i22 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalAudioTrackOptions(noiseSuppression=");
        sb2.append(this.f21888a);
        sb2.append(", echoCancellation=");
        sb2.append(this.f21889b);
        sb2.append(", autoGainControl=");
        sb2.append(this.f21890c);
        sb2.append(", highPassFilter=");
        sb2.append(this.f21891d);
        sb2.append(", typingNoiseDetection=");
        return AbstractC6463a.l(sb2, this.f21892e, ')');
    }
}
