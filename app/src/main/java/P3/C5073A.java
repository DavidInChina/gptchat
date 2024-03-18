package p3;

import android.util.SparseArray;

/* renamed from: p3.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5073A implements L2.q {

    /* renamed from: e  reason: collision with root package name */
    public boolean f42385e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42386f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42387g;

    /* renamed from: h  reason: collision with root package name */
    public long f42388h;

    /* renamed from: i  reason: collision with root package name */
    public P2.a f42389i;

    /* renamed from: j  reason: collision with root package name */
    public L2.s f42390j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42391k;

    /* renamed from: a  reason: collision with root package name */
    public final s2.z f42381a = new s2.z(0);

    /* renamed from: c  reason: collision with root package name */
    public final s2.u f42383c = new s2.u(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f42382b = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    public final y f42384d = new y();

    /* JADX WARN: Removed duplicated region for block: B:100:0x0223  */
    /* JADX WARN: Type inference failed for: r9v1, types: [P2.a, L2.j] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(L2.r rVar, I2.i iVar) {
        long j6;
        long j10;
        AbstractC5087j lVar;
        long j11;
        long j12;
        Gi.e.o(this.f42390j);
        long h10 = rVar.h();
        int i10 = (h10 > (-1L) ? 1 : (h10 == (-1L) ? 0 : -1));
        y yVar = this.f42384d;
        int i11 = 1;
        if (i10 != 0 && !yVar.f42699c) {
            boolean z10 = yVar.f42701e;
            s2.u uVar = yVar.f42698b;
            if (!z10) {
                long h11 = rVar.h();
                int min = (int) Math.min(20000L, h11);
                long j13 = h11 - min;
                if (rVar.o() != j13) {
                    iVar.f7995b = j13;
                    return i11;
                }
                uVar.C(min);
                rVar.k();
                rVar.n(uVar.f45193a, 0, min);
                int i12 = uVar.f45194b;
                int i13 = uVar.f45195c - 4;
                while (true) {
                    if (i13 >= i12) {
                        if (y.b(i13, uVar.f45193a) == 442) {
                            uVar.F(i13 + 4);
                            long c10 = y.c(uVar);
                            if (c10 != -9223372036854775807L) {
                                j12 = c10;
                                break;
                            }
                        }
                        i13--;
                    } else {
                        j12 = -9223372036854775807L;
                        break;
                    }
                }
                yVar.f42703g = j12;
                yVar.f42701e = true;
                i11 = 0;
                return i11;
            } else if (yVar.f42703g == -9223372036854775807L) {
                yVar.a(rVar);
                return 0;
            } else if (!yVar.f42700d) {
                int min2 = (int) Math.min(20000L, rVar.h());
                long j14 = 0;
                if (rVar.o() != j14) {
                    iVar.f7995b = j14;
                    return i11;
                }
                uVar.C(min2);
                rVar.k();
                rVar.n(uVar.f45193a, 0, min2);
                int i14 = uVar.f45194b;
                int i15 = uVar.f45195c;
                while (true) {
                    if (i14 < i15 - 3) {
                        if (y.b(i14, uVar.f45193a) == 442) {
                            uVar.F(i14 + 4);
                            long c11 = y.c(uVar);
                            if (c11 != -9223372036854775807L) {
                                j11 = c11;
                                break;
                            }
                        }
                        i14++;
                    } else {
                        j11 = -9223372036854775807L;
                        break;
                    }
                }
                yVar.f42702f = j11;
                yVar.f42700d = true;
                i11 = 0;
                return i11;
            } else {
                long j15 = yVar.f42702f;
                if (j15 == -9223372036854775807L) {
                    yVar.a(rVar);
                    return 0;
                }
                s2.z zVar = yVar.f42697a;
                yVar.f42704h = zVar.c(yVar.f42703g) - zVar.b(j15);
                yVar.a(rVar);
                return 0;
            }
        }
        if (!this.f42391k) {
            this.f42391k = true;
            long j16 = yVar.f42704h;
            if (j16 != -9223372036854775807L) {
                ?? jVar = new L2.j(new P5.c(29), new U3.c(yVar.f42697a, 0), j16, j16 + 1, 0L, h10, 188L, 1000);
                this.f42389i = jVar;
                this.f42390j.b(jVar.f10606a);
            } else {
                this.f42390j.b(new L2.u(j16));
            }
        }
        P2.a aVar = this.f42389i;
        if (aVar != null && aVar.f10608c != null) {
            return aVar.a(rVar, iVar);
        }
        rVar.k();
        if (i10 != 0) {
            j6 = h10 - rVar.d();
        } else {
            j6 = -1;
        }
        if (j6 != -1 && j6 < 4) {
            return -1;
        }
        s2.u uVar2 = this.f42383c;
        if (!rVar.c(uVar2.f45193a, 0, 4, true)) {
            return -1;
        }
        uVar2.F(0);
        int g10 = uVar2.g();
        if (g10 == 441) {
            return -1;
        }
        if (g10 == 442) {
            rVar.n(uVar2.f45193a, 0, 10);
            uVar2.F(9);
            rVar.l((uVar2.u() & 7) + 14);
            return 0;
        } else if (g10 == 443) {
            rVar.n(uVar2.f45193a, 0, 2);
            uVar2.F(0);
            rVar.l(uVar2.z() + 6);
            return 0;
        } else if (((g10 & (-256)) >> 8) != 1) {
            rVar.l(1);
            return 0;
        } else {
            int i16 = g10 & 255;
            SparseArray sparseArray = this.f42382b;
            z zVar2 = (z) sparseArray.get(i16);
            if (!this.f42385e) {
                if (zVar2 == null) {
                    AbstractC5087j abstractC5087j = null;
                    if (i16 == 189) {
                        lVar = new C5079b(null);
                        this.f42386f = true;
                        this.f42388h = rVar.o();
                    } else if ((g10 & 224) == 192) {
                        lVar = new v(null);
                        this.f42386f = true;
                        this.f42388h = rVar.o();
                    } else {
                        if ((g10 & 240) == 224) {
                            lVar = new l(null);
                            this.f42387g = true;
                            this.f42388h = rVar.o();
                        }
                        if (abstractC5087j != null) {
                            abstractC5087j.g(this.f42390j, new H(i16, 256));
                            zVar2 = new z(abstractC5087j, this.f42381a);
                            sparseArray.put(i16, zVar2);
                        }
                    }
                    abstractC5087j = lVar;
                    if (abstractC5087j != null) {
                    }
                }
                if (this.f42386f && this.f42387g) {
                    j10 = this.f42388h + 8192;
                } else {
                    j10 = 1048576;
                }
                if (rVar.o() > j10) {
                    this.f42385e = true;
                    this.f42390j.d();
                }
            }
            rVar.n(uVar2.f45193a, 0, 2);
            uVar2.F(0);
            int z11 = uVar2.z() + 6;
            if (zVar2 == null) {
                rVar.l(z11);
            } else {
                uVar2.C(z11);
                rVar.readFully(uVar2.f45193a, 0, z11);
                uVar2.F(6);
                s2.t tVar = zVar2.f42707c;
                uVar2.e(tVar.f45186b, 0, 3);
                tVar.p(0);
                tVar.s(8);
                zVar2.f42708d = tVar.h();
                zVar2.f42709e = tVar.h();
                tVar.s(6);
                uVar2.e(tVar.f45186b, 0, tVar.i(8));
                tVar.p(0);
                zVar2.f42711g = 0L;
                if (zVar2.f42708d) {
                    tVar.s(4);
                    tVar.s(1);
                    tVar.s(1);
                    long i17 = (tVar.i(3) << 30) | (tVar.i(15) << 15) | tVar.i(15);
                    tVar.s(1);
                    boolean z12 = zVar2.f42710f;
                    s2.z zVar3 = zVar2.f42706b;
                    if (!z12 && zVar2.f42709e) {
                        tVar.s(4);
                        tVar.s(1);
                        tVar.s(1);
                        tVar.s(1);
                        zVar3.b((tVar.i(3) << 30) | (tVar.i(15) << 15) | tVar.i(15));
                        zVar2.f42710f = true;
                    }
                    zVar2.f42711g = zVar3.b(i17);
                }
                long j17 = zVar2.f42711g;
                AbstractC5087j abstractC5087j2 = zVar2.f42705a;
                abstractC5087j2.f(4, j17);
                abstractC5087j2.b(uVar2);
                abstractC5087j2.e(false);
                uVar2.E(uVar2.f45193a.length);
            }
            return 0;
        }
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f42390j = sVar;
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        byte[] bArr = new byte[14];
        rVar.n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        rVar.e(bArr[13] & 7);
        rVar.n(bArr, 0, 3);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r4 != r9) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r8 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r7.g(r9);
     */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j6, long j10) {
        boolean z10;
        s2.z zVar = this.f42381a;
        if (zVar.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d10 = zVar.d();
            if (d10 != -9223372036854775807L) {
                if (d10 != 0) {
                }
            }
        }
        P2.a aVar = this.f42389i;
        if (aVar != null) {
            aVar.c(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f42382b;
            if (i10 < sparseArray.size()) {
                z zVar2 = (z) sparseArray.valueAt(i10);
                zVar2.f42710f = false;
                zVar2.f42705a.d();
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
