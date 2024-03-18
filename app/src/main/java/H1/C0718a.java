package H1;

/* renamed from: H1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0718a {

    /* renamed from: a  reason: collision with root package name */
    public int f7153a;

    /* renamed from: b  reason: collision with root package name */
    public int f7154b;

    /* renamed from: c  reason: collision with root package name */
    public float f7155c;

    /* renamed from: d  reason: collision with root package name */
    public float f7156d;

    /* renamed from: e  reason: collision with root package name */
    public long f7157e;

    /* renamed from: f  reason: collision with root package name */
    public long f7158f;

    /* renamed from: g  reason: collision with root package name */
    public long f7159g;

    /* renamed from: h  reason: collision with root package name */
    public float f7160h;

    /* renamed from: i  reason: collision with root package name */
    public int f7161i;

    public final float a(long j6) {
        long j10 = this.f7157e;
        if (j6 < j10) {
            return 0.0f;
        }
        long j11 = this.f7159g;
        if (j11 >= 0 && j6 >= j11) {
            float f6 = this.f7160h;
            return (g.b(((float) (j6 - j11)) / this.f7161i, 0.0f, 1.0f) * f6) + (1.0f - f6);
        }
        return g.b(((float) (j6 - j10)) / this.f7153a, 0.0f, 1.0f) * 0.5f;
    }
}
