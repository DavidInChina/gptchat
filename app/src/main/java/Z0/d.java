package Z0;

import M3.H;
import a1.AbstractC1913a;
import id.AbstractC3557B;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: Y  reason: collision with root package name */
    public final float f22785Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f22786Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1913a f22787h0;

    public d(float f6, float f10, AbstractC1913a abstractC1913a) {
        this.f22785Y = f6;
        this.f22786Z = f10;
        this.f22787h0 = abstractC1913a;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return a(J(i10));
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
        return this.f22786Z;
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    public final long a(float f6) {
        return H.b0(this.f22787h0.a(f6), 4294967296L);
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f22785Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.f22785Y, dVar.f22785Y) == 0 && Float.compare(this.f22786Z, dVar.f22786Z) == 0 && AbstractC3557B.K(this.f22787h0, dVar.f22787h0)) {
            return true;
        }
        return false;
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    public final int hashCode() {
        return this.f22787h0.hashCode() + AbstractC6463a.e(this.f22786Z, Float.floatToIntBits(this.f22785Y) * 31, 31);
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
    public final float t(long j6) {
        if (o.a(n.b(j6), 4294967296L)) {
            return this.f22787h0.b(n.c(j6));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f22785Y + ", fontScale=" + this.f22786Z + ", converter=" + this.f22787h0 + ')';
    }
}
