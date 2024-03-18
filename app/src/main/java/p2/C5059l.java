package p2;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* renamed from: p2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5059l implements AbstractC5057j {

    /* renamed from: m0  reason: collision with root package name */
    public static final C5059l f42096m0 = new C5059l(1, 2, 3, -1, -1, null);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42097n0 = Integer.toString(0, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f42098o0 = Integer.toString(1, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f42099p0 = Integer.toString(2, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f42100q0 = Integer.toString(3, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f42101r0 = Integer.toString(4, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f42102s0 = Integer.toString(5, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final A9.a f42103t0 = new A9.a(10);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f42105Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f42106h0;

    /* renamed from: i0  reason: collision with root package name */
    public final byte[] f42107i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f42108j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f42109k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f42110l0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5059l(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f42104Y = i10;
        this.f42105Z = i11;
        this.f42106h0 = i12;
        this.f42107i0 = bArr;
        this.f42108j0 = i13;
        this.f42109k0 = i14;
    }

    public static String b(int i10) {
        if (i10 != -1) {
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return "Undefined color transfer";
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return -1;
        }
        return 2;
    }

    public static int d(int i10) {
        if (i10 != 1) {
            if (i10 != 4) {
                if (i10 != 13) {
                    if (i10 == 16) {
                        return 6;
                    }
                    if (i10 == 18) {
                        return 7;
                    }
                    if (i10 != 6 && i10 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f42097n0, this.f42104Y);
        bundle.putInt(f42098o0, this.f42105Z);
        bundle.putInt(f42099p0, this.f42106h0);
        bundle.putByteArray(f42100q0, this.f42107i0);
        bundle.putInt(f42101r0, this.f42108j0);
        bundle.putInt(f42102s0, this.f42109k0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5059l.class != obj.getClass()) {
            return false;
        }
        C5059l c5059l = (C5059l) obj;
        if (this.f42104Y == c5059l.f42104Y && this.f42105Z == c5059l.f42105Z && this.f42106h0 == c5059l.f42106h0 && Arrays.equals(this.f42107i0, c5059l.f42107i0) && this.f42108j0 == c5059l.f42108j0 && this.f42109k0 == c5059l.f42109k0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42110l0 == 0) {
            this.f42110l0 = ((((Arrays.hashCode(this.f42107i0) + ((((((527 + this.f42104Y) * 31) + this.f42105Z) * 31) + this.f42106h0) * 31)) * 31) + this.f42108j0) * 31) + this.f42109k0;
        }
        return this.f42110l0;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        boolean z10 = true;
        int i10 = this.f42104Y;
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f42105Z;
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(b(this.f42106h0));
        sb2.append(", ");
        if (this.f42107i0 == null) {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        String str4 = "NA";
        int i12 = this.f42108j0;
        if (i12 != -1) {
            str3 = i12 + "bit Luma";
        } else {
            str3 = str4;
        }
        sb2.append(str3);
        sb2.append(", ");
        int i13 = this.f42109k0;
        if (i13 != -1) {
            str4 = i13 + "bit Chroma";
        }
        return R.a.t(sb2, str4, Separators.RPAREN);
    }
}
