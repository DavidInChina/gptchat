package p3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class F implements L2.q {

    /* renamed from: a  reason: collision with root package name */
    public final List f42412a;

    /* renamed from: d  reason: collision with root package name */
    public final C5084g f42415d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f42416e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseBooleanArray f42417f;

    /* renamed from: i  reason: collision with root package name */
    public P2.a f42420i;

    /* renamed from: k  reason: collision with root package name */
    public int f42422k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42423l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f42424m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f42425n;

    /* renamed from: o  reason: collision with root package name */
    public final I f42426o;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42413b = new s2.u(0, new byte[9400]);

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f42418g = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f42414c = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    public final C5076D f42419h = new C5076D();

    /* renamed from: j  reason: collision with root package name */
    public L2.s f42421j = L2.s.f10638m;

    /* renamed from: p  reason: collision with root package name */
    public int f42427p = -1;

    public F(s2.z zVar, C5084g c5084g) {
        this.f42415d = c5084g;
        this.f42412a = Collections.singletonList(zVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f42417f = sparseBooleanArray;
        SparseArray sparseArray = new SparseArray();
        this.f42416e = sparseArray;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (I) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new C5075C(new U3.l(this)));
        this.f42426o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [P2.a, L2.j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r5v7, types: [L2.i, j.j, java.lang.Object] */
    @Override // L2.q
    public final int a(L2.r rVar, I2.i iVar) {
        ?? r42;
        ?? r32;
        int i10;
        boolean z10;
        I i11;
        int i12;
        boolean z11;
        long j6;
        int i13;
        long j10;
        long h10 = rVar.h();
        if (this.f42423l) {
            int i14 = (h10 > (-1L) ? 1 : (h10 == (-1L) ? 0 : -1));
            C5076D c5076d = this.f42419h;
            if (i14 != 0 && !c5076d.f42401d) {
                int i15 = this.f42427p;
                if (i15 <= 0) {
                    c5076d.a(rVar);
                    return 0;
                }
                boolean z12 = c5076d.f42403f;
                s2.u uVar = c5076d.f42400c;
                int i16 = c5076d.f42398a;
                if (!z12) {
                    long h11 = rVar.h();
                    int min = (int) Math.min(i16, h11);
                    long j11 = h11 - min;
                    if (rVar.o() != j11) {
                        iVar.f7995b = j11;
                        i13 = 1;
                    } else {
                        uVar.C(min);
                        rVar.k();
                        rVar.n(uVar.f45193a, 0, min);
                        int i17 = uVar.f45194b;
                        int i18 = uVar.f45195c;
                        int i19 = i18 - 188;
                        while (true) {
                            if (i19 >= i17) {
                                byte[] bArr = uVar.f45193a;
                                int i20 = -4;
                                int i21 = 0;
                                while (true) {
                                    if (i20 > 4) {
                                        break;
                                    }
                                    int i22 = (i20 * 188) + i19;
                                    if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                        i21++;
                                        if (i21 == 5) {
                                            long U02 = r9.y.U0(i19, i15, uVar);
                                            if (U02 != -9223372036854775807L) {
                                                j10 = U02;
                                                break;
                                            }
                                        }
                                    } else {
                                        i21 = 0;
                                    }
                                    i20++;
                                }
                                i19--;
                            } else {
                                j10 = -9223372036854775807L;
                                break;
                            }
                        }
                        c5076d.f42405h = j10;
                        c5076d.f42403f = true;
                        i13 = 0;
                    }
                } else if (c5076d.f42405h == -9223372036854775807L) {
                    c5076d.a(rVar);
                    return 0;
                } else if (!c5076d.f42402e) {
                    int min2 = (int) Math.min(i16, rVar.h());
                    long j12 = 0;
                    if (rVar.o() != j12) {
                        iVar.f7995b = j12;
                        i13 = 1;
                    } else {
                        uVar.C(min2);
                        rVar.k();
                        rVar.n(uVar.f45193a, 0, min2);
                        int i23 = uVar.f45194b;
                        int i24 = uVar.f45195c;
                        while (true) {
                            if (i23 < i24) {
                                if (uVar.f45193a[i23] == 71) {
                                    j6 = r9.y.U0(i23, i15, uVar);
                                    if (j6 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i23++;
                            } else {
                                j6 = -9223372036854775807L;
                                break;
                            }
                        }
                        c5076d.f42404g = j6;
                        c5076d.f42402e = true;
                        i13 = 0;
                    }
                } else {
                    long j13 = c5076d.f42404g;
                    if (j13 == -9223372036854775807L) {
                        c5076d.a(rVar);
                        return 0;
                    }
                    s2.z zVar = c5076d.f42399b;
                    c5076d.f42406i = zVar.c(c5076d.f42405h) - zVar.b(j13);
                    c5076d.a(rVar);
                    return 0;
                }
                return i13;
            }
            if (!this.f42424m) {
                this.f42424m = true;
                long j14 = c5076d.f42406i;
                if (j14 != -9223372036854775807L) {
                    int i25 = this.f42427p;
                    P5.c cVar = new P5.c(29);
                    ?? obj = new Object();
                    obj.f35817Y = i25;
                    obj.f35819h0 = c5076d.f42399b;
                    obj.f35818Z = 112800;
                    obj.f35820i0 = new s2.u();
                    ?? jVar = new L2.j(cVar, obj, j14, 1 + j14, 0L, h10, 188L, 940);
                    this.f42420i = jVar;
                    this.f42421j.b(jVar.f10606a);
                } else {
                    this.f42421j.b(new L2.u(j14));
                }
            }
            if (this.f42425n) {
                z11 = false;
                this.f42425n = false;
                h(0L, 0L);
                if (rVar.o() != 0) {
                    iVar.f7995b = 0L;
                    return 1;
                }
            } else {
                z11 = false;
            }
            r42 = 1;
            r42 = 1;
            P2.a aVar = this.f42420i;
            r32 = z11;
            if (aVar != null) {
                r32 = z11;
                if (aVar.f10608c != null) {
                    return aVar.a(rVar, iVar);
                }
            }
        } else {
            r32 = 0;
            r42 = 1;
        }
        s2.u uVar2 = this.f42413b;
        byte[] bArr2 = uVar2.f45193a;
        if (9400 - uVar2.f45194b < 188) {
            int a5 = uVar2.a();
            if (a5 > 0) {
                System.arraycopy(bArr2, uVar2.f45194b, bArr2, r32, a5);
            }
            uVar2.D(a5, bArr2);
        }
        while (true) {
            int a10 = uVar2.a();
            SparseArray sparseArray = this.f42416e;
            if (a10 < 188) {
                int i26 = uVar2.f45195c;
                int read = rVar.read(bArr2, i26, 9400 - i26);
                if (read == -1) {
                    for (int i27 = r32; i27 < sparseArray.size(); i27++) {
                        I i28 = (I) sparseArray.valueAt(i27);
                        if (i28 instanceof x) {
                            i28.a(r42, new s2.u());
                        }
                    }
                    return -1;
                }
                uVar2.E(i26 + read);
            } else {
                int i29 = uVar2.f45194b;
                int i30 = uVar2.f45195c;
                byte[] bArr3 = uVar2.f45193a;
                while (i29 < i30 && bArr3[i29] != 71) {
                    i29++;
                }
                uVar2.F(i29);
                int i31 = i29 + 188;
                int i32 = uVar2.f45195c;
                if (i31 > i32) {
                    return r32;
                }
                int g10 = uVar2.g();
                if ((8388608 & g10) != 0) {
                    uVar2.F(i31);
                    return r32;
                }
                if ((4194304 & g10) != 0) {
                    i10 = r42;
                } else {
                    i10 = r32;
                }
                int i33 = (2096896 & g10) >> 8;
                if ((g10 & 32) != 0) {
                    boolean z13 = r42 == true ? 1 : 0;
                    boolean z14 = r42 == true ? 1 : 0;
                    boolean z15 = r42 == true ? 1 : 0;
                    z10 = z13;
                } else {
                    z10 = r32;
                }
                if ((g10 & 16) != 0) {
                    i11 = (I) sparseArray.get(i33);
                } else {
                    i11 = null;
                }
                if (i11 == null) {
                    uVar2.F(i31);
                    return r32;
                }
                int i34 = g10 & 15;
                SparseIntArray sparseIntArray = this.f42414c;
                int i35 = sparseIntArray.get(i33, i34 - 1);
                sparseIntArray.put(i33, i34);
                if (i35 == i34) {
                    uVar2.F(i31);
                    return r32;
                }
                int i36 = r42 == true ? 1 : 0;
                int i37 = r42 == true ? 1 : 0;
                int i38 = r42 == true ? 1 : 0;
                if (i34 != ((i35 + i36) & 15)) {
                    i11.d();
                }
                if (z10) {
                    int u10 = uVar2.u();
                    if ((uVar2.u() & 64) != 0) {
                        i12 = 2;
                    } else {
                        int i39 = r32 == true ? 1 : 0;
                        boolean z16 = r32 == true ? 1 : 0;
                        boolean z17 = r32 == true ? 1 : 0;
                        i12 = i39;
                    }
                    i10 |= i12;
                    uVar2.G(u10 - r42);
                }
                boolean z18 = this.f42423l;
                if (z18 || !this.f42418g.get(i33, r32)) {
                    uVar2.E(i31);
                    i11.a(i10, uVar2);
                    uVar2.E(i32);
                }
                if (!z18 && this.f42423l && h10 != -1) {
                    this.f42425n = r42;
                }
                uVar2.F(i31);
                int i40 = r32 == true ? 1 : 0;
                int i41 = r32 == true ? 1 : 0;
                int i42 = r32 == true ? 1 : 0;
                return i40;
            }
        }
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f42421j = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = r1 + 1;
     */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(L2.r rVar) {
        byte[] bArr = this.f42413b.f45193a;
        rVar.n(bArr, 0, 940);
        int i10 = 0;
        while (i10 < 188) {
            for (int i11 = 0; i11 < 5; i11++) {
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
            }
            rVar.l(i10);
            return true;
        }
        return false;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        P2.a aVar;
        boolean z10;
        List list = this.f42412a;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s2.z zVar = (s2.z) list.get(i11);
            if (zVar.e() == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long d10 = zVar.d();
                if (d10 != -9223372036854775807L) {
                    if (d10 != 0) {
                        if (d10 == j10) {
                        }
                        zVar.g(j10);
                    }
                }
            } else {
                if (!z10) {
                }
                zVar.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f42420i) != null) {
            aVar.c(j10);
        }
        this.f42413b.C(0);
        this.f42414c.clear();
        while (true) {
            SparseArray sparseArray = this.f42416e;
            if (i10 < sparseArray.size()) {
                ((I) sparseArray.valueAt(i10)).d();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
