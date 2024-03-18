package x3;

import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f48688a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean[] f48689b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f48690c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f48691d;

    public l(int i10) {
        this.f48688a = new long[i10];
        this.f48689b = new boolean[i10];
        this.f48690c = new int[i10];
    }

    public final int[] a() {
        boolean z10;
        synchronized (this) {
            try {
                if (!this.f48691d) {
                    return null;
                }
                long[] jArr = this.f48688a;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    if (jArr[i10] > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean[] zArr = this.f48689b;
                    if (z10 != zArr[i11]) {
                        int[] iArr = this.f48690c;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        this.f48690c[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f48691d = false;
                return (int[]) this.f48690c.clone();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(int... iArr) {
        boolean z10;
        AbstractC3557B.c0("tableIds", iArr);
        synchronized (this) {
            z10 = false;
            for (int i10 : iArr) {
                long[] jArr = this.f48688a;
                long j6 = jArr[i10];
                jArr[i10] = 1 + j6;
                if (j6 == 0) {
                    z10 = true;
                    this.f48691d = true;
                }
            }
        }
        return z10;
    }

    public final boolean c(int... iArr) {
        boolean z10;
        AbstractC3557B.c0("tableIds", iArr);
        synchronized (this) {
            z10 = false;
            for (int i10 : iArr) {
                long[] jArr = this.f48688a;
                long j6 = jArr[i10];
                jArr[i10] = j6 - 1;
                if (j6 == 1) {
                    z10 = true;
                    this.f48691d = true;
                }
            }
        }
        return z10;
    }

    public final void d() {
        synchronized (this) {
            Arrays.fill(this.f48689b, false);
            this.f48691d = true;
        }
    }
}
