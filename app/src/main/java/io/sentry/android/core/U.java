package io.sentry.android.core;

/* loaded from: classes2.dex */
public final class U implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final long f34051Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f34052Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f34053h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f34054i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f34055j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f34056k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f34057l0;

    public U(long j6) {
        this(j6, j6, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f34052Z, ((U) obj).f34052Z);
    }

    public U(long j6, long j10, long j11, long j12, boolean z10, boolean z11, long j13) {
        this.f34051Y = j6;
        this.f34052Z = j10;
        this.f34053h0 = j11;
        this.f34054i0 = j12;
        this.f34055j0 = z10;
        this.f34056k0 = z11;
        this.f34057l0 = j13;
    }
}
