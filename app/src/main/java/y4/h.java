package y4;

/* loaded from: classes2.dex */
public final class h extends k {
    public static float i(J4.a aVar, float f6) {
        Object obj = aVar.f8839b;
        if (obj != null && aVar.f8840c != null) {
            if (aVar.f8846i == -3987645.8f) {
                aVar.f8846i = ((Float) obj).floatValue();
            }
            float f10 = aVar.f8846i;
            if (aVar.f8847j == -3987645.8f) {
                aVar.f8847j = ((Float) aVar.f8840c).floatValue();
            }
            return I4.f.d(f10, aVar.f8847j, f6);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        return Float.valueOf(i(aVar, f6));
    }

    public final float h() {
        return i(this.f50722c.c(), b());
    }
}
