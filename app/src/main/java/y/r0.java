package y;

import z.AbstractC6663G;

/* loaded from: classes2.dex */
public final class r0 implements AbstractC6663G {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f50281a;

    public r0(Z0.b bVar) {
        this.f50281a = new h0(s0.f50282a, bVar);
    }

    @Override // z.AbstractC6663G
    public final float a() {
        return 0.0f;
    }

    @Override // z.AbstractC6663G
    public final float b(float f6, long j6) {
        float f10;
        long j10 = j6 / 1000000;
        g0 f11 = this.f50281a.f(f6);
        long j11 = f11.f50217c;
        if (j11 > 0) {
            f10 = ((float) j10) / ((float) j11);
        } else {
            f10 = 1.0f;
        }
        return (((Math.signum(f11.f50215a) * AbstractC6465c.a(f10).f50180b) * f11.f50216b) / ((float) j11)) * 1000.0f;
    }

    @Override // z.AbstractC6663G
    public final float c(float f6, float f10, long j6) {
        float f11;
        long j10 = j6 / 1000000;
        g0 f12 = this.f50281a.f(f10);
        long j11 = f12.f50217c;
        if (j11 > 0) {
            f11 = ((float) j10) / ((float) j11);
        } else {
            f11 = 1.0f;
        }
        return (Math.signum(f12.f50215a) * f12.f50216b * AbstractC6465c.a(f11).f50179a) + f6;
    }

    @Override // z.AbstractC6663G
    public final long d(float f6) {
        return ((long) (Math.exp(this.f50281a.g(f6) / (i0.f50223a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // z.AbstractC6663G
    public final float e(float f6, float f10) {
        h0 h0Var;
        double g10 = this.f50281a.g(f10);
        double d10 = i0.f50223a;
        return (Math.signum(f10) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * g10) * h0Var.f50219a * h0Var.f50220b))) + f6;
    }
}
