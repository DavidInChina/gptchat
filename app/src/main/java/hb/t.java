package hb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32129a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32130b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32131c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32132d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32133e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32134f;

    /* renamed from: g  reason: collision with root package name */
    public final C2969F f32135g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32136h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32137i;

    public t(boolean z10, boolean z11, String str, long j6, boolean z12, boolean z13, C2969F c2969f, boolean z14, boolean z15) {
        AbstractC3557B.c0("counter", str);
        this.f32129a = z10;
        this.f32130b = z11;
        this.f32131c = str;
        this.f32132d = j6;
        this.f32133e = z12;
        this.f32134f = z13;
        this.f32135g = c2969f;
        this.f32136h = z14;
        this.f32137i = z15;
    }

    public static t e(t tVar, boolean z10, boolean z11, String str, long j6, boolean z12, boolean z13, C2969F c2969f, boolean z14, int i10) {
        boolean z15;
        boolean z16;
        String str2;
        long j10;
        boolean z17;
        boolean z18;
        C2969F c2969f2;
        boolean z19;
        if ((i10 & 1) != 0) {
            z15 = tVar.f32129a;
        } else {
            z15 = z10;
        }
        if ((i10 & 2) != 0) {
            z16 = tVar.f32130b;
        } else {
            z16 = z11;
        }
        if ((i10 & 4) != 0) {
            str2 = tVar.f32131c;
        } else {
            str2 = str;
        }
        if ((i10 & 8) != 0) {
            j10 = tVar.f32132d;
        } else {
            j10 = j6;
        }
        if ((i10 & 16) != 0) {
            z17 = tVar.f32133e;
        } else {
            z17 = z12;
        }
        if ((i10 & 32) != 0) {
            z18 = tVar.f32134f;
        } else {
            z18 = z13;
        }
        if ((i10 & 64) != 0) {
            c2969f2 = tVar.f32135g;
        } else {
            c2969f2 = c2969f;
        }
        boolean z20 = tVar.f32136h;
        if ((i10 & 256) != 0) {
            z19 = tVar.f32137i;
        } else {
            z19 = z14;
        }
        tVar.getClass();
        AbstractC3557B.c0("counter", str2);
        return new t(z15, z16, str2, j10, z17, z18, c2969f2, z20, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f32129a == tVar.f32129a && this.f32130b == tVar.f32130b && AbstractC3557B.K(this.f32131c, tVar.f32131c) && this.f32132d == tVar.f32132d && this.f32133e == tVar.f32133e && this.f32134f == tVar.f32134f && AbstractC3557B.K(this.f32135g, tVar.f32135g) && this.f32136h == tVar.f32136h && this.f32137i == tVar.f32137i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 1237;
        if (this.f32129a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i17 = i10 * 31;
        if (this.f32130b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int v10 = E9.f.v(this.f32131c, (i17 + i11) * 31, 31);
        long j6 = this.f32132d;
        int i18 = (v10 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        if (this.f32133e) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i19 = (i18 + i12) * 31;
        if (this.f32134f) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i20 = (i19 + i13) * 31;
        C2969F c2969f = this.f32135g;
        if (c2969f == null) {
            i14 = 0;
        } else {
            i14 = c2969f.hashCode();
        }
        int i21 = (i20 + i14) * 31;
        if (this.f32136h) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i22 = (i21 + i15) * 31;
        if (this.f32137i) {
            i16 = 1231;
        }
        return i22 + i16;
    }

    public final String toString() {
        return "MessageAudioState(show=" + this.f32129a + ", autoRead=" + this.f32130b + ", counter=" + this.f32131c + ", duration=" + this.f32132d + ", error=" + this.f32133e + ", loading=" + this.f32134f + ", message=" + this.f32135g + ", enableAutoRead=" + this.f32136h + ", isPaused=" + this.f32137i + Separators.RPAREN;
    }

    public /* synthetic */ t(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, int i10) {
        this(z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? "" : str, 0L, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13, null, z14, false);
    }
}
