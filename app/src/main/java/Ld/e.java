package Ld;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    public float f11046b;

    /* renamed from: c  reason: collision with root package name */
    public float f11047c;

    /* renamed from: e  reason: collision with root package name */
    public int f11049e;

    /* renamed from: f  reason: collision with root package name */
    public float f11050f;

    /* renamed from: g  reason: collision with root package name */
    public float f11051g;

    /* renamed from: a  reason: collision with root package name */
    public final f f11045a = new f(120.0f, 0.0f, 5);

    /* renamed from: d  reason: collision with root package name */
    public final float[] f11048d = new float[960];

    @Override // Ld.c
    public final float a(float f6) {
        float f10 = this.f11046b * 5;
        float f11 = f10 / (1 + f10);
        float f12 = this.f11047c;
        float f13 = 5.0f / f6;
        if (f11 <= f12) {
            f13 = 0.02f;
        }
        float N10 = r.f.N(f12, f11, f13);
        this.f11047c = N10;
        return N10;
    }

    @Override // Ld.c
    public final float[] b(float f6) {
        return this.f11045a.a(f6);
    }
}
