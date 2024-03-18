package H0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.AbstractC5249a;
import q0.C5251c;
import q0.C5252d;
import q0.C5253e;
import q0.C5254f;
import r0.AbstractC5352p;
import r0.C5336C;
import r0.C5344h;

/* loaded from: classes2.dex */
public final class I0 {

    /* renamed from: a  reason: collision with root package name */
    public Z0.b f6742a;

    /* renamed from: c  reason: collision with root package name */
    public final Outline f6744c;

    /* renamed from: d  reason: collision with root package name */
    public long f6745d;

    /* renamed from: f  reason: collision with root package name */
    public C5344h f6747f;

    /* renamed from: g  reason: collision with root package name */
    public r0.E f6748g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6749h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6750i;

    /* renamed from: j  reason: collision with root package name */
    public r0.E f6751j;

    /* renamed from: k  reason: collision with root package name */
    public C5253e f6752k;

    /* renamed from: l  reason: collision with root package name */
    public float f6753l;

    /* renamed from: n  reason: collision with root package name */
    public long f6755n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6756o;

    /* renamed from: q  reason: collision with root package name */
    public r0.G f6758q;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6743b = true;

    /* renamed from: e  reason: collision with root package name */
    public r0.L f6746e = r0.G.f44171a;

    /* renamed from: m  reason: collision with root package name */
    public long f6754m = C5251c.f43619b;

    /* renamed from: p  reason: collision with root package name */
    public Z0.l f6757p = Z0.l.f22805Y;

    public I0(Z0.b bVar) {
        this.f6742a = bVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f6744c = outline;
        long j6 = C5254f.f43637b;
        this.f6745d = j6;
        this.f6755n = j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (q0.AbstractC5249a.b(r5.f43633e) == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC5352p abstractC5352p) {
        e();
        r0.E e10 = this.f6748g;
        if (e10 != null) {
            abstractC5352p.g(e10, 1);
            return;
        }
        float f6 = this.f6753l;
        if (f6 > 0.0f) {
            r0.E e11 = this.f6751j;
            C5253e c5253e = this.f6752k;
            if (e11 != null) {
                long j6 = this.f6754m;
                long j10 = this.f6755n;
                if (c5253e != null && r9.y.H0(c5253e)) {
                    if (c5253e.f43629a == C5251c.d(j6)) {
                        if (c5253e.f43630b == C5251c.e(j6)) {
                            if (c5253e.f43631c == C5254f.d(j10) + C5251c.d(j6)) {
                                if (c5253e.f43632d == C5254f.b(j10) + C5251c.e(j6)) {
                                }
                            }
                        }
                    }
                }
            }
            float d10 = C5251c.d(this.f6754m);
            float e12 = C5251c.e(this.f6754m);
            float d11 = C5254f.d(this.f6755n) + C5251c.d(this.f6754m);
            float b10 = C5254f.b(this.f6755n) + C5251c.e(this.f6754m);
            float f10 = this.f6753l;
            long b11 = Ng.H.b(f10, f10);
            long b12 = Ng.H.b(AbstractC5249a.b(b11), AbstractC5249a.c(b11));
            C5253e c5253e2 = new C5253e(d10, e12, d11, b10, b12, b12, b12, b12);
            if (e11 == null) {
                e11 = androidx.compose.ui.graphics.a.g();
            } else {
                ((C5344h) e11).d();
            }
            ((C5344h) e11).a(c5253e2);
            this.f6752k = c5253e2;
            this.f6751j = e11;
            abstractC5352p.g(e11, 1);
            return;
        }
        abstractC5352p.o(C5251c.d(this.f6754m), C5251c.e(this.f6754m), C5251c.d(this.f6754m) + C5254f.d(this.f6755n), C5251c.e(this.f6754m) + C5254f.b(this.f6755n), 1);
    }

    public final Outline b() {
        e();
        if (this.f6756o && this.f6743b) {
            return this.f6744c;
        }
        return null;
    }

    public final boolean c(long j6) {
        r0.G g10;
        float f6;
        boolean z10;
        if (!this.f6756o || (g10 = this.f6758q) == null) {
            return true;
        }
        float d10 = C5251c.d(j6);
        float e10 = C5251c.e(j6);
        boolean z11 = false;
        if (g10 instanceof C5336C) {
            C5252d c5252d = ((C5336C) g10).f44168k;
            if (c5252d.f43625a <= d10 && d10 < c5252d.f43627c && c5252d.f43626b <= e10 && e10 < c5252d.f43628d) {
                return true;
            }
        } else if (g10 instanceof r0.D) {
            C5253e c5253e = ((r0.D) g10).f44169k;
            if (d10 >= c5253e.f43629a) {
                float f10 = c5253e.f43631c;
                if (d10 < f10) {
                    float f11 = c5253e.f43630b;
                    if (e10 >= f11) {
                        float f12 = c5253e.f43632d;
                        if (e10 < f12) {
                            long j10 = c5253e.f43633e;
                            float b10 = AbstractC5249a.b(j10);
                            long j11 = c5253e.f43634f;
                            if (AbstractC5249a.b(j11) + b10 <= c5253e.b()) {
                                long j12 = c5253e.f43636h;
                                float b11 = AbstractC5249a.b(j12);
                                f6 = d10;
                                long j13 = c5253e.f43635g;
                                if (AbstractC5249a.b(j13) + b11 <= c5253e.b()) {
                                    if (AbstractC5249a.c(j12) + AbstractC5249a.c(j10) <= c5253e.a()) {
                                        if (AbstractC5249a.c(j13) + AbstractC5249a.c(j11) <= c5253e.a()) {
                                            float b12 = AbstractC5249a.b(j10);
                                            float f13 = c5253e.f43629a;
                                            float f14 = b12 + f13;
                                            float c10 = AbstractC5249a.c(j10) + f11;
                                            float b13 = f10 - AbstractC5249a.b(j11);
                                            float c11 = f11 + AbstractC5249a.c(j11);
                                            float b14 = f10 - AbstractC5249a.b(j13);
                                            float c12 = f12 - AbstractC5249a.c(j13);
                                            float c13 = f12 - AbstractC5249a.c(j12);
                                            float b15 = f13 + AbstractC5249a.b(j12);
                                            if (f6 < f14 && e10 < c10) {
                                                z10 = U3.f.d0(f6, e10, f14, c10, c5253e.f43633e);
                                            } else if (f6 < b15 && e10 > c13) {
                                                z10 = U3.f.d0(f6, e10, b15, c13, c5253e.f43636h);
                                            } else if (f6 > b13 && e10 < c11) {
                                                z10 = U3.f.d0(f6, e10, b13, c11, c5253e.f43634f);
                                            } else if (f6 > b14 && e10 > c12) {
                                                z10 = U3.f.d0(f6, e10, b14, c12, c5253e.f43635g);
                                            } else {
                                                z10 = true;
                                            }
                                            z11 = z10;
                                        }
                                    }
                                }
                            } else {
                                f6 = d10;
                            }
                            C5344h g11 = androidx.compose.ui.graphics.a.g();
                            g11.a(c5253e);
                            float f15 = f6 - 0.005f;
                            float f16 = e10 - 0.005f;
                            float f17 = f6 + 0.005f;
                            float f18 = e10 + 0.005f;
                            C5344h g12 = androidx.compose.ui.graphics.a.g();
                            if (!Float.isNaN(f15)) {
                                if (!Float.isNaN(f16)) {
                                    if (!Float.isNaN(f17)) {
                                        if (!Float.isNaN(f18)) {
                                            if (g12.f44242b == null) {
                                                g12.f44242b = new RectF();
                                            }
                                            RectF rectF = g12.f44242b;
                                            AbstractC3557B.Z(rectF);
                                            rectF.set(f15, f16, f17, f18);
                                            RectF rectF2 = g12.f44242b;
                                            AbstractC3557B.Z(rectF2);
                                            g12.f44241a.addRect(rectF2, Path.Direction.CCW);
                                            C5344h g13 = androidx.compose.ui.graphics.a.g();
                                            g13.c(g11, g12, 1);
                                            boolean isEmpty = g13.f44241a.isEmpty();
                                            g13.d();
                                            g12.d();
                                            z11 = !isEmpty;
                                        } else {
                                            throw new IllegalStateException("Rect.bottom is NaN".toString());
                                        }
                                    } else {
                                        throw new IllegalStateException("Rect.right is NaN".toString());
                                    }
                                } else {
                                    throw new IllegalStateException("Rect.top is NaN".toString());
                                }
                            } else {
                                throw new IllegalStateException("Rect.left is NaN".toString());
                            }
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException();
        }
        return z11;
    }

    public final boolean d(r0.L l10, float f6, boolean z10, float f10, Z0.l lVar, Z0.b bVar) {
        boolean z11;
        this.f6744c.setAlpha(f6);
        boolean z12 = !AbstractC3557B.K(this.f6746e, l10);
        if (z12) {
            this.f6746e = l10;
            this.f6749h = true;
        }
        if (!z10 && f10 <= 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f6756o != z11) {
            this.f6756o = z11;
            this.f6749h = true;
        }
        if (this.f6757p != lVar) {
            this.f6757p = lVar;
            this.f6749h = true;
        }
        if (!AbstractC3557B.K(this.f6742a, bVar)) {
            this.f6742a = bVar;
            this.f6749h = true;
        }
        return z12;
    }

    public final void e() {
        if (this.f6749h) {
            this.f6754m = C5251c.f43619b;
            long j6 = this.f6745d;
            this.f6755n = j6;
            this.f6753l = 0.0f;
            this.f6748g = null;
            this.f6749h = false;
            this.f6750i = false;
            boolean z10 = this.f6756o;
            Outline outline = this.f6744c;
            if (z10 && C5254f.d(j6) > 0.0f && C5254f.b(this.f6745d) > 0.0f) {
                this.f6743b = true;
                r0.G c10 = this.f6746e.c(this.f6745d, this.f6757p, this.f6742a);
                this.f6758q = c10;
                if (c10 instanceof C5336C) {
                    C5252d c5252d = ((C5336C) c10).f44168k;
                    float f6 = c5252d.f43625a;
                    float f10 = c5252d.f43626b;
                    this.f6754m = R4.b.r(f6, f10);
                    this.f6755n = AbstractC4828h.i(c5252d.f(), c5252d.c());
                    outline.setRect(AbstractC4344b.Y0(c5252d.f43625a), AbstractC4344b.Y0(f10), AbstractC4344b.Y0(c5252d.f43627c), AbstractC4344b.Y0(c5252d.f43628d));
                    return;
                } else if (c10 instanceof r0.D) {
                    C5253e c5253e = ((r0.D) c10).f44169k;
                    float b10 = AbstractC5249a.b(c5253e.f43633e);
                    float f11 = c5253e.f43629a;
                    float f12 = c5253e.f43630b;
                    this.f6754m = R4.b.r(f11, f12);
                    this.f6755n = AbstractC4828h.i(c5253e.b(), c5253e.a());
                    if (r9.y.H0(c5253e)) {
                        this.f6744c.setRoundRect(AbstractC4344b.Y0(f11), AbstractC4344b.Y0(f12), AbstractC4344b.Y0(c5253e.f43631c), AbstractC4344b.Y0(c5253e.f43632d), b10);
                        this.f6753l = b10;
                        return;
                    }
                    C5344h c5344h = this.f6747f;
                    if (c5344h == null) {
                        c5344h = androidx.compose.ui.graphics.a.g();
                        this.f6747f = c5344h;
                    }
                    c5344h.d();
                    c5344h.a(c5253e);
                    int i10 = Build.VERSION.SDK_INT;
                    Path path = c5344h.f44241a;
                    if (i10 <= 28 && !path.isConvex()) {
                        this.f6743b = false;
                        outline.setEmpty();
                        this.f6750i = true;
                    } else {
                        outline.setConvexPath(path);
                        this.f6750i = true ^ outline.canClip();
                    }
                    this.f6748g = c5344h;
                    return;
                } else {
                    return;
                }
            }
            outline.setEmpty();
        }
    }
}
