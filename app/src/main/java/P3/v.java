package p3;

import L2.C0882c;
import p2.C5065s;

/* loaded from: classes.dex */
public final class v implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final s2.u f42667a;

    /* renamed from: c  reason: collision with root package name */
    public final String f42669c;

    /* renamed from: d  reason: collision with root package name */
    public L2.G f42670d;

    /* renamed from: e  reason: collision with root package name */
    public String f42671e;

    /* renamed from: g  reason: collision with root package name */
    public int f42673g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42674h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f42675i;

    /* renamed from: j  reason: collision with root package name */
    public long f42676j;

    /* renamed from: k  reason: collision with root package name */
    public int f42677k;

    /* renamed from: f  reason: collision with root package name */
    public int f42672f = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0882c f42668b = new Object();

    /* renamed from: l  reason: collision with root package name */
    public long f42678l = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r0v1, types: [L2.c, java.lang.Object] */
    public v(String str) {
        s2.u uVar = new s2.u(4);
        this.f42667a = uVar;
        uVar.f45193a[0] = -1;
        this.f42669c = str;
    }

    @Override // p3.AbstractC5087j
    public final void b(s2.u uVar) {
        boolean z10;
        boolean z11;
        Gi.e.o(this.f42670d);
        while (uVar.a() > 0) {
            int i10 = this.f42672f;
            s2.u uVar2 = this.f42667a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(uVar.a(), this.f42677k - this.f42673g);
                        this.f42670d.a(min, uVar);
                        int i11 = this.f42673g + min;
                        this.f42673g = i11;
                        int i12 = this.f42677k;
                        if (i11 >= i12) {
                            long j6 = this.f42678l;
                            if (j6 != -9223372036854775807L) {
                                this.f42670d.e(j6, 1, i12, 0, null);
                                this.f42678l += this.f42676j;
                            }
                            this.f42673g = 0;
                            this.f42672f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(uVar.a(), 4 - this.f42673g);
                    uVar.e(uVar2.f45193a, this.f42673g, min2);
                    int i13 = this.f42673g + min2;
                    this.f42673g = i13;
                    if (i13 >= 4) {
                        uVar2.F(0);
                        int g10 = uVar2.g();
                        C0882c c0882c = this.f42668b;
                        if (!c0882c.a(g10)) {
                            this.f42673g = 0;
                            this.f42672f = 1;
                        } else {
                            this.f42677k = c0882c.f10571c;
                            if (!this.f42674h) {
                                int i14 = c0882c.f10572d;
                                this.f42676j = (c0882c.f10575g * 1000000) / i14;
                                p2.r rVar = new p2.r();
                                rVar.f42227a = this.f42671e;
                                rVar.f42237k = (String) c0882c.f10570b;
                                rVar.f42238l = 4096;
                                rVar.f42250x = c0882c.f10573e;
                                rVar.f42251y = i14;
                                rVar.f42229c = this.f42669c;
                                this.f42670d.b(new C5065s(rVar));
                                this.f42674h = true;
                            }
                            uVar2.F(0);
                            this.f42670d.a(4, uVar2);
                            this.f42672f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = uVar.f45193a;
                int i15 = uVar.f45194b;
                int i16 = uVar.f45195c;
                while (true) {
                    if (i15 < i16) {
                        byte b10 = bArr[i15];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f42675i && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f42675i = z10;
                        if (z11) {
                            uVar.F(i15 + 1);
                            this.f42675i = false;
                            uVar2.f45193a[1] = bArr[i15];
                            this.f42673g = 2;
                            this.f42672f = 1;
                            break;
                        }
                        i15++;
                    } else {
                        uVar.F(i16);
                        break;
                    }
                }
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42672f = 0;
        this.f42673g = 0;
        this.f42675i = false;
        this.f42678l = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42678l = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42671e = h10.d();
        h10.i();
        this.f42670d = sVar.f(h10.f42432c, 1);
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
