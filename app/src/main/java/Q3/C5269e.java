package q3;

import L2.A;
import L2.B;
import L2.C;
import L2.C0882c;
import java.math.RoundingMode;
import s2.AbstractC5530A;

/* renamed from: q3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5269e implements B {

    /* renamed from: a  reason: collision with root package name */
    public final C0882c f43740a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43741b;

    /* renamed from: c  reason: collision with root package name */
    public final long f43742c;

    /* renamed from: d  reason: collision with root package name */
    public final long f43743d;

    /* renamed from: e  reason: collision with root package name */
    public final long f43744e;

    public C5269e(C0882c c0882c, int i10, long j6, long j10) {
        this.f43740a = c0882c;
        this.f43741b = i10;
        this.f43742c = j6;
        long j11 = (j10 - j6) / c0882c.f10574f;
        this.f43743d = j11;
        this.f43744e = a(j11);
    }

    public final long a(long j6) {
        long j10 = j6 * this.f43741b;
        long j11 = this.f43740a.f10572d;
        int i10 = AbstractC5530A.f45131a;
        return AbstractC5530A.I(j10, 1000000L, j11, RoundingMode.FLOOR);
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // L2.B
    public final A i(long j6) {
        C0882c c0882c = this.f43740a;
        long j10 = (c0882c.f10572d * j6) / (this.f43741b * 1000000);
        long j11 = this.f43743d;
        long j12 = AbstractC5530A.j(j10, 0L, j11 - 1);
        long j13 = this.f43742c;
        long a5 = a(j12);
        C c10 = new C(a5, (c0882c.f10574f * j12) + j13);
        if (a5 < j6 && j12 != j11 - 1) {
            long j14 = j12 + 1;
            return new A(c10, new C(a(j14), (c0882c.f10574f * j14) + j13));
        }
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        return this.f43744e;
    }
}
