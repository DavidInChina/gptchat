package y2;

import E2.AbstractC0490w;
import E2.C0471c;
import E2.C0485q;
import E2.C0492y;
import V1.C1464e;
import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.AbstractC4344b;
import p2.h0;
import p2.n0;
import p2.o0;
import s2.AbstractC5530A;
import v.C5934c;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0490w f50457a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f50458b;

    /* renamed from: c  reason: collision with root package name */
    public final E2.Y[] f50459c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50460d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f50461e;

    /* renamed from: f  reason: collision with root package name */
    public T f50462f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f50463g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f50464h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC6519f[] f50465i;

    /* renamed from: j  reason: collision with root package name */
    public final H2.v f50466j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f50467k;

    /* renamed from: l  reason: collision with root package name */
    public S f50468l;

    /* renamed from: m  reason: collision with root package name */
    public E2.i0 f50469m = E2.i0.f4359i0;

    /* renamed from: n  reason: collision with root package name */
    public H2.w f50470n;

    /* renamed from: o  reason: collision with root package name */
    public long f50471o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [E2.c] */
    public S(AbstractC6519f[] abstractC6519fArr, long j6, H2.v vVar, I2.d dVar, c0 c0Var, T t10, H2.w wVar) {
        this.f50465i = abstractC6519fArr;
        this.f50471o = j6;
        this.f50466j = vVar;
        this.f50467k = c0Var;
        C0492y c0492y = t10.f50472a;
        this.f50458b = c0492y.f4420a;
        this.f50462f = t10;
        this.f50470n = wVar;
        this.f50459c = new E2.Y[abstractC6519fArr.length];
        this.f50464h = new boolean[abstractC6519fArr.length];
        c0Var.getClass();
        int i10 = h0.f50608s0;
        Pair pair = (Pair) c0492y.f4420a;
        Object obj = pair.first;
        C0492y a5 = c0492y.a(pair.second);
        b0 b0Var = (b0) c0Var.f50526d.get(obj);
        b0Var.getClass();
        c0Var.f50529g.add(b0Var);
        a0 a0Var = (a0) c0Var.f50528f.get(b0Var);
        if (a0Var != null) {
            a0Var.f50513a.d(a0Var.f50514b);
        }
        b0Var.f50518c.add(a5);
        C0485q a10 = b0Var.f50516a.a(a5, dVar, t10.f50473b);
        c0Var.f50525c.put(a10, b0Var);
        c0Var.c();
        long j10 = t10.f50475d;
        this.f50457a = j10 != -9223372036854775807L ? new C0471c(a10, true, 0L, j10) : a10;
    }

    public final long a(H2.w wVar, long j6, boolean z10, boolean[] zArr) {
        AbstractC6519f[] abstractC6519fArr;
        Object[] objArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= wVar.f7337a) {
                break;
            }
            if (z10 || !wVar.a(this.f50470n, i10)) {
                z12 = false;
            }
            this.f50464h[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            abstractC6519fArr = this.f50465i;
            int length = abstractC6519fArr.length;
            objArr = this.f50459c;
            if (i11 >= length) {
                break;
            }
            if (abstractC6519fArr[i11].f50564Z == -2) {
                objArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f50470n = wVar;
        c();
        long v10 = this.f50457a.v(wVar.f7339c, this.f50464h, this.f50459c, zArr, j6);
        for (int i12 = 0; i12 < abstractC6519fArr.length; i12++) {
            if (abstractC6519fArr[i12].f50564Z == -2 && this.f50470n.b(i12)) {
                objArr[i12] = new Object();
            }
        }
        this.f50461e = false;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (objArr[i13] != null) {
                Gi.e.n(wVar.b(i13));
                if (abstractC6519fArr[i13].f50564Z != -2) {
                    this.f50461e = true;
                }
            } else {
                if (wVar.f7339c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.n(z11);
            }
        }
        return v10;
    }

    public final void b() {
        if (this.f50468l == null) {
            int i10 = 0;
            while (true) {
                H2.w wVar = this.f50470n;
                if (i10 < wVar.f7337a) {
                    boolean b10 = wVar.b(i10);
                    H2.s sVar = this.f50470n.f7339c[i10];
                    if (b10 && sVar != null) {
                        sVar.f();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f50468l == null) {
            int i10 = 0;
            while (true) {
                H2.w wVar = this.f50470n;
                if (i10 < wVar.f7337a) {
                    boolean b10 = wVar.b(i10);
                    H2.s sVar = this.f50470n.f7339c[i10];
                    if (b10 && sVar != null) {
                        sVar.d();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j6;
        if (!this.f50460d) {
            return this.f50462f.f50473b;
        }
        if (this.f50461e) {
            j6 = this.f50457a.x();
        } else {
            j6 = Long.MIN_VALUE;
        }
        if (j6 == Long.MIN_VALUE) {
            return this.f50462f.f50476e;
        }
        return j6;
    }

    public final long e() {
        return this.f50462f.f50473b + this.f50471o;
    }

    public final boolean f() {
        if (this.f50460d && (!this.f50461e || this.f50457a.x() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public final void g() {
        b();
        AbstractC0490w abstractC0490w = this.f50457a;
        try {
            boolean z10 = abstractC0490w instanceof C0471c;
            c0 c0Var = this.f50467k;
            if (z10) {
                c0Var.f(((C0471c) abstractC0490w).f4294Y);
            } else {
                c0Var.f(abstractC0490w);
            }
        } catch (RuntimeException e10) {
            s2.p.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x03bc, code lost:
        if (r9 != 2) goto L187;
     */
    /* JADX WARN: Type inference failed for: r2v19, types: [x8.K, x8.H] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H2.w h(float f6, p2.g0 g0Var) {
        final H2.i iVar;
        Pair pair;
        E2.i0[] i0VarArr;
        int[] iArr;
        final boolean z10;
        String str;
        Pair pair2;
        E2.i0[] i0VarArr2;
        char c10;
        H2.s[] sVarArr;
        boolean z11;
        boolean z12;
        x8.k0 k0Var;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        j0 j0Var;
        H2.j jVar;
        H2.q qVar;
        H2.q qVar2;
        int[] iArr2;
        E2.i0[] i0VarArr3;
        p2.k0 k0Var2;
        H2.q qVar3;
        int[] iArr3;
        p2.h0 h0Var;
        B2.E e10;
        boolean z16;
        int[] iArr4;
        boolean z17;
        H2.v vVar = this.f50466j;
        AbstractC6519f[] abstractC6519fArr = this.f50465i;
        E2.i0 i0Var = this.f50469m;
        C0492y c0492y = this.f50462f.f50472a;
        vVar.getClass();
        boolean z18 = true;
        int[] iArr5 = new int[abstractC6519fArr.length + 1];
        int length = abstractC6519fArr.length + 1;
        p2.h0[][] h0VarArr = new p2.h0[length];
        int[][][] iArr6 = new int[abstractC6519fArr.length + 1][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i0Var.f4361Y;
            h0VarArr[i11] = new p2.h0[i12];
            iArr6[i11] = new int[i12];
        }
        int length2 = abstractC6519fArr.length;
        final int[] iArr7 = new int[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            iArr7[i13] = abstractC6519fArr[i13].A();
        }
        int i14 = 0;
        while (i14 < i0Var.f4361Y) {
            p2.h0 b10 = i0Var.b(i14);
            if (b10.f42074h0 == 5) {
                z16 = z18;
            } else {
                z16 = false;
            }
            int length3 = abstractC6519fArr.length;
            boolean z19 = z18;
            int i15 = 0;
            int i16 = 0;
            while (i15 < abstractC6519fArr.length) {
                AbstractC6519f abstractC6519f = abstractC6519fArr[i15];
                E2.i0 i0Var2 = i0Var;
                int i17 = 0;
                for (int i18 = 0; i18 < b10.f42072Y; i18++) {
                    i17 = Math.max(i17, abstractC6519f.z(b10.f42075i0[i18]) & 7);
                }
                if (iArr5[i15] == 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i17 > i16 || (i17 == i16 && z16 && !z19 && z17)) {
                    i16 = i17;
                    z19 = z17;
                    length3 = i15;
                }
                i15++;
                i0Var = i0Var2;
            }
            E2.i0 i0Var3 = i0Var;
            if (length3 == abstractC6519fArr.length) {
                iArr4 = new int[b10.f42072Y];
            } else {
                AbstractC6519f abstractC6519f2 = abstractC6519fArr[length3];
                int[] iArr8 = new int[b10.f42072Y];
                for (int i19 = 0; i19 < b10.f42072Y; i19++) {
                    iArr8[i19] = abstractC6519f2.z(b10.f42075i0[i19]);
                }
                iArr4 = iArr8;
            }
            int i20 = iArr5[length3];
            h0VarArr[length3][i20] = b10;
            iArr6[length3][i20] = iArr4;
            iArr5[length3] = i20 + 1;
            i14++;
            i0Var = i0Var3;
            z18 = true;
        }
        E2.i0[] i0VarArr4 = new E2.i0[abstractC6519fArr.length];
        String[] strArr = new String[abstractC6519fArr.length];
        int[] iArr9 = new int[abstractC6519fArr.length];
        for (int i21 = 0; i21 < abstractC6519fArr.length; i21++) {
            int i22 = iArr5[i21];
            i0VarArr4[i21] = new E2.i0((p2.h0[]) AbstractC5530A.E(i22, h0VarArr[i21]));
            iArr6[i21] = (int[][]) AbstractC5530A.E(i22, iArr6[i21]);
            strArr[i21] = abstractC6519fArr[i21].i();
            iArr9[i21] = abstractC6519fArr[i21].f50564Z;
        }
        H2.u uVar = new H2.u(iArr9, i0VarArr4, iArr7, iArr6, new E2.i0((p2.h0[]) AbstractC5530A.E(iArr5[abstractC6519fArr.length], h0VarArr[abstractC6519fArr.length])));
        final H2.p pVar = (H2.p) vVar;
        synchronized (pVar.f7320c) {
            try {
                iVar = pVar.f7323f;
                if (iVar.f7278u1 && AbstractC5530A.f45131a >= 32 && (e10 = pVar.f7324g) != null) {
                    Looper myLooper = Looper.myLooper();
                    Gi.e.o(myLooper);
                    e10.c(pVar, myLooper);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i23 = uVar.f7329a;
        H2.q[] qVarArr = new H2.q[i23];
        int i24 = 2;
        if (iVar.f42186x0.f42093Y == 2) {
            pair = null;
        } else {
            pair = H2.p.k(2, uVar, iArr6, new C1464e(iVar, 12, iArr7), new C5934c(10));
        }
        if (pair != null) {
            qVarArr[((Integer) pair.second).intValue()] = (H2.q) pair.first;
        }
        int i25 = 0;
        while (true) {
            i0VarArr = uVar.f7331c;
            iArr = uVar.f7330b;
            if (i25 < uVar.f7329a) {
                if (2 == iArr[i25] && i0VarArr[i25].f4361Y > 0) {
                    z10 = true;
                    break;
                }
                i25++;
            } else {
                z10 = false;
                break;
            }
        }
        Pair k10 = H2.p.k(1, uVar, iArr6, new H2.m() { // from class: H2.d
            @Override // H2.m
            public final k0 a(int i26, h0 h0Var2, int[] iArr10) {
                Object[] objArr;
                p pVar2 = p.this;
                pVar2.getClass();
                e eVar = new e(pVar2);
                int i27 = iArr7[i26];
                L l10 = N.f49523Z;
                AbstractC4344b.T(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i28 = 0;
                boolean z20 = false;
                for (int i29 = 0; i29 < h0Var2.f42072Y; i29++) {
                    int i30 = i29;
                    int i31 = i28;
                    f fVar = new f(i26, h0Var2, i30, iVar, iArr10[i29], z10, eVar, i27);
                    int i32 = i31 + 1;
                    if (objArr2.length < i32) {
                        objArr = Arrays.copyOf(objArr2, r.f.x(objArr2.length, i32));
                    } else if (z20) {
                        objArr = (Object[]) objArr2.clone();
                    } else {
                        i28 = i31 + 1;
                        objArr2[i31] = fVar;
                    }
                    objArr2 = objArr;
                    z20 = false;
                    i28 = i31 + 1;
                    objArr2[i31] = fVar;
                }
                return N.T(i28, objArr2);
            }
        }, new C5934c(9));
        if (k10 != null) {
            qVarArr[((Integer) k10.second).intValue()] = (H2.q) k10.first;
        }
        if (k10 == null) {
            str = null;
        } else {
            H2.q qVar4 = (H2.q) k10.first;
            str = qVar4.f7326a.f42075i0[qVar4.f7327b[0]].f42310h0;
        }
        p2.k0 k0Var3 = iVar.f42186x0;
        int i26 = 3;
        if (k0Var3.f42093Y == 2) {
            pair2 = null;
        } else {
            pair2 = H2.p.k(3, uVar, iArr6, new C1464e(iVar, 13, str), new C5934c(11));
        }
        if (pair2 != null) {
            qVarArr[((Integer) pair2.second).intValue()] = (H2.q) pair2.first;
        }
        int i27 = 0;
        while (i27 < i23) {
            int i28 = iArr[i27];
            if (i28 != i24 && i28 != 1 && i28 != i26) {
                E2.i0 i0Var4 = i0VarArr[i27];
                int[][] iArr10 = iArr6[i27];
                if (k0Var3.f42093Y == i24) {
                    k0Var2 = k0Var3;
                    i0VarArr3 = i0VarArr;
                    iArr2 = iArr;
                } else {
                    p2.h0 h0Var2 = null;
                    int i29 = 0;
                    int i30 = 0;
                    H2.g gVar = null;
                    while (i29 < i0Var4.f4361Y) {
                        p2.h0 b11 = i0Var4.b(i29);
                        int[] iArr11 = iArr10[i29];
                        p2.k0 k0Var4 = k0Var3;
                        H2.g gVar2 = gVar;
                        int i31 = i30;
                        p2.h0 h0Var3 = h0Var2;
                        int i32 = 0;
                        while (i32 < b11.f42072Y) {
                            E2.i0[] i0VarArr5 = i0VarArr;
                            if (H2.p.f(iArr11[i32], iVar.f7279v1)) {
                                h0Var = b11;
                                H2.g gVar3 = new H2.g(iArr11[i32], b11.f42075i0[i32]);
                                if (gVar2 != null) {
                                    iArr3 = iArr;
                                    if (x8.E.f49509a.c(gVar3.f7231Z, gVar2.f7231Z).c(gVar3.f7230Y, gVar2.f7230Y).e() <= 0) {
                                    }
                                } else {
                                    iArr3 = iArr;
                                }
                                i31 = i32;
                                gVar2 = gVar3;
                                h0Var3 = h0Var;
                            } else {
                                h0Var = b11;
                                iArr3 = iArr;
                            }
                            i32++;
                            i0VarArr = i0VarArr5;
                            b11 = h0Var;
                            iArr = iArr3;
                        }
                        i29++;
                        h0Var2 = h0Var3;
                        i30 = i31;
                        k0Var3 = k0Var4;
                        gVar = gVar2;
                    }
                    k0Var2 = k0Var3;
                    i0VarArr3 = i0VarArr;
                    iArr2 = iArr;
                    if (h0Var2 != null) {
                        qVar3 = new H2.q(0, h0Var2, new int[]{i30});
                        qVarArr[i27] = qVar3;
                    }
                }
                qVar3 = null;
                qVarArr[i27] = qVar3;
            } else {
                k0Var2 = k0Var3;
                i0VarArr3 = i0VarArr;
                iArr2 = iArr;
            }
            i27++;
            k0Var3 = k0Var2;
            i0VarArr = i0VarArr3;
            iArr = iArr2;
            i24 = 2;
            i26 = 3;
        }
        int i33 = uVar.f7329a;
        HashMap hashMap = new HashMap();
        int i34 = 0;
        while (true) {
            i0VarArr2 = uVar.f7331c;
            if (i34 >= i33) {
                break;
            }
            H2.p.d(i0VarArr2[i34], iVar, hashMap);
            i34++;
        }
        H2.p.d(uVar.f7334f, iVar, hashMap);
        int i35 = 0;
        while (true) {
            c10 = '\uffff';
            if (i35 >= i33) {
                break;
            }
            p2.i0 i0Var5 = (p2.i0) hashMap.get(Integer.valueOf(uVar.f7330b[i35]));
            if (i0Var5 != null) {
                x8.N n10 = i0Var5.f42080Z;
                if (!n10.isEmpty()) {
                    E2.i0 i0Var6 = i0VarArr2[i35];
                    p2.h0 h0Var4 = i0Var5.f42079Y;
                    int indexOf = i0Var6.f4362Z.indexOf(h0Var4);
                    if (indexOf >= 0 && indexOf != -1) {
                        qVar2 = new H2.q(0, h0Var4, M3.H.y0(n10));
                        qVarArr[i35] = qVar2;
                    }
                }
                qVar2 = null;
                qVarArr[i35] = qVar2;
            }
            i35++;
        }
        int i36 = uVar.f7329a;
        for (int i37 = 0; i37 < i36; i37++) {
            E2.i0 i0Var7 = uVar.f7331c[i37];
            Map map = (Map) iVar.f7283z1.get(i37);
            if (map != null && map.containsKey(i0Var7)) {
                Map map2 = (Map) iVar.f7283z1.get(i37);
                if (map2 != null) {
                    jVar = (H2.j) map2.get(i0Var7);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    int[] iArr12 = jVar.f7288Z;
                    if (iArr12.length != 0) {
                        qVar = new H2.q(jVar.f7289h0, i0Var7.b(jVar.f7287Y), iArr12);
                        qVarArr[i37] = qVar;
                    }
                }
                qVar = null;
                qVarArr[i37] = qVar;
            }
        }
        for (int i38 = 0; i38 < i23; i38++) {
            int i39 = uVar.f7330b[i38];
            if (iVar.f7267A1.get(i38) || iVar.f42167F0.contains(Integer.valueOf(i39))) {
                qVarArr[i38] = null;
            }
        }
        H2.r rVar = pVar.f7321d;
        Gi.e.o(pVar.f7336b);
        H2.s[] Y7 = ((R4.a) rVar).Y(qVarArr);
        j0[] j0VarArr = new j0[i23];
        for (int i40 = 0; i40 < i23; i40++) {
            int i41 = uVar.f7330b[i40];
            if (!iVar.f7267A1.get(i40) && !iVar.f42167F0.contains(Integer.valueOf(i41)) && (uVar.f7330b[i40] == -2 || Y7[i40] != null)) {
                j0Var = j0.f50642c;
            } else {
                j0Var = null;
            }
            j0VarArr[i40] = j0Var;
        }
        if (iVar.f7280w1) {
            int i42 = -1;
            int i43 = -1;
            for (int i44 = 0; i44 < uVar.f7329a; i44++) {
                int i45 = uVar.f7330b[i44];
                H2.s sVar = Y7[i44];
                if (i45 == 1) {
                }
                if (sVar != null) {
                    int[][] iArr13 = iArr6[i44];
                    int indexOf2 = uVar.f7331c[i44].f4362Z.indexOf(sVar.a());
                    if (indexOf2 < 0) {
                        indexOf2 = -1;
                    }
                    int i46 = 0;
                    while (true) {
                        if (i46 < sVar.length()) {
                            if ((iArr13[indexOf2][sVar.e(i46)] & 32) != 32) {
                                break;
                            }
                            i46++;
                        } else if (i45 == 1) {
                            if (i43 != -1) {
                                z14 = false;
                                break;
                            }
                            i43 = i44;
                        } else if (i42 != -1) {
                            z14 = false;
                            break;
                        } else {
                            i42 = i44;
                        }
                    }
                }
            }
            z14 = true;
            if (i43 != -1 && i42 != -1) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z14 & z15) {
                j0 j0Var2 = new j0(0, true);
                j0VarArr[i43] = j0Var2;
                j0VarArr[i42] = j0Var2;
            }
        }
        if (iVar.f42186x0.f42093Y != 0) {
            int i47 = -1;
            int i48 = 0;
            int i49 = 0;
            while (true) {
                if (i49 < uVar.f7329a) {
                    int i50 = uVar.f7330b[i49];
                    H2.s sVar2 = Y7[i49];
                    if (i50 != 1 && sVar2 != null) {
                        break;
                    }
                    if (i50 == 1 && sVar2 != null && sVar2.length() == 1) {
                        int indexOf3 = uVar.f7331c[i49].f4362Z.indexOf(sVar2.a());
                        if (indexOf3 < 0) {
                            indexOf3 = -1;
                        }
                        if (H2.p.j(iVar, iArr6[i49][indexOf3][sVar2.e(0)], sVar2.g())) {
                            i48++;
                            i47 = i49;
                        }
                    }
                    i49++;
                } else if (i48 == 1) {
                    if (iVar.f42186x0.f42094Z) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    j0 j0Var3 = j0VarArr[i47];
                    if (j0Var3 != null && j0Var3.f50644b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    j0VarArr[i47] = new j0(i10, z13);
                }
            }
        }
        Pair create = Pair.create(j0VarArr, Y7);
        H2.s[] sVarArr2 = (H2.s[]) create.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i51 = 0; i51 < sVarArr2.length; i51++) {
            H2.s sVar3 = sVarArr2[i51];
            if (sVar3 != null) {
                k0Var = x8.N.u0(sVar3);
            } else {
                x8.L l10 = x8.N.f49523Z;
                k0Var = x8.k0.f49573j0;
            }
            listArr[i51] = k0Var;
        }
        ?? h10 = new x8.H();
        for (int i52 = 0; i52 < uVar.f7329a; i52++) {
            E2.i0[] i0VarArr6 = uVar.f7331c;
            E2.i0 i0Var8 = i0VarArr6[i52];
            List list = listArr[i52];
            int i53 = 0;
            while (i53 < i0Var8.f4361Y) {
                p2.h0 b12 = i0Var8.b(i53);
                int i54 = i0VarArr6[i52].b(i53).f42072Y;
                int[] iArr14 = new int[i54];
                int i55 = 0;
                for (int i56 = 0; i56 < i54; i56++) {
                    if ((uVar.f7333e[i52][i53][i56] & 7) == 4) {
                        iArr14[i55] = i56;
                        i55++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr14, i55);
                int i57 = 16;
                List[] listArr2 = listArr;
                int i58 = 0;
                boolean z20 = false;
                int i59 = 0;
                String str2 = null;
                while (i58 < copyOf.length) {
                    E2.i0 i0Var9 = i0Var8;
                    String str3 = i0VarArr6[i52].b(i53).f42075i0[copyOf[i58]].f42319q0;
                    int i60 = i59 + 1;
                    if (i59 == 0) {
                        str2 = str3;
                    } else {
                        z20 = (!AbstractC5530A.a(str2, str3)) | z20;
                    }
                    i57 = Math.min(i57, uVar.f7333e[i52][i53][i58] & 24);
                    i58++;
                    i59 = i60;
                    i0Var8 = i0Var9;
                }
                E2.i0 i0Var10 = i0Var8;
                if (z20) {
                    i57 = Math.min(i57, uVar.f7332d[i52]);
                }
                if (i57 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i61 = b12.f42072Y;
                int[] iArr15 = new int[i61];
                boolean[] zArr = new boolean[i61];
                for (int i62 = 0; i62 < b12.f42072Y; i62++) {
                    iArr15[i62] = uVar.f7333e[i52][i53][i62] & 7;
                    int i63 = 0;
                    while (true) {
                        if (i63 < list.size()) {
                            H2.s sVar4 = (H2.s) list.get(i63);
                            if (sVar4.a().equals(b12) && sVar4.k(i62) != -1) {
                                z12 = true;
                                break;
                            }
                            i63++;
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    zArr[i62] = z12;
                }
                h10.d0(new n0(b12, z11, iArr15, zArr));
                i53++;
                c10 = '\uffff';
                listArr = listArr2;
                i0Var8 = i0Var10;
            }
        }
        int i64 = 0;
        while (true) {
            E2.i0 i0Var11 = uVar.f7334f;
            if (i64 >= i0Var11.f4361Y) {
                break;
            }
            p2.h0 b13 = i0Var11.b(i64);
            int[] iArr16 = new int[b13.f42072Y];
            Arrays.fill(iArr16, 0);
            h10.d0(new n0(b13, false, iArr16, new boolean[b13.f42072Y]));
            i64++;
        }
        H2.w wVar = new H2.w((j0[]) create.first, (H2.s[]) create.second, new o0(h10.i0()), uVar);
        for (H2.s sVar5 : wVar.f7339c) {
            if (sVar5 != null) {
                sVar5.h(f6);
            }
        }
        return wVar;
    }

    public final void i() {
        AbstractC0490w abstractC0490w = this.f50457a;
        if (abstractC0490w instanceof C0471c) {
            long j6 = this.f50462f.f50475d;
            if (j6 == -9223372036854775807L) {
                j6 = Long.MIN_VALUE;
            }
            C0471c c0471c = (C0471c) abstractC0490w;
            c0471c.f4298j0 = 0L;
            c0471c.f4299k0 = j6;
        }
    }
}
