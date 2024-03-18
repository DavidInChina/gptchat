package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class T implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f25171o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f25172p = m0.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f25173a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f25174b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25176d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC2042b f25177e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25178f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f25179g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f25180h;

    /* renamed from: i  reason: collision with root package name */
    public final int f25181i;

    /* renamed from: j  reason: collision with root package name */
    public final int f25182j;

    /* renamed from: k  reason: collision with root package name */
    public final V f25183k;

    /* renamed from: l  reason: collision with root package name */
    public final I f25184l;

    /* renamed from: m  reason: collision with root package name */
    public final g0 f25185m;

    /* renamed from: n  reason: collision with root package name */
    public final N f25186n;

    public T(int[] iArr, Object[] objArr, int i10, int i11, AbstractC2042b abstractC2042b, boolean z10, int[] iArr2, int i12, int i13, V v10, I i14, g0 g0Var, r rVar, N n10) {
        this.f25173a = iArr;
        this.f25174b = objArr;
        this.f25175c = i10;
        this.f25176d = i11;
        this.f25178f = abstractC2042b instanceof AbstractC2063x;
        this.f25179g = z10;
        this.f25180h = iArr2;
        this.f25181i = i12;
        this.f25182j = i13;
        this.f25183k = v10;
        this.f25184l = i14;
        this.f25185m = g0Var;
        this.f25177e = abstractC2042b;
        this.f25186n = n10;
    }

    public static T A(P p10, V v10, I i10, g0 g0Var, r rVar, N n10) {
        if (p10 instanceof a0) {
            return B((a0) p10, v10, i10, g0Var, rVar, n10);
        }
        AbstractC2469q0.p(p10);
        throw null;
    }

    public static T B(a0 a0Var, V v10, I i10, g0 g0Var, r rVar, N n10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field field;
        char charAt;
        int i29;
        int i30;
        int i31;
        Field K10;
        Field field2;
        int i32;
        char charAt2;
        int i33;
        char charAt3;
        int i34;
        char charAt4;
        int i35;
        char charAt5;
        int i36;
        char charAt6;
        int i37;
        char charAt7;
        int i38;
        char charAt8;
        int i39;
        char charAt9;
        int i40;
        char charAt10;
        int i41;
        char charAt11;
        int i42;
        char charAt12;
        int i43;
        char charAt13;
        int i44 = 0;
        if (a0Var.d() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String c10 = a0Var.c();
        int length = c10.length();
        char c11 = '\ud800';
        if (c10.charAt(0) >= '\ud800') {
            int i45 = 1;
            while (true) {
                i11 = i45 + 1;
                if (c10.charAt(i45) < '\ud800') {
                    break;
                }
                i45 = i11;
            }
        } else {
            i11 = 1;
        }
        int i46 = i11 + 1;
        int charAt14 = c10.charAt(i11);
        if (charAt14 >= 55296) {
            int i47 = charAt14 & 8191;
            int i48 = 13;
            while (true) {
                i43 = i46 + 1;
                charAt13 = c10.charAt(i46);
                if (charAt13 < '\ud800') {
                    break;
                }
                i47 |= (charAt13 & '\u1fff') << i48;
                i48 += 13;
                i46 = i43;
            }
            charAt14 = i47 | (charAt13 << i48);
            i46 = i43;
        }
        if (charAt14 == 0) {
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
            iArr = f25171o;
            i17 = 0;
        } else {
            int i49 = i46 + 1;
            int charAt15 = c10.charAt(i46);
            if (charAt15 >= 55296) {
                int i50 = charAt15 & 8191;
                int i51 = 13;
                while (true) {
                    i42 = i49 + 1;
                    charAt12 = c10.charAt(i49);
                    if (charAt12 < '\ud800') {
                        break;
                    }
                    i50 |= (charAt12 & '\u1fff') << i51;
                    i51 += 13;
                    i49 = i42;
                }
                charAt15 = i50 | (charAt12 << i51);
                i49 = i42;
            }
            int i52 = i49 + 1;
            int charAt16 = c10.charAt(i49);
            if (charAt16 >= 55296) {
                int i53 = charAt16 & 8191;
                int i54 = 13;
                while (true) {
                    i41 = i52 + 1;
                    charAt11 = c10.charAt(i52);
                    if (charAt11 < '\ud800') {
                        break;
                    }
                    i53 |= (charAt11 & '\u1fff') << i54;
                    i54 += 13;
                    i52 = i41;
                }
                charAt16 = i53 | (charAt11 << i54);
                i52 = i41;
            }
            int i55 = i52 + 1;
            int charAt17 = c10.charAt(i52);
            if (charAt17 >= 55296) {
                int i56 = charAt17 & 8191;
                int i57 = 13;
                while (true) {
                    i40 = i55 + 1;
                    charAt10 = c10.charAt(i55);
                    if (charAt10 < '\ud800') {
                        break;
                    }
                    i56 |= (charAt10 & '\u1fff') << i57;
                    i57 += 13;
                    i55 = i40;
                }
                charAt17 = i56 | (charAt10 << i57);
                i55 = i40;
            }
            int i58 = i55 + 1;
            i15 = c10.charAt(i55);
            if (i15 >= 55296) {
                int i59 = i15 & 8191;
                int i60 = 13;
                while (true) {
                    i39 = i58 + 1;
                    charAt9 = c10.charAt(i58);
                    if (charAt9 < '\ud800') {
                        break;
                    }
                    i59 |= (charAt9 & '\u1fff') << i60;
                    i60 += 13;
                    i58 = i39;
                }
                i15 = i59 | (charAt9 << i60);
                i58 = i39;
            }
            int i61 = i58 + 1;
            int charAt18 = c10.charAt(i58);
            if (charAt18 >= 55296) {
                int i62 = charAt18 & 8191;
                int i63 = 13;
                while (true) {
                    i38 = i61 + 1;
                    charAt8 = c10.charAt(i61);
                    if (charAt8 < '\ud800') {
                        break;
                    }
                    i62 |= (charAt8 & '\u1fff') << i63;
                    i63 += 13;
                    i61 = i38;
                }
                charAt18 = i62 | (charAt8 << i63);
                i61 = i38;
            }
            int i64 = i61 + 1;
            i14 = c10.charAt(i61);
            if (i14 >= 55296) {
                int i65 = i14 & 8191;
                int i66 = 13;
                while (true) {
                    i37 = i64 + 1;
                    charAt7 = c10.charAt(i64);
                    if (charAt7 < '\ud800') {
                        break;
                    }
                    i65 |= (charAt7 & '\u1fff') << i66;
                    i66 += 13;
                    i64 = i37;
                }
                i14 = i65 | (charAt7 << i66);
                i64 = i37;
            }
            int i67 = i64 + 1;
            int charAt19 = c10.charAt(i64);
            if (charAt19 >= 55296) {
                int i68 = charAt19 & 8191;
                int i69 = 13;
                while (true) {
                    i36 = i67 + 1;
                    charAt6 = c10.charAt(i67);
                    if (charAt6 < '\ud800') {
                        break;
                    }
                    i68 |= (charAt6 & '\u1fff') << i69;
                    i69 += 13;
                    i67 = i36;
                }
                charAt19 = i68 | (charAt6 << i69);
                i67 = i36;
            }
            int i70 = i67 + 1;
            i12 = c10.charAt(i67);
            if (i12 >= 55296) {
                int i71 = i12 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    charAt5 = c10.charAt(i72);
                    if (charAt5 < '\ud800') {
                        break;
                    }
                    i71 |= (charAt5 & '\u1fff') << i73;
                    i73 += 13;
                    i72 = i35;
                }
                i12 = i71 | (charAt5 << i73);
                i70 = i35;
            }
            i13 = (charAt15 * 2) + charAt16;
            i17 = charAt17;
            i16 = charAt18;
            iArr = new int[i12 + i14 + charAt19];
            i44 = charAt15;
            i46 = i70;
        }
        Object[] b10 = a0Var.b();
        Class<?> cls = a0Var.a().getClass();
        int[] iArr2 = new int[i16 * 3];
        Object[] objArr = new Object[i16 * 2];
        int i74 = i14 + i12;
        int i75 = i74;
        int i76 = i12;
        int i77 = 0;
        int i78 = 0;
        while (i46 < length) {
            int i79 = i46 + 1;
            int charAt20 = c10.charAt(i46);
            if (charAt20 >= c11) {
                int i80 = charAt20 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i34 = i81 + 1;
                    charAt4 = c10.charAt(i81);
                    if (charAt4 < c11) {
                        break;
                    }
                    i80 |= (charAt4 & '\u1fff') << i82;
                    i82 += 13;
                    i81 = i34;
                }
                charAt20 = i80 | (charAt4 << i82);
                i18 = i34;
            } else {
                i18 = i79;
            }
            int i83 = i18 + 1;
            int charAt21 = c10.charAt(i18);
            if (charAt21 >= c11) {
                int i84 = charAt21 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i33 = i85 + 1;
                    charAt3 = c10.charAt(i85);
                    i19 = length;
                    if (charAt3 < '\ud800') {
                        break;
                    }
                    i84 |= (charAt3 & '\u1fff') << i86;
                    i86 += 13;
                    i85 = i33;
                    length = i19;
                }
                charAt21 = i84 | (charAt3 << i86);
                i20 = i33;
            } else {
                i19 = length;
                i20 = i83;
            }
            int i87 = charAt21 & 255;
            int i88 = i74;
            if ((charAt21 & 1024) != 0) {
                iArr[i77] = i78;
                i77++;
            }
            Unsafe unsafe = f25172p;
            int i89 = i12;
            if (i87 >= 51) {
                int i90 = i20 + 1;
                int charAt22 = c10.charAt(i20);
                if (charAt22 >= 55296) {
                    int i91 = charAt22 & 8191;
                    int i92 = i90;
                    int i93 = 13;
                    while (true) {
                        i32 = i92 + 1;
                        charAt2 = c10.charAt(i92);
                        i21 = i15;
                        if (charAt2 < '\ud800') {
                            break;
                        }
                        i91 |= (charAt2 & '\u1fff') << i93;
                        i93 += 13;
                        i92 = i32;
                        i15 = i21;
                    }
                    charAt22 = i91 | (charAt2 << i93);
                    i30 = i32;
                } else {
                    i21 = i15;
                    i30 = i90;
                }
                int i94 = i87 - 51;
                int i95 = i30;
                if (i94 != 9 && i94 != 17) {
                    if (i94 == 12 && !z10) {
                        objArr[((i78 / 3) * 2) + 1] = b10[i13];
                        i13++;
                    }
                    i31 = 2;
                } else {
                    i31 = 2;
                    objArr[((i78 / 3) * 2) + 1] = b10[i13];
                    i13++;
                }
                int i96 = charAt22 * i31;
                Object obj = b10[i96];
                if (obj instanceof Field) {
                    K10 = (Field) obj;
                } else {
                    K10 = K(cls, (String) obj);
                    b10[i96] = K10;
                }
                int i97 = i13;
                i25 = (int) unsafe.objectFieldOffset(K10);
                int i98 = i96 + 1;
                Object obj2 = b10[i98];
                if (obj2 instanceof Field) {
                    field2 = (Field) obj2;
                } else {
                    field2 = K(cls, (String) obj2);
                    b10[i98] = field2;
                }
                i24 = (int) unsafe.objectFieldOffset(field2);
                i13 = i97;
                i26 = 0;
                i22 = i95;
                i23 = i17;
            } else {
                i21 = i15;
                int i99 = i13 + 1;
                Field K11 = K(cls, (String) b10[i13]);
                i23 = i17;
                if (i87 != 9 && i87 != 17) {
                    if (i87 != 27 && i87 != 49) {
                        if (i87 != 12 && i87 != 30 && i87 != 44) {
                            if (i87 == 50) {
                                int i100 = i76 + 1;
                                iArr[i76] = i78;
                                int i101 = (i78 / 3) * 2;
                                int i102 = i13 + 2;
                                objArr[i101] = b10[i99];
                                if ((charAt21 & 2048) != 0) {
                                    i99 = i13 + 3;
                                    objArr[i101 + 1] = b10[i102];
                                    i76 = i100;
                                } else {
                                    i76 = i100;
                                    i99 = i102;
                                }
                            }
                        } else if (!z10) {
                            i29 = i13 + 2;
                            objArr[((i78 / 3) * 2) + 1] = b10[i99];
                        }
                    } else {
                        i29 = i13 + 2;
                        objArr[((i78 / 3) * 2) + 1] = b10[i99];
                    }
                    i99 = i29;
                } else {
                    objArr[((i78 / 3) * 2) + 1] = K11.getType();
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(K11);
                if ((charAt21 & 4096) == 4096 && i87 <= 17) {
                    int i103 = i20 + 1;
                    int charAt23 = c10.charAt(i20);
                    if (charAt23 >= 55296) {
                        int i104 = charAt23 & 8191;
                        int i105 = 13;
                        while (true) {
                            i22 = i103 + 1;
                            charAt = c10.charAt(i103);
                            if (charAt < '\ud800') {
                                break;
                            }
                            i104 |= (charAt & '\u1fff') << i105;
                            i105 += 13;
                            i103 = i22;
                        }
                        charAt23 = i104 | (charAt << i105);
                    } else {
                        i22 = i103;
                    }
                    int i106 = (charAt23 / 32) + (i44 * 2);
                    Object obj3 = b10[i106];
                    if (obj3 instanceof Field) {
                        field = (Field) obj3;
                    } else {
                        field = K(cls, (String) obj3);
                        b10[i106] = field;
                    }
                    i24 = (int) unsafe.objectFieldOffset(field);
                    i26 = charAt23 % 32;
                } else {
                    i24 = 1048575;
                    i22 = i20;
                    i26 = 0;
                }
                if (i87 >= 18 && i87 <= 49) {
                    iArr[i75] = objectFieldOffset;
                    i75++;
                }
                i13 = i99;
                i25 = objectFieldOffset;
            }
            int i107 = i78 + 1;
            iArr2[i78] = charAt20;
            int i108 = i78 + 2;
            if ((charAt21 & 512) != 0) {
                i27 = 536870912;
            } else {
                i27 = 0;
            }
            if ((charAt21 & 256) != 0) {
                i28 = 268435456;
            } else {
                i28 = 0;
            }
            iArr2[i107] = i28 | i27 | (i87 << 20) | i25;
            i78 += 3;
            iArr2[i108] = (i26 << 20) | i24;
            i74 = i88;
            i17 = i23;
            length = i19;
            i46 = i22;
            i12 = i89;
            i15 = i21;
            c11 = '\ud800';
        }
        return new T(iArr2, objArr, i17, i15, a0Var.a(), z10, iArr, i12, i74, v10, i10, g0Var, rVar, n10);
    }

    public static long C(int i10) {
        return i10 & 1048575;
    }

    public static int D(long j6, Object obj) {
        return ((Integer) m0.f25250c.i(j6, obj)).intValue();
    }

    public static long E(long j6, Object obj) {
        return ((Long) m0.f25250c.i(j6, obj)).longValue();
    }

    public static Field K(Class cls, String str) {
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

    public static int P(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void S(int i10, Object obj, F4.a aVar) {
        if (obj instanceof String) {
            ((AbstractC2055o) aVar.f5033Z).C2(i10, (String) obj);
            return;
        }
        aVar.p(i10, (AbstractC2049i) obj);
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2063x) {
            return ((AbstractC2063x) obj).h();
        }
        return true;
    }

    public static List t(long j6, Object obj) {
        return (List) m0.f25250c.i(j6, obj);
    }

    public final int F(int i10) {
        if (i10 < this.f25175c || i10 > this.f25176d) {
            return -1;
        }
        int[] iArr = this.f25173a;
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

    public final void G(Object obj, long j6, T0.m mVar, b0 b0Var, C2057q c2057q) {
        int u10;
        List c10 = this.f25184l.c(j6, obj);
        int i10 = mVar.f16797b;
        if ((i10 & 7) == 3) {
            do {
                AbstractC2063x g10 = b0Var.g();
                mVar.P(g10, b0Var, c2057q);
                b0Var.d(g10);
                c10.add(g10);
                if (!((AbstractC2053m) mVar.f16800e).c() && mVar.f16799d == 0) {
                    u10 = ((AbstractC2053m) mVar.f16800e).u();
                } else {
                    return;
                }
            } while (u10 == i10);
            mVar.f16799d = u10;
            return;
        }
        throw C.b();
    }

    public final void H(Object obj, int i10, T0.m mVar, b0 b0Var, C2057q c2057q) {
        int u10;
        List c10 = this.f25184l.c(i10 & 1048575, obj);
        int i11 = mVar.f16797b;
        if ((i11 & 7) == 2) {
            do {
                AbstractC2063x g10 = b0Var.g();
                mVar.R(g10, b0Var, c2057q);
                b0Var.d(g10);
                c10.add(g10);
                if (!((AbstractC2053m) mVar.f16800e).c() && mVar.f16799d == 0) {
                    u10 = ((AbstractC2053m) mVar.f16800e).u();
                } else {
                    return;
                }
            } while (u10 == i11);
            mVar.f16799d = u10;
            return;
        }
        throw C.b();
    }

    public final void I(Object obj, int i10, T0.m mVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m0.s(i10 & 1048575, obj, mVar.J());
        } else if (this.f25178f) {
            m0.s(i10 & 1048575, obj, mVar.v());
        } else {
            m0.s(i10 & 1048575, obj, mVar.U());
        }
    }

    public final void J(Object obj, int i10, T0.m mVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        I i11 = this.f25184l;
        if (z10) {
            mVar.y(i11.c(i10 & 1048575, obj));
        } else {
            mVar.x(i11.c(i10 & 1048575, obj));
        }
    }

    public final void L(int i10, Object obj) {
        int i11 = this.f25173a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        m0.q(j6, obj, (1 << (i11 >>> 20)) | m0.f25250c.g(j6, obj));
    }

    public final void M(int i10, Object obj, int i11) {
        m0.q(this.f25173a[i11 + 2] & 1048575, obj, i10);
    }

    public final void N(Object obj, int i10, AbstractC2042b abstractC2042b) {
        f25172p.putObject(obj, Q(i10) & 1048575, abstractC2042b);
        L(i10, obj);
    }

    public final void O(int i10, Object obj, AbstractC2042b abstractC2042b, int i11) {
        f25172p.putObject(obj, Q(i11) & 1048575, abstractC2042b);
        M(i10, obj, i11);
    }

    public final int Q(int i10) {
        return this.f25173a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void R(Object obj, F4.a aVar) {
        int i10;
        boolean z10;
        int[] iArr = this.f25173a;
        int length = iArr.length;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int Q = Q(i13);
            int i15 = iArr[i13];
            int P = P(Q);
            Unsafe unsafe = f25172p;
            if (P <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i10;
            long j6 = Q & i11;
            switch (P) {
                case 0:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.q(i15, m0.f25250c.e(j6, obj));
                        break;
                    }
                case 1:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.x(i15, m0.f25250c.f(j6, obj));
                        break;
                    }
                case 2:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.A(i15, unsafe.getLong(obj, j6));
                        break;
                    }
                case 3:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.H(i15, unsafe.getLong(obj, j6));
                        break;
                    }
                case 4:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.z(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 5:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.v(i15, unsafe.getLong(obj, j6));
                        break;
                    }
                case 6:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.u(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 7:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.o(i15, m0.f25250c.c(j6, obj));
                        break;
                    }
                case 8:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        S(i15, unsafe.getObject(obj, j6), aVar);
                        break;
                    }
                case 9:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.B(i15, n(i13), unsafe.getObject(obj, j6));
                        break;
                    }
                case 10:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.p(i15, (AbstractC2049i) unsafe.getObject(obj, j6));
                        break;
                    }
                case 11:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.G(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 12:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.r(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 13:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.C(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 14:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.D(i15, unsafe.getLong(obj, j6));
                        break;
                    }
                case 15:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.E(i15, unsafe.getInt(obj, j6));
                        break;
                    }
                case 16:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.F(i15, unsafe.getLong(obj, j6));
                        break;
                    }
                case 17:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        aVar.y(i15, n(i13), unsafe.getObject(obj, j6));
                        break;
                    }
                case 18:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 19:
                    c0.J(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 20:
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 21:
                    c0.U(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 22:
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 23:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 24:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 25:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 26:
                    c0.S(iArr[i13], (List) unsafe.getObject(obj, j6), aVar);
                    break;
                case 27:
                    c0.N(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, n(i13));
                    break;
                case 28:
                    c0.E(iArr[i13], (List) unsafe.getObject(obj, j6), aVar);
                    break;
                case 29:
                    z10 = false;
                    c0.T(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 30:
                    z10 = false;
                    c0.G(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 31:
                    z10 = false;
                    c0.O(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 32:
                    z10 = false;
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 33:
                    z10 = false;
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 34:
                    z10 = false;
                    c0.R(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, false);
                    break;
                case 35:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 36:
                    c0.J(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 37:
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 38:
                    c0.U(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 39:
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 40:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 41:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 42:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 43:
                    c0.T(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 44:
                    c0.G(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 45:
                    c0.O(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 46:
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 47:
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case r9.y.f44626f /* 48 */:
                    c0.R(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, true);
                    break;
                case 49:
                    c0.K(iArr[i13], (List) unsafe.getObject(obj, j6), aVar, n(i13));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    if (unsafe.getObject(obj, j6) != null) {
                        Object m10 = m(i13);
                        this.f25186n.getClass();
                        AbstractC2469q0.p(m10);
                        throw null;
                    }
                    break;
                case 51:
                    if (s(i15, obj, i13)) {
                        aVar.q(i15, ((Double) m0.f25250c.i(j6, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (s(i15, obj, i13)) {
                        aVar.x(i15, ((Float) m0.f25250c.i(j6, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (s(i15, obj, i13)) {
                        aVar.A(i15, E(j6, obj));
                    }
                    break;
                case 54:
                    if (s(i15, obj, i13)) {
                        aVar.H(i15, E(j6, obj));
                    }
                    break;
                case 55:
                    if (s(i15, obj, i13)) {
                        aVar.z(i15, D(j6, obj));
                    }
                    break;
                case 56:
                    if (s(i15, obj, i13)) {
                        aVar.v(i15, E(j6, obj));
                    }
                    break;
                case 57:
                    if (s(i15, obj, i13)) {
                        aVar.u(i15, D(j6, obj));
                    }
                    break;
                case 58:
                    if (s(i15, obj, i13)) {
                        aVar.o(i15, ((Boolean) m0.f25250c.i(j6, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i15, obj, i13)) {
                        S(i15, unsafe.getObject(obj, j6), aVar);
                    }
                    break;
                case 60:
                    if (s(i15, obj, i13)) {
                        aVar.B(i15, n(i13), unsafe.getObject(obj, j6));
                    }
                    break;
                case 61:
                    if (s(i15, obj, i13)) {
                        aVar.p(i15, (AbstractC2049i) unsafe.getObject(obj, j6));
                    }
                    break;
                case 62:
                    if (s(i15, obj, i13)) {
                        aVar.G(i15, D(j6, obj));
                    }
                    break;
                case 63:
                    if (s(i15, obj, i13)) {
                        aVar.r(i15, D(j6, obj));
                    }
                    break;
                case 64:
                    if (s(i15, obj, i13)) {
                        aVar.C(i15, D(j6, obj));
                    }
                    break;
                case 65:
                    if (s(i15, obj, i13)) {
                        aVar.D(i15, E(j6, obj));
                    }
                    break;
                case 66:
                    if (s(i15, obj, i13)) {
                        aVar.E(i15, D(j6, obj));
                    }
                    break;
                case 67:
                    if (s(i15, obj, i13)) {
                        aVar.F(i15, E(j6, obj));
                    }
                    break;
                case 68:
                    if (s(i15, obj, i13)) {
                        aVar.y(i15, n(i13), unsafe.getObject(obj, j6));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        this.f25185m.getClass();
        ((AbstractC2063x) obj).unknownFields.d(aVar);
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final boolean a(Object obj, Object obj2) {
        boolean z10;
        int[] iArr = this.f25173a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int Q = Q(i10);
            long j6 = Q & 1048575;
            switch (P(Q)) {
                case 0:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var = m0.f25250c;
                        if (Double.doubleToLongBits(l0Var.e(j6, obj)) == Double.doubleToLongBits(l0Var.e(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var2 = m0.f25250c;
                        if (Float.floatToIntBits(l0Var2.f(j6, obj)) == Float.floatToIntBits(l0Var2.f(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var3 = m0.f25250c;
                        if (l0Var3.h(j6, obj) == l0Var3.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var4 = m0.f25250c;
                        if (l0Var4.h(j6, obj) == l0Var4.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var5 = m0.f25250c;
                        if (l0Var5.g(j6, obj) == l0Var5.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var6 = m0.f25250c;
                        if (l0Var6.h(j6, obj) == l0Var6.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var7 = m0.f25250c;
                        if (l0Var7.g(j6, obj) == l0Var7.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var8 = m0.f25250c;
                        if (l0Var8.c(j6, obj) == l0Var8.c(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var9 = m0.f25250c;
                        if (c0.C(l0Var9.i(j6, obj), l0Var9.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var10 = m0.f25250c;
                        if (c0.C(l0Var10.i(j6, obj), l0Var10.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var11 = m0.f25250c;
                        if (c0.C(l0Var11.i(j6, obj), l0Var11.i(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var12 = m0.f25250c;
                        if (l0Var12.g(j6, obj) == l0Var12.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var13 = m0.f25250c;
                        if (l0Var13.g(j6, obj) == l0Var13.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var14 = m0.f25250c;
                        if (l0Var14.g(j6, obj) == l0Var14.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var15 = m0.f25250c;
                        if (l0Var15.h(j6, obj) == l0Var15.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var16 = m0.f25250c;
                        if (l0Var16.g(j6, obj) == l0Var16.g(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var17 = m0.f25250c;
                        if (l0Var17.h(j6, obj) == l0Var17.h(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (j(obj, i10, obj2)) {
                        l0 l0Var18 = m0.f25250c;
                        if (c0.C(l0Var18.i(j6, obj), l0Var18.i(j6, obj2))) {
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
                    l0 l0Var19 = m0.f25250c;
                    z10 = c0.C(l0Var19.i(j6, obj), l0Var19.i(j6, obj2));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    l0 l0Var20 = m0.f25250c;
                    z10 = c0.C(l0Var20.i(j6, obj), l0Var20.i(j6, obj2));
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
                    l0 l0Var21 = m0.f25250c;
                    if (l0Var21.g(j10, obj) == l0Var21.g(j10, obj2) && c0.C(l0Var21.i(j6, obj), l0Var21.i(j6, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z10) {
                return false;
            }
        }
        this.f25185m.getClass();
        if (!((AbstractC2063x) obj).unknownFields.equals(((AbstractC2063x) obj2).unknownFields)) {
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
    @Override // androidx.glance.appwidget.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i10;
        int b10;
        int i11;
        int[] iArr = this.f25173a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int Q = Q(i13);
            int i14 = iArr[i13];
            long j6 = 1048575 & Q;
            int i15 = 1237;
            int i16 = 37;
            switch (P(Q)) {
                case 0:
                    i10 = i12 * 53;
                    b10 = A.b(Double.doubleToLongBits(m0.f25250c.e(j6, obj)));
                    i12 = b10 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    b10 = Float.floatToIntBits(m0.f25250c.f(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    b10 = A.b(m0.f25250c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    b10 = A.b(m0.f25250c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    b10 = A.b(m0.f25250c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean c10 = m0.f25250c.c(j6, obj);
                    Charset charset = A.f25144a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    b10 = ((String) m0.f25250c.i(j6, obj)).hashCode();
                    i12 = b10 + i10;
                    break;
                case 9:
                    Object i17 = m0.f25250c.i(j6, obj);
                    if (i17 != null) {
                        i16 = i17.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    b10 = A.b(m0.f25250c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.g(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    b10 = A.b(m0.f25250c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 17:
                    Object i18 = m0.f25250c.i(j6, obj);
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
                    b10 = m0.f25250c.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    b10 = m0.f25250c.i(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 51:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(Double.doubleToLongBits(((Double) m0.f25250c.i(j6, obj)).doubleValue()));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = Float.floatToIntBits(((Float) m0.f25250c.i(j6, obj)).floatValue());
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(E(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(E(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(E(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i14, obj, i13)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) m0.f25250c.i(j6, obj)).booleanValue();
                        Charset charset2 = A.f25144a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = ((String) m0.f25250c.i(j6, obj)).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = m0.f25250c.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = m0.f25250c.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(E(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = D(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = A.b(E(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = m0.f25250c.i(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f25185m.getClass();
        return ((AbstractC2063x) obj).unknownFields.hashCode() + (i12 * 53);
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void c(Object obj, Object obj2) {
        if (r(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.f25173a;
                if (i10 < iArr.length) {
                    int Q = Q(i10);
                    long j6 = 1048575 & Q;
                    int i11 = iArr[i10];
                    switch (P(Q)) {
                        case 0:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                l0 l0Var = m0.f25250c;
                                l0Var.m(obj, j6, l0Var.e(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 1:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                l0 l0Var2 = m0.f25250c;
                                l0Var2.n(obj, j6, l0Var2.f(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 2:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.r(obj, j6, m0.f25250c.h(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 3:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.r(obj, j6, m0.f25250c.h(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 4:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 5:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.r(obj, j6, m0.f25250c.h(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 6:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 7:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                l0 l0Var3 = m0.f25250c;
                                l0Var3.k(obj, j6, l0Var3.c(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 8:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.s(j6, obj, m0.f25250c.i(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 9:
                            w(obj, i10, obj2);
                            break;
                        case 10:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.s(j6, obj, m0.f25250c.i(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 11:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 12:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 13:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 14:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.r(obj, j6, m0.f25250c.h(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 15:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.q(j6, obj, m0.f25250c.g(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 16:
                            if (!q(i10, obj2)) {
                                break;
                            } else {
                                m0.r(obj, j6, m0.f25250c.h(j6, obj2));
                                L(i10, obj);
                                break;
                            }
                        case 17:
                            w(obj, i10, obj2);
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
                            this.f25184l.b(j6, obj, obj2);
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            Class cls = c0.f25203a;
                            l0 l0Var4 = m0.f25250c;
                            Object i12 = l0Var4.i(j6, obj);
                            Object i13 = l0Var4.i(j6, obj2);
                            this.f25186n.getClass();
                            m0.s(j6, obj, N.b(i12, i13));
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
                            if (!s(i11, obj2, i10)) {
                                break;
                            } else {
                                m0.s(j6, obj, m0.f25250c.i(j6, obj2));
                                M(i11, obj, i10);
                                break;
                            }
                        case 60:
                            x(obj, i10, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!s(i11, obj2, i10)) {
                                break;
                            } else {
                                m0.s(j6, obj, m0.f25250c.i(j6, obj2));
                                M(i11, obj, i10);
                                break;
                            }
                        case 68:
                            x(obj, i10, obj2);
                            break;
                    }
                    i10 += 3;
                } else {
                    c0.B(this.f25185m, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void d(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof AbstractC2063x) {
            AbstractC2063x abstractC2063x = (AbstractC2063x) obj;
            abstractC2063x.c();
            abstractC2063x.b();
            abstractC2063x.i();
        }
        int length = this.f25173a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int Q = Q(i10);
            long j6 = 1048575 & Q;
            int P = P(Q);
            Unsafe unsafe = f25172p;
            if (P != 9) {
                switch (P) {
                    case 17:
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
                        this.f25184l.a(j6, obj);
                        continue;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object object = unsafe.getObject(obj, j6);
                        if (object != null) {
                            this.f25186n.getClass();
                            N.c(object);
                            unsafe.putObject(obj, j6, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (q(i10, obj)) {
                n(i10).d(unsafe.getObject(obj, j6));
            }
        }
        this.f25185m.getClass();
        g0.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9 A[SYNTHETIC] */
    @Override // androidx.glance.appwidget.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Object obj) {
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25181i; i12++) {
            int i13 = this.f25180h[i12];
            int[] iArr = this.f25173a;
            int i14 = iArr[i13];
            int Q = Q(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f25172p.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & Q) != 0) {
                if (i10 == 1048575) {
                    if (!q(i13, obj)) {
                        return false;
                    }
                } else if ((i11 & i17) == 0) {
                    return false;
                }
            }
            int P = P(Q);
            if (P != 9 && P != 17) {
                if (P != 27) {
                    if (P != 60 && P != 68) {
                        if (P != 49) {
                            if (P != 50) {
                                continue;
                            } else {
                                Object i18 = m0.f25250c.i(Q & 1048575, obj);
                                this.f25186n.getClass();
                                if (!((M) i18).isEmpty()) {
                                    AbstractC2469q0.p(m(i13));
                                    throw null;
                                }
                            }
                        }
                    } else if (s(i14, obj, i13)) {
                        if (!n(i13).e(m0.f25250c.i(Q & 1048575, obj))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) m0.f25250c.i(Q & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    b0 n10 = n(i13);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!n10.e(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (i10 == 1048575) {
                if (!q(i13, obj)) {
                    continue;
                }
                if (n(i13).e(m0.f25250c.i(Q & 1048575, obj))) {
                    return false;
                }
            } else {
                if ((i17 & i11) == 0) {
                    continue;
                }
                if (n(i13).e(m0.f25250c.i(Q & 1048575, obj))) {
                }
            }
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final int f(Object obj) {
        if (this.f25179g) {
            return p(obj);
        }
        return o(obj);
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final AbstractC2063x g() {
        this.f25183k.getClass();
        return ((AbstractC2063x) this.f25177e).j();
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void h(Object obj, F4.a aVar) {
        aVar.getClass();
        if (this.f25179g) {
            int[] iArr = this.f25173a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int Q = Q(i10);
                int i11 = iArr[i10];
                switch (P(Q)) {
                    case 0:
                        if (q(i10, obj)) {
                            aVar.q(i11, m0.f25250c.e(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (q(i10, obj)) {
                            aVar.x(i11, m0.f25250c.f(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (q(i10, obj)) {
                            aVar.A(i11, m0.f25250c.h(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (q(i10, obj)) {
                            aVar.H(i11, m0.f25250c.h(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (q(i10, obj)) {
                            aVar.z(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (q(i10, obj)) {
                            aVar.v(i11, m0.f25250c.h(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (q(i10, obj)) {
                            aVar.u(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (q(i10, obj)) {
                            aVar.o(i11, m0.f25250c.c(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (q(i10, obj)) {
                            S(i11, m0.f25250c.i(Q & 1048575, obj), aVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (q(i10, obj)) {
                            aVar.B(i11, n(i10), m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (q(i10, obj)) {
                            aVar.p(i11, (AbstractC2049i) m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (q(i10, obj)) {
                            aVar.G(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (q(i10, obj)) {
                            aVar.r(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (q(i10, obj)) {
                            aVar.C(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (q(i10, obj)) {
                            aVar.D(i11, m0.f25250c.h(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (q(i10, obj)) {
                            aVar.E(i11, m0.f25250c.g(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (q(i10, obj)) {
                            aVar.F(i11, m0.f25250c.h(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (q(i10, obj)) {
                            aVar.y(i11, n(i10), m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c0.F(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 19:
                        c0.J(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 20:
                        c0.M(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 21:
                        c0.U(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 22:
                        c0.L(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 23:
                        c0.I(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 24:
                        c0.H(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 25:
                        c0.D(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 26:
                        c0.S(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar);
                        break;
                    case 27:
                        c0.N(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, n(i10));
                        break;
                    case 28:
                        c0.E(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar);
                        break;
                    case 29:
                        c0.T(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 30:
                        c0.G(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 31:
                        c0.O(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 32:
                        c0.P(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 33:
                        c0.Q(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 34:
                        c0.R(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, false);
                        break;
                    case 35:
                        c0.F(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 36:
                        c0.J(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 37:
                        c0.M(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 38:
                        c0.U(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 39:
                        c0.L(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 40:
                        c0.I(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 41:
                        c0.H(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 42:
                        c0.D(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 43:
                        c0.T(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 44:
                        c0.G(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 45:
                        c0.O(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 46:
                        c0.P(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 47:
                        c0.Q(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case r9.y.f44626f /* 48 */:
                        c0.R(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, true);
                        break;
                    case 49:
                        c0.K(iArr[i10], (List) m0.f25250c.i(Q & 1048575, obj), aVar, n(i10));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        if (m0.f25250c.i(Q & 1048575, obj) != null) {
                            Object m10 = m(i10);
                            this.f25186n.getClass();
                            AbstractC2469q0.p(m10);
                            throw null;
                        }
                        break;
                    case 51:
                        if (s(i11, obj, i10)) {
                            aVar.q(i11, ((Double) m0.f25250c.i(Q & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (s(i11, obj, i10)) {
                            aVar.x(i11, ((Float) m0.f25250c.i(Q & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (s(i11, obj, i10)) {
                            aVar.A(i11, E(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (s(i11, obj, i10)) {
                            aVar.H(i11, E(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (s(i11, obj, i10)) {
                            aVar.z(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (s(i11, obj, i10)) {
                            aVar.v(i11, E(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (s(i11, obj, i10)) {
                            aVar.u(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (s(i11, obj, i10)) {
                            aVar.o(i11, ((Boolean) m0.f25250c.i(Q & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (s(i11, obj, i10)) {
                            S(i11, m0.f25250c.i(Q & 1048575, obj), aVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (s(i11, obj, i10)) {
                            aVar.B(i11, n(i10), m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (s(i11, obj, i10)) {
                            aVar.p(i11, (AbstractC2049i) m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (s(i11, obj, i10)) {
                            aVar.G(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (s(i11, obj, i10)) {
                            aVar.r(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (s(i11, obj, i10)) {
                            aVar.C(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (s(i11, obj, i10)) {
                            aVar.D(i11, E(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (s(i11, obj, i10)) {
                            aVar.E(i11, D(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (s(i11, obj, i10)) {
                            aVar.F(i11, E(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (s(i11, obj, i10)) {
                            aVar.y(i11, n(i10), m0.f25250c.i(Q & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f25185m.getClass();
            ((AbstractC2063x) obj).unknownFields.d(aVar);
            return;
        }
        R(obj, aVar);
    }

    @Override // androidx.glance.appwidget.protobuf.b0
    public final void i(Object obj, T0.m mVar, C2057q c2057q) {
        c2057q.getClass();
        if (r(obj)) {
            u(this.f25185m, obj, mVar, c2057q);
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        if (q(i10, obj) == q(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final void k(Object obj, int i10, Object obj2) {
        int i11 = this.f25173a[i10];
        if (m0.f25250c.i(Q(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        AbstractC2469q0.p(this.f25174b[((i10 / 3) * 2) + 1]);
    }

    public final Object m(int i10) {
        return this.f25174b[(i10 / 3) * 2];
    }

    public final b0 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f25174b;
        b0 b0Var = (b0) objArr[i11];
        if (b0Var != null) {
            return b0Var;
        }
        b0 a5 = Y.f25192c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a5;
        return a5;
    }

    public final int o(Object obj) {
        int i10;
        int X12;
        int k22;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.f25173a;
            if (i11 < iArr.length) {
                int Q = Q(i11);
                int i15 = iArr[i11];
                int P = P(Q);
                Unsafe unsafe = f25172p;
                if (P <= 17) {
                    int i16 = iArr[i11 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i14) {
                        i13 = unsafe.getInt(obj, i17);
                        i14 = i17;
                    }
                } else {
                    i10 = 0;
                }
                long j6 = Q & 1048575;
                switch (P) {
                    case 0:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.X1(i15);
                            i12 += X12;
                            break;
                        }
                    case 1:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.b2(i15);
                            i12 += X12;
                            break;
                        }
                    case 2:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.f2(i15, unsafe.getLong(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 3:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.p2(i15, unsafe.getLong(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 4:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.d2(i15, unsafe.getInt(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 5:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.a2(i15);
                            i12 += X12;
                            break;
                        }
                    case 6:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.Z1(i15);
                            i12 += X12;
                            break;
                        }
                    case 7:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.U1(i15);
                            i12 += X12;
                            break;
                        }
                    case 8:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j6);
                            if (object instanceof AbstractC2049i) {
                                k22 = AbstractC2055o.V1(i15, (AbstractC2049i) object);
                            } else {
                                k22 = AbstractC2055o.k2(i15, (String) object);
                            }
                            i12 = k22 + i12;
                            break;
                        }
                    case 9:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = c0.o(i15, n(i11), unsafe.getObject(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 10:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.V1(i15, (AbstractC2049i) unsafe.getObject(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 11:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.n2(i15, unsafe.getInt(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 12:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.Y1(i15, unsafe.getInt(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 13:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.g2(i15);
                            i12 += X12;
                            break;
                        }
                    case 14:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.h2(i15);
                            i12 += X12;
                            break;
                        }
                    case 15:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.i2(i15, unsafe.getInt(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 16:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.j2(i15, unsafe.getLong(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 17:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            X12 = AbstractC2055o.c2(i15, (AbstractC2042b) unsafe.getObject(obj, j6), n(i11));
                            i12 += X12;
                            break;
                        }
                    case 18:
                        X12 = c0.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 19:
                        X12 = c0.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 20:
                        X12 = c0.m(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 21:
                        X12 = c0.x(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 22:
                        X12 = c0.k(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 23:
                        X12 = c0.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 24:
                        X12 = c0.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 25:
                        X12 = c0.a(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 26:
                        X12 = c0.u(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 27:
                        X12 = c0.p(i15, (List) unsafe.getObject(obj, j6), n(i11));
                        i12 += X12;
                        break;
                    case 28:
                        X12 = c0.c(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 29:
                        X12 = c0.v(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 30:
                        X12 = c0.d(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 31:
                        X12 = c0.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 32:
                        X12 = c0.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 33:
                        X12 = c0.q(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 34:
                        X12 = c0.s(i15, (List) unsafe.getObject(obj, j6));
                        i12 += X12;
                        break;
                    case 35:
                        int i18 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i18 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(i18, AbstractC2055o.m2(i15), i18, i12);
                            break;
                        }
                    case 36:
                        int g10 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(g10, AbstractC2055o.m2(i15), g10, i12);
                            break;
                        }
                    case 37:
                        int n10 = c0.n((List) unsafe.getObject(obj, j6));
                        if (n10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(n10, AbstractC2055o.m2(i15), n10, i12);
                            break;
                        }
                    case 38:
                        int y10 = c0.y((List) unsafe.getObject(obj, j6));
                        if (y10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(y10, AbstractC2055o.m2(i15), y10, i12);
                            break;
                        }
                    case 39:
                        int l10 = c0.l((List) unsafe.getObject(obj, j6));
                        if (l10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(l10, AbstractC2055o.m2(i15), l10, i12);
                            break;
                        }
                    case 40:
                        int i19 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i19 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(i19, AbstractC2055o.m2(i15), i19, i12);
                            break;
                        }
                    case 41:
                        int g11 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g11 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(g11, AbstractC2055o.m2(i15), g11, i12);
                            break;
                        }
                    case 42:
                        int b10 = c0.b((List) unsafe.getObject(obj, j6));
                        if (b10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(b10, AbstractC2055o.m2(i15), b10, i12);
                            break;
                        }
                    case 43:
                        int w10 = c0.w((List) unsafe.getObject(obj, j6));
                        if (w10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(w10, AbstractC2055o.m2(i15), w10, i12);
                            break;
                        }
                    case 44:
                        int e10 = c0.e((List) unsafe.getObject(obj, j6));
                        if (e10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(e10, AbstractC2055o.m2(i15), e10, i12);
                            break;
                        }
                    case 45:
                        int g12 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g12 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(g12, AbstractC2055o.m2(i15), g12, i12);
                            break;
                        }
                    case 46:
                        int i20 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i20 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(i20, AbstractC2055o.m2(i15), i20, i12);
                            break;
                        }
                    case 47:
                        int r10 = c0.r((List) unsafe.getObject(obj, j6));
                        if (r10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(r10, AbstractC2055o.m2(i15), r10, i12);
                            break;
                        }
                    case r9.y.f44626f /* 48 */:
                        int t10 = c0.t((List) unsafe.getObject(obj, j6));
                        if (t10 <= 0) {
                            break;
                        } else {
                            i12 = android.gov.nist.core.a.B(t10, AbstractC2055o.m2(i15), t10, i12);
                            break;
                        }
                    case 49:
                        X12 = c0.j(i15, (List) unsafe.getObject(obj, j6), n(i11));
                        i12 += X12;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object object2 = unsafe.getObject(obj, j6);
                        Object m10 = m(i11);
                        this.f25186n.getClass();
                        N.a(object2, m10);
                        break;
                    case 51:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.X1(i15);
                            i12 += X12;
                            break;
                        }
                    case 52:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.b2(i15);
                            i12 += X12;
                            break;
                        }
                    case 53:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.f2(i15, E(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 54:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.p2(i15, E(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 55:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.d2(i15, D(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 56:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.a2(i15);
                            i12 += X12;
                            break;
                        }
                    case 57:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.Z1(i15);
                            i12 += X12;
                            break;
                        }
                    case 58:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.U1(i15);
                            i12 += X12;
                            break;
                        }
                    case 59:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j6);
                            if (object3 instanceof AbstractC2049i) {
                                k22 = AbstractC2055o.V1(i15, (AbstractC2049i) object3);
                            } else {
                                k22 = AbstractC2055o.k2(i15, (String) object3);
                            }
                            i12 = k22 + i12;
                            break;
                        }
                    case 60:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = c0.o(i15, n(i11), unsafe.getObject(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 61:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.V1(i15, (AbstractC2049i) unsafe.getObject(obj, j6));
                            i12 += X12;
                            break;
                        }
                    case 62:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.n2(i15, D(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 63:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.Y1(i15, D(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 64:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.g2(i15);
                            i12 += X12;
                            break;
                        }
                    case 65:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.h2(i15);
                            i12 += X12;
                            break;
                        }
                    case 66:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.i2(i15, D(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 67:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.j2(i15, E(j6, obj));
                            i12 += X12;
                            break;
                        }
                    case 68:
                        if (!s(i15, obj, i11)) {
                            break;
                        } else {
                            X12 = AbstractC2055o.c2(i15, (AbstractC2042b) unsafe.getObject(obj, j6), n(i11));
                            i12 += X12;
                            break;
                        }
                }
                i11 += 3;
            } else {
                this.f25185m.getClass();
                return ((AbstractC2063x) obj).unknownFields.b() + i12;
            }
        }
    }

    public final int p(Object obj) {
        int X12;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f25173a;
            if (i10 < iArr.length) {
                int Q = Q(i10);
                int P = P(Q);
                int i12 = iArr[i10];
                long j6 = Q & 1048575;
                if (P >= EnumC2059t.DOUBLE_LIST_PACKED.a() && P <= EnumC2059t.SINT64_LIST_PACKED.a()) {
                    int i13 = iArr[i10 + 2];
                }
                Unsafe unsafe = f25172p;
                switch (P) {
                    case 0:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.X1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.b2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.f2(i12, m0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.p2(i12, m0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.d2(i12, m0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.a2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.Z1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.U1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (q(i10, obj)) {
                            Object l10 = m0.l(j6, obj);
                            if (l10 instanceof AbstractC2049i) {
                                X12 = AbstractC2055o.V1(i12, (AbstractC2049i) l10);
                                break;
                            } else {
                                X12 = AbstractC2055o.k2(i12, (String) l10);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (q(i10, obj)) {
                            X12 = c0.o(i12, n(i10), m0.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.V1(i12, (AbstractC2049i) m0.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.n2(i12, m0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.Y1(i12, m0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.g2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.h2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.i2(i12, m0.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.j2(i12, m0.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (q(i10, obj)) {
                            X12 = AbstractC2055o.c2(i12, (AbstractC2042b) m0.l(j6, obj), n(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        X12 = c0.h(i12, t(j6, obj));
                        break;
                    case 19:
                        X12 = c0.f(i12, t(j6, obj));
                        break;
                    case 20:
                        X12 = c0.m(i12, t(j6, obj));
                        break;
                    case 21:
                        X12 = c0.x(i12, t(j6, obj));
                        break;
                    case 22:
                        X12 = c0.k(i12, t(j6, obj));
                        break;
                    case 23:
                        X12 = c0.h(i12, t(j6, obj));
                        break;
                    case 24:
                        X12 = c0.f(i12, t(j6, obj));
                        break;
                    case 25:
                        X12 = c0.a(i12, t(j6, obj));
                        break;
                    case 26:
                        X12 = c0.u(i12, t(j6, obj));
                        break;
                    case 27:
                        X12 = c0.p(i12, t(j6, obj), n(i10));
                        break;
                    case 28:
                        X12 = c0.c(i12, t(j6, obj));
                        break;
                    case 29:
                        X12 = c0.v(i12, t(j6, obj));
                        break;
                    case 30:
                        X12 = c0.d(i12, t(j6, obj));
                        break;
                    case 31:
                        X12 = c0.f(i12, t(j6, obj));
                        break;
                    case 32:
                        X12 = c0.h(i12, t(j6, obj));
                        break;
                    case 33:
                        X12 = c0.q(i12, t(j6, obj));
                        break;
                    case 34:
                        X12 = c0.s(i12, t(j6, obj));
                        break;
                    case 35:
                        int i14 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i14 > 0) {
                            i11 = android.gov.nist.core.a.B(i14, AbstractC2055o.m2(i12), i14, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 36:
                        int g10 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g10 > 0) {
                            i11 = android.gov.nist.core.a.B(g10, AbstractC2055o.m2(i12), g10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 37:
                        int n10 = c0.n((List) unsafe.getObject(obj, j6));
                        if (n10 > 0) {
                            i11 = android.gov.nist.core.a.B(n10, AbstractC2055o.m2(i12), n10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 38:
                        int y10 = c0.y((List) unsafe.getObject(obj, j6));
                        if (y10 > 0) {
                            i11 = android.gov.nist.core.a.B(y10, AbstractC2055o.m2(i12), y10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 39:
                        int l11 = c0.l((List) unsafe.getObject(obj, j6));
                        if (l11 > 0) {
                            i11 = android.gov.nist.core.a.B(l11, AbstractC2055o.m2(i12), l11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 40:
                        int i15 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i15 > 0) {
                            i11 = android.gov.nist.core.a.B(i15, AbstractC2055o.m2(i12), i15, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 41:
                        int g11 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g11 > 0) {
                            i11 = android.gov.nist.core.a.B(g11, AbstractC2055o.m2(i12), g11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 42:
                        int b10 = c0.b((List) unsafe.getObject(obj, j6));
                        if (b10 > 0) {
                            i11 = android.gov.nist.core.a.B(b10, AbstractC2055o.m2(i12), b10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 43:
                        int w10 = c0.w((List) unsafe.getObject(obj, j6));
                        if (w10 > 0) {
                            i11 = android.gov.nist.core.a.B(w10, AbstractC2055o.m2(i12), w10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 44:
                        int e10 = c0.e((List) unsafe.getObject(obj, j6));
                        if (e10 > 0) {
                            i11 = android.gov.nist.core.a.B(e10, AbstractC2055o.m2(i12), e10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 45:
                        int g12 = c0.g((List) unsafe.getObject(obj, j6));
                        if (g12 > 0) {
                            i11 = android.gov.nist.core.a.B(g12, AbstractC2055o.m2(i12), g12, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 46:
                        int i16 = c0.i((List) unsafe.getObject(obj, j6));
                        if (i16 > 0) {
                            i11 = android.gov.nist.core.a.B(i16, AbstractC2055o.m2(i12), i16, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 47:
                        int r10 = c0.r((List) unsafe.getObject(obj, j6));
                        if (r10 > 0) {
                            i11 = android.gov.nist.core.a.B(r10, AbstractC2055o.m2(i12), r10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case r9.y.f44626f /* 48 */:
                        int t10 = c0.t((List) unsafe.getObject(obj, j6));
                        if (t10 > 0) {
                            i11 = android.gov.nist.core.a.B(t10, AbstractC2055o.m2(i12), t10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 49:
                        X12 = c0.j(i12, t(j6, obj), n(i10));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object l12 = m0.l(j6, obj);
                        Object m10 = m(i10);
                        this.f25186n.getClass();
                        N.a(l12, m10);
                        continue;
                        i10 += 3;
                    case 51:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.X1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 52:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.b2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 53:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.f2(i12, E(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 54:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.p2(i12, E(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 55:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.d2(i12, D(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 56:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.a2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 57:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.Z1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 58:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.U1(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 59:
                        if (s(i12, obj, i10)) {
                            Object l13 = m0.l(j6, obj);
                            if (l13 instanceof AbstractC2049i) {
                                X12 = AbstractC2055o.V1(i12, (AbstractC2049i) l13);
                                break;
                            } else {
                                X12 = AbstractC2055o.k2(i12, (String) l13);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 60:
                        if (s(i12, obj, i10)) {
                            X12 = c0.o(i12, n(i10), m0.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 61:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.V1(i12, (AbstractC2049i) m0.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 62:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.n2(i12, D(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 63:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.Y1(i12, D(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 64:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.g2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 65:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.h2(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 66:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.i2(i12, D(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 67:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.j2(i12, E(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 68:
                        if (s(i12, obj, i10)) {
                            X12 = AbstractC2055o.c2(i12, (AbstractC2042b) m0.l(j6, obj), n(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    default:
                        i10 += 3;
                }
                i11 = X12 + i11;
                i10 += 3;
            } else {
                this.f25185m.getClass();
                return ((AbstractC2063x) obj).unknownFields.b() + i11;
            }
        }
    }

    public final boolean q(int i10, Object obj) {
        int i11 = this.f25173a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int Q = Q(i10);
            long j10 = Q & 1048575;
            switch (P(Q)) {
                case 0:
                    if (Double.doubleToRawLongBits(m0.f25250c.e(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(m0.f25250c.f(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (m0.f25250c.h(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (m0.f25250c.h(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (m0.f25250c.h(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return m0.f25250c.c(j10, obj);
                case 8:
                    Object i12 = m0.f25250c.i(j10, obj);
                    if (i12 instanceof String) {
                        return !((String) i12).isEmpty();
                    }
                    if (i12 instanceof AbstractC2049i) {
                        return !AbstractC2049i.f25223Z.equals(i12);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (m0.f25250c.i(j10, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC2049i.f25223Z.equals(m0.f25250c.i(j10, obj));
                case 11:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (m0.f25250c.h(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (m0.f25250c.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (m0.f25250c.h(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (m0.f25250c.i(j10, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & m0.f25250c.g(j6, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean s(int i10, Object obj, int i11) {
        if (m0.f25250c.g(this.f25173a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        r19.getClass();
        ((androidx.glance.appwidget.protobuf.AbstractC2063x) r20).unknownFields = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r14 >= r13) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        k(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r7 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        ((androidx.glance.appwidget.protobuf.AbstractC2063x) r20).unknownFields = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r14 >= r13) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        k(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r7 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        ((androidx.glance.appwidget.protobuf.AbstractC2063x) r20).unknownFields = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r14 >= r13) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        k(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r7 == null) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ff A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:12:0x0036, B:14:0x003b, B:17:0x0043, B:29:0x006c, B:30:0x0073, B:37:0x008e, B:39:0x00a1, B:40:0x00b4, B:41:0x00c7, B:42:0x00da, B:43:0x00ed, B:44:0x0103, B:45:0x0116, B:46:0x0126, B:47:0x013b, B:48:0x0143, B:49:0x0157, B:50:0x016b, B:51:0x017f, B:52:0x0193, B:53:0x01a7, B:54:0x01bb, B:55:0x01cf, B:56:0x01e3, B:57:0x01ea, B:117:0x04fa, B:119:0x04ff, B:120:0x0504), top: B:134:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0523 A[LOOP:4: B:128:0x0521->B:129:0x0523, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x050a A[EDGE_INSN: B:121:0x0508->B:152:0x050a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(g0 g0Var, Object obj, T0.m mVar, C2057q c2057q) {
        Throwable th2;
        f0 f0Var;
        g0 g0Var2 = g0Var;
        int[] iArr = this.f25180h;
        int i10 = this.f25182j;
        int i11 = this.f25181i;
        Throwable th3 = null;
        f0 f0Var2 = null;
        while (true) {
            try {
                int w10 = mVar.w();
                int F10 = F(w10);
                if (F10 < 0) {
                    if (w10 == Integer.MAX_VALUE) {
                        break;
                    }
                    try {
                        g0Var.getClass();
                        if (f0Var2 == null) {
                            f0Var2 = g0.a(obj);
                        }
                        if (g0.c(f0Var2, mVar)) {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        while (i11 < i10) {
                            k(obj, iArr[i11], f0Var2);
                            i11++;
                        }
                        if (f0Var2 != null) {
                            g0Var.getClass();
                            ((AbstractC2063x) obj).unknownFields = f0Var2;
                        }
                        throw th2;
                    }
                } else {
                    int Q = Q(F10);
                    try {
                        int P = P(Q);
                        I i12 = this.f25184l;
                        switch (P) {
                            case 0:
                                f0Var = f0Var2;
                                m0.f25250c.m(obj, C(Q), mVar.readDouble());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 1:
                                f0Var = f0Var2;
                                m0.f25250c.n(obj, C(Q), mVar.readFloat());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 2:
                                f0Var = f0Var2;
                                m0.r(obj, C(Q), mVar.I());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 3:
                                f0Var = f0Var2;
                                m0.r(obj, C(Q), mVar.c());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 4:
                                f0Var = f0Var2;
                                m0.q(C(Q), obj, mVar.B());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 5:
                                f0Var = f0Var2;
                                m0.r(obj, C(Q), mVar.d());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 6:
                                f0Var = f0Var2;
                                m0.q(C(Q), obj, mVar.h());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 7:
                                f0Var = f0Var2;
                                m0.f25250c.k(obj, C(Q), mVar.i());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 8:
                                f0Var = f0Var2;
                                I(obj, Q, mVar);
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 9:
                                f0Var = f0Var2;
                                AbstractC2042b abstractC2042b = (AbstractC2042b) y(F10, obj);
                                b0 n10 = n(F10);
                                mVar.e0(2);
                                mVar.R(abstractC2042b, n10, c2057q);
                                N(obj, F10, abstractC2042b);
                                f0Var2 = f0Var;
                                break;
                            case 10:
                                f0Var = f0Var2;
                                m0.s(C(Q), obj, mVar.U());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 11:
                                f0Var = f0Var2;
                                m0.q(C(Q), obj, mVar.l());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 12:
                                f0Var = f0Var2;
                                int q10 = mVar.q();
                                l(F10);
                                m0.q(C(Q), obj, q10);
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 13:
                                f0Var = f0Var2;
                                m0.q(C(Q), obj, mVar.D());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 14:
                                f0Var = f0Var2;
                                m0.r(obj, C(Q), mVar.j());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 15:
                                f0Var = f0Var2;
                                m0.q(C(Q), obj, mVar.s());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 16:
                                f0Var = f0Var2;
                                m0.r(obj, C(Q), mVar.t());
                                L(F10, obj);
                                f0Var2 = f0Var;
                                break;
                            case 17:
                                f0Var = f0Var2;
                                AbstractC2042b abstractC2042b2 = (AbstractC2042b) y(F10, obj);
                                mVar.N(abstractC2042b2, n(F10), c2057q);
                                N(obj, F10, abstractC2042b2);
                                f0Var2 = f0Var;
                                break;
                            case 18:
                                f0Var = f0Var2;
                                mVar.F(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 19:
                                f0Var = f0Var2;
                                mVar.A(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 20:
                                f0Var = f0Var2;
                                mVar.m(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 21:
                                f0Var = f0Var2;
                                mVar.k(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 22:
                                f0Var = f0Var2;
                                mVar.o(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 23:
                                f0Var = f0Var2;
                                mVar.K(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 24:
                                f0Var = f0Var2;
                                mVar.r(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 25:
                                f0Var = f0Var2;
                                mVar.u(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 26:
                                f0Var = f0Var2;
                                J(obj, Q, mVar);
                                f0Var2 = f0Var;
                                break;
                            case 27:
                                f0Var = f0Var2;
                                H(obj, Q, mVar, n(F10), c2057q);
                                f0Var2 = f0Var;
                                break;
                            case 28:
                                f0Var = f0Var2;
                                mVar.E(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 29:
                                f0Var = f0Var2;
                                mVar.g(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 30:
                                f0Var = f0Var2;
                                List c10 = i12.c(C(Q), obj);
                                mVar.p(c10);
                                l(F10);
                                c0.z(obj, w10, c10, f0Var, g0Var2);
                                f0Var2 = f0Var;
                                break;
                            case 31:
                                f0Var = f0Var2;
                                mVar.e(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 32:
                                f0Var = f0Var2;
                                mVar.n(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 33:
                                f0Var = f0Var2;
                                mVar.b(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 34:
                                f0Var = f0Var2;
                                mVar.f(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 35:
                                f0Var = f0Var2;
                                mVar.F(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 36:
                                f0Var = f0Var2;
                                mVar.A(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 37:
                                f0Var = f0Var2;
                                mVar.m(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 38:
                                f0Var = f0Var2;
                                mVar.k(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 39:
                                f0Var = f0Var2;
                                mVar.o(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 40:
                                f0Var = f0Var2;
                                mVar.K(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 41:
                                f0Var = f0Var2;
                                mVar.r(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 42:
                                f0Var = f0Var2;
                                mVar.u(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 43:
                                f0Var = f0Var2;
                                mVar.g(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 44:
                                f0Var = f0Var2;
                                List c11 = i12.c(C(Q), obj);
                                mVar.p(c11);
                                l(F10);
                                c0.z(obj, w10, c11, f0Var, g0Var2);
                                f0Var2 = f0Var;
                                break;
                            case 45:
                                f0Var = f0Var2;
                                mVar.e(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 46:
                                f0Var = f0Var2;
                                mVar.n(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 47:
                                f0Var = f0Var2;
                                mVar.b(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case r9.y.f44626f /* 48 */:
                                f0Var = f0Var2;
                                mVar.f(i12.c(C(Q), obj));
                                f0Var2 = f0Var;
                                break;
                            case 49:
                                f0Var = f0Var2;
                                try {
                                    G(obj, C(Q), mVar, n(F10), c2057q);
                                    f0Var2 = f0Var;
                                } catch (B unused) {
                                    f0Var2 = f0Var;
                                    g0Var.getClass();
                                    if (f0Var2 == null) {
                                    }
                                    if (!g0.c(f0Var2, mVar)) {
                                    }
                                    g0Var2 = g0Var;
                                    th3 = null;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    f0Var2 = f0Var;
                                    while (i11 < i10) {
                                    }
                                    if (f0Var2 != null) {
                                    }
                                    throw th2;
                                }
                                break;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                v(obj, F10, m(F10));
                                throw th3;
                                break;
                            case 51:
                                m0.s(C(Q), obj, Double.valueOf(mVar.readDouble()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 52:
                                m0.s(C(Q), obj, Float.valueOf(mVar.readFloat()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 53:
                                m0.s(C(Q), obj, Long.valueOf(mVar.I()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 54:
                                m0.s(C(Q), obj, Long.valueOf(mVar.c()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 55:
                                m0.s(C(Q), obj, Integer.valueOf(mVar.B()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 56:
                                m0.s(C(Q), obj, Long.valueOf(mVar.d()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 57:
                                m0.s(C(Q), obj, Integer.valueOf(mVar.h()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 58:
                                m0.s(C(Q), obj, Boolean.valueOf(mVar.i()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 59:
                                I(obj, Q, mVar);
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 60:
                                AbstractC2042b abstractC2042b3 = (AbstractC2042b) z(w10, obj, F10);
                                b0 n11 = n(F10);
                                mVar.e0(2);
                                mVar.R(abstractC2042b3, n11, c2057q);
                                O(w10, obj, abstractC2042b3, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 61:
                                m0.s(C(Q), obj, mVar.U());
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 62:
                                m0.s(C(Q), obj, Integer.valueOf(mVar.l()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 63:
                                int q11 = mVar.q();
                                l(F10);
                                m0.s(C(Q), obj, Integer.valueOf(q11));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 64:
                                m0.s(C(Q), obj, Integer.valueOf(mVar.D()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 65:
                                m0.s(C(Q), obj, Long.valueOf(mVar.j()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 66:
                                m0.s(C(Q), obj, Integer.valueOf(mVar.s()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 67:
                                m0.s(C(Q), obj, Long.valueOf(mVar.t()));
                                M(w10, obj, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            case 68:
                                AbstractC2042b abstractC2042b4 = (AbstractC2042b) z(w10, obj, F10);
                                mVar.N(abstractC2042b4, n(F10), c2057q);
                                O(w10, obj, abstractC2042b4, F10);
                                f0Var = f0Var2;
                                f0Var2 = f0Var;
                                break;
                            default:
                                if (f0Var2 == null) {
                                    try {
                                        g0Var.getClass();
                                        f0Var2 = g0.a(obj);
                                    } catch (B unused2) {
                                        g0Var.getClass();
                                        if (f0Var2 == null) {
                                            f0Var2 = g0.a(obj);
                                        }
                                        if (!g0.c(f0Var2, mVar)) {
                                            while (i11 < i10) {
                                                k(obj, iArr[i11], f0Var2);
                                                i11++;
                                            }
                                            if (f0Var2 != null) {
                                                ((AbstractC2063x) obj).unknownFields = f0Var2;
                                                return;
                                            }
                                            return;
                                        }
                                        g0Var2 = g0Var;
                                        th3 = null;
                                    }
                                }
                                g0Var.getClass();
                                if (!g0.c(f0Var2, mVar)) {
                                    break;
                                }
                                break;
                        }
                    } catch (B unused3) {
                    }
                    g0Var2 = g0Var;
                    th3 = null;
                }
            } catch (Throwable th6) {
                th2 = th6;
            }
        }
    }

    public final void v(Object obj, int i10, Object obj2) {
        long Q = Q(i10) & 1048575;
        Object i11 = m0.f25250c.i(Q, obj);
        N n10 = this.f25186n;
        if (i11 != null) {
            n10.getClass();
            if (!((M) i11).f25167Y) {
                M c10 = M.f25166Z.c();
                N.b(c10, i11);
                m0.s(Q, obj, c10);
                i11 = c10;
            }
        } else {
            n10.getClass();
            i11 = M.f25166Z.c();
            m0.s(Q, obj, i11);
        }
        n10.getClass();
        M m10 = (M) i11;
        AbstractC2469q0.p(obj2);
        throw null;
    }

    public final void w(Object obj, int i10, Object obj2) {
        if (!q(i10, obj2)) {
            return;
        }
        long Q = Q(i10) & 1048575;
        Unsafe unsafe = f25172p;
        Object object = unsafe.getObject(obj2, Q);
        if (object != null) {
            b0 n10 = n(i10);
            if (!q(i10, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, Q, object);
                } else {
                    AbstractC2063x g10 = n10.g();
                    n10.c(g10, object);
                    unsafe.putObject(obj, Q, g10);
                }
                L(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, Q);
            if (!r(object2)) {
                AbstractC2063x g11 = n10.g();
                n10.c(g11, object2);
                unsafe.putObject(obj, Q, g11);
                object2 = g11;
            }
            n10.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f25173a[i10] + " is present but null: " + obj2);
    }

    public final void x(Object obj, int i10, Object obj2) {
        int[] iArr;
        int i11 = this.f25173a[i10];
        if (!s(i11, obj2, i10)) {
            return;
        }
        long Q = Q(i10) & 1048575;
        Unsafe unsafe = f25172p;
        Object object = unsafe.getObject(obj2, Q);
        if (object != null) {
            b0 n10 = n(i10);
            if (!s(i11, obj, i10)) {
                if (!r(object)) {
                    unsafe.putObject(obj, Q, object);
                } else {
                    AbstractC2063x g10 = n10.g();
                    n10.c(g10, object);
                    unsafe.putObject(obj, Q, g10);
                }
                M(i11, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, Q);
            if (!r(object2)) {
                AbstractC2063x g11 = n10.g();
                n10.c(g11, object2);
                unsafe.putObject(obj, Q, g11);
                object2 = g11;
            }
            n10.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
    }

    public final Object y(int i10, Object obj) {
        b0 n10 = n(i10);
        long Q = Q(i10) & 1048575;
        if (!q(i10, obj)) {
            return n10.g();
        }
        Object object = f25172p.getObject(obj, Q);
        if (r(object)) {
            return object;
        }
        AbstractC2063x g10 = n10.g();
        if (object != null) {
            n10.c(g10, object);
        }
        return g10;
    }

    public final Object z(int i10, Object obj, int i11) {
        b0 n10 = n(i11);
        if (!s(i10, obj, i11)) {
            return n10.g();
        }
        Object object = f25172p.getObject(obj, Q(i11) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC2063x g10 = n10.g();
        if (object != null) {
            n10.c(g10, object);
        }
        return g10;
    }
}
