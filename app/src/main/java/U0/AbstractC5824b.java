package u0;

import Z0.l;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import r0.AbstractC5352p;
import r0.C5342f;
import r0.C5347k;
import t0.AbstractC5650i;

/* renamed from: u0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5824b {

    /* renamed from: Y  reason: collision with root package name */
    public C5342f f46336Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f46337Z;

    /* renamed from: h0  reason: collision with root package name */
    public C5347k f46338h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f46339i0 = 1.0f;

    /* renamed from: j0  reason: collision with root package name */
    public l f46340j0 = l.f22805Y;

    public boolean b(float f6) {
        return false;
    }

    public boolean e(C5347k c5347k) {
        return false;
    }

    public final void g(AbstractC5650i abstractC5650i, long j6, float f6, C5347k c5347k) {
        if (this.f46339i0 != f6) {
            if (!b(f6)) {
                if (f6 == 1.0f) {
                    C5342f c5342f = this.f46336Y;
                    if (c5342f != null) {
                        c5342f.d(f6);
                    }
                    this.f46337Z = false;
                } else {
                    C5342f c5342f2 = this.f46336Y;
                    if (c5342f2 == null) {
                        c5342f2 = androidx.compose.ui.graphics.a.f();
                        this.f46336Y = c5342f2;
                    }
                    c5342f2.d(f6);
                    this.f46337Z = true;
                }
            }
            this.f46339i0 = f6;
        }
        if (!AbstractC3557B.K(this.f46338h0, c5347k)) {
            if (!e(c5347k)) {
                if (c5347k == null) {
                    C5342f c5342f3 = this.f46336Y;
                    if (c5342f3 != null) {
                        c5342f3.g(null);
                    }
                    this.f46337Z = false;
                } else {
                    C5342f c5342f4 = this.f46336Y;
                    if (c5342f4 == null) {
                        c5342f4 = androidx.compose.ui.graphics.a.f();
                        this.f46336Y = c5342f4;
                    }
                    c5342f4.g(c5347k);
                    this.f46337Z = true;
                }
            }
            this.f46338h0 = c5347k;
        }
        l layoutDirection = abstractC5650i.getLayoutDirection();
        if (this.f46340j0 != layoutDirection) {
            f(layoutDirection);
            this.f46340j0 = layoutDirection;
        }
        float d10 = C5254f.d(abstractC5650i.g()) - C5254f.d(j6);
        float b10 = C5254f.b(abstractC5650i.g()) - C5254f.b(j6);
        abstractC5650i.V().f45609a.b(0.0f, 0.0f, d10, b10);
        if (f6 > 0.0f && C5254f.d(j6) > 0.0f && C5254f.b(j6) > 0.0f) {
            if (this.f46337Z) {
                C5252d K10 = A7.b.K(C5251c.f43619b, AbstractC4828h.i(C5254f.d(j6), C5254f.b(j6)));
                AbstractC5352p a5 = abstractC5650i.V().a();
                C5342f c5342f5 = this.f46336Y;
                if (c5342f5 == null) {
                    c5342f5 = androidx.compose.ui.graphics.a.f();
                    this.f46336Y = c5342f5;
                }
                try {
                    a5.d(K10, c5342f5);
                    i(abstractC5650i);
                } finally {
                    a5.q();
                }
            } else {
                i(abstractC5650i);
            }
        }
        abstractC5650i.V().f45609a.b(-0.0f, -0.0f, -d10, -b10);
    }

    public abstract long h();

    public abstract void i(AbstractC5650i abstractC5650i);

    public void f(l lVar) {
    }
}
