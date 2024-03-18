package B;

import z.AbstractC6714o;

/* loaded from: classes.dex */
public final class L implements N {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6714o f1122b = M.f1126b;

    public L() {
        M m10 = M.f1125a;
    }

    @Override // B.N
    public final float a(float f6, float f10, float f11) {
        float f12 = f10 + f6;
        if ((f6 >= 0.0f && f12 <= f11) || (f6 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        if (Math.abs(f6) >= Math.abs(f13)) {
            return f13;
        }
        return f6;
    }

    @Override // B.N
    public final AbstractC6714o b() {
        return this.f1122b;
    }
}
