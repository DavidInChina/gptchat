package p3;

import java.util.Arrays;
import java.util.Collections;
import p2.C5065s;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class o implements AbstractC5087j {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f42557l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final J f42558a;

    /* renamed from: d  reason: collision with root package name */
    public final m f42561d;

    /* renamed from: f  reason: collision with root package name */
    public n f42563f;

    /* renamed from: g  reason: collision with root package name */
    public long f42564g;

    /* renamed from: h  reason: collision with root package name */
    public String f42565h;

    /* renamed from: i  reason: collision with root package name */
    public L2.G f42566i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42567j;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f42560c = new boolean[4];

    /* renamed from: k  reason: collision with root package name */
    public long f42568k = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public final w f42562e = new w(178);

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42559b = new s2.u();

    /* JADX WARN: Type inference failed for: r3v3, types: [p3.m, java.lang.Object] */
    public o(J j6) {
        this.f42558a = j6;
        ?? obj = new Object();
        obj.f42548e = new byte[128];
        this.f42561d = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        float f6;
        s2.u uVar2 = uVar;
        Gi.e.o(this.f42563f);
        Gi.e.o(this.f42566i);
        int i14 = uVar2.f45194b;
        int i15 = uVar2.f45195c;
        byte[] bArr = uVar2.f45193a;
        this.f42564g += uVar.a();
        this.f42566i.a(uVar.a(), uVar2);
        while (true) {
            int b10 = t2.g.b(bArr, i14, i15, this.f42560c);
            m mVar = this.f42561d;
            w wVar = this.f42562e;
            if (b10 == i15) {
                if (!this.f42567j) {
                    mVar.a(bArr, i14, i15);
                }
                this.f42563f.a(bArr, i14, i15);
                if (wVar != null) {
                    wVar.a(bArr, i14, i15);
                    return;
                }
                return;
            }
            int i16 = b10 + 3;
            byte b11 = uVar2.f45193a[i16];
            int i17 = b11 & 255;
            int i18 = b10 - i14;
            if (!this.f42567j) {
                if (i18 > 0) {
                    mVar.a(bArr, i14, b10);
                }
                if (i18 < 0) {
                    i13 = -i18;
                } else {
                    i13 = 0;
                }
                int i19 = mVar.f42545b;
                if (i19 != 0) {
                    i11 = i16;
                    if (i19 != 1) {
                        if (i19 != 2) {
                            i10 = i15;
                            if (i19 != 3) {
                                if (i19 == 4) {
                                    if (i17 == 179 || i17 == 181) {
                                        mVar.f42546c -= i13;
                                        mVar.f42544a = false;
                                        L2.G g10 = this.f42566i;
                                        int i20 = mVar.f42547d;
                                        String str = this.f42565h;
                                        str.getClass();
                                        byte[] copyOf = Arrays.copyOf(mVar.f42548e, mVar.f42546c);
                                        s2.t tVar = new s2.t(copyOf, 0);
                                        tVar.t(i20);
                                        tVar.t(4);
                                        tVar.r();
                                        tVar.s(8);
                                        if (tVar.h()) {
                                            tVar.s(4);
                                            tVar.s(3);
                                        }
                                        int i21 = tVar.i(4);
                                        if (i21 == 15) {
                                            int i22 = tVar.i(8);
                                            int i23 = tVar.i(8);
                                            if (i23 == 0) {
                                                s2.p.g("H263Reader", "Invalid aspect ratio");
                                                f6 = 1.0f;
                                                if (tVar.h()) {
                                                    tVar.s(2);
                                                    tVar.s(1);
                                                    if (tVar.h()) {
                                                        tVar.s(15);
                                                        tVar.r();
                                                        tVar.s(15);
                                                        tVar.r();
                                                        tVar.s(15);
                                                        tVar.r();
                                                        tVar.s(3);
                                                        tVar.s(11);
                                                        tVar.r();
                                                        tVar.s(15);
                                                        tVar.r();
                                                    }
                                                }
                                                if (tVar.i(2) != 0) {
                                                    s2.p.g("H263Reader", "Unhandled video object layer shape");
                                                }
                                                tVar.r();
                                                int i24 = tVar.i(16);
                                                tVar.r();
                                                if (tVar.h()) {
                                                    if (i24 == 0) {
                                                        s2.p.g("H263Reader", "Invalid vop_increment_time_resolution");
                                                    } else {
                                                        int i25 = 0;
                                                        for (int i26 = i24 - 1; i26 > 0; i26 >>= 1) {
                                                            i25++;
                                                        }
                                                        tVar.s(i25);
                                                    }
                                                }
                                                tVar.r();
                                                int i27 = tVar.i(13);
                                                tVar.r();
                                                int i28 = tVar.i(13);
                                                tVar.r();
                                                tVar.r();
                                                p2.r rVar = new p2.r();
                                                rVar.f42227a = str;
                                                rVar.f42237k = "video/mp4v-es";
                                                rVar.f42242p = i27;
                                                rVar.f42243q = i28;
                                                rVar.f42246t = f6;
                                                rVar.f42239m = Collections.singletonList(copyOf);
                                                g10.b(new C5065s(rVar));
                                                this.f42567j = true;
                                            } else {
                                                f6 = i22 / i23;
                                                if (tVar.h()) {
                                                }
                                                if (tVar.i(2) != 0) {
                                                }
                                                tVar.r();
                                                int i242 = tVar.i(16);
                                                tVar.r();
                                                if (tVar.h()) {
                                                }
                                                tVar.r();
                                                int i272 = tVar.i(13);
                                                tVar.r();
                                                int i282 = tVar.i(13);
                                                tVar.r();
                                                tVar.r();
                                                p2.r rVar2 = new p2.r();
                                                rVar2.f42227a = str;
                                                rVar2.f42237k = "video/mp4v-es";
                                                rVar2.f42242p = i272;
                                                rVar2.f42243q = i282;
                                                rVar2.f42246t = f6;
                                                rVar2.f42239m = Collections.singletonList(copyOf);
                                                g10.b(new C5065s(rVar2));
                                                this.f42567j = true;
                                            }
                                        } else if (i21 < 7) {
                                            f6 = f42557l[i21];
                                            if (tVar.h()) {
                                            }
                                            if (tVar.i(2) != 0) {
                                            }
                                            tVar.r();
                                            int i2422 = tVar.i(16);
                                            tVar.r();
                                            if (tVar.h()) {
                                            }
                                            tVar.r();
                                            int i2722 = tVar.i(13);
                                            tVar.r();
                                            int i2822 = tVar.i(13);
                                            tVar.r();
                                            tVar.r();
                                            p2.r rVar22 = new p2.r();
                                            rVar22.f42227a = str;
                                            rVar22.f42237k = "video/mp4v-es";
                                            rVar22.f42242p = i2722;
                                            rVar22.f42243q = i2822;
                                            rVar22.f42246t = f6;
                                            rVar22.f42239m = Collections.singletonList(copyOf);
                                            g10.b(new C5065s(rVar22));
                                            this.f42567j = true;
                                        } else {
                                            s2.p.g("H263Reader", "Invalid aspect ratio");
                                            f6 = 1.0f;
                                            if (tVar.h()) {
                                            }
                                            if (tVar.i(2) != 0) {
                                            }
                                            tVar.r();
                                            int i24222 = tVar.i(16);
                                            tVar.r();
                                            if (tVar.h()) {
                                            }
                                            tVar.r();
                                            int i27222 = tVar.i(13);
                                            tVar.r();
                                            int i28222 = tVar.i(13);
                                            tVar.r();
                                            tVar.r();
                                            p2.r rVar222 = new p2.r();
                                            rVar222.f42227a = str;
                                            rVar222.f42237k = "video/mp4v-es";
                                            rVar222.f42242p = i27222;
                                            rVar222.f42243q = i28222;
                                            rVar222.f42246t = f6;
                                            rVar222.f42239m = Collections.singletonList(copyOf);
                                            g10.b(new C5065s(rVar222));
                                            this.f42567j = true;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if ((b11 & 240) != 32) {
                                s2.p.g("H263Reader", "Unexpected start code value");
                                mVar.f42544a = false;
                                mVar.f42546c = 0;
                                mVar.f42545b = 0;
                            } else {
                                mVar.f42547d = mVar.f42546c;
                                mVar.f42545b = 4;
                            }
                        } else {
                            i10 = i15;
                            if (i17 > 31) {
                                s2.p.g("H263Reader", "Unexpected start code value");
                                mVar.f42544a = false;
                                mVar.f42546c = 0;
                                mVar.f42545b = 0;
                            } else {
                                mVar.f42545b = 3;
                            }
                        }
                    } else {
                        i10 = i15;
                        if (i17 != 181) {
                            s2.p.g("H263Reader", "Unexpected start code value");
                            mVar.f42544a = false;
                            mVar.f42546c = 0;
                            mVar.f42545b = 0;
                        } else {
                            mVar.f42545b = 2;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    if (i17 == 176) {
                        mVar.f42545b = 1;
                        mVar.f42544a = true;
                    }
                }
                mVar.a(m.f42543f, 0, 3);
            } else {
                i10 = i15;
                i11 = i16;
            }
            this.f42563f.a(bArr, i14, b10);
            if (wVar != null) {
                if (i18 > 0) {
                    wVar.a(bArr, i14, b10);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (wVar.e(i12)) {
                    int e10 = t2.g.e(wVar.f42681c, (byte[]) wVar.f42684f);
                    int i29 = AbstractC5530A.f45131a;
                    s2.u uVar3 = this.f42559b;
                    uVar3.D(e10, (byte[]) wVar.f42684f);
                    this.f42558a.a(this.f42568k, uVar3);
                }
                if (i17 == 178) {
                    uVar2 = uVar;
                    z10 = true;
                    if (uVar2.f45193a[b10 + 2] == 1) {
                        wVar.g(i17);
                    }
                    int i30 = i10 - b10;
                    this.f42563f.b(i30, this.f42564g - i30, this.f42567j);
                    n nVar = this.f42563f;
                    long j6 = this.f42568k;
                    nVar.f42553e = i17;
                    nVar.f42552d = false;
                    if (i17 == 182 && i17 != 179) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    nVar.f42550b = z11;
                    if (i17 != 182) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                    nVar.f42551c = z12;
                    nVar.f42554f = 0;
                    nVar.f42556h = j6;
                    i14 = i11;
                    i15 = i10;
                }
            }
            uVar2 = uVar;
            z10 = true;
            int i302 = i10 - b10;
            this.f42563f.b(i302, this.f42564g - i302, this.f42567j);
            n nVar2 = this.f42563f;
            long j62 = this.f42568k;
            nVar2.f42553e = i17;
            nVar2.f42552d = false;
            if (i17 == 182) {
            }
            z11 = z10;
            nVar2.f42550b = z11;
            if (i17 != 182) {
            }
            nVar2.f42551c = z12;
            nVar2.f42554f = 0;
            nVar2.f42556h = j62;
            i14 = i11;
            i15 = i10;
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        t2.g.a(this.f42560c);
        m mVar = this.f42561d;
        mVar.f42544a = false;
        mVar.f42546c = 0;
        mVar.f42545b = 0;
        n nVar = this.f42563f;
        if (nVar != null) {
            nVar.f42550b = false;
            nVar.f42551c = false;
            nVar.f42552d = false;
            nVar.f42553e = -1;
        }
        w wVar = this.f42562e;
        if (wVar != null) {
            wVar.f();
        }
        this.f42564g = 0L;
        this.f42568k = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
        Gi.e.o(this.f42563f);
        if (z10) {
            this.f42563f.b(0, this.f42564g, this.f42567j);
            n nVar = this.f42563f;
            nVar.f42550b = false;
            nVar.f42551c = false;
            nVar.f42552d = false;
            nVar.f42553e = -1;
        }
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42568k = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42565h = h10.d();
        h10.i();
        L2.G f6 = sVar.f(h10.f42432c, 2);
        this.f42566i = f6;
        this.f42563f = new n(f6);
        J j6 = this.f42558a;
        if (j6 != null) {
            j6.b(sVar, h10);
        }
    }
}
