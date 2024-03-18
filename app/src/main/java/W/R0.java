package W;

import X.AbstractC1672f;
import X.AbstractC1673g;
import Z.AbstractC1725n;
import Z.AbstractC1748z;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract class R0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.m1 f19593a = new AbstractC1748z(Q0.f19565Z);

    /* renamed from: b  reason: collision with root package name */
    public static final Z.m1 f19594b = new AbstractC1748z(Q0.f19566h0);

    public static final long a(P0 p02, long j6) {
        if (r0.r.c(j6, p02.f19515a)) {
            return p02.f19517b;
        }
        if (r0.r.c(j6, p02.f19522f)) {
            return p02.f19523g;
        }
        if (r0.r.c(j6, p02.f19526j)) {
            return p02.f19527k;
        }
        if (r0.r.c(j6, p02.f19530n)) {
            return p02.f19531o;
        }
        if (r0.r.c(j6, p02.f19539w)) {
            return p02.f19540x;
        }
        if (r0.r.c(j6, p02.f19519c)) {
            return p02.f19520d;
        }
        if (r0.r.c(j6, p02.f19524h)) {
            return p02.f19525i;
        }
        if (r0.r.c(j6, p02.f19528l)) {
            return p02.f19529m;
        }
        if (r0.r.c(j6, p02.f19541y)) {
            return p02.f19542z;
        }
        if (r0.r.c(j6, p02.f19537u)) {
            return p02.f19538v;
        }
        boolean c10 = r0.r.c(j6, p02.f19532p);
        long j10 = p02.f19533q;
        if (!c10) {
            if (r0.r.c(j6, p02.f19534r)) {
                return p02.f19535s;
            }
            if (!r0.r.c(j6, p02.f19496D) && !r0.r.c(j6, p02.f19498F) && !r0.r.c(j6, p02.f19499G) && !r0.r.c(j6, p02.f19500H) && !r0.r.c(j6, p02.f19501I) && !r0.r.c(j6, p02.f19502J)) {
                int i10 = r0.r.f44264l;
                return r0.r.f44263k;
            }
        }
        return j10;
    }

    public static final long b(long j6, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        long a5 = a((P0) rVar.m(f19593a), j6);
        if (a5 == r0.r.f44263k) {
            return ((r0.r) rVar.m(Z0.f19875a)).f44265a;
        }
        return a5;
    }

    public static P0 c(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i10) {
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        if ((i10 & 4) != 0) {
            j33 = AbstractC1672f.f21521s;
        } else {
            j33 = j11;
        }
        if ((i10 & 8) != 0) {
            j34 = AbstractC1672f.f21512j;
        } else {
            j34 = j12;
        }
        long j55 = AbstractC1672f.f21507e;
        if ((i10 & 32) != 0) {
            j35 = AbstractC1672f.f21523u;
        } else {
            j35 = j13;
        }
        if ((i10 & 64) != 0) {
            j36 = AbstractC1672f.f21513k;
        } else {
            j36 = j14;
        }
        if ((i10 & 128) != 0) {
            j37 = AbstractC1672f.f21524v;
        } else {
            j37 = j15;
        }
        if ((i10 & 256) != 0) {
            j38 = AbstractC1672f.f21514l;
        } else {
            j38 = j16;
        }
        if ((i10 & 512) != 0) {
            j39 = AbstractC1672f.f21501F;
        } else {
            j39 = j17;
        }
        if ((i10 & 1024) != 0) {
            j40 = AbstractC1672f.f21517o;
        } else {
            j40 = j18;
        }
        if ((i10 & 2048) != 0) {
            j41 = AbstractC1672f.f21502G;
        } else {
            j41 = j19;
        }
        if ((i10 & 4096) != 0) {
            j42 = AbstractC1672f.f21518p;
        } else {
            j42 = j20;
        }
        if ((i10 & 8192) != 0) {
            j43 = AbstractC1672f.f21503a;
        } else {
            j43 = j21;
        }
        if ((i10 & 16384) != 0) {
            j44 = AbstractC1672f.f21509g;
        } else {
            j44 = j22;
        }
        if ((32768 & i10) != 0) {
            j45 = AbstractC1672f.f21525w;
        } else {
            j45 = j23;
        }
        if ((65536 & i10) != 0) {
            j46 = AbstractC1672f.f21515m;
        } else {
            j46 = j24;
        }
        if ((131072 & i10) != 0) {
            j47 = AbstractC1672f.f21500E;
        } else {
            j47 = j25;
        }
        if ((262144 & i10) != 0) {
            j48 = AbstractC1672f.f21516n;
        } else {
            j48 = j26;
        }
        long j56 = AbstractC1672f.f21508f;
        long j57 = AbstractC1672f.f21506d;
        if ((4194304 & i10) != 0) {
            j49 = AbstractC1672f.f21504b;
        } else {
            j49 = j27;
        }
        if ((8388608 & i10) != 0) {
            j50 = AbstractC1672f.f21510h;
        } else {
            j50 = j28;
        }
        if ((16777216 & i10) != 0) {
            j51 = AbstractC1672f.f21505c;
        } else {
            j51 = j29;
        }
        if ((33554432 & i10) != 0) {
            j52 = AbstractC1672f.f21511i;
        } else {
            j52 = j30;
        }
        if ((67108864 & i10) != 0) {
            j53 = AbstractC1672f.f21519q;
        } else {
            j53 = j31;
        }
        if ((i10 & 134217728) != 0) {
            j54 = AbstractC1672f.f21520r;
        } else {
            j54 = j32;
        }
        return new P0(j6, j10, j33, j34, j55, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j6, j56, j57, j49, j50, j51, j52, j53, j54, AbstractC1672f.f21522t, AbstractC1672f.f21526x, AbstractC1672f.f21499D, AbstractC1672f.f21527y, AbstractC1672f.f21528z, AbstractC1672f.f21496A, AbstractC1672f.f21497B, AbstractC1672f.f21498C);
    }

    public static final long d(P0 p02, int i10) {
        switch (AbstractC6708l.f(i10)) {
            case 0:
                return p02.f19530n;
            case 1:
                return p02.f19539w;
            case 2:
                return p02.f19541y;
            case 3:
                return p02.f19538v;
            case 4:
                return p02.f19521e;
            case 5:
                return p02.f19537u;
            case 6:
                return p02.f19531o;
            case 7:
                return p02.f19540x;
            case 8:
                return p02.f19542z;
            case 9:
                return p02.f19517b;
            case 10:
                return p02.f19520d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return r0.r.f44263k;
            case 13:
                return p02.f19523g;
            case 14:
                return p02.f19525i;
            case 17:
                return p02.f19533q;
            case 18:
                return p02.f19535s;
            case 19:
                return p02.f19527k;
            case 20:
                return p02.f19529m;
            case 23:
                return p02.f19493A;
            case 24:
                return p02.f19494B;
            case 25:
                return p02.f19515a;
            case 26:
                return p02.f19519c;
            case 29:
                return p02.f19495C;
            case 30:
                return p02.f19522f;
            case 31:
                return p02.f19524h;
            case 34:
                return p02.f19532p;
            case 35:
                return p02.f19496D;
            case 36:
                return p02.f19498F;
            case 37:
                return p02.f19499G;
            case 38:
                return p02.f19500H;
            case 39:
                return p02.f19501I;
            case 40:
                return p02.f19502J;
            case 41:
                return p02.f19497E;
            case 42:
                return p02.f19536t;
            case 43:
                return p02.f19534r;
            case 44:
                return p02.f19526j;
            case 45:
                return p02.f19528l;
        }
    }

    public static final long e(int i10, AbstractC1725n abstractC1725n) {
        return d((P0) ((Z.r) abstractC1725n).m(f19593a), i10);
    }

    public static P0 f(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i10) {
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        if ((i10 & 1) != 0) {
            j33 = AbstractC1673g.f21557t;
        } else {
            j33 = j6;
        }
        if ((i10 & 2) != 0) {
            j34 = AbstractC1673g.f21547j;
        } else {
            j34 = j10;
        }
        if ((i10 & 4) != 0) {
            j35 = AbstractC1673g.f21558u;
        } else {
            j35 = j11;
        }
        if ((i10 & 8) != 0) {
            j36 = AbstractC1673g.f21548k;
        } else {
            j36 = j12;
        }
        long j57 = AbstractC1673g.f21542e;
        if ((i10 & 32) != 0) {
            j37 = AbstractC1673g.f21560w;
        } else {
            j37 = j13;
        }
        if ((i10 & 64) != 0) {
            j38 = AbstractC1673g.f21549l;
        } else {
            j38 = j14;
        }
        if ((i10 & 128) != 0) {
            j39 = AbstractC1673g.f21561x;
        } else {
            j39 = j15;
        }
        if ((i10 & 256) != 0) {
            j40 = AbstractC1673g.f21550m;
        } else {
            j40 = j16;
        }
        if ((i10 & 512) != 0) {
            j41 = AbstractC1673g.f21536H;
        } else {
            j41 = j17;
        }
        if ((i10 & 1024) != 0) {
            j42 = AbstractC1673g.f21553p;
        } else {
            j42 = j18;
        }
        if ((i10 & 2048) != 0) {
            j43 = AbstractC1673g.f21537I;
        } else {
            j43 = j19;
        }
        if ((i10 & 4096) != 0) {
            j44 = AbstractC1673g.f21554q;
        } else {
            j44 = j20;
        }
        if ((i10 & 8192) != 0) {
            j45 = AbstractC1673g.f21538a;
        } else {
            j45 = j21;
        }
        if ((i10 & 16384) != 0) {
            j46 = AbstractC1673g.f21544g;
        } else {
            j46 = j22;
        }
        if ((32768 & i10) != 0) {
            j47 = AbstractC1673g.f21562y;
        } else {
            j47 = j23;
        }
        if ((65536 & i10) != 0) {
            j48 = AbstractC1673g.f21551n;
        } else {
            j48 = j24;
        }
        if ((131072 & i10) != 0) {
            j49 = AbstractC1673g.f21535G;
        } else {
            j49 = j25;
        }
        if ((262144 & i10) != 0) {
            j50 = AbstractC1673g.f21552o;
        } else {
            j50 = j26;
        }
        long j58 = AbstractC1673g.f21543f;
        long j59 = AbstractC1673g.f21541d;
        if ((4194304 & i10) != 0) {
            j51 = AbstractC1673g.f21539b;
        } else {
            j51 = j27;
        }
        if ((8388608 & i10) != 0) {
            j52 = AbstractC1673g.f21545h;
        } else {
            j52 = j28;
        }
        if ((16777216 & i10) != 0) {
            j53 = AbstractC1673g.f21540c;
        } else {
            j53 = j29;
        }
        if ((33554432 & i10) != 0) {
            j54 = AbstractC1673g.f21546i;
        } else {
            j54 = j30;
        }
        if ((67108864 & i10) != 0) {
            j55 = AbstractC1673g.f21555r;
        } else {
            j55 = j31;
        }
        if ((i10 & 134217728) != 0) {
            j56 = AbstractC1673g.f21556s;
        } else {
            j56 = j32;
        }
        return new P0(j33, j34, j35, j36, j57, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j33, j58, j59, j51, j52, j53, j54, j55, j56, AbstractC1673g.f21559v, AbstractC1673g.f21563z, AbstractC1673g.f21534F, AbstractC1673g.f21529A, AbstractC1673g.f21530B, AbstractC1673g.f21531C, AbstractC1673g.f21532D, AbstractC1673g.f21533E);
    }

    public static final long g(P0 p02, float f6) {
        if (Z0.e.a(f6, 0)) {
            return p02.f19532p;
        }
        return androidx.compose.ui.graphics.a.k(r0.r.b(p02.f19536t, ((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f), p02.f19532p);
    }
}
