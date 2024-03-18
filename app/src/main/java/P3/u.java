package p3;

import L2.AbstractC0881b;
import L2.C0880a;
import java.util.Collections;
import p2.C5065s;
import p2.O;

/* loaded from: classes.dex */
public final class u implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final String f42646a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42647b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.t f42648c;

    /* renamed from: d  reason: collision with root package name */
    public L2.G f42649d;

    /* renamed from: e  reason: collision with root package name */
    public String f42650e;

    /* renamed from: f  reason: collision with root package name */
    public C5065s f42651f;

    /* renamed from: g  reason: collision with root package name */
    public int f42652g;

    /* renamed from: h  reason: collision with root package name */
    public int f42653h;

    /* renamed from: i  reason: collision with root package name */
    public int f42654i;

    /* renamed from: j  reason: collision with root package name */
    public int f42655j;

    /* renamed from: k  reason: collision with root package name */
    public long f42656k = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42657l;

    /* renamed from: m  reason: collision with root package name */
    public int f42658m;

    /* renamed from: n  reason: collision with root package name */
    public int f42659n;

    /* renamed from: o  reason: collision with root package name */
    public int f42660o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f42661p;

    /* renamed from: q  reason: collision with root package name */
    public long f42662q;

    /* renamed from: r  reason: collision with root package name */
    public int f42663r;

    /* renamed from: s  reason: collision with root package name */
    public long f42664s;

    /* renamed from: t  reason: collision with root package name */
    public int f42665t;

    /* renamed from: u  reason: collision with root package name */
    public String f42666u;

    public u(String str) {
        this.f42646a = str;
        s2.u uVar = new s2.u(1024);
        this.f42647b = uVar;
        this.f42648c = new s2.t(uVar.f45193a, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x018e, code lost:
        if (r23.f42657l == false) goto L67;
     */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        int i11;
        boolean h10;
        Gi.e.o(this.f42649d);
        while (uVar.a() > 0) {
            int i12 = this.f42652g;
            if (i12 != 0) {
                if (i12 != 1) {
                    s2.u uVar2 = this.f42647b;
                    s2.t tVar = this.f42648c;
                    if (i12 != 2) {
                        if (i12 == 3) {
                            int min = Math.min(uVar.a(), this.f42654i - this.f42653h);
                            uVar.e(tVar.f45186b, this.f42653h, min);
                            int i13 = this.f42653h + min;
                            this.f42653h = i13;
                            if (i13 == this.f42654i) {
                                tVar.p(0);
                                if (!tVar.h()) {
                                    this.f42657l = true;
                                    int i14 = tVar.i(1);
                                    if (i14 == 1) {
                                        i11 = tVar.i(1);
                                    } else {
                                        i11 = 0;
                                    }
                                    this.f42658m = i11;
                                    if (i11 == 0) {
                                        if (i14 == 1) {
                                            tVar.i((tVar.i(2) + 1) * 8);
                                        }
                                        if (tVar.h()) {
                                            this.f42659n = tVar.i(6);
                                            int i15 = tVar.i(4);
                                            int i16 = tVar.i(3);
                                            if (i15 == 0 && i16 == 0) {
                                                if (i14 == 0) {
                                                    int g10 = tVar.g();
                                                    int b10 = tVar.b();
                                                    C0880a f6 = AbstractC0881b.f(tVar, true);
                                                    this.f42666u = f6.f10549c;
                                                    this.f42663r = f6.f10547a;
                                                    this.f42665t = f6.f10548b;
                                                    int b11 = b10 - tVar.b();
                                                    tVar.p(g10);
                                                    byte[] bArr = new byte[(b11 + 7) / 8];
                                                    tVar.j(bArr, b11);
                                                    p2.r rVar = new p2.r();
                                                    rVar.f42227a = this.f42650e;
                                                    rVar.f42237k = "audio/mp4a-latm";
                                                    rVar.f42234h = this.f42666u;
                                                    rVar.f42250x = this.f42665t;
                                                    rVar.f42251y = this.f42663r;
                                                    rVar.f42239m = Collections.singletonList(bArr);
                                                    rVar.f42229c = this.f42646a;
                                                    C5065s c5065s = new C5065s(rVar);
                                                    if (!c5065s.equals(this.f42651f)) {
                                                        this.f42651f = c5065s;
                                                        this.f42664s = 1024000000 / c5065s.f42298E0;
                                                        this.f42649d.b(c5065s);
                                                    }
                                                } else {
                                                    int b12 = tVar.b();
                                                    C0880a f10 = AbstractC0881b.f(tVar, true);
                                                    this.f42666u = f10.f10549c;
                                                    this.f42663r = f10.f10547a;
                                                    this.f42665t = f10.f10548b;
                                                    tVar.s(tVar.i((tVar.i(2) + 1) * 8) - (b12 - tVar.b()));
                                                }
                                                int i17 = tVar.i(3);
                                                this.f42660o = i17;
                                                if (i17 != 0) {
                                                    if (i17 != 1) {
                                                        if (i17 != 3 && i17 != 4 && i17 != 5) {
                                                            if (i17 != 6 && i17 != 7) {
                                                                throw new IllegalStateException();
                                                            }
                                                            tVar.s(1);
                                                        } else {
                                                            tVar.s(6);
                                                        }
                                                    } else {
                                                        tVar.s(9);
                                                    }
                                                } else {
                                                    tVar.s(8);
                                                }
                                                boolean h11 = tVar.h();
                                                this.f42661p = h11;
                                                this.f42662q = 0L;
                                                if (h11) {
                                                    if (i14 == 1) {
                                                        this.f42662q = tVar.i((tVar.i(2) + 1) * 8);
                                                    } else {
                                                        do {
                                                            h10 = tVar.h();
                                                            this.f42662q = (this.f42662q << 8) + tVar.i(8);
                                                        } while (h10);
                                                    }
                                                }
                                                if (tVar.h()) {
                                                    tVar.s(8);
                                                }
                                            } else {
                                                throw O.a(null, null);
                                            }
                                        } else {
                                            throw O.a(null, null);
                                        }
                                    } else {
                                        throw O.a(null, null);
                                    }
                                }
                                if (this.f42658m == 0) {
                                    if (this.f42659n == 0) {
                                        if (this.f42660o == 0) {
                                            int i18 = 0;
                                            do {
                                                i10 = tVar.i(8);
                                                i18 += i10;
                                            } while (i10 == 255);
                                            int g11 = tVar.g();
                                            if ((g11 & 7) == 0) {
                                                uVar2.F(g11 >> 3);
                                            } else {
                                                tVar.j(uVar2.f45193a, i18 * 8);
                                                uVar2.F(0);
                                            }
                                            this.f42649d.a(i18, uVar2);
                                            long j6 = this.f42656k;
                                            if (j6 != -9223372036854775807L) {
                                                this.f42649d.e(j6, 1, i18, 0, null);
                                                this.f42656k += this.f42664s;
                                            }
                                            if (this.f42661p) {
                                                tVar.s((int) this.f42662q);
                                            }
                                            this.f42652g = 0;
                                        } else {
                                            throw O.a(null, null);
                                        }
                                    } else {
                                        throw O.a(null, null);
                                    }
                                } else {
                                    throw O.a(null, null);
                                }
                            } else {
                                continue;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int u10 = ((this.f42655j & (-225)) << 8) | uVar.u();
                        this.f42654i = u10;
                        if (u10 > uVar2.f45193a.length) {
                            uVar2.C(u10);
                            byte[] bArr2 = uVar2.f45193a;
                            tVar.getClass();
                            tVar.n(bArr2.length, bArr2);
                        }
                        this.f42653h = 0;
                        this.f42652g = 3;
                    }
                } else {
                    int u11 = uVar.u();
                    if ((u11 & 224) == 224) {
                        this.f42655j = u11;
                        this.f42652g = 2;
                    } else if (u11 != 86) {
                        this.f42652g = 0;
                    }
                }
            } else if (uVar.u() == 86) {
                this.f42652g = 1;
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42652g = 0;
        this.f42656k = -9223372036854775807L;
        this.f42657l = false;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42656k = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        h10.i();
        this.f42649d = sVar.f(h10.f42432c, 1);
        this.f42650e = h10.d();
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
