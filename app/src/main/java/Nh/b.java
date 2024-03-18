package Nh;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.android.core.z;
import r9.y;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f13008a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13009b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f13010c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f13011d;

    /* renamed from: e  reason: collision with root package name */
    public final e[] f13012e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f13013f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13014g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public b(byte[] bArr, boolean z10) {
        e[] eVarArr;
        this.f13009b = bArr;
        if (z10 && n(6) > 66) {
            throw new IllegalArgumentException("Unsupported class file major version " + ((int) n(6)));
        }
        int s10 = s(8);
        this.f13010c = new int[s10];
        this.f13011d = new String[s10];
        int i10 = 10;
        int i11 = 1;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            int i13 = 4;
            if (i11 < s10) {
                int i14 = i11 + 1;
                int i15 = i10 + 1;
                this.f13010c[i11] = i15;
                switch (bArr[i10]) {
                    case 1:
                        i13 = s(i15) + 3;
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        i11 = i14;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    default:
                        throw new IllegalArgumentException();
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        i11 = i14;
                        i13 = 5;
                        break;
                    case 5:
                    case 6:
                        i11 += 2;
                        i13 = 9;
                        break;
                    case 7:
                    case 8:
                    case 16:
                    case 19:
                    case 20:
                        i11 = i14;
                        i13 = 3;
                        break;
                    case 15:
                        i11 = i14;
                        break;
                    case 17:
                        z11 = true;
                        z12 = true;
                        i11 = i14;
                        i13 = 5;
                        break;
                    case 18:
                        z12 = true;
                        i11 = i14;
                        i13 = 5;
                        break;
                }
                i10 += i13;
            } else {
                this.f13014g = i12;
                this.f13008a = i10;
                int[] iArr = null;
                if (z11) {
                    eVarArr = new e[s10];
                } else {
                    eVarArr = null;
                }
                this.f13012e = eVarArr;
                if (z12) {
                    char[] cArr = new char[i12];
                    int c10 = c();
                    for (int s11 = s(c10 - 2); s11 > 0; s11--) {
                        String r10 = r(c10, cArr);
                        int k10 = k(c10 + 2);
                        int i16 = c10 + 6;
                        if ("BootstrapMethods".equals(r10)) {
                            int s12 = s(i16);
                            int[] iArr2 = new int[s12];
                            int i17 = c10 + 8;
                            for (int i18 = 0; i18 < s12; i18++) {
                                iArr2[i18] = i17;
                                i17 += (s(i17 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            c10 = i16 + k10;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f13013f = iArr;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k b(int i10, k[] kVarArr) {
        if (kVarArr[i10] == 0) {
            kVarArr[i10] = new Object();
        }
        k kVar = kVarArr[i10];
        kVar.f13096a = (short) (kVar.f13096a & (-2));
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:411:0x0b7d, code lost:
        if (r2 != 0) goto L420;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [Nh.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(io.sentry.vendor.b bVar, z[] zVarArr, int i10) {
        io.sentry.vendor.b bVar2;
        String str;
        String str2;
        String str3;
        z zVar;
        f fVar;
        boolean z10;
        boolean z11;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i11;
        int i12;
        int i13;
        int i14;
        String str10;
        int i15;
        String str11;
        String str12;
        String str13;
        int i16;
        String str14;
        String str15;
        int i17;
        String str16;
        String str17;
        String str18;
        int i18;
        String str19;
        String str20;
        boolean z12;
        String str21;
        int i19;
        String[] strArr;
        String str22;
        String str23;
        String[] strArr2;
        int i20;
        int i21;
        int i22;
        ?? obj = new Object();
        obj.f13051a = zVarArr;
        obj.f13052b = i10;
        char[] cArr = new char[this.f13014g];
        obj.f13053c = cArr;
        int i23 = this.f13008a;
        int s10 = s(i23);
        String o10 = o(i23 + 2, cArr);
        String o11 = o(i23 + 4, cArr);
        int s11 = s(i23 + 6);
        String[] strArr3 = new String[s11];
        int i24 = i23 + 8;
        for (int i25 = 0; i25 < s11; i25++) {
            strArr3[i25] = o(i24, cArr);
            i24 += 2;
        }
        int c10 = c();
        int i26 = s10;
        int s12 = s(c10 - 2);
        String str24 = null;
        String str25 = null;
        String str26 = null;
        int i27 = 0;
        int i28 = 0;
        String str27 = null;
        String str28 = null;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        z zVar2 = null;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        f fVar2 = obj;
        while (true) {
            String[] strArr4 = strArr3;
            String str29 = "Deprecated";
            f fVar3 = fVar2;
            String str30 = "RuntimeInvisibleTypeAnnotations";
            int i38 = i24;
            if (s12 > 0) {
                String r10 = r(c10, cArr);
                String str31 = str24;
                int k10 = k(c10 + 2);
                int i39 = c10 + 6;
                String str32 = str25;
                if ("SourceFile".equals(r10)) {
                    str25 = r(i39, cArr);
                    i22 = i39;
                    i21 = k10;
                    i20 = i38;
                    str24 = str31;
                } else {
                    if ("InnerClasses".equals(r10)) {
                        i22 = i39;
                        i36 = i22;
                    } else if ("EnclosingMethod".equals(r10)) {
                        i22 = i39;
                        i29 = i22;
                    } else {
                        if ("NestHost".equals(r10)) {
                            i22 = i39;
                            i21 = k10;
                            str28 = o(i39, cArr);
                        } else if ("NestMembers".equals(r10)) {
                            i22 = i39;
                            i34 = i22;
                        } else if ("PermittedSubclasses".equals(r10)) {
                            i22 = i39;
                            i35 = i22;
                        } else {
                            if ("Signature".equals(r10)) {
                                str26 = r(i39, cArr);
                            } else if ("RuntimeVisibleAnnotations".equals(r10)) {
                                i22 = i39;
                                i30 = i22;
                            } else if ("RuntimeVisibleTypeAnnotations".equals(r10)) {
                                i22 = i39;
                                i32 = i22;
                            } else if (str29.equals(r10)) {
                                i26 |= 131072;
                            } else if ("Synthetic".equals(r10)) {
                                i26 |= 4096;
                            } else if ("SourceDebugExtension".equals(r10)) {
                                if (k10 <= this.f13009b.length - i39) {
                                    i22 = i39;
                                    i21 = k10;
                                    str24 = u(new char[k10], i39, k10);
                                    i20 = i38;
                                    str25 = str32;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if ("RuntimeInvisibleAnnotations".equals(r10)) {
                                i22 = i39;
                                i31 = i22;
                            } else if (str30.equals(r10)) {
                                i22 = i39;
                                i33 = i22;
                            } else if ("Record".equals(r10)) {
                                i26 |= 65536;
                                i22 = i39;
                                i37 = i22;
                            } else if ("Module".equals(r10)) {
                                i22 = i39;
                                i27 = i22;
                            } else if ("ModuleMainClass".equals(r10)) {
                                i22 = i39;
                                i21 = k10;
                                str27 = o(i39, cArr);
                            } else if ("ModulePackages".equals(r10)) {
                                i22 = i39;
                                i28 = i22;
                            } else {
                                if (!"BootstrapMethods".equals(r10)) {
                                    i22 = i39;
                                    i21 = k10;
                                    i20 = i38;
                                    z e10 = e(zVarArr, r10, i22, i21, cArr, -1, null);
                                    e10.f34265h0 = zVar2;
                                    zVar2 = e10;
                                    str25 = str32;
                                    str24 = str31;
                                    i26 = i26;
                                } else {
                                    i22 = i39;
                                    i21 = k10;
                                    i20 = i38;
                                    str25 = str32;
                                    str24 = str31;
                                }
                                c10 = i22 + i21;
                                s12--;
                                strArr3 = strArr4;
                                fVar2 = fVar3;
                                i24 = i20;
                            }
                            i22 = i39;
                        }
                        i20 = i38;
                        str24 = str31;
                        str25 = str32;
                    }
                    i21 = k10;
                    i20 = i38;
                    str24 = str31;
                    str25 = str32;
                }
                c10 = i22 + i21;
                s12--;
                strArr3 = strArr4;
                fVar2 = fVar3;
                i24 = i20;
            } else {
                int i40 = i26;
                z zVar3 = zVar2;
                String str33 = str25;
                String str34 = str24;
                int[] iArr = this.f13010c;
                String str35 = "Synthetic";
                String str36 = "Signature";
                String str37 = "RuntimeVisibleAnnotations";
                bVar.a(k(iArr[1] - 7), i40, o10, str26, o11, strArr4);
                String str38 = "RuntimeVisibleTypeAnnotations";
                if ((i10 & 2) != 0 || (str33 == null && str34 == null)) {
                    bVar2 = bVar;
                    str = "RuntimeInvisibleAnnotations";
                } else {
                    bVar2 = bVar;
                    str = "RuntimeInvisibleAnnotations";
                    bVar2.x(str33, str34);
                }
                int i41 = i27;
                if (i41 != 0) {
                    fVar = fVar3;
                    char[] cArr2 = fVar.f13053c;
                    zVar = zVar3;
                    int i42 = i41 + 6;
                    io.sentry.vendor.b n10 = bVar2.n(s(i41 + 2), o(i41, cArr2), r(i41 + 4, cArr2));
                    if (n10 == null) {
                        str2 = str30;
                        str3 = str29;
                    } else {
                        String str39 = str27;
                        if (str39 != null) {
                            n10.l(str39);
                        }
                        int i43 = i28;
                        if (i43 != 0) {
                            int s13 = s(i43);
                            int i44 = i43 + 2;
                            while (true) {
                                int i45 = s13 - 1;
                                if (s13 <= 0) {
                                    break;
                                }
                                n10.s(o(i44, cArr2));
                                i44 += 2;
                                s13 = i45;
                            }
                        }
                        int s14 = s(i42);
                        int i46 = i41 + 8;
                        while (true) {
                            int i47 = s14 - 1;
                            if (s14 <= 0) {
                                break;
                            }
                            String o12 = o(i46, cArr2);
                            i46 += 6;
                            n10.w(s(i46 + 2), o12, r(i46 + 4, cArr2));
                            s14 = i47;
                        }
                        int s15 = s(i46);
                        int i48 = i46 + 2;
                        while (true) {
                            int i49 = s15 - 1;
                            if (s15 <= 0) {
                                break;
                            }
                            String o13 = o(i48, cArr2);
                            int s16 = s(i48 + 2);
                            int s17 = s(i48 + 4);
                            i48 += 6;
                            if (s17 != 0) {
                                String[] strArr5 = new String[s17];
                                str22 = str30;
                                str23 = str29;
                                int i50 = i48;
                                for (int i51 = 0; i51 < s17; i51++) {
                                    strArr5[i51] = o(i50, cArr2);
                                    i50 += 2;
                                }
                                strArr2 = strArr5;
                                i48 = i50;
                            } else {
                                str22 = str30;
                                str23 = str29;
                                strArr2 = null;
                            }
                            n10.i(o13, s16, strArr2);
                            s15 = i49;
                            str29 = str23;
                            str30 = str22;
                        }
                        str2 = str30;
                        str3 = str29;
                        int s18 = s(i48);
                        int i52 = i48 + 2;
                        while (true) {
                            int i53 = s18 - 1;
                            if (s18 <= 0) {
                                break;
                            }
                            String o14 = o(i52, cArr2);
                            int s19 = s(i52 + 2);
                            int s20 = s(i52 + 4);
                            i52 += 6;
                            if (s20 != 0) {
                                strArr = new String[s20];
                                i19 = i53;
                                for (int i54 = 0; i54 < s20; i54++) {
                                    strArr[i54] = o(i52, cArr2);
                                    i52 += 2;
                                }
                            } else {
                                i19 = i53;
                                strArr = null;
                            }
                            n10.q(o14, s19, strArr);
                            s18 = i19;
                        }
                        int s21 = s(i52);
                        int i55 = i52 + 2;
                        while (true) {
                            int i56 = s21 - 1;
                            if (s21 <= 0) {
                                break;
                            }
                            n10.z(o(i55, cArr2));
                            i55 += 2;
                            s21 = i56;
                        }
                        int s22 = s(i55);
                        int i57 = i55 + 2;
                        while (true) {
                            int i58 = s22 - 1;
                            if (s22 <= 0) {
                                break;
                            }
                            String o15 = o(i57, cArr2);
                            int s23 = s(i57 + 2);
                            i57 += 4;
                            String[] strArr6 = new String[s23];
                            for (int i59 = 0; i59 < s23; i59++) {
                                strArr6[i59] = o(i57, cArr2);
                                i57 += 2;
                            }
                            n10.u(o15, strArr6);
                            s22 = i58;
                        }
                        n10.g();
                    }
                } else {
                    str2 = str30;
                    str3 = str29;
                    zVar = zVar3;
                    fVar = fVar3;
                }
                String str40 = str28;
                if (str40 != null) {
                    bVar2.o(str40);
                }
                int i60 = i29;
                if (i60 != 0) {
                    String o16 = o(i60, cArr);
                    int s24 = s(i60 + 2);
                    bVar2.r(o16, s24 == 0 ? null : r(iArr[s24], cArr), s24 == 0 ? null : r(iArr[s24] + 2, cArr));
                }
                int i61 = i30;
                if (i61 != 0) {
                    int s25 = s(i61);
                    int i62 = i61 + 2;
                    while (true) {
                        int i63 = s25 - 1;
                        if (s25 <= 0) {
                            break;
                        }
                        i62 = j(bVar2.d(r(i62, cArr), true), i62 + 2, true, cArr);
                        s25 = i63;
                    }
                }
                int i64 = i31;
                if (i64 != 0) {
                    int s26 = s(i64);
                    int i65 = i64 + 2;
                    while (true) {
                        int i66 = s26 - 1;
                        if (s26 <= 0) {
                            break;
                        }
                        i65 = j(bVar2.d(r(i65, cArr), false), i65 + 2, true, cArr);
                        s26 = i66;
                    }
                }
                int i67 = i32;
                if (i67 != 0) {
                    int s27 = s(i67);
                    int i68 = i67 + 2;
                    while (true) {
                        int i69 = s27 - 1;
                        if (s27 <= 0) {
                            break;
                        }
                        int p10 = p(fVar, i68);
                        i68 = j(bVar2.y(fVar.f13058h, fVar.f13059i, r(p10, cArr), true), p10 + 2, true, cArr);
                        s27 = i69;
                    }
                }
                int i70 = i33;
                if (i70 != 0) {
                    int s28 = s(i70);
                    int i71 = i70 + 2;
                    while (true) {
                        int i72 = s28 - 1;
                        if (s28 <= 0) {
                            break;
                        }
                        int p11 = p(fVar, i71);
                        i71 = j(bVar2.y(fVar.f13058h, fVar.f13059i, r(p11, cArr), false), p11 + 2, true, cArr);
                        s28 = i72;
                    }
                }
                boolean z13 = true;
                for (z zVar4 = zVar; zVar4 != null; zVar4 = (z) zVar4.f34265h0) {
                    zVar4.f34265h0 = null;
                    bVar2.f(zVar4);
                }
                int i73 = i34;
                z zVar5 = null;
                if (i73 != 0) {
                    int s29 = s(i73);
                    int i74 = i73 + 2;
                    while (true) {
                        int i75 = s29 - 1;
                        if (s29 <= 0) {
                            break;
                        }
                        bVar2.p(o(i74, cArr));
                        i74 += 2;
                        s29 = i75;
                    }
                }
                int i76 = i35;
                if (i76 != 0) {
                    int s30 = s(i76);
                    int i77 = i76 + 2;
                    while (true) {
                        int i78 = s30 - 1;
                        if (s30 <= 0) {
                            break;
                        }
                        bVar2.t(o(i77, cArr));
                        i77 += 2;
                        s30 = i78;
                    }
                }
                int i79 = i36;
                if (i79 != 0) {
                    int s31 = s(i79);
                    int i80 = i79 + 2;
                    while (true) {
                        int i81 = s31 - 1;
                        if (s31 <= 0) {
                            break;
                        }
                        bVar2.k(o(i80, cArr), s(i80 + 6), o(i80 + 2, cArr), r(i80 + 4, cArr));
                        i80 += 8;
                        s31 = i81;
                    }
                }
                int i82 = i37;
                if (i82 != 0) {
                    int s32 = s(i82);
                    int i83 = i82 + 2;
                    while (true) {
                        int i84 = s32 - 1;
                        if (s32 <= 0) {
                            break;
                        }
                        char[] cArr3 = fVar.f13053c;
                        String r11 = r(i83, cArr3);
                        String r12 = r(i83 + 2, cArr3);
                        int s33 = s(i83 + 4);
                        i83 += 6;
                        String str41 = zVar5;
                        int i85 = 0;
                        int i86 = 0;
                        int i87 = 0;
                        int i88 = 0;
                        z zVar6 = zVar5;
                        while (true) {
                            int i89 = s33 - 1;
                            if (s33 <= 0) {
                                break;
                            }
                            String r13 = r(i83, cArr3);
                            int k11 = k(i83 + 2);
                            int i90 = i83 + 6;
                            if (str36.equals(r13)) {
                                str41 = r(i90, cArr3);
                                str17 = r12;
                                str16 = str;
                                i18 = i90;
                            } else if (str37.equals(r13)) {
                                str17 = r12;
                                str16 = str;
                                i18 = i90;
                                i85 = i18;
                            } else if (str38.equals(r13)) {
                                str17 = r12;
                                str16 = str;
                                i18 = i90;
                                i87 = i18;
                            } else if (str.equals(r13)) {
                                str17 = r12;
                                str16 = str;
                                i18 = i90;
                                i86 = i18;
                            } else {
                                String str42 = str2;
                                if (str42.equals(r13)) {
                                    str18 = str42;
                                    str17 = r12;
                                    str16 = str;
                                    str20 = str38;
                                    i18 = i90;
                                    i88 = i18;
                                    i17 = i84;
                                    str19 = str37;
                                    str21 = str35;
                                    z12 = true;
                                } else {
                                    str18 = str42;
                                    str17 = r12;
                                    str16 = str;
                                    i17 = i84;
                                    i18 = i90;
                                    str20 = str38;
                                    str19 = str37;
                                    str21 = str35;
                                    z12 = true;
                                    z e11 = e(fVar.f13051a, r13, i90, k11, cArr3, -1, null);
                                    e11.f34265h0 = zVar6;
                                    zVar6 = e11;
                                    str41 = str41;
                                }
                                i83 = i18 + k11;
                                bVar2 = bVar;
                                str35 = str21;
                                z13 = z12;
                                s33 = i89;
                                str38 = str20;
                                str37 = str19;
                                str2 = str18;
                                r12 = str17;
                                str = str16;
                                i84 = i17;
                                zVar6 = zVar6;
                            }
                            i17 = i84;
                            str19 = str37;
                            str18 = str2;
                            str21 = str35;
                            z12 = true;
                            str20 = str38;
                            i83 = i18 + k11;
                            bVar2 = bVar;
                            str35 = str21;
                            z13 = z12;
                            s33 = i89;
                            str38 = str20;
                            str37 = str19;
                            str2 = str18;
                            r12 = str17;
                            str = str16;
                            i84 = i17;
                            zVar6 = zVar6;
                        }
                        String str43 = str;
                        int i91 = i84;
                        String str44 = str37;
                        String str45 = str2;
                        String str46 = str35;
                        String str47 = str38;
                        boolean z14 = z13;
                        io.sentry.vendor.b bVar3 = bVar2;
                        io.sentry.vendor.b v10 = bVar3.v(r11, r12, str41);
                        if (v10 != null) {
                            int i92 = i85;
                            if (i92 != 0) {
                                int s34 = s(i92);
                                int i93 = i92 + 2;
                                while (true) {
                                    int i94 = s34 - 1;
                                    if (s34 <= 0) {
                                        break;
                                    }
                                    i93 = j(v10.d(r(i93, cArr3), z14), i93 + 2, z14, cArr3);
                                    s34 = i94;
                                }
                            }
                            int i95 = i86;
                            if (i95 != 0) {
                                int s35 = s(i95);
                                int i96 = i95 + 2;
                                while (true) {
                                    int i97 = s35 - 1;
                                    if (s35 <= 0) {
                                        break;
                                    }
                                    i96 = j(v10.d(r(i96, cArr3), false), i96 + 2, z14, cArr3);
                                    s35 = i97;
                                }
                            }
                            int i98 = i87;
                            if (i98 != 0) {
                                int s36 = s(i98);
                                int i99 = i98 + 2;
                                while (true) {
                                    int i100 = s36 - 1;
                                    if (s36 <= 0) {
                                        break;
                                    }
                                    int p12 = p(fVar, i99);
                                    i99 = j(v10.y(fVar.f13058h, fVar.f13059i, r(p12, cArr3), z14), p12 + 2, z14, cArr3);
                                    s36 = i100;
                                }
                            }
                            int i101 = i88;
                            if (i101 != 0) {
                                int s37 = s(i101);
                                int i102 = i101 + 2;
                                while (true) {
                                    int i103 = s37 - 1;
                                    if (s37 <= 0) {
                                        break;
                                    }
                                    int p13 = p(fVar, i102);
                                    i102 = j(v10.y(fVar.f13058h, fVar.f13059i, r(p13, cArr3), false), p13 + 2, z14, cArr3);
                                    s37 = i103;
                                }
                            }
                            while (zVar6 != null) {
                                zVar6.f34265h0 = null;
                                v10.f(zVar6);
                                zVar6 = (z) zVar6.f34265h0;
                            }
                            v10.g();
                        }
                        s32 = i91;
                        bVar2 = bVar3;
                        str35 = str46;
                        z13 = z14;
                        str38 = str47;
                        str37 = str44;
                        str2 = str45;
                        str = str43;
                        zVar5 = null;
                    }
                }
                String str48 = str;
                String str49 = str37;
                String str50 = str2;
                String str51 = str35;
                String str52 = str38;
                int s38 = s(i38);
                int i104 = i38 + 2;
                while (true) {
                    int i105 = s38 - 1;
                    if (s38 <= 0) {
                        break;
                    }
                    char[] cArr4 = fVar.f13053c;
                    int s39 = s(i104);
                    String r14 = r(i104 + 2, cArr4);
                    String r15 = r(i104 + 4, cArr4);
                    int s40 = s(i104 + 6);
                    int i106 = s39;
                    int i107 = i104 + 8;
                    int i108 = 0;
                    int i109 = 0;
                    int i110 = 0;
                    z zVar7 = null;
                    Object obj2 = null;
                    String str53 = null;
                    int i111 = 0;
                    while (true) {
                        int i112 = s40 - 1;
                        if (s40 <= 0) {
                            break;
                        }
                        String r16 = r(i107, cArr4);
                        int k12 = k(i107 + 2);
                        int i113 = i107 + 6;
                        int i114 = i108;
                        if ("ConstantValue".equals(r16)) {
                            int s41 = s(i113);
                            obj2 = s41 == 0 ? null : h(s41, cArr4);
                            str12 = str51;
                            str11 = str3;
                            str14 = str49;
                            i108 = i114;
                            i16 = i113;
                        } else {
                            if (str36.equals(r16)) {
                                str53 = r(i113, cArr4);
                                i108 = i114;
                                i15 = i105;
                                str12 = str51;
                                str11 = str3;
                                str15 = str52;
                                str14 = str49;
                                str13 = str50;
                                i16 = i113;
                            } else {
                                String str54 = str3;
                                if (str54.equals(r16)) {
                                    i106 |= 131072;
                                } else if (str51.equals(r16)) {
                                    i106 |= 4096;
                                } else {
                                    String str55 = str49;
                                    if (str55.equals(r16)) {
                                        str11 = str54;
                                        i110 = i113;
                                        i16 = i110;
                                        str12 = str51;
                                        i108 = i114;
                                        str14 = str55;
                                    } else {
                                        str49 = str55;
                                        String str56 = str52;
                                        if (str56.equals(r16)) {
                                            str11 = str54;
                                            i108 = i113;
                                            i16 = i108;
                                            i15 = i105;
                                            str12 = str51;
                                            str14 = str49;
                                            str13 = str50;
                                            str15 = str56;
                                        } else {
                                            str52 = str56;
                                            String str57 = str48;
                                            if (str57.equals(r16)) {
                                                str11 = str54;
                                                i109 = i113;
                                                i16 = i109;
                                                str48 = str57;
                                                str12 = str51;
                                                str14 = str49;
                                                i108 = i114;
                                            } else {
                                                str48 = str57;
                                                String str58 = str50;
                                                if (str58.equals(r16)) {
                                                    str11 = str54;
                                                    i16 = i113;
                                                    i111 = i16;
                                                    str12 = str51;
                                                    str14 = str49;
                                                    i108 = i114;
                                                    i15 = i105;
                                                    str15 = str52;
                                                    str13 = str58;
                                                } else {
                                                    str11 = str54;
                                                    i16 = i113;
                                                    i15 = i105;
                                                    str12 = str51;
                                                    str15 = str52;
                                                    str14 = str49;
                                                    str13 = str58;
                                                    z e12 = e(fVar.f13051a, r16, i113, k12, cArr4, -1, null);
                                                    e12.f34265h0 = zVar7;
                                                    zVar7 = e12;
                                                    i106 = i106;
                                                    i108 = i114;
                                                    i109 = i109;
                                                    i110 = i110;
                                                }
                                            }
                                        }
                                    }
                                }
                                str11 = str54;
                                i16 = i113;
                                str12 = str51;
                                str14 = str49;
                                i108 = i114;
                            }
                            i107 = i16 + k12;
                            str49 = str14;
                            str50 = str13;
                            s40 = i112;
                            str51 = str12;
                            str3 = str11;
                            str52 = str15;
                            i105 = i15;
                        }
                        i15 = i105;
                        str15 = str52;
                        str13 = str50;
                        i107 = i16 + k12;
                        str49 = str14;
                        str50 = str13;
                        s40 = i112;
                        str51 = str12;
                        str3 = str11;
                        str52 = str15;
                        i105 = i15;
                    }
                    int i115 = i108;
                    int i116 = i109;
                    int i117 = i110;
                    int i118 = i106;
                    int i119 = i105;
                    String str59 = str51;
                    String str60 = str3;
                    String str61 = str52;
                    String str62 = str49;
                    String str63 = str50;
                    z zVar8 = zVar7;
                    int i120 = i107;
                    io.sentry.vendor.b j6 = bVar.j(i118, obj2, r14, r15, str53);
                    if (j6 != null) {
                        if (i117 != 0) {
                            int s42 = s(i117);
                            int i121 = i117 + 2;
                            while (true) {
                                int i122 = s42 - 1;
                                if (s42 <= 0) {
                                    break;
                                }
                                i121 = j(j6.d(r(i121, cArr4), true), i121 + 2, true, cArr4);
                                s42 = i122;
                            }
                        }
                        if (i116 != 0) {
                            int s43 = s(i116);
                            int i123 = i116 + 2;
                            while (true) {
                                int i124 = s43 - 1;
                                if (s43 <= 0) {
                                    break;
                                }
                                i123 = j(j6.d(r(i123, cArr4), false), i123 + 2, true, cArr4);
                                s43 = i124;
                            }
                        }
                        if (i115 != 0) {
                            int s44 = s(i115);
                            int i125 = i115 + 2;
                            while (true) {
                                int i126 = s44 - 1;
                                if (s44 <= 0) {
                                    break;
                                }
                                int p14 = p(fVar, i125);
                                i125 = j(j6.y(fVar.f13058h, fVar.f13059i, r(p14, cArr4), true), p14 + 2, true, cArr4);
                                s44 = i126;
                            }
                        }
                        int i127 = i111;
                        if (i127 != 0) {
                            int s45 = s(i127);
                            int i128 = i127 + 2;
                            while (true) {
                                int i129 = s45 - 1;
                                if (s45 <= 0) {
                                    break;
                                }
                                int p15 = p(fVar, i128);
                                i128 = j(j6.y(fVar.f13058h, fVar.f13059i, r(p15, cArr4), false), p15 + 2, true, cArr4);
                                s45 = i129;
                            }
                        }
                        for (z zVar9 = zVar8; zVar9 != null; zVar9 = (z) zVar9.f34265h0) {
                            zVar9.f34265h0 = null;
                            j6.f(zVar9);
                        }
                        j6.g();
                    }
                    s38 = i119;
                    i104 = i120;
                    str49 = str62;
                    str50 = str63;
                    str51 = str59;
                    str3 = str60;
                    str52 = str61;
                }
                String str64 = str51;
                String str65 = str3;
                String str66 = str52;
                String str67 = str49;
                String str68 = str50;
                int s46 = s(i104);
                int i130 = i104 + 2;
                while (true) {
                    int i131 = s46 - 1;
                    if (s46 > 0) {
                        char[] cArr5 = fVar.f13053c;
                        fVar.f13054d = s(i130);
                        fVar.f13055e = r(i130 + 2, cArr5);
                        int i132 = i130 + 4;
                        fVar.f13056f = r(i132, cArr5);
                        int i133 = i130 + 6;
                        int s47 = s(i133);
                        int i134 = i130 + 8;
                        int i135 = 0;
                        boolean z15 = false;
                        int i136 = 0;
                        z zVar10 = null;
                        String[] strArr7 = null;
                        int i137 = 0;
                        int i138 = 0;
                        int i139 = 0;
                        int i140 = 0;
                        int i141 = 0;
                        int i142 = 0;
                        int i143 = 0;
                        int i144 = 0;
                        int i145 = 0;
                        while (true) {
                            int i146 = s47 - 1;
                            if (s47 <= 0) {
                                break;
                            }
                            String r17 = r(i134, cArr5);
                            int i147 = i135;
                            int k13 = k(i134 + 2);
                            i135 = i134 + 6;
                            boolean z16 = z15;
                            if ("Code".equals(r17)) {
                                if ((fVar.f13052b & 1) == 0) {
                                    i145 = i135;
                                    str4 = str36;
                                    str6 = str66;
                                    str7 = str68;
                                    z15 = z16;
                                    str8 = str64;
                                    str9 = str48;
                                    str5 = str65;
                                    i135 = i147;
                                    i11 = i145;
                                    i13 = i133;
                                    i12 = i132;
                                    i134 = i11 + k13;
                                    i133 = i13;
                                    i132 = i12;
                                    s47 = i146;
                                    str48 = str9;
                                    str64 = str8;
                                    str68 = str7;
                                    str66 = str6;
                                    str65 = str5;
                                    str36 = str4;
                                } else {
                                    i14 = i136;
                                    str10 = str65;
                                    str5 = str10;
                                    str4 = str36;
                                    str6 = str66;
                                    str7 = str68;
                                    z15 = z16;
                                    i136 = i14;
                                    str8 = str64;
                                    str9 = str48;
                                    i11 = i135;
                                    i13 = i133;
                                    i12 = i132;
                                    i135 = i147;
                                    i134 = i11 + k13;
                                    i133 = i13;
                                    i132 = i12;
                                    s47 = i146;
                                    str48 = str9;
                                    str64 = str8;
                                    str68 = str7;
                                    str66 = str6;
                                    str65 = str5;
                                    str36 = str4;
                                }
                            } else {
                                if ("Exceptions".equals(r17)) {
                                    int s48 = s(i135);
                                    String[] strArr8 = new String[s48];
                                    int i148 = i134 + 8;
                                    int i149 = i136;
                                    for (int i150 = 0; i150 < s48; i150++) {
                                        strArr8[i150] = o(i148, cArr5);
                                        i148 += 2;
                                    }
                                    strArr7 = strArr8;
                                    str4 = str36;
                                    str6 = str66;
                                    str7 = str68;
                                    z15 = z16;
                                    i136 = i149;
                                    str8 = str64;
                                    str9 = str48;
                                    str5 = str65;
                                    i11 = i135;
                                } else {
                                    i14 = i136;
                                    if (str36.equals(r17)) {
                                        i136 = s(i135);
                                        str4 = str36;
                                        str6 = str66;
                                        str7 = str68;
                                        z15 = z16;
                                        str8 = str64;
                                        str9 = str48;
                                        str5 = str65;
                                        i11 = i135;
                                        i13 = i133;
                                        i12 = i132;
                                        i135 = i147;
                                        i134 = i11 + k13;
                                        i133 = i13;
                                        i132 = i12;
                                        s47 = i146;
                                        str48 = str9;
                                        str64 = str8;
                                        str68 = str7;
                                        str66 = str6;
                                        str65 = str5;
                                        str36 = str4;
                                    } else {
                                        str10 = str65;
                                        if (str10.equals(r17)) {
                                            fVar.f13054d |= 131072;
                                            str5 = str10;
                                            str4 = str36;
                                            str6 = str66;
                                            str7 = str68;
                                            z15 = z16;
                                            i136 = i14;
                                            str8 = str64;
                                            str9 = str48;
                                            i11 = i135;
                                            i13 = i133;
                                            i12 = i132;
                                            i135 = i147;
                                            i134 = i11 + k13;
                                            i133 = i13;
                                            i132 = i12;
                                            s47 = i146;
                                            str48 = str9;
                                            str64 = str8;
                                            str68 = str7;
                                            str66 = str6;
                                            str65 = str5;
                                            str36 = str4;
                                        } else if (str67.equals(r17)) {
                                            i139 = i135;
                                            str5 = str10;
                                            str4 = str36;
                                            str6 = str66;
                                            str7 = str68;
                                            z15 = z16;
                                            i136 = i14;
                                            str8 = str64;
                                            str9 = str48;
                                            i135 = i147;
                                            i11 = i139;
                                        } else if (str66.equals(r17)) {
                                            i141 = i135;
                                            str5 = str10;
                                            str4 = str36;
                                            str6 = str66;
                                            str7 = str68;
                                            z15 = z16;
                                            i136 = i14;
                                            str8 = str64;
                                            str9 = str48;
                                            i135 = i147;
                                            i11 = i141;
                                        } else if ("AnnotationDefault".equals(r17)) {
                                            i138 = i135;
                                            str5 = str10;
                                            str4 = str36;
                                            str6 = str66;
                                            str7 = str68;
                                            z15 = z16;
                                            i136 = i14;
                                            str8 = str64;
                                            str9 = str48;
                                            i135 = i147;
                                            i11 = i138;
                                        } else {
                                            String str69 = str64;
                                            if (str69.equals(r17)) {
                                                fVar.f13054d |= 4096;
                                                str5 = str10;
                                                str4 = str36;
                                                str6 = str66;
                                                str7 = str68;
                                                str9 = str48;
                                                z15 = true;
                                                i11 = i135;
                                                i13 = i133;
                                                i12 = i132;
                                                i135 = i147;
                                                str8 = str69;
                                                i136 = i14;
                                            } else {
                                                String str70 = str48;
                                                if (str70.equals(r17)) {
                                                    i140 = i135;
                                                    str5 = str10;
                                                    str4 = str36;
                                                    str6 = str66;
                                                    str7 = str68;
                                                    i135 = i147;
                                                    i11 = i140;
                                                    i13 = i133;
                                                    i12 = i132;
                                                } else {
                                                    int i151 = i132;
                                                    String str71 = str68;
                                                    if (str71.equals(r17)) {
                                                        i11 = i135;
                                                        i142 = i11;
                                                        str5 = str10;
                                                        str4 = str36;
                                                        str6 = str66;
                                                        i12 = i151;
                                                        i135 = i147;
                                                    } else {
                                                        i11 = i135;
                                                        if ("RuntimeVisibleParameterAnnotations".equals(r17)) {
                                                            i135 = i147;
                                                            str5 = str10;
                                                            str4 = str36;
                                                            str6 = str66;
                                                            i143 = i11;
                                                        } else if ("RuntimeInvisibleParameterAnnotations".equals(r17)) {
                                                            i135 = i147;
                                                            str5 = str10;
                                                            str4 = str36;
                                                            str6 = str66;
                                                            i144 = i11;
                                                        } else if ("MethodParameters".equals(r17)) {
                                                            i135 = i147;
                                                            str5 = str10;
                                                            str4 = str36;
                                                            str6 = str66;
                                                            i137 = i11;
                                                        } else {
                                                            str9 = str70;
                                                            str8 = str69;
                                                            str5 = str10;
                                                            str4 = str36;
                                                            i13 = i133;
                                                            str6 = str66;
                                                            i12 = i151;
                                                            str7 = str71;
                                                            z e13 = e(fVar.f13051a, r17, i11, k13, cArr5, -1, null);
                                                            e13.f34265h0 = zVar10;
                                                            zVar10 = e13;
                                                            i135 = i147;
                                                            z15 = z16;
                                                            i136 = i14;
                                                        }
                                                        i12 = i151;
                                                    }
                                                    i13 = i133;
                                                    str7 = str71;
                                                }
                                                str9 = str70;
                                                z15 = z16;
                                                str8 = str69;
                                                i136 = i14;
                                            }
                                            i134 = i11 + k13;
                                            i133 = i13;
                                            i132 = i12;
                                            s47 = i146;
                                            str48 = str9;
                                            str64 = str8;
                                            str68 = str7;
                                            str66 = str6;
                                            str65 = str5;
                                            str36 = str4;
                                        }
                                    }
                                }
                                i13 = i133;
                                i12 = i132;
                                i134 = i11 + k13;
                                i133 = i13;
                                i132 = i12;
                                s47 = i146;
                                str48 = str9;
                                str64 = str8;
                                str68 = str7;
                                str66 = str6;
                                str65 = str5;
                                str36 = str4;
                            }
                        }
                        int i152 = i135;
                        boolean z17 = z15;
                        int i153 = i136;
                        String str72 = str36;
                        String str73 = str66;
                        String str74 = str68;
                        String str75 = str64;
                        String str76 = str48;
                        String str77 = str65;
                        int i154 = i133;
                        int i155 = i132;
                        z zVar11 = zVar10;
                        int i156 = i134;
                        l m10 = bVar.m(fVar.f13054d, fVar.f13055e, fVar.f13056f, i153 == 0 ? null : t(i153, cArr5), strArr7);
                        if (m10 != null) {
                            if (m10 instanceof m) {
                                m mVar = (m) m10;
                                boolean z18 = (fVar.f13054d & 131072) != 0;
                                int s49 = s(i155);
                                q qVar = mVar.f13142h0;
                                if (this == qVar.f13197b && s49 == mVar.f13146l0 && i153 == mVar.f13115E0) {
                                    int i157 = mVar.f13143i0;
                                    if (z18 == ((i157 & 131072) != 0)) {
                                        if (qVar.f13198c >= 49 || (i157 & 4096) == 0) {
                                            z10 = z17;
                                            z11 = false;
                                        } else {
                                            z10 = z17;
                                            z11 = true;
                                        }
                                        if (z10 == z11) {
                                            int i158 = mVar.f13113C0;
                                            if (i152 != 0) {
                                                if (s(i152) == i158) {
                                                    int i159 = i152 + 2;
                                                    for (int i160 = 0; i160 < i158; i160++) {
                                                        if (s(i159) == mVar.f13114D0[i160]) {
                                                            i159 += 2;
                                                        }
                                                    }
                                                }
                                                mVar.f13140e1 = i154;
                                                mVar.f13141f1 = (i156 - i130) - 6;
                                            }
                                        }
                                    }
                                }
                            }
                            int i161 = i137;
                            if (i161 != 0 && (fVar.f13052b & 2) == 0) {
                                int f6 = f(i161);
                                int i162 = i161 + 1;
                                while (true) {
                                    int i163 = f6 - 1;
                                    if (f6 <= 0) {
                                        break;
                                    }
                                    m10.B(s(i162 + 2), r(i162, cArr5));
                                    i162 += 4;
                                    f6 = i163;
                                }
                            }
                            int i164 = i138;
                            if (i164 != 0) {
                                io.sentry.vendor.b f10 = m10.f();
                                i(f10, i164, null, cArr5);
                                if (f10 != null) {
                                    f10.g();
                                }
                            }
                            int i165 = i139;
                            if (i165 != 0) {
                                int s50 = s(i165);
                                int i166 = i165 + 2;
                                while (true) {
                                    int i167 = s50 - 1;
                                    if (s50 <= 0) {
                                        break;
                                    }
                                    i166 = j(m10.e(r(i166, cArr5), true), i166 + 2, true, cArr5);
                                    s50 = i167;
                                }
                            }
                            int i168 = i140;
                            if (i168 != 0) {
                                int s51 = s(i168);
                                int i169 = i168 + 2;
                                while (true) {
                                    int i170 = s51 - 1;
                                    if (s51 <= 0) {
                                        break;
                                    }
                                    i169 = j(m10.e(r(i169, cArr5), false), i169 + 2, true, cArr5);
                                    s51 = i170;
                                }
                            }
                            int i171 = i141;
                            if (i171 != 0) {
                                int s52 = s(i171);
                                int i172 = i171 + 2;
                                while (true) {
                                    int i173 = s52 - 1;
                                    if (s52 <= 0) {
                                        break;
                                    }
                                    int p16 = p(fVar, i172);
                                    i172 = j(m10.G(fVar.f13058h, fVar.f13059i, r(p16, cArr5), true), p16 + 2, true, cArr5);
                                    s52 = i173;
                                }
                            }
                            int i174 = i142;
                            if (i174 != 0) {
                                int s53 = s(i174);
                                int i175 = i174 + 2;
                                while (true) {
                                    int i176 = s53 - 1;
                                    if (s53 <= 0) {
                                        break;
                                    }
                                    int p17 = p(fVar, i175);
                                    i175 = j(m10.G(fVar.f13058h, fVar.f13059i, r(p17, cArr5), false), p17 + 2, true, cArr5);
                                    s53 = i176;
                                }
                            }
                            int i177 = i143;
                            if (i177 != 0) {
                                m(m10, fVar, i177, true);
                            }
                            int i178 = i144;
                            if (i178 != 0) {
                                m(m10, fVar, i178, false);
                            }
                            for (z zVar12 = zVar11; zVar12 != null; zVar12 = (z) zVar12.f34265h0) {
                                zVar12.f34265h0 = null;
                                m10.g(zVar12);
                            }
                            int i179 = i145;
                            if (i179 != 0) {
                                m10.i();
                                g(m10, fVar, i179);
                            }
                            m10.j();
                            s46 = i131;
                            i130 = i156;
                            str48 = str76;
                            str64 = str75;
                            str68 = str74;
                            str66 = str73;
                            str65 = str77;
                            str36 = str72;
                        }
                        s46 = i131;
                        i130 = i156;
                        str48 = str76;
                        str64 = str75;
                        str68 = str74;
                        str66 = str73;
                        str65 = str77;
                        str36 = str72;
                    } else {
                        bVar.g();
                        return;
                    }
                }
            }
        }
    }

    public final int c() {
        int i10 = this.f13008a;
        int s10 = (s(i10 + 6) * 2) + i10 + 8;
        int s11 = s(s10);
        int i11 = s10 + 2;
        while (true) {
            int i12 = s11 - 1;
            if (s11 <= 0) {
                break;
            }
            int s12 = s(i11 + 6);
            i11 += 8;
            while (true) {
                int i13 = s12 - 1;
                if (s12 > 0) {
                    i11 += k(i11 + 2) + 6;
                    s12 = i13;
                }
            }
            s11 = i12;
        }
        int s13 = s(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = s13 - 1;
            if (s13 > 0) {
                int s14 = s(i14 + 6);
                i14 += 8;
                while (true) {
                    int i16 = s14 - 1;
                    if (s14 > 0) {
                        i14 += k(i14 + 2) + 6;
                        s14 = i16;
                    }
                }
                s13 = i15;
            } else {
                return i14 + 2;
            }
        }
    }

    public final int d(int[] iArr, int i10) {
        if (iArr != null && i10 < iArr.length && f(iArr[i10]) >= 67) {
            return s(iArr[i10] + 1);
        }
        return -1;
    }

    public final z e(z[] zVarArr, String str, int i10, int i11, char[] cArr, int i12, k[] kVarArr) {
        int length = zVarArr.length;
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f13009b;
            if (i13 < length) {
                z zVar = zVarArr[i13];
                if (((String) zVar.f34263Y).equals(str)) {
                    z zVar2 = new z((String) zVar.f34263Y);
                    byte[] bArr2 = new byte[i11];
                    zVar2.f34264Z = bArr2;
                    System.arraycopy(bArr, i10, bArr2, 0, i11);
                    return zVar2;
                }
                i13++;
            } else {
                z zVar3 = new z(str);
                byte[] bArr3 = new byte[i11];
                zVar3.f34264Z = bArr3;
                System.arraycopy(bArr, i10, bArr3, 0, i11);
                return zVar3;
            }
        }
    }

    public final int f(int i10) {
        return this.f13009b[i10] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x06ef, code lost:
        if (r36 == 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06f6, code lost:
        if ((r48.f13052b & 8) == 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06f8, code lost:
        r47.l(256, 0, 0, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0703, code lost:
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0705, code lost:
        r5 = r22[r25] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x070d, code lost:
        switch(r5) {
            case 0: goto L353;
            case 1: goto L353;
            case 2: goto L353;
            case 3: goto L353;
            case 4: goto L353;
            case 5: goto L353;
            case 6: goto L353;
            case 7: goto L353;
            case 8: goto L353;
            case 9: goto L353;
            case 10: goto L353;
            case 11: goto L353;
            case 12: goto L353;
            case 13: goto L353;
            case 14: goto L353;
            case 15: goto L353;
            case 16: goto L352;
            case 17: goto L351;
            case 18: goto L348;
            case 19: goto L347;
            case 20: goto L347;
            case 21: goto L346;
            case 22: goto L346;
            case 23: goto L346;
            case 24: goto L346;
            case 25: goto L346;
            case 26: goto L345;
            case 27: goto L345;
            case 28: goto L345;
            case 29: goto L345;
            case 30: goto L345;
            case 31: goto L345;
            case 32: goto L345;
            case 33: goto L345;
            case 34: goto L345;
            case 35: goto L345;
            case 36: goto L345;
            case 37: goto L345;
            case 38: goto L345;
            case 39: goto L345;
            case 40: goto L345;
            case 41: goto L345;
            case 42: goto L345;
            case 43: goto L345;
            case 44: goto L345;
            case 45: goto L345;
            case 46: goto L353;
            case 47: goto L353;
            case 48: goto L353;
            case 49: goto L353;
            case 50: goto L353;
            case 51: goto L353;
            case 52: goto L353;
            case 53: goto L353;
            case 54: goto L346;
            case 55: goto L346;
            case 56: goto L346;
            case 57: goto L346;
            case 58: goto L346;
            case 59: goto L343;
            case 60: goto L343;
            case 61: goto L343;
            case 62: goto L343;
            case 63: goto L343;
            case 64: goto L343;
            case 65: goto L343;
            case 66: goto L343;
            case 67: goto L343;
            case 68: goto L343;
            case 69: goto L343;
            case 70: goto L343;
            case 71: goto L343;
            case 72: goto L343;
            case 73: goto L343;
            case 74: goto L343;
            case 75: goto L343;
            case 76: goto L343;
            case 77: goto L343;
            case 78: goto L343;
            case 79: goto L353;
            case 80: goto L353;
            case 81: goto L353;
            case 82: goto L353;
            case 83: goto L353;
            case 84: goto L353;
            case 85: goto L353;
            case 86: goto L353;
            case 87: goto L353;
            case 88: goto L353;
            case 89: goto L353;
            case 90: goto L353;
            case 91: goto L353;
            case 92: goto L353;
            case 93: goto L353;
            case 94: goto L353;
            case 95: goto L353;
            case 96: goto L353;
            case 97: goto L353;
            case 98: goto L353;
            case 99: goto L353;
            case 100: goto L353;
            case 101: goto L353;
            case 102: goto L353;
            case 103: goto L353;
            case 104: goto L353;
            case 105: goto L353;
            case 106: goto L353;
            case 107: goto L353;
            case 108: goto L353;
            case 109: goto L353;
            case 110: goto L353;
            case 111: goto L353;
            case 112: goto L353;
            case 113: goto L353;
            case 114: goto L353;
            case 115: goto L353;
            case 116: goto L353;
            case 117: goto L353;
            case 118: goto L353;
            case 119: goto L353;
            case 120: goto L353;
            case 121: goto L353;
            case 122: goto L353;
            case 123: goto L353;
            case 124: goto L353;
            case 125: goto L353;
            case 126: goto L353;
            case 127: goto L353;
            case 128: goto L353;
            case 129: goto L353;
            case 130: goto L353;
            case 131: goto L353;
            case 132: goto L342;
            case 133: goto L353;
            case 134: goto L353;
            case 135: goto L353;
            case 136: goto L353;
            case 137: goto L353;
            case 138: goto L353;
            case 139: goto L353;
            case 140: goto L353;
            case 141: goto L353;
            case 142: goto L353;
            case 143: goto L353;
            case 144: goto L353;
            case 145: goto L353;
            case 146: goto L353;
            case 147: goto L353;
            case 148: goto L353;
            case 149: goto L353;
            case 150: goto L353;
            case 151: goto L353;
            case 152: goto L353;
            case 153: goto L340;
            case 154: goto L340;
            case 155: goto L340;
            case 156: goto L340;
            case 157: goto L340;
            case 158: goto L340;
            case 159: goto L340;
            case 160: goto L340;
            case 161: goto L340;
            case 162: goto L340;
            case 163: goto L340;
            case 164: goto L340;
            case 165: goto L340;
            case 166: goto L340;
            case 167: goto L340;
            case 168: goto L340;
            case 169: goto L346;
            case 170: goto L336;
            case 171: goto L331;
            case 172: goto L353;
            case 173: goto L353;
            case 174: goto L353;
            case 175: goto L353;
            case 176: goto L353;
            case 177: goto L353;
            case 178: goto L317;
            case 179: goto L317;
            case 180: goto L317;
            case 181: goto L317;
            case 182: goto L317;
            case 183: goto L317;
            case 184: goto L317;
            case 185: goto L317;
            case 186: goto L313;
            case 187: goto L312;
            case 188: goto L352;
            case 189: goto L312;
            case 190: goto L353;
            case 191: goto L353;
            case 192: goto L312;
            case 193: goto L312;
            case 194: goto L353;
            case 195: goto L353;
            case 196: goto L306;
            case 197: goto L304;
            case 198: goto L340;
            case 199: goto L340;
            case 200: goto L303;
            case 201: goto L303;
            case 202: goto L289;
            case 203: goto L289;
            case 204: goto L289;
            case 205: goto L289;
            case 206: goto L289;
            case 207: goto L289;
            case 208: goto L289;
            case 209: goto L289;
            case 210: goto L289;
            case 211: goto L289;
            case 212: goto L289;
            case 213: goto L289;
            case 214: goto L289;
            case 215: goto L289;
            case 216: goto L289;
            case 217: goto L289;
            case 218: goto L289;
            case 219: goto L289;
            case 220: goto L286;
            default: goto L475;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0715, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0716, code lost:
        r47.r(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.SUCCESS, r13[k(r25 + 1) + r7]);
        r3 = r25 + 5;
        r19 = r6;
        r35 = r11;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0729, code lost:
        r4 = r23;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x072d, code lost:
        r11 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0739, code lost:
        if (r5 >= 218) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x073b, code lost:
        r5 = r5 - 49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x073e, code lost:
        r5 = r5 - 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0740, code lost:
        r1 = r13[s(r25 + 1) + r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x074b, code lost:
        if (r5 == 167) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x074f, code lost:
        if (r5 != 168) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0752, code lost:
        if (r5 >= 167) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0754, code lost:
        r2 = ((r5 + 1) ^ 1) - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x075a, code lost:
        r2 = r5 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x075c, code lost:
        r47.r(r2, b(r7 + 3, r13));
        r47.r(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.SUCCESS, r1);
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x076a, code lost:
        r47.r(r5 + 33, r1);
        r4 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0771, code lost:
        r3 = r25 + 3;
        r0 = r4;
        r19 = r6;
        r35 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0779, code lost:
        r47.r(r5 - r18, r13[k(r25 + 1) + r7]);
        r3 = r25 + 5;
        r19 = r6;
        r35 = r11;
        r4 = r23;
        r5 = r26;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0794, code lost:
        r4 = r38;
        r47.A(r22[r25 + 3] & 255, o(r25 + 1, r4));
        r3 = r25 + 4;
        r19 = r6;
        r35 = r11;
        r5 = r26;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x07b1, code lost:
        r11 = r4;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x07ba, code lost:
        r4 = r38;
        r0 = r22[r25 + 1] & 255;
        r3 = '\u0084';
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x07c5, code lost:
        if (r0 != 132) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x07c7, code lost:
        r47.m(s(r25 + 2), n(r25 + 4));
        r0 = r25 + 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x07d8, code lost:
        r19 = r6;
        r35 = r11;
        r5 = r26;
        r3 = r0;
        r11 = r4;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x07e8, code lost:
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x07ec, code lost:
        r47.I(r0, s(r25 + 2));
        r0 = r25 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x07f8, code lost:
        r4 = r38;
        r3 = '\u0084';
        r47.H(r5, o(r25 + 1, r4));
        r0 = r25 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0808, code lost:
        r4 = r38;
        r0 = r17[s(r25 + 1)];
        r1 = r17[s(r0 + 2)];
        r2 = r(r1, r4);
        r1 = r(r1 + 2, r4);
        r0 = r46.f13013f[s(r0)];
        r5 = (Nh.j) h(s(r0), r4);
        r3 = s(r0 + 2);
        r14 = new java.lang.Object[r3];
        r0 = r0 + 4;
        r19 = r6;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0847, code lost:
        if (r6 >= r3) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0849, code lost:
        r14[r6] = h(s(r0), r4);
        r0 = r0 + 2;
        r6 = r6 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x085c, code lost:
        r47.q(r2, r1, r5, r14);
        r3 = r25 + 5;
        r35 = r11;
        r5 = r26;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x086b, code lost:
        r19 = r6;
        r4 = r38;
        r0 = r17[s(r25 + 1)];
        r1 = r17[s(r0 + 2)];
        r2 = o(r0, r4);
        r3 = r(r1, r4);
        r6 = r(r1 + 2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x088f, code lost:
        if (r5 >= 182) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0891, code lost:
        r47.k(r2, r5, r3, r6);
        r6 = r5;
        r35 = r11;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x08a1, code lost:
        if (r22[r0 - 1] != 11) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x08a3, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x08a5, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x08a6, code lost:
        r35 = r11;
        r11 = r4;
        r6 = r5;
        r47.z(r5, r2, r3, r6, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x08b6, code lost:
        if (r6 != 185) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x08b8, code lost:
        r3 = r25 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x08ba, code lost:
        r4 = r23;
        r5 = r26;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x08c6, code lost:
        r3 = r25 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x08c9, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r3 = (4 - (r7 & 3)) + r25;
        r0 = r13[k(r3) + r7];
        r1 = k(r3 + 4);
        r3 = r3 + 8;
        r4 = new int[r1];
        r5 = new Nh.k[r1];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x08ed, code lost:
        if (r6 >= r1) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x08ef, code lost:
        r4[r6] = k(r3);
        r5[r6] = r13[k(r3 + 4) + r7];
        r3 = r3 + 8;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0905, code lost:
        r47.x(r0, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0908, code lost:
        r4 = r23;
        r5 = r26;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0912, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r3 = (4 - (r7 & 3)) + r25;
        r0 = r13[k(r3) + r7];
        r4 = k(r3 + 4);
        r5 = k(r3 + 8);
        r3 = r3 + 12;
        r6 = (r5 - r4) + 1;
        r14 = new Nh.k[r6];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x093f, code lost:
        if (r1 >= r6) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0941, code lost:
        r14[r1] = r13[k(r3) + r7];
        r3 = r3 + 4;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0950, code lost:
        r47.D(r4, r5, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0954, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.r(r5, r13[n(r25 + 1) + r7]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x096b, code lost:
        r3 = r25 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x096e, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.m(r22[r25 + 1] & 255, r22[r25 + 2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0987, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r5 = r5 - 59;
        r47.I((r5 >> 2) + 54, r5 & 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x099e, code lost:
        r3 = r25 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x09a2, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r5 = r5 - 26;
        r47.I((r5 >> 2) + 21, r5 & 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x09ba, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.I(r5, r22[r25 + 1] & 255);
        r3 = r25 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x09d3, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.t(h(s(r25 + 1), r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x09eb, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.t(h(r22[r25 + 1] & 255, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0a03, code lost:
        r3 = r25 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0a05, code lost:
        r4 = r23;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0a0b, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.p(r5, n(r25 + 1));
        r3 = r25 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0a24, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.p(r5, r22[r25 + 1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0a39, code lost:
        r19 = r6;
        r35 = r11;
        r11 = r38;
        r47.n(r5);
        r3 = r25 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0a4c, code lost:
        if (r15 == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0a4f, code lost:
        if (r5 >= r15.length) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0a51, code lost:
        if (r4 > r7) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0a53, code lost:
        if (r4 != r7) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0a55, code lost:
        r4 = p(r48, r15[r5]);
        j(r47.o(r48.f13058h, r48.f13059i, r(r4, r11), true), r4 + 2, true, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0a6d, code lost:
        r5 = r5 + 1;
        r4 = d(r15, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0a75, code lost:
        r1 = r24;
        r2 = r27;
        r14 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0a7b, code lost:
        if (r14 == null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0a7e, code lost:
        if (r2 >= r14.length) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0a80, code lost:
        if (r1 > r7) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0a82, code lost:
        if (r1 != r7) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0a84, code lost:
        r1 = p(r48, r14[r2]);
        r49 = r0;
        r23 = r3;
        r24 = r7;
        j(r47.o(r48.f13058h, r48.f13059i, r(r1, r11), false), r1 + 2, true, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0aa6, code lost:
        r49 = r0;
        r23 = r3;
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0aad, code lost:
        r2 = r2 + 1;
        r1 = d(r14, r2);
        r0 = r49;
        r3 = r23;
        r7 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:329:0x08c0 -> B:354:0x0a4c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(l lVar, f fVar, int i10) {
        int i11;
        k[] kVarArr;
        k[] kVarArr2;
        z zVar;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        String str;
        int i15;
        k[] kVarArr3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr2;
        int[] iArr3;
        char[] cArr;
        int i21;
        int i22;
        int i23;
        boolean z10;
        char[] cArr2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int[] iArr4;
        int[] iArr5;
        char[] cArr3;
        int i30;
        int i31;
        int[] iArr6;
        int i32;
        int i33;
        char c10;
        char c11;
        int i34;
        int i35;
        k[] kVarArr4;
        int i36;
        k[] kVarArr5;
        int s10;
        int i37;
        int i38;
        int i39;
        byte[] bArr;
        int i40;
        k[] kVarArr6;
        int[] iArr7;
        byte[] bArr2;
        k[] kVarArr7;
        int[] iArr8;
        int[] iArr9;
        char c12;
        int i41;
        byte[] bArr3;
        Object obj;
        int i42;
        int[] iArr10;
        int[] iArr11;
        int i43;
        char[] cArr4 = fVar.f13053c;
        int s11 = s(i10);
        int s12 = s(i10 + 2);
        int k10 = k(i10 + 4);
        int i44 = i10 + 8;
        byte[] bArr4 = this.f13009b;
        if (k10 <= bArr4.length - i44) {
            int i45 = i44 + k10;
            Object[] objArr = new k[k10 + 1];
            fVar.f13057g = objArr;
            int i46 = i44;
            while (i46 < i45) {
                int i47 = i46 - i44;
                switch (bArr4[i46] & 255) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case y.f44626f /* 48 */:
                    case 49:
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                        i46++;
                        break;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 169:
                    case 188:
                        i46 += 2;
                        break;
                    case 17:
                    case 19:
                    case 20:
                    case 132:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 187:
                    case 189:
                    case 192:
                    case 193:
                        i46 += 3;
                        break;
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                        b(n(i46 + 1) + i47, objArr);
                        i46 += 3;
                        break;
                    case 170:
                        int i48 = (4 - (i47 & 3)) + i46;
                        b(k(i48) + i47, objArr);
                        int k11 = (k(i48 + 8) - k(i48 + 4)) + 1;
                        i43 = i48 + 12;
                        while (true) {
                            int i49 = k11 - 1;
                            if (k11 <= 0) {
                                i46 = i43;
                                break;
                            } else {
                                b(k(i43) + i47, objArr);
                                i43 += 4;
                                k11 = i49;
                            }
                        }
                    case 171:
                        int i50 = (4 - (i47 & 3)) + i46;
                        b(k(i50) + i47, objArr);
                        int k12 = k(i50 + 4);
                        i43 = i50 + 8;
                        while (true) {
                            int i51 = k12 - 1;
                            if (k12 <= 0) {
                                i46 = i43;
                                break;
                            } else {
                                b(k(i43 + 4) + i47, objArr);
                                i43 += 8;
                                k12 = i51;
                            }
                        }
                    case 185:
                    case 186:
                        i46 += 5;
                        break;
                    case 196:
                        int i52 = bArr4[i46 + 1] & 255;
                        if (i52 != 132) {
                            if (i52 != 169) {
                                switch (i52) {
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        break;
                                    default:
                                        switch (i52) {
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                            }
                            i46 += 4;
                            break;
                        } else {
                            i46 += 6;
                            break;
                        }
                    case 197:
                        i46 += 4;
                        break;
                    case RCHTTPStatusCodes.SUCCESS /* 200 */:
                    case RCHTTPStatusCodes.CREATED /* 201 */:
                    case 220:
                        b(k(i46 + 1) + i47, objArr);
                        i46 += 5;
                        break;
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                        b(s(i46 + 1) + i47, objArr);
                        i46 += 3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            int s13 = s(i46);
            int i53 = i46 + 2;
            while (true) {
                int i54 = s13 - 1;
                int[] iArr12 = this.f13010c;
                if (s13 > 0) {
                    i53 += 8;
                    lVar.F(b(s(i53), objArr), b(s(i53 + 2), objArr), b(s(i53 + 4), objArr), r(iArr12[s(i53 + 6)], cArr4));
                    s13 = i54;
                    i45 = i45;
                } else {
                    int i55 = i45;
                    int s14 = s(i53);
                    int i56 = i53 + 2;
                    int[] iArr13 = null;
                    boolean z11 = true;
                    int i57 = 0;
                    int[] iArr14 = null;
                    int i58 = 0;
                    z zVar2 = null;
                    int i59 = 0;
                    int i60 = 0;
                    while (true) {
                        int i61 = s14 - 1;
                        if (s14 > 0) {
                            String r10 = r(i56, cArr4);
                            int k13 = k(i56 + 2);
                            int i62 = i56 + 6;
                            if ("LocalVariableTable".equals(r10)) {
                                if ((fVar.f13052b & 2) == 0) {
                                    int s15 = s(i62);
                                    int i63 = i56 + 8;
                                    while (true) {
                                        int i64 = s15 - 1;
                                        if (s15 > 0) {
                                            int s16 = s(i63);
                                            Object[] objArr2 = objArr[s16];
                                            if (objArr2 == 0) {
                                                if (objArr2 == 0) {
                                                    objArr[s16] = new Object();
                                                }
                                                iArr11 = iArr13;
                                                k kVar = objArr[s16];
                                                iArr10 = iArr12;
                                                kVar.f13096a = (short) (kVar.f13096a | 1);
                                            } else {
                                                iArr11 = iArr13;
                                                iArr10 = iArr12;
                                            }
                                            int s17 = s(i63 + 2) + s16;
                                            Object[] objArr3 = objArr[s17];
                                            if (objArr3 == 0) {
                                                if (objArr3 == 0) {
                                                    objArr[s17] = new Object();
                                                }
                                                k kVar2 = objArr[s17];
                                                kVar2.f13096a = (short) (kVar2.f13096a | 1);
                                            }
                                            i63 += 10;
                                            s15 = i64;
                                            iArr13 = iArr11;
                                            iArr12 = iArr10;
                                        } else {
                                            iArr7 = iArr12;
                                            kVarArr6 = objArr;
                                            i40 = i62;
                                            i59 = i40;
                                            bArr = bArr4;
                                            i39 = i55;
                                            i56 = i40 + k13;
                                            iArr12 = iArr7;
                                            objArr = kVarArr6;
                                            bArr4 = bArr;
                                            s14 = i61;
                                            i55 = i39;
                                        }
                                    }
                                } else {
                                    iArr9 = iArr13;
                                    iArr8 = iArr12;
                                    kVarArr7 = objArr;
                                    bArr2 = bArr4;
                                    c12 = 4;
                                }
                            } else {
                                iArr9 = iArr13;
                                iArr8 = iArr12;
                                if ("LocalVariableTypeTable".equals(r10)) {
                                    kVarArr6 = objArr;
                                    i40 = i62;
                                    i60 = i40;
                                    bArr = bArr4;
                                    i39 = i55;
                                    iArr13 = iArr9;
                                    iArr7 = iArr8;
                                } else if ("LineNumberTable".equals(r10)) {
                                    if ((fVar.f13052b & 2) == 0) {
                                        int s18 = s(i62);
                                        int i65 = i56 + 8;
                                        objArr = objArr;
                                        while (true) {
                                            int i66 = s18 - 1;
                                            if (s18 > 0) {
                                                int s19 = s(i65);
                                                int s20 = s(i65 + 2);
                                                int i67 = i65 + 4;
                                                Object[] objArr4 = objArr[s19];
                                                if (objArr4 == 0) {
                                                    if (objArr4 == 0) {
                                                        objArr[s19] = new Object();
                                                    }
                                                    k kVar3 = objArr[s19];
                                                    i41 = i67;
                                                    kVar3.f13096a = (short) (kVar3.f13096a | 1);
                                                } else {
                                                    i41 = i67;
                                                }
                                                k kVar4 = objArr[s19];
                                                short s21 = kVar4.f13096a;
                                                if ((s21 & 128) == 0) {
                                                    kVar4.f13096a = (short) (s21 | 128);
                                                    kVar4.f13097b = (short) s20;
                                                    i42 = i66;
                                                    obj = objArr;
                                                    bArr3 = bArr4;
                                                } else {
                                                    if (kVar4.f13098c == null) {
                                                        kVar4.f13098c = new int[4];
                                                    }
                                                    int[] iArr15 = kVar4.f13098c;
                                                    i42 = i66;
                                                    int i68 = iArr15[0] + 1;
                                                    iArr15[0] = i68;
                                                    if (i68 >= iArr15.length) {
                                                        int[] iArr16 = new int[iArr15.length + 4];
                                                        obj = objArr;
                                                        bArr3 = bArr4;
                                                        System.arraycopy(iArr15, 0, iArr16, 0, iArr15.length);
                                                        kVar4.f13098c = iArr16;
                                                    } else {
                                                        obj = objArr;
                                                        bArr3 = bArr4;
                                                    }
                                                    kVar4.f13098c[i68] = s20;
                                                }
                                                i65 = i41;
                                                s18 = i42;
                                                objArr = obj;
                                                bArr4 = bArr3;
                                            }
                                        }
                                    }
                                    kVarArr7 = objArr;
                                    bArr2 = bArr4;
                                    c12 = 4;
                                } else {
                                    kVarArr7 = objArr;
                                    bArr2 = bArr4;
                                    if ("RuntimeVisibleTypeAnnotations".equals(r10)) {
                                        iArr13 = q(lVar, fVar, i62, true);
                                        i40 = i62;
                                        i39 = i55;
                                    } else if ("RuntimeInvisibleTypeAnnotations".equals(r10)) {
                                        iArr14 = q(lVar, fVar, i62, false);
                                        i40 = i62;
                                        i39 = i55;
                                        iArr13 = iArr9;
                                    } else if ("StackMapTable".equals(r10)) {
                                        c12 = 4;
                                        if ((fVar.f13052b & 4) == 0) {
                                            i57 = i56 + 8;
                                            i58 = i62 + k13;
                                        }
                                    } else {
                                        c12 = 4;
                                        if ("StackMap".equals(r10)) {
                                            if ((fVar.f13052b & 4) == 0) {
                                                i57 = i56 + 8;
                                                i58 = i62 + k13;
                                                z11 = false;
                                            }
                                        } else {
                                            iArr7 = iArr8;
                                            kVarArr6 = kVarArr7;
                                            i40 = i62;
                                            i39 = i55;
                                            bArr = bArr2;
                                            z e10 = e(fVar.f13051a, r10, i62, k13, cArr4, i10, kVarArr6);
                                            e10.f34265h0 = zVar2;
                                            zVar2 = e10;
                                            iArr13 = iArr9;
                                            i56 = i40 + k13;
                                            iArr12 = iArr7;
                                            objArr = kVarArr6;
                                            bArr4 = bArr;
                                            s14 = i61;
                                            i55 = i39;
                                        }
                                    }
                                    iArr7 = iArr8;
                                    kVarArr6 = kVarArr7;
                                    bArr = bArr2;
                                }
                                i56 = i40 + k13;
                                iArr12 = iArr7;
                                objArr = kVarArr6;
                                bArr4 = bArr;
                                s14 = i61;
                                i55 = i39;
                            }
                            i40 = i62;
                            i39 = i55;
                            iArr13 = iArr9;
                            iArr7 = iArr8;
                            kVarArr6 = kVarArr7;
                            bArr = bArr2;
                            i56 = i40 + k13;
                            iArr12 = iArr7;
                            objArr = kVarArr6;
                            bArr4 = bArr;
                            s14 = i61;
                            i55 = i39;
                        } else {
                            int[] iArr17 = iArr13;
                            int[] iArr18 = iArr12;
                            k[] kVarArr8 = objArr;
                            byte[] bArr5 = bArr4;
                            int i69 = i55;
                            z zVar3 = zVar2;
                            int i70 = 4;
                            boolean z12 = (fVar.f13052b & 8) != 0;
                            if (i57 != 0) {
                                fVar.f13063m = -1;
                                fVar.f13064n = 0;
                                fVar.f13065o = 0;
                                fVar.f13066p = 0;
                                Object[] objArr5 = new Object[s12];
                                fVar.f13067q = objArr5;
                                fVar.f13068r = 0;
                                fVar.f13069s = new Object[s11];
                                if (z12) {
                                    String str2 = fVar.f13056f;
                                    if ((fVar.f13054d & 8) != 0) {
                                        i37 = 0;
                                    } else if ("<init>".equals(fVar.f13055e)) {
                                        objArr5[0] = 6;
                                        i37 = 1;
                                    } else {
                                        objArr5[0] = o(this.f13008a + 2, fVar.f13053c);
                                        i37 = 1;
                                    }
                                    int i71 = 1;
                                    while (true) {
                                        int i72 = i71 + 1;
                                        char charAt = str2.charAt(i71);
                                        if (charAt == 'F') {
                                            objArr5[i37] = 2;
                                            i71 = i72;
                                            i37++;
                                        } else if (charAt != 'L') {
                                            if (charAt != 'S' && charAt != 'I') {
                                                if (charAt == 'J') {
                                                    i38 = i37 + 1;
                                                    objArr5[i37] = 4;
                                                } else if (charAt != 'Z') {
                                                    if (charAt != '[') {
                                                        switch (charAt) {
                                                            case 'B':
                                                            case 'C':
                                                                break;
                                                            case 'D':
                                                                i38 = i37 + 1;
                                                                objArr5[i37] = 3;
                                                                break;
                                                            default:
                                                                fVar.f13065o = i37;
                                                                break;
                                                        }
                                                    } else {
                                                        while (str2.charAt(i72) == '[') {
                                                            i72++;
                                                        }
                                                        if (str2.charAt(i72) == 'L') {
                                                            do {
                                                                i72++;
                                                            } while (str2.charAt(i72) != ';');
                                                            i38 = i37 + 1;
                                                            i72++;
                                                            objArr5[i37] = str2.substring(i71, i72);
                                                        } else {
                                                            i38 = i37 + 1;
                                                            i72++;
                                                            objArr5[i37] = str2.substring(i71, i72);
                                                        }
                                                    }
                                                }
                                                i71 = i72;
                                                i37 = i38;
                                            }
                                            i38 = i37 + 1;
                                            objArr5[i37] = 1;
                                            i71 = i72;
                                            i37 = i38;
                                        } else {
                                            int i73 = i72;
                                            while (str2.charAt(i73) != ';') {
                                                i73++;
                                            }
                                            i71 = i73 + 1;
                                            objArr5[i37] = str2.substring(i72, i73);
                                            i37++;
                                        }
                                    }
                                }
                                int i74 = i57;
                                while (true) {
                                    i11 = i58;
                                    if (i74 < i11 - 2) {
                                        if (bArr5[i74] != 8 || (s10 = s(i74 + 1)) < 0 || s10 >= k10) {
                                            kVarArr5 = kVarArr8;
                                        } else if ((bArr5[i44 + s10] & 255) == 187) {
                                            kVarArr5 = kVarArr8;
                                            b(s10, kVarArr5);
                                        } else {
                                            kVarArr5 = kVarArr8;
                                        }
                                        i74++;
                                        kVarArr8 = kVarArr5;
                                        i58 = i11;
                                    } else {
                                        kVarArr = kVarArr8;
                                    }
                                }
                            } else {
                                kVarArr = kVarArr8;
                                i11 = i58;
                            }
                            if (!z12 || (fVar.f13052b & 256) == 0) {
                                kVarArr2 = kVarArr;
                                zVar = zVar3;
                                i12 = 0;
                            } else {
                                kVarArr2 = kVarArr;
                                zVar = zVar3;
                                i12 = 0;
                                lVar.l(-1, s12, 0, null, null);
                            }
                            int[] iArr19 = iArr17;
                            int d10 = d(iArr19, i12);
                            int[] iArr20 = iArr14;
                            int d11 = d(iArr20, i12);
                            int i75 = (fVar.f13052b & 256) == 0 ? 33 : i12;
                            int i76 = d10;
                            int i77 = d11;
                            int i78 = i12;
                            int i79 = i78;
                            int i80 = i79;
                            int i81 = i44;
                            while (true) {
                                int i82 = i69;
                                if (i81 < i82) {
                                    int i83 = i81 - i44;
                                    i15 = s11;
                                    kVarArr3 = kVarArr2;
                                    k kVar5 = kVarArr3[i83];
                                    i16 = s12;
                                    if (kVar5 != null) {
                                        i18 = k10;
                                        boolean z13 = (fVar.f13052b & 2) == 0;
                                        lVar.s(kVar5);
                                        if (z13 && (kVar5.f13096a & 128) != 0) {
                                            lVar.u(kVar5.f13097b & 65535, kVar5);
                                            if (kVar5.f13098c != null) {
                                                int i84 = 1;
                                                while (true) {
                                                    int[] iArr21 = kVar5.f13098c;
                                                    i17 = i78;
                                                    if (i84 <= iArr21[0]) {
                                                        lVar.u(iArr21[i84], kVar5);
                                                        i84++;
                                                        i78 = i17;
                                                    }
                                                }
                                            }
                                        }
                                        i17 = i78;
                                    } else {
                                        i17 = i78;
                                        i18 = k10;
                                    }
                                    int i85 = i57;
                                    while (true) {
                                        if (i85 == 0) {
                                            i19 = i82;
                                            i20 = i81;
                                            iArr2 = iArr20;
                                            iArr3 = iArr19;
                                            cArr = cArr4;
                                            i21 = i85;
                                            i22 = 1;
                                        } else {
                                            int i86 = fVar.f13063m;
                                            if (i86 == i83 || i86 == -1) {
                                                if (i86 != -1) {
                                                    if (z11 && !z12) {
                                                        i31 = i81;
                                                        i30 = i82;
                                                        cArr3 = cArr4;
                                                        i32 = 64;
                                                        iArr5 = iArr20;
                                                        iArr6 = iArr19;
                                                        lVar.l(fVar.f13064n, fVar.f13066p, fVar.f13068r, fVar.f13067q, fVar.f13069s);
                                                    } else {
                                                        i30 = i82;
                                                        i31 = i81;
                                                        iArr5 = iArr20;
                                                        iArr6 = iArr19;
                                                        cArr3 = cArr4;
                                                        i32 = 64;
                                                        lVar.l(-1, fVar.f13065o, fVar.f13068r, fVar.f13067q, fVar.f13069s);
                                                    }
                                                    i17 = 0;
                                                } else {
                                                    i30 = i82;
                                                    i31 = i81;
                                                    iArr5 = iArr20;
                                                    iArr6 = iArr19;
                                                    cArr3 = cArr4;
                                                    i32 = 64;
                                                }
                                                if (i85 < i11) {
                                                    char[] cArr5 = fVar.f13053c;
                                                    k[] kVarArr9 = fVar.f13057g;
                                                    if (z11) {
                                                        int i87 = i85 + 1;
                                                        c10 = '\u00ff';
                                                        int i88 = bArr5[i85] & 255;
                                                        c11 = '\uffff';
                                                        i33 = 0;
                                                        i34 = i87;
                                                        i35 = i88;
                                                    } else {
                                                        c11 = '\uffff';
                                                        c10 = '\u00ff';
                                                        fVar.f13063m = -1;
                                                        i35 = 255;
                                                        i34 = i85;
                                                        i33 = 0;
                                                    }
                                                    fVar.f13066p = i33;
                                                    if (i35 < i32) {
                                                        fVar.f13064n = 3;
                                                        fVar.f13068r = i33;
                                                        kVarArr4 = kVarArr9;
                                                        i36 = 1;
                                                    } else if (i35 < 128) {
                                                        int i89 = i35 - 64;
                                                        kVarArr4 = kVarArr9;
                                                        int v10 = v(i34, fVar.f13069s, 0, cArr5, kVarArr4);
                                                        fVar.f13064n = i70;
                                                        fVar.f13068r = 1;
                                                        i34 = v10;
                                                        i36 = 1;
                                                        i35 = i89;
                                                    } else {
                                                        kVarArr4 = kVarArr9;
                                                        int i90 = i70;
                                                        if (i35 >= 247) {
                                                            int s22 = s(i34);
                                                            int i91 = i34 + 2;
                                                            if (i35 == 247) {
                                                                i36 = 1;
                                                                int v11 = v(i91, fVar.f13069s, 0, cArr5, kVarArr4);
                                                                fVar.f13064n = i90;
                                                                fVar.f13068r = 1;
                                                                i34 = v11;
                                                            } else {
                                                                i36 = 1;
                                                                if (i35 >= 248 && i35 < 251) {
                                                                    fVar.f13064n = 2;
                                                                    int i92 = 251 - i35;
                                                                    fVar.f13066p = i92;
                                                                    fVar.f13065o -= i92;
                                                                    fVar.f13068r = 0;
                                                                } else if (i35 == 251) {
                                                                    fVar.f13064n = 3;
                                                                    fVar.f13068r = 0;
                                                                } else if (i35 < 255) {
                                                                    int i93 = i35 - 251;
                                                                    int i94 = i93;
                                                                    i34 = i91;
                                                                    int i95 = z12 ? fVar.f13065o : 0;
                                                                    while (i94 > 0) {
                                                                        i34 = v(i34, fVar.f13067q, i95, cArr5, kVarArr4);
                                                                        i94--;
                                                                        i93 = i93;
                                                                        i95++;
                                                                        cArr5 = cArr5;
                                                                    }
                                                                    int i96 = i93;
                                                                    fVar.f13064n = 1;
                                                                    fVar.f13066p = i96;
                                                                    fVar.f13065o += i96;
                                                                    fVar.f13068r = 0;
                                                                } else {
                                                                    int s23 = s(i91);
                                                                    int i97 = i34 + 4;
                                                                    fVar.f13064n = 0;
                                                                    fVar.f13066p = s23;
                                                                    fVar.f13065o = s23;
                                                                    for (int i98 = 0; i98 < s23; i98++) {
                                                                        i97 = v(i97, fVar.f13067q, i98, cArr5, kVarArr4);
                                                                    }
                                                                    int s24 = s(i97);
                                                                    i34 = i97 + 2;
                                                                    fVar.f13068r = s24;
                                                                    for (int i99 = 0; i99 < s24; i99++) {
                                                                        i34 = v(i34, fVar.f13069s, i99, cArr5, kVarArr4);
                                                                    }
                                                                }
                                                                i34 = i91;
                                                            }
                                                            i35 = s22;
                                                        } else {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    }
                                                    int i100 = i35 + i36 + fVar.f13063m;
                                                    fVar.f13063m = i100;
                                                    b(i100, kVarArr4);
                                                    i85 = i34;
                                                    iArr19 = iArr6;
                                                    i81 = i31;
                                                    i82 = i30;
                                                    cArr4 = cArr3;
                                                    iArr20 = iArr5;
                                                    i70 = 4;
                                                } else {
                                                    iArr19 = iArr6;
                                                    i81 = i31;
                                                    i82 = i30;
                                                    cArr4 = cArr3;
                                                    iArr20 = iArr5;
                                                    i85 = 0;
                                                }
                                            } else {
                                                i19 = i82;
                                                i20 = i81;
                                                iArr2 = iArr20;
                                                cArr = cArr4;
                                                i21 = i85;
                                                i22 = 1;
                                                iArr3 = iArr19;
                                            }
                                        }
                                    }
                                } else {
                                    char[] cArr6 = cArr4;
                                    int i101 = s11;
                                    int i102 = s12;
                                    int i103 = k10;
                                    k[] kVarArr10 = kVarArr2;
                                    int[] iArr22 = iArr20;
                                    int[] iArr23 = iArr19;
                                    k kVar6 = kVarArr10[i103];
                                    if (kVar6 != null) {
                                        lVar.s(kVar6);
                                    }
                                    int i104 = i59;
                                    if (i104 != 0 && (fVar.f13052b & 2) == 0) {
                                        int i105 = i60;
                                        if (i105 != 0) {
                                            int s25 = s(i105) * 3;
                                            int[] iArr24 = new int[s25];
                                            int i106 = i105 + 2;
                                            while (s25 > 0) {
                                                iArr24[s25 - 1] = i106 + 6;
                                                iArr24[s25 - 2] = s(i106 + 8);
                                                s25 -= 3;
                                                iArr24[s25] = s(i106);
                                                i106 += 10;
                                            }
                                            iArr = iArr24;
                                        } else {
                                            iArr = null;
                                        }
                                        int s26 = s(i104);
                                        int i107 = i104 + 2;
                                        while (true) {
                                            int i108 = s26 - 1;
                                            if (s26 > 0) {
                                                int s27 = s(i107);
                                                int s28 = s(i107 + 2);
                                                String r11 = r(i107 + 4, cArr6);
                                                String r12 = r(i107 + 6, cArr6);
                                                int s29 = s(i107 + 8);
                                                int i109 = i107 + 10;
                                                if (iArr != null) {
                                                    for (int i110 = i12; i110 < iArr.length; i110 += 3) {
                                                        if (iArr[i110] == s27 && iArr[i110 + 1] == s29) {
                                                            str = r(iArr[i110 + 2], cArr6);
                                                            lVar.v(r11, r12, str, kVarArr10[s27], kVarArr10[s27 + s28], s29);
                                                            s26 = i108;
                                                            i107 = i109;
                                                        }
                                                    }
                                                }
                                                str = null;
                                                lVar.v(r11, r12, str, kVarArr10[s27], kVarArr10[s27 + s28], s29);
                                                s26 = i108;
                                                i107 = i109;
                                            }
                                        }
                                    }
                                    int i111 = 65;
                                    if (iArr23 != null) {
                                        int length = iArr23.length;
                                        int i112 = i12;
                                        while (i112 < length) {
                                            int i113 = iArr23[i112];
                                            int f6 = f(i113);
                                            if (f6 == 64 || f6 == i111) {
                                                int p10 = p(fVar, i113);
                                                i13 = i112;
                                                i14 = i12;
                                                j(lVar.w(fVar.f13058h, fVar.f13059i, fVar.f13060j, fVar.f13061k, fVar.f13062l, r(p10, cArr6), true), p10 + 2, true, cArr6);
                                            } else {
                                                i13 = i112;
                                                i14 = i12;
                                            }
                                            i112 = i13 + 1;
                                            i12 = i14;
                                            i111 = 65;
                                        }
                                    }
                                    int i114 = i12;
                                    if (iArr22 != null) {
                                        int length2 = iArr22.length;
                                        for (int i115 = i114; i115 < length2; i115++) {
                                            int i116 = iArr22[i115];
                                            int f10 = f(i116);
                                            if (f10 == 64 || f10 == 65) {
                                                int p11 = p(fVar, i116);
                                                j(lVar.w(fVar.f13058h, fVar.f13059i, fVar.f13060j, fVar.f13061k, fVar.f13062l, r(p11, cArr6), false), p11 + 2, true, cArr6);
                                            }
                                        }
                                    }
                                    while (true) {
                                        z zVar4 = zVar;
                                        if (zVar4 != null) {
                                            zVar = (z) zVar4.f34265h0;
                                            zVar4.f34265h0 = null;
                                            lVar.g(zVar4);
                                        } else {
                                            lVar.y(i101, i102);
                                            return;
                                        }
                                    }
                                }
                                i12 = 0;
                                i78 = i27;
                                i77 = i28;
                                i80 = i29;
                                i79 = i24;
                                i57 = i21;
                                kVarArr2 = kVarArr3;
                                iArr19 = iArr3;
                                z12 = z10;
                                i81 = i26;
                                s11 = i15;
                                k10 = i18;
                                i69 = i19;
                                i70 = 4;
                                i76 = i25;
                                cArr4 = cArr2;
                                iArr20 = iArr4;
                                s12 = i16;
                                i11 = i23;
                            }
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final Object h(int i10, char[] cArr) {
        boolean z10;
        int[] iArr = this.f13010c;
        int i11 = iArr[i10];
        byte[] bArr = this.f13009b;
        byte b10 = bArr[i11 - 1];
        switch (b10) {
            case 3:
                return Integer.valueOf(k(i11));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(k(i11)));
            case 5:
                return Long.valueOf(l(i11));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(l(i11)));
            case 7:
                return r.o(r(i11, cArr));
            case 8:
                return r(i11, cArr);
            default:
                switch (b10) {
                    case 15:
                        int f6 = f(i11);
                        int i12 = iArr[s(i11 + 1)];
                        int i13 = iArr[s(i12 + 2)];
                        String o10 = o(i12, cArr);
                        String r10 = r(i13, cArr);
                        String r11 = r(i13 + 2, cArr);
                        if (bArr[i12 - 1] == 11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return new j(f6, o10, r10, r11, z10);
                    case 16:
                        return r.n(r(i11, cArr));
                    case 17:
                        e[] eVarArr = this.f13012e;
                        e eVar = eVarArr[i10];
                        if (eVar == null) {
                            int i14 = iArr[s(i11 + 2)];
                            String r12 = r(i14, cArr);
                            String r13 = r(i14 + 2, cArr);
                            int i15 = this.f13013f[s(i11)];
                            j jVar = (j) h(s(i15), cArr);
                            int s10 = s(i15 + 2);
                            Object[] objArr = new Object[s10];
                            int i16 = i15 + 4;
                            for (int i17 = 0; i17 < s10; i17++) {
                                objArr[i17] = h(s(i16), cArr);
                                i16 += 2;
                            }
                            e eVar2 = new e(r12, r13, jVar, objArr);
                            eVarArr[i10] = eVar2;
                            return eVar2;
                        }
                        return eVar;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public final int i(io.sentry.vendor.b bVar, int i10, String str, char[] cArr) {
        Object obj;
        boolean z10;
        byte[] bArr = this.f13009b;
        int i11 = 0;
        if (bVar == null) {
            int i12 = bArr[i10] & 255;
            if (i12 != 64) {
                if (i12 != 91) {
                    if (i12 != 101) {
                        return i10 + 3;
                    }
                    return i10 + 5;
                }
                return j(null, i10 + 1, false, cArr);
            }
            return j(null, i10 + 3, true, cArr);
        }
        int i13 = i10 + 1;
        int i14 = bArr[i10] & 255;
        if (i14 != 64) {
            if (i14 != 70) {
                int[] iArr = this.f13010c;
                if (i14 != 83) {
                    if (i14 != 99) {
                        if (i14 != 101) {
                            if (i14 != 115) {
                                if (i14 != 73 && i14 != 74) {
                                    if (i14 != 90) {
                                        if (i14 != 91) {
                                            switch (i14) {
                                                case 66:
                                                    bVar.b(str, Byte.valueOf((byte) k(iArr[s(i13)])));
                                                    break;
                                                case 67:
                                                    bVar.b(str, Character.valueOf((char) k(iArr[s(i13)])));
                                                    break;
                                                case 68:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        } else {
                                            int s10 = s(i13);
                                            int i15 = i10 + 3;
                                            if (s10 == 0) {
                                                return j(bVar.e(str), i10 + 1, false, cArr);
                                            }
                                            int i16 = bArr[i15] & 255;
                                            if (i16 != 70) {
                                                if (i16 != 83) {
                                                    if (i16 != 90) {
                                                        if (i16 != 73) {
                                                            if (i16 != 74) {
                                                                switch (i16) {
                                                                    case 66:
                                                                        byte[] bArr2 = new byte[s10];
                                                                        while (i11 < s10) {
                                                                            bArr2[i11] = (byte) k(iArr[s(i15 + 1)]);
                                                                            i15 += 3;
                                                                            i11++;
                                                                        }
                                                                        bVar.b(str, bArr2);
                                                                        break;
                                                                    case 67:
                                                                        char[] cArr2 = new char[s10];
                                                                        while (i11 < s10) {
                                                                            cArr2[i11] = (char) k(iArr[s(i15 + 1)]);
                                                                            i15 += 3;
                                                                            i11++;
                                                                        }
                                                                        bVar.b(str, cArr2);
                                                                        break;
                                                                    case 68:
                                                                        double[] dArr = new double[s10];
                                                                        while (i11 < s10) {
                                                                            dArr[i11] = Double.longBitsToDouble(l(iArr[s(i15 + 1)]));
                                                                            i15 += 3;
                                                                            i11++;
                                                                        }
                                                                        bVar.b(str, dArr);
                                                                        break;
                                                                    default:
                                                                        return j(bVar.e(str), i10 + 1, false, cArr);
                                                                }
                                                            } else {
                                                                long[] jArr = new long[s10];
                                                                while (i11 < s10) {
                                                                    jArr[i11] = l(iArr[s(i15 + 1)]);
                                                                    i15 += 3;
                                                                    i11++;
                                                                }
                                                                bVar.b(str, jArr);
                                                            }
                                                        } else {
                                                            int[] iArr2 = new int[s10];
                                                            while (i11 < s10) {
                                                                iArr2[i11] = k(iArr[s(i15 + 1)]);
                                                                i15 += 3;
                                                                i11++;
                                                            }
                                                            bVar.b(str, iArr2);
                                                        }
                                                    } else {
                                                        boolean[] zArr = new boolean[s10];
                                                        for (int i17 = 0; i17 < s10; i17++) {
                                                            if (k(iArr[s(i15 + 1)]) != 0) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            zArr[i17] = z10;
                                                            i15 += 3;
                                                        }
                                                        bVar.b(str, zArr);
                                                    }
                                                } else {
                                                    short[] sArr = new short[s10];
                                                    while (i11 < s10) {
                                                        sArr[i11] = (short) k(iArr[s(i15 + 1)]);
                                                        i15 += 3;
                                                        i11++;
                                                    }
                                                    bVar.b(str, sArr);
                                                }
                                            } else {
                                                float[] fArr = new float[s10];
                                                while (i11 < s10) {
                                                    fArr[i11] = Float.intBitsToFloat(k(iArr[s(i15 + 1)]));
                                                    i15 += 3;
                                                    i11++;
                                                }
                                                bVar.b(str, fArr);
                                            }
                                            return i15;
                                        }
                                    } else {
                                        if (k(iArr[s(i13)]) == 0) {
                                            obj = Boolean.FALSE;
                                        } else {
                                            obj = Boolean.TRUE;
                                        }
                                        bVar.b(str, obj);
                                    }
                                }
                            } else {
                                bVar.b(str, r(i13, cArr));
                            }
                        } else {
                            bVar.h(str, r(i13, cArr), r(i10 + 3, cArr));
                            return i10 + 5;
                        }
                    } else {
                        bVar.b(str, r.u(r(i13, cArr)));
                    }
                } else {
                    bVar.b(str, Short.valueOf((short) k(iArr[s(i13)])));
                }
                return i10 + 3;
            }
            bVar.b(str, h(s(i13), cArr));
            return i10 + 3;
        }
        return j(bVar.c(str, r(i13, cArr)), i10 + 3, true, cArr);
    }

    public final int j(io.sentry.vendor.b bVar, int i10, boolean z10, char[] cArr) {
        int s10 = s(i10);
        int i11 = i10 + 2;
        if (!z10) {
            while (true) {
                int i12 = s10 - 1;
                if (s10 <= 0) {
                    break;
                }
                i11 = i(bVar, i11, null, cArr);
                s10 = i12;
            }
        } else {
            while (true) {
                int i13 = s10 - 1;
                if (s10 <= 0) {
                    break;
                }
                i11 = i(bVar, i11 + 2, r(i11, cArr), cArr);
                s10 = i13;
            }
        }
        if (bVar != null) {
            bVar.g();
        }
        return i11;
    }

    public final int k(int i10) {
        byte[] bArr = this.f13009b;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final long l(int i10) {
        return (k(i10) << 32) | (k(i10 + 4) & 4294967295L);
    }

    public final void m(l lVar, f fVar, int i10, boolean z10) {
        int i11 = i10 + 1;
        int i12 = this.f13009b[i10] & 255;
        lVar.d(i12, z10);
        char[] cArr = fVar.f13053c;
        for (int i13 = 0; i13 < i12; i13++) {
            int s10 = s(i11);
            i11 += 2;
            while (true) {
                int i14 = s10 - 1;
                if (s10 > 0) {
                    i11 = j(lVar.C(r(i11, cArr), i13, z10), i11 + 2, true, cArr);
                    s10 = i14;
                }
            }
        }
    }

    public final short n(int i10) {
        byte[] bArr = this.f13009b;
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String o(int i10, char[] cArr) {
        return r(this.f13010c[s(i10)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(f fVar, int i10) {
        int i11;
        int i12;
        int f6;
        I5.h hVar;
        int k10 = k(i10);
        int i13 = k10 >>> 24;
        if (i13 != 0 && i13 != 1) {
            switch (i13) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i12 = k10 & (-256);
                    i11 = i10 + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i12 = k10 & (-16777216);
                    i11 = i10 + 1;
                    break;
                case 22:
                    break;
                default:
                    switch (i13) {
                        case 64:
                        case 65:
                            i12 = k10 & (-16777216);
                            int s10 = s(i10 + 1);
                            i11 = i10 + 3;
                            fVar.f13060j = new k[s10];
                            fVar.f13061k = new k[s10];
                            fVar.f13062l = new int[s10];
                            for (int i14 = 0; i14 < s10; i14++) {
                                int s11 = s(i11);
                                int s12 = s(i11 + 2);
                                int s13 = s(i11 + 4);
                                i11 += 6;
                                fVar.f13060j[i14] = b(s11, fVar.f13057g);
                                fVar.f13061k[i14] = b(s11 + s12, fVar.f13057g);
                                fVar.f13062l[i14] = s13;
                            }
                            break;
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i12 = k10 & (-16777216);
                            i11 = i10 + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i12 = k10 & (-16776961);
                            i11 = i10 + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            fVar.f13058h = i12;
            f6 = f(i11);
            if (f6 != 0) {
                hVar = null;
            } else {
                hVar = new I5.h(this.f13009b, i11, 2);
            }
            fVar.f13059i = hVar;
            return (f6 * 2) + i11 + 1;
        }
        i12 = k10 & (-65536);
        i11 = i10 + 2;
        fVar.f13058h = i12;
        f6 = f(i11);
        if (f6 != 0) {
        }
        fVar.f13059i = hVar;
        return (f6 * 2) + i11 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] q(l lVar, f fVar, int i10, boolean z10) {
        int i11;
        char[] cArr = fVar.f13053c;
        int s10 = s(i10);
        int[] iArr = new int[s10];
        int i12 = i10 + 2;
        for (int i13 = 0; i13 < s10; i13++) {
            iArr[i13] = i12;
            int k10 = k(i12);
            int i14 = k10 >>> 24;
            if (i14 != 23) {
                switch (i14) {
                    default:
                        switch (i14) {
                            case 64:
                            case 65:
                                int s11 = s(i12 + 1);
                                i11 = i12 + 3;
                                while (true) {
                                    int i15 = s11 - 1;
                                    if (s11 <= 0) {
                                        break;
                                    } else {
                                        int s12 = s(i11);
                                        int s13 = s(i11 + 2);
                                        i11 += 6;
                                        b(s12, fVar.f13057g);
                                        b(s12 + s13, fVar.f13057g);
                                        s11 = i15;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i11 = i12 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i11 = i12 + 3;
                        break;
                }
                int f6 = f(i11);
                I5.h hVar = null;
                if (i14 != 66) {
                    if (f6 != 0) {
                        hVar = new I5.h(this.f13009b, i11, 2);
                    }
                    int i16 = (f6 * 2) + 1 + i11;
                    i12 = j(lVar.E(k10 & (-256), hVar, r(i16, cArr), z10), i16 + 2, true, cArr);
                } else {
                    i12 = j(null, (f6 * 2) + 3 + i11, true, cArr);
                }
            }
            i11 = i12 + 3;
            int f62 = f(i11);
            I5.h hVar2 = null;
            if (i14 != 66) {
            }
        }
        return iArr;
    }

    public final String r(int i10, char[] cArr) {
        int s10 = s(i10);
        if (i10 != 0 && s10 != 0) {
            return t(s10, cArr);
        }
        return null;
    }

    public final int s(int i10) {
        byte[] bArr = this.f13009b;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final String t(int i10, char[] cArr) {
        String[] strArr = this.f13011d;
        String str = strArr[i10];
        if (str != null) {
            return str;
        }
        int i11 = this.f13010c[i10];
        String u10 = u(cArr, i11 + 2, s(i11));
        strArr[i10] = u10;
        return u10;
    }

    public final String u(char[] cArr, int i10, int i11) {
        int i12;
        int i13 = i11 + i10;
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte[] bArr = this.f13009b;
            byte b10 = bArr[i10];
            if ((b10 & 128) == 0) {
                cArr[i14] = (char) (b10 & Byte.MAX_VALUE);
                i14++;
                i10 = i15;
            } else {
                if ((b10 & 224) == 192) {
                    i12 = i14 + 1;
                    i10 += 2;
                    cArr[i14] = (char) (((b10 & 31) << 6) + (bArr[i15] & 63));
                } else {
                    i12 = i14 + 1;
                    int i16 = i10 + 2;
                    i10 += 3;
                    cArr[i14] = (char) (((b10 & 15) << 12) + ((bArr[i15] & 63) << 6) + (bArr[i16] & 63));
                }
                i14 = i12;
            }
        }
        return new String(cArr, 0, i14);
    }

    public final int v(int i10, Object[] objArr, int i11, char[] cArr, k[] kVarArr) {
        int i12 = i10 + 1;
        switch (this.f13009b[i10] & 255) {
            case 0:
                objArr[i11] = 0;
                return i12;
            case 1:
                objArr[i11] = 1;
                return i12;
            case 2:
                objArr[i11] = 2;
                return i12;
            case 3:
                objArr[i11] = 3;
                return i12;
            case 4:
                objArr[i11] = 4;
                return i12;
            case 5:
                objArr[i11] = 5;
                return i12;
            case 6:
                objArr[i11] = 6;
                return i12;
            case 7:
                objArr[i11] = o(i12, cArr);
                break;
            case 8:
                objArr[i11] = b(s(i12), kVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i10 + 3;
    }
}
