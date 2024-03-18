package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class W implements AbstractC2022g0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f25008o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f25009p = x0.l();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f25010a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f25011b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25012c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25013d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC2011b f25014e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25015f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f25016g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f25017h;

    /* renamed from: i  reason: collision with root package name */
    public final int f25018i;

    /* renamed from: j  reason: collision with root package name */
    public final int f25019j;

    /* renamed from: k  reason: collision with root package name */
    public final Y f25020k;

    /* renamed from: l  reason: collision with root package name */
    public final K f25021l;

    /* renamed from: m  reason: collision with root package name */
    public final p0 f25022m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f25023n;

    public W(int[] iArr, Object[] objArr, int i10, int i11, AbstractC2011b abstractC2011b, boolean z10, int[] iArr2, int i12, int i13, Y y10, K k10, p0 p0Var, C2033s c2033s, Q q10) {
        this.f25010a = iArr;
        this.f25011b = objArr;
        this.f25012c = i10;
        this.f25013d = i11;
        this.f25015f = abstractC2011b instanceof AbstractC2040z;
        this.f25016g = z10;
        this.f25017h = iArr2;
        this.f25018i = i12;
        this.f25019j = i13;
        this.f25020k = y10;
        this.f25021l = k10;
        this.f25022m = p0Var;
        this.f25014e = abstractC2011b;
        this.f25023n = q10;
    }

    public static int A(long j6, Object obj) {
        return ((Integer) x0.f25132d.i(j6, obj)).intValue();
    }

    public static long B(long j6, Object obj) {
        return ((Long) x0.f25132d.i(j6, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder s10 = android.gov.nist.core.a.s("Field ", str, " for ");
            s10.append(cls.getName());
            s10.append(" not found. Known fields are ");
            s10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(s10.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void O(int i10, Object obj, J0.a aVar) {
        if (obj instanceof String) {
            ((AbstractC2031p) aVar.f8729Y).V(i10, (String) obj);
            return;
        }
        aVar.U(i10, (AbstractC2025j) obj);
    }

    public static List s(long j6, Object obj) {
        return (List) x0.f25132d.i(j6, obj);
    }

    public static W x(T t10, Y y10, K k10, p0 p0Var, C2033s c2033s, Q q10) {
        if (t10 instanceof C2018e0) {
            return y((C2018e0) t10, y10, k10, p0Var, c2033s, q10);
        }
        AbstractC2469q0.p(t10);
        throw null;
    }

    public static W y(C2018e0 c2018e0, Y y10, K k10, p0 p0Var, C2033s c2033s, Q q10) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        char c10;
        String str;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Field H6;
        int i32;
        char charAt;
        int i33;
        int i34;
        int i35;
        Field H10;
        Field field;
        int i36;
        char charAt2;
        int i37;
        char charAt3;
        int i38;
        char charAt4;
        int i39;
        int i40;
        char charAt5;
        int i41;
        char charAt6;
        int i42;
        char charAt7;
        int i43;
        char charAt8;
        int i44;
        char charAt9;
        int i45;
        char charAt10;
        int i46;
        char charAt11;
        int i47;
        char charAt12;
        int i48;
        char charAt13;
        char charAt14;
        int i49 = 0;
        if (c2018e0.d() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String c11 = c2018e0.c();
        int length = c11.length();
        int charAt15 = c11.charAt(0);
        if (charAt15 >= 55296) {
            int i50 = charAt15 & 8191;
            int i51 = 1;
            int i52 = 13;
            while (true) {
                i10 = i51 + 1;
                charAt14 = c11.charAt(i51);
                if (charAt14 < '\ud800') {
                    break;
                }
                i50 |= (charAt14 & '\u1fff') << i52;
                i52 += 13;
                i51 = i10;
            }
            charAt15 = i50 | (charAt14 << i52);
        } else {
            i10 = 1;
        }
        int i53 = i10 + 1;
        int charAt16 = c11.charAt(i10);
        if (charAt16 >= 55296) {
            int i54 = charAt16 & 8191;
            int i55 = 13;
            while (true) {
                i48 = i53 + 1;
                charAt13 = c11.charAt(i53);
                if (charAt13 < '\ud800') {
                    break;
                }
                i54 |= (charAt13 & '\u1fff') << i55;
                i55 += 13;
                i53 = i48;
            }
            charAt16 = i54 | (charAt13 << i55);
            i53 = i48;
        }
        if (charAt16 == 0) {
            i16 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            iArr = f25008o;
            i15 = 0;
        } else {
            int i56 = i53 + 1;
            int charAt17 = c11.charAt(i53);
            if (charAt17 >= 55296) {
                int i57 = charAt17 & 8191;
                int i58 = 13;
                while (true) {
                    i47 = i56 + 1;
                    charAt12 = c11.charAt(i56);
                    if (charAt12 < '\ud800') {
                        break;
                    }
                    i57 |= (charAt12 & '\u1fff') << i58;
                    i58 += 13;
                    i56 = i47;
                }
                charAt17 = i57 | (charAt12 << i58);
                i56 = i47;
            }
            int i59 = i56 + 1;
            int charAt18 = c11.charAt(i56);
            if (charAt18 >= 55296) {
                int i60 = charAt18 & 8191;
                int i61 = 13;
                while (true) {
                    i46 = i59 + 1;
                    charAt11 = c11.charAt(i59);
                    if (charAt11 < '\ud800') {
                        break;
                    }
                    i60 |= (charAt11 & '\u1fff') << i61;
                    i61 += 13;
                    i59 = i46;
                }
                charAt18 = i60 | (charAt11 << i61);
                i59 = i46;
            }
            int i62 = i59 + 1;
            i14 = c11.charAt(i59);
            if (i14 >= 55296) {
                int i63 = i14 & 8191;
                int i64 = 13;
                while (true) {
                    i45 = i62 + 1;
                    charAt10 = c11.charAt(i62);
                    if (charAt10 < '\ud800') {
                        break;
                    }
                    i63 |= (charAt10 & '\u1fff') << i64;
                    i64 += 13;
                    i62 = i45;
                }
                i14 = i63 | (charAt10 << i64);
                i62 = i45;
            }
            int i65 = i62 + 1;
            i13 = c11.charAt(i62);
            if (i13 >= 55296) {
                int i66 = i13 & 8191;
                int i67 = 13;
                while (true) {
                    i44 = i65 + 1;
                    charAt9 = c11.charAt(i65);
                    if (charAt9 < '\ud800') {
                        break;
                    }
                    i66 |= (charAt9 & '\u1fff') << i67;
                    i67 += 13;
                    i65 = i44;
                }
                i13 = i66 | (charAt9 << i67);
                i65 = i44;
            }
            int i68 = i65 + 1;
            int charAt19 = c11.charAt(i65);
            if (charAt19 >= 55296) {
                int i69 = charAt19 & 8191;
                int i70 = 13;
                while (true) {
                    i43 = i68 + 1;
                    charAt8 = c11.charAt(i68);
                    if (charAt8 < '\ud800') {
                        break;
                    }
                    i69 |= (charAt8 & '\u1fff') << i70;
                    i70 += 13;
                    i68 = i43;
                }
                charAt19 = i69 | (charAt8 << i70);
                i68 = i43;
            }
            int i71 = i68 + 1;
            int charAt20 = c11.charAt(i68);
            if (charAt20 >= 55296) {
                int i72 = charAt20 & 8191;
                int i73 = 13;
                while (true) {
                    i42 = i71 + 1;
                    charAt7 = c11.charAt(i71);
                    if (charAt7 < '\ud800') {
                        break;
                    }
                    i72 |= (charAt7 & '\u1fff') << i73;
                    i73 += 13;
                    i71 = i42;
                }
                charAt20 = i72 | (charAt7 << i73);
                i71 = i42;
            }
            int i74 = i71 + 1;
            int charAt21 = c11.charAt(i71);
            if (charAt21 >= 55296) {
                int i75 = charAt21 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i41 = i76 + 1;
                    charAt6 = c11.charAt(i76);
                    if (charAt6 < '\ud800') {
                        break;
                    }
                    i75 |= (charAt6 & '\u1fff') << i77;
                    i77 += 13;
                    i76 = i41;
                }
                charAt21 = i75 | (charAt6 << i77);
                i39 = i41;
            } else {
                i39 = i74;
            }
            int i78 = i39 + 1;
            int charAt22 = c11.charAt(i39);
            if (charAt22 >= 55296) {
                int i79 = charAt22 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    charAt5 = c11.charAt(i80);
                    if (charAt5 < '\ud800') {
                        break;
                    }
                    i79 |= (charAt5 & '\u1fff') << i81;
                    i81 += 13;
                    i80 = i40;
                }
                charAt22 = i79 | (charAt5 << i81);
                i78 = i40;
            }
            i11 = (charAt17 * 2) + charAt18;
            i15 = charAt20;
            i12 = charAt22;
            i49 = charAt17;
            i53 = i78;
            int i82 = charAt19;
            iArr = new int[charAt22 + charAt20 + charAt21];
            i16 = i82;
        }
        Object[] b10 = c2018e0.b();
        Class<?> cls = c2018e0.a().getClass();
        int[] iArr2 = new int[i16 * 3];
        Object[] objArr = new Object[i16 * 2];
        int i83 = i12 + i15;
        int i84 = i12;
        int i85 = i83;
        int i86 = 0;
        int i87 = 0;
        while (i53 < length) {
            int i88 = i53 + 1;
            int charAt23 = c11.charAt(i53);
            if (charAt23 >= 55296) {
                int i89 = charAt23 & 8191;
                int i90 = i88;
                int i91 = 13;
                while (true) {
                    i38 = i90 + 1;
                    charAt4 = c11.charAt(i90);
                    i17 = length;
                    if (charAt4 < '\ud800') {
                        break;
                    }
                    i89 |= (charAt4 & '\u1fff') << i91;
                    i91 += 13;
                    i90 = i38;
                    length = i17;
                }
                charAt23 = i89 | (charAt4 << i91);
                i18 = i38;
            } else {
                i17 = length;
                i18 = i88;
            }
            int i92 = i18 + 1;
            int charAt24 = c11.charAt(i18);
            if (charAt24 >= 55296) {
                int i93 = charAt24 & 8191;
                int i94 = i92;
                int i95 = 13;
                while (true) {
                    i37 = i94 + 1;
                    charAt3 = c11.charAt(i94);
                    i19 = i12;
                    if (charAt3 < '\ud800') {
                        break;
                    }
                    i93 |= (charAt3 & '\u1fff') << i95;
                    i95 += 13;
                    i94 = i37;
                    i12 = i19;
                }
                charAt24 = i93 | (charAt3 << i95);
                i20 = i37;
            } else {
                i19 = i12;
                i20 = i92;
            }
            int i96 = charAt24 & 255;
            boolean z11 = z10;
            if ((charAt24 & 1024) != 0) {
                iArr[i86] = i87;
                i86++;
            }
            Unsafe unsafe = f25009p;
            int i97 = i86;
            if (i96 >= 51) {
                int i98 = i20 + 1;
                int charAt25 = c11.charAt(i20);
                if (charAt25 >= 55296) {
                    int i99 = charAt25 & 8191;
                    int i100 = i98;
                    int i101 = 13;
                    while (true) {
                        i36 = i100 + 1;
                        charAt2 = c11.charAt(i100);
                        i21 = i13;
                        if (charAt2 < '\ud800') {
                            break;
                        }
                        i99 |= (charAt2 & '\u1fff') << i101;
                        i101 += 13;
                        i100 = i36;
                        i13 = i21;
                    }
                    charAt25 = i99 | (charAt2 << i101);
                    i34 = i36;
                } else {
                    i21 = i13;
                    i34 = i98;
                }
                int i102 = i96 - 51;
                int i103 = i34;
                if (i102 != 9 && i102 != 17) {
                    if (i102 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i87 / 3) * 2) + 1] = b10[i11];
                        i11++;
                    }
                    i35 = 2;
                } else {
                    i35 = 2;
                    objArr[((i87 / 3) * 2) + 1] = b10[i11];
                    i11++;
                }
                int i104 = charAt25 * i35;
                Object obj = b10[i104];
                if (obj instanceof Field) {
                    H10 = (Field) obj;
                } else {
                    H10 = H(cls, (String) obj);
                    b10[i104] = H10;
                }
                i22 = i14;
                i25 = (int) unsafe.objectFieldOffset(H10);
                int i105 = i104 + 1;
                Object obj2 = b10[i105];
                if (obj2 instanceof Field) {
                    field = (Field) obj2;
                } else {
                    field = H(cls, (String) obj2);
                    b10[i105] = field;
                }
                i23 = charAt24;
                i27 = i11;
                i24 = i103;
                c10 = 2;
                str = c11;
                i28 = (int) unsafe.objectFieldOffset(field);
                i26 = 0;
            } else {
                i22 = i14;
                i21 = i13;
                int i106 = i11 + 1;
                Field H11 = H(cls, (String) b10[i11]);
                if (i96 == 9 || i96 == 17) {
                    i23 = charAt24;
                    i31 = 1;
                    objArr[((i87 / 3) * 2) + 1] = H11.getType();
                } else {
                    if (i96 == 27 || i96 == 49) {
                        i23 = charAt24;
                        i31 = 1;
                        i33 = i11 + 2;
                        objArr[((i87 / 3) * 2) + 1] = b10[i106];
                    } else if (i96 != 12 && i96 != 30 && i96 != 44) {
                        if (i96 == 50) {
                            int i107 = i84 + 1;
                            iArr[i84] = i87;
                            int i108 = (i87 / 3) * 2;
                            int i109 = i11 + 2;
                            objArr[i108] = b10[i106];
                            if ((charAt24 & 2048) != 0) {
                                i106 = i11 + 3;
                                objArr[i108 + 1] = b10[i109];
                                i23 = charAt24;
                                i84 = i107;
                                i31 = 1;
                            } else {
                                i84 = i107;
                                i106 = i109;
                            }
                        }
                        i23 = charAt24;
                        i31 = 1;
                    } else {
                        i23 = charAt24;
                        i31 = 1;
                        if ((charAt15 & 1) == 1) {
                            i33 = i11 + 2;
                            objArr[((i87 / 3) * 2) + 1] = b10[i106];
                        }
                    }
                    i106 = i33;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(H11);
                if ((charAt15 & 1) == i31 && i96 <= 17) {
                    i24 = i20 + 1;
                    int charAt26 = c11.charAt(i20);
                    if (charAt26 >= 55296) {
                        int i110 = charAt26 & 8191;
                        int i111 = 13;
                        while (true) {
                            i32 = i24 + 1;
                            charAt = c11.charAt(i24);
                            if (charAt < '\ud800') {
                                break;
                            }
                            i110 |= (charAt & '\u1fff') << i111;
                            i111 += 13;
                            i24 = i32;
                        }
                        charAt26 = i110 | (charAt << i111);
                        i24 = i32;
                    }
                    c10 = 2;
                    int i112 = (charAt26 / 32) + (i49 * 2);
                    Object obj3 = b10[i112];
                    if (obj3 instanceof Field) {
                        H6 = (Field) obj3;
                    } else {
                        H6 = H(cls, (String) obj3);
                        b10[i112] = H6;
                    }
                    str = c11;
                    i28 = (int) unsafe.objectFieldOffset(H6);
                    i26 = charAt26 % 32;
                } else {
                    str = c11;
                    c10 = 2;
                    i24 = i20;
                    i28 = 0;
                    i26 = 0;
                }
                if (i96 >= 18 && i96 <= 49) {
                    iArr[i85] = objectFieldOffset;
                    i85++;
                }
                i27 = i106;
                i25 = objectFieldOffset;
            }
            int i113 = i87 + 1;
            iArr2[i87] = charAt23;
            int i114 = i87 + 2;
            int i115 = i27;
            int i116 = i23;
            if ((i116 & 512) != 0) {
                i29 = 536870912;
            } else {
                i29 = 0;
            }
            if ((i116 & 256) != 0) {
                i30 = 268435456;
            } else {
                i30 = 0;
            }
            iArr2[i113] = i29 | i30 | (i96 << 20) | i25;
            i87 += 3;
            iArr2[i114] = i28 | (i26 << 20);
            i53 = i24;
            c11 = str;
            z10 = z11;
            i11 = i115;
            length = i17;
            i12 = i19;
            i86 = i97;
            i14 = i22;
            i13 = i21;
        }
        return new W(iArr2, objArr, i14, i13, c2018e0.a(), z10, iArr, i12, i83, y10, k10, p0Var, c2033s, q10);
    }

    public static long z(int i10) {
        return i10 & 1048575;
    }

    public final int C(int i10) {
        if (i10 < this.f25012c || i10 > this.f25013d) {
            return -1;
        }
        int[] iArr = this.f25010a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void D(Object obj, long j6, AbstractC2020f0 abstractC2020f0, AbstractC2022g0 abstractC2022g0, r rVar) {
        abstractC2020f0.C(this.f25021l.c(j6, obj), abstractC2022g0, rVar);
    }

    public final void E(Object obj, int i10, AbstractC2020f0 abstractC2020f0, AbstractC2022g0 abstractC2022g0, r rVar) {
        abstractC2020f0.G(this.f25021l.c(i10 & 1048575, obj), abstractC2022g0, rVar);
    }

    public final void F(Object obj, int i10, AbstractC2020f0 abstractC2020f0) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x0.r(i10 & 1048575, obj, abstractC2020f0.J());
        } else if (this.f25015f) {
            x0.r(i10 & 1048575, obj, abstractC2020f0.v());
        } else {
            x0.r(i10 & 1048575, obj, abstractC2020f0.z());
        }
    }

    public final void G(Object obj, int i10, AbstractC2020f0 abstractC2020f0) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        K k10 = this.f25021l;
        if (z10) {
            abstractC2020f0.y(k10.c(i10 & 1048575, obj));
        } else {
            abstractC2020f0.x(k10.c(i10 & 1048575, obj));
        }
    }

    public final void I(int i10, Object obj) {
        if (this.f25016g) {
            return;
        }
        int i11 = this.f25010a[i10 + 2];
        long j6 = i11 & 1048575;
        x0.p(j6, obj, x0.f25132d.g(j6, obj) | (1 << (i11 >>> 20)));
    }

    public final void J(int i10, Object obj, int i11) {
        x0.p(this.f25010a[i11 + 2] & 1048575, obj, i10);
    }

    public final int L(int i10) {
        return this.f25010a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, J0.a aVar) {
        int i10;
        boolean z10;
        int[] iArr = this.f25010a;
        int length = iArr.length;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int L10 = L(i13);
            int i14 = iArr[i13];
            int K10 = K(L10);
            boolean z11 = this.f25016g;
            Unsafe unsafe = f25009p;
            if (!z11 && K10 <= 17) {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i12 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            long j6 = L10 & 1048575;
            switch (K10) {
                case 0:
                    if ((i10 & i12) != 0) {
                        aVar.V(i14, x0.f25132d.e(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i12) != 0) {
                        aVar.Z(i14, x0.f25132d.f(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i12) != 0) {
                        aVar.c0(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i12) != 0) {
                        aVar.j0(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i12) != 0) {
                        aVar.b0(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i12) != 0) {
                        aVar.Y(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i12) != 0) {
                        aVar.X(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i12) != 0) {
                        aVar.T(i14, x0.f25132d.c(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i12) != 0) {
                        O(i14, unsafe.getObject(obj, j6), aVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i10 & i12) != 0) {
                        aVar.d0(i14, n(i13), unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i12) != 0) {
                        aVar.U(i14, (AbstractC2025j) unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i12) != 0) {
                        aVar.i0(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i12) != 0) {
                        aVar.W(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i12) != 0) {
                        aVar.e0(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i12) != 0) {
                        aVar.f0(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i12) != 0) {
                        aVar.g0(i14, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i12) != 0) {
                        aVar.h0(i14, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i12) != 0) {
                        aVar.a0(i14, n(i13), unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h0.F(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 19:
                    h0.J(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 20:
                    h0.M(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 21:
                    h0.U(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 22:
                    h0.L(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 23:
                    h0.I(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 24:
                    h0.H(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 25:
                    h0.D(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 26:
                    h0.S(iArr[i13], (List) unsafe.getObject(obj, j6), aVar);
                    break;
                case 27:
                    h0.N(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, n(i13));
                    break;
                case 28:
                    h0.E(iArr[i13], (List) unsafe.getObject(obj, j6), aVar);
                    break;
                case 29:
                    z10 = false;
                    h0.T(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 30:
                    z10 = false;
                    h0.G(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 31:
                    z10 = false;
                    h0.O(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 32:
                    z10 = false;
                    h0.P(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 33:
                    z10 = false;
                    h0.Q(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 34:
                    z10 = false;
                    h0.R(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 35:
                    h0.F(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 36:
                    h0.J(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 37:
                    h0.M(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 38:
                    h0.U(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 39:
                    h0.L(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 40:
                    h0.I(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 41:
                    h0.H(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 42:
                    h0.D(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 43:
                    h0.T(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 44:
                    h0.G(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 45:
                    h0.O(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 46:
                    h0.P(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 47:
                    h0.Q(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case r9.y.f44626f /* 48 */:
                    h0.R(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 49:
                    h0.K(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, n(i13));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    N(aVar, i14, unsafe.getObject(obj, j6), i13);
                    break;
                case 51:
                    if (r(i14, obj, i13)) {
                        aVar.V(i14, ((Double) x0.f25132d.i(j6, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (r(i14, obj, i13)) {
                        aVar.Z(i14, ((Float) x0.f25132d.i(j6, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (r(i14, obj, i13)) {
                        aVar.c0(i14, B(j6, obj));
                    }
                    break;
                case 54:
                    if (r(i14, obj, i13)) {
                        aVar.j0(i14, B(j6, obj));
                    }
                    break;
                case 55:
                    if (r(i14, obj, i13)) {
                        aVar.b0(i14, A(j6, obj));
                    }
                    break;
                case 56:
                    if (r(i14, obj, i13)) {
                        aVar.Y(i14, B(j6, obj));
                    }
                    break;
                case 57:
                    if (r(i14, obj, i13)) {
                        aVar.X(i14, A(j6, obj));
                    }
                    break;
                case 58:
                    if (r(i14, obj, i13)) {
                        aVar.T(i14, ((Boolean) x0.f25132d.i(j6, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i14, obj, i13)) {
                        O(i14, unsafe.getObject(obj, j6), aVar);
                    }
                    break;
                case 60:
                    if (r(i14, obj, i13)) {
                        aVar.d0(i14, n(i13), unsafe.getObject(obj, j6));
                    }
                    break;
                case 61:
                    if (r(i14, obj, i13)) {
                        aVar.U(i14, (AbstractC2025j) unsafe.getObject(obj, j6));
                    }
                    break;
                case 62:
                    if (r(i14, obj, i13)) {
                        aVar.i0(i14, A(j6, obj));
                    }
                    break;
                case 63:
                    if (r(i14, obj, i13)) {
                        aVar.W(i14, A(j6, obj));
                    }
                    break;
                case 64:
                    if (r(i14, obj, i13)) {
                        aVar.e0(i14, A(j6, obj));
                    }
                    break;
                case 65:
                    if (r(i14, obj, i13)) {
                        aVar.f0(i14, B(j6, obj));
                    }
                    break;
                case 66:
                    if (r(i14, obj, i13)) {
                        aVar.g0(i14, A(j6, obj));
                    }
                    break;
                case 67:
                    if (r(i14, obj, i13)) {
                        aVar.h0(i14, B(j6, obj));
                    }
                    break;
                case 68:
                    if (r(i14, obj, i13)) {
                        aVar.a0(i14, n(i13), unsafe.getObject(obj, j6));
                    }
                    break;
            }
        }
        this.f25022m.getClass();
        ((AbstractC2040z) obj).unknownFields.d(aVar);
    }

    public final void N(J0.a aVar, int i10, Object obj, int i11) {
        if (obj != null) {
            Object m10 = m(i11);
            this.f25023n.getClass();
            U3.i iVar = ((O) m10).f24999a;
            ((AbstractC2031p) aVar.f8729Y).getClass();
            for (Map.Entry entry : ((P) obj).entrySet()) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                ((AbstractC2031p) aVar.f8729Y).Z(O.a(iVar, entry.getKey(), entry.getValue()));
                O.b((AbstractC2031p) aVar.f8729Y, iVar, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final boolean a(Object obj, Object obj2) {
        boolean z10;
        int[] iArr = this.f25010a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int L10 = L(i10);
            long j6 = L10 & 1048575;
            switch (K(L10)) {
                case 0:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var = x0.f25132d;
                        if (Double.doubleToLongBits(w0Var.e(j6, obj)) == Double.doubleToLongBits(w0Var.e(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var2 = x0.f25132d;
                        if (Float.floatToIntBits(w0Var2.f(j6, obj)) == Float.floatToIntBits(w0Var2.f(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var3 = x0.f25132d;
                        if (w0Var3.h(j6, obj) == w0Var3.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var4 = x0.f25132d;
                        if (w0Var4.h(j6, obj) == w0Var4.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var5 = x0.f25132d;
                        if (w0Var5.g(j6, obj) == w0Var5.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var6 = x0.f25132d;
                        if (w0Var6.h(j6, obj) == w0Var6.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var7 = x0.f25132d;
                        if (w0Var7.g(j6, obj) == w0Var7.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var8 = x0.f25132d;
                        if (w0Var8.c(j6, obj) == w0Var8.c(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var9 = x0.f25132d;
                        if (h0.C(w0Var9.i(j6, obj), w0Var9.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var10 = x0.f25132d;
                        if (h0.C(w0Var10.i(j6, obj), w0Var10.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var11 = x0.f25132d;
                        if (h0.C(w0Var11.i(j6, obj), w0Var11.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var12 = x0.f25132d;
                        if (w0Var12.g(j6, obj) == w0Var12.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var13 = x0.f25132d;
                        if (w0Var13.g(j6, obj) == w0Var13.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var14 = x0.f25132d;
                        if (w0Var14.g(j6, obj) == w0Var14.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var15 = x0.f25132d;
                        if (w0Var15.h(j6, obj) == w0Var15.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var16 = x0.f25132d;
                        if (w0Var16.g(j6, obj) == w0Var16.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var17 = x0.f25132d;
                        if (w0Var17.h(j6, obj) == w0Var17.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (j(obj, i10, obj2)) {
                        w0 w0Var18 = x0.f25132d;
                        if (h0.C(w0Var18.i(j6, obj), w0Var18.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                case r9.y.f44626f /* 48 */:
                case 49:
                    w0 w0Var19 = x0.f25132d;
                    z10 = h0.C(w0Var19.i(j6, obj), w0Var19.i(j6, obj2));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    w0 w0Var20 = x0.f25132d;
                    z10 = h0.C(w0Var20.i(j6, obj), w0Var20.i(j6, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
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
                    long j10 = iArr[i10 + 2] & 1048575;
                    w0 w0Var21 = x0.f25132d;
                    if (w0Var21.g(j10, obj) == w0Var21.g(j10, obj2) && h0.C(w0Var21.i(j6, obj), w0Var21.i(j6, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z10) {
                return false;
            }
        }
        this.f25022m.getClass();
        if (!((AbstractC2040z) obj).unknownFields.equals(((AbstractC2040z) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
        if (r4 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0216, code lost:
        if (r4 != false) goto L41;
     */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i10;
        int b10;
        int i11;
        int[] iArr = this.f25010a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int L10 = L(i13);
            int i14 = iArr[i13];
            long j6 = 1048575 & L10;
            int i15 = 1237;
            int i16 = 37;
            switch (K(L10)) {
                case 0:
                    i10 = i12 * 53;
                    b10 = B.b(Double.doubleToLongBits(x0.f25132d.e(j6, obj)));
                    i12 = b10 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    b10 = Float.floatToIntBits(x0.f25132d.f(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    b10 = B.b(x0.f25132d.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    b10 = B.b(x0.f25132d.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    b10 = B.b(x0.f25132d.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean c10 = x0.f25132d.c(j6, obj);
                    Charset charset = B.f24959a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    b10 = ((String) x0.f25132d.i(j6, obj)).hashCode();
                    i12 = b10 + i10;
                    break;
                case 9:
                    Object i17 = x0.f25132d.i(j6, obj);
                    if (i17 != null) {
                        i16 = i17.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    b10 = B.b(x0.f25132d.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    b10 = B.b(x0.f25132d.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 17:
                    Object i18 = x0.f25132d.i(j6, obj);
                    if (i18 != null) {
                        i16 = i18.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                case r9.y.f44626f /* 48 */:
                case 49:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    b10 = x0.f25132d.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 51:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(Double.doubleToLongBits(((Double) x0.f25132d.i(j6, obj)).doubleValue()));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = Float.floatToIntBits(((Float) x0.f25132d.i(j6, obj)).floatValue());
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(B(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(B(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(B(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (r(i14, obj, i13)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) x0.f25132d.i(j6, obj)).booleanValue();
                        Charset charset2 = B.f24959a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = ((String) x0.f25132d.i(j6, obj)).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = x0.f25132d.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = x0.f25132d.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(B(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = B.b(B(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = x0.f25132d.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f25022m.getClass();
        return ((AbstractC2040z) obj).unknownFields.hashCode() + (i12 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void c(Object obj, Object obj2) {
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f25010a;
            if (i10 < iArr.length) {
                int L10 = L(i10);
                long j6 = 1048575 & L10;
                int i11 = iArr[i10];
                switch (K(L10)) {
                    case 0:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            w0 w0Var = x0.f25132d;
                            w0Var.m(obj, j6, w0Var.e(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 1:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            w0 w0Var2 = x0.f25132d;
                            w0Var2.n(obj, j6, w0Var2.f(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 2:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.q(obj, j6, x0.f25132d.h(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 3:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.q(obj, j6, x0.f25132d.h(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 4:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 5:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.q(obj, j6, x0.f25132d.h(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 6:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 7:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            w0 w0Var3 = x0.f25132d;
                            w0Var3.k(obj, j6, w0Var3.c(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 8:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.r(j6, obj, x0.f25132d.i(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 9:
                        v(obj, i10, obj2);
                        break;
                    case 10:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.r(j6, obj, x0.f25132d.i(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 11:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 12:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 13:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 14:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.q(obj, j6, x0.f25132d.h(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 15:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.p(j6, obj, x0.f25132d.g(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 16:
                        if (!q(i10, obj2)) {
                            break;
                        } else {
                            x0.q(obj, j6, x0.f25132d.h(j6, obj2));
                            I(i10, obj);
                            break;
                        }
                    case 17:
                        v(obj, i10, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
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
                    case r9.y.f44626f /* 48 */:
                    case 49:
                        this.f25021l.b(j6, obj, obj2);
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Class cls = h0.f25053a;
                        w0 w0Var4 = x0.f25132d;
                        Object i12 = w0Var4.i(j6, obj);
                        Object i13 = w0Var4.i(j6, obj2);
                        this.f25023n.getClass();
                        x0.r(j6, obj, Q.b(i12, i13));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!r(i11, obj2, i10)) {
                            break;
                        } else {
                            x0.r(j6, obj, x0.f25132d.i(j6, obj2));
                            J(i11, obj, i10);
                            break;
                        }
                    case 60:
                        w(obj, i10, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!r(i11, obj2, i10)) {
                            break;
                        } else {
                            x0.r(j6, obj, x0.f25132d.i(j6, obj2));
                            J(i11, obj, i10);
                            break;
                        }
                    case 68:
                        w(obj, i10, obj2);
                        break;
                }
                i10 += 3;
            } else if (!this.f25016g) {
                h0.B(this.f25022m, obj, obj2);
                return;
            } else {
                return;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void d(Object obj) {
        int[] iArr;
        int i10;
        int i11 = this.f25018i;
        while (true) {
            iArr = this.f25017h;
            i10 = this.f25019j;
            if (i11 >= i10) {
                break;
            }
            long L10 = L(iArr[i11]) & 1048575;
            Object i12 = x0.f25132d.i(L10, obj);
            if (i12 != null) {
                this.f25023n.getClass();
                ((P) i12).f25003Y = false;
                x0.r(L10, obj, i12);
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f25021l.a(iArr[i10], obj);
            i10++;
        }
        this.f25022m.getClass();
        ((AbstractC2040z) obj).unknownFields.f25099e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Object obj) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f25018i; i13++) {
            int i14 = this.f25017h[i13];
            int[] iArr = this.f25010a;
            int i15 = iArr[i14];
            int L10 = L(i14);
            boolean z10 = this.f25016g;
            if (!z10) {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i12 = f25009p.getInt(obj, i17);
                    i11 = i17;
                }
            } else {
                i10 = 0;
            }
            if ((268435456 & L10) != 0) {
                if (z10) {
                    if (!q(i14, obj)) {
                        return false;
                    }
                } else if ((i12 & i10) == 0) {
                    return false;
                }
            }
            int K10 = K(L10);
            if (K10 != 9 && K10 != 17) {
                if (K10 != 27) {
                    if (K10 != 60 && K10 != 68) {
                        if (K10 != 49) {
                            if (K10 != 50) {
                                continue;
                            } else {
                                Object i18 = x0.f25132d.i(L10 & 1048575, obj);
                                this.f25023n.getClass();
                                P p10 = (P) i18;
                                if (!p10.isEmpty() && ((F0) ((O) m(i14)).f24999a.f17416h0).f24979Y == G0.f24990o0) {
                                    AbstractC2022g0 abstractC2022g0 = null;
                                    for (Object obj2 : p10.values()) {
                                        if (abstractC2022g0 == null) {
                                            abstractC2022g0 = C2014c0.f25030c.a(obj2.getClass());
                                        }
                                        if (!abstractC2022g0.e(obj2)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (r(i15, obj, i14)) {
                        if (!n(i14).e(x0.f25132d.i(L10 & 1048575, obj))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) x0.f25132d.i(L10 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    AbstractC2022g0 n10 = n(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!n10.e(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (z10) {
                if (!q(i14, obj)) {
                    continue;
                }
                if (n(i14).e(x0.f25132d.i(L10 & 1048575, obj))) {
                    return false;
                }
            } else {
                if ((i10 & i12) == 0) {
                    continue;
                }
                if (n(i14).e(x0.f25132d.i(L10 & 1048575, obj))) {
                }
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final int f(Object obj) {
        if (this.f25016g) {
            return p(obj);
        }
        return o(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final Object g() {
        this.f25020k.getClass();
        return ((AbstractC2040z) this.f25014e).d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void h(Object obj, AbstractC2020f0 abstractC2020f0, r rVar) {
        rVar.getClass();
        t(this.f25022m, obj, abstractC2020f0, rVar);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2022g0
    public final void i(Object obj, J0.a aVar) {
        aVar.getClass();
        if (this.f25016g) {
            int[] iArr = this.f25010a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int L10 = L(i10);
                int i11 = iArr[i10];
                switch (K(L10)) {
                    case 0:
                        if (q(i10, obj)) {
                            aVar.V(i11, x0.f25132d.e(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (q(i10, obj)) {
                            aVar.Z(i11, x0.f25132d.f(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (q(i10, obj)) {
                            aVar.c0(i11, x0.f25132d.h(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (q(i10, obj)) {
                            aVar.j0(i11, x0.f25132d.h(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (q(i10, obj)) {
                            aVar.b0(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (q(i10, obj)) {
                            aVar.Y(i11, x0.f25132d.h(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (q(i10, obj)) {
                            aVar.X(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (q(i10, obj)) {
                            aVar.T(i11, x0.f25132d.c(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (q(i10, obj)) {
                            O(i11, x0.f25132d.i(L10 & 1048575, obj), aVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (q(i10, obj)) {
                            aVar.d0(i11, n(i10), x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (q(i10, obj)) {
                            aVar.U(i11, (AbstractC2025j) x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (q(i10, obj)) {
                            aVar.i0(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (q(i10, obj)) {
                            aVar.W(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (q(i10, obj)) {
                            aVar.e0(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (q(i10, obj)) {
                            aVar.f0(i11, x0.f25132d.h(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (q(i10, obj)) {
                            aVar.g0(i11, x0.f25132d.g(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (q(i10, obj)) {
                            aVar.h0(i11, x0.f25132d.h(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (q(i10, obj)) {
                            aVar.a0(i11, n(i10), x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        h0.F(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 19:
                        h0.J(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 20:
                        h0.M(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 21:
                        h0.U(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 22:
                        h0.L(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 23:
                        h0.I(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 24:
                        h0.H(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 25:
                        h0.D(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 26:
                        h0.S(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar);
                        break;
                    case 27:
                        h0.N(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, n(i10));
                        break;
                    case 28:
                        h0.E(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar);
                        break;
                    case 29:
                        h0.T(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 30:
                        h0.G(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 31:
                        h0.O(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 32:
                        h0.P(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 33:
                        h0.Q(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 34:
                        h0.R(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, false);
                        break;
                    case 35:
                        h0.F(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 36:
                        h0.J(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 37:
                        h0.M(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 38:
                        h0.U(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 39:
                        h0.L(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 40:
                        h0.I(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 41:
                        h0.H(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 42:
                        h0.D(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 43:
                        h0.T(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 44:
                        h0.G(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 45:
                        h0.O(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 46:
                        h0.P(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 47:
                        h0.Q(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case r9.y.f44626f /* 48 */:
                        h0.R(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, true);
                        break;
                    case 49:
                        h0.K(iArr[i10], (List) x0.f25132d.i(L10 & 1048575, obj), aVar, n(i10));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        N(aVar, i11, x0.f25132d.i(L10 & 1048575, obj), i10);
                        break;
                    case 51:
                        if (r(i11, obj, i10)) {
                            aVar.V(i11, ((Double) x0.f25132d.i(L10 & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (r(i11, obj, i10)) {
                            aVar.Z(i11, ((Float) x0.f25132d.i(L10 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (r(i11, obj, i10)) {
                            aVar.c0(i11, B(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (r(i11, obj, i10)) {
                            aVar.j0(i11, B(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (r(i11, obj, i10)) {
                            aVar.b0(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (r(i11, obj, i10)) {
                            aVar.Y(i11, B(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (r(i11, obj, i10)) {
                            aVar.X(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (r(i11, obj, i10)) {
                            aVar.T(i11, ((Boolean) x0.f25132d.i(L10 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (r(i11, obj, i10)) {
                            O(i11, x0.f25132d.i(L10 & 1048575, obj), aVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (r(i11, obj, i10)) {
                            aVar.d0(i11, n(i10), x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (r(i11, obj, i10)) {
                            aVar.U(i11, (AbstractC2025j) x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (r(i11, obj, i10)) {
                            aVar.i0(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (r(i11, obj, i10)) {
                            aVar.W(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (r(i11, obj, i10)) {
                            aVar.e0(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (r(i11, obj, i10)) {
                            aVar.f0(i11, B(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (r(i11, obj, i10)) {
                            aVar.g0(i11, A(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (r(i11, obj, i10)) {
                            aVar.h0(i11, B(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (r(i11, obj, i10)) {
                            aVar.a0(i11, n(i10), x0.f25132d.i(L10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f25022m.getClass();
            ((AbstractC2040z) obj).unknownFields.d(aVar);
            return;
        }
        M(obj, aVar);
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        if (q(i10, obj) == q(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final void k(Object obj, int i10, Object obj2) {
        int i11 = this.f25010a[i10];
        if (x0.f25132d.i(L(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        AbstractC2469q0.p(this.f25011b[((i10 / 3) * 2) + 1]);
    }

    public final Object m(int i10) {
        return this.f25011b[(i10 / 3) * 2];
    }

    public final AbstractC2022g0 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f25011b;
        AbstractC2022g0 abstractC2022g0 = (AbstractC2022g0) objArr[i11];
        if (abstractC2022g0 != null) {
            return abstractC2022g0;
        }
        AbstractC2022g0 a5 = C2014c0.f25030c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a5;
        return a5;
    }

    public final int o(Object obj) {
        int i10;
        int n10;
        int A10;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f25010a;
            if (i12 < iArr.length) {
                int L10 = L(i12);
                int i15 = iArr[i12];
                int K10 = K(L10);
                Unsafe unsafe = f25009p;
                if (K10 <= 17) {
                    int i16 = iArr[i12 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i11) {
                        i14 = unsafe.getInt(obj, i17);
                        i11 = i17;
                    }
                } else {
                    i10 = 0;
                }
                long j6 = L10 & 1048575;
                switch (K10) {
                    case 0:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.n(i15);
                            i13 += n10;
                            break;
                        }
                    case 1:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.r(i15);
                            i13 += n10;
                            break;
                        }
                    case 2:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.v(i15, unsafe.getLong(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 3:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.F(i15, unsafe.getLong(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 4:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.t(i15, unsafe.getInt(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 5:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.q(i15);
                            i13 += n10;
                            break;
                        }
                    case 6:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.p(i15);
                            i13 += n10;
                            break;
                        }
                    case 7:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.k(i15);
                            i13 += n10;
                            break;
                        }
                    case 8:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j6);
                            if (object instanceof AbstractC2025j) {
                                A10 = AbstractC2031p.l(i15, (AbstractC2025j) object);
                            } else {
                                A10 = AbstractC2031p.A(i15, (String) object);
                            }
                            i13 = A10 + i13;
                            break;
                        }
                    case 9:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = h0.o(i15, n(i12), unsafe.getObject(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 10:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.l(i15, (AbstractC2025j) unsafe.getObject(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 11:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.D(i15, unsafe.getInt(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 12:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.o(i15, unsafe.getInt(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 13:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.w(i15);
                            i13 += n10;
                            break;
                        }
                    case 14:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.x(i15);
                            i13 += n10;
                            break;
                        }
                    case 15:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.y(i15, unsafe.getInt(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 16:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.z(i15, unsafe.getLong(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 17:
                        if ((i10 & i14) == 0) {
                            break;
                        } else {
                            n10 = AbstractC2031p.s(i15, (AbstractC2011b) unsafe.getObject(obj, j6), n(i12));
                            i13 += n10;
                            break;
                        }
                    case 18:
                        n10 = h0.h(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 19:
                        n10 = h0.f(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 20:
                        n10 = h0.m(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 21:
                        n10 = h0.x(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 22:
                        n10 = h0.k(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 23:
                        n10 = h0.h(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 24:
                        n10 = h0.f(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 25:
                        n10 = h0.a(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 26:
                        n10 = h0.u(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 27:
                        n10 = h0.p(i15, (List) unsafe.getObject(obj, j6), n(i12));
                        i13 += n10;
                        break;
                    case 28:
                        n10 = h0.c(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 29:
                        n10 = h0.v(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 30:
                        n10 = h0.d(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 31:
                        n10 = h0.f(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 32:
                        n10 = h0.h(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 33:
                        n10 = h0.q(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 34:
                        n10 = h0.s(i15, (List) unsafe.getObject(obj, j6));
                        i13 += n10;
                        break;
                    case 35:
                        int i18 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i18 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(i18, AbstractC2031p.C(i15), i18, i13);
                            break;
                        }
                    case 36:
                        int g10 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(g10, AbstractC2031p.C(i15), g10, i13);
                            break;
                        }
                    case 37:
                        int n11 = h0.n((List) unsafe.getObject(obj, j6));
                        if (n11 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(n11, AbstractC2031p.C(i15), n11, i13);
                            break;
                        }
                    case 38:
                        int y10 = h0.y((List) unsafe.getObject(obj, j6));
                        if (y10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(y10, AbstractC2031p.C(i15), y10, i13);
                            break;
                        }
                    case 39:
                        int l10 = h0.l((List) unsafe.getObject(obj, j6));
                        if (l10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(l10, AbstractC2031p.C(i15), l10, i13);
                            break;
                        }
                    case 40:
                        int i19 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i19 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(i19, AbstractC2031p.C(i15), i19, i13);
                            break;
                        }
                    case 41:
                        int g11 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g11 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(g11, AbstractC2031p.C(i15), g11, i13);
                            break;
                        }
                    case 42:
                        int b10 = h0.b((List) unsafe.getObject(obj, j6));
                        if (b10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(b10, AbstractC2031p.C(i15), b10, i13);
                            break;
                        }
                    case 43:
                        int w10 = h0.w((List) unsafe.getObject(obj, j6));
                        if (w10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(w10, AbstractC2031p.C(i15), w10, i13);
                            break;
                        }
                    case 44:
                        int e10 = h0.e((List) unsafe.getObject(obj, j6));
                        if (e10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(e10, AbstractC2031p.C(i15), e10, i13);
                            break;
                        }
                    case 45:
                        int g12 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g12 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(g12, AbstractC2031p.C(i15), g12, i13);
                            break;
                        }
                    case 46:
                        int i20 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i20 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(i20, AbstractC2031p.C(i15), i20, i13);
                            break;
                        }
                    case 47:
                        int r10 = h0.r((List) unsafe.getObject(obj, j6));
                        if (r10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(r10, AbstractC2031p.C(i15), r10, i13);
                            break;
                        }
                    case r9.y.f44626f /* 48 */:
                        int t10 = h0.t((List) unsafe.getObject(obj, j6));
                        if (t10 <= 0) {
                            break;
                        } else {
                            i13 = android.gov.nist.core.a.d(t10, AbstractC2031p.C(i15), t10, i13);
                            break;
                        }
                    case 49:
                        n10 = h0.j(i15, (List) unsafe.getObject(obj, j6), n(i12));
                        i13 += n10;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object object2 = unsafe.getObject(obj, j6);
                        Object m10 = m(i12);
                        this.f25023n.getClass();
                        n10 = Q.a(object2, i15, m10);
                        i13 += n10;
                        break;
                    case 51:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.n(i15);
                            i13 += n10;
                            break;
                        }
                    case 52:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.r(i15);
                            i13 += n10;
                            break;
                        }
                    case 53:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.v(i15, B(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 54:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.F(i15, B(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 55:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.t(i15, A(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 56:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.q(i15);
                            i13 += n10;
                            break;
                        }
                    case 57:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.p(i15);
                            i13 += n10;
                            break;
                        }
                    case 58:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.k(i15);
                            i13 += n10;
                            break;
                        }
                    case 59:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j6);
                            if (object3 instanceof AbstractC2025j) {
                                A10 = AbstractC2031p.l(i15, (AbstractC2025j) object3);
                            } else {
                                A10 = AbstractC2031p.A(i15, (String) object3);
                            }
                            i13 = A10 + i13;
                            break;
                        }
                    case 60:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = h0.o(i15, n(i12), unsafe.getObject(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 61:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.l(i15, (AbstractC2025j) unsafe.getObject(obj, j6));
                            i13 += n10;
                            break;
                        }
                    case 62:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.D(i15, A(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 63:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.o(i15, A(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 64:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.w(i15);
                            i13 += n10;
                            break;
                        }
                    case 65:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.x(i15);
                            i13 += n10;
                            break;
                        }
                    case 66:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.y(i15, A(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 67:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.z(i15, B(j6, obj));
                            i13 += n10;
                            break;
                        }
                    case 68:
                        if (!r(i15, obj, i12)) {
                            break;
                        } else {
                            n10 = AbstractC2031p.s(i15, (AbstractC2011b) unsafe.getObject(obj, j6), n(i12));
                            i13 += n10;
                            break;
                        }
                }
                i12 += 3;
            } else {
                this.f25022m.getClass();
                return ((AbstractC2040z) obj).unknownFields.a() + i13;
            }
        }
    }

    public final int p(Object obj) {
        int n10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f25010a;
            if (i10 < iArr.length) {
                int L10 = L(i10);
                int K10 = K(L10);
                int i12 = iArr[i10];
                long j6 = L10 & 1048575;
                if (K10 >= EnumC2036v.DOUBLE_LIST_PACKED.a() && K10 <= EnumC2036v.SINT64_LIST_PACKED.a()) {
                    int i13 = iArr[i10 + 2];
                }
                Unsafe unsafe = f25009p;
                switch (K10) {
                    case 0:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.n(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.r(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.v(i12, x0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.F(i12, x0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.t(i12, x0.i(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.q(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.p(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.k(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (q(i10, obj)) {
                            Object k10 = x0.k(j6, obj);
                            if (k10 instanceof AbstractC2025j) {
                                n10 = AbstractC2031p.l(i12, (AbstractC2025j) k10);
                                break;
                            } else {
                                n10 = AbstractC2031p.A(i12, (String) k10);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (q(i10, obj)) {
                            n10 = h0.o(i12, n(i10), x0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.l(i12, (AbstractC2025j) x0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.D(i12, x0.i(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.o(i12, x0.i(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.w(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.x(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.y(i12, x0.i(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.z(i12, x0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (q(i10, obj)) {
                            n10 = AbstractC2031p.s(i12, (AbstractC2011b) x0.k(j6, obj), n(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        n10 = h0.h(i12, s(j6, obj));
                        break;
                    case 19:
                        n10 = h0.f(i12, s(j6, obj));
                        break;
                    case 20:
                        n10 = h0.m(i12, s(j6, obj));
                        break;
                    case 21:
                        n10 = h0.x(i12, s(j6, obj));
                        break;
                    case 22:
                        n10 = h0.k(i12, s(j6, obj));
                        break;
                    case 23:
                        n10 = h0.h(i12, s(j6, obj));
                        break;
                    case 24:
                        n10 = h0.f(i12, s(j6, obj));
                        break;
                    case 25:
                        n10 = h0.a(i12, s(j6, obj));
                        break;
                    case 26:
                        n10 = h0.u(i12, s(j6, obj));
                        break;
                    case 27:
                        n10 = h0.p(i12, s(j6, obj), n(i10));
                        break;
                    case 28:
                        n10 = h0.c(i12, s(j6, obj));
                        break;
                    case 29:
                        n10 = h0.v(i12, s(j6, obj));
                        break;
                    case 30:
                        n10 = h0.d(i12, s(j6, obj));
                        break;
                    case 31:
                        n10 = h0.f(i12, s(j6, obj));
                        break;
                    case 32:
                        n10 = h0.h(i12, s(j6, obj));
                        break;
                    case 33:
                        n10 = h0.q(i12, s(j6, obj));
                        break;
                    case 34:
                        n10 = h0.s(i12, s(j6, obj));
                        break;
                    case 35:
                        int i14 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i14 > 0) {
                            i11 = android.gov.nist.core.a.d(i14, AbstractC2031p.C(i12), i14, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 36:
                        int g10 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g10 > 0) {
                            i11 = android.gov.nist.core.a.d(g10, AbstractC2031p.C(i12), g10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 37:
                        int n11 = h0.n((List) unsafe.getObject(obj, j6));
                        if (n11 > 0) {
                            i11 = android.gov.nist.core.a.d(n11, AbstractC2031p.C(i12), n11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 38:
                        int y10 = h0.y((List) unsafe.getObject(obj, j6));
                        if (y10 > 0) {
                            i11 = android.gov.nist.core.a.d(y10, AbstractC2031p.C(i12), y10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 39:
                        int l10 = h0.l((List) unsafe.getObject(obj, j6));
                        if (l10 > 0) {
                            i11 = android.gov.nist.core.a.d(l10, AbstractC2031p.C(i12), l10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 40:
                        int i15 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i15 > 0) {
                            i11 = android.gov.nist.core.a.d(i15, AbstractC2031p.C(i12), i15, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 41:
                        int g11 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g11 > 0) {
                            i11 = android.gov.nist.core.a.d(g11, AbstractC2031p.C(i12), g11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 42:
                        int b10 = h0.b((List) unsafe.getObject(obj, j6));
                        if (b10 > 0) {
                            i11 = android.gov.nist.core.a.d(b10, AbstractC2031p.C(i12), b10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 43:
                        int w10 = h0.w((List) unsafe.getObject(obj, j6));
                        if (w10 > 0) {
                            i11 = android.gov.nist.core.a.d(w10, AbstractC2031p.C(i12), w10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 44:
                        int e10 = h0.e((List) unsafe.getObject(obj, j6));
                        if (e10 > 0) {
                            i11 = android.gov.nist.core.a.d(e10, AbstractC2031p.C(i12), e10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 45:
                        int g12 = h0.g((List) unsafe.getObject(obj, j6));
                        if (g12 > 0) {
                            i11 = android.gov.nist.core.a.d(g12, AbstractC2031p.C(i12), g12, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 46:
                        int i16 = h0.i((List) unsafe.getObject(obj, j6));
                        if (i16 > 0) {
                            i11 = android.gov.nist.core.a.d(i16, AbstractC2031p.C(i12), i16, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 47:
                        int r10 = h0.r((List) unsafe.getObject(obj, j6));
                        if (r10 > 0) {
                            i11 = android.gov.nist.core.a.d(r10, AbstractC2031p.C(i12), r10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case r9.y.f44626f /* 48 */:
                        int t10 = h0.t((List) unsafe.getObject(obj, j6));
                        if (t10 > 0) {
                            i11 = android.gov.nist.core.a.d(t10, AbstractC2031p.C(i12), t10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 49:
                        n10 = h0.j(i12, s(j6, obj), n(i10));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object k11 = x0.k(j6, obj);
                        Object m10 = m(i10);
                        this.f25023n.getClass();
                        n10 = Q.a(k11, i12, m10);
                        break;
                    case 51:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.n(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 52:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.r(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 53:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.v(i12, B(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 54:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.F(i12, B(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 55:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.t(i12, A(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 56:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.q(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 57:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.p(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 58:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.k(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 59:
                        if (r(i12, obj, i10)) {
                            Object k12 = x0.k(j6, obj);
                            if (k12 instanceof AbstractC2025j) {
                                n10 = AbstractC2031p.l(i12, (AbstractC2025j) k12);
                                break;
                            } else {
                                n10 = AbstractC2031p.A(i12, (String) k12);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 60:
                        if (r(i12, obj, i10)) {
                            n10 = h0.o(i12, n(i10), x0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 61:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.l(i12, (AbstractC2025j) x0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 62:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.D(i12, A(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 63:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.o(i12, A(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 64:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.w(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 65:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.x(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 66:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.y(i12, A(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 67:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.z(i12, B(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 68:
                        if (r(i12, obj, i10)) {
                            n10 = AbstractC2031p.s(i12, (AbstractC2011b) x0.k(j6, obj), n(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    default:
                        i10 += 3;
                }
                i11 = n10 + i11;
                i10 += 3;
            } else {
                this.f25022m.getClass();
                return ((AbstractC2040z) obj).unknownFields.a() + i11;
            }
        }
    }

    public final boolean q(int i10, Object obj) {
        int i11;
        if (this.f25016g) {
            int L10 = L(i10);
            long j6 = L10 & 1048575;
            switch (K(L10)) {
                case 0:
                    if (x0.f25132d.e(j6, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (x0.f25132d.f(j6, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (x0.f25132d.h(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (x0.f25132d.h(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (x0.f25132d.h(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return x0.f25132d.c(j6, obj);
                case 8:
                    Object i12 = x0.f25132d.i(j6, obj);
                    if (i12 instanceof String) {
                        return !((String) i12).isEmpty();
                    }
                    if (i12 instanceof AbstractC2025j) {
                        return !AbstractC2025j.f25066Z.equals(i12);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (x0.f25132d.i(j6, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC2025j.f25066Z.equals(x0.f25132d.i(j6, obj));
                case 11:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (x0.f25132d.h(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (x0.f25132d.g(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (x0.f25132d.h(j6, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (x0.f25132d.i(j6, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((x0.f25132d.g(i11 & 1048575, obj) & (1 << (this.f25010a[i10 + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean r(int i10, Object obj, int i11) {
        if (x0.f25132d.g(this.f25010a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r15 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        r18.getClass();
        ((androidx.datastore.preferences.protobuf.AbstractC2040z) r19).unknownFields = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r14 >= r13) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        k(r19, r12[r14], r15);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r15 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        ((androidx.datastore.preferences.protobuf.AbstractC2040z) r19).unknownFields = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r14 >= r13) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        k(r19, r12[r14], r15);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        ((androidx.datastore.preferences.protobuf.AbstractC2040z) r19).unknownFields = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r14 >= r13) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        k(r19, r12[r14], r15);
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05f1 A[Catch: all -> 0x024d, TryCatch #4 {all -> 0x024d, blocks: (B:71:0x0248, B:74:0x0250, B:75:0x0260, B:76:0x0270, B:77:0x0280, B:78:0x0290, B:79:0x02a6, B:80:0x02b6, B:81:0x02c6, B:82:0x02d6, B:83:0x02e6, B:84:0x02f6, B:85:0x0306, B:86:0x0316, B:87:0x0326, B:88:0x0336, B:89:0x0346, B:90:0x0356, B:91:0x0366, B:92:0x0376, B:93:0x038c, B:94:0x039c, B:95:0x03ac, B:96:0x03c0, B:97:0x03c8, B:98:0x03d8, B:99:0x03e8, B:100:0x03f8, B:101:0x0408, B:102:0x0418, B:103:0x0428, B:104:0x0438, B:105:0x0448, B:107:0x0451, B:108:0x046e, B:109:0x0482, B:110:0x0495, B:111:0x04a8, B:112:0x04bb, B:113:0x04ce, B:114:0x04e4, B:115:0x04f7, B:116:0x050a, B:118:0x0513, B:119:0x0530, B:120:0x0544, B:121:0x054f, B:122:0x0564, B:123:0x0577, B:124:0x058a, B:125:0x059d, B:126:0x05b0, B:127:0x05c2, B:128:0x05d6, B:129:0x05ec, B:131:0x05f1, B:133:0x05f8, B:135:0x05ff), top: B:155:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0605 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(p0 p0Var, Object obj, AbstractC2020f0 abstractC2020f0, r rVar) {
        int i10;
        Throwable th2;
        o0 o0Var;
        int[] iArr = this.f25017h;
        int i11 = this.f25019j;
        int i12 = this.f25018i;
        o0 o0Var2 = null;
        while (true) {
            try {
                int w10 = abstractC2020f0.w();
                int C10 = C(w10);
                o0 o0Var3 = o0.f25094f;
                if (C10 < 0) {
                    if (w10 == Integer.MAX_VALUE) {
                        break;
                    }
                    p0Var.getClass();
                    if (o0Var2 == null) {
                        AbstractC2040z abstractC2040z = (AbstractC2040z) obj;
                        o0 o0Var4 = abstractC2040z.unknownFields;
                        if (o0Var4 == o0Var3) {
                            o0Var4 = o0.b();
                            abstractC2040z.unknownFields = o0Var4;
                        }
                        o0Var2 = o0Var4;
                    }
                    if (p0.a(o0Var2, abstractC2020f0)) {
                    }
                } else {
                    int L10 = L(C10);
                    try {
                        int K10 = K(L10);
                        K k10 = this.f25021l;
                        switch (K10) {
                            case 0:
                                i10 = i12;
                                x0.f25132d.m(obj, z(L10), abstractC2020f0.readDouble());
                                I(C10, obj);
                                break;
                            case 1:
                                i10 = i12;
                                x0.f25132d.n(obj, z(L10), abstractC2020f0.readFloat());
                                I(C10, obj);
                                break;
                            case 2:
                                i10 = i12;
                                x0.q(obj, z(L10), abstractC2020f0.I());
                                I(C10, obj);
                                break;
                            case 3:
                                i10 = i12;
                                x0.q(obj, z(L10), abstractC2020f0.c());
                                I(C10, obj);
                                break;
                            case 4:
                                i10 = i12;
                                x0.p(z(L10), obj, abstractC2020f0.B());
                                I(C10, obj);
                                break;
                            case 5:
                                i10 = i12;
                                x0.q(obj, z(L10), abstractC2020f0.d());
                                I(C10, obj);
                                break;
                            case 6:
                                i10 = i12;
                                x0.p(z(L10), obj, abstractC2020f0.h());
                                I(C10, obj);
                                break;
                            case 7:
                                i10 = i12;
                                x0.f25132d.k(obj, z(L10), abstractC2020f0.i());
                                I(C10, obj);
                                break;
                            case 8:
                                i10 = i12;
                                F(obj, L10, abstractC2020f0);
                                I(C10, obj);
                                break;
                            case 9:
                                i10 = i12;
                                if (q(C10, obj)) {
                                    x0.r(z(L10), obj, B.c(x0.k(z(L10), obj), abstractC2020f0.a(n(C10), rVar)));
                                    break;
                                } else {
                                    x0.r(z(L10), obj, abstractC2020f0.a(n(C10), rVar));
                                    I(C10, obj);
                                    break;
                                }
                            case 10:
                                i10 = i12;
                                x0.r(z(L10), obj, abstractC2020f0.z());
                                I(C10, obj);
                                break;
                            case 11:
                                i10 = i12;
                                x0.p(z(L10), obj, abstractC2020f0.l());
                                I(C10, obj);
                                break;
                            case 12:
                                i10 = i12;
                                int q10 = abstractC2020f0.q();
                                l(C10);
                                x0.p(z(L10), obj, q10);
                                I(C10, obj);
                                break;
                            case 13:
                                i10 = i12;
                                x0.p(z(L10), obj, abstractC2020f0.D());
                                I(C10, obj);
                                break;
                            case 14:
                                i10 = i12;
                                x0.q(obj, z(L10), abstractC2020f0.j());
                                I(C10, obj);
                                break;
                            case 15:
                                i10 = i12;
                                x0.p(z(L10), obj, abstractC2020f0.s());
                                I(C10, obj);
                                break;
                            case 16:
                                i10 = i12;
                                x0.q(obj, z(L10), abstractC2020f0.t());
                                I(C10, obj);
                                break;
                            case 17:
                                i10 = i12;
                                if (q(C10, obj)) {
                                    x0.r(z(L10), obj, B.c(x0.k(z(L10), obj), abstractC2020f0.L(n(C10), rVar)));
                                    break;
                                } else {
                                    x0.r(z(L10), obj, abstractC2020f0.L(n(C10), rVar));
                                    I(C10, obj);
                                    break;
                                }
                            case 18:
                                i10 = i12;
                                abstractC2020f0.F(k10.c(z(L10), obj));
                                break;
                            case 19:
                                i10 = i12;
                                abstractC2020f0.A(k10.c(z(L10), obj));
                                break;
                            case 20:
                                i10 = i12;
                                abstractC2020f0.m(k10.c(z(L10), obj));
                                break;
                            case 21:
                                i10 = i12;
                                abstractC2020f0.k(k10.c(z(L10), obj));
                                break;
                            case 22:
                                i10 = i12;
                                abstractC2020f0.o(k10.c(z(L10), obj));
                                break;
                            case 23:
                                i10 = i12;
                                abstractC2020f0.K(k10.c(z(L10), obj));
                                break;
                            case 24:
                                i10 = i12;
                                abstractC2020f0.r(k10.c(z(L10), obj));
                                break;
                            case 25:
                                i10 = i12;
                                abstractC2020f0.u(k10.c(z(L10), obj));
                                break;
                            case 26:
                                i10 = i12;
                                G(obj, L10, abstractC2020f0);
                                break;
                            case 27:
                                i10 = i12;
                                E(obj, L10, abstractC2020f0, n(C10), rVar);
                                break;
                            case 28:
                                i10 = i12;
                                abstractC2020f0.E(k10.c(z(L10), obj));
                                break;
                            case 29:
                                i10 = i12;
                                abstractC2020f0.g(k10.c(z(L10), obj));
                                break;
                            case 30:
                                i10 = i12;
                                List c10 = k10.c(z(L10), obj);
                                abstractC2020f0.p(c10);
                                l(C10);
                                h0.z(w10, c10, o0Var2, p0Var);
                                break;
                            case 31:
                                i10 = i12;
                                abstractC2020f0.e(k10.c(z(L10), obj));
                                break;
                            case 32:
                                i10 = i12;
                                abstractC2020f0.n(k10.c(z(L10), obj));
                                break;
                            case 33:
                                i10 = i12;
                                abstractC2020f0.b(k10.c(z(L10), obj));
                                break;
                            case 34:
                                i10 = i12;
                                abstractC2020f0.f(k10.c(z(L10), obj));
                                break;
                            case 35:
                                i10 = i12;
                                abstractC2020f0.F(k10.c(z(L10), obj));
                                break;
                            case 36:
                                i10 = i12;
                                abstractC2020f0.A(k10.c(z(L10), obj));
                                break;
                            case 37:
                                i10 = i12;
                                abstractC2020f0.m(k10.c(z(L10), obj));
                                break;
                            case 38:
                                i10 = i12;
                                abstractC2020f0.k(k10.c(z(L10), obj));
                                break;
                            case 39:
                                i10 = i12;
                                abstractC2020f0.o(k10.c(z(L10), obj));
                                break;
                            case 40:
                                i10 = i12;
                                abstractC2020f0.K(k10.c(z(L10), obj));
                                break;
                            case 41:
                                i10 = i12;
                                abstractC2020f0.r(k10.c(z(L10), obj));
                                break;
                            case 42:
                                i10 = i12;
                                abstractC2020f0.u(k10.c(z(L10), obj));
                                break;
                            case 43:
                                i10 = i12;
                                abstractC2020f0.g(k10.c(z(L10), obj));
                                break;
                            case 44:
                                i10 = i12;
                                List c11 = k10.c(z(L10), obj);
                                abstractC2020f0.p(c11);
                                l(C10);
                                h0.z(w10, c11, o0Var2, p0Var);
                                break;
                            case 45:
                                i10 = i12;
                                abstractC2020f0.e(k10.c(z(L10), obj));
                                break;
                            case 46:
                                i10 = i12;
                                abstractC2020f0.n(k10.c(z(L10), obj));
                                break;
                            case 47:
                                i10 = i12;
                                abstractC2020f0.b(k10.c(z(L10), obj));
                                break;
                            case r9.y.f44626f /* 48 */:
                                i10 = i12;
                                abstractC2020f0.f(k10.c(z(L10), obj));
                                break;
                            case 49:
                                i10 = i12;
                                o0Var = o0Var3;
                                try {
                                    try {
                                        D(obj, z(L10), abstractC2020f0, n(C10), rVar);
                                    } catch (C unused) {
                                        p0Var.getClass();
                                        if (o0Var2 == null) {
                                            AbstractC2040z abstractC2040z2 = (AbstractC2040z) obj;
                                            o0 o0Var5 = abstractC2040z2.unknownFields;
                                            if (o0Var5 == o0Var) {
                                                o0Var5 = o0.b();
                                                abstractC2040z2.unknownFields = o0Var5;
                                            }
                                            o0Var2 = o0Var5;
                                        }
                                        if (!p0.a(o0Var2, abstractC2020f0)) {
                                            for (int i13 = i10; i13 < i11; i13++) {
                                                k(obj, iArr[i13], o0Var2);
                                            }
                                            if (o0Var2 != null) {
                                                ((AbstractC2040z) obj).unknownFields = o0Var2;
                                                return;
                                            }
                                            return;
                                        }
                                        i12 = i10;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    for (int i14 = i10; i14 < i11; i14++) {
                                        k(obj, iArr[i14], o0Var2);
                                    }
                                    if (o0Var2 != null) {
                                        p0Var.getClass();
                                        ((AbstractC2040z) obj).unknownFields = o0Var2;
                                    }
                                    throw th2;
                                }
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                try {
                                    u(obj, C10, m(C10), rVar, abstractC2020f0);
                                    i10 = i12;
                                } catch (C unused2) {
                                    i10 = i12;
                                    o0Var = o0Var3;
                                    p0Var.getClass();
                                    if (o0Var2 == null) {
                                    }
                                    if (!p0.a(o0Var2, abstractC2020f0)) {
                                    }
                                    i12 = i10;
                                }
                                break;
                            case 51:
                                x0.r(z(L10), obj, Double.valueOf(abstractC2020f0.readDouble()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 52:
                                x0.r(z(L10), obj, Float.valueOf(abstractC2020f0.readFloat()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 53:
                                x0.r(z(L10), obj, Long.valueOf(abstractC2020f0.I()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 54:
                                x0.r(z(L10), obj, Long.valueOf(abstractC2020f0.c()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 55:
                                x0.r(z(L10), obj, Integer.valueOf(abstractC2020f0.B()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 56:
                                x0.r(z(L10), obj, Long.valueOf(abstractC2020f0.d()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 57:
                                x0.r(z(L10), obj, Integer.valueOf(abstractC2020f0.h()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 58:
                                x0.r(z(L10), obj, Boolean.valueOf(abstractC2020f0.i()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 59:
                                F(obj, L10, abstractC2020f0);
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 60:
                                if (r(w10, obj, C10)) {
                                    x0.r(z(L10), obj, B.c(x0.k(z(L10), obj), abstractC2020f0.a(n(C10), rVar)));
                                } else {
                                    x0.r(z(L10), obj, abstractC2020f0.a(n(C10), rVar));
                                    I(C10, obj);
                                }
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 61:
                                x0.r(z(L10), obj, abstractC2020f0.z());
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 62:
                                x0.r(z(L10), obj, Integer.valueOf(abstractC2020f0.l()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 63:
                                int q11 = abstractC2020f0.q();
                                l(C10);
                                x0.r(z(L10), obj, Integer.valueOf(q11));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 64:
                                x0.r(z(L10), obj, Integer.valueOf(abstractC2020f0.D()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 65:
                                x0.r(z(L10), obj, Long.valueOf(abstractC2020f0.j()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 66:
                                x0.r(z(L10), obj, Integer.valueOf(abstractC2020f0.s()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 67:
                                x0.r(z(L10), obj, Long.valueOf(abstractC2020f0.t()));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            case 68:
                                x0.r(z(L10), obj, abstractC2020f0.L(n(C10), rVar));
                                J(w10, obj, C10);
                                i10 = i12;
                                break;
                            default:
                                if (o0Var2 == null) {
                                    p0Var.getClass();
                                    o0Var2 = o0.b();
                                }
                                p0Var.getClass();
                                if (!p0.a(o0Var2, abstractC2020f0)) {
                                    break;
                                }
                                i10 = i12;
                                break;
                        }
                    } catch (C unused3) {
                        i10 = i12;
                        o0Var = o0Var3;
                    }
                    i12 = i10;
                }
            } catch (Throwable th4) {
                th2 = th4;
                i10 = i12;
            }
        }
    }

    public final void u(Object obj, int i10, Object obj2, r rVar, AbstractC2020f0 abstractC2020f0) {
        long L10 = L(i10) & 1048575;
        Object i11 = x0.f25132d.i(L10, obj);
        Q q10 = this.f25023n;
        if (i11 == null) {
            q10.getClass();
            i11 = P.f25002Z.b();
            x0.r(L10, obj, i11);
        } else {
            q10.getClass();
            if (!((P) i11).f25003Y) {
                P b10 = P.f25002Z.b();
                Q.b(b10, i11);
                x0.r(L10, obj, b10);
                i11 = b10;
            }
        }
        q10.getClass();
        abstractC2020f0.H((P) i11, ((O) obj2).f24999a, rVar);
    }

    public final void v(Object obj, int i10, Object obj2) {
        long L10 = L(i10) & 1048575;
        if (!q(i10, obj2)) {
            return;
        }
        w0 w0Var = x0.f25132d;
        Object i11 = w0Var.i(L10, obj);
        Object i12 = w0Var.i(L10, obj2);
        if (i11 != null && i12 != null) {
            x0.r(L10, obj, B.c(i11, i12));
            I(i10, obj);
        } else if (i12 != null) {
            x0.r(L10, obj, i12);
            I(i10, obj);
        }
    }

    public final void w(Object obj, int i10, Object obj2) {
        int L10 = L(i10);
        int i11 = this.f25010a[i10];
        long j6 = L10 & 1048575;
        if (!r(i11, obj2, i10)) {
            return;
        }
        w0 w0Var = x0.f25132d;
        Object i12 = w0Var.i(j6, obj);
        Object i13 = w0Var.i(j6, obj2);
        if (i12 != null && i13 != null) {
            x0.r(j6, obj, B.c(i12, i13));
            J(i11, obj, i10);
        } else if (i13 != null) {
            x0.r(j6, obj, i13);
            J(i11, obj, i10);
        }
    }
}
