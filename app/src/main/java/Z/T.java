package Z;

import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public int[] f22568a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    public int f22569b;

    public final int a() {
        int[] iArr = this.f22568a;
        int i10 = this.f22569b - 1;
        this.f22569b = i10;
        return iArr[i10];
    }

    public final void b(int i10) {
        int i11 = this.f22569b;
        int[] iArr = this.f22568a;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f22568a = copyOf;
        }
        int[] iArr2 = this.f22568a;
        int i12 = this.f22569b;
        this.f22569b = i12 + 1;
        iArr2[i12] = i10;
    }
}
