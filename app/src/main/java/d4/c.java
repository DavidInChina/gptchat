package D4;

import java.util.Arrays;
import r9.y;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f3345a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3346b;

    public c(float[] fArr, int[] iArr) {
        this.f3345a = fArr;
        this.f3346b = iArr;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = cVar.f3346b;
            if (i10 < iArr.length) {
                this.f3345a[i10] = cVar.f3345a[i10];
                this.f3346b[i10] = iArr[i10];
                i10++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int i10;
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            float f6 = fArr[i11];
            float[] fArr2 = this.f3345a;
            int binarySearch = Arrays.binarySearch(fArr2, f6);
            int[] iArr2 = this.f3346b;
            if (binarySearch >= 0) {
                i10 = iArr2[binarySearch];
            } else {
                int i12 = -(binarySearch + 1);
                if (i12 == 0) {
                    i10 = iArr2[0];
                } else if (i12 == iArr2.length - 1) {
                    i10 = iArr2[iArr2.length - 1];
                } else {
                    int i13 = i12 - 1;
                    float f10 = fArr2[i13];
                    i10 = y.g0((f6 - f10) / (fArr2[i12] - f10), iArr2[i13], iArr2[i12]);
                }
            }
            iArr[i11] = i10;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (Arrays.equals(this.f3345a, cVar.f3345a) && Arrays.equals(this.f3346b, cVar.f3346b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3346b) + (Arrays.hashCode(this.f3345a) * 31);
    }
}
