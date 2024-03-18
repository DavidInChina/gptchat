package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class P0 implements AbstractC2504f1 {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f27469q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    public static final Unsafe f27470r = C1.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f27471a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f27472b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27473c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27474d;

    /* renamed from: e  reason: collision with root package name */
    public final M0 f27475e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27476f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27477g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27478h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f27479i;

    /* renamed from: j  reason: collision with root package name */
    public final int f27480j;

    /* renamed from: k  reason: collision with root package name */
    public final int f27481k;

    /* renamed from: l  reason: collision with root package name */
    public final V0 f27482l;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC2552z0 f27483m;

    /* renamed from: n  reason: collision with root package name */
    public final w1 f27484n;

    /* renamed from: o  reason: collision with root package name */
    public final K f27485o;

    /* renamed from: p  reason: collision with root package name */
    public final H0 f27486p;

    public P0(int[] iArr, Object[] objArr, int i10, int i11, M0 m02, boolean z10, int[] iArr2, int i12, int i13, V0 v02, AbstractC2552z0 abstractC2552z0, w1 w1Var, K k10, H0 h02) {
        boolean z11;
        this.f27471a = iArr;
        this.f27472b = objArr;
        this.f27473c = i10;
        this.f27474d = i11;
        this.f27477g = m02 instanceof AbstractC2497d0;
        this.f27478h = z10;
        if (k10 != null && (m02 instanceof GeneratedMessageLite$ExtendableMessage)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27476f = z11;
        this.f27479i = iArr2;
        this.f27480j = i12;
        this.f27481k = i13;
        this.f27482l = v02;
        this.f27483m = abstractC2552z0;
        this.f27484n = w1Var;
        this.f27485o = k10;
        this.f27475e = m02;
        this.f27486p = h02;
    }

    public static P0 E(J0 j02, V0 v02, AbstractC2552z0 abstractC2552z0, w1 w1Var, K k10, H0 h02) {
        if (j02 instanceof C2501e1) {
            return F((C2501e1) j02, v02, abstractC2552z0, w1Var, k10, h02);
        }
        AbstractC2469q0.p(j02);
        throw null;
    }

    public static P0 F(C2501e1 c2501e1, V0 v02, AbstractC2552z0 abstractC2552z0, w1 w1Var, K k10, H0 h02) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
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
        int i24;
        int i25;
        int i26;
        int i27;
        java.lang.reflect.Field field;
        char charAt;
        int i28;
        int i29;
        int i30;
        java.lang.reflect.Field S;
        java.lang.reflect.Field field2;
        int i31;
        char charAt2;
        int i32;
        char charAt3;
        int i33;
        char charAt4;
        int i34;
        char charAt5;
        int i35;
        char charAt6;
        int i36;
        char charAt7;
        int i37;
        char charAt8;
        int i38;
        char charAt9;
        int i39;
        char charAt10;
        int i40;
        char charAt11;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43 = 0;
        if (c2501e1.d() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String c10 = c2501e1.c();
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
                i42 = i45 + 1;
                charAt13 = c10.charAt(i45);
                if (charAt13 < '\ud800') {
                    break;
                }
                i46 |= (charAt13 & '\u1fff') << i47;
                i47 += 13;
                i45 = i42;
            }
            charAt14 = i46 | (charAt13 << i47);
            i45 = i42;
        }
        if (charAt14 == 0) {
            i15 = 0;
            i14 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            iArr = f27469q;
            i16 = 0;
        } else {
            int i48 = i45 + 1;
            int charAt15 = c10.charAt(i45);
            if (charAt15 >= 55296) {
                int i49 = charAt15 & 8191;
                int i50 = 13;
                while (true) {
                    i41 = i48 + 1;
                    charAt12 = c10.charAt(i48);
                    if (charAt12 < '\ud800') {
                        break;
                    }
                    i49 |= (charAt12 & '\u1fff') << i50;
                    i50 += 13;
                    i48 = i41;
                }
                charAt15 = i49 | (charAt12 << i50);
                i48 = i41;
            }
            int i51 = i48 + 1;
            int charAt16 = c10.charAt(i48);
            if (charAt16 >= 55296) {
                int i52 = charAt16 & 8191;
                int i53 = 13;
                while (true) {
                    i40 = i51 + 1;
                    charAt11 = c10.charAt(i51);
                    if (charAt11 < '\ud800') {
                        break;
                    }
                    i52 |= (charAt11 & '\u1fff') << i53;
                    i53 += 13;
                    i51 = i40;
                }
                charAt16 = i52 | (charAt11 << i53);
                i51 = i40;
            }
            int i54 = i51 + 1;
            int charAt17 = c10.charAt(i51);
            if (charAt17 >= 55296) {
                int i55 = charAt17 & 8191;
                int i56 = 13;
                while (true) {
                    i39 = i54 + 1;
                    charAt10 = c10.charAt(i54);
                    if (charAt10 < '\ud800') {
                        break;
                    }
                    i55 |= (charAt10 & '\u1fff') << i56;
                    i56 += 13;
                    i54 = i39;
                }
                charAt17 = i55 | (charAt10 << i56);
                i54 = i39;
            }
            int i57 = i54 + 1;
            i14 = c10.charAt(i54);
            if (i14 >= 55296) {
                int i58 = i14 & 8191;
                int i59 = 13;
                while (true) {
                    i38 = i57 + 1;
                    charAt9 = c10.charAt(i57);
                    if (charAt9 < '\ud800') {
                        break;
                    }
                    i58 |= (charAt9 & '\u1fff') << i59;
                    i59 += 13;
                    i57 = i38;
                }
                i14 = i58 | (charAt9 << i59);
                i57 = i38;
            }
            int i60 = i57 + 1;
            int charAt18 = c10.charAt(i57);
            if (charAt18 >= 55296) {
                int i61 = charAt18 & 8191;
                int i62 = 13;
                while (true) {
                    i37 = i60 + 1;
                    charAt8 = c10.charAt(i60);
                    if (charAt8 < '\ud800') {
                        break;
                    }
                    i61 |= (charAt8 & '\u1fff') << i62;
                    i62 += 13;
                    i60 = i37;
                }
                charAt18 = i61 | (charAt8 << i62);
                i60 = i37;
            }
            int i63 = i60 + 1;
            i13 = c10.charAt(i60);
            if (i13 >= 55296) {
                int i64 = i13 & 8191;
                int i65 = 13;
                while (true) {
                    i36 = i63 + 1;
                    charAt7 = c10.charAt(i63);
                    if (charAt7 < '\ud800') {
                        break;
                    }
                    i64 |= (charAt7 & '\u1fff') << i65;
                    i65 += 13;
                    i63 = i36;
                }
                i13 = i64 | (charAt7 << i65);
                i63 = i36;
            }
            int i66 = i63 + 1;
            int charAt19 = c10.charAt(i63);
            if (charAt19 >= 55296) {
                int i67 = charAt19 & 8191;
                int i68 = 13;
                while (true) {
                    i35 = i66 + 1;
                    charAt6 = c10.charAt(i66);
                    if (charAt6 < '\ud800') {
                        break;
                    }
                    i67 |= (charAt6 & '\u1fff') << i68;
                    i68 += 13;
                    i66 = i35;
                }
                charAt19 = i67 | (charAt6 << i68);
                i66 = i35;
            }
            int i69 = i66 + 1;
            i11 = c10.charAt(i66);
            if (i11 >= 55296) {
                int i70 = i11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i34 = i71 + 1;
                    charAt5 = c10.charAt(i71);
                    if (charAt5 < '\ud800') {
                        break;
                    }
                    i70 |= (charAt5 & '\u1fff') << i72;
                    i72 += 13;
                    i71 = i34;
                }
                i11 = i70 | (charAt5 << i72);
                i69 = i34;
            }
            i12 = (charAt15 * 2) + charAt16;
            i16 = charAt17;
            i15 = charAt18;
            iArr = new int[i11 + i13 + charAt19];
            i43 = charAt15;
            i45 = i69;
        }
        Object[] b10 = c2501e1.b();
        Class<?> cls = c2501e1.a().getClass();
        int[] iArr2 = new int[i15 * 3];
        Object[] objArr = new Object[i15 * 2];
        int i73 = i13 + i11;
        int i74 = i73;
        int i75 = i11;
        int i76 = 0;
        int i77 = 0;
        while (i45 < length) {
            int i78 = i45 + 1;
            int charAt20 = c10.charAt(i45);
            if (charAt20 >= c11) {
                int i79 = charAt20 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i33 = i80 + 1;
                    charAt4 = c10.charAt(i80);
                    if (charAt4 < c11) {
                        break;
                    }
                    i79 |= (charAt4 & '\u1fff') << i81;
                    i81 += 13;
                    i80 = i33;
                }
                charAt20 = i79 | (charAt4 << i81);
                i17 = i33;
            } else {
                i17 = i78;
            }
            int i82 = i17 + 1;
            int charAt21 = c10.charAt(i17);
            if (charAt21 >= c11) {
                int i83 = charAt21 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i32 = i84 + 1;
                    charAt3 = c10.charAt(i84);
                    i18 = length;
                    if (charAt3 < '\ud800') {
                        break;
                    }
                    i83 |= (charAt3 & '\u1fff') << i85;
                    i85 += 13;
                    i84 = i32;
                    length = i18;
                }
                charAt21 = i83 | (charAt3 << i85);
                i19 = i32;
            } else {
                i18 = length;
                i19 = i82;
            }
            int i86 = charAt21 & 255;
            int i87 = i73;
            if ((charAt21 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            Unsafe unsafe = f27470r;
            int i88 = i11;
            if (i86 >= 51) {
                int i89 = i19 + 1;
                int charAt22 = c10.charAt(i19);
                if (charAt22 >= 55296) {
                    int i90 = charAt22 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i31 = i91 + 1;
                        charAt2 = c10.charAt(i91);
                        i20 = i14;
                        if (charAt2 < '\ud800') {
                            break;
                        }
                        i90 |= (charAt2 & '\u1fff') << i92;
                        i92 += 13;
                        i91 = i31;
                        i14 = i20;
                    }
                    charAt22 = i90 | (charAt2 << i92);
                    i29 = i31;
                } else {
                    i20 = i14;
                    i29 = i89;
                }
                int i93 = i86 - 51;
                int i94 = i29;
                if (i93 != 9 && i93 != 17) {
                    if (i93 == 12 && !z10) {
                        objArr[((i77 / 3) * 2) + 1] = b10[i12];
                        i12++;
                    }
                    i30 = 2;
                } else {
                    i30 = 2;
                    objArr[((i77 / 3) * 2) + 1] = b10[i12];
                    i12++;
                }
                int i95 = charAt22 * i30;
                Object obj = b10[i95];
                if (obj instanceof java.lang.reflect.Field) {
                    S = (java.lang.reflect.Field) obj;
                } else {
                    S = S(cls, (String) obj);
                    b10[i95] = S;
                }
                int i96 = i12;
                i24 = (int) unsafe.objectFieldOffset(S);
                int i97 = i95 + 1;
                Object obj2 = b10[i97];
                if (obj2 instanceof java.lang.reflect.Field) {
                    field2 = (java.lang.reflect.Field) obj2;
                } else {
                    field2 = S(cls, (String) obj2);
                    b10[i97] = field2;
                }
                i23 = (int) unsafe.objectFieldOffset(field2);
                i12 = i96;
                i25 = 0;
                i21 = i94;
                i22 = i16;
            } else {
                i20 = i14;
                int i98 = i12 + 1;
                java.lang.reflect.Field S10 = S(cls, (String) b10[i12]);
                i22 = i16;
                if (i86 != 9 && i86 != 17) {
                    if (i86 != 27 && i86 != 49) {
                        if (i86 != 12 && i86 != 30 && i86 != 44) {
                            if (i86 == 50) {
                                int i99 = i75 + 1;
                                iArr[i75] = i77;
                                int i100 = (i77 / 3) * 2;
                                int i101 = i12 + 2;
                                objArr[i100] = b10[i98];
                                if ((charAt21 & 2048) != 0) {
                                    i98 = i12 + 3;
                                    objArr[i100 + 1] = b10[i101];
                                    i75 = i99;
                                } else {
                                    i75 = i99;
                                    i98 = i101;
                                }
                            }
                        } else if (!z10) {
                            i28 = i12 + 2;
                            objArr[((i77 / 3) * 2) + 1] = b10[i98];
                        }
                    } else {
                        i28 = i12 + 2;
                        objArr[((i77 / 3) * 2) + 1] = b10[i98];
                    }
                    i98 = i28;
                } else {
                    objArr[((i77 / 3) * 2) + 1] = S10.getType();
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(S10);
                if ((charAt21 & 4096) == 4096 && i86 <= 17) {
                    int i102 = i19 + 1;
                    int charAt23 = c10.charAt(i19);
                    if (charAt23 >= 55296) {
                        int i103 = charAt23 & 8191;
                        int i104 = 13;
                        while (true) {
                            i21 = i102 + 1;
                            charAt = c10.charAt(i102);
                            if (charAt < '\ud800') {
                                break;
                            }
                            i103 |= (charAt & '\u1fff') << i104;
                            i104 += 13;
                            i102 = i21;
                        }
                        charAt23 = i103 | (charAt << i104);
                    } else {
                        i21 = i102;
                    }
                    int i105 = (charAt23 / 32) + (i43 * 2);
                    Object obj3 = b10[i105];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        field = (java.lang.reflect.Field) obj3;
                    } else {
                        field = S(cls, (String) obj3);
                        b10[i105] = field;
                    }
                    i23 = (int) unsafe.objectFieldOffset(field);
                    i25 = charAt23 % 32;
                } else {
                    i23 = 1048575;
                    i21 = i19;
                    i25 = 0;
                }
                if (i86 >= 18 && i86 <= 49) {
                    iArr[i74] = objectFieldOffset;
                    i74++;
                }
                i12 = i98;
                i24 = objectFieldOffset;
            }
            int i106 = i77 + 1;
            iArr2[i77] = charAt20;
            int i107 = i77 + 2;
            if ((charAt21 & 512) != 0) {
                i26 = 536870912;
            } else {
                i26 = 0;
            }
            if ((charAt21 & 256) != 0) {
                i27 = 268435456;
            } else {
                i27 = 0;
            }
            iArr2[i106] = i27 | i26 | (i86 << 20) | i24;
            i77 += 3;
            iArr2[i107] = (i25 << 20) | i23;
            i73 = i87;
            i16 = i22;
            length = i18;
            i45 = i21;
            i11 = i88;
            i14 = i20;
            c11 = '\ud800';
        }
        return new P0(iArr2, objArr, i16, i14, c2501e1.a(), z10, iArr, i11, i73, v02, abstractC2552z0, w1Var, k10, h02);
    }

    public static long G(int i10) {
        return i10 & 1048575;
    }

    public static int H(long j6, Object obj) {
        return ((Integer) C1.f27385c.k(j6, obj)).intValue();
    }

    public static long I(long j6, Object obj) {
        return ((Long) C1.f27385c.k(j6, obj)).longValue();
    }

    public static java.lang.reflect.Field S(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
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

    public static int Y(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void c0(int i10, Object obj, S4.o oVar) {
        if (obj instanceof String) {
            ((AbstractC2549y) oVar.f16184Z).K0(i10, (String) obj);
            return;
        }
        oVar.r(i10, (AbstractC2534q) obj);
    }

    public static void l(Object obj) {
        if (v(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i10, int i11, N1 n12, Class cls, com.google.android.gms.internal.play_billing.A a5) {
        boolean z10;
        switch (n12.ordinal()) {
            case 0:
                a5.f26823c = Double.valueOf(AbstractC2508h.h(i10, bArr));
                return i10 + 8;
            case 1:
                a5.f26823c = Float.valueOf(AbstractC2508h.o(i10, bArr));
                return i10 + 4;
            case 2:
            case 3:
                int N10 = AbstractC2508h.N(bArr, i10, a5);
                a5.f26823c = Long.valueOf(a5.f26822b);
                return N10;
            case 4:
            case 12:
            case 13:
                int L10 = AbstractC2508h.L(bArr, i10, a5);
                a5.f26823c = Integer.valueOf(a5.f26821a);
                return L10;
            case 5:
            case 15:
                a5.f26823c = Long.valueOf(AbstractC2508h.m(i10, bArr));
                return i10 + 8;
            case 6:
            case 14:
                a5.f26823c = Integer.valueOf(AbstractC2508h.k(i10, bArr));
                return i10 + 4;
            case 7:
                int N11 = AbstractC2508h.N(bArr, i10, a5);
                if (a5.f26822b != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a5.f26823c = Boolean.valueOf(z10);
                return N11;
            case 8:
                return AbstractC2508h.H(bArr, i10, a5);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return AbstractC2508h.r(C2495c1.f27531c.a(cls), bArr, i10, i11, a5);
            case 11:
                return AbstractC2508h.f(bArr, i10, a5);
            case 16:
                int L11 = AbstractC2508h.L(bArr, i10, a5);
                a5.f26823c = Integer.valueOf(AbstractC2543v.c(a5.f26821a));
                return L11;
            case 17:
                int N12 = AbstractC2508h.N(bArr, i10, a5);
                a5.f26823c = Long.valueOf(AbstractC2543v.d(a5.f26822b));
                return N12;
        }
    }

    public static v1 r(Object obj) {
        AbstractC2497d0 abstractC2497d0 = (AbstractC2497d0) obj;
        v1 v1Var = abstractC2497d0.unknownFields;
        if (v1Var == v1.f27627f) {
            v1 v1Var2 = new v1();
            abstractC2497d0.unknownFields = v1Var2;
            return v1Var2;
        }
        return v1Var;
    }

    public static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2497d0) {
            return ((AbstractC2497d0) obj).isMutable();
        }
        return true;
    }

    public static List x(long j6, Object obj) {
        return (List) C1.f27385c.k(j6, obj);
    }

    public final void A(Object obj, int i10, Object obj2) {
        if (!u(i10, obj2)) {
            return;
        }
        long Z10 = Z(i10) & 1048575;
        Unsafe unsafe = f27470r;
        Object object = unsafe.getObject(obj2, Z10);
        if (object != null) {
            AbstractC2504f1 q10 = q(i10);
            if (!u(i10, obj)) {
                if (!v(object)) {
                    unsafe.putObject(obj, Z10, object);
                } else {
                    AbstractC2497d0 g10 = q10.g();
                    q10.c(g10, object);
                    unsafe.putObject(obj, Z10, g10);
                }
                T(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, Z10);
            if (!v(object2)) {
                AbstractC2497d0 g11 = q10.g();
                q10.c(g11, object2);
                unsafe.putObject(obj, Z10, g11);
                object2 = g11;
            }
            q10.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f27471a[i10] + " is present but null: " + obj2);
    }

    public final void B(Object obj, int i10, Object obj2) {
        int[] iArr;
        int i11 = this.f27471a[i10];
        if (!w(i11, obj2, i10)) {
            return;
        }
        long Z10 = Z(i10) & 1048575;
        Unsafe unsafe = f27470r;
        Object object = unsafe.getObject(obj2, Z10);
        if (object != null) {
            AbstractC2504f1 q10 = q(i10);
            if (!w(i11, obj, i10)) {
                if (!v(object)) {
                    unsafe.putObject(obj, Z10, object);
                } else {
                    AbstractC2497d0 g10 = q10.g();
                    q10.c(g10, object);
                    unsafe.putObject(obj, Z10, g10);
                }
                U(i11, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, Z10);
            if (!v(object2)) {
                AbstractC2497d0 g11 = q10.g();
                q10.c(g11, object2);
                unsafe.putObject(obj, Z10, g11);
                object2 = g11;
            }
            q10.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
    }

    public final Object C(int i10, Object obj) {
        AbstractC2504f1 q10 = q(i10);
        long Z10 = Z(i10) & 1048575;
        if (!u(i10, obj)) {
            return q10.g();
        }
        Object object = f27470r.getObject(obj, Z10);
        if (v(object)) {
            return object;
        }
        AbstractC2497d0 g10 = q10.g();
        if (object != null) {
            q10.c(g10, object);
        }
        return g10;
    }

    public final Object D(int i10, Object obj, int i11) {
        AbstractC2504f1 q10 = q(i11);
        if (!w(i10, obj, i11)) {
            return q10.g();
        }
        Object object = f27470r.getObject(obj, Z(i11) & 1048575);
        if (v(object)) {
            return object;
        }
        AbstractC2497d0 g10 = q10.g();
        if (object != null) {
            q10.c(g10, object);
        }
        return g10;
    }

    public final int J(Object obj, byte[] bArr, int i10, int i11, int i12, long j6, com.google.android.gms.internal.play_billing.A a5) {
        Object p10 = p(i12);
        Unsafe unsafe = f27470r;
        Object object = unsafe.getObject(obj, j6);
        this.f27486p.getClass();
        if (H0.d(object)) {
            G0 f6 = H0.f();
            H0.e(f6, object);
            unsafe.putObject(obj, j6, f6);
            object = f6;
        }
        U3.i a10 = H0.a(p10);
        G0 b10 = H0.b(object);
        int L10 = AbstractC2508h.L(bArr, i10, a5);
        int i13 = a5.f26821a;
        if (i13 >= 0 && i13 <= i11 - L10) {
            int i14 = i13 + L10;
            Object obj2 = a10.f17415Z;
            Object obj3 = a10.f17417i0;
            while (L10 < i14) {
                int i15 = L10 + 1;
                int i16 = bArr[L10];
                if (i16 < 0) {
                    i15 = AbstractC2508h.K(i16, bArr, i15, a5);
                    i16 = a5.f26821a;
                }
                int i17 = i15;
                int i18 = i16 >>> 3;
                int i19 = i16 & 7;
                if (i18 != 1) {
                    if (i18 == 2) {
                        N1 n12 = (N1) a10.f17416h0;
                        if (i19 == n12.f27434Z) {
                            L10 = m(bArr, i17, i11, n12, a10.f17417i0.getClass(), a5);
                            obj3 = a5.f26823c;
                        }
                    }
                    L10 = AbstractC2508h.U(i16, bArr, i17, i11, a5);
                } else {
                    N1 n13 = (N1) a10.f17414Y;
                    if (i19 == n13.f27434Z) {
                        L10 = m(bArr, i17, i11, n13, null, a5);
                        obj2 = a5.f26823c;
                    } else {
                        L10 = AbstractC2508h.U(i16, bArr, i17, i11, a5);
                    }
                }
            }
            if (L10 == i14) {
                b10.put(obj2, obj3);
                return i14;
            }
            throw C2540t0.f();
        }
        throw C2540t0.g();
    }

    public final int K(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j6, int i17, com.google.android.gms.internal.play_billing.A a5) {
        long j10 = this.f27471a[i17 + 2] & 1048575;
        boolean z10 = true;
        Unsafe unsafe = f27470r;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j6, Double.valueOf(AbstractC2508h.h(i10, bArr)));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j10, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j6, Float.valueOf(AbstractC2508h.o(i10, bArr)));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j10, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int N10 = AbstractC2508h.N(bArr, i10, a5);
                    unsafe.putObject(obj, j6, Long.valueOf(a5.f26822b));
                    unsafe.putInt(obj, j10, i13);
                    return N10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int L10 = AbstractC2508h.L(bArr, i10, a5);
                    unsafe.putObject(obj, j6, Integer.valueOf(a5.f26821a));
                    unsafe.putInt(obj, j10, i13);
                    return L10;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j6, Long.valueOf(AbstractC2508h.m(i10, bArr)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j10, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j6, Integer.valueOf(AbstractC2508h.k(i10, bArr)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j10, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int N11 = AbstractC2508h.N(bArr, i10, a5);
                    if (a5.f26822b == 0) {
                        z10 = false;
                    }
                    unsafe.putObject(obj, j6, Boolean.valueOf(z10));
                    unsafe.putInt(obj, j10, i13);
                    return N11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int L11 = AbstractC2508h.L(bArr, i10, a5);
                    int i22 = a5.f26821a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j6, "");
                    } else if ((i15 & 536870912) != 0 && !F1.e(bArr, L11, L11 + i22)) {
                        throw C2540t0.b();
                    } else {
                        unsafe.putObject(obj, j6, new String(bArr, L11, i22, AbstractC2536r0.f27584a));
                        L11 += i22;
                    }
                    unsafe.putInt(obj, j10, i13);
                    return L11;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object D6 = D(i13, obj, i17);
                    int S = AbstractC2508h.S(D6, q(i17), bArr, i10, i11, a5);
                    X(i13, obj, D6, i17);
                    return S;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int f6 = AbstractC2508h.f(bArr, i10, a5);
                    unsafe.putObject(obj, j6, a5.f26823c);
                    unsafe.putInt(obj, j10, i13);
                    return f6;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int L12 = AbstractC2508h.L(bArr, i10, a5);
                    int i23 = a5.f26821a;
                    o(i17);
                    unsafe.putObject(obj, j6, Integer.valueOf(i23));
                    unsafe.putInt(obj, j10, i13);
                    return L12;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int L13 = AbstractC2508h.L(bArr, i10, a5);
                    unsafe.putObject(obj, j6, Integer.valueOf(AbstractC2543v.c(a5.f26821a)));
                    unsafe.putInt(obj, j10, i13);
                    return L13;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int N12 = AbstractC2508h.N(bArr, i10, a5);
                    unsafe.putObject(obj, j6, Long.valueOf(AbstractC2543v.d(a5.f26822b)));
                    unsafe.putInt(obj, j10, i13);
                    return N12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object D10 = D(i13, obj, i17);
                    int R10 = AbstractC2508h.R(D10, q(i17), bArr, i10, i11, (i12 & (-8)) | 4, a5);
                    X(i13, obj, D10, i17);
                    return R10;
                }
                break;
        }
        return i10;
    }

    public final int L(Object obj, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.A a5) {
        Unsafe unsafe;
        int i13;
        P0 p02;
        Object obj2;
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
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int N10;
        int i32;
        int i33;
        int i34;
        int i35;
        P0 p03 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i36 = i11;
        int i37 = i12;
        com.google.android.gms.internal.play_billing.A a10 = a5;
        l(obj);
        int i38 = i10;
        int i39 = -1;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 1048575;
        while (true) {
            Unsafe unsafe2 = f27470r;
            if (i38 < i36) {
                int i44 = i38 + 1;
                byte b10 = bArr2[i38];
                if (b10 < 0) {
                    i15 = AbstractC2508h.K(b10, bArr2, i44, a10);
                    i14 = a10.f26821a;
                } else {
                    i14 = b10;
                    i15 = i44;
                }
                int i45 = i14 >>> 3;
                int i46 = i14 & 7;
                int i47 = p03.f27474d;
                int i48 = i15;
                int i49 = p03.f27473c;
                int i50 = i14;
                if (i45 > i39) {
                    int i51 = i40 / 3;
                    if (i45 >= i49 && i45 <= i47) {
                        i35 = p03.V(i45, i51);
                    } else {
                        i35 = -1;
                    }
                    i17 = i35;
                    i18 = -1;
                    i16 = 0;
                } else {
                    if (i45 >= i49 && i45 <= i47) {
                        i16 = 0;
                        i34 = p03.V(i45, 0);
                    } else {
                        i16 = 0;
                        i34 = -1;
                    }
                    i17 = i34;
                    i18 = -1;
                }
                if (i17 == i18) {
                    i19 = i48;
                    unsafe = unsafe2;
                    i20 = i42;
                    i21 = i45;
                    i22 = i16;
                    i23 = i37;
                    i24 = i50;
                    i25 = i43;
                } else {
                    int[] iArr = p03.f27471a;
                    int i52 = iArr[i17 + 1];
                    int Y7 = Y(i52);
                    long j6 = i52 & 1048575;
                    if (Y7 <= 17) {
                        int i53 = iArr[i17 + 2];
                        boolean z10 = true;
                        int i54 = 1 << (i53 >>> 20);
                        int i55 = i53 & 1048575;
                        if (i55 != i43) {
                            if (i43 != 1048575) {
                                unsafe2.putInt(obj3, i43, i42);
                            }
                            i26 = i55;
                            i27 = unsafe2.getInt(obj3, i55);
                        } else {
                            i27 = i42;
                            i26 = i43;
                        }
                        switch (Y7) {
                            case 0:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 1) {
                                    C1.r(obj3, j6, AbstractC2508h.h(i31, bArr2));
                                    i38 = i31 + 8;
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 1:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 5) {
                                    C1.s(obj3, j6, AbstractC2508h.o(i31, bArr2));
                                    i38 = i31 + 4;
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 2:
                            case 3:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    N10 = AbstractC2508h.N(bArr2, i31, a10);
                                    unsafe2.putLong(obj, j6, a10.f26822b);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i38 = N10;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 4:
                            case 11:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    i38 = AbstractC2508h.L(bArr2, i31, a10);
                                    unsafe2.putInt(obj3, j6, a10.f26821a);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 5:
                            case 14:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 1) {
                                    unsafe2.putLong(obj, j6, AbstractC2508h.m(i31, bArr2));
                                    i38 = i31 + 8;
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 6:
                            case 13:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 5) {
                                    unsafe2.putInt(obj3, j6, AbstractC2508h.k(i31, bArr2));
                                    i38 = i31 + 4;
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 7:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    int N11 = AbstractC2508h.N(bArr2, i31, a10);
                                    if (a10.f26822b == 0) {
                                        z10 = false;
                                    }
                                    C1.n(obj3, j6, z10);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i38 = N11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 8:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 2) {
                                    if ((i52 & 536870912) == 0) {
                                        i38 = AbstractC2508h.E(bArr2, i31, a10);
                                    } else {
                                        i38 = AbstractC2508h.H(bArr2, i31, a10);
                                    }
                                    unsafe2.putObject(obj3, j6, a10.f26823c);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 9:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 2) {
                                    Object C10 = p03.C(i30, obj3);
                                    i38 = AbstractC2508h.S(C10, p03.q(i30), bArr, i31, i11, a5);
                                    p03.W(obj3, i30, C10);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 10:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 2) {
                                    i38 = AbstractC2508h.f(bArr2, i31, a10);
                                    unsafe2.putObject(obj3, j6, a10.f26823c);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 12:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    i38 = AbstractC2508h.L(bArr2, i31, a10);
                                    int i56 = a10.f26821a;
                                    p03.o(i30);
                                    unsafe2.putInt(obj3, j6, i56);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 15:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    i38 = AbstractC2508h.L(bArr2, i31, a10);
                                    unsafe2.putInt(obj3, j6, AbstractC2543v.c(a10.f26821a));
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 16:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                if (i46 == 0) {
                                    N10 = AbstractC2508h.N(bArr2, i31, a10);
                                    unsafe2.putLong(obj, j6, AbstractC2543v.d(a10.f26822b));
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i38 = N10;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                } else {
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                }
                            case 17:
                                if (i46 != 3) {
                                    i31 = i48;
                                    i29 = i26;
                                    i28 = i50;
                                    i30 = i17;
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i19 = i31;
                                    i21 = i45;
                                    i22 = i30;
                                    i25 = i29;
                                    i24 = i28;
                                    i20 = i27;
                                    break;
                                } else {
                                    Object C11 = p03.C(i17, obj3);
                                    i28 = i50;
                                    i29 = i26;
                                    i30 = i17;
                                    i38 = AbstractC2508h.R(C11, p03.q(i17), bArr, i48, i11, (i45 << 3) | 4, a5);
                                    p03.W(obj3, i30, C11);
                                    i42 = i27 | i54;
                                    i41 = i28;
                                    i36 = i11;
                                    i39 = i45;
                                    i40 = i30;
                                    i43 = i29;
                                    i37 = i12;
                                }
                            default:
                                i31 = i48;
                                i29 = i26;
                                i28 = i50;
                                i30 = i17;
                                i23 = i12;
                                unsafe = unsafe2;
                                i19 = i31;
                                i21 = i45;
                                i22 = i30;
                                i25 = i29;
                                i24 = i28;
                                i20 = i27;
                                break;
                        }
                    } else {
                        int i57 = i17;
                        if (Y7 == 27) {
                            if (i46 == 2) {
                                AbstractC2496d abstractC2496d = (AbstractC2496d) ((AbstractC2535q0) unsafe2.getObject(obj3, j6));
                                boolean r10 = abstractC2496d.r();
                                AbstractC2535q0 abstractC2535q0 = abstractC2496d;
                                if (!r10) {
                                    int size = abstractC2496d.size();
                                    if (size == 0) {
                                        i32 = 10;
                                    } else {
                                        i32 = size * 2;
                                    }
                                    AbstractC2535q0 h10 = abstractC2496d.h(i32);
                                    unsafe2.putObject(obj3, j6, h10);
                                    abstractC2535q0 = h10;
                                }
                                i38 = AbstractC2508h.s(p03.q(i57), i50, bArr, i48, i11, abstractC2535q0, a5);
                                i41 = i50;
                                i36 = i11;
                                i39 = i45;
                                i40 = i57;
                                i42 = i42;
                                i43 = i43;
                                i37 = i12;
                            } else {
                                i20 = i42;
                                i25 = i43;
                                i23 = i12;
                                unsafe = unsafe2;
                                i21 = i45;
                                i33 = i48;
                                i22 = i57;
                            }
                        } else {
                            i20 = i42;
                            i25 = i43;
                            if (Y7 <= 49) {
                                unsafe = unsafe2;
                                i21 = i45;
                                i23 = i12;
                                i22 = i57;
                                i38 = N(obj, bArr, i48, i11, i50, i46, i57, i52, Y7, j6, a5);
                                if (i38 != i48) {
                                    p03 = this;
                                    bArr2 = bArr;
                                    i41 = i50;
                                    i36 = i11;
                                    a10 = a5;
                                    i37 = i23;
                                    i39 = i21;
                                    i42 = i20;
                                    i43 = i25;
                                    i40 = i22;
                                    obj3 = obj;
                                } else {
                                    i24 = i50;
                                    i19 = i38;
                                }
                            } else {
                                i23 = i12;
                                unsafe = unsafe2;
                                i21 = i45;
                                i33 = i48;
                                i22 = i57;
                                if (Y7 == 50) {
                                    if (i46 == 2) {
                                        i38 = J(obj, bArr, i33, i11, i22, j6, a5);
                                        if (i38 != i33) {
                                            p03 = this;
                                            bArr2 = bArr;
                                            i41 = i50;
                                            i36 = i11;
                                            a10 = a5;
                                            i37 = i23;
                                            i39 = i21;
                                            i42 = i20;
                                            i43 = i25;
                                            i40 = i22;
                                            obj3 = obj;
                                        } else {
                                            i24 = i50;
                                            i19 = i38;
                                        }
                                    }
                                } else {
                                    i38 = K(obj, bArr, i33, i11, i50, i21, i46, i52, Y7, j6, i22, a5);
                                    if (i38 != i33) {
                                        p03 = this;
                                        bArr2 = bArr;
                                        i41 = i50;
                                        i36 = i11;
                                        a10 = a5;
                                        i37 = i23;
                                        i39 = i21;
                                        i42 = i20;
                                        i43 = i25;
                                        i40 = i22;
                                        obj3 = obj;
                                    } else {
                                        i24 = i50;
                                        i19 = i38;
                                    }
                                }
                            }
                        }
                        i24 = i50;
                        i19 = i33;
                    }
                }
                if (i24 == i23 && i23 != 0) {
                    p02 = this;
                    i38 = i19;
                    i41 = i24;
                    i13 = i23;
                    i42 = i20;
                    i43 = i25;
                } else {
                    int i58 = i23;
                    if (this.f27476f && ((J) a5.f26824d) != J.b()) {
                        i38 = AbstractC2508h.j(i24, bArr, i19, i11, obj, this.f27475e, this.f27484n, a5);
                    } else {
                        i38 = AbstractC2508h.I(i24, bArr, i19, i11, r(obj), a5);
                    }
                    obj3 = obj;
                    bArr2 = bArr;
                    i41 = i24;
                    p03 = this;
                    i37 = i58;
                    a10 = a5;
                    i39 = i21;
                    i42 = i20;
                    i43 = i25;
                    i40 = i22;
                    i36 = i11;
                }
            } else {
                unsafe = unsafe2;
                i13 = i37;
                p02 = p03;
            }
        }
        if (i43 != 1048575) {
            obj2 = obj;
            unsafe.putInt(obj2, i43, i42);
        } else {
            obj2 = obj;
        }
        for (int i59 = p02.f27480j; i59 < p02.f27481k; i59++) {
            p02.n(obj2, p02.f27479i[i59], null);
        }
        if (i13 == 0) {
            if (i38 != i11) {
                throw C2540t0.f();
            }
        } else if (i38 > i11 || i41 != i13) {
            throw C2540t0.f();
        }
        return i38;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        byte b10;
        int V10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int N10;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        P0 p02 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i23 = i11;
        com.google.android.gms.internal.play_billing.A a10 = a5;
        l(obj);
        int i24 = 0;
        int i25 = i10;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 1048575;
        while (true) {
            Unsafe unsafe = f27470r;
            if (i25 < i23) {
                int i30 = i25 + 1;
                byte b11 = bArr2[i25];
                if (b11 < 0) {
                    int K10 = AbstractC2508h.K(b11, bArr2, i30, a10);
                    b10 = a10.f26821a;
                    i30 = K10;
                } else {
                    b10 = b11;
                }
                int i31 = b10 >>> 3;
                int i32 = b10 & 7;
                int i33 = p02.f27474d;
                int i34 = p02.f27473c;
                if (i31 > i28) {
                    int i35 = i26 / 3;
                    if (i31 >= i34 && i31 <= i33) {
                        V10 = p02.V(i31, i35);
                        i12 = V10;
                        if (i12 != -1) {
                            i13 = i30;
                            i14 = i31;
                            i15 = i24;
                            i16 = i15;
                        } else {
                            int[] iArr = p02.f27471a;
                            int i36 = iArr[i12 + 1];
                            int Y7 = Y(i36);
                            long j6 = i36 & 1048575;
                            i14 = i31;
                            if (Y7 <= 17) {
                                int i37 = iArr[i12 + 2];
                                int i38 = 1 << (i37 >>> 20);
                                int i39 = i37 & 1048575;
                                if (i39 != i29) {
                                    if (i29 != 1048575) {
                                        unsafe.putInt(obj2, i29, i27);
                                        i18 = i39;
                                    } else {
                                        i18 = i39;
                                    }
                                    if (i18 != 1048575) {
                                        i27 = unsafe.getInt(obj2, i18);
                                    }
                                    i29 = i18;
                                }
                                switch (Y7) {
                                    case 0:
                                        i17 = i30;
                                        if (i32 == 1) {
                                            C1.r(obj2, j6, AbstractC2508h.h(i17, bArr2));
                                            i25 = i17 + 8;
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        } else {
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        }
                                    case 1:
                                        i17 = i30;
                                        if (i32 == 5) {
                                            C1.s(obj2, j6, AbstractC2508h.o(i17, bArr2));
                                            i25 = i17 + 4;
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        } else {
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        i17 = i30;
                                        if (i32 == 0) {
                                            N10 = AbstractC2508h.N(bArr2, i17, a10);
                                            unsafe.putLong(obj, j6, a10.f26822b);
                                            i27 |= i38;
                                            i26 = i12;
                                            i25 = N10;
                                            i28 = i14;
                                            i24 = 0;
                                            i23 = i11;
                                            break;
                                        } else {
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        }
                                    case 4:
                                    case 11:
                                        i17 = i30;
                                        if (i32 == 0) {
                                            i25 = AbstractC2508h.L(bArr2, i17, a10);
                                            unsafe.putInt(obj2, j6, a10.f26821a);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        } else {
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        }
                                    case 5:
                                    case 14:
                                        if (i32 != 1) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            i17 = i30;
                                            unsafe.putLong(obj, j6, AbstractC2508h.m(i30, bArr2));
                                            i25 = i17 + 8;
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 6:
                                    case 13:
                                        if (i32 != 5) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            unsafe.putInt(obj2, j6, AbstractC2508h.k(i30, bArr2));
                                            i25 = i30 + 4;
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 7:
                                        if (i32 != 0) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            i25 = AbstractC2508h.N(bArr2, i30, a10);
                                            if (a10.f26822b != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            C1.n(obj2, j6, z10);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 8:
                                        if (i32 != 2) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            if ((i36 & 536870912) == 0) {
                                                i25 = AbstractC2508h.E(bArr2, i30, a10);
                                            } else {
                                                i25 = AbstractC2508h.H(bArr2, i30, a10);
                                            }
                                            unsafe.putObject(obj2, j6, a10.f26823c);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 9:
                                        if (i32 != 2) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            Object C10 = p02.C(i12, obj2);
                                            i25 = AbstractC2508h.S(C10, p02.q(i12), bArr, i30, i11, a5);
                                            p02.W(obj2, i12, C10);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 10:
                                        if (i32 != 2) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            i25 = AbstractC2508h.f(bArr2, i30, a10);
                                            unsafe.putObject(obj2, j6, a10.f26823c);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 12:
                                        if (i32 != 0) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            i25 = AbstractC2508h.L(bArr2, i30, a10);
                                            unsafe.putInt(obj2, j6, a10.f26821a);
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 15:
                                        if (i32 != 0) {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        } else {
                                            i25 = AbstractC2508h.L(bArr2, i30, a10);
                                            unsafe.putInt(obj2, j6, AbstractC2543v.c(a10.f26821a));
                                            i27 |= i38;
                                            i23 = i11;
                                            i26 = i12;
                                            i28 = i14;
                                            i24 = 0;
                                            break;
                                        }
                                    case 16:
                                        if (i32 == 0) {
                                            N10 = AbstractC2508h.N(bArr2, i30, a10);
                                            unsafe.putLong(obj, j6, AbstractC2543v.d(a10.f26822b));
                                            i27 |= i38;
                                            i26 = i12;
                                            i25 = N10;
                                            i28 = i14;
                                            i24 = 0;
                                            i23 = i11;
                                            break;
                                        } else {
                                            i17 = i30;
                                            i16 = i12;
                                            i13 = i17;
                                            i15 = 0;
                                            break;
                                        }
                                    default:
                                        i17 = i30;
                                        i16 = i12;
                                        i13 = i17;
                                        i15 = 0;
                                        break;
                                }
                            } else {
                                int i40 = i30;
                                if (Y7 == 27) {
                                    if (i32 == 2) {
                                        AbstractC2496d abstractC2496d = (AbstractC2496d) ((AbstractC2535q0) unsafe.getObject(obj2, j6));
                                        boolean r10 = abstractC2496d.r();
                                        AbstractC2535q0 abstractC2535q0 = abstractC2496d;
                                        if (!r10) {
                                            int size = abstractC2496d.size();
                                            if (size == 0) {
                                                i19 = 10;
                                            } else {
                                                i19 = size * 2;
                                            }
                                            AbstractC2535q0 h10 = abstractC2496d.h(i19);
                                            unsafe.putObject(obj2, j6, h10);
                                            abstractC2535q0 = h10;
                                        }
                                        i25 = AbstractC2508h.s(p02.q(i12), b10, bArr, i40, i11, abstractC2535q0, a5);
                                        i23 = i11;
                                        i27 = i27;
                                        i26 = i12;
                                        i28 = i14;
                                        i24 = 0;
                                    } else {
                                        i20 = i40;
                                        i21 = i27;
                                        i22 = i29;
                                        i16 = i12;
                                        i15 = 0;
                                    }
                                } else if (Y7 <= 49) {
                                    i21 = i27;
                                    i22 = i29;
                                    i15 = 0;
                                    i16 = i12;
                                    i25 = N(obj, bArr, i40, i11, b10, i32, i12, i36, Y7, j6, a5);
                                    if (i25 != i40) {
                                        p02 = this;
                                        bArr2 = bArr;
                                        i23 = i11;
                                        a10 = a5;
                                        i29 = i22;
                                        i24 = i15;
                                        i28 = i14;
                                        i26 = i16;
                                        i27 = i21;
                                        obj2 = obj;
                                    } else {
                                        i13 = i25;
                                        i29 = i22;
                                        i27 = i21;
                                    }
                                } else {
                                    i20 = i40;
                                    i21 = i27;
                                    i22 = i29;
                                    i15 = 0;
                                    i16 = i12;
                                    if (Y7 == 50) {
                                        if (i32 == 2) {
                                            i25 = J(obj, bArr, i20, i11, i16, j6, a5);
                                            if (i25 != i20) {
                                                p02 = this;
                                                bArr2 = bArr;
                                                i23 = i11;
                                                a10 = a5;
                                                i29 = i22;
                                                i24 = i15;
                                                i28 = i14;
                                                i26 = i16;
                                                i27 = i21;
                                                obj2 = obj;
                                            } else {
                                                i13 = i25;
                                                i29 = i22;
                                                i27 = i21;
                                            }
                                        }
                                    } else {
                                        i25 = K(obj, bArr, i20, i11, b10, i14, i32, i36, Y7, j6, i16, a5);
                                        if (i25 != i20) {
                                            p02 = this;
                                            bArr2 = bArr;
                                            i23 = i11;
                                            a10 = a5;
                                            i29 = i22;
                                            i24 = i15;
                                            i28 = i14;
                                            i26 = i16;
                                            i27 = i21;
                                            obj2 = obj;
                                        } else {
                                            i13 = i25;
                                            i29 = i22;
                                            i27 = i21;
                                        }
                                    }
                                }
                                i13 = i20;
                                i29 = i22;
                                i27 = i21;
                            }
                        }
                        i25 = AbstractC2508h.I(b10, bArr, i13, i11, r(obj), a5);
                        p02 = this;
                        obj2 = obj;
                        bArr2 = bArr;
                        i23 = i11;
                        a10 = a5;
                        i24 = i15;
                        i28 = i14;
                        i26 = i16;
                    }
                    V10 = -1;
                    i12 = V10;
                    if (i12 != -1) {
                    }
                    i25 = AbstractC2508h.I(b10, bArr, i13, i11, r(obj), a5);
                    p02 = this;
                    obj2 = obj;
                    bArr2 = bArr;
                    i23 = i11;
                    a10 = a5;
                    i24 = i15;
                    i28 = i14;
                    i26 = i16;
                } else {
                    if (i31 >= i34 && i31 <= i33) {
                        V10 = p02.V(i31, i24);
                        i12 = V10;
                        if (i12 != -1) {
                        }
                        i25 = AbstractC2508h.I(b10, bArr, i13, i11, r(obj), a5);
                        p02 = this;
                        obj2 = obj;
                        bArr2 = bArr;
                        i23 = i11;
                        a10 = a5;
                        i24 = i15;
                        i28 = i14;
                        i26 = i16;
                    }
                    V10 = -1;
                    i12 = V10;
                    if (i12 != -1) {
                    }
                    i25 = AbstractC2508h.I(b10, bArr, i13, i11, r(obj), a5);
                    p02 = this;
                    obj2 = obj;
                    bArr2 = bArr;
                    i23 = i11;
                    a10 = a5;
                    i24 = i15;
                    i28 = i14;
                    i26 = i16;
                }
            } else {
                int i41 = i27;
                int i42 = i29;
                if (i42 != 1048575) {
                    unsafe.putInt(obj, i42, i41);
                }
                if (i25 == i11) {
                    return;
                }
                throw C2540t0.f();
            }
        }
    }

    public final int N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j6, int i15, long j10, com.google.android.gms.internal.play_billing.A a5) {
        int i16;
        int i17;
        Unsafe unsafe = f27470r;
        AbstractC2496d abstractC2496d = (AbstractC2496d) ((AbstractC2535q0) unsafe.getObject(obj, j10));
        boolean r10 = abstractC2496d.r();
        AbstractC2535q0 abstractC2535q0 = abstractC2496d;
        if (!r10) {
            int size = abstractC2496d.size();
            if (size == 0) {
                i17 = 10;
            } else {
                i17 = size * 2;
            }
            AbstractC2535q0 h10 = abstractC2496d.h(i17);
            unsafe.putObject(obj, j10, h10);
            abstractC2535q0 = h10;
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return AbstractC2508h.u(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 1) {
                    return AbstractC2508h.i(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 19:
            case 36:
                if (i13 == 2) {
                    return AbstractC2508h.x(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 5) {
                    return AbstractC2508h.p(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    return AbstractC2508h.B(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 0) {
                    return AbstractC2508h.O(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return AbstractC2508h.A(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 0) {
                    return AbstractC2508h.M(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return AbstractC2508h.w(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 1) {
                    return AbstractC2508h.n(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return AbstractC2508h.v(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 5) {
                    return AbstractC2508h.l(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 25:
            case 42:
                if (i13 == 2) {
                    return AbstractC2508h.t(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 0) {
                    return AbstractC2508h.e(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 26:
                if (i13 == 2) {
                    if ((j6 & 536870912) == 0) {
                        return AbstractC2508h.F(i12, bArr, i10, i11, abstractC2535q0, a5);
                    }
                    return AbstractC2508h.G(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 27:
                if (i13 == 2) {
                    return AbstractC2508h.s(q(i14), i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 28:
                if (i13 == 2) {
                    return AbstractC2508h.g(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 30:
            case 44:
                if (i13 == 2) {
                    i16 = AbstractC2508h.A(bArr, i10, abstractC2535q0, a5);
                } else if (i13 == 0) {
                    i16 = AbstractC2508h.M(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                o(i14);
                Class cls = AbstractC2507g1.f27547a;
                return i16;
            case 33:
            case 47:
                if (i13 == 2) {
                    return AbstractC2508h.y(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 0) {
                    return AbstractC2508h.C(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 34:
            case r9.y.f44626f /* 48 */:
                if (i13 == 2) {
                    return AbstractC2508h.z(bArr, i10, abstractC2535q0, a5);
                }
                if (i13 == 0) {
                    return AbstractC2508h.D(i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
            case 49:
                if (i13 == 3) {
                    return AbstractC2508h.q(q(i14), i12, bArr, i10, i11, abstractC2535q0, a5);
                }
                break;
        }
        return i10;
    }

    public final void O(Object obj, long j6, T0.m mVar, AbstractC2504f1 abstractC2504f1, J j10) {
        int F10;
        List c10 = this.f27483m.c(j6, obj);
        int i10 = mVar.f16797b;
        if ((i10 & 7) == 3) {
            do {
                AbstractC2497d0 g10 = abstractC2504f1.g();
                mVar.Q(g10, abstractC2504f1, j10);
                abstractC2504f1.d(g10);
                c10.add(g10);
                if (!((AbstractC2543v) mVar.f16800e).g() && mVar.f16799d == 0) {
                    F10 = ((AbstractC2543v) mVar.f16800e).F();
                } else {
                    return;
                }
            } while (F10 == i10);
            mVar.f16799d = F10;
            return;
        }
        throw C2540t0.c();
    }

    public final void P(Object obj, int i10, T0.m mVar, AbstractC2504f1 abstractC2504f1, J j6) {
        int F10;
        List c10 = this.f27483m.c(i10 & 1048575, obj);
        int i11 = mVar.f16797b;
        if ((i11 & 7) == 2) {
            do {
                AbstractC2497d0 g10 = abstractC2504f1.g();
                mVar.S(g10, abstractC2504f1, j6);
                abstractC2504f1.d(g10);
                c10.add(g10);
                if (!((AbstractC2543v) mVar.f16800e).g() && mVar.f16799d == 0) {
                    F10 = ((AbstractC2543v) mVar.f16800e).F();
                } else {
                    return;
                }
            } while (F10 == i11);
            mVar.f16799d = F10;
            return;
        }
        throw C2540t0.c();
    }

    public final void Q(Object obj, int i10, T0.m mVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C1.v(i10 & 1048575, obj, mVar.J());
        } else if (this.f27477g) {
            C1.v(i10 & 1048575, obj, mVar.v());
        } else {
            C1.v(i10 & 1048575, obj, mVar.V());
        }
    }

    public final void R(Object obj, int i10, T0.m mVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC2552z0 abstractC2552z0 = this.f27483m;
        if (z10) {
            mVar.y(abstractC2552z0.c(i10 & 1048575, obj));
        } else {
            mVar.x(abstractC2552z0.c(i10 & 1048575, obj));
        }
    }

    public final void T(int i10, Object obj) {
        int i11 = this.f27471a[i10 + 2];
        long j6 = 1048575 & i11;
        if (j6 == 1048575) {
            return;
        }
        C1.t(j6, obj, (1 << (i11 >>> 20)) | C1.f27385c.i(j6, obj));
    }

    public final void U(int i10, Object obj, int i11) {
        C1.t(this.f27471a[i11 + 2] & 1048575, obj, i10);
    }

    public final int V(int i10, int i11) {
        int[] iArr = this.f27471a;
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

    public final void W(Object obj, int i10, Object obj2) {
        f27470r.putObject(obj, Z(i10) & 1048575, obj2);
        T(i10, obj);
    }

    public final void X(int i10, Object obj, Object obj2, int i11) {
        f27470r.putObject(obj, Z(i11) & 1048575, obj2);
        U(i10, obj, i11);
    }

    public final int Z(int i10) {
        return this.f27471a[i10 + 1];
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final boolean a(Object obj, Object obj2) {
        boolean z10;
        int[] iArr = this.f27471a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int Z10 = Z(i10);
            long j6 = Z10 & 1048575;
            switch (Y(Z10)) {
                case 0:
                    if (k(obj, i10, obj2)) {
                        B1 b1 = C1.f27385c;
                        if (Double.doubleToLongBits(b1.g(j6, obj)) == Double.doubleToLongBits(b1.g(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(obj, i10, obj2)) {
                        B1 b12 = C1.f27385c;
                        if (Float.floatToIntBits(b12.h(j6, obj)) == Float.floatToIntBits(b12.h(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(obj, i10, obj2)) {
                        B1 b13 = C1.f27385c;
                        if (b13.j(j6, obj) == b13.j(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(obj, i10, obj2)) {
                        B1 b14 = C1.f27385c;
                        if (b14.j(j6, obj) == b14.j(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(obj, i10, obj2)) {
                        B1 b15 = C1.f27385c;
                        if (b15.i(j6, obj) == b15.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(obj, i10, obj2)) {
                        B1 b16 = C1.f27385c;
                        if (b16.j(j6, obj) == b16.j(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (k(obj, i10, obj2)) {
                        B1 b17 = C1.f27385c;
                        if (b17.i(j6, obj) == b17.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (k(obj, i10, obj2)) {
                        B1 b18 = C1.f27385c;
                        if (b18.d(j6, obj) == b18.d(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(obj, i10, obj2)) {
                        B1 b19 = C1.f27385c;
                        if (AbstractC2507g1.D(b19.k(j6, obj), b19.k(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (k(obj, i10, obj2)) {
                        B1 b110 = C1.f27385c;
                        if (AbstractC2507g1.D(b110.k(j6, obj), b110.k(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (k(obj, i10, obj2)) {
                        B1 b111 = C1.f27385c;
                        if (AbstractC2507g1.D(b111.k(j6, obj), b111.k(j6, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (k(obj, i10, obj2)) {
                        B1 b112 = C1.f27385c;
                        if (b112.i(j6, obj) == b112.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(obj, i10, obj2)) {
                        B1 b113 = C1.f27385c;
                        if (b113.i(j6, obj) == b113.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(obj, i10, obj2)) {
                        B1 b114 = C1.f27385c;
                        if (b114.i(j6, obj) == b114.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(obj, i10, obj2)) {
                        B1 b115 = C1.f27385c;
                        if (b115.j(j6, obj) == b115.j(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(obj, i10, obj2)) {
                        B1 b116 = C1.f27385c;
                        if (b116.i(j6, obj) == b116.i(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(obj, i10, obj2)) {
                        B1 b117 = C1.f27385c;
                        if (b117.j(j6, obj) == b117.j(j6, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(obj, i10, obj2)) {
                        B1 b118 = C1.f27385c;
                        if (AbstractC2507g1.D(b118.k(j6, obj), b118.k(j6, obj2))) {
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
                    B1 b119 = C1.f27385c;
                    z10 = AbstractC2507g1.D(b119.k(j6, obj), b119.k(j6, obj2));
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    B1 b120 = C1.f27385c;
                    z10 = AbstractC2507g1.D(b120.k(j6, obj), b120.k(j6, obj2));
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
                    B1 b121 = C1.f27385c;
                    if (b121.i(j10, obj) == b121.i(j10, obj2) && AbstractC2507g1.D(b121.k(j6, obj), b121.k(j6, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z10) {
                return false;
            }
        }
        this.f27484n.getClass();
        if (!((AbstractC2497d0) obj).unknownFields.equals(((AbstractC2497d0) obj2).unknownFields)) {
            return false;
        }
        if (this.f27476f) {
            this.f27485o.getClass();
            return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(S4.o oVar, Object obj) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.f27476f;
        K k10 = this.f27485o;
        if (z10) {
            k10.getClass();
            S b10 = K.b(obj);
            if (!b10.i()) {
                it = b10.l();
                entry = (Map.Entry) it.next();
                int[] iArr = this.f27471a;
                length = iArr.length;
                i10 = 0;
                int i13 = 1048575;
                int i14 = 0;
                while (i10 < length) {
                    int Z10 = Z(i10);
                    int i15 = iArr[i10];
                    int Y7 = Y(Z10);
                    Unsafe unsafe = f27470r;
                    if (Y7 <= 17) {
                        int i16 = iArr[i10 + 2];
                        Map.Entry entry2 = entry;
                        int i17 = i16 & 1048575;
                        if (i17 != i13) {
                            i14 = unsafe.getInt(obj, i17);
                            i13 = i17;
                        }
                        i11 = 1 << (i16 >>> 20);
                        entry = entry2;
                    } else {
                        i11 = 0;
                    }
                    while (true) {
                        if (entry != null) {
                            k10.getClass();
                            i12 = length;
                            if (K.a(entry) <= i15) {
                                K.e(oVar, entry);
                                if (it.hasNext()) {
                                    entry = (Map.Entry) it.next();
                                } else {
                                    entry = null;
                                }
                                length = i12;
                            }
                        } else {
                            i12 = length;
                        }
                    }
                    long j6 = Z10 & 1048575;
                    switch (Y7) {
                        case 0:
                            if ((i14 & i11) != 0) {
                                oVar.s(i15, C1.f27385c.g(j6, obj));
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 1:
                            if ((i14 & i11) != 0) {
                                oVar.w(i15, C1.f27385c.h(j6, obj));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 2:
                            if ((i11 & i14) != 0) {
                                oVar.z(i15, unsafe.getLong(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 3:
                            if ((i11 & i14) != 0) {
                                oVar.G(i15, unsafe.getLong(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 4:
                            if ((i11 & i14) != 0) {
                                oVar.y(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 5:
                            if ((i11 & i14) != 0) {
                                oVar.v(i15, unsafe.getLong(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 6:
                            if ((i11 & i14) != 0) {
                                oVar.u(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 7:
                            if ((i14 & i11) != 0) {
                                oVar.q(i15, C1.f27385c.d(j6, obj));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 8:
                            if ((i11 & i14) != 0) {
                                c0(i15, unsafe.getObject(obj, j6), oVar);
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 9:
                            if ((i11 & i14) != 0) {
                                oVar.A(i15, q(i10), unsafe.getObject(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 10:
                            if ((i11 & i14) != 0) {
                                oVar.r(i15, (AbstractC2534q) unsafe.getObject(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 11:
                            if ((i11 & i14) != 0) {
                                oVar.F(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 12:
                            if ((i11 & i14) != 0) {
                                oVar.t(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 13:
                            if ((i11 & i14) != 0) {
                                oVar.B(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 14:
                            if ((i11 & i14) != 0) {
                                oVar.C(i15, unsafe.getLong(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 15:
                            if ((i11 & i14) != 0) {
                                oVar.D(i15, unsafe.getInt(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 16:
                            if ((i11 & i14) != 0) {
                                oVar.E(i15, unsafe.getLong(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 17:
                            if ((i11 & i14) != 0) {
                                oVar.x(i15, q(i10), unsafe.getObject(obj, j6));
                            } else {
                                continue;
                            }
                            i10 += 3;
                            length = i12;
                        case 18:
                            AbstractC2507g1.H(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 19:
                            AbstractC2507g1.L(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 20:
                            AbstractC2507g1.O(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 21:
                            AbstractC2507g1.W(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 22:
                            AbstractC2507g1.N(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 23:
                            AbstractC2507g1.K(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 24:
                            AbstractC2507g1.J(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 25:
                            AbstractC2507g1.F(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 26:
                            AbstractC2507g1.U(iArr[i10], (List) unsafe.getObject(obj, j6), oVar);
                            break;
                        case 27:
                            AbstractC2507g1.P(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, q(i10));
                            break;
                        case 28:
                            AbstractC2507g1.G(iArr[i10], (List) unsafe.getObject(obj, j6), oVar);
                            break;
                        case 29:
                            AbstractC2507g1.V(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 30:
                            AbstractC2507g1.I(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 31:
                            AbstractC2507g1.Q(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 32:
                            AbstractC2507g1.R(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 33:
                            AbstractC2507g1.S(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 34:
                            AbstractC2507g1.T(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, false);
                            continue;
                            i10 += 3;
                            length = i12;
                        case 35:
                            AbstractC2507g1.H(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 36:
                            AbstractC2507g1.L(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 37:
                            AbstractC2507g1.O(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 38:
                            AbstractC2507g1.W(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 39:
                            AbstractC2507g1.N(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 40:
                            AbstractC2507g1.K(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 41:
                            AbstractC2507g1.J(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 42:
                            AbstractC2507g1.F(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 43:
                            AbstractC2507g1.V(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 44:
                            AbstractC2507g1.I(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 45:
                            AbstractC2507g1.Q(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 46:
                            AbstractC2507g1.R(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 47:
                            AbstractC2507g1.S(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case r9.y.f44626f /* 48 */:
                            AbstractC2507g1.T(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, true);
                            break;
                        case 49:
                            AbstractC2507g1.M(iArr[i10], (List) unsafe.getObject(obj, j6), oVar, q(i10));
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            b0(oVar, i15, unsafe.getObject(obj, j6), i10);
                            break;
                        case 51:
                            if (w(i15, obj, i10)) {
                                oVar.s(i15, ((Double) C1.f27385c.k(j6, obj)).doubleValue());
                                break;
                            }
                            break;
                        case 52:
                            if (w(i15, obj, i10)) {
                                oVar.w(i15, ((Float) C1.f27385c.k(j6, obj)).floatValue());
                                break;
                            }
                            break;
                        case 53:
                            if (w(i15, obj, i10)) {
                                oVar.z(i15, I(j6, obj));
                                break;
                            }
                            break;
                        case 54:
                            if (w(i15, obj, i10)) {
                                oVar.G(i15, I(j6, obj));
                                break;
                            }
                            break;
                        case 55:
                            if (w(i15, obj, i10)) {
                                oVar.y(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 56:
                            if (w(i15, obj, i10)) {
                                oVar.v(i15, I(j6, obj));
                                break;
                            }
                            break;
                        case 57:
                            if (w(i15, obj, i10)) {
                                oVar.u(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 58:
                            if (w(i15, obj, i10)) {
                                oVar.q(i15, ((Boolean) C1.f27385c.k(j6, obj)).booleanValue());
                                break;
                            }
                            break;
                        case 59:
                            if (w(i15, obj, i10)) {
                                c0(i15, unsafe.getObject(obj, j6), oVar);
                                break;
                            }
                            break;
                        case 60:
                            if (w(i15, obj, i10)) {
                                oVar.A(i15, q(i10), unsafe.getObject(obj, j6));
                                break;
                            }
                            break;
                        case 61:
                            if (w(i15, obj, i10)) {
                                oVar.r(i15, (AbstractC2534q) unsafe.getObject(obj, j6));
                                break;
                            }
                            break;
                        case 62:
                            if (w(i15, obj, i10)) {
                                oVar.F(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 63:
                            if (w(i15, obj, i10)) {
                                oVar.t(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 64:
                            if (w(i15, obj, i10)) {
                                oVar.B(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 65:
                            if (w(i15, obj, i10)) {
                                oVar.C(i15, I(j6, obj));
                                break;
                            }
                            break;
                        case 66:
                            if (w(i15, obj, i10)) {
                                oVar.D(i15, H(j6, obj));
                                break;
                            }
                            break;
                        case 67:
                            if (w(i15, obj, i10)) {
                                oVar.E(i15, I(j6, obj));
                                break;
                            }
                            break;
                        case 68:
                            if (w(i15, obj, i10)) {
                                oVar.x(i15, q(i10), unsafe.getObject(obj, j6));
                                break;
                            }
                            break;
                    }
                    i10 += 3;
                    length = i12;
                }
                while (entry != null) {
                    k10.getClass();
                    K.e(oVar, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                this.f27484n.getClass();
                ((AbstractC2497d0) obj).unknownFields.g(oVar);
            }
        }
        it = null;
        entry = null;
        int[] iArr2 = this.f27471a;
        length = iArr2.length;
        i10 = 0;
        int i132 = 1048575;
        int i142 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        this.f27484n.getClass();
        ((AbstractC2497d0) obj).unknownFields.g(oVar);
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
    @Override // com.google.protobuf.AbstractC2504f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(Object obj) {
        int i10;
        int b10;
        int i11;
        int[] iArr = this.f27471a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int Z10 = Z(i13);
            int i14 = iArr[i13];
            long j6 = 1048575 & Z10;
            int i15 = 1237;
            int i16 = 37;
            switch (Y(Z10)) {
                case 0:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(Double.doubleToLongBits(C1.f27385c.g(j6, obj)));
                    i12 = b10 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    b10 = Float.floatToIntBits(C1.f27385c.h(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(C1.f27385c.j(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(C1.f27385c.j(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(C1.f27385c.j(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean d10 = C1.f27385c.d(j6, obj);
                    Charset charset = AbstractC2536r0.f27584a;
                    break;
                case 8:
                    i10 = i12 * 53;
                    b10 = ((String) C1.f27385c.k(j6, obj)).hashCode();
                    i12 = b10 + i10;
                    break;
                case 9:
                    Object k10 = C1.f27385c.k(j6, obj);
                    if (k10 != null) {
                        i16 = k10.hashCode();
                    }
                    i12 = (i12 * 53) + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.k(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(C1.f27385c.j(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.i(j6, obj);
                    i12 = b10 + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    b10 = AbstractC2536r0.b(C1.f27385c.j(j6, obj));
                    i12 = b10 + i10;
                    break;
                case 17:
                    Object k11 = C1.f27385c.k(j6, obj);
                    if (k11 != null) {
                        i16 = k11.hashCode();
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
                    b10 = C1.f27385c.k(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    i10 = i12 * 53;
                    b10 = C1.f27385c.k(j6, obj).hashCode();
                    i12 = b10 + i10;
                    break;
                case 51:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(Double.doubleToLongBits(((Double) C1.f27385c.k(j6, obj)).doubleValue()));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = Float.floatToIntBits(((Float) C1.f27385c.k(j6, obj)).floatValue());
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(I(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(I(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(I(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(i14, obj, i13)) {
                        i11 = i12 * 53;
                        boolean booleanValue = ((Boolean) C1.f27385c.k(j6, obj)).booleanValue();
                        Charset charset2 = AbstractC2536r0.f27584a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = ((String) C1.f27385c.k(j6, obj)).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = C1.f27385c.k(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = C1.f27385c.k(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(I(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = H(j6, obj);
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = AbstractC2536r0.b(I(j6, obj));
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(i14, obj, i13)) {
                        i10 = i12 * 53;
                        b10 = C1.f27385c.k(j6, obj).hashCode();
                        i12 = b10 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f27484n.getClass();
        int hashCode = ((AbstractC2497d0) obj).unknownFields.hashCode() + (i12 * 53);
        if (this.f27476f) {
            this.f27485o.getClass();
            return (hashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f27492a.hashCode();
        }
        return hashCode;
    }

    public final void b0(S4.o oVar, int i10, Object obj, int i11) {
        if (obj != null) {
            Object p10 = p(i11);
            this.f27486p.getClass();
            U3.i iVar = ((F0) p10).f27395a;
            ((AbstractC2549y) oVar.f16184Z).getClass();
            for (Map.Entry entry : ((G0) obj).entrySet()) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                ((AbstractC2549y) oVar.f16184Z).O0(F0.a(iVar, entry.getKey(), entry.getValue()));
                AbstractC2549y abstractC2549y = (AbstractC2549y) oVar.f16184Z;
                Object key = entry.getKey();
                Object value = entry.getValue();
                S.r(abstractC2549y, (N1) iVar.f17414Y, 1, key);
                S.r(abstractC2549y, (N1) iVar.f17416h0, 2, value);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void c(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f27471a;
            if (i10 < iArr.length) {
                int Z10 = Z(i10);
                long j6 = 1048575 & Z10;
                int i11 = iArr[i10];
                switch (Y(Z10)) {
                    case 0:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.r(obj, j6, C1.f27385c.g(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 1:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.s(obj, j6, C1.f27385c.h(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 2:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.u(obj, j6, C1.f27385c.j(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 3:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.u(obj, j6, C1.f27385c.j(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 4:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 5:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.u(obj, j6, C1.f27385c.j(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 6:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 7:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.n(obj, j6, C1.f27385c.d(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 8:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.v(j6, obj, C1.f27385c.k(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 9:
                        A(obj, i10, obj2);
                        break;
                    case 10:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.v(j6, obj, C1.f27385c.k(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 11:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 12:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 13:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 14:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.u(obj, j6, C1.f27385c.j(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 15:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.t(j6, obj, C1.f27385c.i(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 16:
                        if (!u(i10, obj2)) {
                            break;
                        } else {
                            C1.u(obj, j6, C1.f27385c.j(j6, obj2));
                            T(i10, obj);
                            break;
                        }
                    case 17:
                        A(obj, i10, obj2);
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
                        this.f27483m.b(j6, obj, obj2);
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Class cls = AbstractC2507g1.f27547a;
                        B1 b1 = C1.f27385c;
                        Object k10 = b1.k(j6, obj);
                        Object k11 = b1.k(j6, obj2);
                        this.f27486p.getClass();
                        C1.v(j6, obj, H0.e(k10, k11));
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
                        if (!w(i11, obj2, i10)) {
                            break;
                        } else {
                            C1.v(j6, obj, C1.f27385c.k(j6, obj2));
                            U(i11, obj, i10);
                            break;
                        }
                    case 60:
                        B(obj, i10, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!w(i11, obj2, i10)) {
                            break;
                        } else {
                            C1.v(j6, obj, C1.f27385c.k(j6, obj2));
                            U(i11, obj, i10);
                            break;
                        }
                    case 68:
                        B(obj, i10, obj2);
                        break;
                }
                i10 += 3;
            } else {
                AbstractC2507g1.C(this.f27484n, obj, obj2);
                if (this.f27476f) {
                    this.f27485o.getClass();
                    S s10 = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (!s10.f27492a.isEmpty()) {
                        ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().n(s10);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void d(Object obj) {
        if (!v(obj)) {
            return;
        }
        if (obj instanceof AbstractC2497d0) {
            AbstractC2497d0 abstractC2497d0 = (AbstractC2497d0) obj;
            abstractC2497d0.clearMemoizedSerializedSize();
            abstractC2497d0.clearMemoizedHashCode();
            abstractC2497d0.markImmutable();
        }
        int length = this.f27471a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int Z10 = Z(i10);
            long j6 = 1048575 & Z10;
            int Y7 = Y(Z10);
            Unsafe unsafe = f27470r;
            if (Y7 != 9) {
                switch (Y7) {
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
                        this.f27483m.a(j6, obj);
                        continue;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object object = unsafe.getObject(obj, j6);
                        if (object != null) {
                            this.f27486p.getClass();
                            H0.g(object);
                            unsafe.putObject(obj, j6, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (u(i10, obj)) {
                q(i10).d(unsafe.getObject(obj, j6));
            }
        }
        this.f27484n.getClass();
        w1.b(obj);
        if (this.f27476f) {
            this.f27485o.getClass();
            K.c(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a A[SYNTHETIC] */
    @Override // com.google.protobuf.AbstractC2504f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Object obj) {
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f27480j; i12++) {
            int i13 = this.f27479i[i12];
            int[] iArr = this.f27471a;
            int i14 = iArr[i13];
            int Z10 = Z(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f27470r.getInt(obj, i16);
                }
                i10 = i16;
            }
            if ((268435456 & Z10) != 0) {
                if (i10 == 1048575) {
                    if (!u(i13, obj)) {
                        return false;
                    }
                } else if ((i11 & i17) == 0) {
                    return false;
                }
            }
            int Y7 = Y(Z10);
            if (Y7 != 9 && Y7 != 17) {
                if (Y7 != 27) {
                    if (Y7 != 60 && Y7 != 68) {
                        if (Y7 != 49) {
                            if (Y7 != 50) {
                                continue;
                            } else {
                                Object k10 = C1.f27385c.k(Z10 & 1048575, obj);
                                this.f27486p.getClass();
                                G0 g02 = (G0) k10;
                                if (!g02.isEmpty() && ((N1) ((F0) p(i13)).f27395a.f17416h0).f27433Y == O1.f27466o0) {
                                    AbstractC2504f1 abstractC2504f1 = null;
                                    for (Object obj2 : g02.values()) {
                                        if (abstractC2504f1 == null) {
                                            abstractC2504f1 = C2495c1.f27531c.a(obj2.getClass());
                                        }
                                        if (!abstractC2504f1.e(obj2)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (w(i14, obj, i13)) {
                        if (!q(i13).e(C1.f27385c.k(Z10 & 1048575, obj))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) C1.f27385c.k(Z10 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    AbstractC2504f1 q10 = q(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!q10.e(list.get(i18))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (i10 == 1048575) {
                if (!u(i13, obj)) {
                    continue;
                }
                if (q(i13).e(C1.f27385c.k(Z10 & 1048575, obj))) {
                    return false;
                }
            } else {
                if ((i17 & i11) == 0) {
                    continue;
                }
                if (q(i13).e(C1.f27385c.k(Z10 & 1048575, obj))) {
                }
            }
        }
        if (this.f27476f) {
            this.f27485o.getClass();
            if (!K.b(obj).j()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final int f(Object obj) {
        if (this.f27478h) {
            return t(obj);
        }
        return s(obj);
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final AbstractC2497d0 g() {
        this.f27482l.getClass();
        return ((AbstractC2497d0) this.f27475e).newMutableInstance();
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void h(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        if (this.f27478h) {
            M(obj, bArr, i10, i11, a5);
        } else {
            L(obj, bArr, i10, i11, 0, a5);
        }
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void i(Object obj, T0.m mVar, J j6) {
        j6.getClass();
        l(obj);
        y(this.f27484n, this.f27485o, obj, mVar, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0373  */
    @Override // com.google.protobuf.AbstractC2504f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(S4.o oVar, Object obj) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i10;
        Map.Entry entry2;
        oVar.getClass();
        if (this.f27478h) {
            boolean z10 = this.f27476f;
            K k10 = this.f27485o;
            if (z10) {
                k10.getClass();
                S s10 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (!s10.f27492a.isEmpty()) {
                    it = s10.l();
                    entry = (Map.Entry) it.next();
                    int[] iArr = this.f27471a;
                    length = iArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        int Z10 = Z(i10);
                        int i11 = iArr[i10];
                        while (entry != null) {
                            k10.getClass();
                            if (((C2488a0) entry.getKey()).f27515Z <= i11) {
                                K.e(oVar, entry);
                                if (it.hasNext()) {
                                    entry = (Map.Entry) it.next();
                                } else {
                                    entry = null;
                                }
                            } else {
                                switch (Y(Z10)) {
                                    case 0:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.s(i11, C1.f27385c.g(Z10 & 1048575, obj));
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 1:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.w(i11, C1.f27385c.h(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 2:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.z(i11, C1.f27385c.j(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 3:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.G(i11, C1.f27385c.j(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 4:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.y(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 5:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.v(i11, C1.f27385c.j(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 6:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.u(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 7:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.q(i11, C1.f27385c.d(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 8:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            c0(i11, C1.f27385c.k(Z10 & 1048575, obj), oVar);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 9:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.A(i11, q(i10), C1.f27385c.k(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 10:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.r(i11, (AbstractC2534q) C1.f27385c.k(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 11:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.F(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 12:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.t(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 13:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.B(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 14:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.C(i11, C1.f27385c.j(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 15:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.D(i11, C1.f27385c.i(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 16:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.E(i11, C1.f27385c.j(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 17:
                                        entry2 = entry;
                                        if (u(i10, obj)) {
                                            oVar.x(i11, q(i10), C1.f27385c.k(Z10 & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        entry = entry2;
                                    case 18:
                                        entry2 = entry;
                                        AbstractC2507g1.H(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 19:
                                        entry2 = entry;
                                        AbstractC2507g1.L(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 20:
                                        entry2 = entry;
                                        AbstractC2507g1.O(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 21:
                                        entry2 = entry;
                                        AbstractC2507g1.W(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 22:
                                        entry2 = entry;
                                        AbstractC2507g1.N(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 23:
                                        entry2 = entry;
                                        AbstractC2507g1.K(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 24:
                                        entry2 = entry;
                                        AbstractC2507g1.J(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 25:
                                        entry2 = entry;
                                        AbstractC2507g1.F(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 26:
                                        entry2 = entry;
                                        AbstractC2507g1.U(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 27:
                                        entry2 = entry;
                                        AbstractC2507g1.P(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, q(i10));
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 28:
                                        entry2 = entry;
                                        AbstractC2507g1.G(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 29:
                                        entry2 = entry;
                                        AbstractC2507g1.V(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 30:
                                        entry2 = entry;
                                        AbstractC2507g1.I(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 31:
                                        entry2 = entry;
                                        AbstractC2507g1.Q(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 32:
                                        entry2 = entry;
                                        AbstractC2507g1.R(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 33:
                                        entry2 = entry;
                                        AbstractC2507g1.S(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 34:
                                        entry2 = entry;
                                        AbstractC2507g1.T(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 35:
                                        entry2 = entry;
                                        AbstractC2507g1.H(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 36:
                                        entry2 = entry;
                                        AbstractC2507g1.L(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 37:
                                        entry2 = entry;
                                        AbstractC2507g1.O(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 38:
                                        entry2 = entry;
                                        AbstractC2507g1.W(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 39:
                                        entry2 = entry;
                                        AbstractC2507g1.N(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 40:
                                        entry2 = entry;
                                        AbstractC2507g1.K(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 41:
                                        entry2 = entry;
                                        AbstractC2507g1.J(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 42:
                                        entry2 = entry;
                                        AbstractC2507g1.F(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 43:
                                        entry2 = entry;
                                        AbstractC2507g1.V(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 44:
                                        entry2 = entry;
                                        AbstractC2507g1.I(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 45:
                                        entry2 = entry;
                                        AbstractC2507g1.Q(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 46:
                                        entry2 = entry;
                                        AbstractC2507g1.R(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 47:
                                        entry2 = entry;
                                        AbstractC2507g1.S(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case r9.y.f44626f /* 48 */:
                                        entry2 = entry;
                                        AbstractC2507g1.T(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        entry = entry2;
                                    case 49:
                                        AbstractC2507g1.M(iArr[i10], (List) C1.f27385c.k(Z10 & 1048575, obj), oVar, q(i10));
                                        break;
                                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                        b0(oVar, i11, C1.f27385c.k(Z10 & 1048575, obj), i10);
                                        break;
                                    case 51:
                                        if (w(i11, obj, i10)) {
                                            oVar.s(i11, ((Double) C1.f27385c.k(Z10 & 1048575, obj)).doubleValue());
                                            break;
                                        }
                                        break;
                                    case 52:
                                        if (w(i11, obj, i10)) {
                                            oVar.w(i11, ((Float) C1.f27385c.k(Z10 & 1048575, obj)).floatValue());
                                            break;
                                        }
                                        break;
                                    case 53:
                                        if (w(i11, obj, i10)) {
                                            oVar.z(i11, I(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 54:
                                        if (w(i11, obj, i10)) {
                                            oVar.G(i11, I(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 55:
                                        if (w(i11, obj, i10)) {
                                            oVar.y(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 56:
                                        if (w(i11, obj, i10)) {
                                            oVar.v(i11, I(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 57:
                                        if (w(i11, obj, i10)) {
                                            oVar.u(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 58:
                                        if (w(i11, obj, i10)) {
                                            oVar.q(i11, ((Boolean) C1.f27385c.k(Z10 & 1048575, obj)).booleanValue());
                                            break;
                                        }
                                        break;
                                    case 59:
                                        if (w(i11, obj, i10)) {
                                            c0(i11, C1.f27385c.k(Z10 & 1048575, obj), oVar);
                                            break;
                                        }
                                        break;
                                    case 60:
                                        if (w(i11, obj, i10)) {
                                            oVar.A(i11, q(i10), C1.f27385c.k(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 61:
                                        if (w(i11, obj, i10)) {
                                            oVar.r(i11, (AbstractC2534q) C1.f27385c.k(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 62:
                                        if (w(i11, obj, i10)) {
                                            oVar.F(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 63:
                                        if (w(i11, obj, i10)) {
                                            oVar.t(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 64:
                                        if (w(i11, obj, i10)) {
                                            oVar.B(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 65:
                                        if (w(i11, obj, i10)) {
                                            oVar.C(i11, I(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (w(i11, obj, i10)) {
                                            oVar.D(i11, H(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 67:
                                        if (w(i11, obj, i10)) {
                                            oVar.E(i11, I(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 68:
                                        if (w(i11, obj, i10)) {
                                            oVar.x(i11, q(i10), C1.f27385c.k(Z10 & 1048575, obj));
                                            break;
                                        }
                                        break;
                                }
                                entry2 = entry;
                                i10 += 3;
                                entry = entry2;
                            }
                        }
                        switch (Y(Z10)) {
                        }
                        entry2 = entry;
                        i10 += 3;
                        entry = entry2;
                    }
                    while (entry != null) {
                        k10.getClass();
                        K.e(oVar, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    this.f27484n.getClass();
                    ((AbstractC2497d0) obj).unknownFields.g(oVar);
                    return;
                }
            }
            it = null;
            entry = null;
            int[] iArr2 = this.f27471a;
            length = iArr2.length;
            i10 = 0;
            while (i10 < length) {
            }
            while (entry != null) {
            }
            this.f27484n.getClass();
            ((AbstractC2497d0) obj).unknownFields.g(oVar);
            return;
        }
        a0(oVar, obj);
    }

    public final boolean k(Object obj, int i10, Object obj2) {
        if (u(i10, obj) == u(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final void n(Object obj, int i10, Object obj2) {
        int i11 = this.f27471a[i10];
        if (C1.f27385c.k(Z(i10) & 1048575, obj) == null) {
            return;
        }
        o(i10);
    }

    public final void o(int i10) {
        AbstractC2469q0.p(this.f27472b[((i10 / 3) * 2) + 1]);
    }

    public final Object p(int i10) {
        return this.f27472b[(i10 / 3) * 2];
    }

    public final AbstractC2504f1 q(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f27472b;
        AbstractC2504f1 abstractC2504f1 = (AbstractC2504f1) objArr[i11];
        if (abstractC2504f1 != null) {
            return abstractC2504f1;
        }
        AbstractC2504f1 a5 = C2495c1.f27531c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a5;
        return a5;
    }

    public final int s(Object obj) {
        int i10;
        int Z10;
        int m02;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.f27471a;
            if (i11 < iArr.length) {
                int Z11 = Z(i11);
                int i15 = iArr[i11];
                int Y7 = Y(Z11);
                Unsafe unsafe = f27470r;
                if (Y7 <= 17) {
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
                long j6 = Z11 & 1048575;
                switch (Y7) {
                    case 0:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.Z(i15);
                            i12 += Z10;
                            break;
                        }
                    case 1:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.d0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 2:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.h0(i15, unsafe.getLong(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 3:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.r0(i15, unsafe.getLong(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 4:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.f0(i15, unsafe.getInt(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 5:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.c0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 6:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.b0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 7:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.W(i15);
                            i12 += Z10;
                            break;
                        }
                    case 8:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j6);
                            if (object instanceof AbstractC2534q) {
                                m02 = AbstractC2549y.X(i15, (AbstractC2534q) object);
                            } else {
                                m02 = AbstractC2549y.m0(i15, (String) object);
                            }
                            i12 = m02 + i12;
                            break;
                        }
                    case 9:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2507g1.o(i15, q(i11), unsafe.getObject(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 10:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.X(i15, (AbstractC2534q) unsafe.getObject(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 11:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.p0(i15, unsafe.getInt(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 12:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.a0(i15, unsafe.getInt(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 13:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.i0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 14:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.j0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 15:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.k0(i15, unsafe.getInt(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 16:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.l0(i15, unsafe.getLong(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 17:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.e0(i15, (M0) unsafe.getObject(obj, j6), q(i11));
                            i12 += Z10;
                            break;
                        }
                    case 18:
                        Z10 = AbstractC2507g1.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 19:
                        Z10 = AbstractC2507g1.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 20:
                        Z10 = AbstractC2507g1.m(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 21:
                        Z10 = AbstractC2507g1.x(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 22:
                        Z10 = AbstractC2507g1.k(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 23:
                        Z10 = AbstractC2507g1.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 24:
                        Z10 = AbstractC2507g1.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 25:
                        Z10 = AbstractC2507g1.a(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 26:
                        Z10 = AbstractC2507g1.u(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 27:
                        Z10 = AbstractC2507g1.p(i15, (List) unsafe.getObject(obj, j6), q(i11));
                        i12 += Z10;
                        break;
                    case 28:
                        Z10 = AbstractC2507g1.c(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 29:
                        Z10 = AbstractC2507g1.v(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 30:
                        Z10 = AbstractC2507g1.d(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 31:
                        Z10 = AbstractC2507g1.f(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 32:
                        Z10 = AbstractC2507g1.h(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 33:
                        Z10 = AbstractC2507g1.q(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 34:
                        Z10 = AbstractC2507g1.s(i15, (List) unsafe.getObject(obj, j6));
                        i12 += Z10;
                        break;
                    case 35:
                        int i18 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i18 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(i18, AbstractC2549y.o0(i15), i18, i12);
                            break;
                        }
                    case 36:
                        int g10 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(g10, AbstractC2549y.o0(i15), g10, i12);
                            break;
                        }
                    case 37:
                        int n10 = AbstractC2507g1.n((List) unsafe.getObject(obj, j6));
                        if (n10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(n10, AbstractC2549y.o0(i15), n10, i12);
                            break;
                        }
                    case 38:
                        int y10 = AbstractC2507g1.y((List) unsafe.getObject(obj, j6));
                        if (y10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(y10, AbstractC2549y.o0(i15), y10, i12);
                            break;
                        }
                    case 39:
                        int l10 = AbstractC2507g1.l((List) unsafe.getObject(obj, j6));
                        if (l10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(l10, AbstractC2549y.o0(i15), l10, i12);
                            break;
                        }
                    case 40:
                        int i19 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i19 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(i19, AbstractC2549y.o0(i15), i19, i12);
                            break;
                        }
                    case 41:
                        int g11 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g11 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(g11, AbstractC2549y.o0(i15), g11, i12);
                            break;
                        }
                    case 42:
                        int b10 = AbstractC2507g1.b((List) unsafe.getObject(obj, j6));
                        if (b10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(b10, AbstractC2549y.o0(i15), b10, i12);
                            break;
                        }
                    case 43:
                        int w10 = AbstractC2507g1.w((List) unsafe.getObject(obj, j6));
                        if (w10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(w10, AbstractC2549y.o0(i15), w10, i12);
                            break;
                        }
                    case 44:
                        int e10 = AbstractC2507g1.e((List) unsafe.getObject(obj, j6));
                        if (e10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(e10, AbstractC2549y.o0(i15), e10, i12);
                            break;
                        }
                    case 45:
                        int g12 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g12 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(g12, AbstractC2549y.o0(i15), g12, i12);
                            break;
                        }
                    case 46:
                        int i20 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i20 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(i20, AbstractC2549y.o0(i15), i20, i12);
                            break;
                        }
                    case 47:
                        int r10 = AbstractC2507g1.r((List) unsafe.getObject(obj, j6));
                        if (r10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(r10, AbstractC2549y.o0(i15), r10, i12);
                            break;
                        }
                    case r9.y.f44626f /* 48 */:
                        int t10 = AbstractC2507g1.t((List) unsafe.getObject(obj, j6));
                        if (t10 <= 0) {
                            break;
                        } else {
                            i12 = AbstractC2469q0.e(t10, AbstractC2549y.o0(i15), t10, i12);
                            break;
                        }
                    case 49:
                        Z10 = AbstractC2507g1.j(i15, (List) unsafe.getObject(obj, j6), q(i11));
                        i12 += Z10;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object object2 = unsafe.getObject(obj, j6);
                        Object p10 = p(i11);
                        this.f27486p.getClass();
                        Z10 = H0.c(object2, i15, p10);
                        i12 += Z10;
                        break;
                    case 51:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.Z(i15);
                            i12 += Z10;
                            break;
                        }
                    case 52:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.d0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 53:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.h0(i15, I(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 54:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.r0(i15, I(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 55:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.f0(i15, H(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 56:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.c0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 57:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.b0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 58:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.W(i15);
                            i12 += Z10;
                            break;
                        }
                    case 59:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j6);
                            if (object3 instanceof AbstractC2534q) {
                                m02 = AbstractC2549y.X(i15, (AbstractC2534q) object3);
                            } else {
                                m02 = AbstractC2549y.m0(i15, (String) object3);
                            }
                            i12 = m02 + i12;
                            break;
                        }
                    case 60:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2507g1.o(i15, q(i11), unsafe.getObject(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 61:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.X(i15, (AbstractC2534q) unsafe.getObject(obj, j6));
                            i12 += Z10;
                            break;
                        }
                    case 62:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.p0(i15, H(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 63:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.a0(i15, H(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 64:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.i0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 65:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.j0(i15);
                            i12 += Z10;
                            break;
                        }
                    case 66:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.k0(i15, H(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 67:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.l0(i15, I(j6, obj));
                            i12 += Z10;
                            break;
                        }
                    case 68:
                        if (!w(i15, obj, i11)) {
                            break;
                        } else {
                            Z10 = AbstractC2549y.e0(i15, (M0) unsafe.getObject(obj, j6), q(i11));
                            i12 += Z10;
                            break;
                        }
                }
                i11 += 3;
            } else {
                this.f27484n.getClass();
                int c10 = ((AbstractC2497d0) obj).unknownFields.c() + i12;
                if (this.f27476f) {
                    this.f27485o.getClass();
                    return c10 + K.b(obj).h();
                }
                return c10;
            }
        }
    }

    public final int t(Object obj) {
        int Z10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f27471a;
            if (i10 < iArr.length) {
                int Z11 = Z(i10);
                int Y7 = Y(Z11);
                int i12 = iArr[i10];
                long j6 = Z11 & 1048575;
                if (Y7 >= T.DOUBLE_LIST_PACKED.a() && Y7 <= T.SINT64_LIST_PACKED.a()) {
                    int i13 = iArr[i10 + 2];
                }
                Unsafe unsafe = f27470r;
                switch (Y7) {
                    case 0:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.Z(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 1:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.d0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 2:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.h0(i12, C1.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 3:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.r0(i12, C1.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 4:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.f0(i12, C1.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 5:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.c0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 6:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.b0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 7:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.W(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 8:
                        if (u(i10, obj)) {
                            Object l10 = C1.l(j6, obj);
                            if (l10 instanceof AbstractC2534q) {
                                Z10 = AbstractC2549y.X(i12, (AbstractC2534q) l10);
                                break;
                            } else {
                                Z10 = AbstractC2549y.m0(i12, (String) l10);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 9:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2507g1.o(i12, q(i10), C1.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 10:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.X(i12, (AbstractC2534q) C1.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 11:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.p0(i12, C1.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 12:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.a0(i12, C1.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 13:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.i0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 14:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.j0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 15:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.k0(i12, C1.j(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 16:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.l0(i12, C1.k(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 17:
                        if (u(i10, obj)) {
                            Z10 = AbstractC2549y.e0(i12, (M0) C1.l(j6, obj), q(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 18:
                        Z10 = AbstractC2507g1.h(i12, x(j6, obj));
                        break;
                    case 19:
                        Z10 = AbstractC2507g1.f(i12, x(j6, obj));
                        break;
                    case 20:
                        Z10 = AbstractC2507g1.m(i12, x(j6, obj));
                        break;
                    case 21:
                        Z10 = AbstractC2507g1.x(i12, x(j6, obj));
                        break;
                    case 22:
                        Z10 = AbstractC2507g1.k(i12, x(j6, obj));
                        break;
                    case 23:
                        Z10 = AbstractC2507g1.h(i12, x(j6, obj));
                        break;
                    case 24:
                        Z10 = AbstractC2507g1.f(i12, x(j6, obj));
                        break;
                    case 25:
                        Z10 = AbstractC2507g1.a(i12, x(j6, obj));
                        break;
                    case 26:
                        Z10 = AbstractC2507g1.u(i12, x(j6, obj));
                        break;
                    case 27:
                        Z10 = AbstractC2507g1.p(i12, x(j6, obj), q(i10));
                        break;
                    case 28:
                        Z10 = AbstractC2507g1.c(i12, x(j6, obj));
                        break;
                    case 29:
                        Z10 = AbstractC2507g1.v(i12, x(j6, obj));
                        break;
                    case 30:
                        Z10 = AbstractC2507g1.d(i12, x(j6, obj));
                        break;
                    case 31:
                        Z10 = AbstractC2507g1.f(i12, x(j6, obj));
                        break;
                    case 32:
                        Z10 = AbstractC2507g1.h(i12, x(j6, obj));
                        break;
                    case 33:
                        Z10 = AbstractC2507g1.q(i12, x(j6, obj));
                        break;
                    case 34:
                        Z10 = AbstractC2507g1.s(i12, x(j6, obj));
                        break;
                    case 35:
                        int i14 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i14 > 0) {
                            i11 = AbstractC2469q0.e(i14, AbstractC2549y.o0(i12), i14, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 36:
                        int g10 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g10 > 0) {
                            i11 = AbstractC2469q0.e(g10, AbstractC2549y.o0(i12), g10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 37:
                        int n10 = AbstractC2507g1.n((List) unsafe.getObject(obj, j6));
                        if (n10 > 0) {
                            i11 = AbstractC2469q0.e(n10, AbstractC2549y.o0(i12), n10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 38:
                        int y10 = AbstractC2507g1.y((List) unsafe.getObject(obj, j6));
                        if (y10 > 0) {
                            i11 = AbstractC2469q0.e(y10, AbstractC2549y.o0(i12), y10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 39:
                        int l11 = AbstractC2507g1.l((List) unsafe.getObject(obj, j6));
                        if (l11 > 0) {
                            i11 = AbstractC2469q0.e(l11, AbstractC2549y.o0(i12), l11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 40:
                        int i15 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i15 > 0) {
                            i11 = AbstractC2469q0.e(i15, AbstractC2549y.o0(i12), i15, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 41:
                        int g11 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g11 > 0) {
                            i11 = AbstractC2469q0.e(g11, AbstractC2549y.o0(i12), g11, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 42:
                        int b10 = AbstractC2507g1.b((List) unsafe.getObject(obj, j6));
                        if (b10 > 0) {
                            i11 = AbstractC2469q0.e(b10, AbstractC2549y.o0(i12), b10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 43:
                        int w10 = AbstractC2507g1.w((List) unsafe.getObject(obj, j6));
                        if (w10 > 0) {
                            i11 = AbstractC2469q0.e(w10, AbstractC2549y.o0(i12), w10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 44:
                        int e10 = AbstractC2507g1.e((List) unsafe.getObject(obj, j6));
                        if (e10 > 0) {
                            i11 = AbstractC2469q0.e(e10, AbstractC2549y.o0(i12), e10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 45:
                        int g12 = AbstractC2507g1.g((List) unsafe.getObject(obj, j6));
                        if (g12 > 0) {
                            i11 = AbstractC2469q0.e(g12, AbstractC2549y.o0(i12), g12, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 46:
                        int i16 = AbstractC2507g1.i((List) unsafe.getObject(obj, j6));
                        if (i16 > 0) {
                            i11 = AbstractC2469q0.e(i16, AbstractC2549y.o0(i12), i16, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 47:
                        int r10 = AbstractC2507g1.r((List) unsafe.getObject(obj, j6));
                        if (r10 > 0) {
                            i11 = AbstractC2469q0.e(r10, AbstractC2549y.o0(i12), r10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case r9.y.f44626f /* 48 */:
                        int t10 = AbstractC2507g1.t((List) unsafe.getObject(obj, j6));
                        if (t10 > 0) {
                            i11 = AbstractC2469q0.e(t10, AbstractC2549y.o0(i12), t10, i11);
                        } else {
                            continue;
                        }
                        i10 += 3;
                    case 49:
                        Z10 = AbstractC2507g1.j(i12, x(j6, obj), q(i10));
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        Object l12 = C1.l(j6, obj);
                        Object p10 = p(i10);
                        this.f27486p.getClass();
                        Z10 = H0.c(l12, i12, p10);
                        break;
                    case 51:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.Z(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 52:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.d0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 53:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.h0(i12, I(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 54:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.r0(i12, I(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 55:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.f0(i12, H(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 56:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.c0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 57:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.b0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 58:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.W(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 59:
                        if (w(i12, obj, i10)) {
                            Object l13 = C1.l(j6, obj);
                            if (l13 instanceof AbstractC2534q) {
                                Z10 = AbstractC2549y.X(i12, (AbstractC2534q) l13);
                                break;
                            } else {
                                Z10 = AbstractC2549y.m0(i12, (String) l13);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 60:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2507g1.o(i12, q(i10), C1.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 61:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.X(i12, (AbstractC2534q) C1.l(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 62:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.p0(i12, H(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 63:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.a0(i12, H(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 64:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.i0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 65:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.j0(i12);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 66:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.k0(i12, H(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 67:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.l0(i12, I(j6, obj));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    case 68:
                        if (w(i12, obj, i10)) {
                            Z10 = AbstractC2549y.e0(i12, (M0) C1.l(j6, obj), q(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                        }
                    default:
                        i10 += 3;
                }
                i11 = Z10 + i11;
                i10 += 3;
            } else {
                this.f27484n.getClass();
                return ((AbstractC2497d0) obj).unknownFields.c() + i11;
            }
        }
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.f27471a[i10 + 2];
        long j6 = i11 & 1048575;
        if (j6 == 1048575) {
            int Z10 = Z(i10);
            long j10 = Z10 & 1048575;
            switch (Y(Z10)) {
                case 0:
                    if (Double.doubleToRawLongBits(C1.f27385c.g(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C1.f27385c.h(j10, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C1.f27385c.j(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C1.f27385c.j(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C1.f27385c.j(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C1.f27385c.d(j10, obj);
                case 8:
                    Object k10 = C1.f27385c.k(j10, obj);
                    if (k10 instanceof String) {
                        return !((String) k10).isEmpty();
                    }
                    if (k10 instanceof AbstractC2534q) {
                        return !AbstractC2534q.f27581Z.equals(k10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C1.f27385c.k(j10, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC2534q.f27581Z.equals(C1.f27385c.k(j10, obj));
                case 11:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C1.f27385c.j(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C1.f27385c.i(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C1.f27385c.j(j10, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C1.f27385c.k(j10, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & C1.f27385c.i(j6, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean w(int i10, Object obj, int i11) {
        if (C1.f27385c.i(this.f27471a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r14 >= r13) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        n(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r7 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r18.getClass();
        com.google.protobuf.w1.d(r20, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r14 >= r13) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
        n(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r7 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        com.google.protobuf.w1.d(r20, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
        if (r14 >= r13) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ce, code lost:
        n(r20, r12[r14], r7);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
        if (r7 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
        com.google.protobuf.w1.d(r20, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00db, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0532 A[LOOP:4: B:148:0x0530->B:149:0x0532, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x053c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(w1 w1Var, K k10, Object obj, T0.m mVar, J j6) {
        Throwable th2;
        Object obj2;
        int i10;
        C2491b0 c2491b0;
        int[] iArr = this.f27479i;
        int i11 = this.f27481k;
        int i12 = this.f27480j;
        Object obj3 = null;
        S s10 = null;
        while (true) {
            try {
                int w10 = mVar.w();
                try {
                    if (w10 >= this.f27473c && w10 <= this.f27474d) {
                        i10 = V(w10, 0);
                    } else {
                        i10 = -1;
                    }
                    int i13 = i10;
                    if (i13 < 0) {
                        if (w10 == Integer.MAX_VALUE) {
                            break;
                        }
                        if (!this.f27476f) {
                            c2491b0 = null;
                        } else {
                            M0 m02 = this.f27475e;
                            try {
                                k10.getClass();
                                c2491b0 = j6.a(w10, m02);
                            } catch (Throwable th3) {
                                th2 = th3;
                                obj2 = obj3;
                                obj3 = obj2;
                                while (i12 < i11) {
                                }
                                if (obj3 != null) {
                                }
                                throw th2;
                            }
                        }
                        if (c2491b0 != null) {
                            if (s10 == null) {
                                try {
                                    k10.getClass();
                                    s10 = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    while (i12 < i11) {
                                        n(obj, iArr[i12], obj3);
                                        i12++;
                                    }
                                    if (obj3 != null) {
                                        w1Var.getClass();
                                        w1.d(obj, obj3);
                                    }
                                    throw th2;
                                }
                            }
                            k10.getClass();
                            obj2 = obj3;
                            try {
                                obj3 = K.d(obj, mVar, c2491b0, j6, s10, obj3, w1Var);
                            } catch (Throwable th5) {
                                th2 = th5;
                                obj3 = obj2;
                                while (i12 < i11) {
                                }
                                if (obj3 != null) {
                                }
                                throw th2;
                            }
                        } else {
                            Object obj4 = obj3;
                            w1Var.getClass();
                            if (obj4 == null) {
                                obj3 = w1.a(obj);
                            } else {
                                obj3 = obj4;
                            }
                            if (w1.c(obj3, mVar)) {
                            }
                        }
                    } else {
                        Object obj5 = obj3;
                        int Z10 = Z(i13);
                        try {
                            int Y7 = Y(Z10);
                            AbstractC2552z0 abstractC2552z0 = this.f27483m;
                            switch (Y7) {
                                case 0:
                                    C1.r(obj, G(Z10), mVar.readDouble());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 1:
                                    C1.s(obj, G(Z10), mVar.readFloat());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 2:
                                    C1.u(obj, G(Z10), mVar.I());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 3:
                                    C1.u(obj, G(Z10), mVar.c());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 4:
                                    C1.t(G(Z10), obj, mVar.B());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 5:
                                    C1.u(obj, G(Z10), mVar.d());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 6:
                                    C1.t(G(Z10), obj, mVar.h());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 7:
                                    C1.n(obj, G(Z10), mVar.i());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 8:
                                    Q(obj, Z10, mVar);
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 9:
                                    M0 m03 = (M0) C(i13, obj);
                                    AbstractC2504f1 q10 = q(i13);
                                    mVar.e0(2);
                                    mVar.S(m03, q10, j6);
                                    W(obj, i13, m03);
                                    obj3 = obj5;
                                    break;
                                case 10:
                                    C1.v(G(Z10), obj, mVar.V());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 11:
                                    C1.t(G(Z10), obj, mVar.l());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 12:
                                    int q11 = mVar.q();
                                    o(i13);
                                    C1.t(G(Z10), obj, q11);
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 13:
                                    C1.t(G(Z10), obj, mVar.D());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 14:
                                    C1.u(obj, G(Z10), mVar.j());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 15:
                                    C1.t(G(Z10), obj, mVar.s());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 16:
                                    C1.u(obj, G(Z10), mVar.t());
                                    T(i13, obj);
                                    obj3 = obj5;
                                    break;
                                case 17:
                                    M0 m04 = (M0) C(i13, obj);
                                    mVar.O(m04, q(i13), j6);
                                    W(obj, i13, m04);
                                    obj3 = obj5;
                                    break;
                                case 18:
                                    mVar.F(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 19:
                                    mVar.A(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 20:
                                    mVar.m(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 21:
                                    mVar.k(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 22:
                                    mVar.o(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 23:
                                    mVar.K(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 24:
                                    mVar.r(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 25:
                                    mVar.u(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 26:
                                    R(obj, Z10, mVar);
                                    obj3 = obj5;
                                    break;
                                case 27:
                                    P(obj, Z10, mVar, q(i13), j6);
                                    obj3 = obj5;
                                    break;
                                case 28:
                                    mVar.E(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 29:
                                    mVar.g(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 30:
                                    List c10 = abstractC2552z0.c(G(Z10), obj);
                                    mVar.p(c10);
                                    o(i13);
                                    AbstractC2507g1.A(obj, w10, c10, obj5, w1Var);
                                    obj3 = obj5;
                                    break;
                                case 31:
                                    mVar.e(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 32:
                                    mVar.n(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 33:
                                    mVar.b(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 34:
                                    mVar.f(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 35:
                                    mVar.F(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 36:
                                    mVar.A(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 37:
                                    mVar.m(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 38:
                                    mVar.k(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 39:
                                    mVar.o(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 40:
                                    mVar.K(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 41:
                                    mVar.r(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 42:
                                    mVar.u(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 43:
                                    mVar.g(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 44:
                                    List c11 = abstractC2552z0.c(G(Z10), obj);
                                    mVar.p(c11);
                                    o(i13);
                                    AbstractC2507g1.A(obj, w10, c11, obj5, w1Var);
                                    obj3 = obj5;
                                    break;
                                case 45:
                                    mVar.e(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 46:
                                    mVar.n(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 47:
                                    mVar.b(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case r9.y.f44626f /* 48 */:
                                    mVar.f(abstractC2552z0.c(G(Z10), obj));
                                    obj3 = obj5;
                                    break;
                                case 49:
                                    O(obj, G(Z10), mVar, q(i13), j6);
                                    obj3 = obj5;
                                    break;
                                case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                    z(obj, i13, p(i13), j6, mVar);
                                    obj3 = obj5;
                                    break;
                                case 51:
                                    C1.v(G(Z10), obj, Double.valueOf(mVar.readDouble()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 52:
                                    C1.v(G(Z10), obj, Float.valueOf(mVar.readFloat()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 53:
                                    C1.v(G(Z10), obj, Long.valueOf(mVar.I()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 54:
                                    C1.v(G(Z10), obj, Long.valueOf(mVar.c()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 55:
                                    C1.v(G(Z10), obj, Integer.valueOf(mVar.B()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 56:
                                    C1.v(G(Z10), obj, Long.valueOf(mVar.d()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 57:
                                    C1.v(G(Z10), obj, Integer.valueOf(mVar.h()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 58:
                                    C1.v(G(Z10), obj, Boolean.valueOf(mVar.i()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 59:
                                    Q(obj, Z10, mVar);
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 60:
                                    M0 m05 = (M0) D(w10, obj, i13);
                                    AbstractC2504f1 q12 = q(i13);
                                    mVar.e0(2);
                                    mVar.S(m05, q12, j6);
                                    X(w10, obj, m05, i13);
                                    obj3 = obj5;
                                    break;
                                case 61:
                                    C1.v(G(Z10), obj, mVar.V());
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 62:
                                    C1.v(G(Z10), obj, Integer.valueOf(mVar.l()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 63:
                                    int q13 = mVar.q();
                                    o(i13);
                                    C1.v(G(Z10), obj, Integer.valueOf(q13));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 64:
                                    C1.v(G(Z10), obj, Integer.valueOf(mVar.D()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 65:
                                    C1.v(G(Z10), obj, Long.valueOf(mVar.j()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 66:
                                    C1.v(G(Z10), obj, Integer.valueOf(mVar.s()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 67:
                                    C1.v(G(Z10), obj, Long.valueOf(mVar.t()));
                                    U(w10, obj, i13);
                                    obj3 = obj5;
                                    break;
                                case 68:
                                    M0 m06 = (M0) D(w10, obj, i13);
                                    mVar.O(m06, q(i13), j6);
                                    X(w10, obj, m06, i13);
                                    obj3 = obj5;
                                    break;
                                default:
                                    if (obj5 == null) {
                                        w1Var.getClass();
                                        obj3 = w1.a(obj);
                                    } else {
                                        obj3 = obj5;
                                    }
                                    try {
                                        w1Var.getClass();
                                        if (!w1.c(obj3, mVar)) {
                                            break;
                                        }
                                    } catch (C2538s0 unused) {
                                        w1Var.getClass();
                                        if (obj3 == null) {
                                            obj3 = w1.a(obj);
                                        }
                                        if (!w1.c(obj3, mVar)) {
                                            while (i12 < i11) {
                                                n(obj, iArr[i12], obj3);
                                                i12++;
                                            }
                                            if (obj3 != null) {
                                                w1.d(obj, obj3);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (C2538s0 unused2) {
                            obj3 = obj5;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                }
            } catch (Throwable th7) {
                th2 = th7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r8.put(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
        ((com.google.protobuf.AbstractC2543v) r11.f16800e).k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Object obj, int i10, Object obj2, J j6, T0.m mVar) {
        long Z10 = Z(i10) & 1048575;
        Object k10 = C1.f27385c.k(Z10, obj);
        H0 h02 = this.f27486p;
        if (k10 == null) {
            h02.getClass();
            k10 = G0.f27399Z.c();
            C1.v(Z10, obj, k10);
        } else {
            h02.getClass();
            if (H0.d(k10)) {
                G0 c10 = G0.f27399Z.c();
                H0.e(c10, k10);
                C1.v(Z10, obj, c10);
                k10 = c10;
            }
        }
        h02.getClass();
        G0 g02 = (G0) k10;
        U3.i iVar = ((F0) obj2).f27395a;
        mVar.e0(2);
        int l10 = ((AbstractC2543v) mVar.f16800e).l(((AbstractC2543v) mVar.f16800e).G());
        Object obj3 = iVar.f17415Z;
        Object obj4 = iVar.f17417i0;
        while (true) {
            try {
                int w10 = mVar.w();
                if (w10 == Integer.MAX_VALUE || ((AbstractC2543v) mVar.f16800e).g()) {
                    break;
                } else if (w10 != 1) {
                    if (w10 != 2) {
                        try {
                            if (!mVar.g0()) {
                                throw new IOException("Unable to parse map entry.");
                                break;
                            }
                        } catch (C2538s0 unused) {
                            if (!mVar.g0()) {
                                throw new IOException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj4 = mVar.W((N1) iVar.f17416h0, iVar.f17417i0.getClass(), j6);
                    }
                } else {
                    obj3 = mVar.W((N1) iVar.f17414Y, null, null);
                }
            } catch (Throwable th2) {
                ((AbstractC2543v) mVar.f16800e).k(l10);
                throw th2;
            }
        }
    }
}
