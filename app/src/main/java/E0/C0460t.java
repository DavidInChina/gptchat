package E0;

import A.AbstractC0044t0;
import java.util.Map;

/* renamed from: E0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460t implements P, AbstractC0459s {

    /* renamed from: Y  reason: collision with root package name */
    public final Z0.l f4089Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0459s f4090Z;

    public C0460t(AbstractC0459s abstractC0459s, Z0.l lVar) {
        this.f4089Y = lVar;
        this.f4090Z = abstractC0459s;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f4090Z.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f4090Z.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f4090Z.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return this.f4090Z.K(f6);
    }

    @Override // Z0.b
    public final float O() {
        return this.f4090Z.O();
    }

    @Override // E0.AbstractC0459s
    public final boolean P() {
        return this.f4090Z.P();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f4090Z.R(f6);
    }

    @Override // Z0.b
    public final int a0(float f6) {
        return this.f4090Z.a0(f6);
    }

    @Override // Z0.b
    public final float b() {
        return this.f4090Z.b();
    }

    @Override // Z0.b
    public final long g0(long j6) {
        return this.f4090Z.g0(j6);
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f4089Y;
    }

    @Override // Z0.b
    public final float i0(long j6) {
        return this.f4090Z.i0(j6);
    }

    @Override // E0.P
    public final O j0(int i10, int i11, Map map, wf.k kVar) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new F.K(i10, i11, map);
        }
        throw new IllegalStateException(AbstractC0044t0.y("Size(", i10, " x ", i11, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // Z0.b
    public final long p(long j6) {
        return this.f4090Z.p(j6);
    }

    @Override // Z0.b
    public final float t(long j6) {
        return this.f4090Z.t(j6);
    }
}
