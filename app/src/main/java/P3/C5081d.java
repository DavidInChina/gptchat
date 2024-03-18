package p3;

import L2.AbstractC0881b;
import k3.C4156a;
import p2.C5065s;

/* renamed from: p3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5081d implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final s2.t f42455a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42456b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42457c;

    /* renamed from: d  reason: collision with root package name */
    public String f42458d;

    /* renamed from: e  reason: collision with root package name */
    public L2.G f42459e;

    /* renamed from: i  reason: collision with root package name */
    public long f42463i;

    /* renamed from: j  reason: collision with root package name */
    public C5065s f42464j;

    /* renamed from: k  reason: collision with root package name */
    public int f42465k;

    /* renamed from: f  reason: collision with root package name */
    public int f42460f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f42461g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42462h = false;

    /* renamed from: l  reason: collision with root package name */
    public long f42466l = -9223372036854775807L;

    public C5081d(String str) {
        s2.t tVar = new s2.t(new byte[16], 0);
        this.f42455a = tVar;
        this.f42456b = new s2.u(tVar.f45186b);
        this.f42457c = str;
    }

    @Override // p3.AbstractC5087j
    public final void b(s2.u uVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Gi.e.o(this.f42459e);
        while (uVar.a() > 0) {
            int i10 = this.f42460f;
            s2.u uVar2 = this.f42456b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(uVar.a(), this.f42465k - this.f42461g);
                        this.f42459e.a(min, uVar);
                        int i11 = this.f42461g + min;
                        this.f42461g = i11;
                        int i12 = this.f42465k;
                        if (i11 == i12) {
                            long j6 = this.f42466l;
                            if (j6 != -9223372036854775807L) {
                                this.f42459e.e(j6, 1, i12, 0, null);
                                this.f42466l += this.f42463i;
                            }
                            this.f42460f = 0;
                        }
                    }
                } else {
                    byte[] bArr = uVar2.f45193a;
                    int min2 = Math.min(uVar.a(), 16 - this.f42461g);
                    uVar.e(bArr, this.f42461g, min2);
                    int i13 = this.f42461g + min2;
                    this.f42461g = i13;
                    if (i13 == 16) {
                        s2.t tVar = this.f42455a;
                        tVar.p(0);
                        C4156a e10 = AbstractC0881b.e(tVar);
                        C5065s c5065s = this.f42464j;
                        if (c5065s == null || e10.f36963c != c5065s.f42297D0 || e10.f36962b != c5065s.f42298E0 || !"audio/ac4".equals(c5065s.f42319q0)) {
                            p2.r rVar = new p2.r();
                            rVar.f42227a = this.f42458d;
                            rVar.f42237k = "audio/ac4";
                            rVar.f42250x = e10.f36963c;
                            rVar.f42251y = e10.f36962b;
                            rVar.f42229c = this.f42457c;
                            C5065s c5065s2 = new C5065s(rVar);
                            this.f42464j = c5065s2;
                            this.f42459e.b(c5065s2);
                        }
                        this.f42465k = e10.f36964d;
                        this.f42463i = (e10.f36965e * 1000000) / this.f42464j.f42298E0;
                        uVar2.F(0);
                        this.f42459e.a(16, uVar2);
                        this.f42460f = 2;
                    }
                }
            } else {
                while (uVar.a() > 0) {
                    if (!this.f42462h) {
                        if (uVar.u() == 172) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f42462h = z10;
                    } else {
                        int u10 = uVar.u();
                        if (u10 == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f42462h = z11;
                        int i14 = 65;
                        if (u10 == 64 || u10 == 65) {
                            if (u10 == 65) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            this.f42460f = 1;
                            byte[] bArr2 = uVar2.f45193a;
                            bArr2[0] = -84;
                            if (!z12) {
                                i14 = 64;
                            }
                            bArr2[1] = (byte) i14;
                            this.f42461g = 2;
                        }
                    }
                }
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42460f = 0;
        this.f42461g = 0;
        this.f42462h = false;
        this.f42466l = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42466l = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42458d = h10.d();
        h10.i();
        this.f42459e = sVar.f(h10.f42432c, 1);
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
