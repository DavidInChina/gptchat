package Z0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: Y  reason: collision with root package name */
    public final float f22783Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f22784Z;

    public c(float f6, float f10) {
        this.f22783Y = f6;
        this.f22784Z = f10;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return a(K(f6));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f22784Z;
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    public final /* synthetic */ long a(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f22783Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f22783Y, cVar.f22783Y) == 0 && Float.compare(this.f22784Z, cVar.f22784Z) == 0) {
            return true;
        }
        return false;
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22784Z) + (Float.floatToIntBits(this.f22783Y) * 31);
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f22783Y);
        sb2.append(", fontScale=");
        return AbstractC6463a.k(sb2, this.f22784Z, ')');
    }
}
