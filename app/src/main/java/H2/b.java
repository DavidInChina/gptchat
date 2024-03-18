package H2;

import java.util.ArrayList;
import java.util.Arrays;
import x8.C6374s;
import x8.K;
import x8.N;
import x8.d0;
import x8.g0;
import x8.i0;
import x8.k0;

/* loaded from: classes2.dex */
public final class b extends c {
    public static k0 l(q[] qVarArr) {
        int i10;
        int i11;
        k0 k0Var;
        int i12;
        double d10;
        long j6;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= qVarArr.length) {
                break;
            }
            q qVar = qVarArr[i14];
            if (qVar != null && qVar.f7327b.length > 1) {
                K U10 = N.U();
                U10.e0(new a(0L, 0L));
                arrayList.add(U10);
            } else {
                arrayList.add(null);
            }
            i14++;
        }
        int length = qVarArr.length;
        long[][] jArr = new long[length];
        for (int i15 = 0; i15 < qVarArr.length; i15++) {
            q qVar2 = qVarArr[i15];
            if (qVar2 == null) {
                jArr[i15] = new long[0];
            } else {
                int[] iArr = qVar2.f7327b;
                jArr[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = qVar2.f7326a.f42075i0[iArr[i16]].f42315m0;
                    long[] jArr2 = jArr[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i16] = j10;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            long[] jArr4 = jArr[i17];
            if (jArr4.length == 0) {
                j6 = 0;
            } else {
                j6 = jArr4[0];
            }
            jArr3[i17] = j6;
        }
        m(arrayList, jArr3);
        i0 i0Var = i0.f49570Y;
        i0Var.getClass();
        g0 X10 = new d0(i0Var).C().X();
        int i18 = 0;
        while (i18 < length) {
            long[] jArr5 = jArr[i18];
            if (jArr5.length <= i10) {
                i12 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i19 = i13;
                while (true) {
                    long[] jArr6 = jArr[i18];
                    double d11 = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = length;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        d11 = Math.log(j11);
                    }
                    dArr[i19] = d11;
                    i19++;
                    length = i20;
                }
                i12 = length;
                int i21 = length2 - 1;
                double d12 = dArr[i21] - dArr[0];
                int i22 = 0;
                while (i22 < i21) {
                    double d13 = dArr[i22];
                    i22++;
                    double d14 = (d13 + dArr[i22]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    X10.c(Double.valueOf(d10), Integer.valueOf(i18));
                }
            }
            i18++;
            length = i12;
            i13 = 0;
            i10 = 1;
        }
        C6374s c6374s = X10.f49612Z;
        if (c6374s == null) {
            i11 = 0;
            c6374s = new C6374s(X10, 0);
            X10.f49612Z = c6374s;
        } else {
            i11 = 0;
        }
        N V10 = N.V(c6374s);
        for (int i23 = i11; i23 < V10.size(); i23++) {
            int intValue = ((Integer) V10.get(i23)).intValue();
            int i24 = iArr2[intValue] + 1;
            iArr2[intValue] = i24;
            jArr3[intValue] = jArr[intValue][i24];
            m(arrayList, jArr3);
        }
        for (int i25 = i11; i25 < qVarArr.length; i25++) {
            if (arrayList.get(i25) != null) {
                jArr3[i25] = jArr3[i25] * 2;
            }
        }
        m(arrayList, jArr3);
        K U11 = N.U();
        for (int i26 = i11; i26 < arrayList.size(); i26++) {
            K k10 = (K) arrayList.get(i26);
            if (k10 == null) {
                k0Var = N.q0();
            } else {
                k0Var = k10.i0();
            }
            U11.e0(k0Var);
        }
        return U11.i0();
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j6 = 0;
        for (long j10 : jArr) {
            j6 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            K k10 = (K) arrayList.get(i10);
            if (k10 != null) {
                k10.d0(new a(j6, jArr[i10]));
            }
        }
    }

    @Override // H2.c, H2.s
    public final void d() {
    }

    @Override // H2.c, H2.s
    public final void f() {
    }

    @Override // H2.c, H2.s
    public final void h(float f6) {
    }
}
