package p3;

import java.io.EOFException;

/* renamed from: p3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5082e implements L2.q {

    /* renamed from: a  reason: collision with root package name */
    public final int f42467a;

    /* renamed from: b  reason: collision with root package name */
    public final C5083f f42468b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.u f42469c;

    /* renamed from: d  reason: collision with root package name */
    public final s2.u f42470d;

    /* renamed from: e  reason: collision with root package name */
    public final s2.t f42471e;

    /* renamed from: f  reason: collision with root package name */
    public L2.s f42472f;

    /* renamed from: g  reason: collision with root package name */
    public long f42473g;

    /* renamed from: h  reason: collision with root package name */
    public long f42474h;

    /* renamed from: i  reason: collision with root package name */
    public int f42475i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42476j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42477k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42478l;

    public C5082e(int i10) {
        this.f42467a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f42468b = new C5083f(null, true);
        this.f42469c = new s2.u(2048);
        this.f42475i = -1;
        this.f42474h = -1L;
        s2.u uVar = new s2.u(10);
        this.f42470d = uVar;
        this.f42471e = new s2.t(uVar.f45193a, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        r19.f42476j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        throw p2.O.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(L2.r rVar, I2.i iVar) {
        int i10;
        int read;
        boolean z10;
        boolean z11;
        C5083f c5083f;
        boolean z12;
        C5083f c5083f2;
        boolean z13;
        boolean z14;
        Gi.e.o(this.f42472f);
        long h10 = rVar.h();
        int i11 = this.f42467a;
        int i12 = i11 & 2;
        int i13 = 4;
        if (i12 != 0 || ((i11 & 1) != 0 && h10 != -1)) {
            s2.t tVar = this.f42471e;
            s2.u uVar = this.f42470d;
            if (!this.f42476j) {
                this.f42475i = -1;
                rVar.k();
                long j6 = 0;
                if (rVar.o() == 0) {
                    c(rVar);
                }
                int i14 = 0;
                while (true) {
                    try {
                        if (!rVar.c(uVar.f45193a, 0, 2, true)) {
                            break;
                        }
                        uVar.F(0);
                        if ((uVar.z() & 65526) == 65520) {
                            if (rVar.c(uVar.f45193a, 0, i13, true)) {
                                tVar.p(14);
                                int i15 = tVar.i(13);
                                if (i15 <= 6) {
                                    break;
                                }
                                j6 += i15;
                                i14++;
                                if (i14 != 1000 && rVar.m(i15 - 6, true)) {
                                    i13 = 4;
                                }
                            } else {
                                break;
                            }
                        } else {
                            i14 = 0;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                rVar.k();
                if (i14 > 0) {
                    this.f42475i = (int) (j6 / i14);
                    i10 = -1;
                } else {
                    i10 = -1;
                    this.f42475i = -1;
                }
                this.f42476j = true;
                s2.u uVar2 = this.f42469c;
                read = rVar.read(uVar2.f45193a, 0, 2048);
                if (read != i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = this.f42478l;
                C5083f c5083f3 = this.f42468b;
                if (!z11) {
                    if ((i11 & 1) != 0 && this.f42475i > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13 || c5083f3.f42496q != -9223372036854775807L || z10) {
                        if (z13) {
                            long j10 = c5083f3.f42496q;
                            if (j10 != -9223372036854775807L) {
                                L2.s sVar = this.f42472f;
                                if (i12 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                int i16 = this.f42475i;
                                c5083f = c5083f3;
                                sVar.b(new L2.l((int) ((i16 * 8000000) / j10), i16, h10, this.f42474h, z14));
                                z12 = true;
                                this.f42478l = true;
                                if (!z10) {
                                    return -1;
                                }
                                uVar2.F(0);
                                uVar2.E(read);
                                if (!this.f42477k) {
                                    c5083f2 = c5083f;
                                    c5083f2.f(4, this.f42473g);
                                    this.f42477k = z12;
                                } else {
                                    c5083f2 = c5083f;
                                }
                                c5083f2.b(uVar2);
                                return 0;
                            }
                        }
                        c5083f = c5083f3;
                        this.f42472f.b(new L2.u(-9223372036854775807L));
                        z12 = true;
                        this.f42478l = true;
                        if (!z10) {
                        }
                    }
                }
                z12 = true;
                c5083f = c5083f3;
                if (!z10) {
                }
            }
        }
        i10 = -1;
        s2.u uVar22 = this.f42469c;
        read = rVar.read(uVar22.f45193a, 0, 2048);
        if (read != i10) {
        }
        z11 = this.f42478l;
        C5083f c5083f32 = this.f42468b;
        if (!z11) {
        }
        z12 = true;
        c5083f = c5083f32;
        if (!z10) {
        }
    }

    public final int c(L2.r rVar) {
        int i10 = 0;
        while (true) {
            s2.u uVar = this.f42470d;
            rVar.n(uVar.f45193a, 0, 10);
            uVar.F(0);
            if (uVar.w() != 4801587) {
                break;
            }
            uVar.G(3);
            int t10 = uVar.t();
            i10 += t10 + 10;
            rVar.e(t10);
        }
        rVar.k();
        rVar.e(i10);
        if (this.f42474h == -1) {
            this.f42474h = i10;
        }
        return i10;
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f42472f = sVar;
        this.f42468b.g(sVar, new H(0, 1));
        sVar.d();
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        int c10 = c(rVar);
        int i10 = c10;
        int i11 = 0;
        int i12 = 0;
        do {
            s2.u uVar = this.f42470d;
            rVar.n(uVar.f45193a, 0, 2);
            uVar.F(0);
            if ((uVar.z() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                rVar.n(uVar.f45193a, 0, 4);
                s2.t tVar = this.f42471e;
                tVar.p(14);
                int i13 = tVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    rVar.k();
                    rVar.e(i10);
                } else {
                    rVar.e(i13 - 6);
                    i12 += i13;
                }
            } else {
                i10++;
                rVar.k();
                rVar.e(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - c10 < 8192);
        return false;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f42477k = false;
        this.f42468b.d();
        this.f42473g = j10;
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
