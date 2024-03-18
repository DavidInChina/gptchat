package h1;

import U3.n;
import java.util.Arrays;

/* renamed from: h1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3294a implements AbstractC3295b {

    /* renamed from: b  reason: collision with root package name */
    public final C3296c f31690b;

    /* renamed from: c  reason: collision with root package name */
    public final n f31691c;

    /* renamed from: a  reason: collision with root package name */
    public int f31689a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f31692d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f31693e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f31694f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f31695g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f31696h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f31697i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f31698j = false;

    public C3294a(C3296c c3296c, n nVar) {
        this.f31690b = c3296c;
        this.f31691c = nVar;
    }

    @Override // h1.AbstractC3295b
    public final void a(C3302i c3302i, float f6) {
        if (f6 == 0.0f) {
            i(c3302i, true);
            return;
        }
        int i10 = this.f31696h;
        C3296c c3296c = this.f31690b;
        if (i10 == -1) {
            this.f31696h = 0;
            this.f31695g[0] = f6;
            this.f31693e[0] = c3302i.f31730b;
            this.f31694f[0] = -1;
            c3302i.f31739k++;
            c3302i.a(c3296c);
            this.f31689a++;
            if (!this.f31698j) {
                int i11 = this.f31697i + 1;
                this.f31697i = i11;
                int[] iArr = this.f31693e;
                if (i11 >= iArr.length) {
                    this.f31698j = true;
                    this.f31697i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f31689a; i13++) {
            int i14 = this.f31693e[i10];
            int i15 = c3302i.f31730b;
            if (i14 == i15) {
                this.f31695g[i10] = f6;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f31694f[i10];
        }
        int i16 = this.f31697i;
        int i17 = i16 + 1;
        if (this.f31698j) {
            int[] iArr2 = this.f31693e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f31693e;
        if (i16 >= iArr3.length && this.f31689a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f31693e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f31693e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f31692d * 2;
            this.f31692d = i19;
            this.f31698j = false;
            this.f31697i = i16 - 1;
            this.f31695g = Arrays.copyOf(this.f31695g, i19);
            this.f31693e = Arrays.copyOf(this.f31693e, this.f31692d);
            this.f31694f = Arrays.copyOf(this.f31694f, this.f31692d);
        }
        this.f31693e[i16] = c3302i.f31730b;
        this.f31695g[i16] = f6;
        if (i12 != -1) {
            int[] iArr6 = this.f31694f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f31694f[i16] = this.f31696h;
            this.f31696h = i16;
        }
        c3302i.f31739k++;
        c3302i.a(c3296c);
        int i20 = this.f31689a + 1;
        this.f31689a = i20;
        if (!this.f31698j) {
            this.f31697i++;
        }
        int[] iArr7 = this.f31693e;
        if (i20 >= iArr7.length) {
            this.f31698j = true;
        }
        if (this.f31697i >= iArr7.length) {
            this.f31698j = true;
            this.f31697i = iArr7.length - 1;
        }
    }

    @Override // h1.AbstractC3295b
    public final int b() {
        return this.f31689a;
    }

    @Override // h1.AbstractC3295b
    public final float c(C3302i c3302i) {
        int i10 = this.f31696h;
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            if (this.f31693e[i10] == c3302i.f31730b) {
                return this.f31695g[i10];
            }
            i10 = this.f31694f[i10];
        }
        return 0.0f;
    }

    @Override // h1.AbstractC3295b
    public final void clear() {
        int i10 = this.f31696h;
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            C3302i c3302i = ((C3302i[]) this.f31691c.f17429i0)[this.f31693e[i10]];
            if (c3302i != null) {
                c3302i.b(this.f31690b);
            }
            i10 = this.f31694f[i10];
        }
        this.f31696h = -1;
        this.f31697i = -1;
        this.f31698j = false;
        this.f31689a = 0;
    }

    @Override // h1.AbstractC3295b
    public final void d(C3302i c3302i, float f6, boolean z10) {
        if (f6 > -0.001f && f6 < 0.001f) {
            return;
        }
        int i10 = this.f31696h;
        C3296c c3296c = this.f31690b;
        if (i10 == -1) {
            this.f31696h = 0;
            this.f31695g[0] = f6;
            this.f31693e[0] = c3302i.f31730b;
            this.f31694f[0] = -1;
            c3302i.f31739k++;
            c3302i.a(c3296c);
            this.f31689a++;
            if (!this.f31698j) {
                int i11 = this.f31697i + 1;
                this.f31697i = i11;
                int[] iArr = this.f31693e;
                if (i11 >= iArr.length) {
                    this.f31698j = true;
                    this.f31697i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f31689a; i13++) {
            int i14 = this.f31693e[i10];
            int i15 = c3302i.f31730b;
            if (i14 == i15) {
                float[] fArr = this.f31695g;
                float f10 = fArr[i10] + f6;
                if (f10 > -0.001f && f10 < 0.001f) {
                    f10 = 0.0f;
                }
                fArr[i10] = f10;
                if (f10 == 0.0f) {
                    if (i10 == this.f31696h) {
                        this.f31696h = this.f31694f[i10];
                    } else {
                        int[] iArr2 = this.f31694f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        c3302i.b(c3296c);
                    }
                    if (this.f31698j) {
                        this.f31697i = i10;
                    }
                    c3302i.f31739k--;
                    this.f31689a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f31694f[i10];
        }
        int i16 = this.f31697i;
        int i17 = i16 + 1;
        if (this.f31698j) {
            int[] iArr3 = this.f31693e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f31693e;
        if (i16 >= iArr4.length && this.f31689a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f31693e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f31693e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f31692d * 2;
            this.f31692d = i19;
            this.f31698j = false;
            this.f31697i = i16 - 1;
            this.f31695g = Arrays.copyOf(this.f31695g, i19);
            this.f31693e = Arrays.copyOf(this.f31693e, this.f31692d);
            this.f31694f = Arrays.copyOf(this.f31694f, this.f31692d);
        }
        this.f31693e[i16] = c3302i.f31730b;
        this.f31695g[i16] = f6;
        if (i12 != -1) {
            int[] iArr7 = this.f31694f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f31694f[i16] = this.f31696h;
            this.f31696h = i16;
        }
        c3302i.f31739k++;
        c3302i.a(c3296c);
        this.f31689a++;
        if (!this.f31698j) {
            this.f31697i++;
        }
        int i20 = this.f31697i;
        int[] iArr8 = this.f31693e;
        if (i20 >= iArr8.length) {
            this.f31698j = true;
            this.f31697i = iArr8.length - 1;
        }
    }

    @Override // h1.AbstractC3295b
    public final C3302i e(int i10) {
        int i11 = this.f31696h;
        for (int i12 = 0; i11 != -1 && i12 < this.f31689a; i12++) {
            if (i12 == i10) {
                return ((C3302i[]) this.f31691c.f17429i0)[this.f31693e[i11]];
            }
            i11 = this.f31694f[i11];
        }
        return null;
    }

    @Override // h1.AbstractC3295b
    public final void f() {
        int i10 = this.f31696h;
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            float[] fArr = this.f31695g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f31694f[i10];
        }
    }

    @Override // h1.AbstractC3295b
    public final float g(int i10) {
        int i11 = this.f31696h;
        for (int i12 = 0; i11 != -1 && i12 < this.f31689a; i12++) {
            if (i12 == i10) {
                return this.f31695g[i11];
            }
            i11 = this.f31694f[i11];
        }
        return 0.0f;
    }

    @Override // h1.AbstractC3295b
    public final float h(C3296c c3296c, boolean z10) {
        float c10 = c(c3296c.f31699a);
        i(c3296c.f31699a, z10);
        AbstractC3295b abstractC3295b = c3296c.f31702d;
        int b10 = abstractC3295b.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C3302i e10 = abstractC3295b.e(i10);
            d(e10, abstractC3295b.c(e10) * c10, z10);
        }
        return c10;
    }

    @Override // h1.AbstractC3295b
    public final float i(C3302i c3302i, boolean z10) {
        int i10 = this.f31696h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f31689a) {
            if (this.f31693e[i10] == c3302i.f31730b) {
                if (i10 == this.f31696h) {
                    this.f31696h = this.f31694f[i10];
                } else {
                    int[] iArr = this.f31694f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c3302i.b(this.f31690b);
                }
                c3302i.f31739k--;
                this.f31689a--;
                this.f31693e[i10] = -1;
                if (this.f31698j) {
                    this.f31697i = i10;
                }
                return this.f31695g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f31694f[i10];
        }
        return 0.0f;
    }

    @Override // h1.AbstractC3295b
    public final void j(float f6) {
        int i10 = this.f31696h;
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            float[] fArr = this.f31695g;
            fArr[i10] = fArr[i10] / f6;
            i10 = this.f31694f[i10];
        }
    }

    @Override // h1.AbstractC3295b
    public final boolean k(C3302i c3302i) {
        int i10 = this.f31696h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            if (this.f31693e[i10] == c3302i.f31730b) {
                return true;
            }
            i10 = this.f31694f[i10];
        }
        return false;
    }

    public final String toString() {
        int i10 = this.f31696h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f31689a; i11++) {
            StringBuilder p10 = android.gov.nist.core.a.p(android.gov.nist.core.a.g(str, " -> "));
            p10.append(this.f31695g[i10]);
            p10.append(" : ");
            StringBuilder p11 = android.gov.nist.core.a.p(p10.toString());
            p11.append(((C3302i[]) this.f31691c.f17429i0)[this.f31693e[i10]]);
            str = p11.toString();
            i10 = this.f31694f[i10];
        }
        return str;
    }
}
