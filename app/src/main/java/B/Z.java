package B;

/* loaded from: classes.dex */
public final class Z implements AbstractC0130h1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0108a0 f1247a;

    public Z(C0108a0 c0108a0) {
        this.f1247a = c0108a0;
    }

    @Override // B.AbstractC0130h1
    public final float a(float f6) {
        if (Float.isNaN(f6)) {
            return 0.0f;
        }
        return ((Number) this.f1247a.f1254a.invoke(Float.valueOf(f6))).floatValue();
    }
}
