package y2;

import E2.C0492y;
import android.os.SystemClock;
import java.util.List;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: t  reason: collision with root package name */
    public static final C0492y f50535t = new C0492y(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final p2.g0 f50536a;

    /* renamed from: b  reason: collision with root package name */
    public final C0492y f50537b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50538c;

    /* renamed from: d  reason: collision with root package name */
    public final long f50539d;

    /* renamed from: e  reason: collision with root package name */
    public final int f50540e;

    /* renamed from: f  reason: collision with root package name */
    public final C6527n f50541f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f50542g;

    /* renamed from: h  reason: collision with root package name */
    public final E2.i0 f50543h;

    /* renamed from: i  reason: collision with root package name */
    public final H2.w f50544i;

    /* renamed from: j  reason: collision with root package name */
    public final List f50545j;

    /* renamed from: k  reason: collision with root package name */
    public final C0492y f50546k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f50547l;

    /* renamed from: m  reason: collision with root package name */
    public final int f50548m;

    /* renamed from: n  reason: collision with root package name */
    public final p2.S f50549n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f50550o;

    /* renamed from: p  reason: collision with root package name */
    public volatile long f50551p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f50552q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f50553r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f50554s;

    public d0(p2.g0 g0Var, C0492y c0492y, long j6, long j10, int i10, C6527n c6527n, boolean z10, E2.i0 i0Var, H2.w wVar, List list, C0492y c0492y2, boolean z11, int i11, p2.S s10, long j11, long j12, long j13, long j14, boolean z12) {
        this.f50536a = g0Var;
        this.f50537b = c0492y;
        this.f50538c = j6;
        this.f50539d = j10;
        this.f50540e = i10;
        this.f50541f = c6527n;
        this.f50542g = z10;
        this.f50543h = i0Var;
        this.f50544i = wVar;
        this.f50545j = list;
        this.f50546k = c0492y2;
        this.f50547l = z11;
        this.f50548m = i11;
        this.f50549n = s10;
        this.f50551p = j11;
        this.f50552q = j12;
        this.f50553r = j13;
        this.f50554s = j14;
        this.f50550o = z12;
    }

    public static d0 h(H2.w wVar) {
        p2.d0 d0Var = p2.g0.f42063Y;
        C0492y c0492y = f50535t;
        return new d0(d0Var, c0492y, -9223372036854775807L, 0L, 1, null, false, E2.i0.f4359i0, wVar, x8.k0.f49573j0, c0492y, false, 0, p2.S.f41931i0, 0L, 0L, 0L, 0L, false);
    }

    public final d0 a() {
        return new d0(this.f50536a, this.f50537b, this.f50538c, this.f50539d, this.f50540e, this.f50541f, this.f50542g, this.f50543h, this.f50544i, this.f50545j, this.f50546k, this.f50547l, this.f50548m, this.f50549n, this.f50551p, this.f50552q, i(), SystemClock.elapsedRealtime(), this.f50550o);
    }

    public final d0 b(C0492y c0492y) {
        return new d0(this.f50536a, this.f50537b, this.f50538c, this.f50539d, this.f50540e, this.f50541f, this.f50542g, this.f50543h, this.f50544i, this.f50545j, c0492y, this.f50547l, this.f50548m, this.f50549n, this.f50551p, this.f50552q, this.f50553r, this.f50554s, this.f50550o);
    }

    public final d0 c(C0492y c0492y, long j6, long j10, long j11, long j12, E2.i0 i0Var, H2.w wVar, List list) {
        return new d0(this.f50536a, c0492y, j10, j11, this.f50540e, this.f50541f, this.f50542g, i0Var, wVar, list, this.f50546k, this.f50547l, this.f50548m, this.f50549n, this.f50551p, j12, j6, SystemClock.elapsedRealtime(), this.f50550o);
    }

    public final d0 d(int i10, boolean z10) {
        return new d0(this.f50536a, this.f50537b, this.f50538c, this.f50539d, this.f50540e, this.f50541f, this.f50542g, this.f50543h, this.f50544i, this.f50545j, this.f50546k, z10, i10, this.f50549n, this.f50551p, this.f50552q, this.f50553r, this.f50554s, this.f50550o);
    }

    public final d0 e(C6527n c6527n) {
        return new d0(this.f50536a, this.f50537b, this.f50538c, this.f50539d, this.f50540e, c6527n, this.f50542g, this.f50543h, this.f50544i, this.f50545j, this.f50546k, this.f50547l, this.f50548m, this.f50549n, this.f50551p, this.f50552q, this.f50553r, this.f50554s, this.f50550o);
    }

    public final d0 f(int i10) {
        return new d0(this.f50536a, this.f50537b, this.f50538c, this.f50539d, i10, this.f50541f, this.f50542g, this.f50543h, this.f50544i, this.f50545j, this.f50546k, this.f50547l, this.f50548m, this.f50549n, this.f50551p, this.f50552q, this.f50553r, this.f50554s, this.f50550o);
    }

    public final d0 g(p2.g0 g0Var) {
        return new d0(g0Var, this.f50537b, this.f50538c, this.f50539d, this.f50540e, this.f50541f, this.f50542g, this.f50543h, this.f50544i, this.f50545j, this.f50546k, this.f50547l, this.f50548m, this.f50549n, this.f50551p, this.f50552q, this.f50553r, this.f50554s, this.f50550o);
    }

    public final long i() {
        long j6;
        long j10;
        if (!j()) {
            return this.f50553r;
        }
        do {
            j6 = this.f50554s;
            j10 = this.f50553r;
        } while (j6 != this.f50554s);
        return AbstractC5530A.C(AbstractC5530A.L(j10) + (((float) (SystemClock.elapsedRealtime() - j6)) * this.f50549n.f41934Y));
    }

    public final boolean j() {
        if (this.f50540e == 3 && this.f50547l && this.f50548m == 0) {
            return true;
        }
        return false;
    }
}
