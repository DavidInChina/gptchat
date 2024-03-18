package j$.time.format;

import android.gov.nist.core.Separators;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3714h extends l {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35012g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3714h(j$.time.temporal.a aVar, int i10, int i11, boolean z10) {
        this(aVar, i10, i11, z10, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.p().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        } else if (i11 >= i10) {
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    C3714h(j$.time.temporal.r rVar, int i10, int i11, boolean z10, int i12) {
        super(rVar, i10, i11, G.NOT_NEGATIVE, i12);
        this.f35012g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final boolean c(y yVar) {
        return yVar.l() && this.f35020b == this.f35021c && !this.f35012g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l e() {
        if (this.f35023e == -1) {
            return this;
        }
        return new C3714h(this.f35019a, this.f35020b, this.f35021c, this.f35012g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l f(int i10) {
        return new C3714h(this.f35019a, this.f35020b, this.f35021c, this.f35012g, this.f35023e + i10);
    }

    @Override // j$.time.format.l, j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        j$.time.temporal.r rVar = this.f35019a;
        Long e10 = a5.e(rVar);
        if (e10 == null) {
            return false;
        }
        D b10 = a5.b();
        long longValue = e10.longValue();
        j$.time.temporal.w p10 = rVar.p();
        p10.b(longValue, rVar);
        BigDecimal valueOf = BigDecimal.valueOf(p10.e());
        BigDecimal add = BigDecimal.valueOf(p10.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z10 = this.f35012g;
        int i10 = this.f35020b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f35021c), roundingMode).toPlainString().substring(2);
            b10.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (i10 <= 0) {
            return true;
        } else {
            if (z10) {
                b10.getClass();
                sb2.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                b10.getClass();
                sb2.append('0');
            }
            return true;
        }
    }

    @Override // j$.time.format.l, j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int i11 = (yVar.l() || c(yVar)) ? this.f35020b : 0;
        int i12 = (yVar.l() || c(yVar)) ? this.f35021c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i11 > 0 ? ~i10 : i10;
        }
        if (this.f35012g) {
            char charAt = charSequence.charAt(i10);
            yVar.g().getClass();
            if (charAt != '.') {
                return i11 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i13 = i10;
        int i14 = i11 + i13;
        if (i14 > length) {
            return ~i13;
        }
        int min = Math.min(i12 + i13, length);
        int i15 = 0;
        int i16 = i13;
        while (true) {
            if (i16 >= min) {
                break;
            }
            int i17 = i16 + 1;
            int a5 = yVar.g().a(charSequence.charAt(i16));
            if (a5 >= 0) {
                i15 = (i15 * 10) + a5;
                i16 = i17;
            } else if (i17 < i14) {
                return ~i13;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
        j$.time.temporal.w p10 = this.f35019a.p();
        BigDecimal valueOf = BigDecimal.valueOf(p10.e());
        return yVar.o(this.f35019a, movePointLeft.multiply(BigDecimal.valueOf(p10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i13, i16);
    }

    @Override // j$.time.format.l
    public final String toString() {
        String str = this.f35012g ? ",DecimalPoint" : "";
        return "Fraction(" + this.f35019a + Separators.COMMA + this.f35020b + Separators.COMMA + this.f35021c + str + Separators.RPAREN;
    }
}
