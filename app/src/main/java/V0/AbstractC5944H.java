package v0;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import r0.C5347k;

/* renamed from: v0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5944H {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f46870a = 0;

    static {
        int i10 = r0.r.f44264l;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0168 -> B:74:0x0169). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(String str) {
        int i10;
        int i11;
        char charAt;
        ArrayList arrayList;
        int i12;
        int i13;
        char c10;
        char c11;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float[] fArr;
        int i14;
        char c12;
        long j6;
        int i15;
        long j10;
        float intBitsToFloat;
        boolean z14;
        char c13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j11;
        boolean z15;
        String substring;
        String substring2;
        long j12;
        long floatToRawIntBits;
        long j13;
        long j14;
        long j15;
        float f6;
        int floatToRawIntBits2;
        float f10;
        char c14;
        char c15;
        boolean z16;
        int i23;
        char c16;
        int i24;
        long j16;
        int floatToRawIntBits3;
        String str2 = str;
        if (str2 == null) {
            return kf.v.f37483Y;
        }
        ArrayList arrayList3 = new ArrayList();
        float[] fArr2 = new float[64];
        arrayList3.clear();
        int length = str.length();
        int i25 = 0;
        while (true) {
            i10 = 32;
            if (i25 >= length || AbstractC3557B.e0(str2.charAt(i25), 32) > 0) {
                break;
            }
            i25++;
        }
        while (length > i25 && AbstractC3557B.e0(str2.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i26 = 0;
        while (i25 < length) {
            while (true) {
                i11 = i25 + 1;
                charAt = str2.charAt(i25);
                int i27 = charAt | ' ';
                if ((i27 - 122) * (i27 - 97) <= 0 && i27 != 101) {
                    break;
                } else if (i11 >= length) {
                    charAt = 0;
                    break;
                } else {
                    str2 = str;
                    i25 = i11;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i26 = 0;
                    while (true) {
                        if (i11 < length && AbstractC3557B.e0(str2.charAt(i11), i10) <= 0) {
                            i11++;
                        } else {
                            if (i11 == length) {
                                c12 = charAt;
                                j16 = i11 << i10;
                                floatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                            } else {
                                c12 = charAt;
                                char charAt2 = str2.charAt(i11);
                                if (charAt2 == '-') {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i16 = i11 + 1;
                                    if (i16 == length) {
                                        j16 = i16 << i10;
                                        floatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                    } else {
                                        c13 = str2.charAt(i16);
                                        if (((char) (c13 - '0')) >= '\n' && c13 != '.') {
                                            j16 = i16 << i10;
                                            floatToRawIntBits3 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                    }
                                } else {
                                    c13 = charAt2;
                                    i16 = i11;
                                }
                                int length2 = str.length();
                                long j17 = 0;
                                int i28 = i16;
                                long j18 = 0;
                                while (i28 != length) {
                                    int i29 = c13 - '0';
                                    if (((char) i29) >= '\n') {
                                        break;
                                    }
                                    j18 = (j18 * 10) + i29;
                                    i28++;
                                    if (i28 < length2) {
                                        c13 = str2.charAt(i28);
                                    } else {
                                        c13 = 0;
                                    }
                                }
                                int i30 = i28 - i16;
                                if (i28 != length && c13 == '.') {
                                    int i31 = i28 + 1;
                                    i18 = i31;
                                    while (true) {
                                        if (length - i18 >= 4) {
                                            i14 = i26;
                                            i23 = i30;
                                            long charAt3 = str2.charAt(i18) | (str2.charAt(i18 + 1) << 16) | (str2.charAt(i18 + 2) << 32) | (str2.charAt(i18 + 3) << 48);
                                            long j19 = charAt3 - 13511005043687472L;
                                            if ((((charAt3 + 19703549022044230L) | j19) & (-35747867511423104L)) != 0) {
                                                i24 = -1;
                                            } else {
                                                i24 = (int) ((j19 * 281475406208040961L) >>> 48);
                                            }
                                            if (i24 < 0) {
                                                break;
                                            }
                                            j18 = (j18 * 10000) + i24;
                                            i18 += 4;
                                            i26 = i14;
                                            i30 = i23;
                                        } else {
                                            i14 = i26;
                                            i23 = i30;
                                            break;
                                        }
                                    }
                                    if (i18 < length2) {
                                        c16 = str2.charAt(i18);
                                        while (i18 != length) {
                                            int i32 = c16 - '0';
                                            if (((char) i32) >= '\n') {
                                                break;
                                            }
                                            j18 = (j18 * 10) + i32;
                                            i18++;
                                            if (i18 < length2) {
                                                c16 = str2.charAt(i18);
                                            }
                                        }
                                        i19 = i31 - i18;
                                        i17 = i23 - i19;
                                        c13 = c16;
                                        i20 = i31;
                                    }
                                    c16 = 0;
                                    while (i18 != length) {
                                    }
                                    i19 = i31 - i18;
                                    i17 = i23 - i19;
                                    c13 = c16;
                                    i20 = i31;
                                } else {
                                    i14 = i26;
                                    i20 = i28;
                                    i18 = i20;
                                    i17 = i30;
                                    i19 = 0;
                                }
                                if (i17 == 0) {
                                    arrayList = arrayList3;
                                    fArr = fArr2;
                                    j10 = (i18 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                    i15 = 32;
                                    j6 = 4294967295L;
                                    i13 = length;
                                } else {
                                    if ((c13 | ' ') == 101) {
                                        i22 = i18 + 1;
                                        if (i22 < length2) {
                                            c14 = str2.charAt(i22);
                                            c15 = '-';
                                        } else {
                                            c15 = '-';
                                            c14 = 0;
                                        }
                                        if (c14 == c15) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16 || c14 == '+') {
                                            i22 = i18 + 2;
                                        }
                                        char charAt4 = str2.charAt(i22);
                                        i21 = 0;
                                        while (true) {
                                            if (i22 != length) {
                                                int i33 = charAt4 - '0';
                                                arrayList = arrayList3;
                                                fArr = fArr2;
                                                if (((char) i33) >= '\n') {
                                                    break;
                                                }
                                                if (i21 < 1024) {
                                                    i21 = (i21 * 10) + i33;
                                                }
                                                i22++;
                                                if (i22 < length2) {
                                                    charAt4 = str2.charAt(i22);
                                                } else {
                                                    charAt4 = 0;
                                                }
                                                arrayList3 = arrayList;
                                                fArr2 = fArr;
                                            } else {
                                                arrayList = arrayList3;
                                                fArr = fArr2;
                                                break;
                                            }
                                        }
                                        if (z16) {
                                            i21 = -i21;
                                        }
                                        i19 += i21;
                                    } else {
                                        arrayList = arrayList3;
                                        fArr = fArr2;
                                        i22 = i18;
                                        i21 = 0;
                                    }
                                    int i34 = 19;
                                    if (i17 > 19) {
                                        char charAt5 = str2.charAt(i16);
                                        int i35 = i16;
                                        while (true) {
                                            if (i22 == length) {
                                                break;
                                            }
                                            if (charAt5 != '0' && charAt5 != '.') {
                                                i34 = 19;
                                                break;
                                            }
                                            if (charAt5 == '0') {
                                                i17--;
                                            }
                                            i35++;
                                            if (i35 < length2) {
                                                charAt5 = str2.charAt(i35);
                                            } else {
                                                charAt5 = 0;
                                            }
                                            i34 = 19;
                                        }
                                        if (i17 > i34) {
                                            char charAt6 = str2.charAt(i16);
                                            long j20 = 0;
                                            while (true) {
                                                i13 = length;
                                                if (i16 == i28 || Long.compare(j20 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                    break;
                                                }
                                                j20 = (j20 * 10) + (charAt6 - '0');
                                                i16++;
                                                if (i16 < length2) {
                                                    charAt6 = str2.charAt(i16);
                                                } else {
                                                    charAt6 = 0;
                                                }
                                                length = i13;
                                            }
                                            if (Long.compare(j20 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i19 = (i28 - i16) + i21;
                                            } else {
                                                char charAt7 = str2.charAt(i20);
                                                int i36 = i20;
                                                while (i36 != i18 && Long.compare(j20 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                    j20 = (j20 * 10) + (charAt7 - '0');
                                                    i36++;
                                                    if (i36 < length2) {
                                                        charAt7 = str2.charAt(i36);
                                                    } else {
                                                        charAt7 = 0;
                                                    }
                                                }
                                                i19 = (i20 - i36) + i21;
                                            }
                                            j11 = j20;
                                            z15 = true;
                                            if (-10 > i19 && i19 < 11 && !z15 && Long.compare(j11 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                float f11 = (float) j11;
                                                float[] fArr3 = AbstractC5949b.f46897a;
                                                if (i19 < 0) {
                                                    f10 = f11 / fArr3[-i19];
                                                } else {
                                                    f10 = f11 * fArr3[i19];
                                                }
                                                if (z14) {
                                                    f10 = -f10;
                                                }
                                                j12 = i22 << 32;
                                                floatToRawIntBits2 = Float.floatToRawIntBits(f10);
                                            } else if (j11 != 0) {
                                                if (z14) {
                                                    f6 = -0.0f;
                                                } else {
                                                    f6 = 0.0f;
                                                }
                                                j12 = i22 << 32;
                                                floatToRawIntBits2 = Float.floatToRawIntBits(f6);
                                            } else if (-126 <= i19 && i19 < 128) {
                                                long j21 = AbstractC5949b.f46898b[i19 + 325];
                                                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j11);
                                                long j22 = j11 << numberOfLeadingZeros;
                                                long j23 = j22 & 4294967295L;
                                                long j24 = j22 >>> 32;
                                                long j25 = j21 & 4294967295L;
                                                long j26 = j21 >>> 32;
                                                long j27 = j24 * j26;
                                                long j28 = j26 * j23;
                                                long j29 = j27 + ((((j24 * j25) + ((j23 * j25) >>> 32)) + (j28 & 4294967295L)) >>> 32) + (j28 >>> 32);
                                                int i37 = (int) (j29 >>> 63);
                                                long j30 = j29 >>> (i37 + 9);
                                                int i38 = numberOfLeadingZeros + (i37 ^ 1);
                                                long j31 = j29 & 511;
                                                if (j31 != 511 && (j31 != 0 || (j30 & 3) != 1)) {
                                                    long j32 = (j30 + 1) >>> 1;
                                                    if (j32 >= 9007199254740992L) {
                                                        i38--;
                                                        j32 = 4503599627370496L;
                                                    }
                                                    long j33 = j32 & (-4503599627370497L);
                                                    long j34 = ((((i19 * 217706) >> 16) + 1024) + 63) - i38;
                                                    if (j34 < 1 || j34 > 2046) {
                                                        i15 = 32;
                                                        j13 = 4294967295L;
                                                        String substring3 = str2.substring(i11, i22);
                                                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring3);
                                                        j15 = i22 << 32;
                                                        j14 = Float.floatToRawIntBits(Float.parseFloat(substring3));
                                                    } else {
                                                        long j35 = (j34 << 52) | j33;
                                                        if (z14) {
                                                            j17 = Long.MIN_VALUE;
                                                        }
                                                        i15 = 32;
                                                        j15 = i22 << 32;
                                                        j14 = Float.floatToRawIntBits((float) Double.longBitsToDouble(j35 | j17));
                                                        j13 = 4294967295L;
                                                    }
                                                    j10 = j15 | (j14 & j13);
                                                    j6 = j13;
                                                } else {
                                                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str2.substring(i11, i22));
                                                    j12 = i22 << 32;
                                                    floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(substring2)) & 4294967295L;
                                                    j10 = j12 | floatToRawIntBits;
                                                    i15 = 32;
                                                    j6 = 4294967295L;
                                                }
                                            } else {
                                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str2.substring(i11, i22));
                                                i15 = 32;
                                                j6 = 4294967295L;
                                                j10 = (i22 << 32) | (Float.floatToRawIntBits(Float.parseFloat(substring)) & 4294967295L);
                                            }
                                            floatToRawIntBits = floatToRawIntBits2 & 4294967295L;
                                            j10 = j12 | floatToRawIntBits;
                                            i15 = 32;
                                            j6 = 4294967295L;
                                        }
                                    }
                                    i13 = length;
                                    j11 = j18;
                                    z15 = false;
                                    if (-10 > i19) {
                                    }
                                    if (j11 != 0) {
                                    }
                                }
                                int i39 = (int) (j10 >>> i15);
                                intBitsToFloat = Float.intBitsToFloat((int) (j10 & j6));
                                if (Float.isNaN(intBitsToFloat)) {
                                    i26 = i14 + 1;
                                    fArr[i14] = intBitsToFloat;
                                    fArr2 = fArr;
                                    if (i26 >= fArr2.length) {
                                        float[] fArr4 = new float[i26 * 2];
                                        i12 = 0;
                                        System.arraycopy(fArr2, 0, fArr4, 0, fArr2.length);
                                        fArr2 = fArr4;
                                    } else {
                                        i12 = 0;
                                    }
                                    i11 = i39;
                                } else {
                                    fArr2 = fArr;
                                    i12 = 0;
                                    i11 = i39;
                                    i26 = i14;
                                }
                                while (i11 < i13 && str2.charAt(i11) == ',') {
                                    i11++;
                                }
                                if (i11 >= i13 || Float.isNaN(intBitsToFloat)) {
                                    break;
                                }
                                i10 = i15;
                                length = i13;
                                charAt = c12;
                                arrayList3 = arrayList;
                            }
                            arrayList = arrayList3;
                            fArr = fArr2;
                            i13 = length;
                            j10 = j16 | (floatToRawIntBits3 & 4294967295L);
                            i15 = i10;
                            i14 = i26;
                            j6 = 4294967295L;
                            int i392 = (int) (j10 >>> i15);
                            intBitsToFloat = Float.intBitsToFloat((int) (j10 & j6));
                            if (Float.isNaN(intBitsToFloat)) {
                            }
                            while (i11 < i13) {
                                i11++;
                            }
                            if (i11 >= i13) {
                                break;
                            }
                            break;
                        }
                    }
                    i25 = i11;
                    c11 = c12;
                    c10 = 'z';
                } else {
                    arrayList = arrayList3;
                    i13 = length;
                    i12 = 0;
                    c11 = charAt;
                    i25 = i11;
                    c10 = 'z';
                }
                if (c11 == c10 || c11 == 'Z') {
                    arrayList2 = arrayList;
                    arrayList2.add(C5957j.f46979c);
                } else {
                    arrayList2 = arrayList;
                    if (c11 == 'm') {
                        int i40 = i26 - 2;
                        for (int i41 = i12; i41 <= i40; i41 += 2) {
                            float f12 = fArr2[i41];
                            float f13 = fArr2[i41 + 1];
                            AbstractC5938B vVar = new v(f12, f13);
                            if ((vVar instanceof n) && i41 > 0) {
                                vVar = new m(f12, f13);
                            } else if (i41 > 0) {
                                vVar = new u(f12, f13);
                            }
                            arrayList2.add(vVar);
                        }
                    } else if (c11 == 'M') {
                        int i42 = i26 - 2;
                        for (int i43 = i12; i43 <= i42; i43 += 2) {
                            float f14 = fArr2[i43];
                            float f15 = fArr2[i43 + 1];
                            AbstractC5938B nVar = new n(f14, f15);
                            if (i43 > 0) {
                                nVar = new m(f14, f15);
                            } else if ((nVar instanceof v) && i43 > 0) {
                                nVar = new u(f14, f15);
                            }
                            arrayList2.add(nVar);
                        }
                    } else if (c11 == 'l') {
                        int i44 = i26 - 2;
                        for (int i45 = i12; i45 <= i44; i45 += 2) {
                            float f16 = fArr2[i45];
                            float f17 = fArr2[i45 + 1];
                            AbstractC5938B uVar = new u(f16, f17);
                            if ((uVar instanceof n) && i45 > 0) {
                                uVar = new m(f16, f17);
                            } else if ((uVar instanceof v) && i45 > 0) {
                                uVar = new u(f16, f17);
                            }
                            arrayList2.add(uVar);
                        }
                    } else if (c11 == 'L') {
                        int i46 = i26 - 2;
                        for (int i47 = i12; i47 <= i46; i47 += 2) {
                            float f18 = fArr2[i47];
                            float f19 = fArr2[i47 + 1];
                            AbstractC5938B mVar = new m(f18, f19);
                            if ((mVar instanceof n) && i47 > 0) {
                                mVar = new m(f18, f19);
                            } else if ((mVar instanceof v) && i47 > 0) {
                                mVar = new u(f18, f19);
                            }
                            arrayList2.add(mVar);
                        }
                    } else if (c11 == 'h') {
                        int i48 = i26 - 1;
                        for (int i49 = i12; i49 <= i48; i49++) {
                            float f20 = fArr2[i49];
                            AbstractC5938B tVar = new t(f20);
                            if ((tVar instanceof n) && i49 > 0) {
                                tVar = new m(f20, fArr2[i49 + 1]);
                            } else if ((tVar instanceof v) && i49 > 0) {
                                tVar = new u(f20, fArr2[i49 + 1]);
                            }
                            arrayList2.add(tVar);
                        }
                    } else if (c11 == 'H') {
                        int i50 = i26 - 1;
                        for (int i51 = i12; i51 <= i50; i51++) {
                            float f21 = fArr2[i51];
                            AbstractC5938B lVar = new l(f21);
                            if ((lVar instanceof n) && i51 > 0) {
                                lVar = new m(f21, fArr2[i51 + 1]);
                            } else if ((lVar instanceof v) && i51 > 0) {
                                lVar = new u(f21, fArr2[i51 + 1]);
                            }
                            arrayList2.add(lVar);
                        }
                    } else if (c11 == 'v') {
                        int i52 = i26 - 1;
                        for (int i53 = i12; i53 <= i52; i53++) {
                            float f22 = fArr2[i53];
                            AbstractC5938B zVar = new z(f22);
                            if ((zVar instanceof n) && i53 > 0) {
                                zVar = new m(f22, fArr2[i53 + 1]);
                            } else if ((zVar instanceof v) && i53 > 0) {
                                zVar = new u(f22, fArr2[i53 + 1]);
                            }
                            arrayList2.add(zVar);
                        }
                    } else if (c11 == 'V') {
                        int i54 = i26 - 1;
                        for (int i55 = i12; i55 <= i54; i55++) {
                            float f23 = fArr2[i55];
                            AbstractC5938B c5937a = new C5937A(f23);
                            if ((c5937a instanceof n) && i55 > 0) {
                                c5937a = new m(f23, fArr2[i55 + 1]);
                            } else if ((c5937a instanceof v) && i55 > 0) {
                                c5937a = new u(f23, fArr2[i55 + 1]);
                            }
                            arrayList2.add(c5937a);
                        }
                    } else if (c11 == 'c') {
                        int i56 = i26 - 6;
                        for (int i57 = i12; i57 <= i56; i57 += 6) {
                            float f24 = fArr2[i57];
                            float f25 = fArr2[i57 + 1];
                            AbstractC5938B sVar = new s(f24, f25, fArr2[i57 + 2], fArr2[i57 + 3], fArr2[i57 + 4], fArr2[i57 + 5]);
                            if ((sVar instanceof n) && i57 > 0) {
                                sVar = new m(f24, f25);
                            } else if ((sVar instanceof v) && i57 > 0) {
                                sVar = new u(f24, f25);
                            }
                            arrayList2.add(sVar);
                        }
                    } else if (c11 == 'C') {
                        int i58 = i26 - 6;
                        for (int i59 = 0; i59 <= i58; i59 += 6) {
                            float f26 = fArr2[i59];
                            float f27 = fArr2[i59 + 1];
                            AbstractC5938B c5958k = new C5958k(f26, f27, fArr2[i59 + 2], fArr2[i59 + 3], fArr2[i59 + 4], fArr2[i59 + 5]);
                            if ((c5958k instanceof n) && i59 > 0) {
                                c5958k = new m(f26, f27);
                            } else if ((c5958k instanceof v) && i59 > 0) {
                                c5958k = new u(f26, f27);
                            }
                            arrayList2.add(c5958k);
                        }
                    } else if (c11 == 's') {
                        int i60 = i26 - 4;
                        for (int i61 = 0; i61 <= i60; i61 += 4) {
                            float f28 = fArr2[i61];
                            float f29 = fArr2[i61 + 1];
                            AbstractC5938B xVar = new x(f28, f29, fArr2[i61 + 2], fArr2[i61 + 3]);
                            if ((xVar instanceof n) && i61 > 0) {
                                xVar = new m(f28, f29);
                            } else if ((xVar instanceof v) && i61 > 0) {
                                xVar = new u(f28, f29);
                            }
                            arrayList2.add(xVar);
                        }
                    } else if (c11 == 'S') {
                        int i62 = i26 - 4;
                        for (int i63 = 0; i63 <= i62; i63 += 4) {
                            float f30 = fArr2[i63];
                            float f31 = fArr2[i63 + 1];
                            AbstractC5938B pVar = new p(f30, f31, fArr2[i63 + 2], fArr2[i63 + 3]);
                            if ((pVar instanceof n) && i63 > 0) {
                                pVar = new m(f30, f31);
                            } else if ((pVar instanceof v) && i63 > 0) {
                                pVar = new u(f30, f31);
                            }
                            arrayList2.add(pVar);
                        }
                    } else if (c11 == 'q') {
                        int i64 = i26 - 4;
                        for (int i65 = 0; i65 <= i64; i65 += 4) {
                            float f32 = fArr2[i65];
                            float f33 = fArr2[i65 + 1];
                            AbstractC5938B wVar = new w(f32, f33, fArr2[i65 + 2], fArr2[i65 + 3]);
                            if ((wVar instanceof n) && i65 > 0) {
                                wVar = new m(f32, f33);
                            } else if ((wVar instanceof v) && i65 > 0) {
                                wVar = new u(f32, f33);
                            }
                            arrayList2.add(wVar);
                        }
                    } else if (c11 == 'Q') {
                        int i66 = i26 - 4;
                        for (int i67 = 0; i67 <= i66; i67 += 4) {
                            float f34 = fArr2[i67];
                            float f35 = fArr2[i67 + 1];
                            AbstractC5938B oVar = new o(f34, f35, fArr2[i67 + 2], fArr2[i67 + 3]);
                            if ((oVar instanceof n) && i67 > 0) {
                                oVar = new m(f34, f35);
                            } else if ((oVar instanceof v) && i67 > 0) {
                                oVar = new u(f34, f35);
                            }
                            arrayList2.add(oVar);
                        }
                    } else if (c11 == 't') {
                        int i68 = i26 - 2;
                        for (int i69 = 0; i69 <= i68; i69 += 2) {
                            float f36 = fArr2[i69];
                            float f37 = fArr2[i69 + 1];
                            AbstractC5938B yVar = new y(f36, f37);
                            if ((yVar instanceof n) && i69 > 0) {
                                yVar = new m(f36, f37);
                            } else if ((yVar instanceof v) && i69 > 0) {
                                yVar = new u(f36, f37);
                            }
                            arrayList2.add(yVar);
                        }
                    } else if (c11 == 'T') {
                        int i70 = i26 - 2;
                        for (int i71 = 0; i71 <= i70; i71 += 2) {
                            float f38 = fArr2[i71];
                            float f39 = fArr2[i71 + 1];
                            AbstractC5938B qVar = new q(f38, f39);
                            if ((qVar instanceof n) && i71 > 0) {
                                qVar = new m(f38, f39);
                            } else if ((qVar instanceof v) && i71 > 0) {
                                qVar = new u(f38, f39);
                            }
                            arrayList2.add(qVar);
                        }
                    } else if (c11 == 'a') {
                        int i72 = i26 - 7;
                        for (int i73 = 0; i73 <= i72; i73 += 7) {
                            float f40 = fArr2[i73];
                            int i74 = i73 + 1;
                            float f41 = fArr2[i74];
                            float f42 = fArr2[i73 + 2];
                            if (Float.compare(fArr2[i73 + 3], 0.0f) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (Float.compare(fArr2[i73 + 4], 0.0f) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            AbstractC5938B rVar = new r(f40, f41, f42, z12, z13, fArr2[i73 + 5], fArr2[i73 + 6]);
                            if ((rVar instanceof n) && i73 > 0) {
                                rVar = new m(fArr2[i73], fArr2[i74]);
                            } else if ((rVar instanceof v) && i73 > 0) {
                                rVar = new u(fArr2[i73], fArr2[i74]);
                            }
                            arrayList2.add(rVar);
                        }
                    } else if (c11 == 'A') {
                        int i75 = i26 - 7;
                        for (int i76 = 0; i76 <= i75; i76 += 7) {
                            float f43 = fArr2[i76];
                            int i77 = i76 + 1;
                            float f44 = fArr2[i77];
                            float f45 = fArr2[i76 + 2];
                            if (Float.compare(fArr2[i76 + 3], 0.0f) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (Float.compare(fArr2[i76 + 4], 0.0f) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            AbstractC5938B c5956i = new C5956i(f43, f44, f45, z10, z11, fArr2[i76 + 5], fArr2[i76 + 6]);
                            if ((c5956i instanceof n) && i76 > 0) {
                                c5956i = new m(fArr2[i76], fArr2[i77]);
                            } else if ((c5956i instanceof v) && i76 > 0) {
                                c5956i = new u(fArr2[i76], fArr2[i77]);
                            }
                            arrayList2.add(c5956i);
                        }
                    } else {
                        throw new IllegalArgumentException("Unknown command for: " + c11);
                    }
                }
                str2 = str;
                arrayList3 = arrayList2;
                length = i13;
                i10 = 32;
            } else {
                str2 = str;
                i25 = i11;
            }
        }
        return arrayList3;
    }

    public static final boolean b(C5347k c5347k) {
        if (c5347k instanceof C5347k) {
            if (r0.G.b(c5347k.f44249c, 5) || r0.G.b(c5347k.f44249c, 3)) {
                return true;
            }
        } else if (c5347k == null) {
            return true;
        }
        return false;
    }
}
