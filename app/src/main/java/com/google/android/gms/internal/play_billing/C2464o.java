package com.google.android.gms.internal.play_billing;

import N.C1025i;
import j$.util.Objects;
import java.util.Arrays;
import l8.AbstractC4344b;

/* renamed from: com.google.android.gms.internal.play_billing.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464o extends AbstractC2450h {

    /* renamed from: l0  reason: collision with root package name */
    public static final C2464o f26948l0 = new C2464o(0, null, new Object[0]);

    /* renamed from: i0  reason: collision with root package name */
    public final transient Object f26949i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient Object[] f26950j0;

    /* renamed from: k0  reason: collision with root package name */
    public final transient int f26951k0;

    public C2464o(int i10, Object obj, Object[] objArr) {
        this.f26949i0 = obj;
        this.f26950j0 = objArr;
        this.f26951k0 = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static C2464o a(int i10, Object[] objArr, C1025i c1025i) {
        int i11;
        char c10;
        char c11;
        short[] sArr;
        byte[] bArr;
        Object[] objArr2;
        int i12 = i10;
        Object[] objArr3 = objArr;
        char c12 = '\uffff';
        if (i12 == 0) {
            return f26948l0;
        }
        C2448g c2448g = null;
        Object[] objArr4 = null;
        C2448g c2448g2 = null;
        if (i12 == 1) {
            Objects.requireNonNull(objArr3[0]);
            Objects.requireNonNull(objArr3[1]);
            return new C2464o(1, null, objArr3);
        }
        A7.b.Z1(i12, objArr3.length >> 1);
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1);
            do {
                i11 += i11;
            } while (i11 * 0.7d < max);
        } else {
            i11 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Objects.requireNonNull(objArr3[0]);
            Objects.requireNonNull(objArr3[1]);
            c10 = 2;
            c11 = 0;
            i12 = 1;
        } else {
            int i13 = i11 - 1;
            if (i11 <= 128) {
                byte[] bArr2 = new byte[i11];
                Arrays.fill(bArr2, (byte) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    Object obj = objArr3[i17];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr3[i17 ^ 1];
                    Objects.requireNonNull(obj2);
                    int E12 = AbstractC4344b.E1(obj.hashCode());
                    while (true) {
                        int i18 = E12 & i13;
                        int i19 = bArr2[i18] & 255;
                        if (i19 == 255) {
                            bArr2[i18] = (byte) i16;
                            if (i14 < i15) {
                                objArr3[i16] = obj;
                                objArr3[i16 ^ 1] = obj2;
                            }
                            i14++;
                        } else if (obj.equals(objArr3[i19 == 1 ? 1 : 0])) {
                            int i20 = ~i19 ? 1 : 0;
                            Object obj3 = objArr3[i20 == 1 ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            C2448g c2448g3 = new C2448g(obj, obj2, obj3);
                            objArr3[i20] = obj2;
                            c2448g2 = c2448g3;
                            break;
                        } else {
                            E12 = i18 + 1;
                        }
                    }
                }
                if (i14 == i12) {
                    bArr = bArr2;
                    c11 = 0;
                    c10 = 2;
                    objArr4 = bArr;
                } else {
                    c10 = 2;
                    objArr2 = new Object[]{bArr2, Integer.valueOf(i14), c2448g2};
                    objArr4 = objArr2;
                    c11 = 0;
                }
            } else {
                if (i11 <= 32768) {
                    sArr = new short[i11];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i12; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj4 = objArr3[i24];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArr3[i24 ^ 1];
                        Objects.requireNonNull(obj5);
                        int E13 = AbstractC4344b.E1(obj4.hashCode());
                        while (true) {
                            int i25 = E13 & i13;
                            char c13 = (char) sArr[i25];
                            if (c13 == '\uffff') {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArr3[i23] = obj4;
                                    objArr3[i23 ^ 1] = obj5;
                                }
                                i21++;
                            } else if (obj4.equals(objArr3[c13])) {
                                int i26 = c13 ^ 1;
                                Object obj6 = objArr3[i26 == 1 ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                C2448g c2448g4 = new C2448g(obj4, obj5, obj6);
                                objArr3[i26] = obj5;
                                c2448g = c2448g4;
                                break;
                            } else {
                                E13 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i12) {
                        c10 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i21), c2448g};
                        objArr4 = objArr2;
                        c11 = 0;
                    }
                } else {
                    sArr = new int[i11];
                    Arrays.fill((int[]) sArr, -1);
                    C2448g c2448g5 = null;
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i12) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        Object obj7 = objArr3[i30];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArr3[i30 ^ 1];
                        Objects.requireNonNull(obj8);
                        int E14 = AbstractC4344b.E1(obj7.hashCode());
                        while (true) {
                            int i31 = E14 & i13;
                            ?? r15 = sArr[i31];
                            if (r15 == c12) {
                                sArr[i31] = i29;
                                if (i28 < i27) {
                                    objArr3[i29] = obj7;
                                    objArr3[i29 ^ 1] = obj8;
                                }
                                i28++;
                            } else if (obj7.equals(objArr3[r15])) {
                                int i32 = r15 ^ 1;
                                Object obj9 = objArr3[i32 == 1 ? 1 : 0];
                                Objects.requireNonNull(obj9);
                                c2448g5 = new C2448g(obj7, obj8, obj9);
                                objArr3[i32] = obj8;
                                break;
                            } else {
                                E14 = i31 + 1;
                                c12 = '\uffff';
                            }
                        }
                        i27++;
                        c12 = '\uffff';
                    }
                    if (i28 != i12) {
                        c11 = 0;
                        c10 = 2;
                        objArr4 = new Object[]{sArr, Integer.valueOf(i28), c2448g5};
                    }
                }
                bArr = sArr;
                c11 = 0;
                c10 = 2;
                objArr4 = bArr;
            }
        }
        boolean z10 = objArr4 instanceof Object[];
        Object obj10 = objArr4;
        if (z10) {
            Object[] objArr5 = objArr4;
            C2448g c2448g6 = (C2448g) objArr5[c10];
            if (c1025i != null) {
                c1025i.f12352i0 = c2448g6;
                Object obj11 = objArr5[c11];
                int intValue = ((Integer) objArr5[1]).intValue();
                objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                obj10 = obj11;
                i12 = intValue;
            } else {
                throw c2448g6.a();
            }
        }
        return new C2464o(i12, obj10, objArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2450h, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i10 = this.f26951k0;
            Object[] objArr = this.f26950j0;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f26949i0;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int E12 = AbstractC4344b.E1(obj.hashCode());
                        while (true) {
                            int i11 = E12 & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            } else if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            } else {
                                E12 = i11 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int E13 = AbstractC4344b.E1(obj.hashCode());
                        while (true) {
                            int i13 = E13 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == '\uffff') {
                                break;
                            } else if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            } else {
                                E13 = i13 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int E14 = AbstractC4344b.E1(obj.hashCode());
                        while (true) {
                            int i14 = E14 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            } else if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            } else {
                                E14 = i14 + 1;
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26951k0;
    }
}
