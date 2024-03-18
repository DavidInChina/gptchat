package i1;

import U3.n;
import U3.u;
import h1.C3296c;
import h1.C3298e;
import h1.C3301h;
import h1.C3302i;
import j1.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: f0  reason: collision with root package name */
    public final j1.e f32517f0;

    /* renamed from: j0  reason: collision with root package name */
    public int f32521j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f32522k0;

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f32515d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public final u f32516e0 = new u(this);

    /* renamed from: g0  reason: collision with root package name */
    public k1.f f32518g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f32519h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public final C3298e f32520i0 = new C3298e();

    /* renamed from: l0  reason: collision with root package name */
    public int f32523l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f32524m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public C3457b[] f32525n0 = new C3457b[4];

    /* renamed from: o0  reason: collision with root package name */
    public C3457b[] f32526o0 = new C3457b[4];

    /* renamed from: p0  reason: collision with root package name */
    public int f32527p0 = 263;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f32528q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f32529r0 = false;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j1.e] */
    public e() {
        ?? obj = new Object();
        obj.f35966a = true;
        obj.f35967b = true;
        obj.f35970e = new ArrayList();
        obj.f35971f = new ArrayList();
        obj.f35973h = null;
        obj.f35974i = new Object();
        obj.f35972g = new ArrayList();
        obj.f35968c = this;
        obj.f35969d = this;
        this.f32517f0 = obj;
    }

    @Override // i1.d
    public final void A(boolean z10, boolean z11) {
        super.A(z10, z11);
        int size = this.f32515d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f32515d0.get(i10)).A(z10, z11);
        }
    }

    public final void C(d dVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f32523l0 + 1;
            C3457b[] c3457bArr = this.f32526o0;
            if (i11 >= c3457bArr.length) {
                this.f32526o0 = (C3457b[]) Arrays.copyOf(c3457bArr, c3457bArr.length * 2);
            }
            C3457b[] c3457bArr2 = this.f32526o0;
            int i12 = this.f32523l0;
            c3457bArr2[i12] = new C3457b(dVar, 0, this.f32519h0);
            this.f32523l0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.f32524m0 + 1;
            C3457b[] c3457bArr3 = this.f32525n0;
            if (i13 >= c3457bArr3.length) {
                this.f32525n0 = (C3457b[]) Arrays.copyOf(c3457bArr3, c3457bArr3.length * 2);
            }
            C3457b[] c3457bArr4 = this.f32525n0;
            int i14 = this.f32524m0;
            c3457bArr4[i14] = new C3457b(dVar, 1, this.f32519h0);
            this.f32524m0 = i14 + 1;
        }
    }

    public final void D(C3298e c3298e) {
        b(c3298e);
        int size = this.f32515d0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f32515d0.get(i10);
            boolean[] zArr = dVar.f32471H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C3456a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = (d) this.f32515d0.get(i11);
                if (dVar2 instanceof C3456a) {
                    C3456a c3456a = (C3456a) dVar2;
                    for (int i12 = 0; i12 < c3456a.f32590e0; i12++) {
                        d dVar3 = c3456a.f32589d0[i12];
                        int i13 = c3456a.f32437f0;
                        if (i13 != 0 && i13 != 1) {
                            if (i13 == 2 || i13 == 3) {
                                dVar3.f32471H[1] = true;
                            }
                        } else {
                            dVar3.f32471H[0] = true;
                        }
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = (d) this.f32515d0.get(i14);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.b(c3298e);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            d dVar5 = (d) this.f32515d0.get(i15);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f32491c0;
                int i16 = iArr[0];
                int i17 = iArr[1];
                if (i16 == 2) {
                    dVar5.x(1);
                }
                if (i17 == 2) {
                    dVar5.y(1);
                }
                dVar5.b(c3298e);
                if (i16 == 2) {
                    dVar5.x(i16);
                }
                if (i17 == 2) {
                    dVar5.y(i17);
                }
            } else {
                dVar5.f32496h = -1;
                dVar5.f32497i = -1;
                int[] iArr2 = this.f32491c0;
                int i18 = iArr2[0];
                int[] iArr3 = dVar5.f32491c0;
                if (i18 != 2 && iArr3[0] == 4) {
                    C3458c c3458c = dVar5.f32512x;
                    int i19 = c3458c.f32461e;
                    int m10 = m();
                    C3458c c3458c2 = dVar5.f32514z;
                    int i20 = m10 - c3458c2.f32461e;
                    c3458c.f32463g = c3298e.j(c3458c);
                    c3458c2.f32463g = c3298e.j(c3458c2);
                    c3298e.d(c3458c.f32463g, i19);
                    c3298e.d(c3458c2.f32463g, i20);
                    dVar5.f32496h = 2;
                    dVar5.f32477N = i19;
                    int i21 = i20 - i19;
                    dVar5.f32473J = i21;
                    int i22 = dVar5.Q;
                    if (i21 < i22) {
                        dVar5.f32473J = i22;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C3458c c3458c3 = dVar5.f32513y;
                    int i23 = c3458c3.f32461e;
                    int j6 = j();
                    C3458c c3458c4 = dVar5.f32464A;
                    int i24 = j6 - c3458c4.f32461e;
                    c3458c3.f32463g = c3298e.j(c3458c3);
                    c3458c4.f32463g = c3298e.j(c3458c4);
                    c3298e.d(c3458c3.f32463g, i23);
                    c3298e.d(c3458c4.f32463g, i24);
                    if (dVar5.P > 0 || dVar5.f32481V == 8) {
                        C3458c c3458c5 = dVar5.f32465B;
                        C3302i j10 = c3298e.j(c3458c5);
                        c3458c5.f32463g = j10;
                        c3298e.d(j10, dVar5.P + i23);
                    }
                    dVar5.f32497i = 2;
                    dVar5.f32478O = i23;
                    int i25 = i24 - i23;
                    dVar5.f32474K = i25;
                    int i26 = dVar5.f32479R;
                    if (i25 < i26) {
                        dVar5.f32474K = i26;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.b(c3298e);
                }
            }
        }
        if (this.f32523l0 > 0) {
            AbstractC4828h.s(this, c3298e, 0);
        }
        if (this.f32524m0 > 0) {
            AbstractC4828h.s(this, c3298e, 1);
        }
    }

    public final boolean E(int i10, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        j1.e eVar = this.f32517f0;
        e eVar2 = (e) eVar.f35968c;
        int i11 = eVar2.i(0);
        int i12 = eVar2.i(1);
        int n10 = eVar2.n();
        int o10 = eVar2.o();
        Object obj = eVar.f35970e;
        if (z13 && (i11 == 2 || i12 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f35998f == i10 && !mVar.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && i11 == 2) {
                    eVar2.x(1);
                    eVar2.z(eVar.e(eVar2, 0));
                    eVar2.f32492d.f35997e.d(eVar2.m());
                }
            } else if (z13 && i12 == 2) {
                eVar2.y(1);
                eVar2.w(eVar.e(eVar2, 1));
                eVar2.f32493e.f35997e.d(eVar2.j());
            }
        }
        if (i10 == 0) {
            int i13 = eVar2.f32491c0[0];
            if (i13 == 1 || i13 == 4) {
                int m10 = eVar2.m() + n10;
                eVar2.f32492d.f36001i.d(m10);
                eVar2.f32492d.f35997e.d(m10 - n10);
                z11 = true;
            }
            z11 = false;
        } else {
            int i14 = eVar2.f32491c0[1];
            if (i14 == 1 || i14 == 4) {
                int j6 = eVar2.j() + o10;
                eVar2.f32493e.f36001i.d(j6);
                eVar2.f32493e.f35997e.d(j6 - o10);
                z11 = true;
            }
            z11 = false;
        }
        eVar.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f35998f == i10 && (mVar2.f35994b != eVar2 || mVar2.f35999g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f35998f == i10 && (z11 || mVar3.f35994b != eVar2)) {
                if (!mVar3.f36000h.f35984j || !mVar3.f36001i.f35984j || (!(mVar3 instanceof j1.c) && !mVar3.f35997e.f35984j)) {
                    z12 = false;
                    break;
                }
            }
        }
        eVar2.x(i11);
        eVar2.y(i12);
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[LOOP:5: B:56:0x00fd->B:57:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int max;
        boolean z13;
        ?? r72;
        int max2;
        boolean z14;
        boolean z15;
        Exception e10;
        int size;
        int i10;
        boolean[] zArr = k.f32591a;
        this.f32477N = 0;
        this.f32478O = 0;
        int max3 = Math.max(0, m());
        int max4 = Math.max(0, j());
        this.f32528q0 = false;
        this.f32529r0 = false;
        int i11 = this.f32527p0;
        if ((i11 & 64) == 64) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr == null && (i11 & 128) != 128) {
            objArr2 = null;
        } else {
            objArr2 = 1;
        }
        C3298e c3298e = this.f32520i0;
        c3298e.getClass();
        c3298e.f31711f = false;
        if (this.f32527p0 != 0 && objArr2 != null) {
            c3298e.f31711f = true;
        }
        int[] iArr = this.f32491c0;
        char c10 = iArr[1];
        char c11 = iArr[0];
        ArrayList arrayList2 = this.f32515d0;
        if (c11 != 2 && c10 != 2) {
            objArr3 = null;
        } else {
            objArr3 = 1;
        }
        this.f32523l0 = 0;
        this.f32524m0 = 0;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            d dVar = (d) this.f32515d0.get(i12);
            if (dVar instanceof e) {
                ((e) dVar).F();
            }
        }
        int i13 = 0;
        boolean z16 = false;
        boolean z17 = true;
        while (z17) {
            int i14 = i13 + 1;
            try {
                c3298e.r();
                this.f32523l0 = 0;
                this.f32524m0 = 0;
                g(c3298e);
                for (int i15 = 0; i15 < size2; i15++) {
                    ((d) this.f32515d0.get(i15)).g(c3298e);
                }
                D(c3298e);
            } catch (Exception e11) {
                e10 = e11;
            }
            try {
                C3301h c3301h = c3298e.f31707b;
                if (c3298e.f31711f) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < c3298e.f31714i) {
                            if (!c3298e.f31710e[i16].f31703e) {
                                c3298e.o(c3301h);
                                break;
                            }
                            i16++;
                        } else {
                            for (int i17 = 0; i17 < c3298e.f31714i; i17++) {
                                C3296c c3296c = c3298e.f31710e[i17];
                                c3296c.f31699a.f31733e = c3296c.f31700b;
                            }
                        }
                    }
                } else {
                    c3298e.o(c3301h);
                }
                arrayList = arrayList2;
                z10 = z16;
            } catch (Exception e12) {
                e10 = e12;
                z17 = true;
                e10.printStackTrace();
                z10 = z16;
                arrayList = arrayList2;
                System.out.println("EXCEPTION : " + e10);
                if (!z17) {
                    B(c3298e);
                    for (int i18 = 0; i18 < size2; i18++) {
                        ((d) this.f32515d0.get(i18)).B(c3298e);
                    }
                    if (objArr3 == null) {
                    }
                    z11 = z10;
                    z12 = false;
                    max = Math.max(this.Q, m());
                    if (max > m()) {
                    }
                    max2 = Math.max(this.f32479R, j());
                    if (max2 > j()) {
                    }
                    if (!z15) {
                    }
                    z17 = z14;
                    z16 = z15;
                    i13 = i14;
                    arrayList2 = arrayList;
                }
                zArr[2] = false;
                B(c3298e);
                size = this.f32515d0.size();
                while (i10 < size) {
                }
                if (objArr3 == null) {
                }
                z11 = z10;
                z12 = false;
                max = Math.max(this.Q, m());
                if (max > m()) {
                }
                max2 = Math.max(this.f32479R, j());
                if (max2 > j()) {
                }
                if (!z15) {
                }
                z17 = z14;
                z16 = z15;
                i13 = i14;
                arrayList2 = arrayList;
            }
            zArr[2] = false;
            B(c3298e);
            size = this.f32515d0.size();
            for (i10 = 0; i10 < size; i10++) {
                ((d) this.f32515d0.get(i10)).B(c3298e);
            }
            if (objArr3 == null && i14 < 8 && zArr[2]) {
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < size2; i21++) {
                    d dVar2 = (d) this.f32515d0.get(i21);
                    i19 = Math.max(i19, dVar2.m() + dVar2.f32477N);
                    i20 = Math.max(i20, dVar2.j() + dVar2.f32478O);
                }
                int max5 = Math.max(this.Q, i19);
                int max6 = Math.max(this.f32479R, i20);
                if (c11 == 2 && m() < max5) {
                    z(max5);
                    iArr[0] = 2;
                    z12 = true;
                    z11 = true;
                } else {
                    z11 = z10;
                    z12 = false;
                }
                if (c10 == 2 && j() < max6) {
                    w(max6);
                    iArr[1] = 2;
                    z12 = true;
                    z11 = true;
                }
            } else {
                z11 = z10;
                z12 = false;
            }
            max = Math.max(this.Q, m());
            if (max > m()) {
                z(max);
                r72 = 1;
                iArr[0] = 1;
                z12 = true;
                z13 = true;
            } else {
                r72 = 1;
                z13 = z11;
            }
            max2 = Math.max(this.f32479R, j());
            if (max2 > j()) {
                w(max2);
                iArr[r72] = r72;
                z15 = r72;
                z14 = z15;
            } else {
                z14 = z12;
                z15 = z13;
            }
            if (!z15) {
                if (iArr[0] == 2 && max3 > 0 && m() > max3) {
                    this.f32528q0 = r72;
                    iArr[0] = r72;
                    z(max3);
                    boolean z18 = r72 == true ? 1 : 0;
                    Object[] objArr4 = r72 == true ? 1 : 0;
                    z15 = z18;
                    z14 = z15;
                }
                char c12 = r72 == true ? 1 : 0;
                char c13 = r72 == true ? 1 : 0;
                if (iArr[c12] == 2 && max4 > 0 && j() > max4) {
                    this.f32529r0 = r72;
                    char c14 = r72 == true ? 1 : 0;
                    char c15 = r72 == true ? 1 : 0;
                    iArr[r72] = c14;
                    w(max4);
                    z15 = true;
                    z17 = true;
                    z16 = z15;
                    i13 = i14;
                    arrayList2 = arrayList;
                }
            }
            z17 = z14;
            z16 = z15;
            i13 = i14;
            arrayList2 = arrayList;
        }
        boolean z19 = z16;
        this.f32515d0 = arrayList2;
        if (z19) {
            iArr[0] = c11;
            iArr[1] = c10;
        }
        v(c3298e.f31716k);
    }

    @Override // i1.d
    public final void t() {
        this.f32520i0.r();
        this.f32521j0 = 0;
        this.f32522k0 = 0;
        this.f32515d0.clear();
        super.t();
    }

    @Override // i1.d
    public final void v(n nVar) {
        super.v(nVar);
        int size = this.f32515d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f32515d0.get(i10)).v(nVar);
        }
    }
}
