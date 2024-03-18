package p3;

import L2.AbstractC0881b;
import p2.C5065s;
import s2.AbstractC5530A;

/* renamed from: p3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5079b implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final s2.t f42440a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42441b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42442c;

    /* renamed from: d  reason: collision with root package name */
    public String f42443d;

    /* renamed from: e  reason: collision with root package name */
    public L2.G f42444e;

    /* renamed from: g  reason: collision with root package name */
    public int f42446g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42447h;

    /* renamed from: i  reason: collision with root package name */
    public long f42448i;

    /* renamed from: j  reason: collision with root package name */
    public C5065s f42449j;

    /* renamed from: k  reason: collision with root package name */
    public int f42450k;

    /* renamed from: f  reason: collision with root package name */
    public int f42445f = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f42451l = -9223372036854775807L;

    public C5079b(String str) {
        s2.t tVar = new s2.t(new byte[128], 0);
        this.f42440a = tVar;
        this.f42441b = new s2.u(tVar.f45186b);
        this.f42442c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0285  */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String str2;
        int i15;
        int i16;
        char c10;
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
        boolean z10;
        boolean z11;
        Gi.e.o(this.f42444e);
        while (uVar.a() > 0) {
            int i28 = this.f42445f;
            s2.u uVar2 = this.f42441b;
            if (i28 == 0) {
                while (true) {
                    if (uVar.a() <= 0) {
                        break;
                    } else if (!this.f42447h) {
                        if (uVar.u() == 11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f42447h = z10;
                    } else {
                        int u10 = uVar.u();
                        if (u10 == 119) {
                            this.f42447h = false;
                            this.f42445f = 1;
                            byte[] bArr = uVar2.f45193a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f42446g = 2;
                            break;
                        }
                        if (u10 == 11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f42447h = z11;
                    }
                }
            } else if (i28 != 1) {
                if (i28 == 2) {
                    int min = Math.min(uVar.a(), this.f42450k - this.f42446g);
                    this.f42444e.a(min, uVar);
                    int i29 = this.f42446g + min;
                    this.f42446g = i29;
                    int i30 = this.f42450k;
                    if (i29 == i30) {
                        long j6 = this.f42451l;
                        if (j6 != -9223372036854775807L) {
                            this.f42444e.e(j6, 1, i30, 0, null);
                            this.f42451l += this.f42448i;
                        }
                        this.f42445f = 0;
                    }
                }
            } else {
                byte[] bArr2 = uVar2.f45193a;
                int min2 = Math.min(uVar.a(), 128 - this.f42446g);
                uVar.e(bArr2, this.f42446g, min2);
                int i31 = this.f42446g + min2;
                this.f42446g = i31;
                if (i31 == 128) {
                    s2.t tVar = this.f42440a;
                    tVar.p(0);
                    int g10 = tVar.g();
                    tVar.s(40);
                    if (tVar.i(5) > 10) {
                        objArr = 1;
                    } else {
                        objArr = null;
                    }
                    tVar.p(g10);
                    int[] iArr = AbstractC0881b.f10555f;
                    int[] iArr2 = AbstractC0881b.f10553d;
                    if (objArr != null) {
                        tVar.s(16);
                        int i32 = tVar.i(2);
                        if (i32 != 0) {
                            if (i32 != 1) {
                                if (i32 != 2) {
                                    c10 = '\uffff';
                                } else {
                                    c10 = 2;
                                }
                            } else {
                                c10 = 1;
                            }
                        } else {
                            c10 = 0;
                        }
                        tVar.s(3);
                        i13 = (tVar.i(11) + 1) * 2;
                        int i33 = tVar.i(2);
                        if (i33 == 3) {
                            i10 = AbstractC0881b.f10554e[tVar.i(2)];
                            i17 = 3;
                            i18 = 6;
                        } else {
                            int i34 = tVar.i(2);
                            int i35 = AbstractC0881b.f10552c[i34];
                            i10 = iArr2[i33];
                            i17 = i34;
                            i18 = i35;
                        }
                        i14 = i18 * 256;
                        int i36 = (i13 * i10) / (i18 * 32);
                        int i37 = tVar.i(3);
                        boolean h10 = tVar.h();
                        i11 = iArr[i37] + (h10 ? 1 : 0);
                        tVar.s(10);
                        if (tVar.h()) {
                            tVar.s(8);
                        }
                        if (i37 == 0) {
                            tVar.s(5);
                            if (tVar.h()) {
                                tVar.s(8);
                            }
                        }
                        if (c10 == 1 && tVar.h()) {
                            tVar.s(16);
                        }
                        if (tVar.h()) {
                            if (i37 > 2) {
                                tVar.s(2);
                            }
                            if ((i37 & 1) != 0 && i37 > 2) {
                                i23 = 6;
                                tVar.s(6);
                            } else {
                                i23 = 6;
                            }
                            if ((i37 & 4) != 0) {
                                tVar.s(i23);
                            }
                            if (h10 && tVar.h()) {
                                tVar.s(5);
                            }
                            if (c10 == 0) {
                                if (tVar.h()) {
                                    i24 = 6;
                                    tVar.s(6);
                                } else {
                                    i24 = 6;
                                }
                                if (i37 == 0 && tVar.h()) {
                                    tVar.s(i24);
                                }
                                if (tVar.h()) {
                                    tVar.s(i24);
                                }
                                int i38 = tVar.i(2);
                                if (i38 == 1) {
                                    tVar.s(5);
                                    i25 = 2;
                                } else {
                                    if (i38 == 2) {
                                        tVar.s(12);
                                    } else if (i38 == 3) {
                                        int i39 = tVar.i(5);
                                        if (tVar.h()) {
                                            tVar.s(5);
                                            if (tVar.h()) {
                                                i27 = 4;
                                                tVar.s(4);
                                            } else {
                                                i27 = 4;
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                tVar.s(i27);
                                            }
                                            if (tVar.h()) {
                                                if (tVar.h()) {
                                                    tVar.s(i27);
                                                }
                                                if (tVar.h()) {
                                                    tVar.s(i27);
                                                }
                                            }
                                        }
                                        if (tVar.h()) {
                                            tVar.s(5);
                                            if (tVar.h()) {
                                                tVar.s(7);
                                                if (tVar.h()) {
                                                    i26 = 8;
                                                    tVar.s(8);
                                                    i25 = 2;
                                                    tVar.s((i39 + 2) * i26);
                                                    tVar.c();
                                                }
                                            }
                                        }
                                        i26 = 8;
                                        i25 = 2;
                                        tVar.s((i39 + 2) * i26);
                                        tVar.c();
                                    }
                                    i25 = 2;
                                }
                                if (i37 < i25) {
                                    if (tVar.h()) {
                                        tVar.s(14);
                                    }
                                    if (i37 == 0 && tVar.h()) {
                                        tVar.s(14);
                                    }
                                }
                                if (tVar.h()) {
                                    i19 = i17;
                                    if (i19 == 0) {
                                        tVar.s(5);
                                    } else {
                                        int i40 = 5;
                                        int i41 = 0;
                                        while (i41 < i18) {
                                            if (tVar.h()) {
                                                tVar.s(i40);
                                            }
                                            i41++;
                                            i40 = 5;
                                        }
                                    }
                                    if (!tVar.h()) {
                                        tVar.s(5);
                                        if (i37 == 2) {
                                            tVar.s(4);
                                        }
                                        if (i37 >= 6) {
                                            tVar.s(2);
                                        }
                                        if (tVar.h()) {
                                            i22 = 8;
                                            tVar.s(8);
                                        } else {
                                            i22 = 8;
                                        }
                                        if (i37 == 0 && tVar.h()) {
                                            tVar.s(i22);
                                        }
                                        i20 = 3;
                                        if (i33 < 3) {
                                            tVar.r();
                                        }
                                    } else {
                                        i20 = 3;
                                    }
                                    if (c10 == 0 && i19 != i20) {
                                        tVar.r();
                                    }
                                    if (c10 != 2 && (i19 == i20 || tVar.h())) {
                                        i21 = 6;
                                        tVar.s(6);
                                    } else {
                                        i21 = 6;
                                    }
                                    if (!tVar.h() && tVar.i(i21) == 1 && tVar.i(8) == 1) {
                                        str = "audio/eac3-joc";
                                    } else {
                                        str = "audio/eac3";
                                    }
                                    i12 = i36;
                                }
                            }
                        }
                        i19 = i17;
                        if (!tVar.h()) {
                        }
                        if (c10 == 0) {
                            tVar.r();
                        }
                        if (c10 != 2) {
                        }
                        i21 = 6;
                        if (!tVar.h()) {
                        }
                        str = "audio/eac3";
                        i12 = i36;
                    } else {
                        tVar.s(32);
                        int i42 = tVar.i(2);
                        if (i42 != 3) {
                            str2 = "audio/ac3";
                        } else {
                            str2 = null;
                        }
                        int i43 = tVar.i(6);
                        i12 = AbstractC0881b.f10556g[i43 / 2] * 1000;
                        i13 = AbstractC0881b.a(i42, i43);
                        tVar.s(8);
                        int i44 = tVar.i(3);
                        if ((i44 & 1) != 0 && i44 != 1) {
                            i15 = 2;
                            tVar.s(2);
                        } else {
                            i15 = 2;
                        }
                        if ((i44 & 4) != 0) {
                            tVar.s(i15);
                        }
                        if (i44 == i15) {
                            tVar.s(i15);
                        }
                        if (i42 < 3) {
                            i16 = iArr2[i42];
                        } else {
                            i16 = -1;
                        }
                        i11 = iArr[i44] + (tVar.h() ? 1 : 0);
                        i14 = 1536;
                        str = str2;
                        i10 = i16;
                    }
                    C5065s c5065s = this.f42449j;
                    if (c5065s == null || i11 != c5065s.f42297D0 || i10 != c5065s.f42298E0 || !AbstractC5530A.a(str, c5065s.f42319q0)) {
                        p2.r rVar = new p2.r();
                        rVar.f42227a = this.f42443d;
                        rVar.f42237k = str;
                        rVar.f42250x = i11;
                        rVar.f42251y = i10;
                        rVar.f42229c = this.f42442c;
                        rVar.f42233g = i12;
                        if ("audio/ac3".equals(str)) {
                            rVar.f42232f = i12;
                        }
                        C5065s c5065s2 = new C5065s(rVar);
                        this.f42449j = c5065s2;
                        this.f42444e.b(c5065s2);
                    }
                    this.f42450k = i13;
                    this.f42448i = (i14 * 1000000) / this.f42449j.f42298E0;
                    uVar2.F(0);
                    this.f42444e.a(128, uVar2);
                    this.f42445f = 2;
                }
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42445f = 0;
        this.f42446g = 0;
        this.f42447h = false;
        this.f42451l = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42451l = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42443d = h10.d();
        h10.i();
        this.f42444e = sVar.f(h10.f42432c, 1);
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
