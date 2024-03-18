package h3;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g3.AbstractC3168k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.p;
import s2.u;

/* renamed from: h3.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3314c extends AbstractC3320i {

    /* renamed from: h  reason: collision with root package name */
    public final int f31797h;

    /* renamed from: i  reason: collision with root package name */
    public final int f31798i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31799j;

    /* renamed from: n  reason: collision with root package name */
    public List f31803n;

    /* renamed from: o  reason: collision with root package name */
    public List f31804o;

    /* renamed from: p  reason: collision with root package name */
    public int f31805p;

    /* renamed from: q  reason: collision with root package name */
    public int f31806q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f31807r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f31808s;

    /* renamed from: t  reason: collision with root package name */
    public byte f31809t;

    /* renamed from: u  reason: collision with root package name */
    public byte f31810u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f31812w;

    /* renamed from: x  reason: collision with root package name */
    public long f31813x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f31794y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f31795z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f31788A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f31789B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f31790C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f31791D = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, RCHTTPStatusCodes.SUCCESS, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f31792E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F  reason: collision with root package name */
    public static final boolean[] f31793F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    public final u f31796g = new u();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f31801l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public C3313b f31802m = new C3313b(0, 4);

    /* renamed from: v  reason: collision with root package name */
    public int f31811v = 0;

    /* renamed from: k  reason: collision with root package name */
    public final long f31800k = 16000000;

    public C3314c(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f31797h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        p.g("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f31799j = 0;
                        this.f31798i = 0;
                    } else {
                        this.f31799j = 1;
                        this.f31798i = 1;
                    }
                } else {
                    this.f31799j = 0;
                    this.f31798i = 1;
                }
            } else {
                this.f31799j = 1;
                this.f31798i = 0;
            }
        } else {
            this.f31799j = 0;
            this.f31798i = 0;
        }
        k(0);
        j();
        this.f31812w = true;
        this.f31813x = -9223372036854775807L;
    }

    @Override // h3.AbstractC3320i
    public final C4.c e() {
        List list = this.f31803n;
        this.f31804o = list;
        list.getClass();
        return new C4.c(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x007e A[SYNTHETIC] */
    @Override // h3.AbstractC3320i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(C3318g c3318g) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        ByteBuffer byteBuffer = c3318g.f48641j0;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        u uVar = this.f31796g;
        uVar.D(limit, array);
        boolean z14 = false;
        while (true) {
            int a5 = uVar.a();
            int i13 = this.f31797h;
            if (a5 >= i13) {
                if (i13 == 2) {
                    i10 = -4;
                } else {
                    i10 = uVar.u();
                }
                int u10 = uVar.u();
                int u11 = uVar.u();
                if ((i10 & 2) == 0 && (i10 & 1) == this.f31798i) {
                    byte b10 = (byte) (u10 & 127);
                    byte b11 = (byte) (u11 & 127);
                    if (b10 != 0 || b11 != 0) {
                        boolean z15 = this.f31807r;
                        if ((i10 & 4) == 4) {
                            boolean[] zArr = f31793F;
                            if (zArr[u10] && zArr[u11]) {
                                z10 = true;
                                this.f31807r = z10;
                                if (!z10 && (b10 & 240) == 16) {
                                    if (this.f31808s && this.f31809t == b10 && this.f31810u == b11) {
                                        this.f31808s = false;
                                    } else {
                                        this.f31808s = true;
                                        this.f31809t = b10;
                                        this.f31810u = b11;
                                    }
                                } else {
                                    this.f31808s = false;
                                }
                                if (z10) {
                                    if (z15) {
                                        j();
                                        z14 = true;
                                    }
                                } else {
                                    if (1 <= b10 && b10 <= 15) {
                                        this.f31812w = false;
                                    } else if ((b10 & 246) == 20) {
                                        if (b11 != 32 && b11 != 47) {
                                            switch (b11) {
                                                default:
                                                    switch (b11) {
                                                        case 42:
                                                        case 43:
                                                            this.f31812w = false;
                                                            break;
                                                    }
                                                case 37:
                                                case 38:
                                                case 39:
                                                    this.f31812w = true;
                                                    break;
                                            }
                                        }
                                        this.f31812w = true;
                                    }
                                    if (this.f31812w) {
                                        int i14 = b10 & 224;
                                        if (i14 == 0) {
                                            this.f31811v = (b10 >> 3) & 1;
                                        }
                                        if (this.f31811v == this.f31799j) {
                                            if (i14 == 0) {
                                                int i15 = b10 & 247;
                                                if (i15 == 17 && (b11 & 240) == 48) {
                                                    this.f31802m.a((char) f31790C[b11 & 15]);
                                                } else {
                                                    int i16 = b10 & 246;
                                                    if (i16 == 18 && (b11 & 224) == 32) {
                                                        this.f31802m.b();
                                                        C3313b c3313b = this.f31802m;
                                                        if ((b10 & 1) == 0) {
                                                            i12 = f31791D[b11 & 31];
                                                        } else {
                                                            i12 = f31792E[b11 & 31];
                                                        }
                                                        c3313b.a((char) i12);
                                                    } else if (i15 == 17 && (b11 & 240) == 32) {
                                                        this.f31802m.a(' ');
                                                        if ((b11 & 1) == 1) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        C3313b c3313b2 = this.f31802m;
                                                        c3313b2.f31780a.add(new C3312a((b11 >> 1) & 7, c3313b2.f31782c.length(), z13));
                                                    } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                        int i17 = f31794y[b10 & 7];
                                                        if ((b11 & 32) != 0) {
                                                            i17++;
                                                        }
                                                        C3313b c3313b3 = this.f31802m;
                                                        if (i17 != c3313b3.f31783d) {
                                                            if (this.f31805p != 1 && !c3313b3.e()) {
                                                                C3313b c3313b4 = new C3313b(this.f31805p, this.f31806q);
                                                                this.f31802m = c3313b4;
                                                                this.f31801l.add(c3313b4);
                                                            }
                                                            this.f31802m.f31783d = i17;
                                                        }
                                                        if ((b11 & 16) == 16) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if ((b11 & 1) == 1) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        int i18 = (b11 >> 1) & 7;
                                                        C3313b c3313b5 = this.f31802m;
                                                        if (z11) {
                                                            i11 = 8;
                                                        } else {
                                                            i11 = i18;
                                                        }
                                                        c3313b5.f31780a.add(new C3312a(i11, c3313b5.f31782c.length(), z12));
                                                        if (z11) {
                                                            this.f31802m.f31784e = f31795z[i18];
                                                        }
                                                    } else if (i15 == 23 && b11 >= 33 && b11 <= 35) {
                                                        this.f31802m.f31785f = b11 - 32;
                                                    } else if (i16 == 20 && (b11 & 240) == 32) {
                                                        if (b11 != 32) {
                                                            if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f31806q = 2;
                                                                        this.f31802m.f31787h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f31806q = 3;
                                                                        this.f31802m.f31787h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f31806q = 4;
                                                                        this.f31802m.f31787h = 4;
                                                                        break;
                                                                    default:
                                                                        int i19 = this.f31805p;
                                                                        if (i19 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f31803n = Collections.emptyList();
                                                                                        int i20 = this.f31805p;
                                                                                        if (i20 == 1 || i20 == 3) {
                                                                                            j();
                                                                                            break;
                                                                                        }
                                                                                    case 45:
                                                                                        if (i19 == 1 && !this.f31802m.e()) {
                                                                                            C3313b c3313b6 = this.f31802m;
                                                                                            ArrayList arrayList = c3313b6.f31781b;
                                                                                            arrayList.add(c3313b6.d());
                                                                                            c3313b6.f31782c.setLength(0);
                                                                                            c3313b6.f31780a.clear();
                                                                                            int min = Math.min(c3313b6.f31787h, c3313b6.f31783d);
                                                                                            while (arrayList.size() >= min) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f31803n = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f31802m.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        } else {
                                                            k(2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                C3313b c3313b7 = this.f31802m;
                                                int[] iArr = f31789B;
                                                c3313b7.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
                                                if ((b11 & 224) != 0) {
                                                    this.f31802m.a((char) iArr[(b11 & Byte.MAX_VALUE) - 32]);
                                                }
                                            }
                                            z14 = true;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = false;
                        this.f31807r = z10;
                        if (!z10) {
                        }
                        this.f31808s = false;
                        if (z10) {
                        }
                    }
                }
            } else if (z14) {
                int i21 = this.f31805p;
                if (i21 == 1 || i21 == 3) {
                    this.f31803n = i();
                    this.f31813x = this.f31865e;
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // h3.AbstractC3320i, x2.e
    public final void flush() {
        super.flush();
        this.f31803n = null;
        this.f31804o = null;
        k(0);
        this.f31806q = 4;
        this.f31802m.f31787h = 4;
        j();
        this.f31807r = false;
        this.f31808s = false;
        this.f31809t = (byte) 0;
        this.f31810u = (byte) 0;
        this.f31811v = 0;
        this.f31812w = true;
        this.f31813x = -9223372036854775807L;
    }

    @Override // h3.AbstractC3320i
    /* renamed from: g */
    public final AbstractC3168k b() {
        AbstractC3168k abstractC3168k;
        AbstractC3168k b10 = super.b();
        if (b10 != null) {
            return b10;
        }
        long j6 = this.f31800k;
        if (j6 != -9223372036854775807L) {
            long j10 = this.f31813x;
            if (j10 != -9223372036854775807L && this.f31865e - j10 >= j6 && (abstractC3168k = (AbstractC3168k) this.f31862b.pollFirst()) != null) {
                this.f31803n = Collections.emptyList();
                this.f31813x = -9223372036854775807L;
                C4.c e10 = e();
                long j11 = this.f31865e;
                abstractC3168k.f48647h0 = j11;
                abstractC3168k.f31185i0 = e10;
                abstractC3168k.f31186j0 = j11;
                return abstractC3168k;
            }
            return null;
        }
        return null;
    }

    @Override // h3.AbstractC3320i
    public final boolean h() {
        if (this.f31803n != this.f31804o) {
            return true;
        }
        return false;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f31801l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            r2.b c10 = ((C3313b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f44363n0);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            r2.b bVar = (r2.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f44363n0 != i10) {
                    bVar = ((C3313b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C3313b c3313b = this.f31802m;
        c3313b.f31786g = this.f31805p;
        c3313b.f31780a.clear();
        c3313b.f31781b.clear();
        c3313b.f31782c.setLength(0);
        c3313b.f31783d = 15;
        c3313b.f31784e = 0;
        c3313b.f31785f = 0;
        ArrayList arrayList = this.f31801l;
        arrayList.clear();
        arrayList.add(this.f31802m);
    }

    public final void k(int i10) {
        int i11 = this.f31805p;
        if (i11 == i10) {
            return;
        }
        this.f31805p = i10;
        if (i10 == 3) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f31801l;
                if (i12 < arrayList.size()) {
                    ((C3313b) arrayList.get(i12)).f31786g = i10;
                    i12++;
                } else {
                    return;
                }
            }
        } else {
            j();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f31803n = Collections.emptyList();
            }
        }
    }

    @Override // h3.AbstractC3320i, x2.e
    public final void release() {
    }
}
