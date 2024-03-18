package p3;

import L2.AbstractC0881b;
import L2.C0880a;
import java.util.Arrays;
import java.util.Collections;
import p2.C5065s;
import s2.AbstractC5530A;

/* renamed from: p3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5083f implements AbstractC5087j {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f42479v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42480a;

    /* renamed from: d  reason: collision with root package name */
    public final String f42483d;

    /* renamed from: e  reason: collision with root package name */
    public String f42484e;

    /* renamed from: f  reason: collision with root package name */
    public L2.G f42485f;

    /* renamed from: g  reason: collision with root package name */
    public L2.G f42486g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42490k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42491l;

    /* renamed from: o  reason: collision with root package name */
    public int f42494o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f42495p;

    /* renamed from: r  reason: collision with root package name */
    public int f42497r;

    /* renamed from: t  reason: collision with root package name */
    public L2.G f42499t;

    /* renamed from: u  reason: collision with root package name */
    public long f42500u;

    /* renamed from: b  reason: collision with root package name */
    public final s2.t f42481b = new s2.t(new byte[7], 0);

    /* renamed from: c  reason: collision with root package name */
    public final s2.u f42482c = new s2.u(Arrays.copyOf(f42479v, 10));

    /* renamed from: h  reason: collision with root package name */
    public int f42487h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f42488i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f42489j = 256;

    /* renamed from: m  reason: collision with root package name */
    public int f42492m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f42493n = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f42496q = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f42498s = -9223372036854775807L;

    public C5083f(String str, boolean z10) {
        this.f42480a = z10;
        this.f42483d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f5  */
    /* JADX WARN: Type inference failed for: r13v0, types: [s2.t] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        byte b10;
        byte[] bArr;
        int i13;
        ?? r82;
        char c10;
        char c11;
        int i14;
        boolean z11;
        int i15;
        ?? r22 = 0;
        int i16 = 7;
        int i17 = 2;
        this.f42485f.getClass();
        int i18 = AbstractC5530A.f45131a;
        while (uVar.a() > 0) {
            int i19 = this.f42487h;
            int i20 = 4;
            s2.u uVar2 = this.f42482c;
            ?? r13 = this.f42481b;
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 != i17) {
                        if (i19 != 3) {
                            if (i19 == 4) {
                                int min = Math.min(uVar.a(), this.f42497r - this.f42488i);
                                this.f42499t.a(min, uVar);
                                int i21 = this.f42488i + min;
                                this.f42488i = i21;
                                int i22 = this.f42497r;
                                if (i21 == i22) {
                                    long j6 = this.f42498s;
                                    if (j6 != -9223372036854775807L) {
                                        this.f42499t.e(j6, 1, i22, 0, null);
                                        this.f42498s += this.f42500u;
                                    }
                                    int i23 = r22 == true ? 1 : 0;
                                    int i24 = r22 == true ? 1 : 0;
                                    int i25 = r22 == true ? 1 : 0;
                                    int i26 = r22 == true ? 1 : 0;
                                    this.f42487h = i23;
                                    this.f42488i = r22;
                                    this.f42489j = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f42490k) {
                                i10 = i16;
                            } else {
                                i10 = 5;
                            }
                            byte[] bArr2 = r13.f45186b;
                            int min2 = Math.min(uVar.a(), i10 - this.f42488i);
                            uVar.e(bArr2, this.f42488i, min2);
                            int i27 = this.f42488i + min2;
                            this.f42488i = i27;
                            if (i27 == i10) {
                                r13.p(r22);
                                if (!this.f42495p) {
                                    int i28 = r13.i(i17) + 1;
                                    if (i28 != i17) {
                                        s2.p.g("AdtsReader", "Detected audio object type: " + i28 + ", but assuming AAC LC.");
                                        i28 = i17;
                                    }
                                    r13.s(5);
                                    int i29 = r13.i(3);
                                    int i30 = this.f42493n;
                                    byte[] bArr3 = new byte[i17];
                                    char c12 = r22 == true ? 1 : 0;
                                    char c13 = r22 == true ? 1 : 0;
                                    char c14 = r22 == true ? 1 : 0;
                                    char c15 = r22 == true ? 1 : 0;
                                    char c16 = r22 == true ? 1 : 0;
                                    bArr3[c12] = (byte) (((i28 << 3) & 248) | ((i30 >> 1) & i16));
                                    bArr3[1] = (byte) (((i29 << 3) & 120) | ((i30 << i16) & 128));
                                    C0880a f6 = AbstractC0881b.f(new s2.t(bArr3, (int) r22), r22);
                                    p2.r rVar = new p2.r();
                                    rVar.f42227a = this.f42484e;
                                    rVar.f42237k = "audio/mp4a-latm";
                                    rVar.f42234h = f6.f10549c;
                                    rVar.f42250x = f6.f10548b;
                                    rVar.f42251y = f6.f10547a;
                                    rVar.f42239m = Collections.singletonList(bArr3);
                                    rVar.f42229c = this.f42483d;
                                    C5065s c5065s = new C5065s(rVar);
                                    this.f42496q = 1024000000 / c5065s.f42298E0;
                                    this.f42485f.b(c5065s);
                                    this.f42495p = true;
                                } else {
                                    r13.s(10);
                                }
                                r13.s(4);
                                int i31 = r13.i(13);
                                int i32 = i31 - 7;
                                if (this.f42490k) {
                                    i32 = i31 - 9;
                                }
                                L2.G g10 = this.f42485f;
                                long j10 = this.f42496q;
                                this.f42487h = 4;
                                this.f42488i = r22;
                                this.f42499t = g10;
                                this.f42500u = j10;
                                this.f42497r = i32;
                            }
                        }
                    } else {
                        byte[] bArr4 = uVar2.f45193a;
                        int min3 = Math.min(uVar.a(), 10 - this.f42488i);
                        uVar.e(bArr4, this.f42488i, min3);
                        int i33 = this.f42488i + min3;
                        this.f42488i = i33;
                        if (i33 == 10) {
                            this.f42486g.a(10, uVar2);
                            uVar2.F(6);
                            L2.G g11 = this.f42486g;
                            this.f42487h = 4;
                            this.f42488i = 10;
                            this.f42499t = g11;
                            this.f42500u = 0L;
                            this.f42497r = uVar2.t() + 10;
                        }
                    }
                } else if (uVar.a() != 0) {
                    r13.f45186b[r22] = uVar.f45193a[uVar.f45194b];
                    r13.p(i17);
                    int i34 = r13.i(4);
                    int i35 = this.f42493n;
                    if (i35 != -1 && i34 != i35) {
                        this.f42491l = r22;
                        this.f42487h = r22;
                        this.f42488i = r22;
                        this.f42489j = 256;
                    } else {
                        if (!this.f42491l) {
                            this.f42491l = true;
                            this.f42492m = this.f42494o;
                            this.f42493n = i34;
                        }
                        this.f42487h = 3;
                        this.f42488i = r22;
                    }
                }
            } else {
                byte[] bArr5 = uVar.f45193a;
                int i36 = uVar.f45194b;
                int i37 = uVar.f45195c;
                int i38 = r22;
                while (true) {
                    if (i36 < i37) {
                        i12 = i36 + 1;
                        b10 = bArr5[i36];
                        int i39 = b10 & 255;
                        if (this.f42489j == 512 && ((65280 | (((byte) i39) & 255)) & 65526) == 65520) {
                            if (this.f42491l) {
                                break;
                            }
                            int i40 = i36 - 1;
                            uVar.F(i36);
                            byte[] bArr6 = r13.f45186b;
                            if (uVar.a() >= 1) {
                                uVar.e(bArr6, i38 == 1 ? 1 : 0, 1);
                                r13.p(i20);
                                int i41 = r13.i(1);
                                int i42 = this.f42492m;
                                if (i42 != -1 && i41 != i42) {
                                    bArr = bArr5;
                                } else {
                                    if (this.f42493n != -1) {
                                        byte[] bArr7 = r13.f45186b;
                                        if (uVar.a() < 1) {
                                            break;
                                        }
                                        uVar.e(bArr7, i38, 1);
                                        r13.p(i17);
                                        i15 = 4;
                                        if (r13.i(4) == this.f42493n) {
                                            uVar.F(i12);
                                        }
                                    } else {
                                        i15 = 4;
                                    }
                                    byte[] bArr8 = r13.f45186b;
                                    if (uVar.a() >= i15) {
                                        uVar.e(bArr8, i38, i15);
                                        r13.p(14);
                                        int i43 = r13.i(13);
                                        if (i43 >= 7) {
                                            byte[] bArr9 = uVar.f45193a;
                                            int i44 = uVar.f45195c;
                                            int i45 = i40 + i43;
                                            if (i45 < i44) {
                                                byte b11 = bArr9[i45];
                                                bArr = bArr5;
                                                if (b11 == -1) {
                                                    int i46 = i45 + 1;
                                                    if (i46 != i44) {
                                                        byte b12 = bArr9[i46];
                                                        if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i41) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i47 = i45 + 1;
                                                    if (i47 != i44) {
                                                        if (bArr9[i47] == 68) {
                                                            int i48 = i45 + 2;
                                                            if (i48 != i44) {
                                                                if (bArr9[i48] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                int i49 = this.f42489j;
                                i13 = i49 | i39;
                                if (i13 == 329) {
                                    if (i13 != 511) {
                                        if (i13 != 836) {
                                            if (i13 != 1075) {
                                                c11 = '\u0100';
                                                if (i49 != 256) {
                                                    this.f42489j = 256;
                                                    i14 = 2;
                                                    c10 = 3;
                                                    r82 = false;
                                                    bArr5 = bArr;
                                                    i20 = 4;
                                                    i17 = i14;
                                                    i38 = r82;
                                                } else {
                                                    i14 = 2;
                                                    c10 = 3;
                                                    r82 = false;
                                                }
                                            } else {
                                                i11 = 2;
                                                this.f42487h = 2;
                                                this.f42488i = 3;
                                                z10 = false;
                                                this.f42497r = 0;
                                                uVar2.F(0);
                                                uVar.F(i12);
                                                break;
                                            }
                                        } else {
                                            i14 = 2;
                                            c11 = '\u0100';
                                            c10 = 3;
                                            r82 = false;
                                            this.f42489j = 1024;
                                        }
                                    } else {
                                        i14 = 2;
                                        c11 = '\u0100';
                                        c10 = 3;
                                        r82 = false;
                                        this.f42489j = 512;
                                    }
                                } else {
                                    i14 = 2;
                                    c11 = '\u0100';
                                    c10 = 3;
                                    r82 = false;
                                    this.f42489j = 768;
                                }
                                i36 = i12;
                                bArr5 = bArr;
                                i20 = 4;
                                i17 = i14;
                                i38 = r82;
                            }
                        }
                        bArr = bArr5;
                        int i492 = this.f42489j;
                        i13 = i492 | i39;
                        if (i13 == 329) {
                        }
                        i36 = i12;
                        bArr5 = bArr;
                        i20 = 4;
                        i17 = i14;
                        i38 = r82;
                    } else {
                        boolean z12 = i38 == 1 ? 1 : 0;
                        boolean z13 = i38 == 1 ? 1 : 0;
                        boolean z14 = i38 == 1 ? 1 : 0;
                        boolean z15 = i38 == 1 ? 1 : 0;
                        z10 = z12;
                        i11 = i17;
                        uVar.F(i36);
                        break;
                    }
                }
                this.f42494o = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f42490k = z11;
                if (!this.f42491l) {
                    this.f42487h = 1;
                    this.f42488i = 0;
                } else {
                    this.f42487h = 3;
                    this.f42488i = 0;
                }
                uVar.F(i12);
                i11 = 2;
                z10 = false;
                i17 = i11;
                r22 = z10;
                i16 = 7;
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42498s = -9223372036854775807L;
        this.f42491l = false;
        this.f42487h = 0;
        this.f42488i = 0;
        this.f42489j = 256;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42498s = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42484e = h10.d();
        h10.i();
        L2.G f6 = sVar.f(h10.f42432c, 1);
        this.f42485f = f6;
        this.f42499t = f6;
        if (this.f42480a) {
            h10.c();
            h10.i();
            L2.G f10 = sVar.f(h10.f42432c, 5);
            this.f42486g = f10;
            p2.r rVar = new p2.r();
            rVar.f42227a = h10.d();
            rVar.f42237k = "application/id3";
            f10.b(new C5065s(rVar));
            return;
        }
        this.f42486g = new L2.p();
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
