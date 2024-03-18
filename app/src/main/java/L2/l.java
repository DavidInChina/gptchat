package L2;

/* loaded from: classes2.dex */
public class l implements B {

    /* renamed from: a  reason: collision with root package name */
    public final long f10616a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10617b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10618c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10619d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10620e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10621f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10622g;

    public l(int i10, int i11, long j6, long j10, boolean z10) {
        this.f10616a = j6;
        this.f10617b = j10;
        this.f10618c = i11 == -1 ? 1 : i11;
        this.f10620e = i10;
        this.f10622g = z10;
        if (j6 == -1) {
            this.f10619d = -1L;
            this.f10621f = -9223372036854775807L;
            return;
        }
        long j11 = j6 - j10;
        this.f10619d = j11;
        this.f10621f = (Math.max(0L, j11) * 8000000) / i10;
    }

    @Override // L2.B
    public final boolean e() {
        if (this.f10619d == -1 && !this.f10622g) {
            return false;
        }
        return true;
    }

    @Override // L2.B
    public final A i(long j6) {
        long j10 = this.f10619d;
        int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = this.f10617b;
        if (i10 == 0 && !this.f10622g) {
            C c10 = new C(0L, j11);
            return new A(c10, c10);
        }
        int i11 = this.f10620e;
        long j12 = this.f10618c;
        long j13 = (((i11 * j6) / 8000000) / j12) * j12;
        if (i10 != 0) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i11;
        C c11 = new C(max2, max);
        if (i10 != 0 && max2 < j6) {
            long j14 = max + j12;
            if (j14 < this.f10616a) {
                return new A(c11, new C((Math.max(0L, j14 - j11) * 8000000) / i11, j14));
            }
        }
        return new A(c11, c11);
    }

    @Override // L2.B
    public final long j() {
        return this.f10621f;
    }
}
