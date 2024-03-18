package h1;

import U3.n;
import android.gov.nist.core.Separators;
import java.util.Arrays;

/* renamed from: h1.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3303j implements AbstractC3295b {

    /* renamed from: a  reason: collision with root package name */
    public int f31741a = 16;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f31742b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f31743c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f31744d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public float[] f31745e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f31746f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f31747g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f31748h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f31749i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final C3296c f31750j;

    /* renamed from: k  reason: collision with root package name */
    public final n f31751k;

    public C3303j(C3296c c3296c, n nVar) {
        this.f31750j = c3296c;
        this.f31751k = nVar;
        clear();
    }

    @Override // h1.AbstractC3295b
    public final void a(C3302i c3302i, float f6) {
        if (f6 > -0.001f && f6 < 0.001f) {
            i(c3302i, true);
            return;
        }
        int i10 = 0;
        if (this.f31748h == 0) {
            m(0, c3302i, f6);
            l(c3302i, 0);
            this.f31749i = 0;
            return;
        }
        int n10 = n(c3302i);
        if (n10 != -1) {
            this.f31745e[n10] = f6;
            return;
        }
        int i11 = this.f31748h + 1;
        int i12 = this.f31741a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f31744d = Arrays.copyOf(this.f31744d, i13);
            this.f31745e = Arrays.copyOf(this.f31745e, i13);
            this.f31746f = Arrays.copyOf(this.f31746f, i13);
            this.f31747g = Arrays.copyOf(this.f31747g, i13);
            this.f31743c = Arrays.copyOf(this.f31743c, i13);
            for (int i14 = this.f31741a; i14 < i13; i14++) {
                this.f31744d[i14] = -1;
                this.f31743c[i14] = -1;
            }
            this.f31741a = i13;
        }
        int i15 = this.f31748h;
        int i16 = this.f31749i;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f31744d[i16];
            int i20 = c3302i.f31730b;
            if (i19 == i20) {
                this.f31745e[i16] = f6;
                return;
            }
            if (i19 < i20) {
                i17 = i16;
            }
            i16 = this.f31747g[i16];
            if (i16 == -1) {
                break;
            }
        }
        while (true) {
            if (i10 < this.f31741a) {
                if (this.f31744d[i10] == -1) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        m(i10, c3302i, f6);
        if (i17 != -1) {
            this.f31746f[i10] = i17;
            int[] iArr = this.f31747g;
            iArr[i10] = iArr[i17];
            iArr[i17] = i10;
        } else {
            this.f31746f[i10] = -1;
            if (this.f31748h > 0) {
                this.f31747g[i10] = this.f31749i;
                this.f31749i = i10;
            } else {
                this.f31747g[i10] = -1;
            }
        }
        int i21 = this.f31747g[i10];
        if (i21 != -1) {
            this.f31746f[i21] = i10;
        }
        l(c3302i, i10);
    }

    @Override // h1.AbstractC3295b
    public final int b() {
        return this.f31748h;
    }

    @Override // h1.AbstractC3295b
    public final float c(C3302i c3302i) {
        int n10 = n(c3302i);
        if (n10 != -1) {
            return this.f31745e[n10];
        }
        return 0.0f;
    }

    @Override // h1.AbstractC3295b
    public final void clear() {
        int i10 = this.f31748h;
        for (int i11 = 0; i11 < i10; i11++) {
            C3302i e10 = e(i11);
            if (e10 != null) {
                e10.b(this.f31750j);
            }
        }
        for (int i12 = 0; i12 < this.f31741a; i12++) {
            this.f31744d[i12] = -1;
            this.f31743c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f31742b[i13] = -1;
        }
        this.f31748h = 0;
        this.f31749i = -1;
    }

    @Override // h1.AbstractC3295b
    public final void d(C3302i c3302i, float f6, boolean z10) {
        if (f6 > -0.001f && f6 < 0.001f) {
            return;
        }
        int n10 = n(c3302i);
        if (n10 == -1) {
            a(c3302i, f6);
            return;
        }
        float[] fArr = this.f31745e;
        float f10 = fArr[n10] + f6;
        fArr[n10] = f10;
        if (f10 > -0.001f && f10 < 0.001f) {
            fArr[n10] = 0.0f;
            i(c3302i, z10);
        }
    }

    @Override // h1.AbstractC3295b
    public final C3302i e(int i10) {
        int i11 = this.f31748h;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f31749i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return ((C3302i[]) this.f31751k.f17429i0)[this.f31744d[i12]];
            }
            i12 = this.f31747g[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // h1.AbstractC3295b
    public final void f() {
        int i10 = this.f31748h;
        int i11 = this.f31749i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f31745e;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f31747g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // h1.AbstractC3295b
    public final float g(int i10) {
        int i11 = this.f31748h;
        int i12 = this.f31749i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f31745e[i12];
            }
            i12 = this.f31747g[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // h1.AbstractC3295b
    public final float h(C3296c c3296c, boolean z10) {
        float c10 = c(c3296c.f31699a);
        i(c3296c.f31699a, z10);
        C3303j c3303j = (C3303j) c3296c.f31702d;
        int i10 = c3303j.f31748h;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = c3303j.f31744d[i12];
            if (i13 != -1) {
                d(((C3302i[]) this.f31751k.f17429i0)[i13], c3303j.f31745e[i12] * c10, z10);
                i11++;
            }
            i12++;
        }
        return c10;
    }

    @Override // h1.AbstractC3295b
    public final float i(C3302i c3302i, boolean z10) {
        int[] iArr;
        int i10;
        int n10 = n(c3302i);
        if (n10 == -1) {
            return 0.0f;
        }
        int i11 = c3302i.f31730b;
        int i12 = i11 % 16;
        int[] iArr2 = this.f31742b;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f31744d[i13] == i11) {
                int[] iArr3 = this.f31743c;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
            } else {
                while (true) {
                    iArr = this.f31743c;
                    i10 = iArr[i13];
                    if (i10 == -1 || this.f31744d[i10] == i11) {
                        break;
                    }
                    i13 = i10;
                }
                if (i10 != -1 && this.f31744d[i10] == i11) {
                    iArr[i13] = iArr[i10];
                    iArr[i10] = -1;
                }
            }
        }
        float f6 = this.f31745e[n10];
        if (this.f31749i == n10) {
            this.f31749i = this.f31747g[n10];
        }
        this.f31744d[n10] = -1;
        int[] iArr4 = this.f31746f;
        int i14 = iArr4[n10];
        if (i14 != -1) {
            int[] iArr5 = this.f31747g;
            iArr5[i14] = iArr5[n10];
        }
        int i15 = this.f31747g[n10];
        if (i15 != -1) {
            iArr4[i15] = iArr4[n10];
        }
        this.f31748h--;
        c3302i.f31739k--;
        if (z10) {
            c3302i.b(this.f31750j);
        }
        return f6;
    }

    @Override // h1.AbstractC3295b
    public final void j(float f6) {
        int i10 = this.f31748h;
        int i11 = this.f31749i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f31745e;
            fArr[i11] = fArr[i11] / f6;
            i11 = this.f31747g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // h1.AbstractC3295b
    public final boolean k(C3302i c3302i) {
        if (n(c3302i) != -1) {
            return true;
        }
        return false;
    }

    public final void l(C3302i c3302i, int i10) {
        int[] iArr;
        int i11 = c3302i.f31730b % 16;
        int[] iArr2 = this.f31742b;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f31743c;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f31743c[i10] = -1;
    }

    public final void m(int i10, C3302i c3302i, float f6) {
        this.f31744d[i10] = c3302i.f31730b;
        this.f31745e[i10] = f6;
        this.f31746f[i10] = -1;
        this.f31747g[i10] = -1;
        c3302i.a(this.f31750j);
        c3302i.f31739k++;
        this.f31748h++;
    }

    public final int n(C3302i c3302i) {
        if (this.f31748h == 0) {
            return -1;
        }
        int i10 = c3302i.f31730b;
        int i11 = this.f31742b[i10 % 16];
        if (i11 == -1) {
            return -1;
        }
        if (this.f31744d[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f31743c[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f31744d[i11] != i10);
        if (i11 == -1 || this.f31744d[i11] != i10) {
            return -1;
        }
        return i11;
    }

    public final String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i10 = this.f31748h;
        for (int i11 = 0; i11 < i10; i11++) {
            C3302i e10 = e(i11);
            if (e10 != null) {
                String str4 = str3 + e10 + " = " + g(i11) + Separators.SP;
                int n10 = n(e10);
                String g10 = android.gov.nist.core.a.g(str4, "[p: ");
                int i12 = this.f31746f[n10];
                n nVar = this.f31751k;
                if (i12 != -1) {
                    StringBuilder p10 = android.gov.nist.core.a.p(g10);
                    p10.append(((C3302i[]) nVar.f17429i0)[this.f31744d[this.f31746f[n10]]]);
                    str = p10.toString();
                } else {
                    str = android.gov.nist.core.a.g(g10, "none");
                }
                String g11 = android.gov.nist.core.a.g(str, ", n: ");
                if (this.f31747g[n10] != -1) {
                    StringBuilder p11 = android.gov.nist.core.a.p(g11);
                    p11.append(((C3302i[]) nVar.f17429i0)[this.f31744d[this.f31747g[n10]]]);
                    str2 = p11.toString();
                } else {
                    str2 = android.gov.nist.core.a.g(g11, "none");
                }
                str3 = android.gov.nist.core.a.g(str2, "]");
            }
        }
        return android.gov.nist.core.a.g(str3, " }");
    }
}
