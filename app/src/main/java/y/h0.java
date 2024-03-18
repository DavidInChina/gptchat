package y;

import z.AbstractC6663G;

/* loaded from: classes2.dex */
public final class h0 implements AbstractC6663G {

    /* renamed from: a  reason: collision with root package name */
    public final float f50219a;

    /* renamed from: b  reason: collision with root package name */
    public final float f50220b;

    public h0(float f6, Z0.b bVar) {
        this.f50219a = f6;
        float b10 = bVar.b();
        float f10 = i0.f50223a;
        this.f50220b = b10 * 386.0878f * 160.0f * 0.84f;
    }

    @Override // z.AbstractC6663G
    public float a() {
        return this.f50219a;
    }

    @Override // z.AbstractC6663G
    public float b(float f6, long j6) {
        return f6 * ((float) Math.exp((((float) (j6 / 1000000)) / 1000.0f) * this.f50220b));
    }

    @Override // z.AbstractC6663G
    public float c(float f6, float f10, long j6) {
        float f11 = this.f50220b;
        float f12 = f10 / f11;
        return (f12 * ((float) Math.exp((f11 * ((float) (j6 / 1000000))) / 1000.0f))) + (f6 - f12);
    }

    @Override // z.AbstractC6663G
    public long d(float f6) {
        return ((((float) Math.log(this.f50219a / Math.abs(f6))) * 1000.0f) / this.f50220b) * 1000000;
    }

    @Override // z.AbstractC6663G
    public float e(float f6, float f10) {
        float f11;
        if (Math.abs(f10) <= this.f50219a) {
            return f6;
        }
        double log = Math.log(Math.abs(f11 / f10));
        float f12 = this.f50220b;
        double d10 = f12;
        float f13 = f10 / f12;
        return (f13 * ((float) Math.exp((d10 * ((log / d10) * 1000)) / 1000.0f))) + (f6 - f13);
    }

    public g0 f(float f6) {
        double g10 = g(f6);
        double d10 = i0.f50223a;
        double d11 = d10 - 1.0d;
        return new g0(f6, (float) (Math.exp((d10 / d11) * g10) * this.f50219a * this.f50220b), (long) (Math.exp(g10 / d11) * 1000.0d));
    }

    public double g(float f6) {
        float[] fArr = AbstractC6465c.f50183a;
        return Math.log((Math.abs(f6) * 0.35f) / (this.f50219a * this.f50220b));
    }

    public h0(float f6, float f10) {
        this.f50219a = Math.max(1.0E-7f, Math.abs(f10));
        this.f50220b = Math.max(1.0E-4f, f6) * (-4.2f);
    }
}
