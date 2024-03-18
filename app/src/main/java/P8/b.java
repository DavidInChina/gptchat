package P8;

import E9.f;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class b implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Reader f13850Y;

    /* renamed from: n0  reason: collision with root package name */
    public long f13858n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f13859o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f13860p0;

    /* renamed from: q0  reason: collision with root package name */
    public int[] f13861q0;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f13851Z = false;

    /* renamed from: h0  reason: collision with root package name */
    public final char[] f13852h0 = new char[1024];

    /* renamed from: i0  reason: collision with root package name */
    public int f13853i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f13854j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public int f13855k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f13856l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f13857m0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public int f13862r0 = 1;

    /* renamed from: s0  reason: collision with root package name */
    public String[] f13863s0 = new String[32];

    /* renamed from: t0  reason: collision with root package name */
    public int[] f13864t0 = new int[32];

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, P8.a] */
    static {
        a.f13849a = new Object();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f13861q0 = iArr;
        iArr[0] = 6;
        Objects.requireNonNull(reader, "in == null");
        this.f13850Y = reader;
    }

    public void A0() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 7) {
            this.f13857m0 = 0;
            int[] iArr = this.f13864t0;
            int i11 = this.f13862r0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f.L(R0()) + V());
    }

    public final String F(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f13862r0;
            if (i10 < i11) {
                int i12 = this.f13861q0[i10];
                if (i12 != 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4 || i12 == 5) {
                        sb2.append('.');
                        String str = this.f13863s0[i10];
                        if (str != null) {
                            sb2.append(str);
                        }
                    }
                } else {
                    int i13 = this.f13864t0[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r10.f13853i0 = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1.append(r7, r3, r2 - r3);
        r10.f13853i0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String F0(char c10) {
        char[] cArr;
        int i10;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f13853i0;
            int i12 = this.f13854j0;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                while (true) {
                    cArr = this.f13852h0;
                    if (i11 >= i13) {
                        break;
                    }
                    int i15 = i11 + 1;
                    char c11 = cArr[i11];
                    if (c11 == c10) {
                        this.f13853i0 = i15;
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
                            this.f13855k0++;
                            this.f13856l0 = i15;
                        }
                        i11 = i15;
                    }
                }
                sb2.append(cArr, i14, i10);
                sb2.append(T0());
                i11 = this.f13853i0;
                i12 = this.f13854j0;
            }
        } while (p(1));
        Y0("Unterminated string");
        throw null;
    }

    public String H0() {
        String str;
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 10) {
            str = P0();
        } else if (i10 == 8) {
            str = F0('\'');
        } else if (i10 == 9) {
            str = F0('\"');
        } else if (i10 == 11) {
            str = this.f13860p0;
            this.f13860p0 = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f13858n0);
        } else if (i10 == 16) {
            str = new String(this.f13852h0, this.f13853i0, this.f13859o0);
            this.f13853i0 += this.f13859o0;
        } else {
            throw new IllegalStateException("Expected a string but was " + f.L(R0()) + V());
        }
        this.f13857m0 = 0;
        int[] iArr = this.f13864t0;
        int i11 = this.f13862r0 - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public String O() {
        return F(true);
    }

    public boolean P() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        i();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String P0() {
        char[] cArr;
        String str;
        StringBuilder sb2 = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f13853i0;
                int i13 = i12 + i11;
                int i14 = this.f13854j0;
                cArr = this.f13852h0;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
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
                    if (p(i11 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f13853i0, i11);
                    this.f13853i0 += i11;
                }
            }
            i10 = i11;
            if (sb2 != null) {
                str = new String(cArr, this.f13853i0, i10);
            } else {
                sb2.append(cArr, this.f13853i0, i10);
                str = sb2.toString();
            }
            this.f13853i0 += i10;
            return str;
        } while (p(1));
        if (sb2 != null) {
        }
        this.f13853i0 += i10;
        return str;
    }

    public int R0() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final boolean S(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            i();
            return false;
        }
        return false;
    }

    public final void S0(int i10) {
        int i11 = this.f13862r0;
        int[] iArr = this.f13861q0;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f13861q0 = Arrays.copyOf(iArr, i12);
            this.f13864t0 = Arrays.copyOf(this.f13864t0, i12);
            this.f13863s0 = (String[]) Arrays.copyOf(this.f13863s0, i12);
        }
        int[] iArr2 = this.f13861q0;
        int i13 = this.f13862r0;
        this.f13862r0 = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char T0() {
        int i10;
        if (this.f13853i0 == this.f13854j0 && !p(1)) {
            Y0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f13853i0;
        int i12 = i11 + 1;
        this.f13853i0 = i12;
        char[] cArr = this.f13852h0;
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
                                    if (i11 + 5 > this.f13854j0 && !p(4)) {
                                        Y0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i13 = this.f13853i0;
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
                                            throw new NumberFormatException("\\u".concat(new String(cArr, this.f13853i0, 4)));
                                        }
                                        c11 = (char) (i10 + c13);
                                        i13++;
                                    }
                                    this.f13853i0 += 4;
                                    return c11;
                                }
                                Y0("Invalid escape sequence");
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
        } else {
            this.f13855k0++;
            this.f13856l0 = i12;
        }
        return c10;
    }

    public final void U0(char c10) {
        do {
            int i10 = this.f13853i0;
            int i11 = this.f13854j0;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f13852h0[i10];
                if (c11 == c10) {
                    this.f13853i0 = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f13853i0 = i12;
                    T0();
                    i10 = this.f13853i0;
                    i11 = this.f13854j0;
                } else {
                    if (c11 == '\n') {
                        this.f13855k0++;
                        this.f13856l0 = i12;
                    }
                    i10 = i12;
                }
            }
            this.f13853i0 = i10;
        } while (p(1));
        Y0("Unterminated string");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String V() {
        StringBuilder A10 = f.A(" at line ", this.f13855k0 + 1, " column ", (this.f13853i0 - this.f13856l0) + 1, " path ");
        A10.append(r());
        return A10.toString();
    }

    public final void V0() {
        char c10;
        do {
            if (this.f13853i0 < this.f13854j0 || p(1)) {
                int i10 = this.f13853i0;
                int i11 = i10 + 1;
                this.f13853i0 = i11;
                c10 = this.f13852h0[i10];
                if (c10 == '\n') {
                    this.f13855k0++;
                    this.f13856l0 = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0() {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f13853i0;
                if (i11 + i10 < this.f13854j0) {
                    char c10 = this.f13852h0[i11 + i10];
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
                                                    i10++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f13853i0 = i11 + i10;
                }
            }
            this.f13853i0 += i10;
            return;
        } while (p(1));
    }

    public void X0() {
        int i10 = 0;
        do {
            int i11 = this.f13857m0;
            if (i11 == 0) {
                i11 = j();
            }
            switch (i11) {
                case 1:
                    S0(3);
                    i10++;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f13863s0[this.f13862r0 - 1] = null;
                    }
                    this.f13862r0--;
                    i10--;
                    break;
                case 3:
                    S0(1);
                    i10++;
                    break;
                case 4:
                    this.f13862r0--;
                    i10--;
                    break;
                case 8:
                    U0('\'');
                    break;
                case 9:
                    U0('\"');
                    break;
                case 10:
                    W0();
                    break;
                case 12:
                    U0('\'');
                    if (i10 == 0) {
                        this.f13863s0[this.f13862r0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    U0('\"');
                    if (i10 == 0) {
                        this.f13863s0[this.f13862r0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    W0();
                    if (i10 == 0) {
                        this.f13863s0[this.f13862r0 - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f13853i0 += this.f13859o0;
                    break;
                case 17:
                    return;
            }
            this.f13857m0 = 0;
        } while (i10 > 0);
        int[] iArr = this.f13864t0;
        int i12 = this.f13862r0 - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void Y0(String str) {
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(V());
        throw new IOException(p10.toString());
    }

    public void a() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 3) {
            S0(1);
            this.f13864t0[this.f13862r0 - 1] = 0;
            this.f13857m0 = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f.L(R0()) + V());
    }

    public boolean a0() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 5) {
            this.f13857m0 = 0;
            int[] iArr = this.f13864t0;
            int i11 = this.f13862r0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f13857m0 = 0;
            int[] iArr2 = this.f13864t0;
            int i12 = this.f13862r0 - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + f.L(R0()) + V());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13857m0 = 0;
        this.f13861q0[0] = 8;
        this.f13862r0 = 1;
        this.f13850Y.close();
    }

    public double d0() {
        char c10;
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f13857m0 = 0;
            int[] iArr = this.f13864t0;
            int i11 = this.f13862r0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f13858n0;
        }
        if (i10 == 16) {
            this.f13860p0 = new String(this.f13852h0, this.f13853i0, this.f13859o0);
            this.f13853i0 += this.f13859o0;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f13860p0 = P0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + f.L(R0()) + V());
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f13860p0 = F0(c10);
        }
        this.f13857m0 = 11;
        double parseDouble = Double.parseDouble(this.f13860p0);
        if (!this.f13851Z && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + V());
        }
        this.f13860p0 = null;
        this.f13857m0 = 0;
        int[] iArr2 = this.f13864t0;
        int i12 = this.f13862r0 - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int f0() {
        char c10;
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            long j6 = this.f13858n0;
            int i11 = (int) j6;
            if (j6 == i11) {
                this.f13857m0 = 0;
                int[] iArr = this.f13864t0;
                int i12 = this.f13862r0 - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f13858n0 + V());
        }
        if (i10 == 16) {
            this.f13860p0 = new String(this.f13852h0, this.f13853i0, this.f13859o0);
            this.f13853i0 += this.f13859o0;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + f.L(R0()) + V());
        } else {
            if (i10 == 10) {
                this.f13860p0 = P0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f13860p0 = F0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f13860p0);
                this.f13857m0 = 0;
                int[] iArr2 = this.f13864t0;
                int i13 = this.f13862r0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13857m0 = 11;
        double parseDouble = Double.parseDouble(this.f13860p0);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f13860p0 = null;
            this.f13857m0 = 0;
            int[] iArr3 = this.f13864t0;
            int i15 = this.f13862r0 - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f13860p0 + V());
    }

    public void h() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 1) {
            S0(3);
            this.f13857m0 = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f.L(R0()) + V());
    }

    public final void i() {
        if (this.f13851Z) {
            return;
        }
        Y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x019a, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0215, code lost:
        if (S(r1) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0218, code lost:
        if (r5 != 2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x021a, code lost:
        if (r14 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0220, code lost:
        if (r9 != Long.MIN_VALUE) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0222, code lost:
        if (r16 == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0225, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0229, code lost:
        if (r9 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x022b, code lost:
        if (r16 != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x022d, code lost:
        if (r16 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0230, code lost:
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0231, code lost:
        r20.f13858n0 = r9;
        r20.f13853i0 += r8;
        r9 = 15;
        r20.f13857m0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x023d, code lost:
        if (r5 == r1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0240, code lost:
        if (r5 == 4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0243, code lost:
        if (r5 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0245, code lost:
        r20.f13859o0 = r8;
        r9 = 16;
        r20.f13857m0 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j() {
        int i10;
        int w02;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        String str;
        String str2;
        char c10;
        int w03;
        int[] iArr = this.f13861q0;
        int i16 = 1;
        int i17 = this.f13862r0 - 1;
        int i18 = iArr[i17];
        char[] cArr = this.f13852h0;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else if (i18 == 2) {
            int w04 = w0(true);
            if (w04 != 44) {
                if (w04 != 59) {
                    if (w04 == 93) {
                        this.f13857m0 = 4;
                        return 4;
                    }
                    Y0("Unterminated array");
                    throw null;
                }
                i();
            }
        } else if (i18 != 3 && i18 != 5) {
            if (i18 == 4) {
                iArr[i17] = 5;
                int w05 = w0(true);
                if (w05 != 58) {
                    if (w05 == 61) {
                        i();
                        if (this.f13853i0 < this.f13854j0 || p(1)) {
                            int i19 = this.f13853i0;
                            if (cArr[i19] == '>') {
                                this.f13853i0 = i19 + 1;
                            }
                        }
                    } else {
                        Y0("Expected ':'");
                        throw null;
                    }
                }
            } else if (i18 == 6) {
                if (this.f13851Z) {
                    w0(true);
                    int i20 = this.f13853i0;
                    this.f13853i0 = i20 - 1;
                    if (i20 + 4 <= this.f13854j0 || p(5)) {
                        int i21 = this.f13853i0;
                        if (cArr[i21] == ')' && cArr[i21 + 1] == ']' && cArr[i21 + 2] == '}' && cArr[i21 + 3] == '\'' && cArr[i21 + 4] == '\n') {
                            this.f13853i0 = i21 + 5;
                        }
                    }
                }
                this.f13861q0[this.f13862r0 - 1] = 7;
            } else {
                if (i18 == 7) {
                    i10 = 0;
                    if (w0(false) == -1) {
                        this.f13857m0 = 17;
                        return 17;
                    }
                    i();
                    this.f13853i0--;
                } else {
                    i10 = 0;
                    if (i18 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                w02 = w0(true);
                if (w02 == 34) {
                    if (w02 != 39) {
                        if (w02 != 44 && w02 != 59) {
                            if (w02 != 91) {
                                if (w02 != 93) {
                                    if (w02 != 123) {
                                        int i22 = this.f13853i0 - 1;
                                        this.f13853i0 = i22;
                                        char c11 = cArr[i22];
                                        if (c11 != 't' && c11 != 'T') {
                                            if (c11 != 'f' && c11 != 'F') {
                                                if (c11 == 'n' || c11 == 'N') {
                                                    str2 = "null";
                                                    str = "NULL";
                                                    i12 = 7;
                                                }
                                                i12 = i10;
                                                if (i12 == 0) {
                                                    return i12;
                                                }
                                                int i23 = this.f13853i0;
                                                int i24 = this.f13854j0;
                                                int i25 = i10;
                                                int i26 = i25;
                                                int i27 = i26;
                                                boolean z11 = true;
                                                long j6 = 0;
                                                while (true) {
                                                    if (i23 + i26 == i24) {
                                                        if (i26 == cArr.length) {
                                                            break;
                                                        } else if (!p(i26 + 1)) {
                                                            break;
                                                        } else {
                                                            int i28 = this.f13853i0;
                                                            i24 = this.f13854j0;
                                                            i23 = i28;
                                                        }
                                                    }
                                                    char c12 = cArr[i23 + i26];
                                                    if (c12 != '+') {
                                                        if (c12 != 'E' && c12 != 'e') {
                                                            if (c12 != '-') {
                                                                if (c12 != '.') {
                                                                    if (c12 < '0' || c12 > '9') {
                                                                        break;
                                                                    }
                                                                    if (i25 == i16 || i25 == 0) {
                                                                        i14 = i24;
                                                                        i15 = 6;
                                                                        j6 = -(c12 - '0');
                                                                        i25 = 2;
                                                                    } else if (i25 == 2) {
                                                                        if (j6 == 0) {
                                                                            break;
                                                                        }
                                                                        i14 = i24;
                                                                        long j10 = (10 * j6) - (c12 - '0');
                                                                        int i29 = (j6 > (-922337203685477580L) ? 1 : (j6 == (-922337203685477580L) ? 0 : -1));
                                                                        if (i29 <= 0 && (i29 != 0 || j10 >= j6)) {
                                                                            z10 = false;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                        z11 &= z10;
                                                                        j6 = j10;
                                                                        i15 = 6;
                                                                    } else {
                                                                        i14 = i24;
                                                                        if (i25 == 3) {
                                                                            i15 = 6;
                                                                            i25 = 4;
                                                                        } else {
                                                                            i15 = 6;
                                                                            if (i25 == 5 || i25 == 6) {
                                                                                i25 = 7;
                                                                            }
                                                                        }
                                                                    }
                                                                    i26++;
                                                                    i24 = i14;
                                                                    i16 = 1;
                                                                } else {
                                                                    i14 = i24;
                                                                    i15 = 6;
                                                                    if (i25 != 2) {
                                                                        break;
                                                                    }
                                                                    i25 = 3;
                                                                    i26++;
                                                                    i24 = i14;
                                                                    i16 = 1;
                                                                }
                                                            } else {
                                                                i14 = i24;
                                                                i15 = 6;
                                                                if (i25 == 0) {
                                                                    i25 = 1;
                                                                    i27 = 1;
                                                                    i26++;
                                                                    i24 = i14;
                                                                    i16 = 1;
                                                                } else {
                                                                    if (i25 != 5) {
                                                                        break;
                                                                    }
                                                                    i25 = i15;
                                                                    i26++;
                                                                    i24 = i14;
                                                                    i16 = 1;
                                                                }
                                                            }
                                                        } else {
                                                            i14 = i24;
                                                            i15 = 6;
                                                            if (i25 != 2 && i25 != 4) {
                                                                break;
                                                            }
                                                            i25 = 5;
                                                            i26++;
                                                            i24 = i14;
                                                            i16 = 1;
                                                        }
                                                        if (i13 == 0) {
                                                            return i13;
                                                        }
                                                        if (S(cArr[this.f13853i0])) {
                                                            i();
                                                            this.f13857m0 = 10;
                                                            return 10;
                                                        }
                                                        Y0("Expected value");
                                                        throw null;
                                                    }
                                                    i14 = i24;
                                                    i15 = 6;
                                                    if (i25 != 5) {
                                                        break;
                                                    }
                                                    i25 = i15;
                                                    i26++;
                                                    i24 = i14;
                                                    i16 = 1;
                                                }
                                                i13 = 0;
                                                if (i13 == 0) {
                                                }
                                            } else {
                                                str2 = "false";
                                                str = "FALSE";
                                                i12 = 6;
                                            }
                                        } else {
                                            str2 = "true";
                                            str = "TRUE";
                                            i12 = 5;
                                        }
                                        int length = str2.length();
                                        int i30 = 1;
                                        while (true) {
                                            if (i30 < length) {
                                                if ((this.f13853i0 + i30 >= this.f13854j0 && !p(i30 + 1)) || ((c10 = cArr[this.f13853i0 + i30]) != str2.charAt(i30) && c10 != str.charAt(i30))) {
                                                    break;
                                                }
                                                i30++;
                                            } else if ((this.f13853i0 + length >= this.f13854j0 && !p(length + 1)) || !S(cArr[this.f13853i0 + length])) {
                                                this.f13853i0 += length;
                                                this.f13857m0 = i12;
                                            }
                                        }
                                        i12 = i10;
                                        if (i12 == 0) {
                                        }
                                    } else {
                                        this.f13857m0 = 1;
                                        return 1;
                                    }
                                } else {
                                    i11 = 1;
                                    if (i18 == 1) {
                                        this.f13857m0 = 4;
                                        return 4;
                                    }
                                }
                            } else {
                                this.f13857m0 = 3;
                                return 3;
                            }
                        } else {
                            i11 = 1;
                        }
                        if (i18 != i11 && i18 != 2) {
                            Y0("Unexpected value");
                            throw null;
                        }
                        i();
                        this.f13853i0 -= i11;
                        this.f13857m0 = 7;
                        return 7;
                    }
                    i();
                    this.f13857m0 = 8;
                    return 8;
                }
                this.f13857m0 = 9;
                return 9;
            }
        } else {
            iArr[i17] = 4;
            if (i18 == 5 && (w03 = w0(true)) != 44) {
                if (w03 != 59) {
                    if (w03 == 125) {
                        this.f13857m0 = 2;
                        return 2;
                    }
                    Y0("Unterminated object");
                    throw null;
                }
                i();
            }
            int w06 = w0(true);
            if (w06 != 34) {
                if (w06 != 39) {
                    if (w06 != 125) {
                        i();
                        this.f13853i0--;
                        if (S((char) w06)) {
                            this.f13857m0 = 14;
                            return 14;
                        }
                        Y0("Expected name");
                        throw null;
                    } else if (i18 != 5) {
                        this.f13857m0 = 2;
                        return 2;
                    } else {
                        Y0("Expected name");
                        throw null;
                    }
                }
                i();
                this.f13857m0 = 12;
                return 12;
            }
            this.f13857m0 = 13;
            return 13;
        }
        i10 = 0;
        w02 = w0(true);
        if (w02 == 34) {
        }
    }

    public void k() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 4) {
            int i11 = this.f13862r0;
            this.f13862r0 = i11 - 1;
            int[] iArr = this.f13864t0;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f13857m0 = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f.L(R0()) + V());
    }

    public void m() {
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 2) {
            int i11 = this.f13862r0;
            int i12 = i11 - 1;
            this.f13862r0 = i12;
            this.f13863s0[i12] = null;
            int[] iArr = this.f13864t0;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f13857m0 = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f.L(R0()) + V());
    }

    public long m0() {
        char c10;
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f13857m0 = 0;
            int[] iArr = this.f13864t0;
            int i11 = this.f13862r0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f13858n0;
        }
        if (i10 == 16) {
            this.f13860p0 = new String(this.f13852h0, this.f13853i0, this.f13859o0);
            this.f13853i0 += this.f13859o0;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + f.L(R0()) + V());
        } else {
            if (i10 == 10) {
                this.f13860p0 = P0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f13860p0 = F0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f13860p0);
                this.f13857m0 = 0;
                int[] iArr2 = this.f13864t0;
                int i12 = this.f13862r0 - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13857m0 = 11;
        double parseDouble = Double.parseDouble(this.f13860p0);
        long j6 = (long) parseDouble;
        if (j6 == parseDouble) {
            this.f13860p0 = null;
            this.f13857m0 = 0;
            int[] iArr3 = this.f13864t0;
            int i13 = this.f13862r0 - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j6;
        }
        throw new NumberFormatException("Expected a long but was " + this.f13860p0 + V());
    }

    public final boolean p(int i10) {
        int i11;
        int i12;
        int i13 = this.f13856l0;
        int i14 = this.f13853i0;
        this.f13856l0 = i13 - i14;
        int i15 = this.f13854j0;
        char[] cArr = this.f13852h0;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f13854j0 = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f13854j0 = 0;
        }
        this.f13853i0 = 0;
        do {
            int i17 = this.f13854j0;
            int read = this.f13850Y.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f13854j0 + read;
            this.f13854j0 = i11;
            if (this.f13855k0 == 0 && (i12 = this.f13856l0) == 0 && i11 > 0 && cArr[0] == '\ufeff') {
                this.f13853i0++;
                this.f13856l0 = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String r() {
        return F(false);
    }

    public String toString() {
        return getClass().getSimpleName() + V();
    }

    public String u0() {
        String str;
        int i10 = this.f13857m0;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 14) {
            str = P0();
        } else if (i10 == 12) {
            str = F0('\'');
        } else if (i10 == 13) {
            str = F0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f.L(R0()) + V());
        }
        this.f13857m0 = 0;
        this.f13863s0[this.f13862r0 - 1] = str;
        return str;
    }

    public final int w0(boolean z10) {
        int i10 = this.f13853i0;
        int i11 = this.f13854j0;
        while (true) {
            if (i10 == i11) {
                this.f13853i0 = i10;
                if (!p(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + V());
                }
                i10 = this.f13853i0;
                i11 = this.f13854j0;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f13852h0;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f13855k0++;
                this.f13856l0 = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f13853i0 = i12;
                    if (i12 == i11) {
                        this.f13853i0 = i10;
                        boolean p10 = p(2);
                        this.f13853i0++;
                        if (!p10) {
                            return c10;
                        }
                    }
                    i();
                    int i13 = this.f13853i0;
                    char c11 = cArr[i13];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f13853i0 = i13 + 1;
                        V0();
                        i10 = this.f13853i0;
                        i11 = this.f13854j0;
                    } else {
                        this.f13853i0 = i13 + 1;
                        while (true) {
                            if (this.f13853i0 + 2 > this.f13854j0 && !p(2)) {
                                Y0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f13853i0;
                            if (cArr[i14] == '\n') {
                                this.f13855k0++;
                                this.f13856l0 = i14 + 1;
                            } else {
                                for (int i15 = 0; i15 < 2; i15++) {
                                    if (cArr[this.f13853i0 + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                }
                                i10 = this.f13853i0 + 2;
                                i11 = this.f13854j0;
                                break;
                            }
                            this.f13853i0++;
                        }
                    }
                } else if (c10 == '#') {
                    this.f13853i0 = i12;
                    i();
                    V0();
                    i10 = this.f13853i0;
                    i11 = this.f13854j0;
                } else {
                    this.f13853i0 = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }
}
