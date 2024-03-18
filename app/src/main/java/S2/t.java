package s2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f45185a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f45186b;

    /* renamed from: c  reason: collision with root package name */
    public int f45187c;

    /* renamed from: d  reason: collision with root package name */
    public int f45188d;

    /* renamed from: e  reason: collision with root package name */
    public int f45189e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(byte[] bArr, int i10) {
        this(bArr.length, bArr);
        this.f45185a = i10;
        if (i10 != 2) {
            return;
        }
        this.f45186b = bArr;
        this.f45187c = bArr.length;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        switch (this.f45185a) {
            case 0:
                int i13 = this.f45187c;
                if (i13 >= 0 && (i13 < (i10 = this.f45189e) || (i13 == i10 && this.f45188d == 0))) {
                    z10 = true;
                }
                Gi.e.n(z10);
                return;
            case 1:
                int i14 = this.f45188d;
                if (i14 >= 0 && (i14 < (i11 = this.f45187c) || (i14 == i11 && this.f45189e == 0))) {
                    z10 = true;
                }
                Gi.e.n(z10);
                return;
            default:
                int i15 = this.f45188d;
                if (i15 >= 0 && (i15 < (i12 = this.f45187c) || (i15 == i12 && this.f45189e == 0))) {
                    z10 = true;
                }
                Gi.e.n(z10);
                return;
        }
    }

    public final int b() {
        return ((this.f45189e - this.f45187c) * 8) - this.f45188d;
    }

    public final void c() {
        if (this.f45188d == 0) {
            return;
        }
        this.f45188d = 0;
        this.f45187c++;
        a();
    }

    public final boolean d(int i10) {
        int i11 = this.f45188d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f45189e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f45187c) {
                break;
            } else if (q(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f45187c;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        boolean z10;
        int i10 = this.f45188d;
        int i11 = this.f45189e;
        int i12 = 0;
        while (this.f45188d < this.f45187c && !h()) {
            i12++;
        }
        if (this.f45188d == this.f45187c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45188d = i10;
        this.f45189e = i11;
        if (z10 || !d((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final int f() {
        boolean z10;
        if (this.f45188d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        return this.f45187c;
    }

    public final int g() {
        switch (this.f45185a) {
            case 0:
                return (this.f45187c * 8) + this.f45188d;
            default:
                return (this.f45188d * 8) + this.f45189e;
        }
    }

    public final boolean h() {
        boolean z10 = false;
        switch (this.f45185a) {
            case 0:
                if ((this.f45186b[this.f45187c] & (128 >> this.f45188d)) != 0) {
                    z10 = true;
                }
                r();
                return z10;
            case 1:
                if ((this.f45186b[this.f45188d] & (128 >> this.f45189e)) != 0) {
                    z10 = true;
                }
                r();
                return z10;
            default:
                if ((((this.f45186b[this.f45188d] & 255) >> this.f45189e) & 1) == 1) {
                    z10 = true;
                }
                s(1);
                return z10;
        }
    }

    public final int i(int i10) {
        int i11 = 1;
        switch (this.f45185a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.f45188d += i10;
                int i12 = 0;
                while (true) {
                    int i13 = this.f45188d;
                    if (i13 > 8) {
                        int i14 = i13 - 8;
                        this.f45188d = i14;
                        byte[] bArr = this.f45186b;
                        int i15 = this.f45187c;
                        this.f45187c = i15 + 1;
                        i12 |= (bArr[i15] & 255) << i14;
                    } else {
                        byte[] bArr2 = this.f45186b;
                        int i16 = this.f45187c;
                        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((255 & bArr2[i16]) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f45188d = 0;
                            this.f45187c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                }
            case 1:
                this.f45189e += i10;
                int i18 = 0;
                while (true) {
                    int i19 = this.f45189e;
                    int i20 = 2;
                    if (i19 > 8) {
                        int i21 = i19 - 8;
                        this.f45189e = i21;
                        byte[] bArr3 = this.f45186b;
                        int i22 = this.f45188d;
                        i18 |= (bArr3[i22] & 255) << i21;
                        if (!q(i22 + 1)) {
                            i20 = 1;
                        }
                        this.f45188d = i22 + i20;
                    } else {
                        byte[] bArr4 = this.f45186b;
                        int i23 = this.f45188d;
                        int i24 = ((-1) >>> (32 - i10)) & (i18 | ((255 & bArr4[i23]) >> (8 - i19)));
                        if (i19 == 8) {
                            this.f45189e = 0;
                            if (q(i23 + 1)) {
                                i11 = 2;
                            }
                            this.f45188d = i23 + i11;
                        }
                        a();
                        return i24;
                    }
                }
            default:
                int i25 = this.f45188d;
                int min = Math.min(i10, 8 - this.f45189e);
                int i26 = i25 + 1;
                int i27 = ((this.f45186b[i25] & 255) >> this.f45189e) & (255 >> (8 - min));
                while (min < i10) {
                    i27 |= (this.f45186b[i26] & 255) << min;
                    min += 8;
                    i26++;
                }
                int i28 = i27 & ((-1) >>> (32 - i10));
                s(i10);
                return i28;
        }
    }

    public final void j(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f45186b;
            int i13 = this.f45187c;
            int i14 = i13 + 1;
            this.f45187c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f45188d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f45188d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f45186b;
            int i18 = this.f45187c;
            this.f45187c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f45188d = i17 - 8;
        }
        int i19 = this.f45188d + i16;
        this.f45188d = i19;
        byte[] bArr4 = this.f45186b;
        int i20 = this.f45187c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f45188d = 0;
            this.f45187c = i20 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i10) {
        boolean z10;
        if (this.f45188d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        System.arraycopy(this.f45186b, this.f45187c, bArr, 0, i10);
        this.f45187c += i10;
        a();
    }

    public final int l() {
        int i10 = 0;
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = i(i11);
        }
        return i12 + i10;
    }

    public final int m() {
        int i10;
        int l10 = l();
        if (l10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((l10 + 1) / 2) * i10;
    }

    public final void n(int i10, byte[] bArr) {
        this.f45186b = bArr;
        this.f45187c = 0;
        this.f45188d = 0;
        this.f45189e = i10;
    }

    public final void o(u uVar) {
        n(uVar.f45195c, uVar.f45193a);
        p(uVar.f45194b * 8);
    }

    public final void p(int i10) {
        int i11 = i10 / 8;
        this.f45187c = i11;
        this.f45188d = i10 - (i11 * 8);
        a();
    }

    public final boolean q(int i10) {
        if (2 <= i10 && i10 < this.f45187c) {
            byte[] bArr = this.f45186b;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void r() {
        int i10 = 1;
        switch (this.f45185a) {
            case 0:
                int i11 = this.f45188d + 1;
                this.f45188d = i11;
                if (i11 == 8) {
                    this.f45188d = 0;
                    this.f45187c++;
                }
                a();
                return;
            default:
                int i12 = this.f45189e + 1;
                this.f45189e = i12;
                if (i12 == 8) {
                    this.f45189e = 0;
                    int i13 = this.f45188d;
                    if (q(i13 + 1)) {
                        i10 = 2;
                    }
                    this.f45188d = i13 + i10;
                }
                a();
                return;
        }
    }

    public final void s(int i10) {
        switch (this.f45185a) {
            case 0:
                int i11 = i10 / 8;
                int i12 = this.f45187c + i11;
                this.f45187c = i12;
                int i13 = (i10 - (i11 * 8)) + this.f45188d;
                this.f45188d = i13;
                if (i13 > 7) {
                    this.f45187c = i12 + 1;
                    this.f45188d = i13 - 8;
                }
                a();
                return;
            case 1:
                int i14 = this.f45188d;
                int i15 = i10 / 8;
                int i16 = i14 + i15;
                this.f45188d = i16;
                int i17 = (i10 - (i15 * 8)) + this.f45189e;
                this.f45189e = i17;
                if (i17 > 7) {
                    this.f45188d = i16 + 1;
                    this.f45189e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f45188d) {
                        if (q(i14)) {
                            this.f45188d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i18 = i10 / 8;
                int i19 = this.f45188d + i18;
                this.f45188d = i19;
                int i20 = (i10 - (i18 * 8)) + this.f45189e;
                this.f45189e = i20;
                if (i20 > 7) {
                    this.f45188d = i19 + 1;
                    this.f45189e = i20 - 8;
                }
                a();
                return;
        }
    }

    public final void t(int i10) {
        boolean z10;
        if (this.f45188d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        this.f45187c += i10;
        a();
    }

    public t() {
        this.f45185a = 0;
        this.f45186b = AbstractC5530A.f45136f;
    }

    public t(byte[] bArr, int i10, int i11) {
        this.f45185a = 1;
        this.f45186b = bArr;
        this.f45188d = i10;
        this.f45187c = i11;
        this.f45189e = 0;
        a();
    }

    public t(int i10, byte[] bArr) {
        this.f45185a = 0;
        this.f45186b = bArr;
        this.f45189e = i10;
    }

    public t(int i10, int i11) {
        this.f45185a = 3;
        this.f45187c = i10;
        this.f45188d = i11;
        this.f45186b = new byte[(i11 * 2) - 1];
        this.f45189e = 0;
    }
}
