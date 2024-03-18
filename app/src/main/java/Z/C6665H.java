package z;

/* renamed from: z.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6665H implements AbstractC6661F {

    /* renamed from: a  reason: collision with root package name */
    public final float f51146a;

    /* renamed from: b  reason: collision with root package name */
    public final C6695e0 f51147b;

    /* JADX WARN: Type inference failed for: r7v1, types: [z.e0, java.lang.Object] */
    public C6665H(float f6, float f10, float f11) {
        this.f51146a = f11;
        ?? obj = new Object();
        obj.f51240a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.f51241b = sqrt;
        obj.f51246g = 1.0f;
        if (f6 >= 0.0f) {
            obj.f51246g = f6;
            obj.f51242c = false;
            if (((float) (sqrt * sqrt)) > 0.0f) {
                obj.f51241b = Math.sqrt(f10);
                obj.f51242c = false;
                this.f51147b = obj;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6654B0 mo121a(C6737z0 c6737z0) {
        return new C6658D0(this);
    }

    @Override // z.AbstractC6661F
    public final float b(long j6, float f6, float f10, float f11) {
        C6695e0 c6695e0 = this.f51147b;
        c6695e0.f51240a = f10;
        return Float.intBitsToFloat((int) (c6695e0.a(f6, f11, j6 / 1000000) & 4294967295L));
    }

    @Override // z.AbstractC6661F
    public final long c(float f6, float f10, float f11) {
        double d10;
        C6730w c6730w;
        C6730w c6730w2;
        C6730w c6730w3;
        long j6;
        double d11;
        boolean z10;
        boolean z11;
        double d12;
        boolean z12;
        boolean z13;
        double d13;
        double d14;
        double d15;
        boolean z14;
        C6695e0 c6695e0 = this.f51147b;
        double d16 = c6695e0.f51241b;
        float f12 = c6695e0.f51246g;
        float f13 = this.f51146a;
        double d17 = (float) (d16 * d16);
        double d18 = f12;
        double d19 = f11 / f13;
        double d20 = (f6 - f10) / f13;
        double d21 = 1.0f;
        double sqrt = d18 * 2.0d * Math.sqrt(d17);
        double d22 = (sqrt * sqrt) - (d17 * 4.0d);
        double d23 = -sqrt;
        int i10 = (d22 > 0.0d ? 1 : (d22 == 0.0d ? 0 : -1));
        if (i10 < 0) {
            d10 = d21;
            c6730w = new C6730w(0.0d, Math.sqrt(Math.abs(d22)));
        } else {
            d10 = d21;
            c6730w = new C6730w(Math.sqrt(d22), 0.0d);
        }
        c6730w.f51396a = (c6730w.f51396a + d23) * 0.5d;
        c6730w.f51397b *= 0.5d;
        if (i10 < 0) {
            c6730w2 = c6730w;
            c6730w3 = new C6730w(0.0d, Math.sqrt(Math.abs(d22)));
        } else {
            c6730w2 = c6730w;
            c6730w3 = new C6730w(Math.sqrt(d22), 0.0d);
        }
        double d24 = -1;
        c6730w3.f51396a = ((c6730w3.f51396a * d24) + d23) * 0.5d;
        c6730w3.f51397b = c6730w3.f51397b * d24 * 0.5d;
        int i11 = (d20 > 0.0d ? 1 : (d20 == 0.0d ? 0 : -1));
        if (i11 == 0 && d19 == 0.0d) {
            j6 = 0;
        } else {
            if (i11 < 0) {
                d19 = -d19;
            }
            double abs = Math.abs(d20);
            int i12 = 0;
            if (d18 > 1.0d) {
                double d25 = c6730w2.f51396a;
                double d26 = c6730w3.f51396a;
                double d27 = (d25 * abs) - d19;
                double d28 = d25 - d26;
                double d29 = d27 / d28;
                double d30 = abs - d29;
                d11 = Math.log(Math.abs(d10 / d30)) / d25;
                double log = Math.log(Math.abs(d10 / d29)) / d26;
                if (!Double.isInfinite(d11) && !Double.isNaN(d11)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    d11 = log;
                } else {
                    if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!(!z14)) {
                        d11 = Math.max(d11, log);
                    }
                }
                double d31 = d30 * d25;
                double log2 = Math.log(d31 / ((-d29) * d26)) / (d26 - d25);
                if (!Double.isNaN(log2) && log2 > 0.0d) {
                    if (log2 > 0.0d) {
                        if ((-((Math.exp(log2 * d26) * d29) + (Math.exp(d25 * log2) * d30))) < d10) {
                            if (d29 > 0.0d && d30 < 0.0d) {
                                d15 = d10;
                                d14 = 0.0d;
                            } else {
                                d14 = d11;
                                d15 = d10;
                            }
                            d13 = -d15;
                            d11 = d14;
                        }
                    }
                    d13 = d10;
                    d11 = Math.log((-((d29 * d26) * d26)) / (d31 * d25)) / d28;
                } else {
                    d13 = -d10;
                }
                double d32 = d29 * d26;
                if (Math.abs((Math.exp(d26 * d11) * d32) + (Math.exp(d25 * d11) * d31)) >= 1.0E-4d) {
                    double d33 = Double.MAX_VALUE;
                    for (double d34 = 0.001d; d33 > d34 && i12 < 100; d34 = 0.001d) {
                        i12++;
                        double d35 = d25 * d11;
                        double d36 = d26 * d11;
                        double exp = d11 - ((((Math.exp(d36) * d29) + (Math.exp(d35) * d30)) + d13) / ((Math.exp(d36) * d32) + (Math.exp(d35) * d31)));
                        d33 = Math.abs(d11 - exp);
                        d11 = exp;
                    }
                }
            } else {
                C6730w c6730w4 = c6730w2;
                double d37 = d10;
                if (d18 < 1.0d) {
                    double d38 = c6730w4.f51396a;
                    double d39 = (d19 - (d38 * abs)) / c6730w4.f51397b;
                    d11 = Math.log(d37 / Math.sqrt((d39 * d39) + (abs * abs))) / d38;
                } else {
                    double d40 = c6730w4.f51396a;
                    double d41 = d40 * abs;
                    double d42 = d19 - d41;
                    double log3 = Math.log(Math.abs(d37 / abs)) / d40;
                    double log4 = Math.log(Math.abs(d37 / d42));
                    double d43 = log4;
                    for (int i13 = 0; i13 < 6; i13++) {
                        d43 = log4 - Math.log(Math.abs(d43 / d40));
                    }
                    double d44 = d43 / d40;
                    if (!Double.isInfinite(log3) && !Double.isNaN(log3)) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                    if (!z10) {
                        log3 = d44;
                    } else {
                        if (!Double.isInfinite(d44) && !Double.isNaN(d44)) {
                            z12 = z11;
                        } else {
                            z12 = false;
                        }
                        if (!(!z12)) {
                            log3 = Math.max(log3, d44);
                        }
                    }
                    double d45 = (-(d41 + d42)) / (d40 * d42);
                    double d46 = d40 * d45;
                    double d47 = log3;
                    double exp2 = (Math.exp(d46) * d42 * d45) + (Math.exp(d46) * abs);
                    if (!Double.isNaN(d45) && d45 > 0.0d) {
                        if (d45 > 0.0d && (-exp2) < d37) {
                            if (d42 < 0.0d && abs > 0.0d) {
                                d12 = 0.0d;
                            } else {
                                d12 = d47;
                            }
                            d37 = -d37;
                        } else {
                            d12 = (-(2.0d / d40)) - (abs / d42);
                        }
                    } else {
                        d37 = -d37;
                        d12 = d47;
                    }
                    double d48 = Double.MAX_VALUE;
                    for (double d49 = 0.001d; d48 > d49 && i12 < 100; d49 = 0.001d) {
                        i12++;
                        double d50 = d40 * d12;
                        double exp3 = d12 - (((Math.exp(d50) * ((d42 * d12) + abs)) + d37) / (Math.exp(d50) * (((d50 + 1) * d42) + d41)));
                        d48 = Math.abs(d12 - exp3);
                        d12 = exp3;
                    }
                    d11 = d12;
                }
            }
            j6 = (long) (d11 * 1000.0d);
        }
        return j6 * 1000000;
    }

    @Override // z.AbstractC6661F
    public final float d(float f6, float f10, float f11) {
        return 0.0f;
    }

    @Override // z.AbstractC6661F
    public final float e(long j6, float f6, float f10, float f11) {
        C6695e0 c6695e0 = this.f51147b;
        c6695e0.f51240a = f10;
        return Float.intBitsToFloat((int) (c6695e0.a(f6, f11, j6 / 1000000) >> 32));
    }
}
