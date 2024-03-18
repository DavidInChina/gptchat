package s0;

import id.AbstractC3557B;
import java.util.Arrays;
import p0.C5035b;

/* renamed from: s0.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5515q extends AbstractC5502d {

    /* renamed from: r  reason: collision with root package name */
    public static final A9.a f45074r = new A9.a(4);

    /* renamed from: d  reason: collision with root package name */
    public final C5517s f45075d;

    /* renamed from: e  reason: collision with root package name */
    public final float f45076e;

    /* renamed from: f  reason: collision with root package name */
    public final float f45077f;

    /* renamed from: g  reason: collision with root package name */
    public final C5516r f45078g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f45079h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f45080i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f45081j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC5507i f45082k;

    /* renamed from: l  reason: collision with root package name */
    public final C5514p f45083l;

    /* renamed from: m  reason: collision with root package name */
    public final C5511m f45084m;

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC5507i f45085n;

    /* renamed from: o  reason: collision with root package name */
    public final C5514p f45086o;

    /* renamed from: p  reason: collision with root package name */
    public final C5511m f45087p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f45088q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5515q(String str, float[] fArr, C5517s c5517s, final double d10, float f6, float f10, int i10) {
        this(str, fArr, c5517s, null, r0 == 0 ? r3 : new AbstractC5507i() { // from class: s0.n
            @Override // s0.AbstractC5507i
            public final double c(double d11) {
                int i11 = r1;
                double d12 = d10;
                switch (i11) {
                    case 0:
                        if (d11 < 0.0d) {
                            d11 = 0.0d;
                        }
                        return Math.pow(d11, 1.0d / d12);
                    default:
                        if (d11 < 0.0d) {
                            d11 = 0.0d;
                        }
                        return Math.pow(d11, d12);
                }
            }
        }, r0 != 0 ? new AbstractC5507i() { // from class: s0.n
            @Override // s0.AbstractC5507i
            public final double c(double d11) {
                int i11 = r1;
                double d12 = d10;
                switch (i11) {
                    case 0:
                        if (d11 < 0.0d) {
                            d11 = 0.0d;
                        }
                        return Math.pow(d11, 1.0d / d12);
                    default:
                        if (d11 < 0.0d) {
                            d11 = 0.0d;
                        }
                        return Math.pow(d11, d12);
                }
            }
        } : r3, f6, f10, new C5516r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
        int i11 = (d10 > 1.0d ? 1 : (d10 == 1.0d ? 0 : -1));
        AbstractC5507i abstractC5507i = f45074r;
    }

    @Override // s0.AbstractC5502d
    public final float a(int i10) {
        return this.f45077f;
    }

    @Override // s0.AbstractC5502d
    public final float b(int i10) {
        return this.f45076e;
    }

    @Override // s0.AbstractC5502d
    public final boolean c() {
        return this.f45088q;
    }

    @Override // s0.AbstractC5502d
    public final long d(float f6, float f10, float f11) {
        double d10 = f6;
        C5511m c5511m = this.f45087p;
        float c10 = (float) c5511m.c(d10);
        float c11 = (float) c5511m.c(f10);
        float c12 = (float) c5511m.c(f11);
        float[] fArr = this.f45080i;
        return (Float.floatToRawIntBits(kotlin.jvm.internal.m.B(fArr, c10, c11, c12)) << 32) | (Float.floatToRawIntBits(kotlin.jvm.internal.m.C(fArr, c10, c11, c12)) & 4294967295L);
    }

    @Override // s0.AbstractC5502d
    public final float e(float f6, float f10, float f11) {
        double d10 = f6;
        C5511m c5511m = this.f45087p;
        return kotlin.jvm.internal.m.D(this.f45080i, (float) c5511m.c(d10), (float) c5511m.c(f10), (float) c5511m.c(f11));
    }

    @Override // s0.AbstractC5502d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5515q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C5515q c5515q = (C5515q) obj;
        if (Float.compare(c5515q.f45076e, this.f45076e) != 0 || Float.compare(c5515q.f45077f, this.f45077f) != 0 || !AbstractC3557B.K(this.f45075d, c5515q.f45075d) || !Arrays.equals(this.f45079h, c5515q.f45079h)) {
            return false;
        }
        C5516r c5516r = c5515q.f45078g;
        C5516r c5516r2 = this.f45078g;
        if (c5516r2 != null) {
            return AbstractC3557B.K(c5516r2, c5516r);
        }
        if (c5516r == null) {
            return true;
        }
        if (!AbstractC3557B.K(this.f45082k, c5515q.f45082k)) {
            return false;
        }
        return AbstractC3557B.K(this.f45085n, c5515q.f45085n);
    }

    @Override // s0.AbstractC5502d
    public final long f(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d) {
        float[] fArr = this.f45081j;
        float B10 = kotlin.jvm.internal.m.B(fArr, f6, f10, f11);
        float C10 = kotlin.jvm.internal.m.C(fArr, f6, f10, f11);
        float D6 = kotlin.jvm.internal.m.D(fArr, f6, f10, f11);
        C5511m c5511m = this.f45084m;
        return androidx.compose.ui.graphics.a.a((float) c5511m.c(B10), (float) c5511m.c(C10), (float) c5511m.c(D6), f12, abstractC5502d);
    }

    @Override // s0.AbstractC5502d
    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (Arrays.hashCode(this.f45079h) + ((this.f45075d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f45076e;
        int i12 = 0;
        if (f6 == 0.0f) {
            i10 = 0;
        } else {
            i10 = Float.floatToIntBits(f6);
        }
        int i13 = (hashCode + i10) * 31;
        float f10 = this.f45077f;
        if (f10 == 0.0f) {
            i11 = 0;
        } else {
            i11 = Float.floatToIntBits(f10);
        }
        int i14 = (i13 + i11) * 31;
        C5516r c5516r = this.f45078g;
        if (c5516r != null) {
            i12 = c5516r.hashCode();
        }
        int i15 = i14 + i12;
        if (c5516r == null) {
            return this.f45085n.hashCode() + ((this.f45082k.hashCode() + (i15 * 31)) * 31);
        }
        return i15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5515q(String str, float[] fArr, C5517s c5517s, final C5516r c5516r, int i10) {
        this(str, fArr, c5517s, null, r6, r0, 0.0f, 1.0f, c5516r, i10);
        AbstractC5507i abstractC5507i;
        int i11 = (c5516r.f45094f > 0.0d ? 1 : (c5516r.f45094f == 0.0d ? 0 : -1));
        double d10 = c5516r.f45095g;
        AbstractC5507i abstractC5507i2 = (i11 == 0 && d10 == 0.0d) ? new AbstractC5507i() { // from class: s0.o
            @Override // s0.AbstractC5507i
            public final double c(double d11) {
                int i12 = r2;
                C5516r c5516r2 = c5516r;
                switch (i12) {
                    case 0:
                        double d12 = c5516r2.f45090b;
                        double d13 = c5516r2.f45093e;
                        double d14 = c5516r2.f45092d;
                        if (d11 >= d13 * d14) {
                            return (Math.pow(d11, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d12;
                        }
                        return d11 / d14;
                    case 1:
                        double d15 = c5516r2.f45090b;
                        double d16 = c5516r2.f45093e;
                        double d17 = c5516r2.f45092d;
                        if (d11 >= d16 * d17) {
                            return (Math.pow(d11 - c5516r2.f45094f, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d15;
                        }
                        return (d11 - c5516r2.f45095g) / d17;
                    case 2:
                        double d18 = c5516r2.f45090b;
                        if (d11 >= c5516r2.f45093e) {
                            return Math.pow((d18 * d11) + c5516r2.f45091c, c5516r2.f45089a);
                        }
                        return d11 * c5516r2.f45092d;
                    default:
                        double d19 = c5516r2.f45090b;
                        if (d11 >= c5516r2.f45093e) {
                            return Math.pow((d19 * d11) + c5516r2.f45091c, c5516r2.f45089a) + c5516r2.f45094f;
                        }
                        return c5516r2.f45095g + (c5516r2.f45092d * d11);
                }
            }
        } : new AbstractC5507i() { // from class: s0.o
            @Override // s0.AbstractC5507i
            public final double c(double d11) {
                int i12 = r2;
                C5516r c5516r2 = c5516r;
                switch (i12) {
                    case 0:
                        double d12 = c5516r2.f45090b;
                        double d13 = c5516r2.f45093e;
                        double d14 = c5516r2.f45092d;
                        if (d11 >= d13 * d14) {
                            return (Math.pow(d11, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d12;
                        }
                        return d11 / d14;
                    case 1:
                        double d15 = c5516r2.f45090b;
                        double d16 = c5516r2.f45093e;
                        double d17 = c5516r2.f45092d;
                        if (d11 >= d16 * d17) {
                            return (Math.pow(d11 - c5516r2.f45094f, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d15;
                        }
                        return (d11 - c5516r2.f45095g) / d17;
                    case 2:
                        double d18 = c5516r2.f45090b;
                        if (d11 >= c5516r2.f45093e) {
                            return Math.pow((d18 * d11) + c5516r2.f45091c, c5516r2.f45089a);
                        }
                        return d11 * c5516r2.f45092d;
                    default:
                        double d19 = c5516r2.f45090b;
                        if (d11 >= c5516r2.f45093e) {
                            return Math.pow((d19 * d11) + c5516r2.f45091c, c5516r2.f45089a) + c5516r2.f45094f;
                        }
                        return c5516r2.f45095g + (c5516r2.f45092d * d11);
                }
            }
        };
        if (i11 == 0 && d10 == 0.0d) {
            abstractC5507i = new AbstractC5507i() { // from class: s0.o
                @Override // s0.AbstractC5507i
                public final double c(double d11) {
                    int i12 = r2;
                    C5516r c5516r2 = c5516r;
                    switch (i12) {
                        case 0:
                            double d12 = c5516r2.f45090b;
                            double d13 = c5516r2.f45093e;
                            double d14 = c5516r2.f45092d;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d12;
                            }
                            return d11 / d14;
                        case 1:
                            double d15 = c5516r2.f45090b;
                            double d16 = c5516r2.f45093e;
                            double d17 = c5516r2.f45092d;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - c5516r2.f45094f, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d15;
                            }
                            return (d11 - c5516r2.f45095g) / d17;
                        case 2:
                            double d18 = c5516r2.f45090b;
                            if (d11 >= c5516r2.f45093e) {
                                return Math.pow((d18 * d11) + c5516r2.f45091c, c5516r2.f45089a);
                            }
                            return d11 * c5516r2.f45092d;
                        default:
                            double d19 = c5516r2.f45090b;
                            if (d11 >= c5516r2.f45093e) {
                                return Math.pow((d19 * d11) + c5516r2.f45091c, c5516r2.f45089a) + c5516r2.f45094f;
                            }
                            return c5516r2.f45095g + (c5516r2.f45092d * d11);
                    }
                }
            };
        } else {
            abstractC5507i = new AbstractC5507i() { // from class: s0.o
                @Override // s0.AbstractC5507i
                public final double c(double d11) {
                    int i12 = r2;
                    C5516r c5516r2 = c5516r;
                    switch (i12) {
                        case 0:
                            double d12 = c5516r2.f45090b;
                            double d13 = c5516r2.f45093e;
                            double d14 = c5516r2.f45092d;
                            if (d11 >= d13 * d14) {
                                return (Math.pow(d11, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d12;
                            }
                            return d11 / d14;
                        case 1:
                            double d15 = c5516r2.f45090b;
                            double d16 = c5516r2.f45093e;
                            double d17 = c5516r2.f45092d;
                            if (d11 >= d16 * d17) {
                                return (Math.pow(d11 - c5516r2.f45094f, 1.0d / c5516r2.f45089a) - c5516r2.f45091c) / d15;
                            }
                            return (d11 - c5516r2.f45095g) / d17;
                        case 2:
                            double d18 = c5516r2.f45090b;
                            if (d11 >= c5516r2.f45093e) {
                                return Math.pow((d18 * d11) + c5516r2.f45091c, c5516r2.f45089a);
                            }
                            return d11 * c5516r2.f45092d;
                        default:
                            double d19 = c5516r2.f45090b;
                            if (d11 >= c5516r2.f45093e) {
                                return Math.pow((d19 * d11) + c5516r2.f45091c, c5516r2.f45089a) + c5516r2.f45094f;
                            }
                            return c5516r2.f45095g + (c5516r2.f45092d * d11);
                    }
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0226, code lost:
        if (p0.C5035b.b(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0235  */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5515q(String str, float[] fArr, C5517s c5517s, float[] fArr2, AbstractC5507i abstractC5507i, AbstractC5507i abstractC5507i2, float f6, float f10, C5516r c5516r, int i10) {
        super(str, AbstractC5501c.f45018a, i10);
        boolean z10;
        boolean z11;
        this.f45075d = c5517s;
        this.f45076e = f6;
        this.f45077f = f10;
        this.f45078g = c5516r;
        this.f45082k = abstractC5507i;
        this.f45083l = new C5514p(this, 1);
        this.f45084m = new C5511m(this, 0);
        this.f45085n = abstractC5507i2;
        this.f45086o = new C5514p(this, 0);
        this.f45087p = new C5511m(this, 1);
        if (fArr.length == 6 || fArr.length == 9) {
            if (f6 < f10) {
                float[] fArr3 = new float[6];
                if (fArr.length == 9) {
                    float f11 = fArr[0];
                    float f12 = fArr[1];
                    float f13 = f11 + f12 + fArr[2];
                    fArr3[0] = f11 / f13;
                    fArr3[1] = f12 / f13;
                    float f14 = fArr[3];
                    float f15 = fArr[4];
                    float f16 = f14 + f15 + fArr[5];
                    fArr3[2] = f14 / f16;
                    fArr3[3] = f15 / f16;
                    float f17 = fArr[6];
                    float f18 = fArr[7];
                    float f19 = f17 + f18 + fArr[8];
                    fArr3[4] = f17 / f19;
                    fArr3[5] = f18 / f19;
                } else {
                    System.arraycopy(fArr, 0, fArr3, 0, 6);
                }
                this.f45079h = fArr3;
                if (fArr2 == null) {
                    float f20 = fArr3[0];
                    float f21 = fArr3[1];
                    float f22 = fArr3[2];
                    float f23 = fArr3[3];
                    float f24 = fArr3[4];
                    float f25 = fArr3[5];
                    float f26 = 1;
                    float f27 = (f26 - f20) / f21;
                    float f28 = c5517s.f45096a;
                    float f29 = c5517s.f45097b;
                    float f30 = f20 / f21;
                    float f31 = (f22 / f23) - f30;
                    float f32 = (f28 / f29) - f30;
                    float f33 = ((f26 - f22) / f23) - f27;
                    float f34 = (f24 / f25) - f30;
                    float f35 = (((((f26 - f28) / f29) - f27) * f31) - (f32 * f33)) / (((((f26 - f24) / f25) - f27) * f31) - (f33 * f34));
                    float f36 = (f32 - (f34 * f35)) / f31;
                    float f37 = (1.0f - f36) - f35;
                    float f38 = f37 / f21;
                    float f39 = f36 / f23;
                    float f40 = f35 / f25;
                    this.f45080i = new float[]{f38 * f20, f37, ((1.0f - f20) - f21) * f38, f39 * f22, f36, ((1.0f - f22) - f23) * f39, f40 * f24, f35, ((1.0f - f24) - f25) * f40};
                } else if (fArr2.length == 9) {
                    this.f45080i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
                this.f45081j = kotlin.jvm.internal.m.x(this.f45080i);
                float a5 = C5035b.a(fArr3);
                float[] fArr4 = C5503e.f45026a;
                if (a5 / C5035b.a(C5503e.f45027b) > 0.9f) {
                    float[] fArr5 = C5503e.f45026a;
                    float f41 = fArr3[0];
                    float f42 = fArr5[0];
                    float f43 = fArr3[1];
                    float f44 = fArr5[1];
                    float f45 = fArr3[2] - fArr5[2];
                    float f46 = fArr3[3] - fArr5[3];
                    float f47 = fArr3[4];
                    float f48 = fArr5[4];
                    float f49 = fArr3[5];
                    float f50 = fArr5[5];
                    float[] fArr6 = {f41 - f42, f43 - f44, f45, f46, f47 - f48, f49 - f50};
                    if (C5035b.b(fArr6[0], fArr6[1], f42 - f48, f44 - f50) >= 0.0f) {
                        if (C5035b.b(fArr5[0] - fArr5[2], fArr5[1] - fArr5[3], fArr6[0], fArr6[1]) >= 0.0f && C5035b.b(fArr6[2], fArr6[3], fArr5[2] - fArr5[0], fArr5[3] - fArr5[1]) >= 0.0f && C5035b.b(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f && C5035b.b(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        int i11 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                        if (i10 != 0) {
                            z11 = true;
                        } else {
                            float[] fArr7 = C5503e.f45026a;
                            if (fArr3 != fArr7) {
                                for (int i12 = z10; i12 < 6; i12++) {
                                    if (Float.compare(fArr3[i12], fArr7[i12]) != 0 && Math.abs(fArr3[i12] - fArr7[i12]) > 0.001f) {
                                        break;
                                    }
                                }
                            }
                            if (kotlin.jvm.internal.m.s(c5517s, AbstractC5508j.f45060d) && f6 == 0.0f && f10 == 1.0f) {
                                float[] fArr8 = C5503e.f45026a;
                                C5515q c5515q = C5503e.f45028c;
                                for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                                    if (Math.abs(abstractC5507i.c(d10) - c5515q.f45082k.c(d10)) <= 0.001d && Math.abs(abstractC5507i2.c(d10) - c5515q.f45085n.c(d10)) <= 0.001d) {
                                    }
                                }
                                z11 = true;
                            }
                            z11 = z10;
                        }
                        this.f45088q = z11;
                        return;
                    }
                }
                z10 = false;
                int i112 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i10 != 0) {
                }
                this.f45088q = z11;
                return;
            }
            throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f10 + "; min must be strictly < max");
        }
        throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
    }
}
