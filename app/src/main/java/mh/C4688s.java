package mh;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: mh.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4688s {

    /* renamed from: a  reason: collision with root package name */
    public final float f39503a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f39504b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39505c;

    /* renamed from: d  reason: collision with root package name */
    public final r f39506d;

    public C4688s(float f6, int i10) {
        boolean z10;
        f6 = (i10 & 1) != 0 ? 2.0f : f6;
        boolean z11 = false;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (i10 & 4) != 0 ? true : z11;
        this.f39503a = f6;
        this.f39504b = z10;
        this.f39505c = z11;
        this.f39506d = new r(f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688s)) {
            return false;
        }
        C4688s c4688s = (C4688s) obj;
        if (Float.compare(this.f39503a, c4688s.f39503a) == 0 && this.f39504b == c4688s.f39504b && this.f39505c == c4688s.f39505c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f39503a) * 31;
        int i11 = 1237;
        if (this.f39504b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (floatToIntBits + i10) * 31;
        if (this.f39505c) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoomSpec(maxZoomFactor=");
        sb2.append(this.f39503a);
        sb2.append(", preventOverOrUnderZoom=");
        sb2.append(this.f39504b);
        sb2.append(", enablePan=");
        return AbstractC4194d.w(sb2, this.f39505c, Separators.RPAREN);
    }
}
