package N2;

import L2.A;
import L2.C;
import L2.G;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final G f12667a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12668b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12669c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12670d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12671e;

    /* renamed from: f  reason: collision with root package name */
    public int f12672f;

    /* renamed from: g  reason: collision with root package name */
    public int f12673g;

    /* renamed from: h  reason: collision with root package name */
    public int f12674h;

    /* renamed from: i  reason: collision with root package name */
    public int f12675i;

    /* renamed from: j  reason: collision with root package name */
    public int f12676j;

    /* renamed from: k  reason: collision with root package name */
    public long[] f12677k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f12678l;

    public e(int i10, int i11, long j6, int i12, G g10) {
        int i13;
        int i14;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f12670d = j6;
        this.f12671e = i12;
        this.f12667a = g10;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f12668b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f12669c = i14;
        this.f12677k = new long[512];
        this.f12678l = new int[512];
    }

    public final C a(int i10) {
        return new C(((this.f12670d * 1) / this.f12671e) * this.f12678l[i10], this.f12677k[i10]);
    }

    public final A b(long j6) {
        int i10 = (int) (j6 / ((this.f12670d * 1) / this.f12671e));
        int d10 = AbstractC5530A.d(this.f12678l, i10, true, true);
        if (this.f12678l[d10] == i10) {
            C a5 = a(d10);
            return new A(a5, a5);
        }
        C a10 = a(d10);
        int i11 = d10 + 1;
        if (i11 < this.f12677k.length) {
            return new A(a10, a(i11));
        }
        return new A(a10, a10);
    }
}
