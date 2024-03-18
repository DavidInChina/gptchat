package Nh;

import N.C1025i;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public k f13081a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f13082b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f13083c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f13084d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13085e;

    /* renamed from: f  reason: collision with root package name */
    public short f13086f;

    /* renamed from: g  reason: collision with root package name */
    public short f13087g;

    /* renamed from: h  reason: collision with root package name */
    public int f13088h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f13089i;

    public i(k kVar) {
        this.f13081a = kVar;
    }

    public static int c(q qVar, Object obj) {
        int m10;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return d(qVar, r.o((String) obj).h(), 0);
        }
        k kVar = (k) obj;
        if ((kVar.f13096a & 4) != 0) {
            return qVar.n(kVar.f13099d, "") | 12582912;
        }
        if (qVar.f13210o == null) {
            qVar.f13210o = new C1025i[16];
            qVar.f13209n = new C1025i[16];
        }
        int identityHashCode = System.identityHashCode(kVar);
        C1025i[] c1025iArr = qVar.f13210o;
        C1025i c1025i = c1025iArr[identityHashCode % c1025iArr.length];
        while (c1025i != null && ((k) c1025i.f12351h0) != kVar) {
            c1025i = (C1025i) c1025i.f12352i0;
        }
        if (c1025i == null) {
            int i10 = qVar.f13208m;
            C1025i[] c1025iArr2 = qVar.f13210o;
            if (i10 > (c1025iArr2.length * 3) / 4) {
                int length = c1025iArr2.length;
                int i11 = (length * 2) + 1;
                C1025i[] c1025iArr3 = new C1025i[i11];
                for (int i12 = length - 1; i12 >= 0; i12--) {
                    for (C1025i c1025i2 = qVar.f13210o[i12]; c1025i2 != null; c1025i2 = (C1025i) c1025i2.f12352i0) {
                        int identityHashCode2 = System.identityHashCode((k) c1025i2.f12351h0) % i11;
                        c1025i2.f12352i0 = c1025iArr3[identityHashCode2];
                        c1025iArr3[identityHashCode2] = c1025i2;
                    }
                }
                qVar.f13210o = c1025iArr3;
            }
            int i13 = qVar.f13208m;
            C1025i[] c1025iArr4 = qVar.f13209n;
            if (i13 == c1025iArr4.length) {
                C1025i[] c1025iArr5 = new C1025i[c1025iArr4.length * 2];
                System.arraycopy(c1025iArr4, 0, c1025iArr5, 0, c1025iArr4.length);
                qVar.f13209n = c1025iArr5;
            }
            int i14 = qVar.f13208m;
            c1025i = new C1025i(i14, kVar);
            C1025i[] c1025iArr6 = qVar.f13210o;
            int length2 = identityHashCode % c1025iArr6.length;
            c1025i.f12352i0 = c1025iArr6[length2];
            c1025iArr6[length2] = c1025i;
            C1025i[] c1025iArr7 = qVar.f13209n;
            qVar.f13208m = i14 + 1;
            c1025iArr7[i14] = c1025i;
        }
        int i15 = c1025i.f12350Z;
        int i16 = (130 + i15) & Integer.MAX_VALUE;
        p o10 = qVar.o(i16);
        while (true) {
            if (o10 != null) {
                if (o10.f13188b == 130 && o10.f13194h == i16 && o10.f13192f == i15 && o10.f13191e.equals("")) {
                    m10 = o10.f13187a;
                    break;
                }
                o10 = o10.f13195i;
            } else {
                m10 = qVar.m(new p(qVar.f13206k, 130, "", i15, i16));
                break;
            }
        }
        return m10 | 16777216;
    }

    public static int d(q qVar, String str, int i10) {
        char charAt = str.charAt(i10);
        int i11 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt != 'L') {
            if (charAt != 'S') {
                if (charAt != 'V') {
                    if (charAt != 'I') {
                        if (charAt == 'J') {
                            return 4194308;
                        }
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                    case 'C':
                                        break;
                                    case 'D':
                                        return 4194307;
                                    default:
                                        throw new IllegalArgumentException("Invalid descriptor: " + str.substring(i10));
                                }
                            } else {
                                int i12 = i10 + 1;
                                while (str.charAt(i12) == '[') {
                                    i12++;
                                }
                                char charAt2 = str.charAt(i12);
                                if (charAt2 != 'F') {
                                    if (charAt2 != 'L') {
                                        if (charAt2 != 'S') {
                                            if (charAt2 != 'Z') {
                                                if (charAt2 != 'I') {
                                                    if (charAt2 != 'J') {
                                                        switch (charAt2) {
                                                            case 'B':
                                                                i11 = 4194314;
                                                                break;
                                                            case 'C':
                                                                i11 = 4194315;
                                                                break;
                                                            case 'D':
                                                                i11 = 4194307;
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException("Invalid descriptor fragment: " + str.substring(i12));
                                                        }
                                                    } else {
                                                        i11 = 4194308;
                                                    }
                                                } else {
                                                    i11 = 4194305;
                                                }
                                            } else {
                                                i11 = 4194313;
                                            }
                                        } else {
                                            i11 = 4194316;
                                        }
                                    } else {
                                        i11 = qVar.l(str.substring(i12 + 1, str.length() - 1)) | 8388608;
                                    }
                                }
                                return ((i12 - i10) << 26) | i11;
                            }
                        }
                    }
                } else {
                    return 0;
                }
            }
            return 4194305;
        }
        return qVar.l(str.substring(i10 + 1, str.length() - 1)) | 8388608;
    }

    public static boolean h(q qVar, int i10, int[] iArr, int i11) {
        int min;
        int l10;
        long j6;
        long j10;
        int i12;
        int i13 = i10;
        int i14 = iArr[i11];
        if (i14 == i13) {
            return false;
        }
        if ((67108863 & i13) == 4194309) {
            if (i14 == 4194309) {
                return false;
            }
            i13 = 4194309;
        }
        if (i14 == 0) {
            iArr[i11] = i13;
            return true;
        }
        int i15 = i14 & (-67108864);
        int i16 = 4194304;
        if (i15 == 0 && (i14 & 62914560) != 8388608) {
            if (i14 == 4194309) {
                if ((i13 & (-67108864)) == 0 && (i13 & 62914560) != 8388608) {
                    i13 = 4194304;
                }
                i16 = i13;
            }
        } else if (i13 == 4194309) {
            return false;
        } else {
            if ((i13 & (-4194304)) == ((-4194304) & i14)) {
                if ((i14 & 62914560) == 8388608) {
                    int i17 = (i13 & (-67108864)) | 8388608;
                    int i18 = i13 & 1048575;
                    int i19 = 1048575 & i14;
                    qVar.getClass();
                    if (i18 < i19) {
                        j6 = i18;
                        j10 = i19;
                    } else {
                        j6 = i19;
                        j10 = i18;
                    }
                    long j11 = j6 | (j10 << 32);
                    int i20 = (i18 + i19 + 131) & Integer.MAX_VALUE;
                    p o10 = qVar.o(i20);
                    while (true) {
                        if (o10 != null) {
                            if (o10.f13188b == 131 && o10.f13194h == i20 && o10.f13192f == j11) {
                                i12 = o10.f13193g;
                                break;
                            }
                            o10 = o10.f13195i;
                        } else {
                            p[] pVarArr = qVar.f13207l;
                            int l11 = qVar.l(qVar.f13196a.A(pVarArr[i18].f13191e, pVarArr[i19].f13191e));
                            p pVar = new p(qVar.f13206k, 131, j11, i20);
                            qVar.p(pVar);
                            pVar.f13193g = l11;
                            i12 = l11;
                            break;
                        }
                    }
                    i16 = i17 | i12;
                } else {
                    min = ((i13 & (-67108864)) - 67108864) | 8388608;
                    l10 = qVar.l("java/lang/Object");
                    i16 = min | l10;
                }
            } else {
                int i21 = i13 & (-67108864);
                if (i21 != 0 || (i13 & 62914560) == 8388608) {
                    if (i21 != 0 && (i13 & 62914560) != 8388608) {
                        i21 -= 67108864;
                    }
                    if (i15 != 0 && (i14 & 62914560) != 8388608) {
                        i15 -= 67108864;
                    }
                    min = Math.min(i21, i15) | 8388608;
                    l10 = qVar.l("java/lang/Object");
                    i16 = min | l10;
                }
            }
        }
        if (i16 == i14) {
            return false;
        }
        iArr[i11] = i16;
        return true;
    }

    public final void a(m mVar) {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f13082b;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = 1;
            if (i14 >= iArr.length) {
                break;
            }
            int i18 = iArr[i14];
            if (i18 == 4194308 || i18 == 4194307) {
                i17 = 2;
            }
            i14 += i17;
            if (i18 == 4194304) {
                i16++;
            } else {
                i15 += i16 + 1;
                i16 = 0;
            }
        }
        int[] iArr2 = this.f13083c;
        int i19 = 0;
        int i20 = 0;
        while (i19 < iArr2.length) {
            int i21 = iArr2[i19];
            if (i21 != 4194308 && i21 != 4194307) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            i19 += i12;
            i20++;
        }
        mVar.O(this.f13081a.f13099d, i15, i20);
        int i22 = 3;
        int i23 = 0;
        while (true) {
            int i24 = i15 - 1;
            if (i15 > 0) {
                int i25 = iArr[i23];
                if (i25 != 4194308 && i25 != 4194307) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                i23 += i11;
                mVar.f13137a1[i22] = i25;
                i15 = i24;
                i22++;
            }
        }
        while (true) {
            int i26 = i20 - 1;
            if (i20 > 0) {
                int i27 = iArr2[i13];
                if (i27 != 4194308 && i27 != 4194307) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                i13 += i10;
                mVar.f13137a1[i22] = i27;
                i22++;
                i20 = i26;
            } else {
                mVar.N();
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int r18, int r19, Nh.p r20, Nh.q r21) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.i.b(int, int, Nh.p, Nh.q):void");
    }

    public final int e(int i10, int i11) {
        int i12 = (-67108864) & i10;
        int i13 = 62914560 & i10;
        if (i13 == 20971520) {
            int i14 = i12 + this.f13082b[i10 & 1048575];
            if ((i10 & 1048576) != 0 && (i14 == 4194308 || i14 == 4194307)) {
                return 4194304;
            }
            return i14;
        } else if (i13 == 25165824) {
            int i15 = i12 + this.f13083c[i11 - (i10 & 1048575)];
            if ((i10 & 1048576) != 0 && (i15 == 4194308 || i15 == 4194307)) {
                return 4194304;
            }
            return i15;
        } else {
            return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[LOOP:0: B:9:0x0011->B:25:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(q qVar, int i10) {
        int l10;
        int i11;
        int i12;
        if (i10 == 4194310 || (i12 = (-4194304) & i10) == 12582912 || i12 == 16777216) {
            for (int i13 = 0; i13 < this.f13088h; i13++) {
                int i14 = this.f13089i[i13];
                int i15 = (-67108864) & i14;
                int i16 = 62914560 & i14;
                int i17 = i14 & 1048575;
                if (i16 == 20971520) {
                    i11 = this.f13082b[i17];
                } else {
                    if (i16 == 25165824) {
                        int[] iArr = this.f13083c;
                        i11 = iArr[iArr.length - i17];
                    }
                    if (i10 != i14) {
                        if (i10 == 4194310) {
                            l10 = qVar.l(qVar.f13199d);
                        } else {
                            l10 = qVar.l(qVar.f13207l[i10 & 1048575].f13191e);
                        }
                        return l10 | 8388608;
                    }
                }
                i14 = i11 + i15;
                if (i10 != i14) {
                }
            }
        }
        return i10;
    }

    public final int g(int i10) {
        int[] iArr = this.f13084d;
        if (iArr != null && i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                int i12 = i10 | 20971520;
                iArr[i10] = i12;
                return i12;
            }
            return i11;
        }
        return i10 | 20971520;
    }

    public final boolean i(q qVar, i iVar, int i10) {
        boolean z10;
        int i11;
        int length = this.f13082b.length;
        int length2 = this.f13083c.length;
        boolean z11 = true;
        if (iVar.f13082b == null) {
            iVar.f13082b = new int[length];
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int[] iArr = this.f13084d;
            if (iArr != null && i12 < iArr.length) {
                int i13 = iArr[i12];
                if (i13 == 0) {
                    i11 = this.f13082b[i12];
                } else {
                    i11 = e(i13, length2);
                }
            } else {
                i11 = this.f13082b[i12];
            }
            if (this.f13089i != null) {
                i11 = f(qVar, i11);
            }
            z10 |= h(qVar, i11, iVar.f13082b, i12);
        }
        if (i10 > 0) {
            for (int i14 = 0; i14 < length; i14++) {
                z10 |= h(qVar, this.f13082b[i14], iVar.f13082b, i14);
            }
            if (iVar.f13083c == null) {
                iVar.f13083c = new int[1];
            } else {
                z11 = z10;
            }
            return h(qVar, i10, iVar.f13083c, 0) | z11;
        }
        int length3 = this.f13083c.length + this.f13086f;
        if (iVar.f13083c == null) {
            iVar.f13083c = new int[this.f13087g + length3];
        } else {
            z11 = z10;
        }
        for (int i15 = 0; i15 < length3; i15++) {
            int i16 = this.f13083c[i15];
            if (this.f13089i != null) {
                i16 = f(qVar, i16);
            }
            z11 |= h(qVar, i16, iVar.f13083c, i15);
        }
        for (int i17 = 0; i17 < this.f13087g; i17++) {
            int e10 = e(this.f13085e[i17], length2);
            if (this.f13089i != null) {
                e10 = f(qVar, e10);
            }
            z11 |= h(qVar, e10, iVar.f13083c, length3 + i17);
        }
        return z11;
    }

    public final int j() {
        short s10 = this.f13087g;
        if (s10 > 0) {
            int[] iArr = this.f13085e;
            short s11 = (short) (s10 - 1);
            this.f13087g = s11;
            return iArr[s11];
        }
        short s12 = (short) (this.f13086f - 1);
        this.f13086f = s12;
        return (-s12) | 25165824;
    }

    public final void k(int i10) {
        short s10 = this.f13087g;
        if (s10 >= i10) {
            this.f13087g = (short) (s10 - i10);
            return;
        }
        this.f13086f = (short) (this.f13086f - (i10 - s10));
        this.f13087g = (short) 0;
    }

    public final void l(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            k((r.e(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            k(1);
        } else {
            k(2);
        }
    }

    public final void m(int i10) {
        if (this.f13085e == null) {
            this.f13085e = new int[10];
        }
        int length = this.f13085e.length;
        short s10 = this.f13087g;
        if (s10 >= length) {
            int[] iArr = new int[Math.max(s10 + 1, length * 2)];
            System.arraycopy(this.f13085e, 0, iArr, 0, length);
            this.f13085e = iArr;
        }
        int[] iArr2 = this.f13085e;
        short s11 = this.f13087g;
        short s12 = (short) (s11 + 1);
        this.f13087g = s12;
        iArr2[s11] = i10;
        short s13 = (short) (this.f13086f + s12);
        k kVar = this.f13081a;
        if (s13 > kVar.f13103h) {
            kVar.f13103h = s13;
        }
    }

    public final void n(q qVar, String str) {
        int i10 = 0;
        if (str.charAt(0) == '(') {
            i10 = r.q(str);
        }
        int d10 = d(qVar, str, i10);
        if (d10 != 0) {
            m(d10);
            if (d10 == 4194308 || d10 == 4194307) {
                m(4194304);
            }
        }
    }

    public final void o(q qVar, int i10, String str, int i11) {
        int i12;
        int[] iArr = new int[i11];
        this.f13082b = iArr;
        this.f13083c = new int[0];
        if ((i10 & 8) == 0) {
            i12 = 1;
            if ((i10 & 262144) == 0) {
                iArr[0] = qVar.l(qVar.f13199d) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i12 = 0;
        }
        for (r rVar : r.d(str)) {
            int d10 = d(qVar, rVar.h(), 0);
            int[] iArr2 = this.f13082b;
            int i13 = i12 + 1;
            iArr2[i12] = d10;
            if (d10 != 4194308 && d10 != 4194307) {
                i12 = i13;
            } else {
                i12 += 2;
                iArr2[i13] = 4194304;
            }
        }
        while (i12 < i11) {
            this.f13082b[i12] = 4194304;
            i12++;
        }
    }

    public final void p(int i10, int i11) {
        if (this.f13084d == null) {
            this.f13084d = new int[10];
        }
        int length = this.f13084d.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.f13084d, 0, iArr, 0, length);
            this.f13084d = iArr;
        }
        this.f13084d[i10] = i11;
    }
}
