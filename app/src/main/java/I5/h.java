package I5;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8082a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f8083b;

    /* renamed from: c  reason: collision with root package name */
    public int f8084c;

    public /* synthetic */ h(byte[] bArr, int i10, int i11) {
        this.f8082a = i11;
        this.f8083b = bArr;
        this.f8084c = i10;
    }

    public static h c(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            h hVar = new h(length);
            hVar.h(0);
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (charAt == '[') {
                    hVar.d(0, 0);
                } else if (charAt == '.') {
                    hVar.d(1, 0);
                } else if (charAt == '*') {
                    hVar.d(2, 0);
                } else if (charAt >= '0' && charAt <= '9') {
                    int i12 = charAt - '0';
                    while (i11 < length) {
                        int i13 = i11 + 1;
                        char charAt2 = str.charAt(i11);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            i12 = ((i12 * 10) + charAt2) - 48;
                            i11 = i13;
                        } else if (charAt2 == ';') {
                            i11 = i13;
                            hVar.d(3, i12);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    hVar.d(3, i12);
                } else {
                    throw new IllegalArgumentException();
                }
                i10 = i11;
            }
            byte[] bArr = hVar.f8083b;
            bArr[0] = (byte) (hVar.f8084c / 2);
            return new h(bArr, 0, 2);
        }
        return null;
    }

    public final void a(int i10, int i11, String str) {
        int length = str.length();
        int i12 = i10;
        int i13 = i12;
        while (i12 < length) {
            char charAt = str.charAt(i12);
            if (charAt >= 1 && charAt <= '\u007f') {
                i13++;
            } else if (charAt <= '\u07ff') {
                i13 += 2;
            } else {
                i13 += 3;
            }
            i12++;
        }
        if (i13 <= i11) {
            int i14 = this.f8084c;
            int i15 = i14 - i10;
            int i16 = i15 - 2;
            if (i16 >= 0) {
                byte[] bArr = this.f8083b;
                bArr[i16] = (byte) (i13 >>> 8);
                bArr[i15 - 1] = (byte) i13;
            }
            if ((i14 + i13) - i10 > this.f8083b.length) {
                b(i13 - i10);
            }
            int i17 = this.f8084c;
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 >= 1 && charAt2 <= '\u007f') {
                    this.f8083b[i17] = (byte) charAt2;
                    i17++;
                } else if (charAt2 <= '\u07ff') {
                    byte[] bArr2 = this.f8083b;
                    int i18 = i17 + 1;
                    bArr2[i17] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i17 += 2;
                    bArr2[i18] = (byte) ((charAt2 & '?') | 128);
                } else {
                    byte[] bArr3 = this.f8083b;
                    bArr3[i17] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i19 = i17 + 2;
                    bArr3[i17 + 1] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i17 += 3;
                    bArr3[i19] = (byte) ((charAt2 & '?') | 128);
                }
                i10++;
            }
            this.f8084c = i17;
            return;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public final void b(int i10) {
        int i11 = this.f8084c;
        byte[] bArr = this.f8083b;
        if (i11 <= bArr.length) {
            int length = bArr.length * 2;
            int i12 = i10 + i11;
            if (length <= i12) {
                length = i12;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.f8083b = bArr2;
            return;
        }
        throw new AssertionError("Internal error");
    }

    public final void d(int i10, int i11) {
        int i12 = this.f8084c;
        int i13 = i12 + 2;
        if (i13 > this.f8083b.length) {
            b(2);
        }
        byte[] bArr = this.f8083b;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) i11;
        this.f8084c = i13;
    }

    public final void e(int i10, int i11) {
        int i12 = this.f8084c;
        int i13 = i12 + 4;
        if (i13 > this.f8083b.length) {
            b(4);
        }
        byte[] bArr = this.f8083b;
        bArr[i12] = (byte) 15;
        bArr[i12 + 1] = (byte) i10;
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
        this.f8084c = i13;
    }

    public final void f(int i10, int i11) {
        int i12 = this.f8084c;
        int i13 = i12 + 3;
        if (i13 > this.f8083b.length) {
            b(3);
        }
        byte[] bArr = this.f8083b;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
        this.f8084c = i13;
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f8084c;
        int i14 = i13 + 5;
        if (i14 > this.f8083b.length) {
            b(5);
        }
        byte[] bArr = this.f8083b;
        bArr[i13] = (byte) i10;
        bArr[i13 + 1] = (byte) (i11 >>> 8);
        bArr[i13 + 2] = (byte) i11;
        bArr[i13 + 3] = (byte) (i12 >>> 8);
        bArr[i13 + 4] = (byte) i12;
        this.f8084c = i14;
    }

    public final void h(int i10) {
        int i11 = this.f8084c;
        int i12 = i11 + 1;
        if (i12 > this.f8083b.length) {
            b(1);
        }
        this.f8083b[i11] = (byte) i10;
        this.f8084c = i12;
    }

    public final void i(byte[] bArr, int i10, int i11) {
        if (this.f8084c + i11 > this.f8083b.length) {
            b(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.f8083b, this.f8084c, i11);
        }
        this.f8084c += i11;
    }

    public final void j(int i10) {
        int i11 = this.f8084c;
        int i12 = i11 + 4;
        if (i12 > this.f8083b.length) {
            b(4);
        }
        byte[] bArr = this.f8083b;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.f8084c = i12;
    }

    public final void k(int i10) {
        int i11 = this.f8084c;
        int i12 = i11 + 2;
        if (i12 > this.f8083b.length) {
            b(2);
        }
        byte[] bArr = this.f8083b;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        this.f8084c = i12;
    }

    public final String toString() {
        switch (this.f8082a) {
            case 2:
                byte b10 = this.f8083b[this.f8084c];
                StringBuilder sb2 = new StringBuilder(b10 * 2);
                for (int i10 = 0; i10 < b10; i10++) {
                    byte[] bArr = this.f8083b;
                    int i11 = (i10 * 2) + this.f8084c;
                    byte b11 = bArr[i11 + 1];
                    if (b11 != 0) {
                        if (b11 != 1) {
                            if (b11 != 2) {
                                if (b11 == 3) {
                                    sb2.append((int) bArr[i11 + 2]);
                                    sb2.append(';');
                                } else {
                                    throw new AssertionError();
                                }
                            } else {
                                sb2.append('*');
                            }
                        } else {
                            sb2.append('.');
                        }
                    } else {
                        sb2.append('[');
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public h() {
        this.f8082a = 1;
        this.f8083b = new byte[64];
    }

    public h(int i10) {
        this.f8082a = 1;
        this.f8083b = new byte[i10];
    }
}
