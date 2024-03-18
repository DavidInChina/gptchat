package H4;

import E9.f;
import U3.c;
import android.gov.nist.core.Separators;
import ei.l;
import java.io.EOFException;
import java.io.IOException;
import ji.AbstractC4137l;
import ji.C4112A;
import ji.C4116E;
import ji.C4135j;
import ji.C4138m;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: q0  reason: collision with root package name */
    public static final C4138m f7437q0 = l.g("'\\");

    /* renamed from: r0  reason: collision with root package name */
    public static final C4138m f7438r0 = l.g("\"\\");

    /* renamed from: s0  reason: collision with root package name */
    public static final C4138m f7439s0 = l.g("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC4137l f7440k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C4135j f7441l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f7442m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public long f7443n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7444o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f7445p0;

    static {
        C4138m c4138m = C4138m.f36722i0;
        l.g("\n\r");
        l.g("*/");
    }

    public b(C4116E c4116e) {
        this.f7434Z = new int[32];
        this.f7435h0 = new String[32];
        this.f7436i0 = new int[32];
        this.f7440k0 = c4116e;
        this.f7441l0 = c4116e.f36672Z;
        S(6);
    }

    public final boolean A0(int i10) {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 != 35) {
                if (i10 != 44) {
                    if (i10 != 47 && i10 != 61) {
                        if (i10 != 123 && i10 != 125 && i10 != 58) {
                            if (i10 != 59) {
                                switch (i10) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
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
            m0();
            throw null;
        }
        return false;
    }

    @Override // H4.a
    public final int F() {
        String str;
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 16) {
            long j6 = this.f7443n0;
            int i11 = (int) j6;
            if (j6 == i11) {
                this.f7442m0 = 0;
                int[] iArr = this.f7436i0;
                int i12 = this.f7433Y - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new RuntimeException("Expected an int but was " + this.f7443n0 + " at path " + k());
        }
        if (i10 == 17) {
            C4135j c4135j = this.f7441l0;
            c4135j.getClass();
            this.f7445p0 = c4135j.S(this.f7444o0, Lg.a.f11131a);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new RuntimeException("Expected an int but was " + f.J(P()) + " at path " + k());
            }
        } else {
            if (i10 == 9) {
                str = P0(f7438r0);
            } else {
                str = P0(f7437q0);
            }
            this.f7445p0 = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f7442m0 = 0;
                int[] iArr2 = this.f7436i0;
                int i13 = this.f7433Y - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7442m0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7445p0);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f7445p0 = null;
                this.f7442m0 = 0;
                int[] iArr3 = this.f7436i0;
                int i15 = this.f7433Y - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new RuntimeException("Expected an int but was " + this.f7445p0 + " at path " + k());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.f7445p0 + " at path " + k());
        }
    }

    public final String F0() {
        String str;
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 14) {
            str = R0();
        } else if (i10 == 13) {
            str = P0(f7438r0);
        } else if (i10 == 12) {
            str = P0(f7437q0);
        } else if (i10 == 15) {
            str = this.f7445p0;
        } else {
            throw new RuntimeException("Expected a name but was " + f.J(P()) + " at path " + k());
        }
        this.f7442m0 = 0;
        this.f7435h0[this.f7433Y - 1] = str;
        return str;
    }

    public final int H0(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            AbstractC4137l abstractC4137l = this.f7440k0;
            if (abstractC4137l.o0(i11)) {
                long j6 = i10;
                C4135j c4135j = this.f7441l0;
                byte k10 = c4135j.k(j6);
                if (k10 != 10 && k10 != 32 && k10 != 13 && k10 != 9) {
                    c4135j.skip(j6);
                    if (k10 == 47) {
                        if (!abstractC4137l.o0(2L)) {
                            return k10;
                        }
                        m0();
                        throw null;
                    } else if (k10 != 35) {
                        return k10;
                    } else {
                        m0();
                        throw null;
                    }
                }
                i10 = i11;
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    @Override // H4.a
    public final String O() {
        String str;
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 10) {
            str = R0();
        } else if (i10 == 9) {
            str = P0(f7438r0);
        } else if (i10 == 8) {
            str = P0(f7437q0);
        } else if (i10 == 11) {
            str = this.f7445p0;
            this.f7445p0 = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f7443n0);
        } else if (i10 == 17) {
            C4135j c4135j = this.f7441l0;
            c4135j.getClass();
            str = c4135j.S(this.f7444o0, Lg.a.f11131a);
        } else {
            throw new RuntimeException("Expected a string but was " + f.J(P()) + " at path " + k());
        }
        this.f7442m0 = 0;
        int[] iArr = this.f7436i0;
        int i11 = this.f7433Y - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    @Override // H4.a
    public final int P() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final String P0(C4138m c4138m) {
        StringBuilder sb2 = null;
        while (true) {
            long D02 = this.f7440k0.D0(c4138m);
            if (D02 != -1) {
                C4135j c4135j = this.f7441l0;
                if (c4135j.k(D02) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(c4135j.S(D02, Lg.a.f11131a));
                    c4135j.readByte();
                    sb2.append(S0());
                } else if (sb2 == null) {
                    String S = c4135j.S(D02, Lg.a.f11131a);
                    c4135j.readByte();
                    return S;
                } else {
                    sb2.append(c4135j.S(D02, Lg.a.f11131a));
                    c4135j.readByte();
                    return sb2.toString();
                }
            } else {
                f0("Unterminated string");
                throw null;
            }
        }
    }

    public final String R0() {
        long D02 = this.f7440k0.D0(f7439s0);
        int i10 = (D02 > (-1L) ? 1 : (D02 == (-1L) ? 0 : -1));
        C4135j c4135j = this.f7441l0;
        if (i10 != 0) {
            c4135j.getClass();
            return c4135j.S(D02, Lg.a.f11131a);
        }
        return c4135j.V();
    }

    public final char S0() {
        int i10;
        AbstractC4137l abstractC4137l = this.f7440k0;
        if (abstractC4137l.o0(1L)) {
            C4135j c4135j = this.f7441l0;
            byte readByte = c4135j.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (abstractC4137l.o0(4L)) {
                                        char c10 = 0;
                                        for (int i11 = 0; i11 < 4; i11++) {
                                            byte k10 = c4135j.k(i11);
                                            char c11 = (char) (c10 << 4);
                                            if (k10 >= 48 && k10 <= 57) {
                                                i10 = k10 - 48;
                                            } else if (k10 >= 97 && k10 <= 102) {
                                                i10 = k10 - 87;
                                            } else if (k10 < 65 || k10 > 70) {
                                                f0("\\u".concat(c4135j.S(4L, Lg.a.f11131a)));
                                                throw null;
                                            } else {
                                                i10 = k10 - 55;
                                            }
                                            c10 = (char) (i10 + c11);
                                        }
                                        c4135j.skip(4L);
                                        return c10;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + k());
                                }
                                f0("Invalid escape sequence: \\" + ((char) readByte));
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
            return (char) readByte;
        }
        f0("Unterminated escape sequence");
        throw null;
    }

    public final void T0(C4138m c4138m) {
        while (true) {
            long D02 = this.f7440k0.D0(c4138m);
            if (D02 != -1) {
                C4135j c4135j = this.f7441l0;
                if (c4135j.k(D02) == 92) {
                    c4135j.skip(D02 + 1);
                    S0();
                } else {
                    c4135j.skip(D02 + 1);
                    return;
                }
            } else {
                f0("Unterminated string");
                throw null;
            }
        }
    }

    @Override // H4.a
    public final int V(c cVar) {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return w0(this.f7445p0, cVar);
        }
        int p02 = this.f7440k0.p0((C4112A) cVar.f17397h0);
        if (p02 != -1) {
            this.f7442m0 = 0;
            this.f7435h0[this.f7433Y - 1] = ((String[]) cVar.f17396Z)[p02];
            return p02;
        }
        String str = this.f7435h0[this.f7433Y - 1];
        String F02 = F0();
        int w02 = w0(F02, cVar);
        if (w02 == -1) {
            this.f7442m0 = 15;
            this.f7445p0 = F02;
            this.f7435h0[this.f7433Y - 1] = str;
        }
        return w02;
    }

    @Override // H4.a
    public final void a() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 3) {
            S(1);
            this.f7436i0[this.f7433Y - 1] = 0;
            this.f7442m0 = 0;
            return;
        }
        throw new RuntimeException("Expected BEGIN_ARRAY but was " + f.J(P()) + " at path " + k());
    }

    @Override // H4.a
    public final void a0() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 14) {
            long D02 = this.f7440k0.D0(f7439s0);
            int i11 = (D02 > (-1L) ? 1 : (D02 == (-1L) ? 0 : -1));
            C4135j c4135j = this.f7441l0;
            if (i11 == 0) {
                D02 = c4135j.f36721Z;
            }
            c4135j.skip(D02);
        } else if (i10 == 13) {
            T0(f7438r0);
        } else if (i10 == 12) {
            T0(f7437q0);
        } else if (i10 != 15) {
            throw new RuntimeException("Expected a name but was " + f.J(P()) + " at path " + k());
        }
        this.f7442m0 = 0;
        this.f7435h0[this.f7433Y - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7442m0 = 0;
        this.f7434Z[0] = 8;
        this.f7433Y = 1;
        this.f7441l0.a();
        this.f7440k0.close();
    }

    @Override // H4.a
    public final void d0() {
        int i10 = 0;
        do {
            int i11 = this.f7442m0;
            if (i11 == 0) {
                i11 = u0();
            }
            if (i11 == 3) {
                S(1);
            } else if (i11 == 1) {
                S(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f7433Y--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + f.J(P()) + " at path " + k());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f7433Y--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + f.J(P()) + " at path " + k());
                    }
                } else {
                    C4135j c4135j = this.f7441l0;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    c4135j.skip(this.f7444o0);
                                } else if (i11 == 18) {
                                    throw new RuntimeException("Expected a value but was " + f.J(P()) + " at path " + k());
                                }
                            } else {
                                T0(f7437q0);
                            }
                        } else {
                            T0(f7438r0);
                        }
                    } else {
                        long D02 = this.f7440k0.D0(f7439s0);
                        if (D02 == -1) {
                            D02 = c4135j.f36721Z;
                        }
                        c4135j.skip(D02);
                    }
                }
                this.f7442m0 = 0;
            }
            i10++;
            this.f7442m0 = 0;
        } while (i10 != 0);
        int[] iArr = this.f7436i0;
        int i12 = this.f7433Y - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f7435h0[i12] = "null";
    }

    @Override // H4.a
    public final void h() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 1) {
            S(3);
            this.f7442m0 = 0;
            return;
        }
        throw new RuntimeException("Expected BEGIN_OBJECT but was " + f.J(P()) + " at path " + k());
    }

    @Override // H4.a
    public final void i() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 4) {
            int i11 = this.f7433Y;
            this.f7433Y = i11 - 1;
            int[] iArr = this.f7436i0;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f7442m0 = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + f.J(P()) + " at path " + k());
    }

    @Override // H4.a
    public final void j() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 2) {
            int i11 = this.f7433Y;
            int i12 = i11 - 1;
            this.f7433Y = i12;
            this.f7435h0[i12] = null;
            int[] iArr = this.f7436i0;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f7442m0 = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + f.J(P()) + " at path " + k());
    }

    @Override // H4.a
    public final boolean m() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    public final void m0() {
        f0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // H4.a
    public final boolean p() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 5) {
            this.f7442m0 = 0;
            int[] iArr = this.f7436i0;
            int i11 = this.f7433Y - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f7442m0 = 0;
            int[] iArr2 = this.f7436i0;
            int i12 = this.f7433Y - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new RuntimeException("Expected a boolean but was " + f.J(P()) + " at path " + k());
        }
    }

    @Override // H4.a
    public final double r() {
        int i10 = this.f7442m0;
        if (i10 == 0) {
            i10 = u0();
        }
        if (i10 == 16) {
            this.f7442m0 = 0;
            int[] iArr = this.f7436i0;
            int i11 = this.f7433Y - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f7443n0;
        }
        if (i10 == 17) {
            C4135j c4135j = this.f7441l0;
            c4135j.getClass();
            this.f7445p0 = c4135j.S(this.f7444o0, Lg.a.f11131a);
        } else if (i10 == 9) {
            this.f7445p0 = P0(f7438r0);
        } else if (i10 == 8) {
            this.f7445p0 = P0(f7437q0);
        } else if (i10 == 10) {
            this.f7445p0 = R0();
        } else if (i10 != 11) {
            throw new RuntimeException("Expected a double but was " + f.J(P()) + " at path " + k());
        }
        this.f7442m0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7445p0);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f7445p0 = null;
                this.f7442m0 = 0;
                int[] iArr2 = this.f7436i0;
                int i12 = this.f7433Y - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + k());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.f7445p0 + " at path " + k());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f7440k0 + Separators.RPAREN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0198, code lost:
        if (A0(r1) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019a, code lost:
        if (r4 != 2) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x019c, code lost:
        if (r8 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a2, code lost:
        if (r10 != Long.MIN_VALUE) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a4, code lost:
        if (r13 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01aa, code lost:
        if (r10 != 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ac, code lost:
        if (r13 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ae, code lost:
        if (r13 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b1, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b2, code lost:
        r21.f7443n0 = r10;
        r9.skip(r5);
        r1 = 16;
        r21.f7442m0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01bc, code lost:
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01bf, code lost:
        if (r4 == 2) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c2, code lost:
        if (r4 == 4) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c5, code lost:
        if (r4 != 7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c7, code lost:
        r21.f7444o0 = r5;
        r1 = 17;
        r21.f7442m0 = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int u0() {
        int H02;
        int i10;
        int i11;
        char c10;
        boolean z10;
        String str;
        String str2;
        byte k10;
        int[] iArr = this.f7434Z;
        int i12 = this.f7433Y - 1;
        int i13 = iArr[i12];
        C4135j c4135j = this.f7441l0;
        if (i13 == 1) {
            iArr[i12] = 2;
        } else if (i13 == 2) {
            int H03 = H0(true);
            c4135j.readByte();
            if (H03 != 44) {
                if (H03 != 59) {
                    if (H03 == 93) {
                        this.f7442m0 = 4;
                        return 4;
                    }
                    f0("Unterminated array");
                    throw null;
                }
                m0();
                throw null;
            }
        } else if (i13 != 3 && i13 != 5) {
            if (i13 == 4) {
                iArr[i12] = 5;
                int H04 = H0(true);
                c4135j.readByte();
                if (H04 != 58) {
                    if (H04 != 61) {
                        f0("Expected ':'");
                        throw null;
                    }
                    m0();
                    throw null;
                }
            } else if (i13 == 6) {
                iArr[i12] = 7;
            } else if (i13 == 7) {
                if (H0(false) == -1) {
                    this.f7442m0 = 18;
                    return 18;
                }
                m0();
                throw null;
            } else {
                if (i13 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                H02 = H0(true);
                if (H02 == 34) {
                    if (H02 != 39) {
                        if (H02 != 44 && H02 != 59) {
                            if (H02 != 91) {
                                if (H02 != 93) {
                                    if (H02 != 123) {
                                        byte k11 = c4135j.k(0L);
                                        AbstractC4137l abstractC4137l = this.f7440k0;
                                        if (k11 != 116 && k11 != 84) {
                                            if (k11 != 102 && k11 != 70) {
                                                if (k11 == 110 || k11 == 78) {
                                                    str2 = "null";
                                                    str = "NULL";
                                                    i10 = 7;
                                                }
                                                i10 = 0;
                                                if (i10 == 0) {
                                                    return i10;
                                                }
                                                long j6 = 0;
                                                boolean z11 = true;
                                                char c11 = 0;
                                                int i14 = 0;
                                                boolean z12 = false;
                                                while (true) {
                                                    int i15 = i14 + 1;
                                                    if (!abstractC4137l.o0(i15)) {
                                                        break;
                                                    }
                                                    byte k12 = c4135j.k(i14);
                                                    if (k12 != 43) {
                                                        if (k12 != 69 && k12 != 101) {
                                                            if (k12 != 45) {
                                                                if (k12 != 46) {
                                                                    if (k12 < 48 || k12 > 57) {
                                                                        break;
                                                                    }
                                                                    if (c11 != 1 && c11 != 0) {
                                                                        if (c11 == 2) {
                                                                            if (j6 == 0) {
                                                                                break;
                                                                            }
                                                                            long j10 = (10 * j6) - (k12 - 48);
                                                                            int i16 = (j6 > (-922337203685477580L) ? 1 : (j6 == (-922337203685477580L) ? 0 : -1));
                                                                            if (i16 <= 0 && (i16 != 0 || j10 >= j6)) {
                                                                                z10 = false;
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                            z11 &= z10;
                                                                            j6 = j10;
                                                                        } else if (c11 == 3) {
                                                                            c11 = 4;
                                                                        } else if (c11 == 5 || c11 == 6) {
                                                                            c11 = 7;
                                                                        }
                                                                        i14 = i15;
                                                                    } else {
                                                                        j6 = -(k12 - 48);
                                                                        c11 = 2;
                                                                    }
                                                                    i14 = i15;
                                                                } else if (c11 != 2) {
                                                                    break;
                                                                } else {
                                                                    c11 = 3;
                                                                    i14 = i15;
                                                                }
                                                            } else {
                                                                c10 = 6;
                                                                if (c11 == 0) {
                                                                    c11 = 1;
                                                                    z12 = true;
                                                                    i14 = i15;
                                                                } else {
                                                                    if (c11 != 5) {
                                                                        break;
                                                                    }
                                                                    c11 = c10;
                                                                    i14 = i15;
                                                                }
                                                            }
                                                        } else if (c11 != 2 && c11 != 4) {
                                                            break;
                                                        } else {
                                                            c11 = 5;
                                                            i14 = i15;
                                                        }
                                                        if (i11 == 0) {
                                                            return i11;
                                                        }
                                                        if (!A0(c4135j.k(0L))) {
                                                            f0("Expected value");
                                                            throw null;
                                                        }
                                                        m0();
                                                        throw null;
                                                    }
                                                    c10 = 6;
                                                    if (c11 != 5) {
                                                        break;
                                                    }
                                                    c11 = c10;
                                                    i14 = i15;
                                                }
                                                i11 = 0;
                                                if (i11 == 0) {
                                                }
                                            } else {
                                                str2 = "false";
                                                str = "FALSE";
                                                i10 = 6;
                                            }
                                        } else {
                                            str2 = "true";
                                            str = "TRUE";
                                            i10 = 5;
                                        }
                                        int length = str2.length();
                                        int i17 = 1;
                                        while (true) {
                                            if (i17 < length) {
                                                int i18 = i17 + 1;
                                                if (!abstractC4137l.o0(i18) || ((k10 = c4135j.k(i17)) != str2.charAt(i17) && k10 != str.charAt(i17))) {
                                                    break;
                                                }
                                                i17 = i18;
                                            } else if (!abstractC4137l.o0(length + 1) || !A0(c4135j.k(length))) {
                                                c4135j.skip(length);
                                                this.f7442m0 = i10;
                                            }
                                        }
                                        i10 = 0;
                                        if (i10 == 0) {
                                        }
                                    } else {
                                        c4135j.readByte();
                                        this.f7442m0 = 1;
                                        return 1;
                                    }
                                } else if (i13 == 1) {
                                    c4135j.readByte();
                                    this.f7442m0 = 4;
                                    return 4;
                                }
                            } else {
                                c4135j.readByte();
                                this.f7442m0 = 3;
                                return 3;
                            }
                        }
                        if (i13 != 1 && i13 != 2) {
                            f0("Unexpected value");
                            throw null;
                        }
                        m0();
                        throw null;
                    }
                    m0();
                    throw null;
                }
                c4135j.readByte();
                this.f7442m0 = 9;
                return 9;
            }
        } else {
            iArr[i12] = 4;
            if (i13 == 5) {
                int H05 = H0(true);
                c4135j.readByte();
                if (H05 != 44) {
                    if (H05 != 59) {
                        if (H05 == 125) {
                            this.f7442m0 = 2;
                            return 2;
                        }
                        f0("Unterminated object");
                        throw null;
                    }
                    m0();
                    throw null;
                }
            }
            int H06 = H0(true);
            if (H06 != 34) {
                if (H06 != 39) {
                    if (H06 == 125) {
                        if (i13 != 5) {
                            c4135j.readByte();
                            this.f7442m0 = 2;
                            return 2;
                        }
                        f0("Expected name");
                        throw null;
                    }
                    m0();
                    throw null;
                }
                c4135j.readByte();
                m0();
                throw null;
            }
            c4135j.readByte();
            this.f7442m0 = 13;
            return 13;
        }
        H02 = H0(true);
        if (H02 == 34) {
        }
    }

    public final int w0(String str, c cVar) {
        int length = ((String[]) cVar.f17396Z).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) cVar.f17396Z)[i10])) {
                this.f7442m0 = 0;
                this.f7435h0[this.f7433Y - 1] = str;
                return i10;
            }
        }
        return -1;
    }
}
