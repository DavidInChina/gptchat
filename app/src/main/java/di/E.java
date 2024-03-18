package di;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public int f28540a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f28541b = new int[10];

    public final int a() {
        if ((this.f28540a & 128) != 0) {
            return this.f28541b[7];
        }
        return 65535;
    }

    public final void b(E e10) {
        AbstractC3557B.c0("other", e10);
        for (int i10 = 0; i10 < 10; i10++) {
            boolean z10 = true;
            if (((1 << i10) & e10.f28540a) == 0) {
                z10 = false;
            }
            if (z10) {
                c(i10, e10.f28541b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f28541b;
            if (i10 < iArr.length) {
                this.f28540a = (1 << i10) | this.f28540a;
                iArr[i10] = i11;
            }
        }
    }
}
