package fh;

import N.C1025i;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* renamed from: fh.a */
/* loaded from: classes.dex */
public abstract class AbstractC3074a {

    /* renamed from: a */
    public int f30855a;

    /* renamed from: c */
    public String f30857c;

    /* renamed from: b */
    public final C1025i f30856b = new C1025i(9);

    /* renamed from: d */
    public final StringBuilder f30858d = new StringBuilder();

    public static /* synthetic */ void r(AbstractC3074a abstractC3074a, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = abstractC3074a.f30855a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        abstractC3074a.q(i10, str, str2);
        throw null;
    }

    public String A(int i10, int i11) {
        return u().subSequence(i10, i11).toString();
    }

    public abstract boolean B();

    public final boolean C(boolean z10) {
        int y10 = y(z());
        int length = u().length() - y10;
        if (length < 4 || y10 == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != u().charAt(y10 + i10)) {
                return false;
            }
        }
        if (length > 4 && Ad.l.R(u().charAt(y10 + 4)) == 0) {
            return false;
        }
        if (z10) {
            this.f30855a = y10 + 4;
            return true;
        }
        return true;
    }

    public final void D(char c10) {
        int i10 = this.f30855a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f30855a = i10 - 1;
                String l10 = l();
                this.f30855a = i10;
                if (AbstractC3557B.K(l10, "null")) {
                    q(this.f30855a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f30855a = i10;
                throw th2;
            }
        }
        s(Ad.l.R(c10), true);
        throw null;
    }

    public final int a(int i10, CharSequence charSequence) {
        int i11 = i10 + 4;
        if (i11 >= charSequence.length()) {
            this.f30855a = i10;
            o();
            if (this.f30855a + 4 < charSequence.length()) {
                return a(this.f30855a, charSequence);
            }
            r(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        int t10 = t(i10 + 3, charSequence);
        this.f30858d.append((char) (t10 + (t(i10, charSequence) << 12) + (t(i10 + 1, charSequence) << 8) + (t(i10 + 2, charSequence) << 4)));
        return i11;
    }

    public void b(int i10, int i11) {
        this.f30858d.append(u(), i10, i11);
    }

    public abstract boolean c();

    public final void d(int i10, String str) {
        if (u().length() - i10 >= str.length()) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (str.charAt(i11) != (u().charAt(i10 + i11) | ' ')) {
                    r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f30855a = str.length() + i10;
            return;
        }
        r(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b10) {
        byte f6 = f();
        if (f6 == b10) {
            return f6;
        }
        s(b10, true);
        throw null;
    }

    public void h(char c10) {
        o();
        CharSequence u10 = u();
        int i10 = this.f30855a;
        while (true) {
            int y10 = y(i10);
            if (y10 != -1) {
                int i11 = y10 + 1;
                char charAt = u10.charAt(y10);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f30855a = i11;
                    if (charAt == c10) {
                        return;
                    }
                    D(c10);
                    throw null;
                }
                i10 = i11;
            } else {
                this.f30855a = y10;
                D(c10);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0197, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0198, code lost:
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019f, code lost:
        if (r14 == Long.MIN_VALUE) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a2, code lost:
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a3, code lost:
        r(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a8, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a9, code lost:
        r(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ae, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        r(r19, "Unexpected symbol '" + r9 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0112, code lost:
        if (r1 == r11) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
        if (r13 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        if (r1 == (r11 - 1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011f, code lost:
        if (r2 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
        if (r3 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012d, code lost:
        if (u().charAt(r11) != '\"') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012f, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
        r(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0139, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
        r(r19, r18, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0141, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0142, code lost:
        r19.f30855a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r12 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
        r1 = r14;
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (r5 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
        r3 = java.lang.Math.pow(10.0d, -r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r5 != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        r3 = java.lang.Math.pow(10.0d, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
        if (r1 > 9.223372036854776E18d) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0167, code lost:
        if (r1 < (-9.223372036854776E18d)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016f, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0171, code lost:
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0173, code lost:
        r(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018c, code lost:
        r(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0191, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        boolean z10;
        String str;
        int y10 = y(z());
        String str2 = "EOF";
        int i10 = 0;
        if (y10 < u().length() && y10 != -1) {
            if (u().charAt(y10) == '\"') {
                y10++;
                if (y10 != u().length()) {
                    z10 = true;
                } else {
                    r(this, str2, 0, null, 6);
                    throw null;
                }
            } else {
                z10 = false;
            }
            int i11 = y10;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            long j6 = 0;
            long j10 = 0;
            while (true) {
                if (i11 != u().length()) {
                    char charAt = u().charAt(i11);
                    if ((charAt == 'e' || charAt == 'E') && !z11) {
                        if (i11 != y10) {
                            i11++;
                            z11 = true;
                        } else {
                            r(this, "Unexpected symbol " + charAt + " in numeric literal", i10, null, 6);
                            throw null;
                        }
                    } else if (charAt == '-' && z11) {
                        if (i11 != y10) {
                            i11++;
                            i10 = 0;
                            z13 = false;
                        } else {
                            r(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                    } else if (charAt == '+' && z11) {
                        if (i11 != y10) {
                            i11++;
                            i10 = 0;
                        } else {
                            r(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                    } else {
                        str = str2;
                        if (charAt == '-') {
                            if (i11 == y10) {
                                i11++;
                                str2 = str;
                                i10 = 0;
                                z12 = true;
                            } else {
                                r(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                        } else if (Ad.l.R(charAt) != 0) {
                            break;
                        } else {
                            i11++;
                            int i12 = charAt - '0';
                            if (i12 < 0 || i12 >= 10) {
                                break;
                            }
                            if (z11) {
                                j6 = (j6 * 10) + i12;
                            } else {
                                j10 = (j10 * 10) - i12;
                                if (j10 > 0) {
                                    r(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            str2 = str;
                            i10 = 0;
                        }
                    }
                    z13 = true;
                } else {
                    str = str2;
                    break;
                }
            }
        } else {
            r(this, str2, 0, null, 6);
            throw null;
        }
    }

    public final String j() {
        String str = this.f30857c;
        if (str != null) {
            AbstractC3557B.Z(str);
            this.f30857c = null;
            return str;
        }
        return e();
    }

    public final String k(int i10, int i11, CharSequence charSequence) {
        String str;
        char c10;
        AbstractC3557B.c0("source", charSequence);
        char charAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                b(i10, i11);
                int y10 = y(i11 + 1);
                if (y10 != -1) {
                    int i12 = y10 + 1;
                    char charAt2 = u().charAt(y10);
                    if (charAt2 == 'u') {
                        i12 = a(i12, u());
                    } else {
                        if (charAt2 < 'u') {
                            c10 = C3083j.f30876a[charAt2];
                        } else {
                            c10 = 0;
                        }
                        if (c10 != 0) {
                            this.f30858d.append(c10);
                        } else {
                            r(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i10 = y(i12);
                    if (i10 == -1) {
                        r(this, "Unexpected EOF", i10, null, 4);
                        throw null;
                    }
                } else {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    b(i10, i11);
                    i10 = y(i11);
                    if (i10 == -1) {
                        r(this, "Unexpected EOF", i10, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i11);
                }
            }
            i11 = i10;
            z10 = true;
            charAt = charSequence.charAt(i11);
        }
        if (!z10) {
            str = A(i10, i11);
        } else {
            str = n(i10, i11);
        }
        this.f30855a = i11 + 1;
        return str;
    }

    public final String l() {
        String str;
        String str2 = this.f30857c;
        if (str2 != null) {
            AbstractC3557B.Z(str2);
            this.f30857c = null;
            return str2;
        }
        int z10 = z();
        if (z10 < u().length() && z10 != -1) {
            byte R10 = Ad.l.R(u().charAt(z10));
            if (R10 == 1) {
                return j();
            }
            if (R10 == 0) {
                boolean z11 = false;
                while (Ad.l.R(u().charAt(z10)) == 0) {
                    z10++;
                    if (z10 >= u().length()) {
                        b(this.f30855a, z10);
                        int y10 = y(z10);
                        if (y10 == -1) {
                            this.f30855a = z10;
                            return n(0, 0);
                        }
                        z10 = y10;
                        z11 = true;
                    }
                }
                if (!z11) {
                    str = A(this.f30855a, z10);
                } else {
                    str = n(this.f30855a, z10);
                }
                this.f30855a = z10;
                return str;
            }
            r(this, "Expected beginning of the string, but got " + u().charAt(z10), 0, null, 6);
            throw null;
        }
        r(this, "EOF", z10, null, 4);
        throw null;
    }

    public final String m() {
        String l10 = l();
        if (AbstractC3557B.K(l10, "null") && u().charAt(this.f30855a - 1) != '\"') {
            r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return l10;
    }

    public final String n(int i10, int i11) {
        b(i10, i11);
        StringBuilder sb2 = this.f30858d;
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        sb2.setLength(0);
        return sb3;
    }

    public final void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + u().charAt(this.f30855a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void q(int i10, String str, String str2) {
        String str3;
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("hint", str2);
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = Separators.RETURN.concat(str2);
        }
        StringBuilder r10 = android.gov.nist.core.a.r(str, " at path: ");
        r10.append(this.f30856b.g());
        r10.append(str3);
        throw Bi.c.n(r10.toString(), u(), i10);
    }

    public final void s(byte b10, boolean z10) {
        int i10;
        String str;
        String k12 = Ad.l.k1(b10);
        if (z10) {
            i10 = this.f30855a - 1;
        } else {
            i10 = this.f30855a;
        }
        if (this.f30855a != u().length() && i10 >= 0) {
            str = String.valueOf(u().charAt(i10));
        } else {
            str = "EOF";
        }
        r(this, "Expected " + k12 + ", but had '" + str + "' instead", i10, null, 4);
        throw null;
    }

    public final int t(int i10, CharSequence charSequence) {
        char charAt = charSequence.charAt(i10);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        r(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) u());
        sb2.append("', currentPosition=");
        return AbstractC2469q0.j(sb2, this.f30855a, ')');
    }

    public abstract CharSequence u();

    public abstract String v(String str, boolean z10);

    public final byte w() {
        CharSequence u10 = u();
        int i10 = this.f30855a;
        while (true) {
            int y10 = y(i10);
            if (y10 != -1) {
                char charAt = u10.charAt(y10);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f30855a = y10;
                    return Ad.l.R(charAt);
                }
                i10 = y10 + 1;
            } else {
                this.f30855a = y10;
                return (byte) 10;
            }
        }
    }

    public final String x(boolean z10) {
        String str;
        byte w10 = w();
        if (z10) {
            if (w10 != 1 && w10 != 0) {
                return null;
            }
            str = l();
        } else if (w10 != 1) {
            return null;
        } else {
            str = j();
        }
        this.f30857c = str;
        return str;
    }

    public abstract int y(int i10);

    public int z() {
        int y10;
        char charAt;
        int i10 = this.f30855a;
        while (true) {
            y10 = y(i10);
            if (y10 == -1 || !((charAt = u().charAt(y10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i10 = y10 + 1;
        }
        this.f30855a = y10;
        return y10;
    }

    public void o() {
    }
}
