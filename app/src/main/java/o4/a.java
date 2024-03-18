package O4;

import M3.H;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import r.f;
import x8.B;
import x8.C6376u;
import x8.O;
import x8.S;
import x8.a0;
import x8.j0;
import x8.p0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f13386a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13387b = false;

    /* renamed from: c  reason: collision with root package name */
    public String f13388c;

    /* renamed from: d  reason: collision with root package name */
    public Object f13389d;

    /* renamed from: e  reason: collision with root package name */
    public Object f13390e;

    public a(int i10) {
        this.f13389d = new Object[i10 * 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    public final p0 a() {
        Object[] objArr;
        p0 p0Var;
        char c10;
        short[] sArr;
        O o10;
        O o11;
        j0 j0Var;
        O o12 = (O) this.f13390e;
        if (o12 == null) {
            int i10 = this.f13386a;
            Comparator comparator = (Comparator) this.f13388c;
            if (comparator == null) {
                objArr = (Object[]) this.f13389d;
            } else {
                if (this.f13387b) {
                    this.f13389d = Arrays.copyOf((Object[]) this.f13389d, i10 * 2);
                }
                Object[] objArr2 = (Object[]) this.f13389d;
                Map.Entry[] entryArr = new Map.Entry[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = i11 * 2;
                    Object obj = objArr2[i12];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr2[i12 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
                if (comparator instanceof j0) {
                    j0Var = (j0) comparator;
                } else {
                    j0Var = new B(comparator);
                }
                Arrays.sort(entryArr, 0, i10, new C6376u(a0.f49541Y, j0Var));
                for (int i13 = 0; i13 < i10; i13++) {
                    int i14 = i13 * 2;
                    objArr2[i14] = entryArr[i13].getKey();
                    objArr2[i14 + 1] = entryArr[i13].getValue();
                }
                objArr = objArr2;
            }
            this.f13387b = true;
            if (i10 == 0) {
                p0Var = p0.f49595l0;
            } else {
                O o13 = 0;
                if (i10 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    p0Var = new p0(1, null, objArr);
                } else {
                    P4.a.u(i10, objArr.length >> 1);
                    int T = S.T(i10);
                    if (i10 == 1) {
                        Objects.requireNonNull(objArr[0]);
                        Objects.requireNonNull(objArr[1]);
                        c10 = 2;
                    } else {
                        int i15 = T - 1;
                        char c11 = '\uffff';
                        if (T <= 128) {
                            byte[] bArr = new byte[T];
                            Arrays.fill(bArr, (byte) -1);
                            int i16 = 0;
                            for (int i17 = 0; i17 < i10; i17++) {
                                int i18 = i17 * 2;
                                int i19 = i16 * 2;
                                Object obj3 = objArr[i18];
                                Objects.requireNonNull(obj3);
                                Object obj4 = objArr[i18 ^ 1];
                                Objects.requireNonNull(obj4);
                                int u02 = H.u0(obj3.hashCode());
                                while (true) {
                                    int i20 = u02 & i15;
                                    int i21 = bArr[i20] & 255;
                                    if (i21 == 255) {
                                        bArr[i20] = (byte) i19;
                                        if (i16 < i17) {
                                            objArr[i19] = obj3;
                                            objArr[i19 ^ 1] = obj4;
                                        }
                                        i16++;
                                    } else if (obj3.equals(objArr[i21])) {
                                        int i22 = i21 ^ 1;
                                        Object obj5 = objArr[i22];
                                        Objects.requireNonNull(obj5);
                                        O o14 = new O(obj3, obj4, obj5);
                                        objArr[i22] = obj4;
                                        o13 = o14;
                                        break;
                                    } else {
                                        u02 = i20 + 1;
                                    }
                                }
                            }
                            if (i16 == i10) {
                                o10 = bArr;
                                c10 = 2;
                                o13 = o10;
                            } else {
                                c10 = 2;
                                o11 = new Object[]{bArr, Integer.valueOf(i16), o13};
                                o13 = o11;
                            }
                        } else if (T <= 32768) {
                            sArr = new short[T];
                            Arrays.fill(sArr, (short) -1);
                            int i23 = 0;
                            for (int i24 = 0; i24 < i10; i24++) {
                                int i25 = i24 * 2;
                                int i26 = i23 * 2;
                                Object obj6 = objArr[i25];
                                Objects.requireNonNull(obj6);
                                Object obj7 = objArr[i25 ^ 1];
                                Objects.requireNonNull(obj7);
                                int u03 = H.u0(obj6.hashCode());
                                while (true) {
                                    int i27 = u03 & i15;
                                    int i28 = sArr[i27] & 65535;
                                    if (i28 == 65535) {
                                        sArr[i27] = (short) i26;
                                        if (i23 < i24) {
                                            objArr[i26] = obj6;
                                            objArr[i26 ^ 1] = obj7;
                                        }
                                        i23++;
                                    } else if (obj6.equals(objArr[i28])) {
                                        int i29 = i28 ^ 1;
                                        Object obj8 = objArr[i29];
                                        Objects.requireNonNull(obj8);
                                        o13 = new O(obj6, obj7, obj8);
                                        objArr[i29] = obj7;
                                        break;
                                    } else {
                                        u03 = i27 + 1;
                                    }
                                }
                            }
                            if (i23 != i10) {
                                c10 = 2;
                                o11 = new Object[]{sArr, Integer.valueOf(i23), o13};
                                o13 = o11;
                            }
                            o10 = sArr;
                            c10 = 2;
                            o13 = o10;
                        } else {
                            sArr = new int[T];
                            Arrays.fill((int[]) sArr, -1);
                            int i30 = 0;
                            int i31 = 0;
                            while (i30 < i10) {
                                int i32 = i30 * 2;
                                int i33 = i31 * 2;
                                Object obj9 = objArr[i32];
                                Objects.requireNonNull(obj9);
                                Object obj10 = objArr[i32 ^ 1];
                                Objects.requireNonNull(obj10);
                                int u04 = H.u0(obj9.hashCode());
                                while (true) {
                                    int i34 = u04 & i15;
                                    ?? r15 = sArr[i34];
                                    if (r15 == c11) {
                                        sArr[i34] = i33;
                                        if (i31 < i30) {
                                            objArr[i33] = obj9;
                                            objArr[i33 ^ 1] = obj10;
                                        }
                                        i31++;
                                    } else if (obj9.equals(objArr[r15])) {
                                        int i35 = r15 ^ 1;
                                        Object obj11 = objArr[i35];
                                        Objects.requireNonNull(obj11);
                                        o13 = new O(obj9, obj10, obj11);
                                        objArr[i35] = obj10;
                                        break;
                                    } else {
                                        u04 = i34 + 1;
                                        c11 = '\uffff';
                                    }
                                }
                                i30++;
                                c11 = '\uffff';
                            }
                            if (i31 != i10) {
                                c10 = 2;
                                o11 = new Object[]{sArr, Integer.valueOf(i31), o13};
                                o13 = o11;
                            }
                            o10 = sArr;
                            c10 = 2;
                            o13 = o10;
                        }
                    }
                    if (o13 instanceof Object[]) {
                        ?? r72 = (Object[]) o13;
                        this.f13390e = (O) r72[c10];
                        ?? r12 = r72[0];
                        i10 = ((Integer) r72[1]).intValue();
                        objArr = Arrays.copyOf(objArr, i10 * 2);
                        o13 = r12;
                    }
                    p0Var = new p0(i10, o13, objArr);
                }
            }
            O o15 = (O) this.f13390e;
            if (o15 == null) {
                return p0Var;
            }
            throw o15.a();
        }
        throw o12.a();
    }

    public final void b(Object obj, Object obj2) {
        int i10 = (this.f13386a + 1) * 2;
        Object[] objArr = (Object[]) this.f13389d;
        if (i10 > objArr.length) {
            this.f13389d = Arrays.copyOf(objArr, f.x(objArr.length, i10));
            this.f13387b = false;
        }
        if (obj != null) {
            if (obj2 != null) {
                Object[] objArr2 = (Object[]) this.f13389d;
                int i11 = this.f13386a;
                int i12 = i11 * 2;
                objArr2[i12] = obj;
                objArr2[i12 + 1] = obj2;
                this.f13386a = i11 + 1;
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
        sb3.append("null key in entry: null=");
        sb3.append(valueOf2);
        throw new NullPointerException(sb3.toString());
    }
}
