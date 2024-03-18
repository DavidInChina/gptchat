package y;

import s0.AbstractC5502d;
import s0.C5503e;
import w.C6077x;
import z.AbstractC6652A0;
import z.AbstractC6696f;
import z.AbstractC6717p0;
import z.C6720r;
import z.C6724t;
import z.C6737z0;

/* renamed from: y.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6481t extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6481t f50283Z = new C6481t(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6481t f50284h0 = new C6481t(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6481t f50285i0 = new C6481t(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C6481t f50286j0 = new C6481t(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C6481t f50287k0 = new C6481t(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C6481t f50288l0 = new C6481t(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C6481t f50289m0 = new C6481t(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C6481t f50290n0 = new C6481t(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C6481t f50291o0 = new C6481t(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C6481t f50292p0 = new C6481t(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C6481t f50293q0 = new C6481t(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C6481t f50294r0 = new C6481t(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C6481t f50295s0 = new C6481t(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C6481t f50296t0 = new C6481t(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final C6481t f50297u0 = new C6481t(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final C6481t f50298v0 = new C6481t(17);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50299Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6481t(int i10) {
        super(1);
        this.f50299Y = i10;
    }

    public final Integer a(int i10) {
        switch (this.f50299Y) {
            case 0:
                return Integer.valueOf(i10);
            case 1:
                return Integer.valueOf(i10);
            case 9:
            case 11:
            case 12:
            case 14:
                return 0;
            case 15:
                return Integer.valueOf((-i10) / 2);
            default:
                return Integer.valueOf((-i10) / 2);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        long c10 = Ng.H.c(0, 0);
        int i10 = this.f50299Y;
        switch (i10) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                return bool2;
            case 4:
                long a5 = r0.r.a(((r0.r) obj).f44265a, C5503e.f45045t);
                return new C6724t(r0.r.d(a5), r0.r.h(a5), r0.r.g(a5), r0.r.e(a5));
            case 5:
                C6481t c6481t = f50287k0;
                C6077x c6077x = new C6077x(2, (AbstractC5502d) obj);
                C6737z0 c6737z0 = AbstractC6652A0.f51116a;
                return new C6737z0(c6481t, c6077x);
            case 6:
                long j6 = ((r0.P) obj).f44227a;
                return new C6720r(r0.P.a(j6), r0.P.b(j6));
            case 7:
                C6720r c6720r = (C6720r) obj;
                return new r0.P(androidx.compose.ui.graphics.a.h(c6720r.f51354a, c6720r.f51355b));
            case 8:
                AbstractC6717p0 abstractC6717p0 = (AbstractC6717p0) obj;
                switch (i10) {
                    case 8:
                        return AbstractC6696f.u(0.0f, 0.0f, null, 7);
                    default:
                        return androidx.compose.animation.b.f24638c;
                }
            case 9:
                return a(((Number) obj).intValue());
            case 10:
                long j10 = ((Z0.k) obj).f22804a;
                return new Z0.k(c10);
            case 11:
                return a(((Number) obj).intValue());
            case 12:
                return a(((Number) obj).intValue());
            case 13:
                long j11 = ((Z0.k) obj).f22804a;
                return new Z0.k(c10);
            case 14:
                return a(((Number) obj).intValue());
            case 15:
                return a(((Number) obj).intValue());
            case 16:
                return a(((Number) obj).intValue());
            default:
                AbstractC6717p0 abstractC6717p02 = (AbstractC6717p0) obj;
                switch (i10) {
                    case 8:
                        return AbstractC6696f.u(0.0f, 0.0f, null, 7);
                    default:
                        return androidx.compose.animation.b.f24638c;
                }
        }
    }
}
