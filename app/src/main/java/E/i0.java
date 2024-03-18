package E;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f3873a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3874b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3875c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3876d;

    public i0(float f6, float f10, float f11, float f12) {
        this.f3873a = f6;
        this.f3874b = f10;
        this.f3875c = f11;
        this.f3876d = f12;
    }

    @Override // E.g0
    public final float a() {
        return this.f3876d;
    }

    @Override // E.g0
    public final float b(Z0.l lVar) {
        if (lVar == Z0.l.f22805Y) {
            return this.f3873a;
        }
        return this.f3875c;
    }

    @Override // E.g0
    public final float c(Z0.l lVar) {
        if (lVar == Z0.l.f22805Y) {
            return this.f3875c;
        }
        return this.f3873a;
    }

    @Override // E.g0
    public final float d() {
        return this.f3874b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (!Z0.e.a(this.f3873a, i0Var.f3873a) || !Z0.e.a(this.f3874b, i0Var.f3874b) || !Z0.e.a(this.f3875c, i0Var.f3875c) || !Z0.e.a(this.f3876d, i0Var.f3876d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3876d) + AbstractC6463a.e(this.f3875c, AbstractC6463a.e(this.f3874b, Float.floatToIntBits(this.f3873a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) Z0.e.b(this.f3873a)) + ", top=" + ((Object) Z0.e.b(this.f3874b)) + ", end=" + ((Object) Z0.e.b(this.f3875c)) + ", bottom=" + ((Object) Z0.e.b(this.f3876d)) + ')';
    }
}
