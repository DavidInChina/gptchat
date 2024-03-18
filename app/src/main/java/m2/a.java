package M2;

import I2.i;
import L2.B;
import L2.G;
import L2.l;
import L2.q;
import L2.r;
import L2.s;
import L2.u;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import p2.C5065s;
import p2.O;
import s2.AbstractC5530A;
import w8.e;

/* loaded from: classes2.dex */
public final class a implements q {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f11487p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f11488q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f11489r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f11490s;

    /* renamed from: t  reason: collision with root package name */
    public static final int f11491t;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11493b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11494c;

    /* renamed from: d  reason: collision with root package name */
    public long f11495d;

    /* renamed from: e  reason: collision with root package name */
    public int f11496e;

    /* renamed from: f  reason: collision with root package name */
    public int f11497f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11498g;

    /* renamed from: h  reason: collision with root package name */
    public long f11499h;

    /* renamed from: i  reason: collision with root package name */
    public int f11500i;

    /* renamed from: j  reason: collision with root package name */
    public int f11501j;

    /* renamed from: k  reason: collision with root package name */
    public long f11502k;

    /* renamed from: l  reason: collision with root package name */
    public s f11503l;

    /* renamed from: m  reason: collision with root package name */
    public G f11504m;

    /* renamed from: n  reason: collision with root package name */
    public B f11505n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11506o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f11488q = iArr;
        int i10 = AbstractC5530A.f45131a;
        Charset charset = e.f48221c;
        f11489r = "#!AMR\n".getBytes(charset);
        f11490s = "#!AMR-WB\n".getBytes(charset);
        f11491t = iArr[8];
    }

    public a(int i10) {
        this.f11493b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f11492a = new byte[1];
        this.f11500i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        int i10;
        int i11;
        boolean z10;
        String str;
        int i12;
        Gi.e.o(this.f11504m);
        int i13 = AbstractC5530A.f45131a;
        if (rVar.o() == 0 && !e(rVar)) {
            throw O.a("Could not find AMR header.", null);
        }
        if (!this.f11506o) {
            this.f11506o = true;
            boolean z11 = this.f11494c;
            if (z11) {
                str = "audio/amr-wb";
            } else {
                str = "audio/3gpp";
            }
            if (z11) {
                i12 = 16000;
            } else {
                i12 = 8000;
            }
            G g10 = this.f11504m;
            p2.r rVar2 = new p2.r();
            rVar2.f42237k = str;
            rVar2.f42238l = f11491t;
            rVar2.f42250x = 1;
            rVar2.f42251y = i12;
            g10.b(new C5065s(rVar2));
        }
        if (this.f11497f == 0) {
            try {
                int c10 = c(rVar);
                this.f11496e = c10;
                this.f11497f = c10;
                if (this.f11500i == -1) {
                    this.f11499h = rVar.o();
                    this.f11500i = this.f11496e;
                }
                if (this.f11500i == this.f11496e) {
                    this.f11501j++;
                }
            } catch (EOFException unused) {
            }
        }
        int c11 = this.f11504m.c(rVar, this.f11497f, true);
        if (c11 != -1) {
            int i14 = this.f11497f - c11;
            this.f11497f = i14;
            if (i14 <= 0) {
                this.f11504m.e(this.f11502k + this.f11495d, 1, this.f11496e, 0, null);
                this.f11495d += 20000;
            }
            i10 = 0;
            long h10 = rVar.h();
            if (!this.f11498g) {
                int i15 = this.f11493b;
                if ((i15 & 1) != 0 && h10 != -1 && ((i11 = this.f11500i) == -1 || i11 == this.f11496e)) {
                    if (this.f11501j >= 20 || i10 == -1) {
                        if ((i15 & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l lVar = new l((int) ((i11 * 8000000) / 20000), i11, h10, this.f11499h, z10);
                        this.f11505n = lVar;
                        this.f11503l.b(lVar);
                        this.f11498g = true;
                    }
                } else {
                    u uVar = new u(-9223372036854775807L);
                    this.f11505n = uVar;
                    this.f11503l.b(uVar);
                    this.f11498g = true;
                }
            }
            return i10;
        }
        i10 = -1;
        long h102 = rVar.h();
        if (!this.f11498g) {
        }
        return i10;
    }

    public final int c(r rVar) {
        String str;
        boolean z10;
        rVar.k();
        byte[] bArr = this.f11492a;
        rVar.n(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) <= 0) {
            int i10 = (b10 >> 3) & 15;
            if (i10 >= 0 && i10 <= 15 && (((z10 = this.f11494c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
                if (z10) {
                    return f11488q[i10];
                }
                return f11487p[i10];
            }
            StringBuilder sb2 = new StringBuilder("Illegal AMR ");
            if (this.f11494c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw O.a(sb2.toString(), null);
        }
        throw O.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f11503l = sVar;
        this.f11504m = sVar.f(0, 1);
        sVar.d();
    }

    public final boolean e(r rVar) {
        rVar.k();
        byte[] bArr = f11489r;
        byte[] bArr2 = new byte[bArr.length];
        rVar.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f11494c = false;
            rVar.l(bArr.length);
            return true;
        }
        rVar.k();
        byte[] bArr3 = f11490s;
        byte[] bArr4 = new byte[bArr3.length];
        rVar.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f11494c = true;
        rVar.l(bArr3.length);
        return true;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        return e(rVar);
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f11495d = 0L;
        this.f11496e = 0;
        this.f11497f = 0;
        if (j6 != 0) {
            B b10 = this.f11505n;
            if (b10 instanceof l) {
                l lVar = (l) b10;
                this.f11502k = (Math.max(0L, j6 - lVar.f10617b) * 8000000) / lVar.f10620e;
                return;
            }
        }
        this.f11502k = 0L;
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
