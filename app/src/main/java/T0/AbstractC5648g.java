package t0;

import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5347k;
import r0.E;
import r0.z;

/* renamed from: t0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5648g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f45617a = 0;

    static {
        C5649h c5649h = AbstractC5650i.f45621D;
    }

    public static long a(long j6, long j10) {
        return AbstractC4828h.i(C5254f.d(j6) - C5251c.d(j10), C5254f.b(j6) - C5251c.e(j10));
    }

    public static void b(AbstractC5650i abstractC5650i, long j6, float f6, float f10, long j10, long j11, float f11, AbstractC5651j abstractC5651j, int i10) {
        float f12;
        if ((i10 & 64) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.E(j6, f6, f10, j10, j11, f12, abstractC5651j, null, C5649h.f45619b);
    }

    public static void c(AbstractC5650i abstractC5650i, long j6, float f6, long j10, AbstractC5651j abstractC5651j, int i10) {
        long j11;
        C5653l c5653l;
        if ((i10 & 4) != 0) {
            j11 = abstractC5650i.c0();
        } else {
            j11 = j10;
        }
        if ((i10 & 16) != 0) {
            c5653l = C5653l.f45622a;
        } else {
            c5653l = abstractC5651j;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.n(j6, f6, j11, 1.0f, c5653l, null, C5649h.f45619b);
    }

    public static void d(AbstractC5650i abstractC5650i, z zVar, long j6, long j10, long j11, float f6, C5347k c5347k, int i10, int i11) {
        long j12;
        long j13;
        float f10;
        int i12;
        if ((i11 & 2) != 0) {
            j12 = Z0.i.f22797b;
        } else {
            j12 = j6;
        }
        long j14 = Z0.i.f22797b;
        if ((i11 & 16) != 0) {
            j13 = j10;
        } else {
            j13 = j11;
        }
        if ((i11 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f6;
        }
        C5653l c5653l = C5653l.f45622a;
        C5649h c5649h = AbstractC5650i.f45621D;
        c5649h.getClass();
        int i13 = C5649h.f45619b;
        if ((i11 & 512) != 0) {
            c5649h.getClass();
            i12 = C5649h.f45620c;
        } else {
            i12 = i10;
        }
        abstractC5650i.Z(zVar, j12, j10, j14, j13, f10, c5653l, c5347k, i13, i12);
    }

    public static void e(AbstractC5650i abstractC5650i, z zVar, C5347k c5347k) {
        long j6 = C5251c.f43619b;
        C5653l c5653l = C5653l.f45622a;
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.w(zVar, j6, 1.0f, c5653l, c5347k, C5649h.f45619b);
    }

    public static void f(AbstractC5650i abstractC5650i, AbstractC5350n abstractC5350n, long j6, long j10, float f6, float f10, int i10) {
        float f11;
        if ((i10 & 64) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.v(abstractC5350n, j6, j10, f6, 0, f11, null, C5649h.f45619b);
    }

    public static void g(AbstractC5650i abstractC5650i, long j6, long j10, long j11, float f6, int i10, int i11) {
        int i12;
        if ((i11 & 16) != 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.o0(j6, j10, j11, f6, i12, 1.0f, null, C5649h.f45619b);
    }

    public static void h(AbstractC5650i abstractC5650i, E e10, AbstractC5350n abstractC5350n, float f6, C5654m c5654m, int i10) {
        if ((i10 & 4) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        C5653l c5653l = c5654m;
        if ((i10 & 8) != 0) {
            c5653l = C5653l.f45622a;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.f0(e10, abstractC5350n, f10, c5653l, null, C5649h.f45619b);
    }

    public static void i(AbstractC5650i abstractC5650i, E e10, long j6, float f6, AbstractC5651j abstractC5651j, int i10) {
        if ((i10 & 4) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        if ((i10 & 8) != 0) {
            abstractC5651j = C5653l.f45622a;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.r(e10, j6, f10, abstractC5651j, null, C5649h.f45619b);
    }

    public static void j(AbstractC5650i abstractC5650i, AbstractC5350n abstractC5350n, long j6, long j10, float f6, AbstractC5651j abstractC5651j, int i10) {
        long j11;
        long j12;
        float f10;
        C5653l c5653l;
        if ((i10 & 2) != 0) {
            j11 = C5251c.f43619b;
        } else {
            j11 = j6;
        }
        if ((i10 & 4) != 0) {
            j12 = a(abstractC5650i.g(), j11);
        } else {
            j12 = j10;
        }
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f6;
        }
        if ((i10 & 16) != 0) {
            c5653l = C5653l.f45622a;
        } else {
            c5653l = abstractC5651j;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.Y(abstractC5350n, j11, j12, f10, c5653l, null, C5649h.f45619b);
    }

    public static void k(AbstractC5650i abstractC5650i, long j6, long j10, long j11, float f6, int i10) {
        long j12;
        long j13;
        float f10;
        int i11;
        if ((i10 & 2) != 0) {
            j12 = C5251c.f43619b;
        } else {
            j12 = j10;
        }
        if ((i10 & 4) != 0) {
            j13 = a(abstractC5650i.g(), j12);
        } else {
            j13 = j11;
        }
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f6;
        }
        C5653l c5653l = C5653l.f45622a;
        if ((i10 & 64) != 0) {
            AbstractC5650i.f45621D.getClass();
            i11 = C5649h.f45619b;
        } else {
            i11 = 0;
        }
        abstractC5650i.m0(j6, j12, j13, f10, c5653l, null, i11);
    }

    public static void l(AbstractC5650i abstractC5650i, AbstractC5350n abstractC5350n, long j6, long j10, long j11, C5654m c5654m, int i10) {
        long j12;
        long j13;
        C5653l c5653l;
        if ((i10 & 2) != 0) {
            j12 = C5251c.f43619b;
        } else {
            j12 = j6;
        }
        if ((i10 & 4) != 0) {
            j13 = a(abstractC5650i.g(), j12);
        } else {
            j13 = j10;
        }
        if ((i10 & 32) != 0) {
            c5653l = C5653l.f45622a;
        } else {
            c5653l = c5654m;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.L(abstractC5350n, j12, j13, j11, 1.0f, c5653l, null, C5649h.f45619b);
    }

    public static void m(AbstractC5650i abstractC5650i, long j6, long j10, long j11, long j12, AbstractC5651j abstractC5651j, int i10) {
        long j13;
        if ((i10 & 2) != 0) {
            j13 = C5251c.f43619b;
        } else {
            j13 = j10;
        }
        AbstractC5650i.f45621D.getClass();
        abstractC5650i.k(j6, j13, j11, j12, abstractC5651j, 1.0f, null, C5649h.f45619b);
    }
}
