package H2;

import java.util.Arrays;
import p2.C5065s;
import p2.h0;
import v.C5934c;

/* loaded from: classes2.dex */
public abstract class c implements s {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f7201a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7202b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f7203c;

    /* renamed from: d  reason: collision with root package name */
    public final C5065s[] f7204d;

    /* renamed from: e  reason: collision with root package name */
    public int f7205e;

    public c(h0 h0Var, int[] iArr) {
        boolean z10;
        C5065s[] c5065sArr;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        h0Var.getClass();
        this.f7201a = h0Var;
        int length = iArr.length;
        this.f7202b = length;
        this.f7204d = new C5065s[length];
        int i10 = 0;
        while (true) {
            int length2 = iArr.length;
            c5065sArr = h0Var.f42075i0;
            if (i10 >= length2) {
                break;
            }
            this.f7204d[i10] = c5065sArr[iArr[i10]];
            i10++;
        }
        Arrays.sort(this.f7204d, new C5934c(6));
        this.f7203c = new int[this.f7202b];
        int i11 = 0;
        while (true) {
            int i12 = this.f7202b;
            if (i11 < i12) {
                int[] iArr2 = this.f7203c;
                C5065s c5065s = this.f7204d[i11];
                int i13 = 0;
                while (true) {
                    if (i13 < c5065sArr.length) {
                        if (c5065s == c5065sArr[i13]) {
                            break;
                        }
                        i13++;
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                iArr2[i11] = i13;
                i11++;
            } else {
                long[] jArr = new long[i12];
                return;
            }
        }
    }

    @Override // H2.s
    public final h0 a() {
        return this.f7201a;
    }

    @Override // H2.s
    public final C5065s c(int i10) {
        return this.f7204d[i10];
    }

    @Override // H2.s
    public final int e(int i10) {
        return this.f7203c[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7201a.equals(cVar.f7201a) && Arrays.equals(this.f7203c, cVar.f7203c)) {
            return true;
        }
        return false;
    }

    @Override // H2.s
    public final C5065s g() {
        return this.f7204d[0];
    }

    public final int hashCode() {
        if (this.f7205e == 0) {
            this.f7205e = Arrays.hashCode(this.f7203c) + (System.identityHashCode(this.f7201a) * 31);
        }
        return this.f7205e;
    }

    @Override // H2.s
    public final int k(int i10) {
        for (int i11 = 0; i11 < this.f7202b; i11++) {
            if (this.f7203c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // H2.s
    public final int length() {
        return this.f7203c.length;
    }

    @Override // H2.s
    public void d() {
    }

    @Override // H2.s
    public void f() {
    }

    @Override // H2.s
    public final /* synthetic */ void i() {
    }

    @Override // H2.s
    public final /* synthetic */ void j() {
    }

    @Override // H2.s
    public final /* synthetic */ void b(boolean z10) {
    }

    @Override // H2.s
    public void h(float f6) {
    }
}
