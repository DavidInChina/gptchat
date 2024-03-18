package r0;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class I implements x {

    /* renamed from: Y  reason: collision with root package name */
    public int f44181Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f44182Z;

    /* renamed from: h0  reason: collision with root package name */
    public float f44183h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f44184i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f44185j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f44186k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f44187l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f44188m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f44189n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f44190o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f44191p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f44192q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f44193r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f44194s0;

    /* renamed from: t0  reason: collision with root package name */
    public L f44195t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f44196u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f44197v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f44198w0;

    /* renamed from: x0  reason: collision with root package name */
    public Z0.b f44199x0;

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return q(K(f6));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f44199x0.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    public final void a(float f6) {
        if (this.f44184i0 != f6) {
            this.f44181Y |= 4;
            this.f44184i0 = f6;
        }
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f44199x0.b();
    }

    public final void c(long j6) {
        if (!r.c(this.f44188m0, j6)) {
            this.f44181Y |= 64;
            this.f44188m0 = j6;
        }
    }

    public final void d(float f6) {
        if (this.f44192q0 != f6) {
            this.f44181Y |= 1024;
            this.f44192q0 = f6;
        }
    }

    public final void e(float f6) {
        if (this.f44182Z != f6) {
            this.f44181Y |= 1;
            this.f44182Z = f6;
        }
    }

    public final void f(float f6) {
        if (this.f44183h0 != f6) {
            this.f44181Y |= 2;
            this.f44183h0 = f6;
        }
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    public final void h(float f6) {
        if (this.f44187l0 != f6) {
            this.f44181Y |= 32;
            this.f44187l0 = f6;
        }
    }

    public final void i(L l10) {
        if (!AbstractC3557B.K(this.f44195t0, l10)) {
            this.f44181Y |= 8192;
            this.f44195t0 = l10;
        }
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    public final void j(long j6) {
        if (!r.c(this.f44189n0, j6)) {
            this.f44181Y |= 128;
            this.f44189n0 = j6;
        }
    }

    public final void l(long j6) {
        long j10 = this.f44194s0;
        int i10 = P.f44226c;
        if (j10 != j6) {
            this.f44181Y |= 4096;
            this.f44194s0 = j6;
        }
    }

    public final void m(float f6) {
        if (this.f44185j0 != f6) {
            this.f44181Y |= 8;
            this.f44185j0 = f6;
        }
    }

    public final void o(float f6) {
        if (this.f44186k0 != f6) {
            this.f44181Y |= 16;
            this.f44186k0 = f6;
        }
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    public final /* synthetic */ long q(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }
}
