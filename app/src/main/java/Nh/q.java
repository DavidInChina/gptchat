package Nh;

import N.C1025i;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final d f13196a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13197b;

    /* renamed from: c  reason: collision with root package name */
    public int f13198c;

    /* renamed from: d  reason: collision with root package name */
    public String f13199d;

    /* renamed from: e  reason: collision with root package name */
    public int f13200e;

    /* renamed from: f  reason: collision with root package name */
    public p[] f13201f;

    /* renamed from: g  reason: collision with root package name */
    public int f13202g;

    /* renamed from: h  reason: collision with root package name */
    public final I5.h f13203h;

    /* renamed from: i  reason: collision with root package name */
    public int f13204i;

    /* renamed from: j  reason: collision with root package name */
    public I5.h f13205j;

    /* renamed from: k  reason: collision with root package name */
    public int f13206k;

    /* renamed from: l  reason: collision with root package name */
    public p[] f13207l;

    /* renamed from: m  reason: collision with root package name */
    public int f13208m;

    /* renamed from: n  reason: collision with root package name */
    public C1025i[] f13209n;

    /* renamed from: o  reason: collision with root package name */
    public C1025i[] f13210o;

    public q(d dVar, b bVar) {
        int i10;
        int i11;
        byte b10;
        this.f13196a = dVar;
        this.f13197b = bVar;
        byte[] bArr = bVar.f13009b;
        int[] iArr = bVar.f13010c;
        int i12 = iArr[1] - 1;
        int i13 = bVar.f13008a - i12;
        this.f13202g = iArr.length;
        I5.h hVar = new I5.h(i13);
        this.f13203h = hVar;
        hVar.i(bArr, i12, i13);
        int i14 = 2;
        this.f13201f = new p[this.f13202g * 2];
        char[] cArr = new char[bVar.f13014g];
        int i15 = 1;
        boolean z10 = false;
        while (i15 < this.f13202g) {
            int i16 = iArr[i15];
            byte b11 = bArr[i16 - 1];
            switch (b11) {
                case 1:
                    b10 = b11;
                    i11 = i15;
                    String t10 = bVar.t(i11, cArr);
                    i10 = 1;
                    a(new p(t10, i11, 1, Integer.MAX_VALUE & (t10.hashCode() + 1)));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    b10 = b11;
                    i11 = i15;
                    int k10 = bVar.k(i16);
                    a(new p(i11, b10, k10, (b10 + k10) & Integer.MAX_VALUE));
                    i10 = 1;
                    break;
                case 5:
                case 6:
                    b10 = b11;
                    i11 = i15;
                    long l10 = bVar.l(i16);
                    a(new p(i11, b10, l10, (b10 + ((int) l10) + ((int) (l10 >>> 32))) & Integer.MAX_VALUE));
                    i10 = 1;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    b10 = b11;
                    i11 = i15;
                    String r10 = bVar.r(i16, cArr);
                    a(new p(r10, i11, b10, Integer.MAX_VALUE & (r10.hashCode() + b10)));
                    i10 = 1;
                    break;
                case 9:
                case 10:
                case 11:
                    b10 = b11;
                    int i17 = iArr[bVar.s(i16 + 2)];
                    String o10 = bVar.o(i16, cArr);
                    String r11 = bVar.r(i17, cArr);
                    String r12 = bVar.r(i17 + i14, cArr);
                    i11 = i15;
                    a(new p(i15, b10, o10, r11, r12, 0L, ((r12.hashCode() * r11.hashCode() * o10.hashCode()) + b10) & Integer.MAX_VALUE));
                    i10 = 1;
                    break;
                case 12:
                    b10 = b11;
                    int i18 = i15;
                    String r13 = bVar.r(i16, cArr);
                    String r14 = bVar.r(i16 + 2, cArr);
                    a(new p(i18, r13, r14, Integer.MAX_VALUE & ((r14.hashCode() * r13.hashCode()) + 12)));
                    i11 = i18;
                    i10 = 1;
                    break;
                case 15:
                    b10 = b11;
                    int i19 = i15;
                    int i20 = iArr[bVar.s(i16 + 1)];
                    int i21 = iArr[bVar.s(i20 + 2)];
                    int f6 = bVar.f(i16);
                    String o11 = bVar.o(i20, cArr);
                    String r15 = bVar.r(i21, cArr);
                    String r16 = bVar.r(i21 + i14, cArr);
                    a(new p(i19, 15, o11, r15, r16, f6, ((r16.hashCode() * r15.hashCode() * o11.hashCode() * f6) + 15) & Integer.MAX_VALUE));
                    i11 = i19;
                    i10 = 1;
                    break;
                case 17:
                case 18:
                    int i22 = iArr[bVar.s(i16 + 2)];
                    String r17 = bVar.r(i22, cArr);
                    String r18 = bVar.r(i22 + i14, cArr);
                    int s10 = bVar.s(i16);
                    b10 = b11;
                    a(new p(i15, b11, null, r17, r18, s10, (((s10 + 1) * r18.hashCode() * r17.hashCode()) + b11) & Integer.MAX_VALUE));
                    i11 = i15;
                    i10 = 1;
                    z10 = true;
                    break;
            }
            i15 = i11 + ((b10 == 5 || b10 == 6) ? 2 : i10);
            i14 = 2;
        }
        if (z10) {
            int c10 = bVar.c();
            int s11 = bVar.s(c10 - 2);
            while (true) {
                if (s11 > 0) {
                    if ("BootstrapMethods".equals(bVar.r(c10, cArr))) {
                        this.f13204i = bVar.s(c10 + 6);
                    } else {
                        c10 += bVar.k(c10 + 2) + 6;
                        s11--;
                    }
                }
            }
            if (this.f13204i <= 0) {
                return;
            }
            int i23 = c10 + 8;
            int k11 = bVar.k(c10 + 2) - 2;
            I5.h hVar2 = new I5.h(k11);
            this.f13205j = hVar2;
            hVar2.i(bVar.f13009b, i23, k11);
            int i24 = i23;
            for (int i25 = 0; i25 < this.f13204i; i25++) {
                int i26 = i24 - i23;
                int s12 = bVar.s(i24);
                int s13 = bVar.s(i24 + 2);
                i24 += 4;
                int hashCode = bVar.h(s12, cArr).hashCode();
                while (true) {
                    int i27 = s13 - 1;
                    if (s13 > 0) {
                        int s14 = bVar.s(i24);
                        i24 += 2;
                        hashCode ^= bVar.h(s14, cArr).hashCode();
                        s13 = i27;
                    }
                }
                a(new p(i25, 64, i26, hashCode & Integer.MAX_VALUE));
            }
        }
    }

    public final void a(p pVar) {
        this.f13200e++;
        p[] pVarArr = this.f13201f;
        int length = pVar.f13194h % pVarArr.length;
        pVar.f13195i = pVarArr[length];
        pVarArr[length] = pVar;
    }

    public final p b(j jVar, Object... objArr) {
        I5.h hVar = this.f13205j;
        if (hVar == null) {
            hVar = new I5.h();
            this.f13205j = hVar;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = c(objArr[i10]).f13187a;
        }
        int i11 = hVar.f8084c;
        hVar.k(h(jVar.f13090a, jVar.f13091b, jVar.f13092c, jVar.f13093d, jVar.f13094e).f13187a);
        hVar.k(length);
        for (int i12 = 0; i12 < length; i12++) {
            hVar.k(iArr[i12]);
        }
        int i13 = hVar.f8084c - i11;
        int hashCode = jVar.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        int i14 = hashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f13205j.f8083b;
        for (p o10 = o(i14); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 64 && o10.f13194h == i14) {
                int i15 = (int) o10.f13192f;
                for (int i16 = 0; i16 < i13; i16++) {
                    if (bArr[i11 + i16] != bArr[i15 + i16]) {
                        break;
                    }
                }
                this.f13205j.f8084c = i11;
                return o10;
            }
        }
        int i17 = this.f13204i;
        this.f13204i = i17 + 1;
        p pVar = new p(i17, 64, i11, i14);
        p(pVar);
        return pVar;
    }

    public final p c(Object obj) {
        if (obj instanceof Integer) {
            return e(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return e(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return e(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return e(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return e(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return e(4, Float.floatToRawIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return f(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(6, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof String) {
            return k(8, (String) obj);
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            int s10 = rVar.s();
            if (s10 == 10) {
                return k(7, rVar.j());
            }
            if (s10 == 11) {
                return k(16, rVar.h());
            }
            return k(7, rVar.h());
        } else if (obj instanceof j) {
            j jVar = (j) obj;
            return h(jVar.f13090a, jVar.f13091b, jVar.f13092c, jVar.f13093d, jVar.f13094e);
        } else if (obj instanceof e) {
            e eVar = (e) obj;
            return d(eVar.f13047a, 17, b(eVar.f13049c, eVar.f13050d).f13187a, eVar.f13048b);
        } else {
            throw new IllegalArgumentException("value " + obj);
        }
    }

    public final p d(String str, int i10, int i11, String str2) {
        int hashCode = (((i11 + 1) * str2.hashCode() * str.hashCode()) + i10) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == i10 && o10.f13194h == hashCode && o10.f13192f == i11 && o10.f13190d.equals(str) && o10.f13191e.equals(str2)) {
                return o10;
            }
        }
        this.f13203h.g(i10, i11, i(str, str2));
        int i12 = this.f13202g;
        this.f13202g = i12 + 1;
        p pVar = new p(i12, i10, null, str, str2, i11, hashCode);
        p(pVar);
        return pVar;
    }

    public final p e(int i10, int i11) {
        int i12 = (i10 + i11) & Integer.MAX_VALUE;
        for (p o10 = o(i12); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == i10 && o10.f13194h == i12 && o10.f13192f == i11) {
                return o10;
            }
        }
        I5.h hVar = this.f13203h;
        hVar.h(i10);
        hVar.j(i11);
        int i13 = this.f13202g;
        this.f13202g = i13 + 1;
        p pVar = new p(i13, i10, i11, i12);
        p(pVar);
        return pVar;
    }

    public final p f(int i10, long j6) {
        int i11 = (int) j6;
        int i12 = (int) (j6 >>> 32);
        int i13 = (i10 + i11 + i12) & Integer.MAX_VALUE;
        for (p o10 = o(i13); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == i10 && o10.f13194h == i13 && o10.f13192f == j6) {
                return o10;
            }
        }
        int i14 = this.f13202g;
        I5.h hVar = this.f13203h;
        hVar.h(i10);
        int i15 = hVar.f8084c;
        int i16 = i15 + 8;
        if (i16 > hVar.f8083b.length) {
            hVar.b(8);
        }
        byte[] bArr = hVar.f8083b;
        bArr[i15] = (byte) (i12 >>> 24);
        bArr[i15 + 1] = (byte) (i12 >>> 16);
        bArr[i15 + 2] = (byte) (i12 >>> 8);
        bArr[i15 + 3] = (byte) i12;
        bArr[i15 + 4] = (byte) (i11 >>> 24);
        bArr[i15 + 5] = (byte) (i11 >>> 16);
        bArr[i15 + 6] = (byte) (i11 >>> 8);
        bArr[i15 + 7] = (byte) i11;
        hVar.f8084c = i16;
        this.f13202g += 2;
        p pVar = new p(i14, i10, j6, i13);
        p(pVar);
        return pVar;
    }

    public final p g(String str, int i10, String str2, String str3) {
        int hashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i10) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == i10 && o10.f13194h == hashCode && o10.f13189c.equals(str) && o10.f13190d.equals(str2) && o10.f13191e.equals(str3)) {
                return o10;
            }
        }
        p k10 = k(7, str);
        this.f13203h.g(i10, k10.f13187a, i(str2, str3));
        int i11 = this.f13202g;
        this.f13202g = i11 + 1;
        p pVar = new p(i11, i10, str, str2, str3, 0L, hashCode);
        p(pVar);
        return pVar;
    }

    public final p h(int i10, String str, String str2, String str3, boolean z10) {
        int i11;
        int hashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode() * i10) + 15) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 15 && o10.f13194h == hashCode && o10.f13192f == i10 && o10.f13189c.equals(str) && o10.f13190d.equals(str2) && o10.f13191e.equals(str3)) {
                return o10;
            }
        }
        I5.h hVar = this.f13203h;
        if (i10 <= 4) {
            hVar.e(i10, g(str, 9, str2, str3).f13187a);
        } else {
            if (z10) {
                i11 = 11;
            } else {
                i11 = 10;
            }
            hVar.e(i10, g(str, i11, str2, str3).f13187a);
        }
        int i12 = this.f13202g;
        this.f13202g = i12 + 1;
        p pVar = new p(i12, 15, str, str2, str3, i10, hashCode);
        p(pVar);
        return pVar;
    }

    public final int i(String str, String str2) {
        int hashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 12 && o10.f13194h == hashCode && o10.f13190d.equals(str) && o10.f13191e.equals(str2)) {
                return o10.f13187a;
            }
        }
        this.f13203h.g(12, j(str), j(str2));
        int i10 = this.f13202g;
        this.f13202g = i10 + 1;
        p(new p(i10, str, str2, hashCode));
        return i10;
    }

    public final int j(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 1 && o10.f13194h == hashCode && o10.f13191e.equals(str)) {
                return o10.f13187a;
            }
        }
        I5.h hVar = this.f13203h;
        hVar.h(1);
        int length = str.length();
        if (length <= 65535) {
            int i10 = hVar.f8084c;
            int i11 = i10 + 2;
            if (i11 + length > hVar.f8083b.length) {
                hVar.b(length + 2);
            }
            byte[] bArr = hVar.f8083b;
            bArr[i10] = (byte) (length >>> 8);
            bArr[i10 + 1] = (byte) length;
            int i12 = 0;
            while (i12 < length) {
                char charAt = str.charAt(i12);
                if (charAt >= 1 && charAt <= '\u007f') {
                    bArr[i11] = (byte) charAt;
                    i12++;
                    i11++;
                } else {
                    hVar.f8084c = i11;
                    hVar.a(i12, 65535, str);
                    break;
                }
            }
            hVar.f8084c = i11;
            int i13 = this.f13202g;
            this.f13202g = i13 + 1;
            p(new p(str, i13, 1, hashCode));
            return i13;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public final p k(int i10, String str) {
        int hashCode = (str.hashCode() + i10) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == i10 && o10.f13194h == hashCode && o10.f13191e.equals(str)) {
                return o10;
            }
        }
        this.f13203h.f(i10, j(str));
        int i11 = this.f13202g;
        this.f13202g = i11 + 1;
        p pVar = new p(str, i11, i10, hashCode);
        p(pVar);
        return pVar;
    }

    public final int l(String str) {
        int hashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 128 && o10.f13194h == hashCode && o10.f13191e.equals(str)) {
                return o10.f13187a;
            }
        }
        return m(new p(str, this.f13206k, 128, hashCode));
    }

    public final int m(p pVar) {
        if (this.f13207l == null) {
            this.f13207l = new p[16];
        }
        int i10 = this.f13206k;
        p[] pVarArr = this.f13207l;
        if (i10 == pVarArr.length) {
            p[] pVarArr2 = new p[pVarArr.length * 2];
            System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            this.f13207l = pVarArr2;
        }
        p[] pVarArr3 = this.f13207l;
        int i11 = this.f13206k;
        this.f13206k = i11 + 1;
        pVarArr3[i11] = pVar;
        p(pVar);
        return pVar.f13187a;
    }

    public final int n(int i10, String str) {
        int hashCode = (str.hashCode() + 129 + i10) & Integer.MAX_VALUE;
        for (p o10 = o(hashCode); o10 != null; o10 = o10.f13195i) {
            if (o10.f13188b == 129 && o10.f13194h == hashCode && o10.f13192f == i10 && o10.f13191e.equals(str)) {
                return o10.f13187a;
            }
        }
        return m(new p(this.f13206k, 129, str, i10, hashCode));
    }

    public final p o(int i10) {
        p[] pVarArr = this.f13201f;
        return pVarArr[i10 % pVarArr.length];
    }

    public final void p(p pVar) {
        int i10 = this.f13200e;
        p[] pVarArr = this.f13201f;
        if (i10 > (pVarArr.length * 3) / 4) {
            int length = pVarArr.length;
            int i11 = (length * 2) + 1;
            p[] pVarArr2 = new p[i11];
            for (int i12 = length - 1; i12 >= 0; i12--) {
                p pVar2 = this.f13201f[i12];
                while (pVar2 != null) {
                    int i13 = pVar2.f13194h % i11;
                    p pVar3 = pVar2.f13195i;
                    pVar2.f13195i = pVarArr2[i13];
                    pVarArr2[i13] = pVar2;
                    pVar2 = pVar3;
                }
            }
            this.f13201f = pVarArr2;
        }
        this.f13200e++;
        p[] pVarArr3 = this.f13201f;
        int length2 = pVar.f13194h % pVarArr3.length;
        pVar.f13195i = pVarArr3[length2];
        pVarArr3[length2] = pVar;
    }

    public q(d dVar) {
        this.f13196a = dVar;
        this.f13197b = null;
        this.f13201f = new p[256];
        this.f13202g = 1;
        this.f13203h = new I5.h();
    }
}
