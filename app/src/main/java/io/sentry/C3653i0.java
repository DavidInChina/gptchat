package io.sentry;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/* renamed from: io.sentry.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3653i0 implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Reader f34357Y;

    /* renamed from: m0  reason: collision with root package name */
    public long f34364m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f34365n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f34366o0;

    /* renamed from: p0  reason: collision with root package name */
    public int[] f34367p0;

    /* renamed from: Z  reason: collision with root package name */
    public final char[] f34358Z = new char[1024];

    /* renamed from: h0  reason: collision with root package name */
    public int f34359h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f34360i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f34361j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public int f34362k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f34363l0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public int f34368q0 = 1;

    /* renamed from: r0  reason: collision with root package name */
    public String[] f34369r0 = new String[32];

    /* renamed from: s0  reason: collision with root package name */
    public int[] f34370s0 = new int[32];

    public C3653i0(Reader reader) {
        int[] iArr = new int[32];
        this.f34367p0 = iArr;
        iArr[0] = 6;
        this.f34357Y = reader;
    }

    public final long A0() {
        char c10;
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f34363l0 = 0;
            int[] iArr = this.f34370s0;
            int i11 = this.f34368q0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f34364m0;
        }
        if (i10 == 16) {
            this.f34366o0 = new String(this.f34358Z, this.f34359h0, this.f34365n0);
            this.f34359h0 += this.f34365n0;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + a1() + O());
        } else {
            if (i10 == 10) {
                this.f34366o0 = Z0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f34366o0 = V0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f34366o0);
                this.f34363l0 = 0;
                int[] iArr2 = this.f34370s0;
                int i12 = this.f34368q0 - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f34363l0 = 11;
        double parseDouble = Double.parseDouble(this.f34366o0);
        long j6 = (long) parseDouble;
        if (j6 == parseDouble) {
            this.f34366o0 = null;
            this.f34363l0 = 0;
            int[] iArr3 = this.f34370s0;
            int i13 = this.f34368q0 - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j6;
        }
        throw new NumberFormatException("Expected a long but was " + this.f34366o0 + O());
    }

    public final boolean F(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            i();
            throw null;
        }
        return false;
    }

    public final Long F0() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return Long.valueOf(A0());
    }

    public final HashMap H0(H h10, Z z10) {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        h();
        HashMap hashMap = new HashMap();
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 != 2 && i10 != 4) {
            while (true) {
                try {
                    hashMap.put(P0(), z10.a(this, h10));
                } catch (Exception e10) {
                    h10.d(EnumC3642e1.WARNING, "Failed to deserialize object in map.", e10);
                }
                if (a1() != io.sentry.vendor.gson.stream.a.BEGIN_OBJECT && a1() != io.sentry.vendor.gson.stream.a.NAME) {
                    break;
                }
            }
        }
        p();
        return hashMap;
    }

    public final String O() {
        StringBuilder A10 = E9.f.A(" at line ", this.f34361j0 + 1, " column ", (this.f34359h0 - this.f34362k0) + 1, " path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f34368q0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f34367p0[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = this.f34369r0[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.f34370s0[i11]);
                sb2.append(']');
            }
        }
        A10.append(sb2.toString());
        return A10.toString();
    }

    public final boolean P() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 5) {
            this.f34363l0 = 0;
            int[] iArr = this.f34370s0;
            int i11 = this.f34368q0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f34363l0 = 0;
            int[] iArr2 = this.f34370s0;
            int i12 = this.f34368q0 - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + a1() + O());
        }
    }

    public final String P0() {
        String str;
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 14) {
            str = Z0();
        } else if (i10 == 12) {
            str = V0('\'');
        } else if (i10 == 13) {
            str = V0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + a1() + O());
        }
        this.f34363l0 = 0;
        this.f34369r0[this.f34368q0 - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r7 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R0(boolean z10) {
        int i10 = this.f34359h0;
        int i11 = this.f34360i0;
        while (true) {
            if (i10 == i11) {
                this.f34359h0 = i10;
                if (!r(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + O());
                }
                i10 = this.f34359h0;
                i11 = this.f34360i0;
            }
            int i12 = i10 + 1;
            char c10 = this.f34358Z[i10];
            if (c10 == '\n') {
                this.f34361j0++;
                this.f34362k0 = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f34359h0 = i12;
                    if (i12 == i11) {
                        this.f34359h0 = i10;
                        boolean r10 = r(2);
                        this.f34359h0++;
                    }
                    i();
                    throw null;
                } else if (c10 != '#') {
                    this.f34359h0 = i12;
                } else {
                    this.f34359h0 = i12;
                    i();
                    throw null;
                }
                return c10;
            }
            i10 = i12;
        }
    }

    public final Boolean S() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return Boolean.valueOf(P());
    }

    public final void S0() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 7) {
            this.f34363l0 = 0;
            int[] iArr = this.f34370s0;
            int i11 = this.f34368q0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + a1() + O());
    }

    public final Object T0() {
        Wh.p pVar = new Wh.p(1);
        pVar.r(this);
        AbstractC3638d0 i10 = pVar.i();
        if (i10 != null) {
            return i10.getValue();
        }
        return null;
    }

    public final Object U0(H h10, Z z10) {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return z10.a(this, h10);
    }

    public final Date V(H h10) {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        String W02 = W0();
        if (W02 == null) {
            return null;
        }
        try {
            try {
                return r.f.C(W02);
            } catch (Exception e10) {
                h10.d(EnumC3642e1.ERROR, "Error when deserializing millis timestamp format.", e10);
                return null;
            }
        } catch (Exception unused) {
            return r.f.D(W02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        r10.f34359h0 = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r1.append(r7, r3, r2 - r3);
        r10.f34359h0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String V0(char c10) {
        char[] cArr;
        int i10;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f34359h0;
            int i12 = this.f34360i0;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                while (true) {
                    cArr = this.f34358Z;
                    if (i11 >= i13) {
                        break;
                    }
                    int i15 = i11 + 1;
                    char c11 = cArr[i11];
                    if (c11 == c10) {
                        this.f34359h0 = i15;
                        int i16 = (i15 - i14) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i14, i16);
                        }
                        sb2.append(cArr, i14, i16);
                        return sb2.toString();
                    } else if (c11 == '\\') {
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f34361j0++;
                            this.f34362k0 = i15;
                        }
                        i11 = i15;
                    }
                }
                sb2.append(cArr, i14, i10);
                sb2.append(c1());
                i11 = this.f34359h0;
                i12 = this.f34360i0;
            }
        } while (r(1));
        e1("Unterminated string");
        throw null;
    }

    public final String W0() {
        String str;
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 10) {
            str = Z0();
        } else if (i10 == 8) {
            str = V0('\'');
        } else if (i10 == 9) {
            str = V0('\"');
        } else if (i10 == 11) {
            str = this.f34366o0;
            this.f34366o0 = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f34364m0);
        } else if (i10 == 16) {
            str = new String(this.f34358Z, this.f34359h0, this.f34365n0);
            this.f34359h0 += this.f34365n0;
        } else {
            throw new IllegalStateException("Expected a string but was " + a1() + O());
        }
        this.f34363l0 = 0;
        int[] iArr = this.f34370s0;
        int i11 = this.f34368q0 - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final String X0() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return W0();
    }

    public final void Y0(H h10, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, T0());
        } catch (Exception e10) {
            h10.b(EnumC3642e1.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Z0() {
        char[] cArr;
        String str;
        int i10 = 0;
        StringBuilder sb2 = null;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f34359h0 + i11;
                int i13 = this.f34360i0;
                cArr = this.f34358Z;
                if (i12 < i13) {
                    char c10 = cArr[i12];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 < cArr.length) {
                    if (r(i11 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f34359h0, i11);
                    this.f34359h0 += i11;
                }
            }
            i10 = i11;
            if (sb2 != null) {
                str = new String(cArr, this.f34359h0, i10);
            } else {
                sb2.append(cArr, this.f34359h0, i10);
                str = sb2.toString();
            }
            this.f34359h0 += i10;
            return str;
        } while (r(1));
        if (sb2 != null) {
        }
        this.f34359h0 += i10;
        return str;
    }

    public final void a() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 3) {
            b1(1);
            this.f34370s0[this.f34368q0 - 1] = 0;
            this.f34363l0 = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + a1() + O());
    }

    public final double a0() {
        char c10;
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            this.f34363l0 = 0;
            int[] iArr = this.f34370s0;
            int i11 = this.f34368q0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f34364m0;
        }
        if (i10 == 16) {
            this.f34366o0 = new String(this.f34358Z, this.f34359h0, this.f34365n0);
            this.f34359h0 += this.f34365n0;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f34366o0 = Z0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + a1() + O());
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f34366o0 = V0(c10);
        }
        this.f34363l0 = 11;
        double parseDouble = Double.parseDouble(this.f34366o0);
        if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
            this.f34366o0 = null;
            this.f34363l0 = 0;
            int[] iArr2 = this.f34370s0;
            int i12 = this.f34368q0 - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new IOException("JSON forbids NaN and infinities: " + parseDouble + O());
    }

    public final io.sentry.vendor.gson.stream.a a1() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        switch (i10) {
            case 1:
                return io.sentry.vendor.gson.stream.a.BEGIN_OBJECT;
            case 2:
                return io.sentry.vendor.gson.stream.a.END_OBJECT;
            case 3:
                return io.sentry.vendor.gson.stream.a.BEGIN_ARRAY;
            case 4:
                return io.sentry.vendor.gson.stream.a.END_ARRAY;
            case 5:
            case 6:
                return io.sentry.vendor.gson.stream.a.BOOLEAN;
            case 7:
                return io.sentry.vendor.gson.stream.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return io.sentry.vendor.gson.stream.a.STRING;
            case 12:
            case 13:
            case 14:
                return io.sentry.vendor.gson.stream.a.NAME;
            case 15:
            case 16:
                return io.sentry.vendor.gson.stream.a.NUMBER;
            case 17:
                return io.sentry.vendor.gson.stream.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void b1(int i10) {
        int i11 = this.f34368q0;
        int[] iArr = this.f34367p0;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f34367p0 = Arrays.copyOf(iArr, i12);
            this.f34370s0 = Arrays.copyOf(this.f34370s0, i12);
            this.f34369r0 = (String[]) Arrays.copyOf(this.f34369r0, i12);
        }
        int[] iArr2 = this.f34367p0;
        int i13 = this.f34368q0;
        this.f34368q0 = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char c1() {
        int i10;
        if (this.f34359h0 == this.f34360i0 && !r(1)) {
            e1("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f34359h0;
        int i12 = i11 + 1;
        this.f34359h0 = i12;
        char[] cArr = this.f34358Z;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i11 + 5 > this.f34360i0 && !r(4)) {
                                        e1("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i13 = this.f34359h0;
                                    int i14 = i13 + 4;
                                    char c11 = 0;
                                    while (i13 < i14) {
                                        char c12 = cArr[i13];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i10 = c12 - '0';
                                        } else if (c12 >= 'a' && c12 <= 'f') {
                                            i10 = c12 - 'W';
                                        } else if (c12 >= 'A' && c12 <= 'F') {
                                            i10 = c12 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u".concat(new String(cArr, this.f34359h0, 4)));
                                        }
                                        c11 = (char) (i10 + c13);
                                        i13++;
                                    }
                                    this.f34359h0 += 4;
                                    return c11;
                                }
                                e1("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c10;
        }
        this.f34361j0++;
        this.f34362k0 = i12;
        return c10;
    }

    public final Double d0() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return Double.valueOf(a0());
    }

    public final void d1(char c10) {
        do {
            int i10 = this.f34359h0;
            int i11 = this.f34360i0;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f34358Z[i10];
                if (c11 == c10) {
                    this.f34359h0 = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f34359h0 = i12;
                    c1();
                    i10 = this.f34359h0;
                    i11 = this.f34360i0;
                } else {
                    if (c11 == '\n') {
                        this.f34361j0++;
                        this.f34362k0 = i12;
                    }
                    i10 = i12;
                }
            }
            this.f34359h0 = i10;
        } while (r(1));
        e1("Unterminated string");
        throw null;
    }

    public final void e1(String str) {
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(O());
        throw new IOException(p10.toString());
    }

    public final Float f0() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return Float.valueOf((float) a0());
    }

    /* renamed from: f1 */
    public final String toString() {
        return C3653i0.class.getSimpleName() + O();
    }

    public final void h() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 1) {
            b1(3);
            this.f34363l0 = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + a1() + O());
    }

    public final void i() {
        e1("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: j */
    public final void close() {
        this.f34363l0 = 0;
        this.f34367p0[0] = 8;
        this.f34368q0 = 1;
        this.f34357Y.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a1, code lost:
        if (r12 != 6) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b3, code lost:
        if (F(r10) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b5, code lost:
        if (r12 != 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b7, code lost:
        if (r13 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01bd, code lost:
        if (r14 != Long.MIN_VALUE) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01bf, code lost:
        if (r16 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c3, code lost:
        if (r14 != 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c5, code lost:
        if (r16 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c7, code lost:
        if (r16 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ca, code lost:
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cb, code lost:
        r20.f34364m0 = r14;
        r20.f34359h0 += r5;
        r1 = 15;
        r20.f34363l0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d6, code lost:
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d8, code lost:
        if (r12 == 2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01db, code lost:
        if (r12 == 4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01de, code lost:
        if (r12 != 7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e0, code lost:
        r20.f34365n0 = r5;
        r1 = 16;
        r20.f34363l0 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        String str;
        String str2;
        char c10;
        int R02;
        int[] iArr = this.f34367p0;
        char c11 = 1;
        int i14 = this.f34368q0 - 1;
        int i15 = iArr[i14];
        if (i15 == 1) {
            iArr[i14] = 2;
        } else if (i15 == 2) {
            int R03 = R0(true);
            if (R03 != 44) {
                if (R03 != 59) {
                    if (R03 == 93) {
                        this.f34363l0 = 4;
                        return 4;
                    }
                    e1("Unterminated array");
                    throw null;
                }
                i();
                throw null;
            }
        } else if (i15 != 3 && i15 != 5) {
            if (i15 == 4) {
                iArr[i14] = 5;
                int R04 = R0(true);
                if (R04 != 58) {
                    if (R04 != 61) {
                        e1("Expected ':'");
                        throw null;
                    }
                    i();
                    throw null;
                }
            } else if (i15 == 6) {
                iArr[i14] = 7;
            } else if (i15 == 7) {
                if (R0(false) == -1) {
                    this.f34363l0 = 17;
                    return 17;
                }
                i();
                throw null;
            } else if (i15 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i14] = 4;
            if (i15 == 5 && (R02 = R0(true)) != 44) {
                if (R02 != 59) {
                    if (R02 == 125) {
                        this.f34363l0 = 2;
                    } else {
                        e1("Unterminated object");
                        throw null;
                    }
                } else {
                    i();
                    throw null;
                }
            } else {
                int R05 = R0(true);
                if (R05 != 34) {
                    if (R05 != 39) {
                        if (R05 == 125) {
                            if (i15 != 5) {
                                this.f34363l0 = 2;
                            } else {
                                e1("Expected name");
                                throw null;
                            }
                        } else {
                            i();
                            throw null;
                        }
                    } else {
                        i();
                        throw null;
                    }
                } else {
                    this.f34363l0 = 13;
                    return 13;
                }
            }
            return 2;
        }
        int R06 = R0(true);
        if (R06 != 34) {
            if (R06 != 39) {
                if (R06 != 44 && R06 != 59) {
                    if (R06 != 91) {
                        if (R06 != 93) {
                            if (R06 != 123) {
                                int i16 = this.f34359h0 - 1;
                                this.f34359h0 = i16;
                                char[] cArr = this.f34358Z;
                                char c12 = cArr[i16];
                                if (c12 != 't' && c12 != 'T') {
                                    if (c12 != 'f' && c12 != 'F') {
                                        if (c12 != 'n' && c12 != 'N') {
                                            i11 = 0;
                                            if (i11 == 0) {
                                                return i11;
                                            }
                                            int i17 = this.f34359h0;
                                            int i18 = this.f34360i0;
                                            boolean z11 = true;
                                            long j6 = 0;
                                            int i19 = 0;
                                            char c13 = 0;
                                            boolean z12 = false;
                                            while (true) {
                                                if (i17 + i19 == i18) {
                                                    if (i19 == cArr.length) {
                                                        break;
                                                    } else if (!r(i19 + 1)) {
                                                        break;
                                                    } else {
                                                        i17 = this.f34359h0;
                                                        i18 = this.f34360i0;
                                                    }
                                                }
                                                char c14 = cArr[i17 + i19];
                                                if (c14 != '+') {
                                                    if (c14 != 'E' && c14 != 'e') {
                                                        if (c14 != '-') {
                                                            if (c14 != '.') {
                                                                if (c14 < '0' || c14 > '9') {
                                                                    break;
                                                                }
                                                                if (c13 == c11 || c13 == 0) {
                                                                    i13 = i18;
                                                                    j6 = -(c14 - '0');
                                                                    c13 = 2;
                                                                } else if (c13 == 2) {
                                                                    if (j6 == 0) {
                                                                        break;
                                                                    }
                                                                    i13 = i18;
                                                                    long j10 = (10 * j6) - (c14 - '0');
                                                                    int i20 = (j6 > (-922337203685477580L) ? 1 : (j6 == (-922337203685477580L) ? 0 : -1));
                                                                    if (i20 <= 0 && (i20 != 0 || j10 >= j6)) {
                                                                        z10 = false;
                                                                    } else {
                                                                        z10 = true;
                                                                    }
                                                                    z11 &= z10;
                                                                    j6 = j10;
                                                                } else {
                                                                    i13 = i18;
                                                                    if (c13 == 3) {
                                                                        c13 = 4;
                                                                    } else {
                                                                        if (c13 == 5) {
                                                                        }
                                                                        c13 = 7;
                                                                    }
                                                                    i19++;
                                                                    i18 = i13;
                                                                    c11 = 1;
                                                                }
                                                                i19++;
                                                                i18 = i13;
                                                                c11 = 1;
                                                            } else {
                                                                i13 = i18;
                                                                if (c13 != 2) {
                                                                    break;
                                                                }
                                                                c13 = 3;
                                                                i19++;
                                                                i18 = i13;
                                                                c11 = 1;
                                                            }
                                                        } else {
                                                            i13 = i18;
                                                            if (c13 == 0) {
                                                                c13 = 1;
                                                                z12 = true;
                                                            } else if (c13 != 5) {
                                                                break;
                                                            } else {
                                                                c13 = 6;
                                                            }
                                                            i19++;
                                                            i18 = i13;
                                                            c11 = 1;
                                                        }
                                                    } else {
                                                        i13 = i18;
                                                        if (c13 != 2 && c13 != 4) {
                                                            break;
                                                        }
                                                        c13 = 5;
                                                        i19++;
                                                        i18 = i13;
                                                        c11 = 1;
                                                    }
                                                } else {
                                                    i13 = i18;
                                                    if (c13 != 5) {
                                                        break;
                                                    }
                                                    c13 = 6;
                                                    i19++;
                                                    i18 = i13;
                                                    c11 = 1;
                                                }
                                                if (i12 != 0) {
                                                    if (!F(cArr[this.f34359h0])) {
                                                        e1("Expected value");
                                                        throw null;
                                                    }
                                                    i();
                                                    throw null;
                                                }
                                                return i12;
                                            }
                                            i12 = 0;
                                            if (i12 != 0) {
                                            }
                                        } else {
                                            str2 = "null";
                                            str = "NULL";
                                            i11 = 7;
                                        }
                                    } else {
                                        str2 = "false";
                                        str = "FALSE";
                                        i11 = 6;
                                    }
                                } else {
                                    str2 = "true";
                                    str = "TRUE";
                                    i11 = 5;
                                }
                                int length = str2.length();
                                int i21 = 1;
                                while (true) {
                                    if (i21 < length) {
                                        if ((this.f34359h0 + i21 >= this.f34360i0 && !r(i21 + 1)) || ((c10 = cArr[this.f34359h0 + i21]) != str2.charAt(i21) && c10 != str.charAt(i21))) {
                                            break;
                                        }
                                        i21++;
                                    } else if ((this.f34359h0 + length >= this.f34360i0 && !r(length + 1)) || !F(cArr[this.f34359h0 + length])) {
                                        this.f34359h0 += length;
                                        this.f34363l0 = i11;
                                    }
                                }
                                i11 = 0;
                                if (i11 == 0) {
                                }
                            } else {
                                this.f34363l0 = 1;
                                return 1;
                            }
                        } else {
                            i10 = 1;
                            if (i15 == 1) {
                                this.f34363l0 = 4;
                                return 4;
                            }
                        }
                    } else {
                        this.f34363l0 = 3;
                        return 3;
                    }
                } else {
                    i10 = 1;
                }
                if (i15 != i10 && i15 != 2) {
                    e1("Unexpected value");
                    throw null;
                }
                i();
                throw null;
            }
            i();
            throw null;
        }
        this.f34363l0 = 9;
        return 9;
    }

    public final void m() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 4) {
            int i11 = this.f34368q0;
            this.f34368q0 = i11 - 1;
            int[] iArr = this.f34370s0;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f34363l0 = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + a1() + O());
    }

    public final int m0() {
        char c10;
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 15) {
            long j6 = this.f34364m0;
            int i11 = (int) j6;
            if (j6 == i11) {
                this.f34363l0 = 0;
                int[] iArr = this.f34370s0;
                int i12 = this.f34368q0 - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f34364m0 + O());
        }
        if (i10 == 16) {
            this.f34366o0 = new String(this.f34358Z, this.f34359h0, this.f34365n0);
            this.f34359h0 += this.f34365n0;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + a1() + O());
        } else {
            if (i10 == 10) {
                this.f34366o0 = Z0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f34366o0 = V0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f34366o0);
                this.f34363l0 = 0;
                int[] iArr2 = this.f34370s0;
                int i13 = this.f34368q0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f34363l0 = 11;
        double parseDouble = Double.parseDouble(this.f34366o0);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f34366o0 = null;
            this.f34363l0 = 0;
            int[] iArr3 = this.f34370s0;
            int i15 = this.f34368q0 - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f34366o0 + O());
    }

    public final void p() {
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 == 2) {
            int i11 = this.f34368q0;
            int i12 = i11 - 1;
            this.f34368q0 = i12;
            this.f34369r0[i12] = null;
            int[] iArr = this.f34370s0;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f34363l0 = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + a1() + O());
    }

    public final boolean r(int i10) {
        int i11;
        int i12;
        int i13 = this.f34362k0;
        int i14 = this.f34359h0;
        this.f34362k0 = i13 - i14;
        int i15 = this.f34360i0;
        char[] cArr = this.f34358Z;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f34360i0 = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f34360i0 = 0;
        }
        this.f34359h0 = 0;
        do {
            int i17 = this.f34360i0;
            int read = this.f34357Y.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f34360i0 + read;
            this.f34360i0 = i11;
            if (this.f34361j0 == 0 && (i12 = this.f34362k0) == 0 && i11 > 0 && cArr[0] == '\ufeff') {
                this.f34359h0++;
                this.f34362k0 = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public final Integer u0() {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        return Integer.valueOf(m0());
    }

    public final ArrayList w0(H h10, Z z10) {
        if (a1() == io.sentry.vendor.gson.stream.a.NULL) {
            S0();
            return null;
        }
        a();
        ArrayList arrayList = new ArrayList();
        int i10 = this.f34363l0;
        if (i10 == 0) {
            i10 = k();
        }
        if (i10 != 2 && i10 != 4) {
            do {
                try {
                    arrayList.add(z10.a(this, h10));
                } catch (Exception e10) {
                    h10.d(EnumC3642e1.WARNING, "Failed to deserialize object in list.", e10);
                }
            } while (a1() == io.sentry.vendor.gson.stream.a.BEGIN_OBJECT);
            m();
            return arrayList;
        }
        m();
        return arrayList;
    }
}
