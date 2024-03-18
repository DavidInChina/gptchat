package com.google.android.gms.internal.play_billing;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2470r0 implements AbstractC2486z0 {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f26957k = new int[0];

    /* renamed from: l  reason: collision with root package name */
    public static final Unsafe f26958l = J0.j();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f26959a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f26960b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26961c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26962d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC2481x f26963e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f26964f;

    /* renamed from: g  reason: collision with root package name */
    public final int f26965g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26966h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC2449g0 f26967i;

    /* renamed from: j  reason: collision with root package name */
    public final D0 f26968j;

    public C2470r0(int[] iArr, Object[] objArr, int i10, int i11, AbstractC2481x abstractC2481x, int[] iArr2, int i12, int i13, AbstractC2449g0 abstractC2449g0, D0 d02, K k10) {
        this.f26959a = iArr;
        this.f26960b = objArr;
        this.f26961c = i10;
        this.f26962d = i11;
        this.f26964f = iArr2;
        this.f26965g = i12;
        this.f26966h = i13;
        this.f26967i = abstractC2449g0;
        this.f26968j = d02;
        this.f26963e = abstractC2481x;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder t10 = android.gov.nist.core.a.t("Field ", str, " for ", name, " not found. Known fields are ");
            t10.append(arrays);
            throw new RuntimeException(t10.toString());
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Q) {
            return ((Q) obj).l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2470r0 u(AbstractC2463n0 abstractC2463n0, AbstractC2449g0 abstractC2449g0, D0 d02, K k10) {
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C2484y0 c2484y0;
        int i21;
        String str;
        int i22;
        int i23;
        int i24;
        Class<?> cls;
        int i25;
        int i26;
        int i27;
        Field E10;
        int i28;
        char charAt;
        int i29;
        int i30;
        Object obj;
        Field E11;
        Object obj2;
        Field field;
        int i31;
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
        if (abstractC2463n0 instanceof C2484y0) {
            C2484y0 c2484y02 = (C2484y0) abstractC2463n0;
            String c10 = c2484y02.c();
            int length = c10.length();
            char c11 = '\ud800';
            if (c10.charAt(0) >= '\ud800') {
                int i44 = 1;
                while (true) {
                    i10 = i44 + 1;
                    if (c10.charAt(i44) < '\ud800') {
                        break;
                    }
                    i44 = i10;
                }
            } else {
                i10 = 1;
            }
            int i45 = i10 + 1;
            int charAt14 = c10.charAt(i10);
            if (charAt14 >= 55296) {
                int i46 = charAt14 & 8191;
                int i47 = 13;
                while (true) {
                    i43 = i45 + 1;
                    charAt13 = c10.charAt(i45);
                    if (charAt13 < '\ud800') {
                        break;
                    }
                    i46 |= (charAt13 & '\u1fff') << i47;
                    i47 += 13;
                    i45 = i43;
                }
                charAt14 = i46 | (charAt13 << i47);
                i45 = i43;
            }
            if (charAt14 == 0) {
                i16 = 0;
                i15 = 0;
                i14 = 0;
                i13 = 0;
                i12 = 0;
                i11 = 0;
                iArr = f26957k;
                i17 = 0;
            } else {
                int i48 = i45 + 1;
                int charAt15 = c10.charAt(i45);
                if (charAt15 >= 55296) {
                    int i49 = charAt15 & 8191;
                    int i50 = 13;
                    while (true) {
                        i42 = i48 + 1;
                        charAt12 = c10.charAt(i48);
                        if (charAt12 < '\ud800') {
                            break;
                        }
                        i49 |= (charAt12 & '\u1fff') << i50;
                        i50 += 13;
                        i48 = i42;
                    }
                    charAt15 = i49 | (charAt12 << i50);
                    i48 = i42;
                }
                int i51 = i48 + 1;
                int charAt16 = c10.charAt(i48);
                if (charAt16 >= 55296) {
                    int i52 = charAt16 & 8191;
                    int i53 = 13;
                    while (true) {
                        i41 = i51 + 1;
                        charAt11 = c10.charAt(i51);
                        if (charAt11 < '\ud800') {
                            break;
                        }
                        i52 |= (charAt11 & '\u1fff') << i53;
                        i53 += 13;
                        i51 = i41;
                    }
                    charAt16 = i52 | (charAt11 << i53);
                    i51 = i41;
                }
                int i54 = i51 + 1;
                int charAt17 = c10.charAt(i51);
                if (charAt17 >= 55296) {
                    int i55 = charAt17 & 8191;
                    int i56 = 13;
                    while (true) {
                        i40 = i54 + 1;
                        charAt10 = c10.charAt(i54);
                        if (charAt10 < '\ud800') {
                            break;
                        }
                        i55 |= (charAt10 & '\u1fff') << i56;
                        i56 += 13;
                        i54 = i40;
                    }
                    charAt17 = i55 | (charAt10 << i56);
                    i54 = i40;
                }
                int i57 = i54 + 1;
                int charAt18 = c10.charAt(i54);
                if (charAt18 >= 55296) {
                    int i58 = charAt18 & 8191;
                    int i59 = 13;
                    while (true) {
                        i39 = i57 + 1;
                        charAt9 = c10.charAt(i57);
                        if (charAt9 < '\ud800') {
                            break;
                        }
                        i58 |= (charAt9 & '\u1fff') << i59;
                        i59 += 13;
                        i57 = i39;
                    }
                    charAt18 = i58 | (charAt9 << i59);
                    i57 = i39;
                }
                int i60 = i57 + 1;
                i15 = c10.charAt(i57);
                if (i15 >= 55296) {
                    int i61 = i15 & 8191;
                    int i62 = 13;
                    while (true) {
                        i38 = i60 + 1;
                        charAt8 = c10.charAt(i60);
                        if (charAt8 < '\ud800') {
                            break;
                        }
                        i61 |= (charAt8 & '\u1fff') << i62;
                        i62 += 13;
                        i60 = i38;
                    }
                    i15 = i61 | (charAt8 << i62);
                    i60 = i38;
                }
                int i63 = i60 + 1;
                i14 = c10.charAt(i60);
                if (i14 >= 55296) {
                    int i64 = i14 & 8191;
                    int i65 = 13;
                    while (true) {
                        i37 = i63 + 1;
                        charAt7 = c10.charAt(i63);
                        if (charAt7 < '\ud800') {
                            break;
                        }
                        i64 |= (charAt7 & '\u1fff') << i65;
                        i65 += 13;
                        i63 = i37;
                    }
                    i14 = i64 | (charAt7 << i65);
                    i63 = i37;
                }
                int i66 = i63 + 1;
                int charAt19 = c10.charAt(i63);
                if (charAt19 >= 55296) {
                    int i67 = charAt19 & 8191;
                    int i68 = 13;
                    while (true) {
                        i36 = i66 + 1;
                        charAt6 = c10.charAt(i66);
                        if (charAt6 < '\ud800') {
                            break;
                        }
                        i67 |= (charAt6 & '\u1fff') << i68;
                        i68 += 13;
                        i66 = i36;
                    }
                    charAt19 = i67 | (charAt6 << i68);
                    i66 = i36;
                }
                int i69 = i66 + 1;
                int charAt20 = c10.charAt(i66);
                if (charAt20 >= 55296) {
                    int i70 = charAt20 & 8191;
                    int i71 = 13;
                    while (true) {
                        i35 = i69 + 1;
                        charAt5 = c10.charAt(i69);
                        if (charAt5 < '\ud800') {
                            break;
                        }
                        i70 |= (charAt5 & '\u1fff') << i71;
                        i71 += 13;
                        i69 = i35;
                    }
                    charAt20 = i70 | (charAt5 << i71);
                    i69 = i35;
                }
                int i72 = charAt15 + charAt15 + charAt16;
                int[] iArr2 = new int[charAt20 + i14 + charAt19];
                i13 = charAt17;
                i16 = i72;
                i11 = charAt20;
                i12 = charAt18;
                i17 = charAt15;
                i45 = i69;
                iArr = iArr2;
            }
            Object[] d10 = c2484y02.d();
            Class<?> cls2 = c2484y02.a().getClass();
            int i73 = i11 + i14;
            int i74 = i15 + i15;
            int[] iArr3 = new int[i15 * 3];
            Object[] objArr = new Object[i74];
            int i75 = i11;
            int i76 = i73;
            int i77 = 0;
            int i78 = 0;
            while (i45 < length) {
                int i79 = i45 + 1;
                int charAt21 = c10.charAt(i45);
                if (charAt21 >= c11) {
                    int i80 = charAt21 & 8191;
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
                    charAt21 = i80 | (charAt4 << i82);
                    i18 = i34;
                } else {
                    i18 = i79;
                }
                int i83 = i18 + 1;
                int charAt22 = c10.charAt(i18);
                if (charAt22 >= c11) {
                    int i84 = charAt22 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i33 = i85 + 1;
                        charAt3 = c10.charAt(i85);
                        if (charAt3 < c11) {
                            break;
                        }
                        i84 |= (charAt3 & '\u1fff') << i86;
                        i86 += 13;
                        i85 = i33;
                    }
                    charAt22 = i84 | (charAt3 << i86);
                    i19 = i33;
                } else {
                    i19 = i83;
                }
                if ((charAt22 & 1024) != 0) {
                    iArr[i78] = i77;
                    i78++;
                }
                int i87 = charAt22 & 255;
                int i88 = length;
                int i89 = charAt22 & 2048;
                int i90 = i12;
                Unsafe unsafe = f26958l;
                int i91 = i13;
                if (i87 >= 51) {
                    int i92 = i19 + 1;
                    int charAt23 = c10.charAt(i19);
                    if (charAt23 >= 55296) {
                        int i93 = charAt23 & 8191;
                        int i94 = i92;
                        int i95 = 13;
                        while (true) {
                            i32 = i94 + 1;
                            charAt2 = c10.charAt(i94);
                            i20 = charAt21;
                            if (charAt2 < '\ud800') {
                                break;
                            }
                            i93 |= (charAt2 & '\u1fff') << i95;
                            i95 += 13;
                            i94 = i32;
                            charAt21 = i20;
                        }
                        charAt23 = i93 | (charAt2 << i95);
                        i30 = i32;
                    } else {
                        i20 = charAt21;
                        i30 = i92;
                    }
                    int i96 = i87 - 51;
                    int i97 = i30;
                    if (i96 != 9 && i96 != 17) {
                        if (i96 == 12) {
                            if (c2484y02.b() != 1 && i89 == 0) {
                                i89 = 0;
                            } else {
                                i31 = i16 + 1;
                                int i98 = i77 / 3;
                                objArr[i98 + i98 + 1] = d10[i16];
                            }
                        }
                        int i99 = charAt23 + charAt23;
                        obj = d10[i99];
                        if (!(obj instanceof Field)) {
                            E11 = (Field) obj;
                        } else {
                            E11 = E(cls2, (String) obj);
                            d10[i99] = E11;
                        }
                        str = c10;
                        int i100 = i89;
                        i24 = (int) unsafe.objectFieldOffset(E11);
                        int i101 = i99 + 1;
                        obj2 = d10[i101];
                        if (!(obj2 instanceof Field)) {
                            field = (Field) obj2;
                        } else {
                            field = E(cls2, (String) obj2);
                            d10[i101] = field;
                        }
                        i22 = (int) unsafe.objectFieldOffset(field);
                        i19 = i97;
                        i21 = i100;
                        c2484y0 = c2484y02;
                        cls = cls2;
                        i23 = 0;
                    } else {
                        i31 = i16 + 1;
                        int i102 = i77 / 3;
                        objArr[i102 + i102 + 1] = d10[i16];
                    }
                    i16 = i31;
                    int i992 = charAt23 + charAt23;
                    obj = d10[i992];
                    if (!(obj instanceof Field)) {
                    }
                    str = c10;
                    int i1002 = i89;
                    i24 = (int) unsafe.objectFieldOffset(E11);
                    int i1012 = i992 + 1;
                    obj2 = d10[i1012];
                    if (!(obj2 instanceof Field)) {
                    }
                    i22 = (int) unsafe.objectFieldOffset(field);
                    i19 = i97;
                    i21 = i1002;
                    c2484y0 = c2484y02;
                    cls = cls2;
                    i23 = 0;
                } else {
                    String str2 = c10;
                    i20 = charAt21;
                    int i103 = i16 + 1;
                    Field E12 = E(cls2, (String) d10[i16]);
                    if (i87 == 9 || i87 == 17) {
                        c2484y0 = c2484y02;
                        int i104 = i77 / 3;
                        objArr[i104 + i104 + 1] = E12.getType();
                    } else {
                        if (i87 != 27) {
                            if (i87 == 49) {
                                i16 += 2;
                                c2484y0 = c2484y02;
                                i29 = 1;
                            } else {
                                if (i87 != 12 && i87 != 30 && i87 != 44) {
                                    if (i87 == 50) {
                                        int i105 = i16 + 2;
                                        int i106 = i75 + 1;
                                        iArr[i75] = i77;
                                        int i107 = i77 / 3;
                                        int i108 = i107 + i107;
                                        objArr[i108] = d10[i103];
                                        if (i89 != 0) {
                                            objArr[i108 + 1] = d10[i105];
                                            i16 += 3;
                                            i75 = i106;
                                        } else {
                                            i16 = i105;
                                            i75 = i106;
                                            i89 = 0;
                                        }
                                        c2484y0 = c2484y02;
                                    } else {
                                        c2484y0 = c2484y02;
                                    }
                                } else {
                                    c2484y0 = c2484y02;
                                    if (c2484y02.b() != 1 && i89 == 0) {
                                        i16 = i103;
                                        i89 = 0;
                                    } else {
                                        i16 += 2;
                                        int i109 = i77 / 3;
                                        objArr[i109 + i109 + 1] = d10[i103];
                                    }
                                }
                                i24 = (int) unsafe.objectFieldOffset(E12);
                                i22 = 1048575;
                                if ((charAt22 & 4096) == 0 && i87 <= 17) {
                                    int i110 = i19 + 1;
                                    str = str2;
                                    int charAt24 = str.charAt(i19);
                                    if (charAt24 >= 55296) {
                                        int i111 = charAt24 & 8191;
                                        int i112 = 13;
                                        while (true) {
                                            i28 = i110 + 1;
                                            charAt = str.charAt(i110);
                                            if (charAt < '\ud800') {
                                                break;
                                            }
                                            i111 |= (charAt & '\u1fff') << i112;
                                            i112 += 13;
                                            i110 = i28;
                                        }
                                        charAt24 = i111 | (charAt << i112);
                                        i110 = i28;
                                    }
                                    int i113 = (charAt24 / 32) + i17 + i17;
                                    Object obj3 = d10[i113];
                                    int i114 = i110;
                                    if (obj3 instanceof Field) {
                                        E10 = (Field) obj3;
                                    } else {
                                        E10 = E(cls2, (String) obj3);
                                        d10[i113] = E10;
                                    }
                                    i21 = i89;
                                    cls = cls2;
                                    i23 = charAt24 % 32;
                                    i19 = i114;
                                    i22 = (int) unsafe.objectFieldOffset(E10);
                                } else {
                                    cls = cls2;
                                    str = str2;
                                    i21 = i89;
                                    i23 = 0;
                                }
                                if (i87 >= 18 && i87 <= 49) {
                                    iArr[i76] = i24;
                                    i76++;
                                }
                            }
                        } else {
                            c2484y0 = c2484y02;
                            i29 = 1;
                            i16 += 2;
                        }
                        int i115 = i77 / 3;
                        objArr[i115 + i115 + i29] = d10[i103];
                        i24 = (int) unsafe.objectFieldOffset(E12);
                        i22 = 1048575;
                        if ((charAt22 & 4096) == 0) {
                        }
                        cls = cls2;
                        str = str2;
                        i21 = i89;
                        i23 = 0;
                        if (i87 >= 18) {
                            iArr[i76] = i24;
                            i76++;
                        }
                    }
                    i16 = i103;
                    i24 = (int) unsafe.objectFieldOffset(E12);
                    i22 = 1048575;
                    if ((charAt22 & 4096) == 0) {
                    }
                    cls = cls2;
                    str = str2;
                    i21 = i89;
                    i23 = 0;
                    if (i87 >= 18) {
                    }
                }
                int i116 = i77 + 1;
                iArr3[i77] = i20;
                int i117 = i77 + 2;
                if ((charAt22 & 512) != 0) {
                    i25 = 536870912;
                } else {
                    i25 = 0;
                }
                if ((charAt22 & 256) != 0) {
                    i26 = 268435456;
                } else {
                    i26 = 0;
                }
                if (i21 != 0) {
                    i27 = Integer.MIN_VALUE;
                } else {
                    i27 = 0;
                }
                iArr3[i116] = i24 | i25 | i26 | i27 | (i87 << 20);
                i77 += 3;
                iArr3[i117] = (i23 << 20) | i22;
                cls2 = cls;
                i45 = i19;
                c10 = str;
                length = i88;
                i12 = i90;
                c2484y02 = c2484y0;
                i13 = i91;
                c11 = '\ud800';
            }
            return new C2470r0(iArr3, objArr, i13, i12, c2484y02.a(), iArr, i11, i73, abstractC2449g0, d02, k10);
        }
        AbstractC2469q0.p(abstractC2463n0);
        throw null;
    }

    public static int v(long j6, Object obj) {
        return ((Integer) J0.i(j6, obj)).intValue();
    }

    public static int x(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long z(long j6, Object obj) {
        return ((Long) J0.i(j6, obj)).longValue();
    }

    public final U A(int i10) {
        int i11 = i10 / 3;
        return (U) this.f26960b[i11 + i11 + 1];
    }

    public final AbstractC2486z0 B(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f26960b;
        AbstractC2486z0 abstractC2486z0 = (AbstractC2486z0) objArr[i12];
        if (abstractC2486z0 != null) {
            return abstractC2486z0;
        }
        AbstractC2486z0 a5 = C2480w0.f26985c.a((Class) objArr[i12 + 1]);
        objArr[i12] = a5;
        return a5;
    }

    public final Object C(int i10, Object obj) {
        AbstractC2486z0 B10 = B(i10);
        int y10 = y(i10) & 1048575;
        if (!o(i10, obj)) {
            return B10.q();
        }
        Object object = f26958l.getObject(obj, y10);
        if (r(object)) {
            return object;
        }
        Q q10 = B10.q();
        if (object != null) {
            B10.e(q10, object);
        }
        return q10;
    }

    public final Object D(int i10, Object obj, int i11) {
        AbstractC2486z0 B10 = B(i11);
        if (!s(i10, obj, i11)) {
            return B10.q();
        }
        Object object = f26958l.getObject(obj, y(i11) & 1048575);
        if (r(object)) {
            return object;
        }
        Q q10 = B10.q();
        if (object != null) {
            B10.e(q10, object);
        }
        return q10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void a(Object obj) {
        if (r(obj)) {
            int i10 = 0;
            if (obj instanceof Q) {
                Q q10 = (Q) obj;
                q10.j();
                q10.zza = 0;
                q10.h();
            }
            while (true) {
                int[] iArr = this.f26959a;
                if (i10 < iArr.length) {
                    int y10 = y(i10);
                    int i11 = 1048575 & y10;
                    int x10 = x(y10);
                    long j6 = i11;
                    Unsafe unsafe = f26958l;
                    if (x10 != 9) {
                        if (x10 != 60 && x10 != 68) {
                            switch (x10) {
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
                                    this.f26967i.a(j6, obj);
                                    break;
                                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                    Object object = unsafe.getObject(obj, j6);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((C2457k0) object).c();
                                        unsafe.putObject(obj, j6, object);
                                        break;
                                    }
                            }
                        } else if (s(iArr[i10], obj, i10)) {
                            B(i10).a(unsafe.getObject(obj, j6));
                        }
                        i10 += 3;
                    }
                    if (o(i10, obj)) {
                        B(i10).a(unsafe.getObject(obj, j6));
                    }
                    i10 += 3;
                } else {
                    this.f26968j.getClass();
                    D0.c(obj);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final boolean b(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f26965g) {
            int i15 = this.f26964f[i13];
            int[] iArr = this.f26959a;
            int i16 = iArr[i15];
            int y10 = y(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f26958l.getInt(obj, i18);
                }
                i10 = i12;
                i11 = i18;
            } else {
                i11 = i14;
                i10 = i12;
            }
            if ((268435456 & y10) != 0 && !p(i15, i11, i10, i19, obj)) {
                return false;
            }
            int x10 = x(y10);
            if (x10 != 9 && x10 != 17) {
                if (x10 != 27) {
                    if (x10 != 60 && x10 != 68) {
                        if (x10 != 49) {
                            if (x10 == 50 && !((C2457k0) J0.i(y10 & 1048575, obj)).isEmpty()) {
                                int i20 = i15 / 3;
                                AbstractC2469q0.p(this.f26960b[i20 + i20]);
                                throw null;
                            }
                        }
                    } else if (s(i16, obj, i15) && !B(i15).b(J0.i(y10 & 1048575, obj))) {
                        return false;
                    }
                }
                List list = (List) J0.i(y10 & 1048575, obj);
                if (!list.isEmpty()) {
                    AbstractC2486z0 B10 = B(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!B10.b(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (p(i15, i11, i10, i19, obj) && !B(i15).b(J0.i(y10 & 1048575, obj))) {
                return false;
            }
            i13++;
            i14 = i11;
            i12 = i10;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r2 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        r1 = r6 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ea, code lost:
        if (r2 != false) goto L43;
     */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f26959a;
            if (i14 < iArr.length) {
                int y10 = y(i14);
                int i16 = 1048575 & y10;
                int x10 = x(y10);
                int i17 = iArr[i14];
                long j6 = i16;
                int i18 = 1237;
                int i19 = 37;
                switch (x10) {
                    case 0:
                        i10 = i15 * 53;
                        doubleToLongBits = Double.doubleToLongBits(J0.f26855c.a(j6, obj));
                        Charset charset = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i11 = i15 * 53;
                        floatToIntBits = Float.floatToIntBits(J0.f26855c.b(j6, obj));
                        i15 = floatToIntBits + i11;
                        break;
                    case 2:
                        i10 = i15 * 53;
                        doubleToLongBits = J0.g(j6, obj);
                        Charset charset2 = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i10 = i15 * 53;
                        doubleToLongBits = J0.g(j6, obj);
                        Charset charset3 = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 5:
                        i10 = i15 * 53;
                        doubleToLongBits = J0.g(j6, obj);
                        Charset charset4 = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 7:
                        i12 = i15 * 53;
                        boolean g10 = J0.f26855c.g(j6, obj);
                        Charset charset5 = Y.f26890a;
                        break;
                    case 8:
                        i11 = i15 * 53;
                        floatToIntBits = ((String) J0.i(j6, obj)).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    case 9:
                        i13 = i15 * 53;
                        Object i20 = J0.i(j6, obj);
                        if (i20 != null) {
                            i19 = i20.hashCode();
                        }
                        i15 = i13 + i19;
                        break;
                    case 10:
                        i11 = i15 * 53;
                        floatToIntBits = J0.i(j6, obj).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    case 11:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 12:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 13:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 14:
                        i10 = i15 * 53;
                        doubleToLongBits = J0.g(j6, obj);
                        Charset charset6 = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i11 = i15 * 53;
                        floatToIntBits = J0.f(j6, obj);
                        i15 = floatToIntBits + i11;
                        break;
                    case 16:
                        i10 = i15 * 53;
                        doubleToLongBits = J0.g(j6, obj);
                        Charset charset7 = Y.f26890a;
                        i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i13 = i15 * 53;
                        Object i21 = J0.i(j6, obj);
                        if (i21 != null) {
                            i19 = i21.hashCode();
                        }
                        i15 = i13 + i19;
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
                        i11 = i15 * 53;
                        floatToIntBits = J0.i(j6, obj).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        i11 = i15 * 53;
                        floatToIntBits = J0.i(j6, obj).hashCode();
                        i15 = floatToIntBits + i11;
                        break;
                    case 51:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = Double.doubleToLongBits(((Double) J0.i(j6, obj)).doubleValue());
                            Charset charset8 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 52:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = Float.floatToIntBits(((Float) J0.i(j6, obj)).floatValue());
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 53:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = z(j6, obj);
                            Charset charset9 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 54:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = z(j6, obj);
                            Charset charset10 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 55:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 56:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = z(j6, obj);
                            Charset charset11 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 57:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 58:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i12 = i15 * 53;
                            boolean booleanValue = ((Boolean) J0.i(j6, obj)).booleanValue();
                            Charset charset12 = Y.f26890a;
                            break;
                        }
                    case 59:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = ((String) J0.i(j6, obj)).hashCode();
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 60:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = J0.i(j6, obj).hashCode();
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 61:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = J0.i(j6, obj).hashCode();
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 62:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 63:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 64:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 65:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = z(j6, obj);
                            Charset charset13 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 66:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = v(j6, obj);
                            i15 = floatToIntBits + i11;
                            break;
                        }
                    case 67:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i10 = i15 * 53;
                            doubleToLongBits = z(j6, obj);
                            Charset charset14 = Y.f26890a;
                            i15 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 68:
                        if (!s(i17, obj, i14)) {
                            break;
                        } else {
                            i11 = i15 * 53;
                            floatToIntBits = J0.i(j6, obj).hashCode();
                            i15 = floatToIntBits + i11;
                            break;
                        }
                }
                i14 += 3;
            } else {
                this.f26968j.getClass();
                return ((Q) obj).zzc.hashCode() + (i15 * 53);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final int d(Object obj) {
        int i10;
        int i11;
        int i12;
        int D12;
        int E12;
        int D13;
        int I10;
        int D14;
        int n10;
        int D15;
        int size;
        int r10;
        int D16;
        int D17;
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = this.f26959a;
            if (i18 < iArr.length) {
                int y10 = y(i18);
                int x10 = x(y10);
                int i20 = iArr[i18];
                int i21 = iArr[i18 + 2];
                int i22 = i21 & i15;
                Unsafe unsafe = f26958l;
                if (x10 <= 17) {
                    if (i22 != i16) {
                        if (i22 == i15) {
                            i17 = 0;
                        } else {
                            i17 = unsafe.getInt(obj, i22);
                        }
                        i16 = i22;
                    }
                    i11 = i16;
                    i10 = i17;
                    i12 = 1 << (i21 >>> 20);
                } else {
                    i11 = i16;
                    i10 = i17;
                    i12 = 0;
                }
                int i23 = y10 & i15;
                if (x10 >= M.DOUBLE_LIST_PACKED.a()) {
                    M.SINT64_LIST_PACKED.getClass();
                }
                long j6 = i23;
                switch (x10) {
                    case 0:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (p(i18, i11, i10, i12, obj)) {
                            long j10 = unsafe.getLong(obj, j6);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(j10);
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (p(i18, i11, i10, i12, obj)) {
                            long j11 = unsafe.getLong(obj, j6);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(j11);
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (p(i18, i11, i10, i12, obj)) {
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(unsafe.getInt(obj, j6));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 1, i19);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (p(i18, i11, i10, i12, obj)) {
                            int i24 = i20 << 3;
                            Object object = unsafe.getObject(obj, j6);
                            if (object instanceof E) {
                                D13 = H.D1(i24);
                                I10 = ((E) object).I();
                                D14 = H.D1(I10);
                                i19 += D14 + I10 + D13;
                                break;
                            } else {
                                D12 = H.D1(i24);
                                E12 = H.C1((String) object);
                                i19 += E12 + D12;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (p(i18, i11, i10, i12, obj)) {
                            n10 = A0.n(i20, B(i18), unsafe.getObject(obj, j6));
                            i19 += n10;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (p(i18, i11, i10, i12, obj)) {
                            D13 = H.D1(i20 << 3);
                            I10 = ((E) unsafe.getObject(obj, j6)).I();
                            D14 = H.D1(I10);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(unsafe.getInt(obj, j6), H.D1(i20 << 3), i19);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (p(i18, i11, i10, i12, obj)) {
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(unsafe.getInt(obj, j6));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (p(i18, i11, i10, i12, obj)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (p(i18, i11, i10, i12, obj)) {
                            int i25 = unsafe.getInt(obj, j6);
                            i19 = android.gov.nist.core.a.c((i25 >> 31) ^ (i25 + i25), H.D1(i20 << 3), i19);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (p(i18, i11, i10, i12, obj)) {
                            long j12 = unsafe.getLong(obj, j6);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1((j12 >> 63) ^ (j12 + j12));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (p(i18, i11, i10, i12, obj)) {
                            n10 = H.A1(i20, (AbstractC2481x) unsafe.getObject(obj, j6), B(i18));
                            i19 += n10;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        n10 = A0.j(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 19:
                        n10 = A0.h(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(obj, j6);
                        Class cls = A0.f26825a;
                        if (list.size() != 0) {
                            D15 = (H.D1(i20 << 3) * list.size()) + A0.m(list);
                            i19 += D15;
                            break;
                        }
                        D15 = 0;
                        i19 += D15;
                    case 21:
                        List list2 = (List) unsafe.getObject(obj, j6);
                        Class cls2 = A0.f26825a;
                        size = list2.size();
                        if (size != 0) {
                            r10 = A0.r(list2);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 22:
                        List list3 = (List) unsafe.getObject(obj, j6);
                        Class cls3 = A0.f26825a;
                        size = list3.size();
                        if (size != 0) {
                            r10 = A0.l(list3);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 23:
                        n10 = A0.j(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 24:
                        n10 = A0.h(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 25:
                        Class cls4 = A0.f26825a;
                        int size2 = ((List) unsafe.getObject(obj, j6)).size();
                        if (size2 != 0) {
                            D15 = (H.D1(i20 << 3) + 1) * size2;
                            i19 += D15;
                            break;
                        }
                        D15 = 0;
                        i19 += D15;
                    case 26:
                        List list4 = (List) unsafe.getObject(obj, j6);
                        Class cls5 = A0.f26825a;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            D17 = H.D1(i20 << 3) * size3;
                            if (list4 instanceof AbstractC2443d0) {
                                AbstractC2443d0 abstractC2443d0 = (AbstractC2443d0) list4;
                                for (int i26 = 0; i26 < size3; i26++) {
                                    Object O10 = abstractC2443d0.O(i26);
                                    if (O10 instanceof E) {
                                        int I11 = ((E) O10).I();
                                        D17 = android.gov.nist.core.a.c(I11, I11, D17);
                                    } else {
                                        D17 = H.C1((String) O10) + D17;
                                    }
                                }
                            } else {
                                for (int i27 = 0; i27 < size3; i27++) {
                                    Object obj2 = list4.get(i27);
                                    if (obj2 instanceof E) {
                                        int I12 = ((E) obj2).I();
                                        D17 = android.gov.nist.core.a.c(I12, I12, D17);
                                    } else {
                                        D17 = H.C1((String) obj2) + D17;
                                    }
                                }
                            }
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 27:
                        List list5 = (List) unsafe.getObject(obj, j6);
                        AbstractC2486z0 B10 = B(i18);
                        Class cls6 = A0.f26825a;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            i13 = 0;
                        } else {
                            i13 = H.D1(i20 << 3) * size4;
                            for (int i28 = 0; i28 < size4; i28++) {
                                i13 += H.B1((AbstractC2481x) list5.get(i28), B10);
                            }
                        }
                        i19 += i13;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(obj, j6);
                        Class cls7 = A0.f26825a;
                        int size5 = list6.size();
                        if (size5 != 0) {
                            D17 = H.D1(i20 << 3) * size5;
                            for (int i29 = 0; i29 < list6.size(); i29++) {
                                int I13 = ((E) list6.get(i29)).I();
                                D17 = android.gov.nist.core.a.c(I13, I13, D17);
                            }
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 29:
                        List list7 = (List) unsafe.getObject(obj, j6);
                        Class cls8 = A0.f26825a;
                        size = list7.size();
                        if (size != 0) {
                            r10 = A0.q(list7);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 30:
                        List list8 = (List) unsafe.getObject(obj, j6);
                        Class cls9 = A0.f26825a;
                        size = list8.size();
                        if (size != 0) {
                            r10 = A0.g(list8);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 31:
                        n10 = A0.h(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 32:
                        n10 = A0.j(i20, (List) unsafe.getObject(obj, j6));
                        i19 += n10;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(obj, j6);
                        Class cls10 = A0.f26825a;
                        size = list9.size();
                        if (size != 0) {
                            r10 = A0.o(list9);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 34:
                        List list10 = (List) unsafe.getObject(obj, j6);
                        Class cls11 = A0.f26825a;
                        size = list10.size();
                        if (size != 0) {
                            r10 = A0.p(list10);
                            D16 = H.D1(i20 << 3);
                            D17 = (D16 * size) + r10;
                            i19 += D17;
                            break;
                        }
                        D17 = 0;
                        i19 += D17;
                    case 35:
                        D13 = A0.k((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        D13 = A0.i((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        D13 = A0.m((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        D13 = A0.r((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        D13 = A0.l((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        D13 = A0.k((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        D13 = A0.i((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls12 = A0.f26825a;
                        D13 = ((List) unsafe.getObject(obj, j6)).size();
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        D13 = A0.q((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        D13 = A0.g((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        D13 = A0.i((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        D13 = A0.k((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        D13 = A0.o((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case r9.y.f44626f /* 48 */:
                        D13 = A0.p((List) unsafe.getObject(obj, j6));
                        if (D13 > 0) {
                            I10 = H.D1(i20 << 3);
                            D14 = H.D1(D13);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(obj, j6);
                        AbstractC2486z0 B11 = B(i18);
                        Class cls13 = A0.f26825a;
                        int size6 = list11.size();
                        if (size6 == 0) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            for (int i30 = 0; i30 < size6; i30++) {
                                i14 += H.A1(i20, (AbstractC2481x) list11.get(i30), B11);
                            }
                        }
                        i19 += i14;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        int i31 = i18 / 3;
                        C2457k0 c2457k0 = (C2457k0) unsafe.getObject(obj, j6);
                        AbstractC2469q0.p(this.f26960b[i31 + i31]);
                        if (!c2457k0.isEmpty()) {
                            Iterator it = c2457k0.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                            break;
                        } else {
                            continue;
                        }
                    case 51:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (s(i20, obj, i18)) {
                            long z10 = z(j6, obj);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(z10);
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (s(i20, obj, i18)) {
                            long z11 = z(j6, obj);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(z11);
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (s(i20, obj, i18)) {
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(v(j6, obj));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 1, i19);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (s(i20, obj, i18)) {
                            int i32 = i20 << 3;
                            Object object2 = unsafe.getObject(obj, j6);
                            if (object2 instanceof E) {
                                D13 = H.D1(i32);
                                I10 = ((E) object2).I();
                                D14 = H.D1(I10);
                                i19 += D14 + I10 + D13;
                                break;
                            } else {
                                D12 = H.D1(i32);
                                E12 = H.C1((String) object2);
                                i19 += E12 + D12;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (s(i20, obj, i18)) {
                            n10 = A0.n(i20, B(i18), unsafe.getObject(obj, j6));
                            i19 += n10;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (s(i20, obj, i18)) {
                            D13 = H.D1(i20 << 3);
                            I10 = ((E) unsafe.getObject(obj, j6)).I();
                            D14 = H.D1(I10);
                            i19 += D14 + I10 + D13;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(v(j6, obj), H.D1(i20 << 3), i19);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (s(i20, obj, i18)) {
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1(v(j6, obj));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 4, i19);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (s(i20, obj, i18)) {
                            i19 = android.gov.nist.core.a.c(i20 << 3, 8, i19);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (s(i20, obj, i18)) {
                            int v10 = v(j6, obj);
                            i19 = android.gov.nist.core.a.c((v10 >> 31) ^ (v10 + v10), H.D1(i20 << 3), i19);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (s(i20, obj, i18)) {
                            long z12 = z(j6, obj);
                            D12 = H.D1(i20 << 3);
                            E12 = H.E1((z12 >> 63) ^ (z12 + z12));
                            i19 += E12 + D12;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (s(i20, obj, i18)) {
                            n10 = H.A1(i20, (AbstractC2481x) unsafe.getObject(obj, j6), B(i18));
                            i19 += n10;
                            break;
                        } else {
                            break;
                        }
                }
                i18 += 3;
                i16 = i11;
                i17 = i10;
                i15 = 1048575;
            } else {
                this.f26968j.getClass();
                return D0.a(D0.b(obj)) + i19;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void e(Object obj, Object obj2) {
        if (r(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.f26959a;
                if (i10 < iArr.length) {
                    int y10 = y(i10);
                    int i11 = y10 & 1048575;
                    int x10 = x(y10);
                    int i12 = iArr[i10];
                    long j6 = i11;
                    switch (x10) {
                        case 0:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.l(obj, j6, J0.f26855c.a(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 1:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.m(obj, j6, J0.f26855c.b(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 2:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.o(obj, j6, J0.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 3:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.o(obj, j6, J0.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 4:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 5:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.o(obj, j6, J0.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 6:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 7:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.k(obj, j6, J0.f26855c.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 8:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.p(j6, obj, J0.i(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 9:
                            i(obj, i10, obj2);
                            break;
                        case 10:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.p(j6, obj, J0.i(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 11:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 12:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 13:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 14:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.o(obj, j6, J0.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 15:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.n(j6, obj, J0.f(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 16:
                            if (!o(i10, obj2)) {
                                break;
                            } else {
                                J0.o(obj, j6, J0.g(j6, obj2));
                                k(i10, obj);
                                break;
                            }
                        case 17:
                            i(obj, i10, obj2);
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
                            this.f26967i.b(j6, obj, obj2);
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            Class cls = A0.f26825a;
                            J0.p(j6, obj, C2459l0.a(J0.i(j6, obj), J0.i(j6, obj2)));
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
                            if (!s(i12, obj2, i10)) {
                                break;
                            } else {
                                J0.p(j6, obj, J0.i(j6, obj2));
                                J0.n(iArr[i10 + 2] & 1048575, obj, i12);
                                break;
                            }
                        case 60:
                            j(obj, i10, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!s(i12, obj2, i10)) {
                                break;
                            } else {
                                J0.p(j6, obj, J0.i(j6, obj2));
                                J0.n(iArr[i10 + 2] & 1048575, obj, i12);
                                break;
                            }
                        case 68:
                            j(obj, i10, obj2);
                            break;
                    }
                    i10 += 3;
                } else {
                    A0.t(this.f26968j, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void f(Object obj, I i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 1048575;
        boolean z10 = 0;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = this.f26959a;
            if (i17 < iArr.length) {
                int y10 = y(i17);
                int x10 = x(y10);
                int i18 = iArr[i17];
                Unsafe unsafe = f26958l;
                if (x10 <= 17) {
                    int i19 = iArr[i17 + 2];
                    int i20 = i19 & i14;
                    if (i20 != i15) {
                        if (i20 == i14) {
                            i16 = z10;
                        } else {
                            i16 = unsafe.getInt(obj, i20);
                        }
                        i15 = i20;
                    }
                    i12 = i16;
                    i11 = 1 << (i19 >>> 20);
                    i13 = i15;
                } else {
                    i13 = i15;
                    i12 = i16;
                    i11 = z10;
                }
                long j6 = y10 & i14;
                switch (x10) {
                    case 0:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.i(i18, J0.d(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.m(i18, J0.e(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.p(i18, unsafe.getLong(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.e(i18, unsafe.getLong(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.o(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.l(i18, unsafe.getLong(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.k(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.f(i18, J0.t(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (p(i17, i13, i12, i11, obj)) {
                            Object object = unsafe.getObject(obj, j6);
                            if (object instanceof String) {
                                i10.f26849a.v1(i18, (String) object);
                                break;
                            } else {
                                i10.g(i18, (E) object);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.q(i18, B(i17), unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.g(i18, (E) unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.d(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.j(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.r(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.s(i18, unsafe.getLong(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.a(i18, unsafe.getInt(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.b(i18, unsafe.getLong(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (p(i17, i13, i12, i11, obj)) {
                            i10.n(i18, B(i17), unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        A0.v(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 19:
                        A0.z(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 20:
                        A0.B(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 21:
                        A0.e(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 22:
                        A0.A(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 23:
                        A0.y(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 24:
                        A0.x(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 25:
                        A0.u(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 26:
                        int i21 = iArr[i17];
                        List list = (List) unsafe.getObject(obj, j6);
                        Class cls = A0.f26825a;
                        if (list != null && !list.isEmpty()) {
                            i10.c(i21, list);
                            break;
                        }
                        break;
                    case 27:
                        int i22 = iArr[i17];
                        List list2 = (List) unsafe.getObject(obj, j6);
                        AbstractC2486z0 B10 = B(i17);
                        Class cls2 = A0.f26825a;
                        if (list2 != null && !list2.isEmpty()) {
                            int i23 = z10 ? 1 : 0;
                            Object[] objArr = z10 ? 1 : 0;
                            for (int i24 = i23; i24 < list2.size(); i24++) {
                                i10.q(i22, B10, list2.get(i24));
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i25 = iArr[i17];
                        List list3 = (List) unsafe.getObject(obj, j6);
                        Class cls3 = A0.f26825a;
                        if (list3 != null && !list3.isEmpty()) {
                            i10.h(i25, list3);
                            break;
                        }
                        break;
                    case 29:
                        A0.d(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 30:
                        A0.w(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 31:
                        A0.C(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 32:
                        A0.a(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 33:
                        A0.b(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 34:
                        A0.c(iArr[i17], (List) unsafe.getObject(obj, j6), i10, z10);
                        break;
                    case 35:
                        A0.v(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 36:
                        A0.z(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 37:
                        A0.B(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 38:
                        A0.e(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 39:
                        A0.A(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 40:
                        A0.y(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 41:
                        A0.x(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 42:
                        A0.u(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 43:
                        A0.d(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 44:
                        A0.w(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 45:
                        A0.C(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 46:
                        A0.a(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 47:
                        A0.b(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case r9.y.f44626f /* 48 */:
                        A0.c(iArr[i17], (List) unsafe.getObject(obj, j6), i10, true);
                        break;
                    case 49:
                        int i26 = iArr[i17];
                        List list4 = (List) unsafe.getObject(obj, j6);
                        AbstractC2486z0 B11 = B(i17);
                        Class cls4 = A0.f26825a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i27 = z10; i27 < list4.size(); i27++) {
                                i10.n(i26, B11, list4.get(i27));
                            }
                            break;
                        }
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        if (unsafe.getObject(obj, j6) != null) {
                            int i28 = i17 / 3;
                            AbstractC2469q0.p(this.f26960b[i28 + i28]);
                            throw null;
                        }
                        break;
                    case 51:
                        if (s(i18, obj, i17)) {
                            i10.i(i18, ((Double) J0.i(j6, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (s(i18, obj, i17)) {
                            i10.m(i18, ((Float) J0.i(j6, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (s(i18, obj, i17)) {
                            i10.p(i18, z(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (s(i18, obj, i17)) {
                            i10.e(i18, z(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (s(i18, obj, i17)) {
                            i10.o(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (s(i18, obj, i17)) {
                            i10.l(i18, z(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (s(i18, obj, i17)) {
                            i10.k(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (s(i18, obj, i17)) {
                            i10.f(i18, ((Boolean) J0.i(j6, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (s(i18, obj, i17)) {
                            Object object2 = unsafe.getObject(obj, j6);
                            if (object2 instanceof String) {
                                i10.f26849a.v1(i18, (String) object2);
                                break;
                            } else {
                                i10.g(i18, (E) object2);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (s(i18, obj, i17)) {
                            i10.q(i18, B(i17), unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (s(i18, obj, i17)) {
                            i10.g(i18, (E) unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (s(i18, obj, i17)) {
                            i10.d(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (s(i18, obj, i17)) {
                            i10.j(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (s(i18, obj, i17)) {
                            i10.r(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (s(i18, obj, i17)) {
                            i10.s(i18, z(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (s(i18, obj, i17)) {
                            i10.a(i18, v(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (s(i18, obj, i17)) {
                            i10.b(i18, z(j6, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (s(i18, obj, i17)) {
                            i10.n(i18, B(i17), unsafe.getObject(obj, j6));
                            break;
                        } else {
                            break;
                        }
                }
                i17 += 3;
                i15 = i13;
                i16 = i12;
                i14 = 1048575;
                z10 = 0;
            } else {
                this.f26968j.getClass();
                D0.d(D0.b(obj), i10);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final void g(Object obj, byte[] bArr, int i10, int i11, A a5) {
        t(obj, bArr, i10, i11, 0, a5);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final boolean h(Object obj, Object obj2) {
        boolean z10;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f26959a;
            if (i10 < iArr.length) {
                int y10 = y(i10);
                long j6 = y10 & 1048575;
                switch (x(y10)) {
                    case 0:
                        if (!n(obj, i10, obj2)) {
                            break;
                        } else {
                            I0 i02 = J0.f26855c;
                            if (Double.doubleToLongBits(i02.a(j6, obj)) != Double.doubleToLongBits(i02.a(j6, obj2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 1:
                        if (!n(obj, i10, obj2)) {
                            break;
                        } else {
                            I0 i03 = J0.f26855c;
                            if (Float.floatToIntBits(i03.b(j6, obj)) != Float.floatToIntBits(i03.b(j6, obj2))) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 2:
                        if (n(obj, i10, obj2) && J0.g(j6, obj) == J0.g(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (n(obj, i10, obj2) && J0.g(j6, obj) == J0.g(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (n(obj, i10, obj2) && J0.g(j6, obj) == J0.g(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (!n(obj, i10, obj2)) {
                            break;
                        } else {
                            I0 i04 = J0.f26855c;
                            if (i04.g(j6, obj) != i04.g(j6, obj2)) {
                                break;
                            } else {
                                continue;
                                i10 += 3;
                            }
                        }
                    case 8:
                        if (n(obj, i10, obj2) && A0.f(J0.i(j6, obj), J0.i(j6, obj2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (n(obj, i10, obj2) && A0.f(J0.i(j6, obj), J0.i(j6, obj2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (n(obj, i10, obj2) && A0.f(J0.i(j6, obj), J0.i(j6, obj2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (n(obj, i10, obj2) && J0.g(j6, obj) == J0.g(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (n(obj, i10, obj2) && J0.f(j6, obj) == J0.f(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (n(obj, i10, obj2) && J0.g(j6, obj) == J0.g(j6, obj2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (n(obj, i10, obj2) && A0.f(J0.i(j6, obj), J0.i(j6, obj2))) {
                            continue;
                            i10 += 3;
                        }
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
                        z10 = A0.f(J0.i(j6, obj), J0.i(j6, obj2));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        z10 = A0.f(J0.i(j6, obj), J0.i(j6, obj2));
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
                        if (J0.f(j10, obj) == J0.f(j10, obj2) && A0.f(J0.i(j6, obj), J0.i(j6, obj2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        i10 += 3;
                }
                if (z10) {
                    i10 += 3;
                }
            } else {
                this.f26968j.getClass();
                if (!((Q) obj).zzc.equals(((Q) obj2).zzc)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void i(Object obj, int i10, Object obj2) {
        if (!o(i10, obj2)) {
            return;
        }
        long y10 = y(i10) & 1048575;
        Unsafe unsafe = f26958l;
        Object object = unsafe.getObject(obj2, y10);
        if (object != null) {
            AbstractC2486z0 B10 = B(i10);
            if (!o(i10, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, y10, object);
                } else {
                    Q q10 = B10.q();
                    B10.e(q10, object);
                    unsafe.putObject(obj, y10, q10);
                }
                k(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, y10);
            if (!r(object2)) {
                Q q11 = B10.q();
                B10.e(q11, object2);
                unsafe.putObject(obj, y10, q11);
                object2 = q11;
            }
            B10.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f26959a[i10] + " is present but null: " + obj2.toString());
    }

    public final void j(Object obj, int i10, Object obj2) {
        int[] iArr = this.f26959a;
        int i11 = iArr[i10];
        if (!s(i11, obj2, i10)) {
            return;
        }
        long y10 = y(i10) & 1048575;
        Unsafe unsafe = f26958l;
        Object object = unsafe.getObject(obj2, y10);
        if (object != null) {
            AbstractC2486z0 B10 = B(i10);
            if (!s(i11, obj, i10)) {
                if (!r(object)) {
                    unsafe.putObject(obj, y10, object);
                } else {
                    Q q10 = B10.q();
                    B10.e(q10, object);
                    unsafe.putObject(obj, y10, q10);
                }
                J0.n(iArr[i10 + 2] & 1048575, obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, y10);
            if (!r(object2)) {
                Q q11 = B10.q();
                B10.e(q11, object2);
                unsafe.putObject(obj, y10, q11);
                object2 = q11;
            }
            B10.e(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
    }

    public final void k(int i10, Object obj) {
        int i11 = this.f26959a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        J0.n(j6, obj, (1 << (i11 >>> 20)) | J0.f(j6, obj));
    }

    public final void l(Object obj, int i10, Object obj2) {
        f26958l.putObject(obj, y(i10) & 1048575, obj2);
        k(i10, obj);
    }

    public final void m(int i10, Object obj, Object obj2, int i11) {
        f26958l.putObject(obj, y(i11) & 1048575, obj2);
        J0.n(this.f26959a[i11 + 2] & 1048575, obj, i10);
    }

    public final boolean n(Object obj, int i10, Object obj2) {
        if (o(i10, obj) == o(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final boolean o(int i10, Object obj) {
        int i11 = this.f26959a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int y10 = y(i10);
            long j10 = y10 & 1048575;
            switch (x(y10)) {
                case 0:
                    if (Double.doubleToRawLongBits(J0.f26855c.a(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(J0.f26855c.b(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (J0.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (J0.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (J0.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return J0.f26855c.g(j10, obj);
                case 8:
                    Object i12 = J0.i(j10, obj);
                    if (i12 instanceof String) {
                        if (((String) i12).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (i12 instanceof E) {
                        if (E.f26839Z.equals(i12)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (J0.i(j10, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (E.f26839Z.equals(J0.i(j10, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (J0.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (J0.f(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (J0.g(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (J0.i(j10, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & J0.f(j6, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean p(int i10, int i11, int i12, int i13, Object obj) {
        if (i11 == 1048575) {
            return o(i10, obj);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2486z0
    public final Q q() {
        return (Q) ((Q) this.f26963e).m(4);
    }

    public final boolean s(int i10, Object obj, int i11) {
        if (J0.f(this.f26959a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:530:0x0e50, code lost:
        if (r11 == 1048575) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0e52, code lost:
        r0.putInt(r7, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0e56, code lost:
        r0 = r13.f26965g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0e5a, code lost:
        if (r0 >= r13.f26966h) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0e5c, code lost:
        r1 = r13.f26964f[r0];
        r3 = r18[r1];
        r3 = com.google.android.gms.internal.play_billing.J0.i(r13.y(r1) & 1048575, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0e6c, code lost:
        if (r3 != null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0e74, code lost:
        if (r13.A(r1) != null) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0e77, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0e79, code lost:
        r3 = (com.google.android.gms.internal.play_billing.C2457k0) r3;
        r1 = r1 / 3;
        com.google.android.gms.internal.play_billing.AbstractC2469q0.p(r19[r1 + r1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0e83, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0e84, code lost:
        if (r9 != 0) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0e88, code lost:
        if (r8 != r38) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0e8f, code lost:
        throw com.google.android.gms.internal.play_billing.C2437a0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0e92, code lost:
        if (r8 > r38) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0e94, code lost:
        if (r14 != r9) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0e96, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0e9b, code lost:
        throw com.google.android.gms.internal.play_billing.C2437a0.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:263:0x0776 -> B:264:0x0777). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:298:0x085e -> B:299:0x085f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x08b8 -> B:320:0x08b9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i10, int i11, int i12, A a5) {
        C2470r0 c2470r0;
        Unsafe unsafe;
        int i13;
        int[] iArr;
        Object[] objArr;
        int i14;
        int i15;
        int i16;
        int i17;
        C0 c02;
        byte[] bArr2;
        int i18;
        int i19;
        C0 c03;
        int i20;
        int i21;
        int i22;
        int i23;
        A a10;
        int i24;
        int i25;
        char c10;
        int i26;
        int i27;
        int J02;
        int i28;
        int i29;
        int i30;
        boolean z10;
        int i31;
        boolean z11;
        int i32;
        int i33;
        byte[] bArr3;
        int i34;
        int i35;
        C0 c04;
        Unsafe unsafe2;
        int i36;
        int i37;
        A a11;
        Object obj2;
        int i38;
        A a12;
        int i39;
        boolean z12;
        int i40;
        C2470r0 c2470r02;
        int C02;
        int i41;
        int J03;
        int i42;
        Unsafe unsafe3;
        int i43;
        int i44;
        C0 c05;
        int i45;
        A a13;
        int i46;
        byte[] bArr4;
        A a14;
        Unsafe unsafe4;
        int i47;
        int i48;
        C0 c06;
        int i49;
        int H02;
        int i50;
        AbstractC2483y abstractC2483y;
        int i51;
        Unsafe unsafe5;
        int i52;
        int i53;
        A a15;
        int i54;
        int i55;
        U u10;
        int i56;
        int i57;
        C2470r0 c2470r03 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i58 = i11;
        int i59 = i12;
        A a16 = a5;
        if (r(obj)) {
            int i60 = i10;
            int i61 = -1;
            int i62 = 0;
            int i63 = 1048575;
            int i64 = 0;
            int i65 = 0;
            while (true) {
                Object[] objArr2 = c2470r03.f26960b;
                int[] iArr2 = c2470r03.f26959a;
                Unsafe unsafe6 = f26958l;
                if (i60 < i58) {
                    int i66 = i60 + 1;
                    int i67 = bArr5[i60];
                    if (i67 < 0) {
                        i66 = M3.H.K0(i67, bArr5, i66, a16);
                        i67 = a16.f26821a;
                    }
                    int i68 = i67 >>> 3;
                    int i69 = c2470r03.f26962d;
                    int i70 = c2470r03.f26961c;
                    if (i68 > i61) {
                        int i71 = i62 / 3;
                        if (i68 >= i70 && i68 <= i69) {
                            i17 = c2470r03.w(i68, i71);
                        } else {
                            i17 = -1;
                        }
                        i16 = 0;
                    } else if (i68 >= i70 && i68 <= i69) {
                        i16 = 0;
                        i17 = c2470r03.w(i68, 0);
                    } else {
                        i16 = 0;
                        i17 = -1;
                    }
                    C0 c07 = C0.f26832f;
                    if (i17 == -1) {
                        c02 = c07;
                        iArr = iArr2;
                        objArr = objArr2;
                        bArr2 = bArr5;
                        i62 = i16;
                        i13 = i59;
                        i15 = i67;
                        i18 = i66;
                        i19 = i68;
                    } else {
                        int i72 = i67 & 7;
                        int i73 = iArr2[i17 + 1];
                        int x10 = x(i73);
                        int i74 = i67;
                        long j6 = i73 & 1048575;
                        if (x10 <= 17) {
                            int i75 = iArr2[i17 + 2];
                            int i76 = 1 << (i75 >>> 20);
                            int i77 = 1048575;
                            int i78 = i75 & 1048575;
                            if (i78 != i63) {
                                if (i63 != 1048575) {
                                    unsafe6.putInt(obj3, i63, i64);
                                    i77 = 1048575;
                                }
                                if (i78 == i77) {
                                    i32 = 0;
                                } else {
                                    i32 = unsafe6.getInt(obj3, i78);
                                }
                                i64 = i32;
                                i20 = i78;
                            } else {
                                i20 = i63;
                            }
                            switch (x10) {
                                case 0:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    i26 = i12;
                                    if (i72 == 1) {
                                        i27 = i66 + 8;
                                        i64 |= i76;
                                        J0.l(obj3, j6, Double.longBitsToDouble(M3.H.P0(i66, bArr2)));
                                        i60 = i27;
                                        i59 = i26;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 1:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    i26 = i12;
                                    if (i72 == 5) {
                                        i27 = i66 + 4;
                                        i64 |= i76;
                                        J0.m(obj3, j6, Float.intBitsToFloat(M3.H.E0(i66, bArr2)));
                                        i60 = i27;
                                        i59 = i26;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    bArr2 = bArr;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 != 0) {
                                        i26 = i59;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    } else {
                                        i64 |= i76;
                                        int M02 = M3.H.M0(bArr2, i66, a10);
                                        unsafe6.putLong(obj, j6, a10.f26822b);
                                        i59 = i59;
                                        i58 = i11;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i60 = M02;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 == 0) {
                                        i64 |= i76;
                                        J02 = M3.H.J0(bArr2, i66, a10);
                                        unsafe6.putInt(obj3, j6, a10.f26821a);
                                        i60 = J02;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i26 = i59;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    bArr2 = bArr;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 != 1) {
                                        i26 = i12;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    } else {
                                        i28 = i66 + 8;
                                        i64 |= i76;
                                        i29 = i11;
                                        i30 = i12;
                                        unsafe6.putLong(obj, j6, M3.H.P0(i66, bArr2));
                                        i58 = i29;
                                        i59 = i30;
                                        i60 = i28;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    bArr2 = bArr;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    z10 = false;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 != 5) {
                                        i26 = i12;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    } else {
                                        i31 = i66 + 4;
                                        i64 |= i76;
                                        unsafe6.putInt(obj3, j6, M3.H.E0(i66, bArr2));
                                        i58 = i11;
                                        i59 = i12;
                                        i60 = i31;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    }
                                case 7:
                                    bArr2 = bArr;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    z10 = false;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 == 0) {
                                        i64 |= i76;
                                        i31 = M3.H.M0(bArr2, i66, a10);
                                        if (a10.f26822b != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        J0.k(obj3, j6, z11);
                                        i58 = i11;
                                        i59 = i12;
                                        i60 = i31;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i26 = i12;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 8:
                                    bArr2 = bArr;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 == 2) {
                                        if ((i73 & 536870912) != 0) {
                                            i31 = M3.H.J0(bArr2, i66, a10);
                                            int i79 = a10.f26821a;
                                            if (i79 >= 0) {
                                                int i80 = i64 | i76;
                                                if (i79 == 0) {
                                                    a10.f26823c = "";
                                                    i64 = i80;
                                                } else {
                                                    G g10 = L0.f26862a;
                                                    int length = bArr2.length;
                                                    if ((i31 | i79 | ((length - i31) - i79)) >= 0) {
                                                        int i81 = i31 + i79;
                                                        char[] cArr = new char[i79];
                                                        int i82 = 0;
                                                        while (i31 < i81) {
                                                            byte b10 = bArr2[i31];
                                                            if (r9.y.m1(b10)) {
                                                                i31++;
                                                                cArr[i82] = (char) b10;
                                                                i82++;
                                                            } else {
                                                                int i83 = i82;
                                                                while (i31 < i81) {
                                                                    int i84 = i31 + 1;
                                                                    int i85 = i80;
                                                                    byte b11 = bArr2[i31];
                                                                    if (r9.y.m1(b11)) {
                                                                        cArr[i83] = (char) b11;
                                                                        i83++;
                                                                        i31 = i84;
                                                                        while (i31 < i81) {
                                                                            byte b12 = bArr2[i31];
                                                                            if (r9.y.m1(b12)) {
                                                                                i31++;
                                                                                cArr[i83] = (char) b12;
                                                                                i83++;
                                                                            } else {
                                                                                i80 = i85;
                                                                            }
                                                                        }
                                                                        i80 = i85;
                                                                    } else if (b11 < -32) {
                                                                        if (i84 < i81) {
                                                                            i31 += 2;
                                                                            r9.y.l1(b11, bArr2[i84], cArr, i83);
                                                                            i83++;
                                                                            i80 = i85;
                                                                        } else {
                                                                            throw C2437a0.a();
                                                                        }
                                                                    } else if (b11 < -16) {
                                                                        if (i84 < i81 - 1) {
                                                                            r9.y.k1(b11, bArr2[i84], bArr2[i31 + 2], cArr, i83);
                                                                            i83++;
                                                                            i80 = i85;
                                                                            i31 += 3;
                                                                        } else {
                                                                            throw C2437a0.a();
                                                                        }
                                                                    } else if (i84 < i81 - 2) {
                                                                        byte b13 = bArr2[i84];
                                                                        int i86 = i31 + 3;
                                                                        i31 += 4;
                                                                        r9.y.j1(b11, b13, bArr2[i31 + 2], bArr2[i86], cArr, i83);
                                                                        i83 += 2;
                                                                        i80 = i85;
                                                                    } else {
                                                                        throw C2437a0.a();
                                                                    }
                                                                }
                                                                i64 = i80;
                                                                a10.f26823c = new String(cArr, 0, i83);
                                                                i31 = i81;
                                                            }
                                                        }
                                                        int i832 = i82;
                                                        while (i31 < i81) {
                                                        }
                                                        i64 = i80;
                                                        a10.f26823c = new String(cArr, 0, i832);
                                                        i31 = i81;
                                                    } else {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i31), Integer.valueOf(i79)));
                                                    }
                                                }
                                                c10 = 3;
                                            } else {
                                                throw C2437a0.b();
                                            }
                                        } else {
                                            i31 = M3.H.J0(bArr2, i66, a10);
                                            int i87 = a10.f26821a;
                                            if (i87 >= 0) {
                                                int i88 = i64 | i76;
                                                if (i87 == 0) {
                                                    a10.f26823c = "";
                                                } else {
                                                    a10.f26823c = new String(bArr2, i31, i87, Y.f26890a);
                                                    i31 += i87;
                                                }
                                                i64 = i88;
                                            } else {
                                                throw C2437a0.b();
                                            }
                                        }
                                        unsafe6.putObject(obj3, j6, a10.f26823c);
                                        i58 = i11;
                                        i59 = i12;
                                        i60 = i31;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i26 = i12;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 9:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 != 2) {
                                        i26 = i59;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    } else {
                                        i64 |= i76;
                                        Object C10 = c2470r03.C(i23, obj3);
                                        int O02 = M3.H.O0(C10, c2470r03.B(i23), bArr, i66, i11, a5);
                                        c2470r03.l(obj3, i23, C10);
                                        i60 = O02;
                                        i59 = i59;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    }
                                case 10:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c02 = c07;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 == 2) {
                                        i64 |= i76;
                                        int C03 = M3.H.C0(bArr2, i66, a10);
                                        unsafe6.putObject(obj3, j6, a10.f26823c);
                                        i60 = C03;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i26 = i59;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 12:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 != 0) {
                                        i26 = i59;
                                        c02 = c07;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    } else {
                                        J02 = M3.H.J0(bArr2, i66, a10);
                                        int i89 = a10.f26821a;
                                        U A10 = c2470r03.A(i23);
                                        if ((i73 & Integer.MIN_VALUE) != 0 && A10 != null && !A10.a(i89)) {
                                            Q q10 = (Q) obj3;
                                            C0 c08 = q10.zzc;
                                            if (c08 == c07) {
                                                c08 = C0.b();
                                                q10.zzc = c08;
                                            }
                                            c08.c(i24, Long.valueOf(i89));
                                        } else {
                                            i64 |= i76;
                                            unsafe6.putInt(obj3, j6, i89);
                                        }
                                        i60 = J02;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    }
                                case 15:
                                    bArr2 = bArr;
                                    i25 = i11;
                                    i59 = i12;
                                    i23 = i17;
                                    i21 = i68;
                                    c10 = 3;
                                    i24 = i74;
                                    i22 = i20;
                                    a10 = a16;
                                    if (i72 == 0) {
                                        i64 |= i76;
                                        J02 = M3.H.J0(bArr2, i66, a10);
                                        unsafe6.putInt(obj3, j6, r.f.b0(a10.f26821a));
                                        i60 = J02;
                                        i58 = i25;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        i26 = i59;
                                        c02 = c07;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                case 16:
                                    i21 = i68;
                                    i24 = i74;
                                    i22 = i20;
                                    if (i72 == 0) {
                                        i64 |= i76;
                                        bArr2 = bArr;
                                        i28 = M3.H.M0(bArr2, i66, a16);
                                        i23 = i17;
                                        a10 = a16;
                                        i29 = i11;
                                        i30 = i12;
                                        c10 = 3;
                                        unsafe6.putLong(obj, j6, r.f.c0(a16.f26822b));
                                        i58 = i29;
                                        i59 = i30;
                                        i60 = i28;
                                        i62 = i23;
                                        i65 = i24;
                                        a16 = a10;
                                        i61 = i21;
                                        i63 = i22;
                                        bArr5 = bArr2;
                                        break;
                                    } else {
                                        bArr2 = bArr;
                                        i23 = i17;
                                        a10 = a16;
                                        i26 = i12;
                                        c02 = c07;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                                default:
                                    if (i72 == 3) {
                                        i64 |= i76;
                                        Object C11 = c2470r03.C(i17, obj3);
                                        int i90 = i20;
                                        i60 = M3.H.N0(C11, c2470r03.B(i17), bArr, i66, i11, (i68 << 3) | 4, a5);
                                        c2470r03.l(obj3, i17, C11);
                                        bArr5 = bArr;
                                        i63 = i90;
                                        i62 = i17;
                                        i65 = i74;
                                        i61 = i68;
                                        i58 = i11;
                                        i59 = i12;
                                        break;
                                    } else {
                                        i21 = i68;
                                        i22 = i20;
                                        bArr2 = bArr;
                                        i23 = i17;
                                        a10 = a16;
                                        i24 = i74;
                                        c02 = c07;
                                        i26 = i12;
                                        i13 = i26;
                                        i18 = i66;
                                        i62 = i23;
                                        i15 = i24;
                                        i19 = i21;
                                        iArr = iArr2;
                                        objArr = objArr2;
                                        i63 = i22;
                                        break;
                                    }
                            }
                        } else {
                            int i91 = i68;
                            byte[] bArr6 = bArr5;
                            int i92 = i17;
                            int i93 = 10;
                            if (x10 == 27) {
                                if (i72 == 2) {
                                    AbstractC2483y abstractC2483y2 = (AbstractC2483y) ((X) unsafe6.getObject(obj3, j6));
                                    boolean r10 = abstractC2483y2.r();
                                    X x11 = abstractC2483y2;
                                    if (!r10) {
                                        int size = abstractC2483y2.size();
                                        if (size != 0) {
                                            i93 = size + size;
                                        }
                                        X u11 = abstractC2483y2.u(i93);
                                        unsafe6.putObject(obj3, j6, u11);
                                        x11 = u11;
                                    }
                                    i60 = M3.H.G0(c2470r03.B(i92), i74, bArr, i66, i11, x11, a5);
                                    i58 = i11;
                                    i65 = i74;
                                    i62 = i92;
                                    i61 = i91;
                                    i63 = i63;
                                    bArr5 = bArr6;
                                    i59 = i12;
                                    a16 = a5;
                                } else {
                                    i33 = i63;
                                    unsafe2 = unsafe6;
                                    bArr3 = bArr6;
                                    i34 = i74;
                                    i36 = i92;
                                    i35 = i91;
                                    iArr = iArr2;
                                    objArr = objArr2;
                                    i37 = i66;
                                    obj2 = obj3;
                                    a11 = a5;
                                    c04 = c07;
                                    i13 = i12;
                                    c02 = c04;
                                    i62 = i36;
                                    obj3 = obj2;
                                    i19 = i35;
                                    i63 = i33;
                                    c2470r0 = this;
                                    bArr2 = bArr3;
                                    unsafe = unsafe2;
                                    i15 = i34;
                                    i18 = i37;
                                }
                            } else {
                                i33 = i63;
                                if (x10 <= 49) {
                                    int i94 = i74;
                                    long j10 = i73;
                                    AbstractC2483y abstractC2483y3 = (AbstractC2483y) ((X) unsafe6.getObject(obj3, j6));
                                    if (!abstractC2483y3.r()) {
                                        int size2 = abstractC2483y3.size();
                                        if (size2 != 0) {
                                            i93 = size2 + size2;
                                        }
                                        X u12 = abstractC2483y3.u(i93);
                                        unsafe6.putObject(obj3, j6, u12);
                                        abstractC2483y3 = u12;
                                    }
                                    switch (x10) {
                                        case 18:
                                        case 35:
                                            i44 = i94;
                                            i45 = i11;
                                            unsafe3 = unsafe6;
                                            bArr4 = bArr6;
                                            i62 = i92;
                                            i43 = i91;
                                            iArr = iArr2;
                                            c05 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            a13 = a5;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                i46 = M3.H.J0(bArr4, i42, a13);
                                                int i95 = a13.f26821a + i46;
                                                if (i46 >= i95) {
                                                    if (i46 != i95) {
                                                        throw C2437a0.d();
                                                    }
                                                } else {
                                                    Double.longBitsToDouble(M3.H.P0(i46, bArr4));
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 1) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    Double.longBitsToDouble(M3.H.P0(i42, bArr4));
                                                    throw null;
                                                }
                                                i46 = i42;
                                                break;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            i44 = i94;
                                            i45 = i11;
                                            unsafe3 = unsafe6;
                                            bArr4 = bArr6;
                                            i62 = i92;
                                            i43 = i91;
                                            iArr = iArr2;
                                            c05 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            a13 = a5;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                i46 = M3.H.J0(bArr4, i42, a13);
                                                int i96 = a13.f26821a + i46;
                                                if (i46 >= i96) {
                                                    if (i46 != i96) {
                                                        throw C2437a0.d();
                                                    }
                                                } else {
                                                    Float.intBitsToFloat(M3.H.E0(i46, bArr4));
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 5) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    Float.intBitsToFloat(M3.H.E0(i42, bArr4));
                                                    throw null;
                                                }
                                                i46 = i42;
                                                break;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i44 = i94;
                                            i45 = i11;
                                            unsafe3 = unsafe6;
                                            bArr4 = bArr6;
                                            i62 = i92;
                                            i43 = i91;
                                            iArr = iArr2;
                                            c05 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            a13 = a5;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                i46 = M3.H.J0(bArr4, i42, a13);
                                                int i97 = a13.f26821a + i46;
                                                if (i46 >= i97) {
                                                    if (i46 != i97) {
                                                        throw C2437a0.d();
                                                    }
                                                } else {
                                                    M3.H.M0(bArr4, i46, a13);
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 0) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    M3.H.M0(bArr4, i42, a13);
                                                    throw null;
                                                }
                                                i46 = i42;
                                                break;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i45 = i11;
                                            a14 = a5;
                                            unsafe4 = unsafe6;
                                            bArr4 = bArr6;
                                            i47 = i92;
                                            i48 = i91;
                                            iArr = iArr2;
                                            c06 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            i49 = i94;
                                            if (i72 == 2) {
                                                H02 = M3.H.H0(bArr4, i42, abstractC2483y3, a14);
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                i46 = H02;
                                                a13 = a14;
                                                i62 = i47;
                                                break;
                                            } else if (i72 == 0) {
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                i62 = i47;
                                                i46 = M3.H.L0(i49, bArr, i42, i11, abstractC2483y3, a5);
                                                a13 = a14;
                                                break;
                                            } else {
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                i62 = i47;
                                                a13 = a14;
                                                i46 = i42;
                                                break;
                                            }
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i45 = i11;
                                            a14 = a5;
                                            unsafe4 = unsafe6;
                                            bArr4 = bArr6;
                                            i47 = i92;
                                            i48 = i91;
                                            iArr = iArr2;
                                            c06 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            i49 = i94;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                H02 = M3.H.J0(bArr4, i42, a14);
                                                int i98 = a14.f26821a + H02;
                                                if (H02 >= i98) {
                                                    if (H02 != i98) {
                                                        throw C2437a0.d();
                                                    }
                                                    unsafe3 = unsafe4;
                                                    i43 = i48;
                                                    c05 = c06;
                                                    i44 = i49;
                                                    i46 = H02;
                                                    a13 = a14;
                                                    i62 = i47;
                                                    break;
                                                } else {
                                                    M3.H.P0(H02, bArr4);
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 1) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    M3.H.P0(i42, bArr4);
                                                    throw null;
                                                }
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                a13 = a14;
                                                i62 = i47;
                                                i46 = i42;
                                                break;
                                            }
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i45 = i11;
                                            a14 = a5;
                                            unsafe4 = unsafe6;
                                            bArr4 = bArr6;
                                            i47 = i92;
                                            i48 = i91;
                                            iArr = iArr2;
                                            c06 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            i49 = i94;
                                            if (i72 == 2) {
                                                S s10 = (S) abstractC2483y3;
                                                H02 = M3.H.J0(bArr4, i42, a14);
                                                int i99 = a14.f26821a + H02;
                                                while (H02 < i99) {
                                                    s10.s(M3.H.E0(H02, bArr4));
                                                    H02 += 4;
                                                }
                                                if (H02 != i99) {
                                                    throw C2437a0.d();
                                                }
                                            } else {
                                                if (i72 == 5) {
                                                    H02 = i42 + 4;
                                                    S s11 = (S) abstractC2483y3;
                                                    s11.s(M3.H.E0(i42, bArr4));
                                                    while (H02 < i45) {
                                                        int J04 = M3.H.J0(bArr4, H02, a14);
                                                        if (i49 == a14.f26821a) {
                                                            s11.s(M3.H.E0(J04, bArr4));
                                                            H02 = J04 + 4;
                                                        }
                                                    }
                                                }
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                a13 = a14;
                                                i62 = i47;
                                                i46 = i42;
                                                break;
                                            }
                                            unsafe3 = unsafe4;
                                            i43 = i48;
                                            c05 = c06;
                                            i44 = i49;
                                            i46 = H02;
                                            a13 = a14;
                                            i62 = i47;
                                            break;
                                        case 25:
                                        case 42:
                                            i45 = i11;
                                            a14 = a5;
                                            unsafe4 = unsafe6;
                                            bArr4 = bArr6;
                                            i47 = i92;
                                            i48 = i91;
                                            iArr = iArr2;
                                            c06 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            i49 = i94;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                H02 = M3.H.J0(bArr4, i42, a14);
                                                int i100 = a14.f26821a + H02;
                                                if (H02 >= i100) {
                                                    if (H02 != i100) {
                                                        throw C2437a0.d();
                                                    }
                                                    unsafe3 = unsafe4;
                                                    i43 = i48;
                                                    c05 = c06;
                                                    i44 = i49;
                                                    i46 = H02;
                                                    a13 = a14;
                                                    i62 = i47;
                                                    break;
                                                } else {
                                                    M3.H.M0(bArr4, H02, a14);
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 0) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    M3.H.M0(bArr4, i42, a14);
                                                    throw null;
                                                }
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                a13 = a14;
                                                i62 = i47;
                                                i46 = i42;
                                                break;
                                            }
                                        case 26:
                                            i45 = i11;
                                            a14 = a5;
                                            unsafe4 = unsafe6;
                                            AbstractC2483y abstractC2483y4 = abstractC2483y3;
                                            bArr4 = bArr6;
                                            i47 = i92;
                                            i48 = i91;
                                            iArr = iArr2;
                                            c06 = c07;
                                            objArr = objArr2;
                                            i42 = i66;
                                            i49 = i94;
                                            if (i72 == 2) {
                                                if ((536870912 & j10) == 0) {
                                                    H02 = M3.H.J0(bArr4, i42, a14);
                                                    int i101 = a14.f26821a;
                                                    if (i101 >= 0) {
                                                        if (i101 == 0) {
                                                            abstractC2483y = abstractC2483y4;
                                                            abstractC2483y.add("");
                                                            while (H02 < i45) {
                                                                int J05 = M3.H.J0(bArr4, H02, a14);
                                                                if (i49 == a14.f26821a) {
                                                                    H02 = M3.H.J0(bArr4, J05, a14);
                                                                    i101 = a14.f26821a;
                                                                    if (i101 >= 0) {
                                                                        if (i101 == 0) {
                                                                            abstractC2483y.add("");
                                                                        } else {
                                                                            abstractC2483y.add(new String(bArr4, H02, i101, Y.f26890a));
                                                                            H02 += i101;
                                                                            while (H02 < i45) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        throw C2437a0.b();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            abstractC2483y = abstractC2483y4;
                                                            abstractC2483y.add(new String(bArr4, H02, i101, Y.f26890a));
                                                            H02 += i101;
                                                            while (H02 < i45) {
                                                            }
                                                        }
                                                    } else {
                                                        throw C2437a0.b();
                                                    }
                                                } else {
                                                    H02 = M3.H.J0(bArr4, i42, a14);
                                                    int i102 = a14.f26821a;
                                                    if (i102 >= 0) {
                                                        if (i102 == 0) {
                                                            abstractC2483y4.add("");
                                                            while (H02 < i45) {
                                                                int J06 = M3.H.J0(bArr4, H02, a14);
                                                                if (i49 == a14.f26821a) {
                                                                    H02 = M3.H.J0(bArr4, J06, a14);
                                                                    int i103 = a14.f26821a;
                                                                    if (i103 >= 0) {
                                                                        if (i103 == 0) {
                                                                            abstractC2483y4.add("");
                                                                        } else {
                                                                            i50 = H02 + i103;
                                                                            if (L0.d(bArr4, H02, i50)) {
                                                                                abstractC2483y4.add(new String(bArr4, H02, i103, Y.f26890a));
                                                                                H02 = i50;
                                                                                while (H02 < i45) {
                                                                                }
                                                                            } else {
                                                                                throw C2437a0.a();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        throw C2437a0.b();
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i50 = H02 + i102;
                                                            if (L0.d(bArr4, H02, i50)) {
                                                                abstractC2483y4.add(new String(bArr4, H02, i102, Y.f26890a));
                                                                H02 = i50;
                                                                while (H02 < i45) {
                                                                }
                                                            } else {
                                                                throw C2437a0.a();
                                                            }
                                                        }
                                                    } else {
                                                        throw C2437a0.b();
                                                    }
                                                }
                                                unsafe3 = unsafe4;
                                                i43 = i48;
                                                c05 = c06;
                                                i44 = i49;
                                                i46 = H02;
                                                a13 = a14;
                                                i62 = i47;
                                                break;
                                            }
                                            unsafe3 = unsafe4;
                                            i43 = i48;
                                            c05 = c06;
                                            i44 = i49;
                                            a13 = a14;
                                            i62 = i47;
                                            i46 = i42;
                                            break;
                                        case 27:
                                            i62 = i92;
                                            i51 = i91;
                                            i42 = i66;
                                            if (i72 == 2) {
                                                bArr4 = bArr6;
                                                iArr = iArr2;
                                                i45 = i11;
                                                objArr = objArr2;
                                                unsafe3 = unsafe6;
                                                i43 = i51;
                                                i44 = i94;
                                                a13 = a5;
                                                i46 = M3.H.G0(c2470r03.B(i62), i94, bArr, i42, i11, abstractC2483y3, a5);
                                                i62 = i62;
                                                c05 = c07;
                                                break;
                                            } else {
                                                bArr4 = bArr6;
                                                i45 = i11;
                                                iArr = iArr2;
                                                objArr = objArr2;
                                                unsafe3 = unsafe6;
                                                a13 = a5;
                                                i44 = i94;
                                                c05 = c07;
                                                i43 = i51;
                                                i46 = i42;
                                                break;
                                            }
                                        case 28:
                                            unsafe5 = unsafe6;
                                            i62 = i92;
                                            i51 = i91;
                                            i42 = i66;
                                            if (i72 == 2) {
                                                i46 = M3.H.J0(bArr6, i42, a5);
                                                int i104 = a5.f26821a;
                                                if (i104 >= 0) {
                                                    if (i104 <= bArr6.length - i46) {
                                                        if (i104 == 0) {
                                                            abstractC2483y3.add(E.f26839Z);
                                                            while (i46 < i11) {
                                                                int J07 = M3.H.J0(bArr6, i46, a5);
                                                                if (i94 == a5.f26821a) {
                                                                    i46 = M3.H.J0(bArr6, J07, a5);
                                                                    i104 = a5.f26821a;
                                                                    if (i104 >= 0) {
                                                                        if (i104 <= bArr6.length - i46) {
                                                                            if (i104 == 0) {
                                                                                abstractC2483y3.add(E.f26839Z);
                                                                            } else {
                                                                                abstractC2483y3.add(E.T(bArr6, i46, i104));
                                                                                i46 += i104;
                                                                                while (i46 < i11) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            throw C2437a0.d();
                                                                        }
                                                                    } else {
                                                                        throw C2437a0.b();
                                                                    }
                                                                } else {
                                                                    a13 = a5;
                                                                    bArr4 = bArr6;
                                                                    i44 = i94;
                                                                    i45 = i11;
                                                                    iArr = iArr2;
                                                                    c05 = c07;
                                                                    objArr = objArr2;
                                                                    unsafe3 = unsafe5;
                                                                    i43 = i51;
                                                                    break;
                                                                }
                                                            }
                                                            a13 = a5;
                                                            bArr4 = bArr6;
                                                            i44 = i94;
                                                            i45 = i11;
                                                            iArr = iArr2;
                                                            c05 = c07;
                                                            objArr = objArr2;
                                                            unsafe3 = unsafe5;
                                                            i43 = i51;
                                                        } else {
                                                            abstractC2483y3.add(E.T(bArr6, i46, i104));
                                                            i46 += i104;
                                                            while (i46 < i11) {
                                                            }
                                                            a13 = a5;
                                                            bArr4 = bArr6;
                                                            i44 = i94;
                                                            i45 = i11;
                                                            iArr = iArr2;
                                                            c05 = c07;
                                                            objArr = objArr2;
                                                            unsafe3 = unsafe5;
                                                            i43 = i51;
                                                        }
                                                    } else {
                                                        throw C2437a0.d();
                                                    }
                                                } else {
                                                    throw C2437a0.b();
                                                }
                                            } else {
                                                a13 = a5;
                                                bArr4 = bArr6;
                                                i44 = i94;
                                                i45 = i11;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                unsafe3 = unsafe5;
                                                i43 = i51;
                                                i46 = i42;
                                                break;
                                            }
                                        case 30:
                                        case 44:
                                            i52 = i94;
                                            i53 = i11;
                                            a15 = a5;
                                            unsafe5 = unsafe6;
                                            i62 = i92;
                                            i42 = i66;
                                            if (i72 == 2) {
                                                i54 = M3.H.H0(bArr6, i42, abstractC2483y3, a15);
                                            } else {
                                                if (i72 == 0) {
                                                    i54 = M3.H.L0(i52, bArr, i42, i11, abstractC2483y3, a5);
                                                }
                                                a13 = a15;
                                                bArr4 = bArr6;
                                                i44 = i52;
                                                i45 = i53;
                                                i43 = i91;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                unsafe3 = unsafe5;
                                                i46 = i42;
                                                break;
                                            }
                                            U A11 = c2470r03.A(i62);
                                            Class cls = A0.f26825a;
                                            if (A11 != null) {
                                                int size3 = abstractC2483y3.size();
                                                Object obj4 = null;
                                                int i105 = 0;
                                                int i106 = 0;
                                                while (i105 < size3) {
                                                    Integer num = (Integer) abstractC2483y3.get(i105);
                                                    int i107 = i54;
                                                    int intValue = num.intValue();
                                                    if (A11.a(intValue)) {
                                                        if (i105 != i106) {
                                                            abstractC2483y3.set(i106, num);
                                                        }
                                                        i106++;
                                                        u10 = A11;
                                                        i57 = 1;
                                                        i56 = i91;
                                                    } else {
                                                        u10 = A11;
                                                        i56 = i91;
                                                        obj4 = A0.s(obj3, i56, intValue, obj4, c2470r03.f26968j);
                                                        i57 = 1;
                                                    }
                                                    i105 += i57;
                                                    i91 = i56;
                                                    i54 = i107;
                                                    A11 = u10;
                                                }
                                                i55 = i54;
                                                i51 = i91;
                                                if (i106 != size3) {
                                                    abstractC2483y3.subList(i106, size3).clear();
                                                }
                                            } else {
                                                i55 = i54;
                                                i51 = i91;
                                            }
                                            a13 = a15;
                                            bArr4 = bArr6;
                                            i44 = i52;
                                            i45 = i53;
                                            iArr = iArr2;
                                            i46 = i55;
                                            c05 = c07;
                                            objArr = objArr2;
                                            unsafe3 = unsafe5;
                                            i43 = i51;
                                            break;
                                        case 33:
                                        case 47:
                                            i52 = i94;
                                            i53 = i11;
                                            a15 = a5;
                                            unsafe5 = unsafe6;
                                            i62 = i92;
                                            i42 = i66;
                                            if (i72 == 2) {
                                                S s12 = (S) abstractC2483y3;
                                                i46 = M3.H.J0(bArr6, i42, a15);
                                                int i108 = a15.f26821a + i46;
                                                while (i46 < i108) {
                                                    i46 = M3.H.J0(bArr6, i46, a15);
                                                    s12.s(r.f.b0(a15.f26821a));
                                                }
                                                if (i46 != i108) {
                                                    throw C2437a0.d();
                                                }
                                            } else {
                                                if (i72 == 0) {
                                                    S s13 = (S) abstractC2483y3;
                                                    i46 = M3.H.J0(bArr6, i42, a15);
                                                    s13.s(r.f.b0(a15.f26821a));
                                                    while (i46 < i53) {
                                                        int J08 = M3.H.J0(bArr6, i46, a15);
                                                        if (i52 == a15.f26821a) {
                                                            i46 = M3.H.J0(bArr6, J08, a15);
                                                            s13.s(r.f.b0(a15.f26821a));
                                                        }
                                                    }
                                                }
                                                a13 = a15;
                                                bArr4 = bArr6;
                                                i44 = i52;
                                                i45 = i53;
                                                i43 = i91;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                unsafe3 = unsafe5;
                                                i46 = i42;
                                                break;
                                            }
                                            a13 = a15;
                                            bArr4 = bArr6;
                                            i44 = i52;
                                            i45 = i53;
                                            i43 = i91;
                                            iArr = iArr2;
                                            c05 = c07;
                                            objArr = objArr2;
                                            unsafe3 = unsafe5;
                                            break;
                                        case 34:
                                        case r9.y.f44626f /* 48 */:
                                            i52 = i94;
                                            i53 = i11;
                                            a15 = a5;
                                            unsafe5 = unsafe6;
                                            i62 = i92;
                                            i42 = i66;
                                            if (i72 == 2) {
                                                AbstractC2469q0.o(abstractC2483y3);
                                                i46 = M3.H.J0(bArr6, i42, a15);
                                                int i109 = a15.f26821a + i46;
                                                if (i46 >= i109) {
                                                    if (i46 != i109) {
                                                        throw C2437a0.d();
                                                    }
                                                    a13 = a15;
                                                    bArr4 = bArr6;
                                                    i44 = i52;
                                                    i45 = i53;
                                                    i43 = i91;
                                                    iArr = iArr2;
                                                    c05 = c07;
                                                    objArr = objArr2;
                                                    unsafe3 = unsafe5;
                                                    break;
                                                } else {
                                                    M3.H.M0(bArr6, i46, a15);
                                                    throw null;
                                                }
                                            } else {
                                                if (i72 == 0) {
                                                    AbstractC2469q0.o(abstractC2483y3);
                                                    M3.H.M0(bArr6, i42, a15);
                                                    throw null;
                                                }
                                                a13 = a15;
                                                bArr4 = bArr6;
                                                i44 = i52;
                                                i45 = i53;
                                                i43 = i91;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                unsafe3 = unsafe5;
                                                i46 = i42;
                                                break;
                                            }
                                        default:
                                            if (i72 == 3) {
                                                int i110 = (i94 & (-8)) | 4;
                                                AbstractC2486z0 B10 = c2470r03.B(i92);
                                                i53 = i11;
                                                Unsafe unsafe7 = unsafe6;
                                                i42 = i66;
                                                A a17 = a5;
                                                i46 = M3.H.F0(B10, bArr, i66, i11, i110, a17);
                                                int i111 = i92;
                                                abstractC2483y3.add(a17.f26823c);
                                                while (true) {
                                                    if (i46 < i53) {
                                                        int J09 = M3.H.J0(bArr6, i46, a17);
                                                        int i112 = i94;
                                                        if (i112 == a17.f26821a) {
                                                            A a18 = a17;
                                                            i46 = M3.H.F0(B10, bArr, J09, i11, i110, a5);
                                                            abstractC2483y3.add(a18.f26823c);
                                                            a17 = a18;
                                                            i111 = i111;
                                                            B10 = B10;
                                                            unsafe7 = unsafe7;
                                                            i94 = i112;
                                                        } else {
                                                            i62 = i111;
                                                            a15 = a17;
                                                            unsafe5 = unsafe7;
                                                            i52 = i112;
                                                        }
                                                    } else {
                                                        i62 = i111;
                                                        a15 = a17;
                                                        Unsafe unsafe8 = unsafe7;
                                                        i52 = i94;
                                                        unsafe5 = unsafe8;
                                                    }
                                                }
                                                a13 = a15;
                                                bArr4 = bArr6;
                                                i44 = i52;
                                                i45 = i53;
                                                i43 = i91;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                unsafe3 = unsafe5;
                                                break;
                                            } else {
                                                i62 = i92;
                                                i42 = i66;
                                                i45 = i11;
                                                a13 = a5;
                                                unsafe3 = unsafe6;
                                                bArr4 = bArr6;
                                                i44 = i94;
                                                i43 = i91;
                                                iArr = iArr2;
                                                c05 = c07;
                                                objArr = objArr2;
                                                i46 = i42;
                                                break;
                                            }
                                    }
                                    if (i46 != i42) {
                                        i59 = i12;
                                        bArr5 = bArr4;
                                        i60 = i46;
                                        a16 = a13;
                                        i58 = i45;
                                        i65 = i44;
                                        i61 = i43;
                                        i63 = i33;
                                        c2470r03 = this;
                                        obj3 = obj;
                                    } else {
                                        obj3 = obj;
                                        bArr2 = bArr4;
                                        i18 = i46;
                                        c02 = c05;
                                        i19 = i43;
                                        unsafe = unsafe3;
                                        i63 = i33;
                                        c2470r0 = this;
                                        i15 = i44;
                                        i13 = i12;
                                    }
                                } else {
                                    bArr3 = bArr6;
                                    i34 = i74;
                                    i35 = i91;
                                    iArr = iArr2;
                                    c04 = c07;
                                    objArr = objArr2;
                                    unsafe2 = unsafe6;
                                    i36 = i92;
                                    i37 = i66;
                                    a11 = a5;
                                    if (x10 == 50) {
                                        if (i72 == 2) {
                                            int i113 = i36 / 3;
                                            Object obj5 = objArr[i113 + i113];
                                            Object object = unsafe2.getObject(obj, j6);
                                            if (!((C2457k0) object).d()) {
                                                C2457k0 b14 = C2457k0.a().b();
                                                C2459l0.a(b14, object);
                                                unsafe2.putObject(obj, j6, b14);
                                            }
                                            AbstractC2469q0.p(obj5);
                                            throw null;
                                        }
                                        obj2 = obj;
                                        i13 = i12;
                                        c02 = c04;
                                        i62 = i36;
                                        obj3 = obj2;
                                        i19 = i35;
                                        i63 = i33;
                                        c2470r0 = this;
                                        bArr2 = bArr3;
                                        unsafe = unsafe2;
                                        i15 = i34;
                                        i18 = i37;
                                    } else {
                                        long j11 = iArr[i36 + 2] & 1048575;
                                        switch (x10) {
                                            case 51:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 1) {
                                                    i39 = i37 + 8;
                                                    unsafe.putObject(obj3, j6, Double.valueOf(Double.longBitsToDouble(M3.H.P0(i37, bArr2))));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 52:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 5) {
                                                    i39 = i37 + 4;
                                                    unsafe.putObject(obj3, j6, Float.valueOf(Float.intBitsToFloat(M3.H.E0(i37, bArr2))));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 53:
                                            case 54:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 0) {
                                                    i39 = M3.H.M0(bArr2, i37, a12);
                                                    unsafe.putObject(obj3, j6, Long.valueOf(a12.f26822b));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 55:
                                            case 62:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 0) {
                                                    i39 = M3.H.J0(bArr2, i37, a12);
                                                    unsafe.putObject(obj3, j6, Integer.valueOf(a12.f26821a));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 56:
                                            case 65:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 1) {
                                                    i39 = i37 + 8;
                                                    unsafe.putObject(obj3, j6, Long.valueOf(M3.H.P0(i37, bArr2)));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 57:
                                            case 64:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 5) {
                                                    i39 = i37 + 4;
                                                    unsafe.putObject(obj3, j6, Integer.valueOf(M3.H.E0(i37, bArr2)));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 58:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 0) {
                                                    i39 = M3.H.M0(bArr2, i37, a12);
                                                    if (a12.f26822b != 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    unsafe.putObject(obj3, j6, Boolean.valueOf(z12));
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = i39;
                                                    break;
                                                }
                                                i60 = i37;
                                                break;
                                            case 59:
                                                c02 = c04;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                if (i72 == 2) {
                                                    int J010 = M3.H.J0(bArr2, i37, a12);
                                                    int i114 = a12.f26821a;
                                                    if (i114 == 0) {
                                                        unsafe.putObject(obj3, j6, "");
                                                        i38 = i36;
                                                    } else {
                                                        i38 = i36;
                                                        int i115 = J010 + i114;
                                                        if ((i73 & 536870912) != 0 && !L0.d(bArr2, J010, i115)) {
                                                            throw C2437a0.a();
                                                        }
                                                        unsafe.putObject(obj3, j6, new String(bArr2, J010, i114, Y.f26890a));
                                                        J010 = i115;
                                                    }
                                                    unsafe.putInt(obj3, j11, i19);
                                                    i60 = J010;
                                                    break;
                                                } else {
                                                    i38 = i36;
                                                    i60 = i37;
                                                    break;
                                                }
                                            case 60:
                                                obj3 = obj;
                                                unsafe = unsafe2;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                i40 = i35;
                                                if (i72 == 2) {
                                                    Object D6 = D(i40, obj3, i36);
                                                    c02 = c04;
                                                    c2470r0 = this;
                                                    int O03 = M3.H.O0(D6, B(i36), bArr, i37, i11, a5);
                                                    c2470r0.m(i40, obj3, D6, i36);
                                                    i60 = O03;
                                                    i38 = i36;
                                                    i19 = i40;
                                                    a12 = a11;
                                                    break;
                                                } else {
                                                    c02 = c04;
                                                    c2470r0 = this;
                                                    i38 = i36;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    i60 = i37;
                                                    break;
                                                }
                                            case 61:
                                                c2470r02 = this;
                                                obj3 = obj;
                                                unsafe = unsafe2;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                i40 = i35;
                                                if (i72 == 2) {
                                                    C02 = M3.H.C0(bArr2, i37, a11);
                                                    unsafe.putObject(obj3, j6, a11.f26823c);
                                                    unsafe.putInt(obj3, j11, i40);
                                                    c02 = c04;
                                                    i38 = i36;
                                                    i60 = C02;
                                                    c2470r0 = c2470r02;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    break;
                                                } else {
                                                    c02 = c04;
                                                    i38 = i36;
                                                    c2470r0 = c2470r02;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    i60 = i37;
                                                    break;
                                                }
                                            case 63:
                                                c2470r02 = this;
                                                i41 = i34;
                                                obj3 = obj;
                                                i40 = i35;
                                                unsafe = unsafe2;
                                                bArr2 = bArr;
                                                if (i72 == 0) {
                                                    C02 = M3.H.J0(bArr2, i37, a11);
                                                    int i116 = a11.f26821a;
                                                    U A12 = c2470r02.A(i36);
                                                    if (A12 == null || A12.a(i116)) {
                                                        i15 = i41;
                                                        unsafe.putObject(obj3, j6, Integer.valueOf(i116));
                                                        unsafe.putInt(obj3, j11, i40);
                                                    } else {
                                                        Q q11 = (Q) obj3;
                                                        C0 c09 = q11.zzc;
                                                        if (c09 == c04) {
                                                            c09 = C0.b();
                                                            q11.zzc = c09;
                                                        }
                                                        i15 = i41;
                                                        c09.c(i15, Long.valueOf(i116));
                                                    }
                                                    c02 = c04;
                                                    i38 = i36;
                                                    i60 = C02;
                                                    c2470r0 = c2470r02;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    break;
                                                }
                                                c02 = c04;
                                                i38 = i36;
                                                c2470r0 = c2470r02;
                                                i15 = i41;
                                                a12 = a11;
                                                i19 = i40;
                                                i60 = i37;
                                                break;
                                            case 66:
                                                c2470r02 = this;
                                                i41 = i34;
                                                obj3 = obj;
                                                i40 = i35;
                                                unsafe = unsafe2;
                                                bArr2 = bArr;
                                                if (i72 == 0) {
                                                    J03 = M3.H.J0(bArr2, i37, a11);
                                                    unsafe.putObject(obj3, j6, Integer.valueOf(r.f.b0(a11.f26821a)));
                                                    unsafe.putInt(obj3, j11, i40);
                                                    c02 = c04;
                                                    i38 = i36;
                                                    i60 = J03;
                                                    c2470r0 = c2470r02;
                                                    i15 = i41;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    break;
                                                }
                                                c02 = c04;
                                                i38 = i36;
                                                c2470r0 = c2470r02;
                                                i15 = i41;
                                                a12 = a11;
                                                i19 = i40;
                                                i60 = i37;
                                                break;
                                            case 67:
                                                c2470r02 = this;
                                                i41 = i34;
                                                obj3 = obj;
                                                i40 = i35;
                                                unsafe = unsafe2;
                                                bArr2 = bArr;
                                                if (i72 == 0) {
                                                    J03 = M3.H.M0(bArr2, i37, a11);
                                                    unsafe.putObject(obj3, j6, Long.valueOf(r.f.c0(a11.f26822b)));
                                                    unsafe.putInt(obj3, j11, i40);
                                                    c02 = c04;
                                                    i38 = i36;
                                                    i60 = J03;
                                                    c2470r0 = c2470r02;
                                                    i15 = i41;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    break;
                                                }
                                                c02 = c04;
                                                i38 = i36;
                                                c2470r0 = c2470r02;
                                                i15 = i41;
                                                a12 = a11;
                                                i19 = i40;
                                                i60 = i37;
                                                break;
                                            case 68:
                                                if (i72 == 3) {
                                                    int i117 = (i34 & (-8)) | 4;
                                                    c2470r02 = this;
                                                    Object D10 = c2470r02.D(i35, obj, i36);
                                                    obj3 = obj;
                                                    i41 = i34;
                                                    i40 = i35;
                                                    unsafe = unsafe2;
                                                    i60 = M3.H.N0(D10, c2470r02.B(i36), bArr, i37, i11, i117, a5);
                                                    c2470r02.m(i40, obj3, D10, i36);
                                                    bArr2 = bArr;
                                                    c02 = c04;
                                                    i38 = i36;
                                                    c2470r0 = c2470r02;
                                                    i15 = i41;
                                                    a12 = a11;
                                                    i19 = i40;
                                                    break;
                                                } else {
                                                    obj3 = obj;
                                                    unsafe = unsafe2;
                                                    bArr2 = bArr;
                                                    c02 = c04;
                                                    i38 = i36;
                                                    i15 = i34;
                                                    a12 = a11;
                                                    i19 = i35;
                                                    c2470r0 = this;
                                                    i60 = i37;
                                                    break;
                                                }
                                            default:
                                                c02 = c04;
                                                i38 = i36;
                                                a12 = a11;
                                                obj3 = obj;
                                                i19 = i35;
                                                unsafe = unsafe2;
                                                c2470r0 = this;
                                                bArr2 = bArr;
                                                i15 = i34;
                                                i60 = i37;
                                                break;
                                        }
                                        if (i60 != i37) {
                                            i58 = i11;
                                            i61 = i19;
                                            a16 = a12;
                                            bArr5 = bArr2;
                                            c2470r03 = c2470r0;
                                            i65 = i15;
                                            i62 = i38;
                                            i63 = i33;
                                            i59 = i12;
                                        } else {
                                            i13 = i12;
                                            i18 = i60;
                                            i62 = i38;
                                            i63 = i33;
                                        }
                                    }
                                }
                            }
                            if (i15 != i13 && i13 != 0) {
                                i60 = i18;
                                i14 = i64;
                            } else {
                                Q q12 = (Q) obj3;
                                c03 = q12.zzc;
                                if (c03 == c02) {
                                    c03 = C0.b();
                                    q12.zzc = c03;
                                }
                                i60 = M3.H.I0(i15, bArr, i18, i11, c03, a5);
                                i58 = i11;
                                a16 = a5;
                                i59 = i13;
                                bArr5 = bArr2;
                                i65 = i15;
                                i61 = i19;
                                c2470r03 = c2470r0;
                            }
                        }
                    }
                    c2470r0 = c2470r03;
                    unsafe = unsafe6;
                    if (i15 != i13) {
                    }
                    Q q122 = (Q) obj3;
                    c03 = q122.zzc;
                    if (c03 == c02) {
                    }
                    i60 = M3.H.I0(i15, bArr, i18, i11, c03, a5);
                    i58 = i11;
                    a16 = a5;
                    i59 = i13;
                    bArr5 = bArr2;
                    i65 = i15;
                    i61 = i19;
                    c2470r03 = c2470r0;
                } else {
                    c2470r0 = c2470r03;
                    unsafe = unsafe6;
                    i13 = i59;
                    iArr = iArr2;
                    objArr = objArr2;
                    i14 = i64;
                    i15 = i65;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final int w(int i10, int i11) {
        int[] iArr = this.f26959a;
        int length = (iArr.length / 3) - 1;
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

    public final int y(int i10) {
        return this.f26959a[i10 + 1];
    }
}
