package T4;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: Y  reason: collision with root package name */
    public final String f16909Y;

    static {
        new a("");
    }

    public a(String str) {
        if (str != null) {
            this.f16909Y = str.intern();
            int length = str.length();
            byte[] bArr = new byte[length * 3];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt != 0 && charAt < '\u0080') {
                    bArr[i10] = (byte) charAt;
                    i10++;
                } else if (charAt < '\u0800') {
                    bArr[i10] = (byte) (((charAt >> 6) & 31) | 192);
                    bArr[i10 + 1] = (byte) ((charAt & '?') | 128);
                    i10 += 2;
                } else {
                    bArr[i10] = (byte) (((charAt >> '\f') & 15) | 224);
                    bArr[i10 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i10 + 2] = (byte) ((charAt & '?') | 128);
                    i10 += 3;
                }
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr2.length;
            if (length2 >= 0) {
                if (length2 <= bArr2.length) {
                    return;
                }
                throw new IllegalArgumentException("end > bytes.length");
            }
            throw new IllegalArgumentException("end < start");
        }
        throw new NullPointerException("string == null");
    }

    public final String b() {
        char c10;
        boolean z10;
        String str = this.f16909Y;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder((length * 3) / 2);
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= ' ' && charAt < '\u007f') {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    sb2.append('\\');
                }
                sb2.append(charAt);
            } else if (charAt <= '\u007f') {
                if (charAt != '\t') {
                    if (charAt != '\n') {
                        if (charAt != '\r') {
                            if (i10 < length - 1) {
                                c10 = str.charAt(i10 + 1);
                            } else {
                                c10 = 0;
                            }
                            if (c10 >= '0' && c10 <= '7') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            sb2.append('\\');
                            for (int i11 = 6; i11 >= 0; i11 -= 3) {
                                char c11 = (char) (((charAt >> i11) & 7) + 48);
                                if (c11 != '0' || z10) {
                                    sb2.append(c11);
                                    z10 = true;
                                }
                            }
                            if (!z10) {
                                sb2.append('0');
                            }
                        } else {
                            sb2.append("\\r");
                        }
                    } else {
                        sb2.append("\\n");
                    }
                } else {
                    sb2.append("\\t");
                }
            } else {
                sb2.append("\\u");
                sb2.append(Character.forDigit(charAt >> '\f', 16));
                sb2.append(Character.forDigit((charAt >> '\b') & 15, 16));
                sb2.append(Character.forDigit((charAt >> 4) & 15, 16));
                sb2.append(Character.forDigit(charAt & 15, 16));
            }
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f16909Y.equals(((a) obj).f16909Y);
    }

    public final int hashCode() {
        return this.f16909Y.hashCode();
    }

    public final String toString() {
        return "string{\"" + b() + "\"}";
    }
}
