package h1;

import N.b0;
import android.gov.nist.core.Separators;
import java.util.Arrays;

/* renamed from: h1.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3301h extends C3296c {

    /* renamed from: f  reason: collision with root package name */
    public C3302i[] f31725f;

    /* renamed from: g  reason: collision with root package name */
    public C3302i[] f31726g;

    /* renamed from: h  reason: collision with root package name */
    public int f31727h;

    /* renamed from: i  reason: collision with root package name */
    public C3300g f31728i;

    @Override // h1.C3296c
    public final C3302i d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f31727h; i11++) {
            C3302i[] c3302iArr = this.f31725f;
            C3302i c3302i = c3302iArr[i11];
            if (!zArr[c3302i.f31730b]) {
                C3300g c3300g = this.f31728i;
                c3300g.f31723Y = c3302i;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f6 = c3300g.f31723Y.f31736h[i12];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    C3302i c3302i2 = c3302iArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f10 = c3302i2.f31736h[i12];
                            float f11 = c3300g.f31723Y.f31736h[i12];
                            if (f11 == f10) {
                                i12--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f31725f[i10];
    }

    @Override // h1.C3296c
    public final void h(C3296c c3296c, boolean z10) {
        C3302i c3302i = c3296c.f31699a;
        if (c3302i == null) {
            return;
        }
        AbstractC3295b abstractC3295b = c3296c.f31702d;
        int b10 = abstractC3295b.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C3302i e10 = abstractC3295b.e(i10);
            float g10 = abstractC3295b.g(i10);
            C3300g c3300g = this.f31728i;
            c3300g.f31723Y = e10;
            boolean z11 = e10.f31729a;
            float[] fArr = c3302i.f31736h;
            if (z11) {
                boolean z12 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = c3300g.f31723Y.f31736h;
                    float f6 = (fArr[i11] * g10) + fArr2[i11];
                    fArr2[i11] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        c3300g.f31723Y.f31736h[i11] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    c3300g.f31724Z.j(c3300g.f31723Y);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != 0.0f) {
                        float f11 = f10 * g10;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        c3300g.f31723Y.f31736h[i12] = f11;
                    } else {
                        c3300g.f31723Y.f31736h[i12] = 0.0f;
                    }
                }
                i(e10);
            }
            this.f31700b = (c3296c.f31700b * g10) + this.f31700b;
        }
        j(c3302i);
    }

    public final void i(C3302i c3302i) {
        int i10;
        int i11 = this.f31727h + 1;
        C3302i[] c3302iArr = this.f31725f;
        if (i11 > c3302iArr.length) {
            C3302i[] c3302iArr2 = (C3302i[]) Arrays.copyOf(c3302iArr, c3302iArr.length * 2);
            this.f31725f = c3302iArr2;
            this.f31726g = (C3302i[]) Arrays.copyOf(c3302iArr2, c3302iArr2.length * 2);
        }
        C3302i[] c3302iArr3 = this.f31725f;
        int i12 = this.f31727h;
        c3302iArr3[i12] = c3302i;
        int i13 = i12 + 1;
        this.f31727h = i13;
        if (i13 > 1 && c3302iArr3[i12].f31730b > c3302i.f31730b) {
            int i14 = 0;
            while (true) {
                i10 = this.f31727h;
                if (i14 >= i10) {
                    break;
                }
                this.f31726g[i14] = this.f31725f[i14];
                i14++;
            }
            Arrays.sort(this.f31726g, 0, i10, new b0(2, this));
            for (int i15 = 0; i15 < this.f31727h; i15++) {
                this.f31725f[i15] = this.f31726g[i15];
            }
        }
        c3302i.f31729a = true;
        c3302i.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.f31727h = r2 - 1;
        r6.f31729a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.f31727h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f31725f;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(C3302i c3302i) {
        int i10 = 0;
        while (i10 < this.f31727h) {
            if (this.f31725f[i10] == c3302i) {
                break;
            }
            i10++;
        }
    }

    @Override // h1.C3296c
    public final String toString() {
        String str = " goal -> (" + this.f31700b + ") : ";
        for (int i10 = 0; i10 < this.f31727h; i10++) {
            C3302i c3302i = this.f31725f[i10];
            C3300g c3300g = this.f31728i;
            c3300g.f31723Y = c3302i;
            str = str + c3300g + Separators.SP;
        }
        return str;
    }
}
