package Mg;

import Cf.i;
import Df.H;
import Lg.n;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.UtilsKt;
import id.AbstractC3557B;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes2.dex */
public final class b implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f12127Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public static final long f12128h0 = H.B(4611686018427387903L);

    /* renamed from: i0  reason: collision with root package name */
    public static final long f12129i0 = H.B(-4611686018427387903L);

    /* renamed from: Y  reason: collision with root package name */
    public final long f12130Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [Mg.a, java.lang.Object] */
    static {
        ThreadLocal[] threadLocalArr = c.f12131a;
    }

    public /* synthetic */ b(long j6) {
        this.f12130Y = j6;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [Cf.i, Cf.l] */
    public static final long a(long j6, long j10) {
        long j11 = (long) UtilsKt.MICROS_MULTIPLIER;
        long j12 = j10 / j11;
        long j13 = j6 + j12;
        if (new i(-4611686018426L, 4611686018426L).r(j13)) {
            return H.D((j13 * j11) + (j10 - (j12 * j11)));
        }
        return H.B(N.q(j13, -4611686018427387903L, 4611686018427387903L));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String r22 = n.r2(String.valueOf(i11), i12);
            int i13 = -1;
            int length = r22.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (r22.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) r22, 0, i15);
            } else {
                sb2.append((CharSequence) r22, 0, ((i13 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int c(long j6, long j10) {
        long j11 = j6 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j6) & 1) - (((int) j10) & 1);
            if (j6 < 0) {
                return -i10;
            }
            return i10;
        }
        int i11 = (j6 > j10 ? 1 : (j6 == j10 ? 0 : -1));
        if (i11 < 0) {
            return -1;
        }
        if (i11 != 0) {
            return 1;
        }
        return 0;
    }

    public static final boolean d(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final long e(long j6) {
        if ((((int) j6) & 1) == 1 && (!h(j6))) {
            return j6 >> 1;
        }
        return l(j6, d.f12133h0);
    }

    public static final int f(long j6) {
        long j10;
        boolean z10 = false;
        if (h(j6)) {
            return 0;
        }
        if ((((int) j6) & 1) == 1) {
            z10 = true;
        }
        if (z10) {
            j10 = ((j6 >> 1) % 1000) * ((long) UtilsKt.MICROS_MULTIPLIER);
        } else {
            j10 = (j6 >> 1) % 1000000000;
        }
        return (int) j10;
    }

    public static int g(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static final boolean h(long j6) {
        if (j6 != f12128h0 && j6 != f12129i0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [Cf.i, Cf.l] */
    public static final long i(long j6, long j10) {
        if (h(j6)) {
            if (!(!h(j10)) && (j10 ^ j6) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j6;
        } else if (h(j10)) {
            return j10;
        } else {
            int i10 = ((int) j6) & 1;
            if (i10 == (((int) j10) & 1)) {
                long j11 = (j6 >> 1) + (j10 >> 1);
                if (i10 == 0) {
                    if (new i(-4611686018426999999L, 4611686018426999999L).r(j11)) {
                        return H.D(j11);
                    }
                    return H.B(j11 / ((long) UtilsKt.MICROS_MULTIPLIER));
                }
                return H.C(j11);
            } else if (i10 == 1) {
                return a(j6 >> 1, j10 >> 1);
            } else {
                return a(j10 >> 1, j6 >> 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
        if ((r5 * r1) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
        if ((r5 * r1) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return r13;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [Cf.i, Cf.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Cf.i, Cf.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Cf.i, Cf.l] */
    /* JADX WARN: Type inference failed for: r1v13, types: [Cf.i, Cf.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(int i10, long j6) {
        boolean z10;
        int i11;
        int i12;
        long B10;
        if (h(j6)) {
            if (i10 != 0) {
                if (i10 > 0) {
                    return j6;
                }
                return o(j6);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i10 == 0) {
            return 0L;
        } else {
            int i13 = 1;
            long j10 = j6 >> 1;
            long j11 = i10;
            long j12 = j10 * j11;
            if ((((int) j6) & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j13 = f12129i0;
            long j14 = f12128h0;
            if (z10) {
                if (new i(-2147483647L, 2147483647L).r(j10)) {
                    return H.D(j12);
                }
                if (j12 / j11 == j10) {
                    if (new i(-4611686018426999999L, 4611686018426999999L).r(j12)) {
                        B10 = H.D(j12);
                    } else {
                        B10 = H.B(j12 / ((long) UtilsKt.MICROS_MULTIPLIER));
                    }
                    return B10;
                }
                long j15 = (long) UtilsKt.MICROS_MULTIPLIER;
                long j16 = j10 / j15;
                long j17 = j16 * j11;
                long j18 = (((j10 - (j16 * j15)) * j11) / j15) + j17;
                if (j17 / j11 == j16 && (j18 ^ j17) >= 0) {
                    return H.B(N.r(j18, new i(-4611686018427387903L, 4611686018427387903L)));
                }
                int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i14 < 0) {
                    i12 = -1;
                } else if (i14 > 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i10 < 0) {
                    i13 = -1;
                } else if (i10 <= 0) {
                    i13 = 0;
                }
            } else if (j12 / j11 == j10) {
                return H.B(N.r(j12, new i(-4611686018427387903L, 4611686018427387903L)));
            } else {
                int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i15 < 0) {
                    i11 = -1;
                } else if (i15 > 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i10 < 0) {
                    i13 = -1;
                } else if (i10 <= 0) {
                    i13 = 0;
                }
            }
        }
    }

    public static final double k(long j6, d dVar) {
        d dVar2;
        AbstractC3557B.c0("unit", dVar);
        if (j6 == f12128h0) {
            return Double.POSITIVE_INFINITY;
        }
        if (j6 == f12129i0) {
            return Double.NEGATIVE_INFINITY;
        }
        double d10 = j6 >> 1;
        if ((((int) j6) & 1) == 0) {
            dVar2 = d.f12132Z;
        } else {
            dVar2 = d.f12133h0;
        }
        return A7.b.v0(d10, dVar2, dVar);
    }

    public static final long l(long j6, d dVar) {
        d dVar2;
        AbstractC3557B.c0("unit", dVar);
        if (j6 == f12128h0) {
            return Long.MAX_VALUE;
        }
        if (j6 == f12129i0) {
            return Long.MIN_VALUE;
        }
        long j10 = j6 >> 1;
        if ((((int) j6) & 1) == 0) {
            dVar2 = d.f12132Z;
        } else {
            dVar2 = d.f12133h0;
        }
        return A7.b.w0(j10, dVar2, dVar);
    }

    public static String m(long j6) {
        boolean z10;
        long j10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i14 == 0) {
            return "0s";
        }
        if (j6 == f12128h0) {
            return "Infinity";
        }
        if (j6 == f12129i0) {
            return "-Infinity";
        }
        if (i14 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (i14 < 0) {
            j10 = o(j6);
        } else {
            j10 = j6;
        }
        long l10 = l(j10, d.f12137l0);
        if (h(j10)) {
            i10 = 0;
        } else {
            i10 = (int) (l(j10, d.f12136k0) % 24);
        }
        if (h(j10)) {
            i11 = 0;
        } else {
            i11 = (int) (l(j10, d.f12135j0) % 60);
        }
        if (h(j10)) {
            i12 = 0;
        } else {
            i12 = (int) (l(j10, d.f12134i0) % 60);
        }
        int f6 = f(j10);
        if (l10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i12 == 0 && f6 == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(l10);
            sb2.append('d');
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            sb2.append(i10);
            sb2.append('h');
            i13 = i15;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            sb2.append(i11);
            sb2.append('m');
            i13 = i16;
        }
        if (z14) {
            int i17 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            if (i12 == 0 && !z11 && !z12 && !z13) {
                if (f6 >= 1000000) {
                    b(sb2, f6 / UtilsKt.MICROS_MULTIPLIER, f6 % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
                } else if (f6 >= 1000) {
                    b(sb2, f6 / 1000, f6 % 1000, 3, "us", false);
                } else {
                    sb2.append(f6);
                    sb2.append("ns");
                }
            } else {
                b(sb2, i12, f6, 9, "s", false);
            }
            i13 = i17;
        }
        if (z10 && i13 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static String n(long j6, d dVar) {
        DecimalFormat decimalFormat;
        String str;
        AbstractC3557B.c0("unit", dVar);
        double k10 = k(j6, dVar);
        if (Double.isInfinite(k10)) {
            return String.valueOf(k10);
        }
        ThreadLocal[] threadLocalArr = c.f12131a;
        if (threadLocalArr.length > 0) {
            ThreadLocal threadLocal = threadLocalArr[0];
            Object obj = threadLocal.get();
            Object obj2 = obj;
            if (obj == null) {
                DecimalFormat decimalFormat2 = new DecimalFormat(WebrtcBuildVersion.maint_version);
                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat2);
                obj2 = decimalFormat2;
            }
            decimalFormat = (DecimalFormat) obj2;
        } else {
            decimalFormat = new DecimalFormat(WebrtcBuildVersion.maint_version);
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        String format = decimalFormat.format(k10);
        AbstractC3557B.b0("format(...)", format);
        switch (dVar.ordinal()) {
            case 0:
                str = "ns";
                break;
            case 1:
                str = "us";
                break;
            case 2:
                str = "ms";
                break;
            case 3:
                str = "s";
                break;
            case 4:
                str = "m";
                break;
            case 5:
                str = "h";
                break;
            case 6:
                str = "d";
                break;
            default:
                throw new IllegalStateException(("Unknown unit: " + dVar).toString());
        }
        return format.concat(str);
    }

    public static final long o(long j6) {
        long j10 = ((-(j6 >> 1)) << 1) + (((int) j6) & 1);
        ThreadLocal[] threadLocalArr = c.f12131a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f12130Y, ((b) obj).f12130Y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.f12130Y != ((b) obj).f12130Y) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return g(this.f12130Y);
    }

    public final String toString() {
        return m(this.f12130Y);
    }
}
