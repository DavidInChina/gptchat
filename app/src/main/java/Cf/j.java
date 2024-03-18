package Cf;

import java.util.NoSuchElementException;
import kf.AbstractC4266B;

/* loaded from: classes.dex */
public final class j extends AbstractC4266B {

    /* renamed from: Y  reason: collision with root package name */
    public final long f3118Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f3119Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3120h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f3121i0;

    public j(long j6, long j10, long j11) {
        this.f3118Y = j11;
        this.f3119Z = j10;
        boolean z10 = true;
        if (j11 <= 0 ? j6 < j10 : j6 > j10) {
            z10 = false;
        }
        this.f3120h0 = z10;
        this.f3121i0 = !z10 ? j10 : j6;
    }

    @Override // kf.AbstractC4266B
    public final long a() {
        long j6 = this.f3121i0;
        if (j6 == this.f3119Z) {
            if (this.f3120h0) {
                this.f3120h0 = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f3121i0 = this.f3118Y + j6;
        }
        return j6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3120h0;
    }
}
