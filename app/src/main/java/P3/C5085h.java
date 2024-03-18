package p3;

import L2.AbstractC0881b;
import java.util.Arrays;
import p2.C5065s;

/* renamed from: p3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5085h implements AbstractC5087j {

    /* renamed from: b  reason: collision with root package name */
    public final String f42504b;

    /* renamed from: c  reason: collision with root package name */
    public String f42505c;

    /* renamed from: d  reason: collision with root package name */
    public L2.G f42506d;

    /* renamed from: f  reason: collision with root package name */
    public int f42508f;

    /* renamed from: g  reason: collision with root package name */
    public int f42509g;

    /* renamed from: h  reason: collision with root package name */
    public long f42510h;

    /* renamed from: i  reason: collision with root package name */
    public C5065s f42511i;

    /* renamed from: j  reason: collision with root package name */
    public int f42512j;

    /* renamed from: a  reason: collision with root package name */
    public final s2.u f42503a = new s2.u(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    public int f42507e = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f42513k = -9223372036854775807L;

    public C5085h(String str) {
        this.f42504b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    @Override // p3.AbstractC5087j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s2.u uVar) {
        char c10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        s2.t tVar;
        int i18;
        int i19;
        int i20;
        int i21;
        Gi.e.o(this.f42506d);
        while (uVar.a() > 0) {
            int i22 = this.f42507e;
            int i23 = 2;
            int i24 = 8;
            s2.u uVar2 = this.f42503a;
            if (i22 != 0) {
                if (i22 != 1) {
                    if (i22 == 2) {
                        int min = Math.min(uVar.a(), this.f42512j - this.f42508f);
                        this.f42506d.a(min, uVar);
                        int i25 = this.f42508f + min;
                        this.f42508f = i25;
                        int i26 = this.f42512j;
                        if (i25 == i26) {
                            long j6 = this.f42513k;
                            if (j6 != -9223372036854775807L) {
                                this.f42506d.e(j6, 1, i26, 0, null);
                                this.f42513k += this.f42510h;
                            }
                            this.f42507e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    byte[] bArr = uVar2.f45193a;
                    int min2 = Math.min(uVar.a(), 18 - this.f42508f);
                    uVar.e(bArr, this.f42508f, min2);
                    int i27 = this.f42508f + min2;
                    this.f42508f = i27;
                    if (i27 == 18) {
                        byte[] bArr2 = uVar2.f45193a;
                        if (this.f42511i == null) {
                            String str = this.f42505c;
                            if (bArr2[0] == Byte.MAX_VALUE) {
                                tVar = new s2.t(bArr2, 0);
                            } else {
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                                byte b10 = copyOf[0];
                                if (b10 == -2 || b10 == -1) {
                                    for (int i28 = 0; i28 < copyOf.length - 1; i28 += 2) {
                                        byte b11 = copyOf[i28];
                                        int i29 = i28 + 1;
                                        copyOf[i28] = copyOf[i29];
                                        copyOf[i29] = b11;
                                    }
                                }
                                s2.t tVar2 = new s2.t(copyOf, 0);
                                if (copyOf[0] == 31) {
                                    s2.t tVar3 = new s2.t(copyOf, 0);
                                    while (tVar3.b() >= 16) {
                                        tVar3.s(i23);
                                        int i30 = tVar3.i(14) & 16383;
                                        int min3 = Math.min(8 - tVar2.f45188d, 14);
                                        int i31 = tVar2.f45188d;
                                        int i32 = (8 - i31) - min3;
                                        byte[] bArr3 = tVar2.f45186b;
                                        int i33 = tVar2.f45187c;
                                        byte b12 = (byte) (bArr3[i33] & ((65280 >> i31) | ((1 << i32) - 1)));
                                        bArr3[i33] = b12;
                                        int i34 = 14 - min3;
                                        bArr3[i33] = (byte) (b12 | ((i30 >>> i34) << i32));
                                        int i35 = i33 + 1;
                                        while (i34 > i24) {
                                            tVar2.f45186b[i35] = (byte) (i30 >>> (i34 - 8));
                                            i34 -= 8;
                                            i35++;
                                            i24 = 8;
                                        }
                                        byte[] bArr4 = tVar2.f45186b;
                                        byte b13 = (byte) (bArr4[i35] & ((1 << i18) - 1));
                                        bArr4[i35] = b13;
                                        bArr4[i35] = (byte) (((i30 & ((1 << i34) - 1)) << (8 - i34)) | b13);
                                        tVar2.s(14);
                                        tVar2.a();
                                        i23 = 2;
                                        i24 = 8;
                                    }
                                }
                                tVar2.n(copyOf.length, copyOf);
                                tVar = tVar2;
                            }
                            tVar.s(60);
                            int i36 = AbstractC0881b.f10559j[tVar.i(6)];
                            int i37 = AbstractC0881b.f10560k[tVar.i(4)];
                            int i38 = tVar.i(5);
                            if (i38 >= 29) {
                                i20 = -1;
                                i19 = 2;
                            } else {
                                i19 = 2;
                                i20 = (AbstractC0881b.f10561l[i38] * 1000) / 2;
                            }
                            tVar.s(10);
                            if (tVar.i(i19) > 0) {
                                i21 = 1;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i36 + i21;
                            p2.r rVar = new p2.r();
                            rVar.f42227a = str;
                            rVar.f42237k = "audio/vnd.dts";
                            rVar.f42232f = i20;
                            rVar.f42250x = i39;
                            rVar.f42251y = i37;
                            rVar.f42240n = null;
                            rVar.f42229c = this.f42504b;
                            C5065s c5065s = new C5065s(rVar);
                            this.f42511i = c5065s;
                            this.f42506d.b(c5065s);
                            c10 = 0;
                        } else {
                            c10 = 0;
                        }
                        byte b14 = bArr2[c10];
                        if (b14 != -2) {
                            if (b14 != -1) {
                                if (b14 != 31) {
                                    i15 = ((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4);
                                } else {
                                    i16 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                    i17 = (bArr2[8] & 60) >> 2;
                                }
                            } else {
                                i16 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                i17 = (bArr2[9] & 60) >> 2;
                            }
                            i10 = (i16 | i17) + 1;
                            z10 = true;
                            if (z10) {
                                i10 = (i10 * 16) / 14;
                            }
                            this.f42512j = i10;
                            if (b14 == -2) {
                                if (b14 != -1) {
                                    if (b14 != 31) {
                                        i13 = (bArr2[4] & 1) << 6;
                                        i14 = bArr2[5] & 252;
                                        i12 = 2;
                                    } else {
                                        i12 = 2;
                                        i13 = (7 & bArr2[5]) << 4;
                                        i14 = bArr2[6] & 60;
                                    }
                                } else {
                                    i11 = ((bArr2[7] & 60) >> 2) | ((bArr2[4] & 7) << 4);
                                    this.f42510h = (int) ((((i11 + 1) * 32) * 1000000) / this.f42511i.f42298E0);
                                    uVar2.F(0);
                                    this.f42506d.a(18, uVar2);
                                    this.f42507e = 2;
                                }
                            } else {
                                i12 = 2;
                                i13 = (bArr2[5] & 1) << 6;
                                i14 = bArr2[4] & 252;
                            }
                            i11 = (i14 >> i12) | i13;
                            this.f42510h = (int) ((((i11 + 1) * 32) * 1000000) / this.f42511i.f42298E0);
                            uVar2.F(0);
                            this.f42506d.a(18, uVar2);
                            this.f42507e = 2;
                        } else {
                            i15 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4);
                        }
                        i10 = i15 + 1;
                        z10 = false;
                        if (z10) {
                        }
                        this.f42512j = i10;
                        if (b14 == -2) {
                        }
                        i11 = (i14 >> i12) | i13;
                        this.f42510h = (int) ((((i11 + 1) * 32) * 1000000) / this.f42511i.f42298E0);
                        uVar2.F(0);
                        this.f42506d.a(18, uVar2);
                        this.f42507e = 2;
                    }
                }
            } else {
                while (uVar.a() > 0) {
                    int i40 = this.f42509g << 8;
                    this.f42509g = i40;
                    int u10 = i40 | uVar.u();
                    this.f42509g = u10;
                    if (u10 == 2147385345 || u10 == -25230976 || u10 == 536864768 || u10 == -14745368) {
                        byte[] bArr5 = uVar2.f45193a;
                        bArr5[0] = (byte) ((u10 >> 24) & 255);
                        bArr5[1] = (byte) ((u10 >> 16) & 255);
                        bArr5[2] = (byte) ((u10 >> 8) & 255);
                        bArr5[3] = (byte) (u10 & 255);
                        this.f42508f = 4;
                        this.f42509g = 0;
                        this.f42507e = 1;
                        break;
                    }
                    while (uVar.a() > 0) {
                    }
                }
            }
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        this.f42507e = 0;
        this.f42508f = 0;
        this.f42509g = 0;
        this.f42513k = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        if (j6 != -9223372036854775807L) {
            this.f42513k = j6;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        h10.c();
        this.f42505c = h10.d();
        h10.i();
        this.f42506d = sVar.f(h10.f42432c, 1);
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
    }
}
