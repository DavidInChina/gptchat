package Cf;

import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public abstract class i implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final long f3115Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f3116Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f3117h0;

    public i(long j6, long j10) {
        this.f3115Y = j6;
        if (j6 < j10) {
            long j11 = j10 % 1;
            long j12 = j6 % 1;
            long j13 = ((j11 < 0 ? j11 + 1 : j11) - (j12 < 0 ? j12 + 1 : j12)) % 1;
            j10 -= j13 < 0 ? j13 + 1 : j13;
        }
        this.f3116Z = j10;
        this.f3117h0 = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j(this.f3115Y, this.f3116Z, this.f3117h0);
    }
}
