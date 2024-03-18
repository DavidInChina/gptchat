package H0;

import G0.C0571a;
import android.graphics.Canvas;
import android.os.Build;
import b0.C2104h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import nf.AbstractC4828h;
import q0.C5250b;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import r0.C5335B;
import r0.C5342f;
import wf.AbstractC6216a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class N0 implements G0.n0 {

    /* renamed from: Y  reason: collision with root package name */
    public final C0714y f6783Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f6784Z;

    /* renamed from: h0  reason: collision with root package name */
    public AbstractC6216a f6785h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6786i0;

    /* renamed from: j0  reason: collision with root package name */
    public final I0 f6787j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6788k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6789l0;

    /* renamed from: m0  reason: collision with root package name */
    public C5342f f6790m0;

    /* renamed from: n0  reason: collision with root package name */
    public final F0 f6791n0 = new F0(N.f6780i0);

    /* renamed from: o0  reason: collision with root package name */
    public final F4.a f6792o0 = new F4.a(7);

    /* renamed from: p0  reason: collision with root package name */
    public long f6793p0 = r0.P.f44225b;

    /* renamed from: q0  reason: collision with root package name */
    public final AbstractC0707u0 f6794q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6795r0;

    public N0(C0714y c0714y, C0571a c0571a, C6672L c6672l) {
        AbstractC0707u0 abstractC0707u0;
        this.f6783Y = c0714y;
        this.f6784Z = c0571a;
        this.f6785h0 = c6672l;
        this.f6787j0 = new I0(c0714y.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            abstractC0707u0 = new L0();
        } else {
            abstractC0707u0 = new J0(c0714y);
        }
        abstractC0707u0.u();
        abstractC0707u0.k(false);
        this.f6794q0 = abstractC0707u0;
    }

    @Override // G0.n0
    public final void a(C6672L c6672l, C0571a c0571a) {
        l(false);
        this.f6788k0 = false;
        this.f6789l0 = false;
        this.f6793p0 = r0.P.f44225b;
        this.f6784Z = c0571a;
        this.f6785h0 = c6672l;
    }

    @Override // G0.n0
    public final void b(float[] fArr) {
        C5335B.e(fArr, this.f6791n0.b(this.f6794q0));
    }

    @Override // G0.n0
    public final void c(C5250b c5250b, boolean z10) {
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        F0 f02 = this.f6791n0;
        if (z10) {
            float[] a5 = f02.a(abstractC0707u0);
            if (a5 == null) {
                c5250b.f43615a = 0.0f;
                c5250b.f43616b = 0.0f;
                c5250b.f43617c = 0.0f;
                c5250b.f43618d = 0.0f;
                return;
            }
            C5335B.c(a5, c5250b);
            return;
        }
        C5335B.c(f02.b(abstractC0707u0), c5250b);
    }

    @Override // G0.n0
    public final boolean d(long j6) {
        float d10 = C5251c.d(j6);
        float e10 = C5251c.e(j6);
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        if (abstractC0707u0.x()) {
            if (0.0f <= d10 && d10 < abstractC0707u0.getWidth() && 0.0f <= e10 && e10 < abstractC0707u0.getHeight()) {
                return true;
            }
            return false;
        } else if (!abstractC0707u0.D()) {
            return true;
        } else {
            return this.f6787j0.c(j6);
        }
    }

    @Override // G0.n0
    public final void destroy() {
        g1 g1Var;
        Reference poll;
        C2104h c2104h;
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        if (abstractC0707u0.s()) {
            abstractC0707u0.m();
        }
        this.f6784Z = null;
        this.f6785h0 = null;
        this.f6788k0 = true;
        l(false);
        C0714y c0714y = this.f6783Y;
        c0714y.f7074C0 = true;
        if (c0714y.f7080I0 != null) {
            Z0 z02 = c1.f6912w0;
        }
        do {
            g1Var = c0714y.f7122q1;
            poll = g1Var.f6957b.poll();
            c2104h = g1Var.f6956a;
            if (poll != null) {
                c2104h.m(poll);
                continue;
            }
        } while (poll != null);
        c2104h.b(new WeakReference(this, g1Var.f6957b));
    }

    @Override // G0.n0
    public final long e(long j6, boolean z10) {
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        F0 f02 = this.f6791n0;
        if (z10) {
            float[] a5 = f02.a(abstractC0707u0);
            if (a5 != null) {
                return C5335B.b(j6, a5);
            }
            return C5251c.f43620c;
        }
        return C5335B.b(j6, f02.b(abstractC0707u0));
    }

    @Override // G0.n0
    public final void f(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        float a5 = r0.P.a(this.f6793p0);
        float f6 = i10;
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        abstractC0707u0.i(a5 * f6);
        float f10 = i11;
        abstractC0707u0.n(r0.P.b(this.f6793p0) * f10);
        if (abstractC0707u0.l(abstractC0707u0.g(), abstractC0707u0.y(), abstractC0707u0.g() + i10, abstractC0707u0.y() + i11)) {
            long i12 = AbstractC4828h.i(f6, f10);
            I0 i02 = this.f6787j0;
            if (!C5254f.a(i02.f6745d, i12)) {
                i02.f6745d = i12;
                i02.f6749h = true;
            }
            abstractC0707u0.t(i02.b());
            if (!this.f6786i0 && !this.f6788k0) {
                this.f6783Y.invalidate();
                l(true);
            }
            this.f6791n0.c();
        }
    }

    @Override // G0.n0
    public final void g(r0.I i10, Z0.l lVar, Z0.b bVar) {
        boolean z10;
        boolean z11;
        AbstractC6216a abstractC6216a;
        boolean z12;
        int i11 = i10.f44181Y | this.f6795r0;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.f6793p0 = i10.f44194s0;
        }
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        boolean D6 = abstractC0707u0.D();
        I0 i02 = this.f6787j0;
        boolean z13 = false;
        if (D6 && !(!i02.f6750i)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i11 & 1) != 0) {
            abstractC0707u0.z(i10.f44182Z);
        }
        if ((i11 & 2) != 0) {
            abstractC0707u0.o(i10.f44183h0);
        }
        if ((i11 & 4) != 0) {
            abstractC0707u0.w(i10.f44184i0);
        }
        if ((i11 & 8) != 0) {
            abstractC0707u0.B(i10.f44185j0);
        }
        if ((i11 & 16) != 0) {
            abstractC0707u0.j(i10.f44186k0);
        }
        if ((i11 & 32) != 0) {
            abstractC0707u0.p(i10.f44187l0);
        }
        if ((i11 & 64) != 0) {
            abstractC0707u0.A(androidx.compose.ui.graphics.a.s(i10.f44188m0));
        }
        if ((i11 & 128) != 0) {
            abstractC0707u0.G(androidx.compose.ui.graphics.a.s(i10.f44189n0));
        }
        if ((i11 & 1024) != 0) {
            abstractC0707u0.h(i10.f44192q0);
        }
        if ((i11 & 256) != 0) {
            abstractC0707u0.H(i10.f44190o0);
        }
        if ((i11 & 512) != 0) {
            abstractC0707u0.b(i10.f44191p0);
        }
        if ((i11 & 2048) != 0) {
            abstractC0707u0.F(i10.f44193r0);
        }
        if (i12 != 0) {
            abstractC0707u0.i(r0.P.a(this.f6793p0) * abstractC0707u0.getWidth());
            abstractC0707u0.n(r0.P.b(this.f6793p0) * abstractC0707u0.getHeight());
        }
        boolean z14 = i10.f44196u0;
        r0.F f6 = r0.G.f44171a;
        if (z14 && i10.f44195t0 != f6) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i11 & 24576) != 0) {
            abstractC0707u0.E(z11);
            if (i10.f44196u0 && i10.f44195t0 == f6) {
                z12 = true;
            } else {
                z12 = false;
            }
            abstractC0707u0.k(z12);
        }
        if ((131072 & i11) != 0) {
            abstractC0707u0.e();
        }
        if ((32768 & i11) != 0) {
            abstractC0707u0.r(i10.f44197v0);
        }
        boolean d10 = this.f6787j0.d(i10.f44195t0, i10.f44184i0, z11, i10.f44187l0, lVar, bVar);
        if (i02.f6749h) {
            abstractC0707u0.t(i02.b());
        }
        if (z11 && !(!i02.f6750i)) {
            z13 = true;
        }
        C0714y c0714y = this.f6783Y;
        if (z10 == z13 && (!z13 || !d10)) {
            if (Build.VERSION.SDK_INT >= 26) {
                z1.f7152a.a(c0714y);
            } else {
                c0714y.invalidate();
            }
        } else if (!this.f6786i0 && !this.f6788k0) {
            c0714y.invalidate();
            l(true);
        }
        if (!this.f6789l0 && abstractC0707u0.J() > 0.0f && (abstractC6216a = this.f6785h0) != null) {
            abstractC6216a.mo122invoke();
        }
        if ((i11 & 7963) != 0) {
            this.f6791n0.c();
        }
        this.f6795r0 = i10.f44181Y;
    }

    @Override // G0.n0
    public final void h(float[] fArr) {
        float[] a5 = this.f6791n0.a(this.f6794q0);
        if (a5 != null) {
            C5335B.e(fArr, a5);
        }
    }

    @Override // G0.n0
    public final void i(AbstractC5352p abstractC5352p) {
        Canvas a5 = AbstractC5340d.a(abstractC5352p);
        boolean isHardwareAccelerated = a5.isHardwareAccelerated();
        boolean z10 = false;
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        if (isHardwareAccelerated) {
            k();
            if (abstractC0707u0.J() > 0.0f) {
                z10 = true;
            }
            this.f6789l0 = z10;
            if (z10) {
                abstractC5352p.u();
            }
            abstractC0707u0.f(a5);
            if (this.f6789l0) {
                abstractC5352p.i();
                return;
            }
            return;
        }
        float g10 = abstractC0707u0.g();
        float y10 = abstractC0707u0.y();
        float C10 = abstractC0707u0.C();
        float d10 = abstractC0707u0.d();
        if (abstractC0707u0.a() < 1.0f) {
            C5342f c5342f = this.f6790m0;
            if (c5342f == null) {
                c5342f = androidx.compose.ui.graphics.a.f();
                this.f6790m0 = c5342f;
            }
            c5342f.d(abstractC0707u0.a());
            a5.saveLayer(g10, y10, C10, d10, c5342f.f44235a);
        } else {
            abstractC5352p.h();
        }
        abstractC5352p.p(g10, y10);
        abstractC5352p.l(this.f6791n0.b(abstractC0707u0));
        if (abstractC0707u0.D() || abstractC0707u0.x()) {
            this.f6787j0.a(abstractC5352p);
        }
        wf.k kVar = this.f6784Z;
        if (kVar != null) {
            kVar.invoke(abstractC5352p);
        }
        abstractC5352p.q();
        l(false);
    }

    @Override // G0.n0
    public final void invalidate() {
        if (!this.f6786i0 && !this.f6788k0) {
            this.f6783Y.invalidate();
            l(true);
        }
    }

    @Override // G0.n0
    public final void j(long j6) {
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        int g10 = abstractC0707u0.g();
        int y10 = abstractC0707u0.y();
        int i10 = Z0.i.f22798c;
        int i11 = (int) (j6 >> 32);
        int i12 = (int) (j6 & 4294967295L);
        if (g10 != i11 || y10 != i12) {
            if (g10 != i11) {
                abstractC0707u0.c(i11 - g10);
            }
            if (y10 != i12) {
                abstractC0707u0.q(i12 - y10);
            }
            int i13 = Build.VERSION.SDK_INT;
            C0714y c0714y = this.f6783Y;
            if (i13 >= 26) {
                z1.f7152a.a(c0714y);
            } else {
                c0714y.invalidate();
            }
            this.f6791n0.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // G0.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        r0.E e10;
        wf.k kVar;
        boolean z10 = this.f6786i0;
        AbstractC0707u0 abstractC0707u0 = this.f6794q0;
        if (z10 || !abstractC0707u0.s()) {
            if (abstractC0707u0.D()) {
                I0 i02 = this.f6787j0;
                if (!(!i02.f6750i)) {
                    i02.e();
                    e10 = i02.f6748g;
                    kVar = this.f6784Z;
                    if (kVar != null) {
                        abstractC0707u0.v(this.f6792o0, e10, kVar);
                    }
                    l(false);
                }
            }
            e10 = null;
            kVar = this.f6784Z;
            if (kVar != null) {
            }
            l(false);
        }
    }

    public final void l(boolean z10) {
        if (z10 != this.f6786i0) {
            this.f6786i0 = z10;
            this.f6783Y.q(this, z10);
        }
    }
}
