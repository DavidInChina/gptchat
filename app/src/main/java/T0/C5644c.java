package t0;

import android.graphics.Paint;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import q0.AbstractC5249a;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.C5342f;
import r0.C5347k;
import r0.E;
import r0.G;
import r0.r;
import r0.z;

/* renamed from: t0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5644c implements AbstractC5650i {

    /* renamed from: Y  reason: collision with root package name */
    public final C5642a f45611Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C5643b f45612Z = new C5643b(this);

    /* renamed from: h0  reason: collision with root package name */
    public C5342f f45613h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5342f f45614i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t0.a] */
    /* JADX WARN: Type inference failed for: r3v0, types: [r0.p, java.lang.Object] */
    public C5644c() {
        Z0.c cVar = AbstractC5647f.f45616a;
        Z0.l lVar = Z0.l.f22805Y;
        ?? obj = new Object();
        long j6 = C5254f.f43637b;
        ?? obj2 = new Object();
        obj2.f45605a = cVar;
        obj2.f45606b = lVar;
        obj2.f45607c = obj;
        obj2.f45608d = j6;
        this.f45611Y = obj2;
    }

    public static C5342f a(C5644c c5644c, long j6, AbstractC5651j abstractC5651j, float f6, C5347k c5347k, int i10) {
        AbstractC5650i.f45621D.getClass();
        int i11 = C5649h.f45620c;
        C5342f f10 = c5644c.f(abstractC5651j);
        if (f6 != 1.0f) {
            j6 = r.b(j6, r.d(j6) * f6);
        }
        if (!r.c(androidx.compose.ui.graphics.a.b(f10.f44235a.getColor()), j6)) {
            f10.f(j6);
        }
        if (f10.f44237c != null) {
            f10.i(null);
        }
        if (!AbstractC3557B.K(f10.f44238d, c5347k)) {
            f10.g(c5347k);
        }
        if (!G.b(f10.f44236b, i10)) {
            f10.e(i10);
        }
        if (!G.d(f10.a(), i11)) {
            f10.h(i11);
        }
        return f10;
    }

    public static C5342f d(C5644c c5644c, AbstractC5350n abstractC5350n, AbstractC5651j abstractC5651j, float f6, C5347k c5347k, int i10) {
        AbstractC5650i.f45621D.getClass();
        return c5644c.c(abstractC5350n, abstractC5651j, f6, c5347k, i10, C5649h.f45620c);
    }

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return h(K(f6));
    }

    @Override // t0.AbstractC5650i
    public final void E(long j6, float f6, float f10, long j10, long j11, float f11, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.r(C5251c.d(j10), C5251c.e(j10), C5254f.d(j11) + C5251c.d(j10), C5254f.b(j11) + C5251c.e(j10), f6, f10, a(this, j6, abstractC5651j, f11, c5347k, i10));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // t0.AbstractC5650i
    public final void L(AbstractC5350n abstractC5350n, long j6, long j10, long j11, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.j(C5251c.d(j6), C5251c.e(j6), C5251c.d(j6) + C5254f.d(j10), C5251c.e(j6) + C5254f.b(j10), AbstractC5249a.b(j11), AbstractC5249a.c(j11), d(this, abstractC5350n, abstractC5651j, f6, c5347k, i10));
    }

    @Override // Z0.b
    public final float O() {
        return this.f45611Y.f45605a.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    @Override // t0.AbstractC5650i
    public final C5643b V() {
        return this.f45612Z;
    }

    @Override // t0.AbstractC5650i
    public final void Y(AbstractC5350n abstractC5350n, long j6, long j10, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.n(C5251c.d(j6), C5251c.e(j6), C5254f.d(j10) + C5251c.d(j6), C5254f.b(j10) + C5251c.e(j6), d(this, abstractC5350n, abstractC5651j, f6, c5347k, i10));
    }

    @Override // t0.AbstractC5650i
    public final void Z(z zVar, long j6, long j10, long j11, long j12, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10, int i11) {
        this.f45611Y.f45607c.m(zVar, j6, j10, j11, j12, c(null, abstractC5651j, f6, c5347k, i10, i11));
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f45611Y.f45605a.b();
    }

    public final C5342f c(AbstractC5350n abstractC5350n, AbstractC5651j abstractC5651j, float f6, C5347k c5347k, int i10, int i11) {
        C5342f f10 = f(abstractC5651j);
        if (abstractC5350n != null) {
            abstractC5350n.a(f6, g(), f10);
        } else {
            if (f10.f44237c != null) {
                f10.i(null);
            }
            long b10 = androidx.compose.ui.graphics.a.b(f10.f44235a.getColor());
            long j6 = r.f44254b;
            if (!r.c(b10, j6)) {
                f10.f(j6);
            }
            if (f10.f44235a.getAlpha() / 255.0f != f6) {
                f10.d(f6);
            }
        }
        if (!AbstractC3557B.K(f10.f44238d, c5347k)) {
            f10.g(c5347k);
        }
        if (!G.b(f10.f44236b, i10)) {
            f10.e(i10);
        }
        if (!G.d(f10.a(), i11)) {
            f10.h(i11);
        }
        return f10;
    }

    @Override // t0.AbstractC5650i
    public final long c0() {
        int i10 = AbstractC5648g.f45617a;
        return AbstractC4828h.L(V().b());
    }

    public final C5342f e() {
        C5342f c5342f = this.f45614i0;
        if (c5342f == null) {
            C5342f f6 = androidx.compose.ui.graphics.a.f();
            f6.m(1);
            this.f45614i0 = f6;
            return f6;
        }
        return c5342f;
    }

    public final C5342f f(AbstractC5651j abstractC5651j) {
        if (AbstractC3557B.K(abstractC5651j, C5653l.f45622a)) {
            C5342f c5342f = this.f45613h0;
            if (c5342f == null) {
                C5342f f6 = androidx.compose.ui.graphics.a.f();
                f6.m(0);
                this.f45613h0 = f6;
                return f6;
            }
            return c5342f;
        } else if (abstractC5651j instanceof C5654m) {
            C5342f e10 = e();
            Paint paint = e10.f44235a;
            float strokeWidth = paint.getStrokeWidth();
            C5654m c5654m = (C5654m) abstractC5651j;
            float f10 = c5654m.f45623a;
            if (strokeWidth != f10) {
                e10.l(f10);
            }
            int b10 = e10.b();
            int i10 = c5654m.f45625c;
            if (!G.f(b10, i10)) {
                e10.j(i10);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f11 = c5654m.f45624b;
            if (strokeMiter != f11) {
                e10.f44235a.setStrokeMiter(f11);
            }
            int c10 = e10.c();
            int i11 = c5654m.f45626d;
            if (!G.g(c10, i11)) {
                e10.k(i11);
            }
            if (!AbstractC3557B.K(null, null)) {
                e10.f44235a.setPathEffect(null);
            }
            return e10;
        } else {
            throw new RuntimeException();
        }
    }

    @Override // t0.AbstractC5650i
    public final void f0(E e10, AbstractC5350n abstractC5350n, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.e(e10, d(this, abstractC5350n, abstractC5651j, f6, c5347k, i10));
    }

    @Override // t0.AbstractC5650i
    public final long g() {
        int i10 = AbstractC5648g.f45617a;
        return V().b();
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    @Override // t0.AbstractC5650i
    public final Z0.l getLayoutDirection() {
        return this.f45611Y.f45606b;
    }

    public final /* synthetic */ long h(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // t0.AbstractC5650i
    public final void k(long j6, long j10, long j11, long j12, AbstractC5651j abstractC5651j, float f6, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.j(C5251c.d(j10), C5251c.e(j10), C5254f.d(j11) + C5251c.d(j10), C5254f.b(j11) + C5251c.e(j10), AbstractC5249a.b(j12), AbstractC5249a.c(j12), a(this, j6, abstractC5651j, f6, c5347k, i10));
    }

    @Override // t0.AbstractC5650i
    public final void m0(long j6, long j10, long j11, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.n(C5251c.d(j10), C5251c.e(j10), C5254f.d(j11) + C5251c.d(j10), C5254f.b(j11) + C5251c.e(j10), a(this, j6, abstractC5651j, f6, c5347k, i10));
    }

    @Override // t0.AbstractC5650i
    public final void n(long j6, float f6, long j10, float f10, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.k(f6, j10, a(this, j6, abstractC5651j, f10, c5347k, i10));
    }

    @Override // t0.AbstractC5650i
    public final void o0(long j6, long j10, long j11, float f6, int i10, float f10, C5347k c5347k, int i11) {
        long j12;
        AbstractC5352p abstractC5352p = this.f45611Y.f45607c;
        AbstractC5650i.f45621D.getClass();
        int i12 = C5649h.f45620c;
        C5342f e10 = e();
        if (f10 == 1.0f) {
            j12 = j6;
        } else {
            j12 = r.b(j6, r.d(j6) * f10);
        }
        if (!r.c(androidx.compose.ui.graphics.a.b(e10.f44235a.getColor()), j12)) {
            e10.f(j12);
        }
        if (e10.f44237c != null) {
            e10.i(null);
        }
        if (!AbstractC3557B.K(e10.f44238d, c5347k)) {
            e10.g(c5347k);
        }
        if (!G.b(e10.f44236b, i11)) {
            e10.e(i11);
        }
        Paint paint = e10.f44235a;
        if (paint.getStrokeWidth() != f6) {
            e10.l(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            e10.f44235a.setStrokeMiter(4.0f);
        }
        if (!G.f(e10.b(), i10)) {
            e10.j(i10);
        }
        if (!G.g(e10.c(), 0)) {
            e10.k(0);
        }
        if (!AbstractC3557B.K(null, null)) {
            e10.f44235a.setPathEffect(null);
        }
        if (!G.d(e10.a(), i12)) {
            e10.h(i12);
        }
        abstractC5352p.c(j10, j11, e10);
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    @Override // t0.AbstractC5650i
    public final void r(E e10, long j6, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.e(e10, a(this, j6, abstractC5651j, f6, c5347k, i10));
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }

    @Override // t0.AbstractC5650i
    public final void v(AbstractC5350n abstractC5350n, long j6, long j10, float f6, int i10, float f10, C5347k c5347k, int i11) {
        AbstractC5352p abstractC5352p = this.f45611Y.f45607c;
        AbstractC5650i.f45621D.getClass();
        int i12 = C5649h.f45620c;
        C5342f e10 = e();
        if (abstractC5350n != null) {
            abstractC5350n.a(f10, g(), e10);
        } else if (e10.f44235a.getAlpha() / 255.0f != f10) {
            e10.d(f10);
        }
        if (!AbstractC3557B.K(e10.f44238d, c5347k)) {
            e10.g(c5347k);
        }
        if (!G.b(e10.f44236b, i11)) {
            e10.e(i11);
        }
        Paint paint = e10.f44235a;
        if (paint.getStrokeWidth() != f6) {
            e10.l(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            e10.f44235a.setStrokeMiter(4.0f);
        }
        if (!G.f(e10.b(), i10)) {
            e10.j(i10);
        }
        if (!G.g(e10.c(), 0)) {
            e10.k(0);
        }
        if (!AbstractC3557B.K(null, null)) {
            e10.f44235a.setPathEffect(null);
        }
        if (!G.d(e10.a(), i12)) {
            e10.h(i12);
        }
        abstractC5352p.c(j6, j10, e10);
    }

    @Override // t0.AbstractC5650i
    public final void w(z zVar, long j6, float f6, AbstractC5651j abstractC5651j, C5347k c5347k, int i10) {
        this.f45611Y.f45607c.f(zVar, j6, d(this, null, abstractC5651j, f6, c5347k, i10));
    }
}
