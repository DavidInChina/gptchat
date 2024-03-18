package p3;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p2.C5065s;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class l implements AbstractC5087j {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f42526q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f42527a;

    /* renamed from: b  reason: collision with root package name */
    public L2.G f42528b;

    /* renamed from: c  reason: collision with root package name */
    public final J f42529c;

    /* renamed from: d  reason: collision with root package name */
    public final s2.u f42530d;

    /* renamed from: e  reason: collision with root package name */
    public final w f42531e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f42532f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final k f42533g;

    /* renamed from: h  reason: collision with root package name */
    public long f42534h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f42535i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42536j;

    /* renamed from: k  reason: collision with root package name */
    public long f42537k;

    /* renamed from: l  reason: collision with root package name */
    public long f42538l;

    /* renamed from: m  reason: collision with root package name */
    public long f42539m;

    /* renamed from: n  reason: collision with root package name */
    public long f42540n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f42541o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f42542p;

    /* JADX WARN: Type inference failed for: r0v2, types: [p3.k, java.lang.Object] */
    public l(J j6) {
        this.f42529c = j6;
        ?? obj = new Object();
        obj.f42525d = new byte[128];
        this.f42533g = obj;
        if (j6 != null) {
            this.f42531e = new w(178);
            this.f42530d = new s2.u();
        } else {
            this.f42531e = null;
            this.f42530d = null;
        }
        this.f42538l = -9223372036854775807L;
        this.f42540n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        k kVar;
        w wVar;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        long j6;
        long j10;
        int i14;
        int i15;
        float f6;
        int i16;
        long j11;
        int i17;
        float f10;
        int i18;
        s2.u uVar2 = uVar;
        Gi.e.o(this.f42528b);
        int i19 = uVar2.f45194b;
        int i20 = uVar2.f45195c;
        byte[] bArr = uVar2.f45193a;
        this.f42534h += uVar.a();
        this.f42528b.a(uVar.a(), uVar2);
        while (true) {
            int b10 = t2.g.b(bArr, i19, i20, this.f42532f);
            kVar = this.f42533g;
            wVar = this.f42531e;
            if (b10 == i20) {
                break;
            }
            int i21 = b10 + 3;
            int i22 = uVar2.f45193a[i21] & 255;
            int i23 = b10 - i19;
            if (!this.f42536j) {
                if (i23 > 0) {
                    kVar.a(bArr, i19, b10);
                }
                if (i23 < 0) {
                    i15 = -i23;
                } else {
                    i15 = 0;
                }
                if (kVar.f42522a) {
                    int i24 = kVar.f42523b - i15;
                    kVar.f42523b = i24;
                    if (kVar.f42524c == 0 && i22 == 181) {
                        kVar.f42524c = i24;
                        i11 = i20;
                        i10 = i21;
                        i12 = i19;
                    } else {
                        kVar.f42522a = false;
                        String str = this.f42527a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(kVar.f42525d, kVar.f42523b);
                        byte b11 = copyOf[5];
                        i10 = i21;
                        i11 = i20;
                        int i25 = ((copyOf[4] & 255) << 4) | ((b11 & 255) >> 4);
                        int i26 = (copyOf[6] & 255) | ((b11 & 15) << 8);
                        int i27 = (copyOf[7] & 240) >> 4;
                        if (i27 != 2) {
                            if (i27 != 3) {
                                if (i27 != 4) {
                                    f6 = 1.0f;
                                    p2.r rVar = new p2.r();
                                    rVar.f42227a = str;
                                    rVar.f42237k = "video/mpeg2";
                                    rVar.f42242p = i25;
                                    rVar.f42243q = i26;
                                    rVar.f42246t = f6;
                                    rVar.f42239m = Collections.singletonList(copyOf);
                                    C5065s c5065s = new C5065s(rVar);
                                    i16 = (copyOf[7] & 15) - 1;
                                    if (i16 < 0 && i16 < 8) {
                                        double d10 = f42526q[i16];
                                        byte b12 = copyOf[kVar.f42524c + 9];
                                        int i28 = (b12 & 96) >> 5;
                                        if (i28 != (b12 & 31)) {
                                            i12 = i19;
                                            d10 *= (i28 + 1.0d) / (i17 + 1);
                                        } else {
                                            i12 = i19;
                                        }
                                        j11 = (long) (1000000.0d / d10);
                                    } else {
                                        i12 = i19;
                                        j11 = 0;
                                    }
                                    Pair create = Pair.create(c5065s, Long.valueOf(j11));
                                    this.f42528b.b((C5065s) create.first);
                                    this.f42537k = ((Long) create.second).longValue();
                                    this.f42536j = true;
                                } else {
                                    f10 = i26 * 121;
                                    i18 = i25 * 100;
                                }
                            } else {
                                f10 = i26 * 16;
                                i18 = i25 * 9;
                            }
                        } else {
                            f10 = i26 * 4;
                            i18 = i25 * 3;
                        }
                        f6 = f10 / i18;
                        p2.r rVar2 = new p2.r();
                        rVar2.f42227a = str;
                        rVar2.f42237k = "video/mpeg2";
                        rVar2.f42242p = i25;
                        rVar2.f42243q = i26;
                        rVar2.f42246t = f6;
                        rVar2.f42239m = Collections.singletonList(copyOf);
                        C5065s c5065s2 = new C5065s(rVar2);
                        i16 = (copyOf[7] & 15) - 1;
                        if (i16 < 0) {
                        }
                        i12 = i19;
                        j11 = 0;
                        Pair create2 = Pair.create(c5065s2, Long.valueOf(j11));
                        this.f42528b.b((C5065s) create2.first);
                        this.f42537k = ((Long) create2.second).longValue();
                        this.f42536j = true;
                    }
                } else {
                    i11 = i20;
                    i10 = i21;
                    i12 = i19;
                    if (i22 == 179) {
                        kVar.f42522a = true;
                    }
                }
                kVar.a(k.f42521e, 0, 3);
            } else {
                i11 = i20;
                i10 = i21;
                i12 = i19;
            }
            if (wVar != null) {
                if (i23 > 0) {
                    wVar.a(bArr, i12, b10);
                    i14 = 0;
                } else {
                    i14 = -i23;
                }
                if (wVar.e(i14)) {
                    int e10 = t2.g.e(wVar.f42681c, (byte[]) wVar.f42684f);
                    int i29 = AbstractC5530A.f45131a;
                    s2.u uVar3 = this.f42530d;
                    uVar3.D(e10, (byte[]) wVar.f42684f);
                    this.f42529c.a(this.f42540n, uVar3);
                }
                if (i22 == 178) {
                    uVar2 = uVar;
                    z10 = true;
                    if (uVar2.f45193a[b10 + 2] == 1) {
                        wVar.g(i22);
                    }
                    if (i22 == 0 && i22 != 179) {
                        if (i22 == 184) {
                            this.f42541o = z10;
                        }
                    } else {
                        i13 = i11 - b10;
                        if (this.f42542p && this.f42536j) {
                            j10 = this.f42540n;
                            if (j10 != -9223372036854775807L) {
                                this.f42528b.e(j10, this.f42541o ? 1 : 0, ((int) (this.f42534h - this.f42539m)) - i13, i13, null);
                            }
                        }
                        if (!this.f42535i && !this.f42542p) {
                            z12 = false;
                            z11 = true;
                        } else {
                            this.f42539m = this.f42534h - i13;
                            j6 = this.f42538l;
                            if (j6 == -9223372036854775807L) {
                                long j12 = this.f42540n;
                                if (j12 != -9223372036854775807L) {
                                    j6 = j12 + this.f42537k;
                                } else {
                                    j6 = -9223372036854775807L;
                                }
                            }
                            this.f42540n = j6;
                            z12 = false;
                            this.f42541o = false;
                            this.f42538l = -9223372036854775807L;
                            z11 = true;
                            this.f42535i = true;
                        }
                        if (i22 != 0) {
                            z13 = z11;
                        } else {
                            z13 = z12;
                        }
                        this.f42542p = z13;
                    }
                    i20 = i11;
                    i19 = i10;
                }
            }
            uVar2 = uVar;
            z10 = true;
            if (i22 == 0) {
            }
            i13 = i11 - b10;
            if (this.f42542p) {
                j10 = this.f42540n;
                if (j10 != -9223372036854775807L) {
                }
            }
            if (!this.f42535i) {
            }
            this.f42539m = this.f42534h - i13;
            j6 = this.f42538l;
            if (j6 == -9223372036854775807L) {
            }
            this.f42540n = j6;
            z12 = false;
            this.f42541o = false;
            this.f42538l = -9223372036854775807L;
            z11 = true;
            this.f42535i = true;
            if (i22 != 0) {
            }
            this.f42542p = z13;
            i20 = i11;
            i19 = i10;
        }
        if (!this.f42536j) {
            kVar.a(bArr, i19, i20);
        }
        if (wVar != null) {
            wVar.a(bArr, i19, i20);
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        t2.g.a(this.f42532f);
        k kVar = this.f42533g;
        kVar.f42522a = false;
        kVar.f42523b = 0;
        kVar.f42524c = 0;
        w wVar = this.f42531e;
        if (wVar != null) {
            wVar.f();
        }
        this.f42534h = 0L;
        this.f42535i = false;
        this.f42538l = -9223372036854775807L;
        this.f42540n = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
        Gi.e.o(this.f42528b);
        if (z10) {
            boolean z11 = this.f42541o;
            this.f42528b.e(this.f42540n, z11 ? 1 : 0, (int) (this.f42534h - this.f42539m), 0, null);
        }
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        this.f42538l = j6;
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42527a = h10.d();
        h10.i();
        this.f42528b = sVar.f(h10.f42432c, 2);
        J j6 = this.f42529c;
        if (j6 != null) {
            j6.b(sVar, h10);
        }
    }
}
