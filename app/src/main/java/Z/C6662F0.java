package z;

/* renamed from: z.F0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6662F0 implements AbstractC6654B0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6656C0 f51138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f51139Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f51140h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f51141i0;

    public C6662F0(AbstractC6656C0 abstractC6656C0, int i10, long j6) {
        this.f51138Y = abstractC6656C0;
        this.f51139Z = i10;
        this.f51140h0 = (abstractC6656C0.i() + abstractC6656C0.g()) * 1000000;
        this.f51141i0 = j6 * 1000000;
    }

    @Override // z.AbstractC6654B0
    public final boolean a() {
        return true;
    }

    public final long b(long j6) {
        long j10 = j6 + this.f51141i0;
        if (j10 <= 0) {
            return 0L;
        }
        long j11 = this.f51140h0;
        long j12 = j10 / j11;
        if (this.f51139Z != 1 && j12 % 2 != 0) {
            return ((j12 + 1) * j11) - j10;
        }
        Long.signum(j12);
        return j10 - (j12 * j11);
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u c(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51138Y.c(b(j6), abstractC6726u, abstractC6726u2, e(j6, abstractC6726u, abstractC6726u3, abstractC6726u2));
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u d(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return h(Long.MAX_VALUE, abstractC6726u, abstractC6726u2, abstractC6726u3);
    }

    public final AbstractC6726u e(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        long j10 = this.f51141i0;
        long j11 = this.f51140h0;
        if (j6 + j10 > j11) {
            return this.f51138Y.h(j11 - j10, abstractC6726u, abstractC6726u3, abstractC6726u2);
        }
        return abstractC6726u2;
    }

    @Override // z.AbstractC6654B0
    public final long f(AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return Long.MAX_VALUE;
    }

    @Override // z.AbstractC6654B0
    public final AbstractC6726u h(long j6, AbstractC6726u abstractC6726u, AbstractC6726u abstractC6726u2, AbstractC6726u abstractC6726u3) {
        return this.f51138Y.h(b(j6), abstractC6726u, abstractC6726u2, e(j6, abstractC6726u, abstractC6726u3, abstractC6726u2));
    }
}
