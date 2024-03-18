package g3;

import java.util.List;

/* renamed from: g3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3168k extends x2.i implements AbstractC3162e {

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC3162e f31185i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f31186j0;

    @Override // g3.AbstractC3162e
    public final int a(long j6) {
        AbstractC3162e abstractC3162e = this.f31185i0;
        abstractC3162e.getClass();
        return abstractC3162e.a(j6 - this.f31186j0);
    }

    @Override // g3.AbstractC3162e
    public final long b(int i10) {
        AbstractC3162e abstractC3162e = this.f31185i0;
        abstractC3162e.getClass();
        return abstractC3162e.b(i10) + this.f31186j0;
    }

    @Override // g3.AbstractC3162e
    public final List c(long j6) {
        AbstractC3162e abstractC3162e = this.f31185i0;
        abstractC3162e.getClass();
        return abstractC3162e.c(j6 - this.f31186j0);
    }

    @Override // g3.AbstractC3162e
    public final int d() {
        AbstractC3162e abstractC3162e = this.f31185i0;
        abstractC3162e.getClass();
        return abstractC3162e.d();
    }
}
