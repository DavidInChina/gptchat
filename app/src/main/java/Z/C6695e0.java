package z;

/* renamed from: z.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6695e0 {

    /* renamed from: a  reason: collision with root package name */
    public float f51240a;

    /* renamed from: b  reason: collision with root package name */
    public double f51241b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f51242c;

    /* renamed from: d  reason: collision with root package name */
    public double f51243d;

    /* renamed from: e  reason: collision with root package name */
    public double f51244e;

    /* renamed from: f  reason: collision with root package name */
    public double f51245f;

    /* renamed from: g  reason: collision with root package name */
    public float f51246g;

    public final long a(float f6, float f10, long j6) {
        double d10;
        double d11;
        float f11;
        if (!this.f51242c) {
            if (this.f51240a != Float.MAX_VALUE) {
                float f12 = this.f51246g;
                double d12 = f12;
                double d13 = d12 * d12;
                if (f12 > 1.0f) {
                    double d14 = this.f51241b;
                    double d15 = d13 - 1;
                    this.f51243d = (Math.sqrt(d15) * d14) + ((-f12) * d14);
                    double d16 = this.f51241b;
                    this.f51244e = ((-this.f51246g) * d16) - (Math.sqrt(d15) * d16);
                } else if (f12 >= 0.0f && f12 < 1.0f) {
                    this.f51245f = Math.sqrt(1 - d13) * this.f51241b;
                }
                this.f51242c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f13 = f6 - this.f51240a;
        double d17 = j6 / 1000.0d;
        float f14 = this.f51246g;
        if (f14 > 1.0f) {
            double d18 = f13;
            double d19 = this.f51244e;
            double d20 = f10;
            double d21 = this.f51243d;
            double d22 = d18 - (((d19 * d18) - d20) / (d19 - d21));
            double d23 = ((d18 * d19) - d20) / (d19 - d21);
            d10 = (Math.exp(this.f51243d * d17) * d23) + (Math.exp(d19 * d17) * d22);
            double d24 = this.f51244e;
            double exp = Math.exp(d24 * d17) * d22 * d24;
            double d25 = this.f51243d;
            d11 = (Math.exp(d25 * d17) * d23 * d25) + exp;
        } else if (f14 == 1.0f) {
            double d26 = this.f51241b;
            double d27 = f13;
            double d28 = (d26 * d27) + f10;
            double d29 = (d28 * d17) + d27;
            d10 = Math.exp((-d26) * d17) * d29;
            double exp2 = Math.exp((-this.f51241b) * d17) * d29;
            double d30 = this.f51241b;
            d11 = (Math.exp((-d30) * d17) * d28) + (exp2 * (-d30));
        } else {
            double d31 = 1 / this.f51245f;
            double d32 = this.f51241b;
            double d33 = f13;
            double d34 = ((f14 * d32 * d33) + f10) * d31;
            double exp3 = Math.exp((-f14) * d32 * d17) * ((Math.sin(this.f51245f * d17) * d34) + (Math.cos(this.f51245f * d17) * d33));
            double d35 = this.f51241b;
            double d36 = (-d35) * exp3 * this.f51246g;
            double exp4 = Math.exp((-f11) * d35 * d17);
            double d37 = this.f51245f;
            double sin = Math.sin(d37 * d17) * (-d37) * d33;
            double d38 = this.f51245f;
            d11 = (((Math.cos(d38 * d17) * d34 * d38) + sin) * exp4) + d36;
            d10 = exp3;
        }
        return (Float.floatToRawIntBits((float) d11) & 4294967295L) | (Float.floatToRawIntBits((float) (d10 + this.f51240a)) << 32);
    }
}
