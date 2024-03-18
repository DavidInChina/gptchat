package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import java.math.BigInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l implements AbstractC3713g {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f35018f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final j$.time.temporal.r f35019a;

    /* renamed from: b  reason: collision with root package name */
    final int f35020b;

    /* renamed from: c  reason: collision with root package name */
    final int f35021c;

    /* renamed from: d  reason: collision with root package name */
    private final G f35022d;

    /* renamed from: e  reason: collision with root package name */
    final int f35023e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(j$.time.temporal.r rVar, int i10, int i11, G g10) {
        this.f35019a = rVar;
        this.f35020b = i10;
        this.f35021c = i11;
        this.f35022d = g10;
        this.f35023e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l(j$.time.temporal.r rVar, int i10, int i11, G g10, int i12) {
        this.f35019a = rVar;
        this.f35020b = i10;
        this.f35021c = i11;
        this.f35022d = g10;
        this.f35023e = i12;
    }

    long b(A a5, long j6) {
        return j6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(y yVar) {
        int i10 = this.f35023e;
        return i10 == -1 || (i10 > 0 && this.f35020b == this.f35021c && this.f35022d == G.NOT_NEGATIVE);
    }

    int d(y yVar, long j6, int i10, int i11) {
        return yVar.o(this.f35019a, j6, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l e() {
        if (this.f35023e == -1) {
            return this;
        }
        return new l(this.f35019a, this.f35020b, this.f35021c, this.f35022d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l f(int i10) {
        int i11 = this.f35021c;
        G g10 = this.f35022d;
        return new l(this.f35019a, this.f35020b, i11, g10, this.f35023e + i10);
    }

    @Override // j$.time.format.AbstractC3713g
    public boolean g(A a5, StringBuilder sb2) {
        j$.time.temporal.r rVar = this.f35019a;
        Long e10 = a5.e(rVar);
        if (e10 == null) {
            return false;
        }
        long b10 = b(a5, e10.longValue());
        D b11 = a5.b();
        String l10 = b10 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b10));
        int length = l10.length();
        int i10 = this.f35021c;
        if (length > i10) {
            throw new DateTimeException("Field " + rVar + " cannot be printed as the value " + b10 + " exceeds the maximum print width of " + i10);
        }
        b11.getClass();
        int i11 = (b10 > 0L ? 1 : (b10 == 0L ? 0 : -1));
        int i12 = this.f35020b;
        G g10 = this.f35022d;
        if (i11 >= 0) {
            int i13 = AbstractC3710d.f35008a[g10.ordinal()];
            if (i13 == 1 ? !(i12 >= 19 || b10 < f35018f[i12]) : i13 == 2) {
                sb2.append('+');
            }
        } else {
            int i14 = AbstractC3710d.f35008a[g10.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                sb2.append('-');
            } else if (i14 == 4) {
                throw new DateTimeException("Field " + rVar + " cannot be printed as the value " + b10 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i15 = 0; i15 < i12 - l10.length(); i15++) {
            sb2.append('0');
        }
        sb2.append(l10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
        r5 = r13;
        r1 = r16;
        r9 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0171  */
    @Override // j$.time.format.AbstractC3713g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int p(y yVar, CharSequence charSequence, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        BigInteger bigInteger;
        long j6;
        long j10;
        int i13;
        int length = charSequence.length();
        if (i10 == length) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        yVar.g().getClass();
        int i14 = this.f35021c;
        G g10 = this.f35022d;
        int i15 = this.f35020b;
        int i16 = 0;
        if (charAt == '+') {
            if (!g10.g(true, yVar.l(), i15 == i14)) {
                return ~i10;
            }
            i11 = i10 + 1;
            z10 = true;
            z11 = false;
        } else {
            yVar.g().getClass();
            if (charAt == '-') {
                if (!g10.g(false, yVar.l(), i15 == i14)) {
                    return ~i10;
                }
                i11 = i10 + 1;
                z11 = true;
                z10 = false;
            } else if (g10 == G.ALWAYS && yVar.l()) {
                return ~i10;
            } else {
                i11 = i10;
                z11 = false;
                z10 = false;
            }
        }
        int i17 = (yVar.l() || c(yVar)) ? i15 : 1;
        int i18 = i11 + i17;
        if (i18 > length) {
            return ~i11;
        }
        if (!yVar.l() && !c(yVar)) {
            i14 = 9;
        }
        int i19 = this.f35023e;
        int max = Math.max(i19, 0) + i14;
        while (true) {
            BigInteger bigInteger2 = null;
            if (i16 >= 2) {
                i12 = i11;
                bigInteger = null;
                j6 = 0;
                break;
            }
            int min = Math.min(max + i11, length);
            int i20 = i11;
            long j11 = 0;
            while (true) {
                if (i20 >= min) {
                    break;
                }
                int i21 = i20 + 1;
                int a5 = yVar.g().a(charSequence.charAt(i20));
                if (a5 >= 0) {
                    if (i21 - i11 > 18) {
                        if (bigInteger2 == null) {
                            bigInteger2 = BigInteger.valueOf(j11);
                        }
                        i13 = min;
                        bigInteger2 = bigInteger2.multiply(BigInteger.TEN).add(BigInteger.valueOf(a5));
                    } else {
                        i13 = min;
                        j11 = (j11 * 10) + a5;
                    }
                    min = i13;
                    i20 = i21;
                } else if (i20 < i18) {
                    return ~i11;
                }
            }
            if (i19 <= 0 || i16 != 0) {
                break;
            }
            max = Math.max(i17, (i20 - i11) - i19);
            i16++;
        }
        if (z11) {
            if (bigInteger == null) {
                if (j6 == 0 && yVar.l()) {
                    return ~(i11 - 1);
                }
                j10 = -j6;
                if (bigInteger != null) {
                    return d(yVar, j10, i11, i12);
                }
                if (bigInteger.bitLength() > 63) {
                    bigInteger = bigInteger.divide(BigInteger.TEN);
                    i12--;
                }
                return d(yVar, bigInteger.longValue(), i11, i12);
            } else if (bigInteger.equals(BigInteger.ZERO) && yVar.l()) {
                return ~(i11 - 1);
            } else {
                bigInteger = bigInteger.negate();
            }
        } else if (g10 == G.EXCEEDS_PAD && yVar.l()) {
            int i22 = i12 - i11;
            if (z10) {
                if (i22 <= i15) {
                    return ~(i11 - 1);
                }
            } else if (i22 > i15) {
                return ~i11;
            }
        }
        j10 = j6;
        if (bigInteger != null) {
        }
    }

    public String toString() {
        int i10 = this.f35021c;
        j$.time.temporal.r rVar = this.f35019a;
        G g10 = this.f35022d;
        int i11 = this.f35020b;
        if (i11 == 1 && i10 == 19 && g10 == G.NORMAL) {
            return "Value(" + rVar + Separators.RPAREN;
        } else if (i11 == i10 && g10 == G.NOT_NEGATIVE) {
            return "Value(" + rVar + Separators.COMMA + i11 + Separators.RPAREN;
        } else {
            return "Value(" + rVar + Separators.COMMA + i11 + Separators.COMMA + i10 + Separators.COMMA + g10 + Separators.RPAREN;
        }
    }
}
