package y4;

import r9.y;

/* loaded from: classes2.dex */
public final class f extends k {
    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        return Integer.valueOf(h(aVar, f6));
    }

    public final int h(J4.a aVar, float f6) {
        if (aVar.f8839b != null && aVar.f8840c != null) {
            return y.g0(I4.f.b(f6, 0.0f, 1.0f), ((Integer) aVar.f8839b).intValue(), ((Integer) aVar.f8840c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
