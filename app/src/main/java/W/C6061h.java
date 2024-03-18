package w;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import w3.K;

/* renamed from: w.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6061h {

    /* renamed from: a  reason: collision with root package name */
    public int f47587a;

    /* renamed from: b  reason: collision with root package name */
    public int f47588b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f47589c;

    /* renamed from: d  reason: collision with root package name */
    public int f47590d;

    public C6061h(int i10) {
        if (i10 != 1) {
            int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
            this.f47590d = highestOneBit - 1;
            this.f47589c = new int[highestOneBit];
        }
    }

    public final void a(int i10) {
        int[] iArr = this.f47589c;
        int i11 = this.f47588b;
        iArr[i11] = i10;
        int i12 = this.f47590d & (i11 + 1);
        this.f47588b = i12;
        int i13 = this.f47587a;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 >= 0) {
                int[] iArr2 = new int[i15];
                kf.q.V2(0, i13, length, iArr, iArr2);
                kf.q.V2(i14, 0, this.f47587a, this.f47589c, iArr2);
                this.f47589c = iArr2;
                this.f47587a = 0;
                this.f47588b = length;
                this.f47590d = i15 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.f47590d;
                int i13 = i12 * 2;
                int[] iArr = this.f47589c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f47589c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 4];
                    this.f47589c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f47589c;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.f47590d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void c(RecyclerView recyclerView, boolean z10) {
        this.f47590d = 0;
        int[] iArr = this.f47589c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        K k10 = recyclerView.f25475s0;
        if (recyclerView.f25473r0 != null && k10 != null && k10.f47760i) {
            if (z10) {
                if (!recyclerView.f25459k0.g()) {
                    k10.i(recyclerView.f25473r0.a(), this);
                }
            } else if (!recyclerView.K()) {
                k10.h(this.f47587a, this.f47588b, recyclerView.g1, this);
            }
            int i10 = this.f47590d;
            if (i10 > k10.f47761j) {
                k10.f47761j = i10;
                k10.f47762k = z10;
                recyclerView.f25455i0.k();
            }
        }
    }
}
