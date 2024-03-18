package f3;

import L2.I;
import N.C1025i;
import java.util.ArrayList;
import java.util.Arrays;
import p2.C5065s;
import p2.M;
import p2.O;
import p2.r;
import r9.y;
import s2.p;
import s2.t;
import s2.u;
import x8.N;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: n  reason: collision with root package name */
    public k f29581n;

    /* renamed from: o  reason: collision with root package name */
    public int f29582o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f29583p;

    /* renamed from: q  reason: collision with root package name */
    public I f29584q;

    /* renamed from: r  reason: collision with root package name */
    public C1025i f29585r;

    @Override // f3.j
    public final void a(long j6) {
        boolean z10;
        this.f29569g = j6;
        int i10 = 0;
        if (j6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29583p = z10;
        I i11 = this.f29584q;
        if (i11 != null) {
            i10 = i11.f10544e;
        }
        this.f29582o = i10;
    }

    @Override // f3.j
    public final long b(u uVar) {
        int i10;
        int i11 = 0;
        byte b10 = uVar.f45193a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f29581n;
        Gi.e.o(kVar);
        boolean z10 = kVar.f29579d[(b10 >> 1) & (255 >>> (8 - kVar.f29580e))].f6064Y;
        I i12 = kVar.f29576a;
        if (!z10) {
            i10 = i12.f10544e;
        } else {
            i10 = i12.f10545f;
        }
        if (this.f29583p) {
            i11 = (this.f29582o + i10) / 4;
        }
        long j6 = i11;
        byte[] bArr = uVar.f45193a;
        int length = bArr.length;
        int i13 = uVar.f45195c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            uVar.D(copyOf.length, copyOf);
        } else {
            uVar.E(i13);
        }
        byte[] bArr2 = uVar.f45193a;
        int i14 = uVar.f45195c;
        bArr2[i14 - 4] = (byte) (j6 & 255);
        bArr2[i14 - 3] = (byte) ((j6 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j6 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j6 >>> 24) & 255);
        this.f29583p = true;
        this.f29582o = i10;
        return j6;
    }

    @Override // f3.j
    public final boolean c(u uVar, long j6, U3.l lVar) {
        k kVar;
        I i10;
        int i11;
        int i12;
        I i13;
        long j10;
        int i14;
        int i15;
        if (this.f29581n != null) {
            ((C5065s) lVar.f17423Z).getClass();
            return false;
        }
        I i16 = this.f29584q;
        int i17 = 4;
        if (i16 == null) {
            y.h1(1, uVar, false);
            uVar.m();
            int u10 = uVar.u();
            int m10 = uVar.m();
            int i18 = uVar.i();
            if (i18 <= 0) {
                i14 = -1;
            } else {
                i14 = i18;
            }
            int i19 = uVar.i();
            if (i19 <= 0) {
                i15 = -1;
            } else {
                i15 = i19;
            }
            uVar.i();
            int u11 = uVar.u();
            uVar.u();
            this.f29584q = new I(u10, m10, i14, i15, (int) Math.pow(2.0d, u11 & 15), (int) Math.pow(2.0d, (u11 & 240) >> 4), Arrays.copyOf(uVar.f45193a, uVar.f45195c));
        } else {
            C1025i c1025i = this.f29585r;
            if (c1025i == null) {
                this.f29585r = y.V0(uVar, true, true);
            } else {
                int i20 = uVar.f45195c;
                byte[] bArr = new byte[i20];
                System.arraycopy(uVar.f45193a, 0, bArr, 0, i20);
                int i21 = 5;
                y.h1(5, uVar, false);
                int u12 = uVar.u() + 1;
                int i22 = 2;
                t tVar = new t(uVar.f45193a, 2);
                tVar.s(uVar.f45194b * 8);
                int i23 = 0;
                while (true) {
                    int i24 = 16;
                    if (i23 < u12) {
                        if (tVar.i(24) == 5653314) {
                            int i25 = tVar.i(16);
                            int i26 = tVar.i(24);
                            if (!tVar.h()) {
                                boolean h10 = tVar.h();
                                for (int i27 = 0; i27 < i26; i27++) {
                                    if (h10) {
                                        if (tVar.h()) {
                                            tVar.s(5);
                                        }
                                    } else {
                                        tVar.s(5);
                                    }
                                }
                            } else {
                                tVar.s(5);
                                for (int i28 = 0; i28 < i26; i28 += tVar.i(y.A0(i26 - i28))) {
                                }
                            }
                            int i29 = tVar.i(i17);
                            if (i29 <= 2) {
                                if (i29 != 1 && i29 != 2) {
                                    i13 = i16;
                                } else {
                                    tVar.s(32);
                                    tVar.s(32);
                                    int i30 = tVar.i(i17) + 1;
                                    tVar.s(1);
                                    if (i29 == 1) {
                                        if (i25 != 0) {
                                            i13 = i16;
                                            j10 = (long) Math.floor(Math.pow(i26, 1.0d / i25));
                                        } else {
                                            i13 = i16;
                                            j10 = 0;
                                        }
                                    } else {
                                        i13 = i16;
                                        j10 = i26 * i25;
                                    }
                                    tVar.s((int) (j10 * i30));
                                }
                                i23++;
                                i16 = i13;
                                i17 = 4;
                            } else {
                                throw O.a("lookup type greater than 2 not decodable: " + i29, null);
                            }
                        } else {
                            throw O.a("expected code book to start with [0x56, 0x43, 0x42] at " + tVar.g(), null);
                        }
                    } else {
                        I i31 = i16;
                        int i32 = 6;
                        int i33 = tVar.i(6) + 1;
                        for (int i34 = 0; i34 < i33; i34++) {
                            if (tVar.i(16) != 0) {
                                throw O.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i35 = tVar.i(6) + 1;
                        int i36 = 0;
                        while (true) {
                            int i37 = 3;
                            if (i36 < i35) {
                                int i38 = tVar.i(i24);
                                if (i38 != 0) {
                                    if (i38 == 1) {
                                        int i39 = tVar.i(i21);
                                        int[] iArr = new int[i39];
                                        int i40 = -1;
                                        for (int i41 = 0; i41 < i39; i41++) {
                                            int i42 = tVar.i(4);
                                            iArr[i41] = i42;
                                            if (i42 > i40) {
                                                i40 = i42;
                                            }
                                        }
                                        int i43 = i40 + 1;
                                        int[] iArr2 = new int[i43];
                                        int i44 = 0;
                                        while (i44 < i43) {
                                            iArr2[i44] = tVar.i(i37) + 1;
                                            int i45 = tVar.i(i22);
                                            int i46 = 8;
                                            if (i45 > 0) {
                                                tVar.s(8);
                                            }
                                            int i47 = i43;
                                            int i48 = 0;
                                            while (i48 < (1 << i45)) {
                                                tVar.s(i46);
                                                i48++;
                                                i46 = 8;
                                            }
                                            i44++;
                                            i43 = i47;
                                            i37 = 3;
                                            i22 = 2;
                                        }
                                        tVar.s(i22);
                                        int i49 = tVar.i(4);
                                        int i50 = 0;
                                        int i51 = 0;
                                        for (int i52 = 0; i52 < i39; i52++) {
                                            i50 += iArr2[iArr[i52]];
                                            while (i51 < i50) {
                                                tVar.s(i49);
                                                i51++;
                                            }
                                        }
                                    } else {
                                        throw O.a("floor type greater than 1 not decodable: " + i38, null);
                                    }
                                } else {
                                    int i53 = 8;
                                    tVar.s(8);
                                    tVar.s(16);
                                    tVar.s(16);
                                    tVar.s(6);
                                    tVar.s(8);
                                    int i54 = tVar.i(4) + 1;
                                    int i55 = 0;
                                    while (i55 < i54) {
                                        tVar.s(i53);
                                        i55++;
                                        i53 = 8;
                                    }
                                }
                                i36++;
                                i32 = 6;
                                i24 = 16;
                                i21 = 5;
                                i22 = 2;
                            } else {
                                int i56 = tVar.i(i32) + 1;
                                int i57 = 0;
                                while (i57 < i56) {
                                    if (tVar.i(16) <= 2) {
                                        tVar.s(24);
                                        tVar.s(24);
                                        tVar.s(24);
                                        int i58 = tVar.i(i32) + 1;
                                        int i59 = 8;
                                        tVar.s(8);
                                        int[] iArr3 = new int[i58];
                                        for (int i60 = 0; i60 < i58; i60++) {
                                            int i61 = tVar.i(3);
                                            if (tVar.h()) {
                                                i12 = tVar.i(5);
                                            } else {
                                                i12 = 0;
                                            }
                                            iArr3[i60] = (i12 * 8) + i61;
                                        }
                                        int i62 = 0;
                                        while (i62 < i58) {
                                            int i63 = 0;
                                            while (i63 < i59) {
                                                if ((iArr3[i62] & (1 << i63)) != 0) {
                                                    tVar.s(i59);
                                                }
                                                i63++;
                                                i59 = 8;
                                            }
                                            i62++;
                                            i59 = 8;
                                        }
                                        i57++;
                                        i32 = 6;
                                    } else {
                                        throw O.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i64 = tVar.i(i32) + 1;
                                int i65 = 0;
                                while (i65 < i64) {
                                    int i66 = tVar.i(16);
                                    if (i66 != 0) {
                                        p.c("VorbisUtil", "mapping type other than 0 not supported: " + i66);
                                        i10 = i31;
                                    } else {
                                        if (tVar.h()) {
                                            i11 = tVar.i(4) + 1;
                                        } else {
                                            i11 = 1;
                                        }
                                        boolean h11 = tVar.h();
                                        i10 = i31;
                                        int i67 = i10.f10540a;
                                        if (h11) {
                                            int i68 = tVar.i(8) + 1;
                                            for (int i69 = 0; i69 < i68; i69++) {
                                                int i70 = i67 - 1;
                                                tVar.s(y.A0(i70));
                                                tVar.s(y.A0(i70));
                                            }
                                        }
                                        if (tVar.i(2) == 0) {
                                            if (i11 > 1) {
                                                for (int i71 = 0; i71 < i67; i71++) {
                                                    tVar.s(4);
                                                }
                                            }
                                            for (int i72 = 0; i72 < i11; i72++) {
                                                tVar.s(8);
                                                tVar.s(8);
                                                tVar.s(8);
                                            }
                                        } else {
                                            throw O.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                    i65++;
                                    i31 = i10;
                                }
                                I i73 = i31;
                                int i74 = tVar.i(6);
                                int i75 = i74 + 1;
                                G6.a[] aVarArr = new G6.a[i75];
                                for (int i76 = 0; i76 < i75; i76++) {
                                    boolean h12 = tVar.h();
                                    tVar.i(16);
                                    tVar.i(16);
                                    tVar.i(8);
                                    aVarArr[i76] = new G6.a(h12);
                                }
                                if (tVar.h()) {
                                    kVar = new k(i73, c1025i, bArr, aVarArr, y.A0(i74));
                                } else {
                                    throw O.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        kVar = null;
        this.f29581n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        I i77 = kVar.f29576a;
        arrayList.add(i77.f10546g);
        arrayList.add(kVar.f29578c);
        M P02 = y.P0(N.i0((String[]) kVar.f29577b.f12352i0));
        r rVar = new r();
        rVar.f42237k = "audio/vorbis";
        rVar.f42232f = i77.f10543d;
        rVar.f42233g = i77.f10542c;
        rVar.f42250x = i77.f10540a;
        rVar.f42251y = i77.f10541b;
        rVar.f42239m = arrayList;
        rVar.f42235i = P02;
        lVar.f17423Z = new C5065s(rVar);
        return true;
    }

    @Override // f3.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f29581n = null;
            this.f29584q = null;
            this.f29585r = null;
        }
        this.f29582o = 0;
        this.f29583p = false;
    }
}
