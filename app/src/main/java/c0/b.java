package C0;

import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f2483a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f2484b;

    public final void a(long j6) {
        int i10 = this.f2483a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2484b[i11] == j6) {
                return;
            }
        }
        int i12 = this.f2483a;
        long[] jArr = this.f2484b;
        if (i12 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i12 + 1, jArr.length * 2));
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f2484b = copyOf;
        }
        this.f2484b[i12] = j6;
        if (i12 >= this.f2483a) {
            this.f2483a = i12 + 1;
        }
    }

    public final void b(int i10) {
        int i11 = this.f2483a;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f2484b;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f2483a--;
        }
    }
}
