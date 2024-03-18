package ki;

import id.AbstractC3557B;
import java.io.IOException;
import ji.AbstractC4122K;
import ji.AbstractC4143r;
import ji.C4135j;

/* loaded from: classes.dex */
public final class d extends AbstractC4143r {

    /* renamed from: Z  reason: collision with root package name */
    public final long f37600Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f37601h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f37602i0;

    public d(AbstractC4122K abstractC4122K, long j6, boolean z10) {
        super(abstractC4122K);
        this.f37600Z = j6;
        this.f37601h0 = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ji.j] */
    @Override // ji.AbstractC4143r, ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        long j10 = this.f37602i0;
        long j11 = this.f37600Z;
        if (j10 > j11) {
            j6 = 0;
        } else if (this.f37601h0) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j6 = Math.min(j6, j12);
        }
        long g02 = super.g0(c4135j, j6);
        int i10 = (g02 > (-1L) ? 1 : (g02 == (-1L) ? 0 : -1));
        if (i10 != 0) {
            this.f37602i0 += g02;
        }
        long j13 = this.f37602i0;
        if ((j13 < j11 && i10 == 0) || j13 > j11) {
            if (g02 > 0 && j13 > j11) {
                ?? obj = new Object();
                obj.I0(c4135j);
                c4135j.o(obj, c4135j.f36721Z - (j13 - j11));
                obj.a();
            }
            throw new IOException("expected " + j11 + " bytes but got " + this.f37602i0);
        }
        return g02;
    }
}
