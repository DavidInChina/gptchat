package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2508h {

    /* renamed from: a  reason: collision with root package name */
    public static final C2513i1 f27551a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C2516j1 f27552b = new Object();

    public static int A(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            L10 = L(bArr, L10, a5);
            c2506g0.s(a5.f26821a);
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int B(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            L10 = N(bArr, L10, a5);
            b02.s(a5.f26822b);
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int C(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        int L10 = L(bArr, i11, a5);
        c2506g0.s(AbstractC2543v.c(a5.f26821a));
        while (L10 < i12) {
            int L11 = L(bArr, L10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            L10 = L(bArr, L11, a5);
            c2506g0.s(AbstractC2543v.c(a5.f26821a));
        }
        return L10;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        int N10 = N(bArr, i11, a5);
        b02.s(AbstractC2543v.d(a5.f26822b));
        while (N10 < i12) {
            int L10 = L(bArr, N10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            N10 = N(bArr, L10, a5);
            b02.s(AbstractC2543v.d(a5.f26822b));
        }
        return N10;
    }

    public static int E(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a;
        if (i11 >= 0) {
            if (i11 == 0) {
                a5.f26823c = "";
                return L10;
            }
            a5.f26823c = new String(bArr, L10, i11, AbstractC2536r0.f27584a);
            return L10 + i11;
        }
        throw C2540t0.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int F(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = L(bArr, i11, a5);
        int i13 = a5.f26821a;
        if (i13 >= 0) {
            if (i13 == 0) {
                abstractC2535q0.add("");
                while (L10 < i12) {
                    int L11 = L(bArr, L10, a5);
                    if (i10 != a5.f26821a) {
                        break;
                    }
                    L10 = L(bArr, L11, a5);
                    i13 = a5.f26821a;
                    if (i13 >= 0) {
                        if (i13 == 0) {
                            abstractC2535q0.add("");
                        } else {
                            abstractC2535q0.add(new String(bArr, L10, i13, AbstractC2536r0.f27584a));
                            L10 += i13;
                            while (L10 < i12) {
                            }
                        }
                    } else {
                        throw C2540t0.e();
                    }
                }
                return L10;
            }
            abstractC2535q0.add(new String(bArr, L10, i13, AbstractC2536r0.f27584a));
            L10 += i13;
            while (L10 < i12) {
            }
            return L10;
        }
        throw C2540t0.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0025). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int G(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        int i13;
        int L10 = L(bArr, i11, a5);
        int i14 = a5.f26821a;
        if (i14 >= 0) {
            if (i14 == 0) {
                abstractC2535q0.add("");
                while (L10 < i12) {
                    int L11 = L(bArr, L10, a5);
                    if (i10 != a5.f26821a) {
                        break;
                    }
                    L10 = L(bArr, L11, a5);
                    int i15 = a5.f26821a;
                    if (i15 >= 0) {
                        if (i15 == 0) {
                            abstractC2535q0.add("");
                        } else {
                            i13 = L10 + i15;
                            if (F1.f27398a.Z(L10, i13, bArr) == 0) {
                                abstractC2535q0.add(new String(bArr, L10, i15, AbstractC2536r0.f27584a));
                                L10 = i13;
                                while (L10 < i12) {
                                }
                            } else {
                                throw C2540t0.b();
                            }
                        }
                    } else {
                        throw C2540t0.e();
                    }
                }
                return L10;
            }
            i13 = L10 + i14;
            if (F1.f27398a.Z(L10, i13, bArr) == 0) {
                abstractC2535q0.add(new String(bArr, L10, i14, AbstractC2536r0.f27584a));
                L10 = i13;
                while (L10 < i12) {
                }
                return L10;
            }
            throw C2540t0.b();
        }
        throw C2540t0.e();
    }

    public static int H(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a;
        if (i11 >= 0) {
            if (i11 == 0) {
                a5.f26823c = "";
                return L10;
            }
            a5.f26823c = F1.f27398a.W(bArr, L10, i11);
            return L10 + i11;
        }
        throw C2540t0.e();
    }

    public static int I(int i10, byte[] bArr, int i11, int i12, v1 v1Var, com.google.android.gms.internal.play_billing.A a5) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                v1Var.f(i10, Integer.valueOf(k(i11, bArr)));
                                return i11 + 4;
                            }
                            throw C2540t0.a();
                        }
                        v1 v1Var2 = new v1();
                        int i14 = (i10 & (-8)) | 4;
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int L10 = L(bArr, i11, a5);
                            int i16 = a5.f26821a;
                            if (i16 == i14) {
                                i15 = i16;
                                i11 = L10;
                                break;
                            }
                            i15 = i16;
                            i11 = I(i16, bArr, L10, i12, v1Var2, a5);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            v1Var.f(i10, v1Var2);
                            return i11;
                        }
                        throw C2540t0.f();
                    }
                    int L11 = L(bArr, i11, a5);
                    int i17 = a5.f26821a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - L11) {
                            if (i17 == 0) {
                                v1Var.f(i10, AbstractC2534q.f27581Z);
                            } else {
                                v1Var.f(i10, AbstractC2534q.s(bArr, L11, i17));
                            }
                            return L11 + i17;
                        }
                        throw C2540t0.g();
                    }
                    throw C2540t0.e();
                }
                v1Var.f(i10, Long.valueOf(m(i11, bArr)));
                return i11 + 8;
            }
            int N10 = N(bArr, i11, a5);
            v1Var.f(i10, Long.valueOf(a5.f26822b));
            return N10;
        }
        throw C2540t0.a();
    }

    public static String J(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!b(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (b(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    while (i15 < i12) {
                        byte b12 = byteBuffer.get(i15);
                        if (!b(b12)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (b11 < -32) {
                    if (i15 < i12) {
                        i10 += 2;
                        c(b11, byteBuffer.get(i15), cArr, i14);
                        i14++;
                    } else {
                        throw C2540t0.b();
                    }
                } else if (b11 < -16) {
                    if (i15 < i12 - 1) {
                        int i17 = i10 + 2;
                        i10 += 3;
                        d(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        i14++;
                    } else {
                        throw C2540t0.b();
                    }
                } else if (i15 < i12 - 2) {
                    byte b13 = byteBuffer.get(i15);
                    int i18 = i10 + 3;
                    i10 += 4;
                    a(b11, b13, byteBuffer.get(i10 + 2), byteBuffer.get(i18), cArr, i14);
                    i14 += 2;
                } else {
                    throw C2540t0.b();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static int K(int i10, byte[] bArr, int i11, com.google.android.gms.internal.play_billing.A a5) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            a5.f26821a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            a5.f26821a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            a5.f26821a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            a5.f26821a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                a5.f26821a = i20;
                return i21;
            }
        }
    }

    public static int L(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            a5.f26821a = b10;
            return i11;
        }
        return K(b10, bArr, i11, a5);
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        int L10 = L(bArr, i11, a5);
        c2506g0.s(a5.f26821a);
        while (L10 < i12) {
            int L11 = L(bArr, L10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            L10 = L(bArr, L11, a5);
            c2506g0.s(a5.f26821a);
        }
        return L10;
    }

    public static int N(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        byte b10;
        int i11 = i10 + 1;
        long j6 = bArr[i10];
        if (j6 >= 0) {
            a5.f26822b = j6;
            return i11;
        }
        int i12 = i10 + 2;
        byte b11 = bArr[i11];
        long j10 = (j6 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        a5.f26822b = j10;
        return i12;
    }

    public static int O(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        int N10 = N(bArr, i11, a5);
        b02.s(a5.f26822b);
        while (N10 < i12) {
            int L10 = L(bArr, N10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            N10 = N(bArr, L10, a5);
            b02.s(a5.f26822b);
        }
        return N10;
    }

    public static String P(AbstractC2534q abstractC2534q) {
        StringBuilder sb2 = new StringBuilder(abstractC2534q.size());
        for (int i10 = 0; i10 < abstractC2534q.size(); i10++) {
            byte f6 = abstractC2534q.f(i10);
            if (f6 != 34) {
                if (f6 != 39) {
                    if (f6 != 92) {
                        switch (f6) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (f6 >= 32 && f6 <= 126) {
                                    sb2.append((char) f6);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((f6 >>> 6) & 3) + 48));
                                    sb2.append((char) (((f6 >>> 3) & 7) + 48));
                                    sb2.append((char) ((f6 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static boolean Q(byte b10) {
        return b10 > -65;
    }

    public static int R(Object obj, AbstractC2504f1 abstractC2504f1, byte[] bArr, int i10, int i11, int i12, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = ((P0) abstractC2504f1).L(obj, bArr, i10, i11, i12, a5);
        a5.f26823c = obj;
        return L10;
    }

    public static int S(Object obj, AbstractC2504f1 abstractC2504f1, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = K(i13, bArr, i12, a5);
            i13 = a5.f26821a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            abstractC2504f1.h(obj, bArr, i14, i15, a5);
            a5.f26823c = obj;
            return i15;
        }
        throw C2540t0.g();
    }

    public static Object T(AbstractC2543v abstractC2543v, N1 n12, int i10) {
        switch (n12.ordinal()) {
            case 0:
                return Double.valueOf(abstractC2543v.o());
            case 1:
                return Float.valueOf(abstractC2543v.s());
            case 2:
                return Long.valueOf(abstractC2543v.v());
            case 3:
                return Long.valueOf(abstractC2543v.H());
            case 4:
                return Integer.valueOf(abstractC2543v.u());
            case 5:
                return Long.valueOf(abstractC2543v.r());
            case 6:
                return Integer.valueOf(abstractC2543v.q());
            case 7:
                return Boolean.valueOf(abstractC2543v.m());
            case 8:
                return AbstractC2469q0.c(i10, abstractC2543v);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return abstractC2543v.n();
            case 12:
                return Integer.valueOf(abstractC2543v.G());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(abstractC2543v.z());
            case 15:
                return Long.valueOf(abstractC2543v.A());
            case 16:
                return Integer.valueOf(abstractC2543v.B());
            case 17:
                return Long.valueOf(abstractC2543v.C());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int U(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.A a5) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                return i11 + 4;
                            }
                            throw C2540t0.a();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        int i15 = 0;
                        while (i11 < i12) {
                            i11 = L(bArr, i11, a5);
                            i15 = a5.f26821a;
                            if (i15 == i14) {
                                break;
                            }
                            i11 = U(i15, bArr, i11, i12, a5);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            return i11;
                        }
                        throw C2540t0.f();
                    }
                    return L(bArr, i11, a5) + a5.f26821a;
                }
                return i11 + 8;
            }
            return N(bArr, i11, a5);
        }
        throw C2540t0.a();
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!Q(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !Q(b12) && !Q(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw C2540t0.b();
    }

    public static boolean b(byte b10) {
        return b10 >= 0;
    }

    public static void c(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !Q(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw C2540t0.b();
    }

    public static void d(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!Q(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !Q(b12)))) {
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw C2540t0.b();
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        boolean z10;
        boolean z11;
        C2514j c2514j = (C2514j) abstractC2535q0;
        int N10 = N(bArr, i11, a5);
        if (a5.f26822b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2514j.s(z10);
        while (N10 < i12) {
            int L10 = L(bArr, N10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            N10 = N(bArr, L10, a5);
            if (a5.f26822b != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c2514j.s(z11);
        }
        return N10;
    }

    public static int f(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - L10) {
                if (i11 == 0) {
                    a5.f26823c = AbstractC2534q.f27581Z;
                    return L10;
                }
                a5.f26823c = AbstractC2534q.s(bArr, L10, i11);
                return L10 + i11;
            }
            throw C2540t0.g();
        }
        throw C2540t0.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        int L10 = L(bArr, i11, a5);
        int i13 = a5.f26821a;
        if (i13 >= 0) {
            if (i13 <= bArr.length - L10) {
                if (i13 == 0) {
                    abstractC2535q0.add(AbstractC2534q.f27581Z);
                    while (L10 < i12) {
                        int L11 = L(bArr, L10, a5);
                        if (i10 != a5.f26821a) {
                            break;
                        }
                        L10 = L(bArr, L11, a5);
                        i13 = a5.f26821a;
                        if (i13 >= 0) {
                            if (i13 <= bArr.length - L10) {
                                if (i13 == 0) {
                                    abstractC2535q0.add(AbstractC2534q.f27581Z);
                                } else {
                                    abstractC2535q0.add(AbstractC2534q.s(bArr, L10, i13));
                                    L10 += i13;
                                    while (L10 < i12) {
                                    }
                                }
                            } else {
                                throw C2540t0.g();
                            }
                        } else {
                            throw C2540t0.e();
                        }
                    }
                    return L10;
                }
                abstractC2535q0.add(AbstractC2534q.s(bArr, L10, i13));
                L10 += i13;
                while (L10 < i12) {
                }
                return L10;
            }
            throw C2540t0.g();
        }
        throw C2540t0.e();
    }

    public static double h(int i10, byte[] bArr) {
        return Double.longBitsToDouble(m(i10, bArr));
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2551z c2551z = (C2551z) abstractC2535q0;
        c2551z.s(h(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int L10 = L(bArr, i13, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            c2551z.s(Double.longBitsToDouble(m(L10, bArr)));
            i13 = L10 + 8;
        }
        return i13;
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, Object obj, M0 m02, w1 w1Var, com.google.android.gms.internal.play_billing.A a5) {
        int i13;
        int i14 = i10 >>> 3;
        C2491b0 a10 = ((J) a5.f26824d).a(i14, m02);
        if (a10 == null) {
            return I(i10, bArr, i11, i12, P0.r(obj), a5);
        }
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
        S s10 = generatedMessageLite$ExtendableMessage.extensions;
        C2488a0 c2488a0 = a10.f27522d;
        boolean z10 = c2488a0.f27517i0;
        N1 n12 = c2488a0.f27516h0;
        boolean z11 = false;
        if (z10 && c2488a0.f27518j0) {
            switch (n12.ordinal()) {
                case 0:
                    C2551z c2551z = new C2551z(0, new double[10]);
                    int u10 = u(bArr, i11, c2551z, a5);
                    s10.p(c2488a0, c2551z);
                    return u10;
                case 1:
                    U u11 = new U(0, new float[10]);
                    int x10 = x(bArr, i11, u11, a5);
                    s10.p(c2488a0, u11);
                    return x10;
                case 2:
                case 3:
                    B0 b02 = new B0();
                    int B10 = B(bArr, i11, b02, a5);
                    s10.p(c2488a0, b02);
                    return B10;
                case 4:
                case 12:
                    C2506g0 c2506g0 = new C2506g0();
                    int A10 = A(bArr, i11, c2506g0, a5);
                    s10.p(c2488a0, c2506g0);
                    return A10;
                case 5:
                case 15:
                    B0 b03 = new B0();
                    int w10 = w(bArr, i11, b03, a5);
                    s10.p(c2488a0, b03);
                    return w10;
                case 6:
                case 14:
                    C2506g0 c2506g02 = new C2506g0();
                    int v10 = v(bArr, i11, c2506g02, a5);
                    s10.p(c2488a0, c2506g02);
                    return v10;
                case 7:
                    C2514j c2514j = new C2514j(new boolean[10], 0);
                    int t10 = t(bArr, i11, c2514j, a5);
                    s10.p(c2488a0, c2514j);
                    return t10;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + n12);
                case 13:
                    C2506g0 c2506g03 = new C2506g0();
                    int A11 = A(bArr, i11, c2506g03, a5);
                    AbstractC2507g1.z(generatedMessageLite$ExtendableMessage, i14, c2506g03, c2488a0.f27514Y, null, w1Var);
                    s10.p(c2488a0, c2506g03);
                    return A11;
                case 16:
                    C2506g0 c2506g04 = new C2506g0();
                    int y10 = y(bArr, i11, c2506g04, a5);
                    s10.p(c2488a0, c2506g04);
                    return y10;
                case 17:
                    B0 b04 = new B0();
                    int z12 = z(bArr, i11, b04, a5);
                    s10.p(c2488a0, b04);
                    return z12;
            }
        }
        N1 n13 = N1.ENUM;
        boolean z13 = c2488a0.f27517i0;
        Object obj2 = null;
        if (n12 == n13) {
            int L10 = L(bArr, i11, a5);
            if (c2488a0.f27514Y.a(a5.f26821a) == null) {
                AbstractC2507g1.E(generatedMessageLite$ExtendableMessage, i14, a5.f26821a, null, w1Var);
                return L10;
            }
            obj2 = Integer.valueOf(a5.f26821a);
            i13 = L10;
        } else {
            int ordinal = n12.ordinal();
            M0 m03 = a10.f27521c;
            switch (ordinal) {
                case 0:
                    obj2 = Double.valueOf(h(i11, bArr));
                    i13 = i11 + 8;
                    break;
                case 1:
                    obj2 = Float.valueOf(o(i11, bArr));
                    i13 = i11 + 4;
                    break;
                case 2:
                case 3:
                    i13 = N(bArr, i11, a5);
                    obj2 = Long.valueOf(a5.f26822b);
                    break;
                case 4:
                case 12:
                    i13 = L(bArr, i11, a5);
                    obj2 = Integer.valueOf(a5.f26821a);
                    break;
                case 5:
                case 15:
                    obj2 = Long.valueOf(m(i11, bArr));
                    i13 = i11 + 8;
                    break;
                case 6:
                case 14:
                    obj2 = Integer.valueOf(k(i11, bArr));
                    i13 = i11 + 4;
                    break;
                case 7:
                    i13 = N(bArr, i11, a5);
                    if (a5.f26822b != 0) {
                        z11 = true;
                    }
                    obj2 = Boolean.valueOf(z11);
                    break;
                case 8:
                    i13 = E(bArr, i11, a5);
                    obj2 = a5.f26823c;
                    break;
                case 9:
                    int i15 = (i14 << 3) | 4;
                    AbstractC2504f1 a11 = C2495c1.f27531c.a(m03.getClass());
                    if (z13) {
                        AbstractC2497d0 g10 = a11.g();
                        i13 = R(g10, a11, bArr, i11, i12, i15, a5);
                        a11.d(g10);
                        a5.f26823c = g10;
                        s10.a(c2488a0, g10);
                        break;
                    } else {
                        Object obj3 = s10.f27492a.get(c2488a0);
                        if (obj3 == null) {
                            obj3 = a11.g();
                            s10.p(c2488a0, obj3);
                        }
                        i13 = R(obj3, a11, bArr, i11, i12, i15, a5);
                        break;
                    }
                case 10:
                    AbstractC2504f1 a12 = C2495c1.f27531c.a(m03.getClass());
                    if (z13) {
                        i13 = r(a12, bArr, i11, i12, a5);
                        s10.a(c2488a0, a5.f26823c);
                        break;
                    } else {
                        Object obj4 = s10.f27492a.get(c2488a0);
                        if (obj4 == null) {
                            obj4 = a12.g();
                            s10.p(c2488a0, obj4);
                        }
                        i13 = S(obj4, a12, bArr, i11, i12, a5);
                        break;
                    }
                case 11:
                    i13 = f(bArr, i11, a5);
                    obj2 = a5.f26823c;
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 16:
                    i13 = L(bArr, i11, a5);
                    obj2 = Integer.valueOf(AbstractC2543v.c(a5.f26821a));
                    break;
                case 17:
                    i13 = N(bArr, i11, a5);
                    obj2 = Long.valueOf(AbstractC2543v.d(a5.f26822b));
                    break;
                default:
                    i13 = i11;
                    break;
            }
            return i13;
        }
        if (z13) {
            s10.a(c2488a0, obj2);
        } else {
            s10.p(c2488a0, obj2);
        }
        return i13;
    }

    public static int k(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        c2506g0.s(k(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int L10 = L(bArr, i13, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            c2506g0.s(k(L10, bArr));
            i13 = L10 + 4;
        }
        return i13;
    }

    public static long m(int i10, byte[] bArr) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        b02.s(m(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int L10 = L(bArr, i13, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            b02.s(m(L10, bArr));
            i13 = L10 + 8;
        }
        return i13;
    }

    public static float o(int i10, byte[] bArr) {
        return Float.intBitsToFloat(k(i10, bArr));
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        U u10 = (U) abstractC2535q0;
        u10.s(o(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int L10 = L(bArr, i13, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            u10.s(Float.intBitsToFloat(k(L10, bArr)));
            i13 = L10 + 4;
        }
        return i13;
    }

    public static int q(AbstractC2504f1 abstractC2504f1, int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        int i13 = (i10 & (-8)) | 4;
        AbstractC2497d0 g10 = abstractC2504f1.g();
        int R10 = R(g10, abstractC2504f1, bArr, i11, i12, i13, a5);
        abstractC2504f1.d(g10);
        a5.f26823c = g10;
        abstractC2535q0.add(g10);
        while (R10 < i12) {
            int L10 = L(bArr, R10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            AbstractC2497d0 g11 = abstractC2504f1.g();
            int R11 = R(g11, abstractC2504f1, bArr, L10, i12, i13, a5);
            abstractC2504f1.d(g11);
            a5.f26823c = g11;
            abstractC2535q0.add(g11);
            R10 = R11;
        }
        return R10;
    }

    public static int r(AbstractC2504f1 abstractC2504f1, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        AbstractC2497d0 g10 = abstractC2504f1.g();
        int S = S(g10, abstractC2504f1, bArr, i10, i11, a5);
        abstractC2504f1.d(g10);
        a5.f26823c = g10;
        return S;
    }

    public static int s(AbstractC2504f1 abstractC2504f1, int i10, byte[] bArr, int i11, int i12, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        int r10 = r(abstractC2504f1, bArr, i11, i12, a5);
        abstractC2535q0.add(a5.f26823c);
        while (r10 < i12) {
            int L10 = L(bArr, r10, a5);
            if (i10 != a5.f26821a) {
                break;
            }
            r10 = r(abstractC2504f1, bArr, L10, i12, a5);
            abstractC2535q0.add(a5.f26823c);
        }
        return r10;
    }

    public static int t(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        boolean z10;
        C2514j c2514j = (C2514j) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            L10 = N(bArr, L10, a5);
            if (a5.f26822b != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c2514j.s(z10);
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int u(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2551z c2551z = (C2551z) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            c2551z.s(Double.longBitsToDouble(m(L10, bArr)));
            L10 += 8;
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int v(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            c2506g0.s(k(L10, bArr));
            L10 += 4;
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int w(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            b02.s(m(L10, bArr));
            L10 += 8;
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int x(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        U u10 = (U) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            u10.s(Float.intBitsToFloat(k(L10, bArr)));
            L10 += 4;
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int y(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        C2506g0 c2506g0 = (C2506g0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            L10 = L(bArr, L10, a5);
            c2506g0.s(AbstractC2543v.c(a5.f26821a));
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public static int z(byte[] bArr, int i10, AbstractC2535q0 abstractC2535q0, com.google.android.gms.internal.play_billing.A a5) {
        B0 b02 = (B0) abstractC2535q0;
        int L10 = L(bArr, i10, a5);
        int i11 = a5.f26821a + L10;
        while (L10 < i11) {
            L10 = N(bArr, L10, a5);
            b02.s(AbstractC2543v.d(a5.f26822b));
        }
        if (L10 == i11) {
            return L10;
        }
        throw C2540t0.g();
    }

    public abstract void V(byte[] bArr, int i10, int i11);
}
